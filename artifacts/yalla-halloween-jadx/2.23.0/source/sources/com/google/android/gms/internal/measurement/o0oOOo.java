package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class o0oOOo extends oo00oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f15601OooO0o0;

    public o0oOOo(byte[] bArr) {
        bArr.getClass();
        this.f15601OooO0o0 = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte OooO00o(int i) {
        return this.f15601OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final int OooO0O0(int i, int i2) {
        Charset charset = zzlj.f15753OooO00o;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.f15601OooO0o0[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final String OooO0OO(Charset charset) {
        return new String(this.f15601OooO0o0, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void OooO0Oo(zzjq zzjqVar) throws IOException {
        ((o0) zzjqVar).OooO0O0(zzd(), this.f15601OooO0o0);
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
        if (!(obj instanceof o0oOOo)) {
            return obj.equals(this);
        }
        o0oOOo o0oooo = (o0oOOo) obj;
        int i = this.f15743OooO0Oo;
        int i2 = o0oooo.f15743OooO0Oo;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > o0oooo.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > o0oooo.zzd()) {
            throw new IllegalArgumentException(p022Oooo00O.OooOO0.OooO00o("Ran off end of other: 0, ", iZzd, ", ", o0oooo.zzd()));
        }
        o0oooo.OooO0o();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iZzd) {
            if (this.f15601OooO0o0[i3] != o0oooo.f15601OooO0o0[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i) {
        return this.f15601OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.f15601OooO0o0.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i, int i2) {
        int iOooO0o0 = zzka.OooO0o0(0, i2, zzd());
        return iOooO0o0 == 0 ? zzka.zzb : new o0O00o0(this.f15601OooO0o0, iOooO0o0);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return oO00000o.OooO0Oo(0, zzd(), this.f15601OooO0o0);
    }
}
