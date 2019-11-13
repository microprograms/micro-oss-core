package com.github.microprograms.micro_oss_core.model.dml;

import java.util.List;

public class ComplexCondition extends Condition {
    private TypeEnum type;
    private List<Condition> conditions;

    public ComplexCondition(TypeEnum type, List<Condition> conditions) {
        super(null, null);
        this.type = type;
        this.conditions = conditions;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public static ComplexCondition build(TypeEnum type, List<Condition> conditions) {
        return new ComplexCondition(type, conditions);
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
