package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class RegionCountriesModel extends AbsJavaBean {
    private int areaCode;
    private String countriesCode;
    private int countriesId;
    private String region;
    private int regionCode;

    public RegionCountriesModel(int i, String str, int i2, String str2, int i3) {
        this.countriesId = i;
        this.countriesCode = str;
        this.areaCode = i2;
        this.region = str2;
        this.regionCode = i3;
    }

    public int getAreaCode() {
        return this.areaCode;
    }

    public String getAreaCodeStr() {
        return "+" + this.areaCode;
    }

    public String getCountriesCode() {
        return this.countriesCode;
    }

    public int getCountriesId() {
        return this.countriesId;
    }

    public String getRegion() {
        return this.region;
    }

    public int getRegionCode() {
        return this.regionCode;
    }
}
