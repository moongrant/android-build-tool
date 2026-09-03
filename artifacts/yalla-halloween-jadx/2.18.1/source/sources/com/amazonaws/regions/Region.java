package com.amazonaws.regions;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Region {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10554OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10555OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f10556OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, Boolean> f10557OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<String, Boolean> f10558OooO0o0 = new HashMap();

    public Region(String str, String str2) {
        this.f10554OooO00o = str;
        if (str2 == null || str2.isEmpty()) {
            this.f10555OooO0O0 = "amazonaws.com";
        } else {
            this.f10555OooO0O0 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Region) {
            return this.f10554OooO00o.equals(((Region) obj).f10554OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10554OooO00o.hashCode();
    }

    public final String toString() {
        return this.f10554OooO00o;
    }
}
