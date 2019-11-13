package com.github.microprograms.micro_oss_core.model.dml.query;

public class SelectCountCommand {
	private String tableName;
	private Condition where;

	public SelectCountCommand(String tableName, Condition where) {
		this.tableName = tableName;
		this.where = where;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Condition getWhere() {
		return where;
	}

	public void setWhere(Condition where) {
		this.where = where;
	}
}
