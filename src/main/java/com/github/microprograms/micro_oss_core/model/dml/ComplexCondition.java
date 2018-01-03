package com.github.microprograms.micro_oss_core.model.dml;

import java.util.List;

public class ComplexCondition extends Condition {
    private Type type;
    private List<Condition> conditions;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public static enum Type {
        and, or;
    }
}
