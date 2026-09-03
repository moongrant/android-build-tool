package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class o0O0o extends o0oOOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f15077OooO0o0;

    public o0O0o(byte[] bArr) {
        bArr.getClass();
        this.f15077OooO0o0 = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte OooO00o(int i) {
        return this.f15077OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final int OooO0O0(int i, int i2) {
        Charset charset = zzlj.f15277OooO00o;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.f15077OooO0o0[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final String OooO0OO(Charset charset) {
        return new String(this.f15077OooO0o0, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void OooO0Oo(zzjq zzjqVar) throws IOException {
        ((o0O00000) zzjqVar).OooO0O0(zzd(), this.f15077OooO0o0);
    }

    public void OooO0o() {
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || zzd() != ((zzka) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof o0O0o)) {
            return obj.equals(this);
        }
        o0O0o o0o0o = (o0O0o) obj;
        int i = this.f15267OooO0Oo;
        int i2 = o0o0o.f15267OooO0Oo;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > o0o0o.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > o0o0o.zzd()) {
            throw new IllegalArgumentException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Ran off end of other: 0, ", iZzd, ", ", o0o0o.zzd()));
        }
        o0o0o.OooO0o();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iZzd) {
            if (this.f15077OooO0o0[i3] != o0o0o.f15077OooO0o0[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i) {
        return this.f15077OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.f15077OooO0o0.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i, int i2) {
        int iOooO0o0 = zzka.OooO0o0(0, i2, zzd());
        return iOooO0o0 == 0 ? zzka.zzb : new oo00oO(this.f15077OooO0o0, iOooO0o0);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return oO00000o.OooO0Oo(0, zzd(), this.f15077OooO0o0);
    }
}
