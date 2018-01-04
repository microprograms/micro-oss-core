package com.github.microprograms.micro_oss_core.model.dml;

public class Sort {
    private TypeEnum type;
    private String fieldName;

    public Sort(TypeEnum type, String fieldName) {
        this.type = type;
        this.fieldName = fieldName;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public static Sort asc(String fieldName) {
        return new Sort(TypeEnum.asc, fieldName);
    }

    public static Sort desc(String fieldName) {
        return new Sort(TypeEnum.desc, fieldName);
    }

    public static enum TypeEnum {
        asc, desc;

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
