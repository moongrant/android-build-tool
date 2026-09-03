package com.app.base.model;

import OooO00o.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class MsgFromUserModel {
    public int hasmic;
    public String headphoto;
    public String level;
    public int morder;
    public String name;
    public int panda;
    public int position;
    public String prettyid;
    public int role;
    public int sex;
    public int silenced;
    public String uid;
    public int vehicle;
    public int vip;

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MsgFromUserModel{uid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.uid, '\'', ", name='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", headphoto='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headphoto, '\'', ", level='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.level, '\'', ", sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", position=");
        sbOooO0o0.append(this.position);
        sbOooO0o0.append(", silenced=");
        sbOooO0o0.append(this.silenced);
        sbOooO0o0.append(", hasmic=");
        sbOooO0o0.append(this.hasmic);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", vehicle=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.vehicle, '}');
    }
}
