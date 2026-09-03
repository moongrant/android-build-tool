package com.yalla.yalla.model.share;

import com.yalla.yalla.model.bean.AbsJavaBean;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public class ShareUrlModel extends AbsJavaBean {
    private Integer sharekey;
    private String shareurl;

    public Integer getShareKey() {
        return this.sharekey;
    }

    public String getShareUrl() {
        return this.shareurl;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("ShareUrlModel{sharekey=");
        sb.append(this.sharekey);
        sb.append(", shareurl='");
        return o0O00o0.OooO0O0(sb, this.shareurl, "'}");
    }
}
