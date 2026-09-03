package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedTreeMap<String, o000oOoO> f20240OooO0Oo = new LinkedTreeMap<>();

    public final void OooO0OO(String str, o000oOoO o000oooo2) {
        if (o000oooo2 == null) {
            o000oooo2 = o0OoOo0.f20242OooO0Oo;
        }
        this.f20240OooO0Oo.put(str, o000oooo2);
    }

    public final void OooO0Oo(String str, String str2) {
        OooO0OO(str, str2 == null ? o0OoOo0.f20242OooO0Oo : new o00Ooo(str2));
    }

    public final o000oOoO OooO0o(String str) {
        return this.f20240OooO0Oo.get(str);
    }

    public final LinkedTreeMap.OooO0O0 OooO0o0() {
        return (LinkedTreeMap.OooO0O0) this.f20240OooO0Oo.entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o00O0O) && ((o00O0O) obj).f20240OooO0Oo.equals(this.f20240OooO0Oo));
    }

    public final int hashCode() {
        return this.f20240OooO0Oo.hashCode();
    }
}
