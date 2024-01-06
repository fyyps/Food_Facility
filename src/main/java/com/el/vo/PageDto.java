package com.el.vo;

import java.io.Serializable;
import java.util.List;

public class PageDto<T> implements Serializable {
    private static final long serialVersionUID = -3851775676591328984L;
    private long total = 0L;
    private List<T> list;

    public PageDto() {
    }

    public long getTotal() {
        return this.total;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setTotal(final long total) {
        this.total = total;
    }

    public void setList(final List<T> list) {
        this.list = list;
    }

}
