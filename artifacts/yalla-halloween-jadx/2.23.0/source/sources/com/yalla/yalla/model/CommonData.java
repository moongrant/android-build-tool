package com.yalla.yalla.model;

import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public class CommonData extends CommonModel {
    public String data;

    @Override // com.yalla.yalla.model.CommonModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonData)) {
            return false;
        }
        String str = this.data;
        String str2 = ((CommonData) obj).data;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // com.yalla.yalla.model.CommonModel
    public int hashCode() {
        String str = this.data;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.yalla.yalla.model.CommonModel, com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        return o0O00o0.OooO0O0(new StringBuilder("CommonData{data='"), this.data, "'}");
    }
}
