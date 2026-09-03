package com.app.base.model;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class SystemMessageModel {
    public String content;
    public DyMessageModel data;
    public String datetime;
    public long localtime;
    public int type_code;
    public String uid;
    public String viplevel;

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SystemMessageModel{type_code=");
        sbOooO0o0.append(this.type_code);
        sbOooO0o0.append(", content='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', ", datetime='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.datetime, '\'', ", data=");
        sbOooO0o0.append(this.data);
        sbOooO0o0.append(", localtime=");
        sbOooO0o0.append(this.localtime);
        sbOooO0o0.append(", uid='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.uid, '\'', '}');
    }
}
