package com.github.microprograms.micro_oss_core.model.dml.query;

import java.util.List;

public class SelectCountCommand {
	private String tableName;
	private List<Join> joins;
	private Condition where;

	public SelectCountCommand(String tableName, Condition where) {
		this(tableName, null, where);
	}

	public SelectCountCommand(String tableName, List<Join> joins, Condition where) {
		this.tableName = tableName;
		this.joins = joins;
		this.where = where;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Join> getJoins() {
		return joins;
	}

	public void setJoins(List<Join> joins) {
		this.joins = joins;
	}

	public Condition getWhere() {
		return where;
	}

	public void setWhere(Condition where) {
		this.where = where;
	}
}
