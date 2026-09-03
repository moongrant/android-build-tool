package com.app.base.model;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class RegionModel extends AbsJavaBean {

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    private int f11876code;
    private String name;

    public RegionModel(String str, int i) {
        this.name = str;
        this.f11876code = i;
    }

    public int getCode() {
        return this.f11876code;
    }

    public String getName() {
        return this.name;
    }

    public RegionModel setName(String str) {
        this.name = str;
        return this;
    }

    public RegionModel setRegion(int i) {
        this.f11876code = i;
        return this;
    }
}
