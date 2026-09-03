package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzka implements Iterable, Serializable {
    public static final zzka zzb = new o0O0o(zzlj.zzd);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15267OooO0Oo = 0;

    static {
        int i = o00OOOO0.f15031OooO00o;
    }

    public static int OooO0o0(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(OooO0OO.OooO00o.OooO00o("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("End index: ", i2, " >= ", i3));
    }

    public static zzka zzl(byte[] bArr, int i, int i2) {
        OooO0o0(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new o0O0o(bArr2);
    }

    public abstract byte OooO00o(int i);

    public abstract int OooO0O0(int i, int i2);

    public abstract String OooO0OO(Charset charset);

    public abstract void OooO0Oo(zzjq zzjqVar) throws IOException;

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iOooO0O0 = this.f15267OooO0Oo;
        if (iOooO0O0 == 0) {
            int iZzd = zzd();
            iOooO0O0 = OooO0O0(iZzd, iZzd);
            if (iOooO0O0 == 0) {
                iOooO0O0 = 1;
            }
            this.f15267OooO0Oo = iOooO0O0;
        }
        return iOooO0O0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new o0O00o0(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? com.android.billingclient.api.o0000O00.OooO00o(this) : com.android.billingclient.api.o0000O00.OooO00o(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract int zzd();

    public abstract zzka zzf(int i, int i2);

    public abstract boolean zzi();

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : OooO0OO(charset);
    }
}
