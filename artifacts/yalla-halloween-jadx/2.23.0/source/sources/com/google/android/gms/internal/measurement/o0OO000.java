package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000 implements o0O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzmi f15560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f15562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f15563OooO0Oo;

    public o0OO000(zzlb zzlbVar, String str, Object[] objArr) {
        this.f15560OooO00o = zzlbVar;
        this.f15561OooO0O0 = str;
        this.f15562OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15563OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f15563OooO0Oo = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final String OooO00o() {
        return this.f15561OooO0O0;
    }

    public final Object[] OooO0O0() {
        return this.f15562OooO0OO;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OO0
    public final zzmi zza() {
        return this.f15560OooO00o;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OO0
    public final boolean zzb() {
        return (this.f15563OooO0Oo & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OO0
    public final int zzc() {
        return (this.f15563OooO0Oo & 1) == 1 ? 1 : 2;
    }
}
