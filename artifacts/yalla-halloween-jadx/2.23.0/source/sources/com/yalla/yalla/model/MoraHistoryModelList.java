package com.yalla.yalla.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MoraHistoryModelList<T> {
    private String code;
    private List<T> data;
    private String message;
    public String pageindex;

    public String getCode() {
        return this.code;
    }

    public List<T> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(List<T> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
