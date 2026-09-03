package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f15053OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f15054OooO0O0;

    public o0O000O(Object obj, int i) {
        this.f15053OooO00o = obj;
        this.f15054OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0O000O)) {
            return false;
        }
        o0O000O o0o000o = (o0O000O) obj;
        return this.f15053OooO00o == o0o000o.f15053OooO00o && this.f15054OooO0O0 == o0o000o.f15054OooO0O0;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15053OooO00o) * 65535) + this.f15054OooO0O0;
    }
}
