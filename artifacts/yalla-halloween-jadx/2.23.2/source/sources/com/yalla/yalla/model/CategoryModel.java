package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class CategoryModel extends AbsJavaBean {
    public String id;
    public String labelname;

    public String getId() {
        return this.id;
    }

    public String getLabelname() {
        return this.labelname;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLabelname(String str) {
        this.labelname = str;
    }
}
