package com.yalla.yalla.model;

import Oooo000.o000O0;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes2.dex */
public class PostDetailCommentResultModel extends AbsJavaBean {
    private String DeblockingTime;
    private long cid;

    public long getCid() {
        return this.cid;
    }

    public String getDeblockingTime() {
        return this.DeblockingTime;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PostDetailCommentResultModel{DeblockingTime='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.DeblockingTime, '\'', ", cid=");
        return o000O0.OooO0O0(sbOooO0o0, this.cid, '}');
    }
}
