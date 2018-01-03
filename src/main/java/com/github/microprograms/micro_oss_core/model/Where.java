package com.github.microprograms.micro_oss_core.model;

import java.util.List;

public abstract class Where {
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class And extends Where {
        private List<Where> elements;

        public And(List<Where> elements) {
            this.type = WhereTypeEnum.and.name();
            this.elements = elements;
        }

        public List<Where> getElements() {
            return elements;
        }

        public void setElements(List<Where> elements) {
            this.elements = elements;
        }
    }

    public static class Or extends Where {
        private List<Where> elements;

        public Or(List<Where> elements) {
            this.type = WhereTypeEnum.or.name();
            this.elements = elements;
        }

        public List<Where> getElements() {
            return elements;
        }

        public void setElements(List<Where> elements) {
            this.elements = elements;
        }
    }

    public static class Condition extends Where {
        private String key;
        private Object value;

        public Condition(String key, Object value) {
            this.type = WhereTypeEnum.primitive.name();
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
    }

    public static enum WhereTypeEnum {
        and, or, primitive;

        public static WhereTypeEnum parse(String type) {
            for (WhereTypeEnum x : values()) {
                if (x.name().equals(type)) {
                    return x;
                }
            }
            return null;
        }
    }
}
