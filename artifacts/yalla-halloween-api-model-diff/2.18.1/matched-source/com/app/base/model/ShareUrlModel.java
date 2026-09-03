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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ShareUrlModel{sharekey=");
        sbOooO0o0.append(this.sharekey);
        sbOooO0o0.append(", shareurl='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.shareurl, '\'', '}');
    }
}
