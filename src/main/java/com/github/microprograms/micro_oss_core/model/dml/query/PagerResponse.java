package com.github.microprograms.micro_oss_core.model.dml.query;

public class PagerResponse {
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
