package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o0 extends o0oOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f15537OooO0o;

    public o0O00o0(byte[] bArr, int i) {
        super(bArr);
        zzka.OooO0o0(0, i, bArr.length);
        this.f15537OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o0oOOo, com.google.android.gms.internal.measurement.zzka
    public final byte OooO00o(int i) {
        return this.f15601OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.o0oOOo
    public final void OooO0o() {
    }

    @Override // com.google.android.gms.internal.measurement.o0oOOo, com.google.android.gms.internal.measurement.zzka
    public final byte zza(int i) {
        int i2 = this.f15537OooO0o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f15601OooO0o0[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.OooO00o.OooO00o("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index > length: ", i, ", ", i2));
    }

    @Override // com.google.android.gms.internal.measurement.o0oOOo, com.google.android.gms.internal.measurement.zzka
    public final int zzd() {
        return this.f15537OooO0o;
    }
}
