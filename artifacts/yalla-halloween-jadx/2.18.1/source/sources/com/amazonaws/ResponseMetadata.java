package com.amazonaws;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ResponseMetadata {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, String> f10298OooO00o;

    public ResponseMetadata(Map<String, String> map) {
        this.f10298OooO00o = map;
    }

    public final String toString() {
        Map<String, String> map = this.f10298OooO00o;
        return map == null ? "{}" : map.toString();
    }
}
