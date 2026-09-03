package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000o implements o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzmi f15101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15102OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f15103OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f15104OooO0Oo;

    public o0OO000o(zzlb zzlbVar, String str, Object[] objArr) {
        this.f15101OooO00o = zzlbVar;
        this.f15102OooO0O0 = str;
        this.f15103OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15104OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f15104OooO0Oo = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final String OooO00o() {
        return this.f15102OooO0O0;
    }

    public final Object[] OooO0O0() {
        return this.f15103OooO0OO;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final zzmi zza() {
        return this.f15101OooO00o;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final boolean zzb() {
        return (this.f15104OooO0Oo & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final int zzc() {
        return (this.f15104OooO0Oo & 1) == 1 ? 1 : 2;
    }
}
