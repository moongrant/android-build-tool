package com.app.base.bean;

/* JADX INFO: loaded from: classes.dex */
public class AbsJavaBeanApi<Model> extends AbsJavaBean {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11474code;
    public Model data;
    public String message;

    public String getCode() {
        return this.f11474code;
    }

    public Model getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(String str) {
        this.f11474code = str;
    }

    public void setData(Model model) {
        this.data = model;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
