package com.squareup.okhttp;

import p028Oooo0oO.o0oOO;
import p340o0OO0ooO.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f21092OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f21093OooO0O0;

    public OooOOO0(String str, String str2) {
        this.f21092OooO00o = str;
        this.f21093OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO0) {
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            if (o000OOo.OooO0Oo(this.f21092OooO00o, oooOOO0.f21092OooO00o) && o000OOo.OooO0Oo(this.f21093OooO0O0, oooOOO0.f21093OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21093OooO0O0;
        int iHashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21092OooO00o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21092OooO00o);
        sb.append(" realm=\"");
        return o0oOO.OooO0O0(sb, this.f21093OooO0O0, "\"");
    }
}
