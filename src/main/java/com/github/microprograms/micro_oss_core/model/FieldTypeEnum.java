package com.github.microprograms.micro_oss_core.model;

public enum FieldTypeEnum {
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
