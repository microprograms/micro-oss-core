package com.github.microprograms.micro_oss_core.utils;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.microprograms.micro_oss_core.model.Entity;
import com.github.microprograms.micro_oss_core.model.Field;

import org.apache.commons.lang3.StringUtils;

public class MicroOssUtils {

	public static String getTableName(Class<?> clz) {
		return clz.getSimpleName();
	}

	public static String getTableNameWithPrefix(Class<?> clz, String tablePrefix) {
		return getTableNameWithPrefix(clz.getSimpleName(), tablePrefix);
	}

	public static String getTableNameWithPrefix(String tableName, String tablePrefix) {
		if (StringUtils.isBlank(tablePrefix)) {
			return tableName;
		}
		return tablePrefix + tableName;
	}

	public static Entity buildEntityWithTablePrefix(Object javaObject, String tablePrefix) {
		JSONObject json = (JSONObject) JSON.toJSON(javaObject);
		List<Field> fields = new ArrayList<>();
		for (String key : json.keySet()) {
			fields.add(new Field(key, json.get(key)));
		}
		return new Entity(getTableNameWithPrefix(javaObject.getClass(), tablePrefix), fields);
	}

	public static Entity buildEntity(Object javaObject) {
		return buildEntityWithTablePrefix(javaObject, null);
	}
}
