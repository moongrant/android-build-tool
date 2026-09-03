package com.app.base.model;

import kotlin.reflect.jvm.internal.impl.builtins.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class CommonData extends CommonModel {
    public String data;

    @Override // com.app.base.model.CommonModel
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

    @Override // com.app.base.model.CommonModel
    public int hashCode() {
        String str = this.data;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.app.base.model.CommonModel, com.app.base.bean.AbsJavaBean
    public String toString() {
        return OooO00o.OooO00o(OooO00o.OooO00o.OooO0o0("CommonData{data='"), this.data, '\'', '}');
    }
}
