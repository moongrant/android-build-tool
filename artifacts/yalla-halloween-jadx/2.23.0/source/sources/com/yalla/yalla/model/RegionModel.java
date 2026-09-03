package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class RegionModel extends AbsJavaBean {
    private int code;
    private String name;

    public RegionModel(String str, int i) {
        this.name = str;
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public RegionModel setName(String str) {
        this.name = str;
        return this;
    }

    public RegionModel setRegion(int i) {
        this.code = i;
        return this;
    }
}
