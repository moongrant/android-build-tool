package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class AtUserInfoModel extends AbsJavaBean {
    private long userid;
    private String username;

    public long getUserid() {
        return this.userid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUserid(long j) {
        this.userid = j;
    }

    public void setUsername(String str) {
        this.username = str;
    }
}
