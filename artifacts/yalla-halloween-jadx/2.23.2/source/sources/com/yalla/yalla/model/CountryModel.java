package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class CountryModel extends AbsJavaBean {
    private String cid;
    private String hotico;
    private String name;

    public String getCid() {
        return this.cid;
    }

    public String getHotico() {
        return this.hotico;
    }

    public String getName() {
        return this.name;
    }

    public CountryModel setCid(String str) {
        this.cid = str;
        return this;
    }

    public CountryModel setHotico(String str) {
        this.hotico = str;
        return this;
    }

    public CountryModel setName(String str) {
        this.name = str;
        return this;
    }
}
