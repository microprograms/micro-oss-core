package com.github.microprograms.micro_oss_core;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.microprograms.micro_oss_core.exception.MicroOssException;
import com.github.microprograms.micro_oss_core.model.Entity;
import com.github.microprograms.micro_oss_core.model.Field;
import com.github.microprograms.micro_oss_core.model.dml.Condition;
import com.github.microprograms.micro_oss_core.model.dml.DeleteCommand;
import com.github.microprograms.micro_oss_core.model.dml.InsertCommand;
import com.github.microprograms.micro_oss_core.model.dml.PagerRequest;
import com.github.microprograms.micro_oss_core.model.dml.SelectCommand;
import com.github.microprograms.micro_oss_core.model.dml.SelectCountCommand;
import com.github.microprograms.micro_oss_core.model.dml.Sort;
import com.github.microprograms.micro_oss_core.model.dml.UpdateCommand;

public class MicroOss {
    private static MicroOssProvider oss;

    public static MicroOssProvider get() {
        return oss;
    }

    public static void set(MicroOssProvider oss) {
        MicroOss.oss = oss;
    }

    public static String getTableName(Class<?> clz) {
        return clz.getSimpleName();
    }

    public static Entity buildEntity(Object javaObject) {
        JSONObject json = (JSONObject) JSON.toJSON(javaObject);
        List<Field> fields = new ArrayList<>();
        for (String key : json.keySet()) {
            fields.add(new Field(key, json.get(key)));
        }
        return new Entity(getTableName(javaObject.getClass()), fields);
    }

    public static JSONObject buildJsonObject(Entity entity) {
        JSONObject json = new JSONObject();
        for (Field x : entity.getFields()) {
            json.put(x.getName(), x.getValue());
        }
        return json;
    }

    public static <T> T buildJavaObject(Class<T> clz, Entity entity) {
        return JSON.toJavaObject(buildJsonObject(entity), clz);
    }

    public static List<JSONObject> buildJsonObjectList(List<Entity> entities) {
        List<JSONObject> list = new ArrayList<>();
        for (Entity x : entities) {
            list.add(buildJsonObject(x));
        }
        return list;
    }

    public static <T> List<T> buildJavaObjectList(Class<T> clz, List<Entity> entities) {
        List<T> list = new ArrayList<>();
        for (Entity x : entities) {
            list.add(buildJavaObject(clz, x));
        }
        return list;
    }

    public static int insertObject(Object object) throws MicroOssException {
        return (int) oss.insertObject(new InsertCommand(buildEntity(object)));
    }

    public static int updateObject(Class<?> clz, List<Field> fields, Condition where) throws MicroOssException {
        return (int) oss.updateObject(new UpdateCommand(getTableName(clz), fields, where));
    }

    public static int deleteObject(Class<?> clz, Condition where) throws MicroOssException {
        return (int) oss.deleteObject(new DeleteCommand(getTableName(clz), where));
    }

    public static int queryCount(Class<?> clz, Condition where) throws MicroOssException {
        return (int) oss.selectCount(new SelectCountCommand(getTableName(clz), where));
    }

    public static <T> T queryObject(Class<T> clz, Condition where) throws MicroOssException {
        List<Entity> entities = oss.selectObject(new SelectCommand(getTableName(clz), null, where, null, null, null));
        return entities.isEmpty() ? null : buildJavaObject(clz, entities.get(0));
    }

    public static <T> List<T> queryAll(Class<T> clz, Condition where) throws MicroOssException {
        List<Entity> entities = oss.selectObject(new SelectCommand(getTableName(clz), null, where, null, null, null));
        return buildJavaObjectList(clz, entities);
    }

    public static <T> List<T> queryAll(Class<T> clz, Condition where, List<Sort> sorts) throws MicroOssException {
        List<Entity> entities = oss.selectObject(new SelectCommand(getTableName(clz), null, where, null, sorts, null));
        return buildJavaObjectList(clz, entities);
    }

    public static <T> List<T> queryAll(Class<T> clz, Condition where, List<Sort> sorts, PagerRequest pager) throws MicroOssException {
        List<Entity> entities = oss.selectObject(new SelectCommand(getTableName(clz), null, where, null, sorts, pager));
        return buildJavaObjectList(clz, entities);
    }
}
