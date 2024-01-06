package com.el.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

public class QueryPageDto implements Serializable {
    private static final long serialVersionUID = -5058172345891265311L;
    @Min(1L)
    private Integer pageNum = 1;
    @Max(1000L)
    @Min(1L)
    private Integer pageSize = 10;

    public QueryPageDto() {
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageNum(final Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
    }

}
