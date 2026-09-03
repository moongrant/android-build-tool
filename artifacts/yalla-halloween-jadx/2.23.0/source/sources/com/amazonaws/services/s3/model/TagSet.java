package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TagSet {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f9440OooO00o;

    public TagSet(Map<String, String> map) {
        HashMap map2 = new HashMap(1);
        this.f9440OooO00o = map2;
        map2.putAll(map);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("Tags: " + this.f9440OooO00o);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
