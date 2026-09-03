package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f15522OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f15523OooO0O0;

    public o0O000(Object obj, int i) {
        this.f15522OooO00o = obj;
        this.f15523OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0O000)) {
            return false;
        }
        o0O000 o0o001 = (o0O000) obj;
        return this.f15522OooO00o == o0o001.f15522OooO00o && this.f15523OooO0O0 == o0o001.f15523OooO0O0;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15522OooO00o) * 65535) + this.f15523OooO0O0;
    }
}
