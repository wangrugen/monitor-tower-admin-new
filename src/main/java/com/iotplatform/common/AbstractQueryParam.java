package com.iotplatform.common;

import org.apache.ibatis.session.RowBounds;

public abstract class AbstractQueryParam {

    private Integer page = 0;


    private Integer limit = 1000;

    public RowBounds toRowBounds() {
        return new RowBounds(page == null ? 0 : page, limit == null ? 1000 : limit);
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }


}
