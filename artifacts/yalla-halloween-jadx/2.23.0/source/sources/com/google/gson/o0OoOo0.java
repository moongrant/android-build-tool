package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedTreeMap<String, Oooo0> f20715OooO0Oo = new LinkedTreeMap<>();

    public final void OooO0OO(String str, Oooo0 oooo0) {
        if (oooo0 == null) {
            oooo0 = o000oOoO.f20713OooO0Oo;
        }
        this.f20715OooO0Oo.put(str, oooo0);
    }

    public final void OooO0Oo(String str, String str2) {
        OooO0OO(str, str2 == null ? o000oOoO.f20713OooO0Oo : new o00Oo0(str2));
    }

    public final Oooo0 OooO0o(String str) {
        return this.f20715OooO0Oo.get(str);
    }

    public final LinkedTreeMap.OooO0O0 OooO0o0() {
        return (LinkedTreeMap.OooO0O0) this.f20715OooO0Oo.entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o0OoOo0) && ((o0OoOo0) obj).f20715OooO0Oo.equals(this.f20715OooO0Oo));
    }

    public final int hashCode() {
        return this.f20715OooO0Oo.hashCode();
    }
}
