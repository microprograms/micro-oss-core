package com.github.microprograms.micro_oss_core.model.dml.query;

import java.util.List;

public class SelectCommand {
	private String tableName;
	private List<String> fieldNames;
	private Condition where;
	private List<Sort> sorts;
	private PagerRequest pager;

	public SelectCommand(String tableName, List<String> fieldNames, Condition where, List<Sort> sorts,
			PagerRequest pager) {
		this.tableName = tableName;
		this.fieldNames = fieldNames;
		this.where = where;
		this.sorts = sorts;
		this.pager = pager;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<String> getFieldNames() {
		return fieldNames;
	}

	public void setFieldNames(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}

	public Condition getWhere() {
		return where;
	}

	public void setWhere(Condition where) {
		this.where = where;
	}

	public List<Sort> getSorts() {
		return sorts;
	}

	public void setSorts(List<Sort> sorts) {
		this.sorts = sorts;
	}

	public PagerRequest getPager() {
		return pager;
	}

	public void setPager(PagerRequest pager) {
		this.pager = pager;
	}

}
