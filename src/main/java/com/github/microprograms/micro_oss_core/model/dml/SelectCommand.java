package com.github.microprograms.micro_oss_core.model.dml;

import java.util.List;

public class SelectCommand implements ReadCommand {
    private String tableName;
    private List<String> fieldNames;
    private Condition where;
    private LeftJoin leftJoin;
    private List<Sort> sorts;
    private PagerRequest pager;

    public SelectCommand(String tableName, List<String> fieldNames, Condition where, LeftJoin leftJoin, List<Sort> sorts, PagerRequest pager) {
        this.tableName = tableName;
        this.fieldNames = fieldNames;
        this.where = where;
        this.leftJoin = leftJoin;
        this.sorts = sorts;
        this.pager = pager;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public Condition getWhere() {
        return where;
    }

    public void setWhere(Condition where) {
        this.where = where;
    }

    public LeftJoin getLeftJoin() {
        return leftJoin;
    }

    public void setLeftJoin(LeftJoin leftJoin) {
        this.leftJoin = leftJoin;
    }

    public List<Sort> getSorts() {
        return sorts;
    }

    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    public PagerRequest getPager() {
        return pager;
    }

    public void setPager(PagerRequest pager) {
        this.pager = pager;
    }

    public static class LeftJoin {
        private String tableName;
        private Condition condition;

        public LeftJoin(String tableName, Condition condition) {
            this.tableName = tableName;
            this.condition = condition;
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
    }
}
