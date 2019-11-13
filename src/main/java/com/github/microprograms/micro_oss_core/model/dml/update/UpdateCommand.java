package com.github.microprograms.micro_oss_core.model.dml.update;

import java.util.List;

import com.github.microprograms.micro_oss_core.model.Field;
import com.github.microprograms.micro_oss_core.model.dml.query.Condition;

public class UpdateCommand {
	private String tableName;
	private List<Field> fields;
	private Condition where;

	public UpdateCommand(String tableName, List<Field> fields, Condition where) {
		this.tableName = tableName;
		this.fields = fields;
		this.where = where;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public Condition getWhere() {
		return where;
	}

	public void setWhere(Condition where) {
		this.where = where;
	}
}
