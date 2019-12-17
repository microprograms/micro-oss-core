package com.github.microprograms.micro_oss_core.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Field {
    private String name;
    private Object value;

    public Field(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public static Field build(String name, Object value) {
        return new Field(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static class Fields {
        private List<Field> fields = new ArrayList<>();

        public Fields and(String name, Object value) {
            fields.add(new Field(name, value));
            return this;
        }

        public Fields andIfNotBlank(String name, String value) {
            if (StringUtils.isNotBlank(value)) {
                fields.add(new Field(name, value));
            }
            return this;
        }

        public Fields andIfNotNull(String name, Object value) {
            if (value != null) {
                fields.add(new Field(name, value));
            }
            return this;
        }

        public boolean isEmpty() {
            return fields.isEmpty();
        }

        public List<Field> getAll() {
            return fields;
        }
    }
}
