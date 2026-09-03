package com.amazonaws;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseMetadata {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, String> f8988OooO00o;

    public ResponseMetadata(HashMap map) {
        this.f8988OooO00o = map;
    }

    public final String toString() {
        Map<String, String> map = this.f8988OooO00o;
        return map == null ? "{}" : map.toString();
    }
}
