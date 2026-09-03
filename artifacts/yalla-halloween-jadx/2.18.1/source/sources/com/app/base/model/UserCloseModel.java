package com.app.base.model;

import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class UserCloseModel extends AbsJavaBean {
    private String DeblockingTime;
    private String blockingMsg;
    private long dyid;

    public String getBlockingMsg() {
        return this.blockingMsg;
    }

    public String getDeblockingTime() {
        return this.DeblockingTime;
    }

    public long getDyid() {
        return this.dyid;
    }
}
