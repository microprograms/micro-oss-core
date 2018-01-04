package com.github.microprograms.micro_oss_core.model;

public class FieldDefinition {
    private String name;
    private FieldTypeEnum type;
    private Object defaultValue;
    private int primaryKey;

    public FieldDefinition(String name, FieldTypeEnum type, Object defaultValue, int primaryKey) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldTypeEnum getType() {
        return type;
    }

    public void setType(FieldTypeEnum type) {
        this.type = type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public static enum FieldTypeEnum {
        int_type("int", "Integer"), long_type("long", "Long"), string_type("string", "String");

        private String type;
        private String javaType;

        private FieldTypeEnum(String type, String javaType) {
            this.type = type;
            this.javaType = javaType;
        }

        public String getType() {
            return type;
        }

        public String getJavaType() {
            return javaType;
        }

        public static FieldTypeEnum parse(String type) {
            for (FieldTypeEnum x : values()) {
                if (x.getType().equals(type) || x.getJavaType().equals(type)) {
                    return x;
                }
            }
            return null;
        }
    }
}
