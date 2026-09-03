package com.app.base.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MoraHistoryModelList<T> {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    private String f11872code;
    private List<T> data;
    private String message;
    public String pageindex;

    public String getCode() {
        return this.f11872code;
    }

    public List<T> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.f11872code = str;
    }

    public void setData(List<T> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
