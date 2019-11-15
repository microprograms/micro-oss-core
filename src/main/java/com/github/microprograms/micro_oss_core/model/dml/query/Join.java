package com.github.microprograms.micro_oss_core.model.dml.query;

public class Join {
	private TypeEnum type;
	private String tableName;
	private Condition condition;

	public Join(TypeEnum type, String tableName, Condition condition) {
		this.type = type;
		this.tableName = tableName;
		this.condition = condition;
	}

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public static enum TypeEnum {
		join, leftJoin;

		public static TypeEnum parse(String type) {
			for (TypeEnum x : values()) {
				if (x.name().equals(type)) {
					return x;
				}
			}
			return null;
		}
	}
}
