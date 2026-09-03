package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00oO extends o0O0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f15158OooO0o;

    public oo00oO(byte[] bArr, int i) {
        super(bArr);
        zzka.OooO0o0(0, i, bArr.length);
        this.f15158OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0o, com.google.android.gms.internal.measurement.zzka
    public final byte OooO00o(int i) {
        return this.f15077OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.o0O0o
    public final void OooO0o() {
    }

    @Override // com.google.android.gms.internal.measurement.o0O0o, com.google.android.gms.internal.measurement.zzka
    public final byte zza(int i) {
        int i2 = this.f15158OooO0o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f15077OooO0o0[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.OooO00o.OooO00o("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index > length: ", i, ", ", i2));
    }

    @Override // com.google.android.gms.internal.measurement.o0O0o, com.google.android.gms.internal.measurement.zzka
    public final int zzd() {
        return this.f15158OooO0o;
    }
}
