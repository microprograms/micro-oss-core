package com.github.microprograms.micro_oss_core.model.dml.query;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Condition {
	private String key;
	private Object value;

	public Condition() {
	}

	public Condition(String key, Object value) {
		this.key = key;
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

		public static ComplexCondition build(TypeEnum type, Condition[] conditions) {
			return new ComplexCondition(type, conditions);
		}

		public static ComplexCondition and(Condition... conditions) {
			return new ComplexCondition(TypeEnum.and, conditions);
		}

		public static ComplexCondition or(Condition... conditions) {
			return new ComplexCondition(TypeEnum.or, conditions);
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

	public class Conditions {
		private List<Condition> conditions = new ArrayList<>();

		public Conditions appendIfNotBlank(String key, Object value) {
			if (value != null && StringUtils.isNotBlank(value.toString())) {
				conditions.add(Condition.build(key, value));
			}
			return this;
		}

		public Conditions appendIfNotNull(String name, Object value) {
			if (value != null) {
				conditions.add(Condition.build(name, value));
			}
			return this;
		}

        public boolean isEmpty() {
            return conditions.isEmpty();
        }

		public List<Condition> getAll() {
			return conditions;
		}

		public Condition[] toArray() {
			return conditions.toArray(new Condition[conditions.size()]);
		}
	}
}
