package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzkm;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public class o00OOO0O extends o00OOO0 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final byte[] f37334Oooo0oO;

    public o00OOO0O(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f37334Oooo0oO = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public byte OooO00o(int i) {
        return this.f37334Oooo0oO[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final int OooO0O0(int i, int i2) {
        byte[] bArr = this.f37334Oooo0oO;
        Charset charset = zzkm.f15980OooO00o;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final String OooO0OO(Charset charset) {
        return new String(this.f37334Oooo0oO, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final void OooO0o0(zzit zzitVar) throws IOException {
        ((o00OOOO0) zzitVar).OooO0OO(this.f37334Oooo0oO, zzd());
    }

    public void OooO0oo() {
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjd) || zzd() != ((zzjd) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof o00OOO0O)) {
            return obj.equals(this);
        }
        o00OOO0O o00ooo0o2 = (o00OOO0O) obj;
        int i = this.f15969Oooo0o;
        int i2 = o00ooo0o2.f15969Oooo0o;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > o00ooo0o2.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > o00ooo0o2.zzd()) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Ran off end of other: 0, ", iZzd, ", ", o00ooo0o2.zzd()));
        }
        byte[] bArr = this.f37334Oooo0oO;
        byte[] bArr2 = o00ooo0o2.f37334Oooo0oO;
        o00ooo0o2.OooO0oo();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iZzd) {
            if (bArr[i3] != bArr2[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public byte zza(int i) {
        return this.f37334Oooo0oO[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public int zzd() {
        return this.f37334Oooo0oO.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final zzjd zzf(int i, int i2) {
        int iOooO0oO = zzjd.OooO0oO(0, i2, zzd());
        return iOooO0oO == 0 ? zzjd.zzb : new o00OOO00(this.f37334Oooo0oO, iOooO0oO);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean zzi() {
        return o0OOO0OO.OooO0Oo(this.f37334Oooo0oO, 0, zzd());
    }
}
