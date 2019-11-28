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

	public static Join build(TypeEnum type, String tableName, Condition condition) {
		return new Join(type, tableName, condition);
	}

	public static Join join(String tableName, Condition condition) {
		return new Join(TypeEnum.join, tableName, condition);
	}

	public static Join leftJoin(String tableName, Condition condition) {
		return new Join(TypeEnum.leftJoin, tableName, condition);
	}

	public static Join rightJoin(String tableName, Condition condition) {
		return new Join(TypeEnum.rightJoin, tableName, condition);
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
		join, leftJoin, rightJoin;

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
