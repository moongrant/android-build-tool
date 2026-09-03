package com.app.base.model;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
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
