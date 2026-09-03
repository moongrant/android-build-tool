package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes.dex */
public class CommonModel extends AbsJavaBean {
    public int bartype;

    /* JADX INFO: renamed from: code, reason: collision with root package name */
    public String f11862code = "-1";
    public int index;
    public String message;
    public String mid;
    public String msg;
    public long mycoin;
    public String mylongtime;
    public String pagecount;
    public int pageindex;
    public String perimageurl;
    public String pernumber;
    public String str;
    public long time;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f11862code;
        String str2 = ((CommonModel) obj).f11862code;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11862code;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CommonModel{code='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f11862code, '\'', ", message='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.message, '\'', ", msg='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.msg, '\'', ", time=");
        sbOooO0o0.append(this.time);
        sbOooO0o0.append(", index=");
        sbOooO0o0.append(this.index);
        sbOooO0o0.append(", mycoin=");
        sbOooO0o0.append(this.mycoin);
        sbOooO0o0.append(", bartype='");
        sbOooO0o0.append(this.bartype);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", pagecount='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.pagecount, '\'', ", mylongtime='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mylongtime, '\'', ", str='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.str, '\'', ", pernumber='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.pernumber, '\'', ", perimageurl='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.perimageurl, '\'', '}');
    }
}
