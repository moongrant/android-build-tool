package com.google.android.gms.internal.measurement;

import OooO0O0.OooO00o;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p042Ooooo0o.o000O0O0;
import p100o000oOoO.o00O00OO;
import p334o0OO00o.o00OO;
import p334o0OO00o.o00OO00O;
import p334o0OO00o.o00OOO0O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjd implements Iterable, Serializable {
    public static final zzjd zzb = new o00OOO0O(zzkm.zzd);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f15969Oooo0o = 0;

    static {
        int i = o00OO00O.f37328OooO00o;
    }

    public static int OooO0oO(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(OooO00o.OooO00o("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(o00O00OO.OooO00o("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(o00O00OO.OooO00o("End index: ", i2, " >= ", i3));
    }

    public static zzjd zzl(byte[] bArr, int i, int i2) {
        OooO0oO(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new o00OOO0O(bArr2);
    }

    public static zzjd zzm(String str) {
        return new o00OOO0O(str.getBytes(zzkm.f15980OooO00o));
    }

    public abstract byte OooO00o(int i);

    public abstract int OooO0O0(int i, int i2);

    public abstract String OooO0OO(Charset charset);

    public abstract void OooO0o0(zzit zzitVar) throws IOException;

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iOooO0O0 = this.f15969Oooo0o;
        if (iOooO0O0 == 0) {
            int iZzd = zzd();
            iOooO0O0 = OooO0O0(iZzd, iZzd);
            if (iOooO0O0 == 0) {
                iOooO0O0 = 1;
            }
            this.f15969Oooo0o = iOooO0O0;
        }
        return iOooO0O0;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new o00OO(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? o000O0O0.OooO0Oo(this) : o000O0O0.OooO0Oo(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract int zzd();

    public abstract zzjd zzf(int i, int i2);

    public abstract boolean zzi();

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : OooO0OO(charset);
    }
}
