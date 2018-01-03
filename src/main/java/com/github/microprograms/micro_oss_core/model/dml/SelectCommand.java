package com.github.microprograms.micro_oss_core.model.dml;

import java.util.List;

import com.github.microprograms.micro_oss_core.model.Where;

public class SelectCommand implements ReadCommand {
    private String tableName;
    private List<String> fieldNames;
    private Where where;
    private LeftJoin leftJoin;
    private List<Sort> sorts;
    private PagerRequest pager;

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

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
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
        private Where condition;

        public LeftJoin(String tableName, Where condition) {
            this.tableName = tableName;
            this.condition = condition;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public Where getCondition() {
            return condition;
        }

        public void setCondition(Where condition) {
            this.condition = condition;
        }
    }

    public static class Sort {
        private String type;
        private String fieldName;

        public Sort(String type, String fieldName) {
            this.type = type;
            this.fieldName = fieldName;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
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

    public static class PagerRequest {
        private int pageIndex;
        private int pageSize;

        public PagerRequest(int pageIndex, int pageSize) {
            this.pageIndex = pageIndex;
            this.pageSize = pageSize;
        }

        public int getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(int pageIndex) {
            this.pageIndex = pageIndex;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

    public static class PagerResponse {
        private int pageIndex;
        private int pageSize;
        private int totalRecords;
        private int totalPages;
        private int isFirstPage;
        private int isLastPage;

        public PagerResponse(PagerRequest pagerRequest, int totalRecords) {
            this.pageIndex = pagerRequest.getPageIndex();
            this.pageSize = pagerRequest.getPageSize();
            this.totalRecords = totalRecords;
            this.totalPages = totalRecords % pageSize == 0 ? totalRecords / pageSize : totalRecords / pageSize + 1;
            this.isFirstPage = pageIndex == 0 ? 1 : 0;
            this.isLastPage = pageIndex == totalPages - 1 ? 1 : 0;
        }

        public int getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(int pageIndex) {
            this.pageIndex = pageIndex;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getIsFirstPage() {
            return isFirstPage;
        }

        public void setIsFirstPage(int isFirstPage) {
            this.isFirstPage = isFirstPage;
        }

        public int getIsLastPage() {
            return isLastPage;
        }

        public void setIsLastPage(int isLastPage) {
            this.isLastPage = isLastPage;
        }
    }
}
