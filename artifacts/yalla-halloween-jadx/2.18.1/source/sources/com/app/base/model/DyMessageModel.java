package com.app.base.model;

import OooO00o.OooO00o;
import com.facebook.appevents.AppEventsConstants;

/* JADX INFO: loaded from: classes.dex */
public class DyMessageModel {
    public int buytype;
    public long headframeId;
    public String headframeUrl;
    public int viplevel;
    public String medalid = "";
    public String type = "";
    public String headurl = "";
    public String sex = "";
    public String nickname = "";
    public String ispraise = "";
    public String dyid = "";
    public String dyurl = "";
    public String level = "";
    public String coin = "";
    public String upcrystal = "";
    public String language = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public String ExpirationTime = "";

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DyMessageModel{medalid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.medalid, '\'', ", type='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.type, '\'', ", headurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headurl, '\'', ", sex='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.sex, '\'', ", nickname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.nickname, '\'', ", ispraise='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.ispraise, '\'', ", dyid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.dyid, '\'', ", dyurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.dyurl, '\'', ", level='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.level, '\'', ", coin='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.coin, '\'', ", upcrystal='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.upcrystal, '\'', ", language='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.language, '\'', ", ExpirationTime='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.ExpirationTime, '\'', ", viplevel=");
        sbOooO0o0.append(this.viplevel);
        sbOooO0o0.append(", headframeId=");
        sbOooO0o0.append(this.headframeId);
        sbOooO0o0.append(", headframeUrl='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.headframeUrl, '\'', '}');
    }
}
