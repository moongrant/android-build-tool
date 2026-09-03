package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TagSet {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Map<String, String> f10941OooO00o;

    public TagSet() {
        this.f10941OooO00o = new HashMap(1);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Tags: ");
        sbOooO0o0.append(this.f10941OooO00o);
        stringBuffer.append(sbOooO0o0.toString());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public TagSet(Map<String, String> map) {
        HashMap map2 = new HashMap(1);
        this.f10941OooO00o = map2;
        map2.putAll(map);
    }
}
