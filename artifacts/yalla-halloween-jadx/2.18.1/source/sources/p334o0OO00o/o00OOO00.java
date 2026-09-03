package p334o0OO00o;

import android.support.v4.media.OooO00o;
import com.google.android.gms.internal.measurement.zzjd;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 extends o00OOO0O {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f37333Oooo0oo;

    public o00OOO00(byte[] bArr, int i) {
        super(bArr);
        zzjd.OooO0oO(0, i, bArr.length);
        this.f37333Oooo0oo = i;
    }

    @Override // p334o0OO00o.o00OOO0O, com.google.android.gms.internal.measurement.zzjd
    public final byte OooO00o(int i) {
        return this.f37334Oooo0oO[i];
    }

    @Override // p334o0OO00o.o00OOO0O
    public final void OooO0oo() {
    }

    @Override // p334o0OO00o.o00OOO0O, com.google.android.gms.internal.measurement.zzjd
    public final byte zza(int i) {
        int i2 = this.f37333Oooo0oo;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f37334Oooo0oO[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(OooO00o.OooO00o("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(o00O00OO.OooO00o("Index > length: ", i, ", ", i2));
    }

    @Override // p334o0OO00o.o00OOO0O, com.google.android.gms.internal.measurement.zzjd
    public final int zzd() {
        return this.f37333Oooo0oo;
    }
}
