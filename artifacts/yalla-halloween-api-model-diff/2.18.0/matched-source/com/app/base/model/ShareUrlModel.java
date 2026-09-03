package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class ShareUrlModel extends AbsJavaBean {
    private Integer sharekey;
    private String shareurl;

    public Integer getShareKey() {
        return this.sharekey;
    }

    public String getShareUrl() {
        return this.shareurl;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("ShareUrlModel{sharekey=");
        sbOooO0O0.append(this.sharekey);
        sbOooO0O0.append(", shareurl='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO0O0(sbOooO0O0, this.shareurl, '\'', '}');
    }
}
