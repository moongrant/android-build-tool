package com.yalla.yalla.model.bean;

/* JADX INFO: loaded from: classes4.dex */
public class AbsJavaBeanApi<Model> extends AbsJavaBean {
    public String code;
    public Model data;
    public String message;

    public String getCode() {
        return this.code;
    }

    public Model getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(Model model) {
        this.data = model;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
