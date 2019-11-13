package com.github.microprograms.micro_oss_core;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.microprograms.micro_oss_core.model.Entity;

public class QueryResult<T> {
	private List<Entity> entities;
	private Class<T> clz;

	public QueryResult(List<Entity> entities, Class<T> clz) {
		this.entities = entities;
		this.clz = clz;
	}

	public JSONObject asJsonObject() {
		if (entities.isEmpty()) {
			return null;
		}
		return entities.get(0).toJson();
	}

	public JSONArray asJsonArray() {
		JSONArray jsonArray = new JSONArray();
		for (Entity x : entities) {
			jsonArray.add(x.toJson());
		}
		return jsonArray;
	}

	public T get() {
		if (entities.isEmpty()) {
			return null;
		}
		return JSON.toJavaObject(entities.get(0).toJson(), clz);
	}

	public List<T> getAll() {
		List<T> list = new ArrayList<>();
		for (Entity x : entities) {
			list.add(JSON.toJavaObject(x.toJson(), clz));
		}
		return list;
	}
}
