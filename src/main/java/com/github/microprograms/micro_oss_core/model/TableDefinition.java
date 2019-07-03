package com.github.microprograms.micro_oss_core.model;

import java.util.List;

public class TableDefinition {
	private String tableName;
	private String comment;
	private List<FieldDefinition> fields;

	public TableDefinition(String tableName, List<FieldDefinition> fields) {
		this.tableName = tableName;
		this.fields = fields;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<FieldDefinition> getFields() {
		return fields;
	}

	public void setFields(List<FieldDefinition> fields) {
		this.fields = fields;
	}
}
