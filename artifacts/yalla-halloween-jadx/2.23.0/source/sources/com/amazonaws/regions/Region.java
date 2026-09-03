package com.amazonaws.regions;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Region {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f9235OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f9236OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f9237OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f9238OooO0o0 = new HashMap();

    public Region(String str, String str2) {
        this.f9234OooO00o = str;
        if (str2 == null || str2.isEmpty()) {
            this.f9235OooO0O0 = "amazonaws.com";
        } else {
            this.f9235OooO0O0 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Region)) {
            return false;
        }
        return this.f9234OooO00o.equals(((Region) obj).f9234OooO00o);
    }

    public final int hashCode() {
        return this.f9234OooO00o.hashCode();
    }

    public final String toString() {
        return this.f9234OooO00o;
    }
}
