package com.github.microprograms.micro_oss_core.model.dml.query;

public class Condition {
	private String key;
	private Object value;

	public Condition() {
	}

	public Condition(String key, Object value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public static Condition build(String key, Object value) {
		return new Condition(key, value);
	}

	public static RawCondition raw(String key, Object value) {
		return new RawCondition(key, value);
	}

	public static ComplexCondition and(Condition... conditions) {
		return ComplexCondition.and(conditions);
	}

	public static ComplexCondition or(Condition... conditions) {
		return ComplexCondition.or(conditions);
	}

	public static class RawCondition extends Condition {
		public RawCondition() {
		}

		public RawCondition(String key, Object value) {
			super(key, value);
		}
	}

	public static class ComplexCondition extends Condition {
		private TypeEnum type;
		private Condition[] conditions;

		public ComplexCondition() {
		}

		public ComplexCondition(TypeEnum type, Condition[] conditions) {
			this.type = type;
			this.conditions = conditions;
		}

		public TypeEnum getType() {
			return type;
		}

		public void setType(TypeEnum type) {
			this.type = type;
		}

		public Condition[] getConditions() {
			return conditions;
		}

		public void setConditions(Condition[] conditions) {
			this.conditions = conditions;
		}

		public static ComplexCondition build(TypeEnum type, Condition[] conditions) {
			return new ComplexCondition(type, conditions);
		}

		public static ComplexCondition and(Condition... conditions) {
			return new ComplexCondition(TypeEnum.and, conditions);
		}

		public static ComplexCondition or(Condition... conditions) {
			return new ComplexCondition(TypeEnum.or, conditions);
		}

		public static enum TypeEnum {
			and, or;

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
}
