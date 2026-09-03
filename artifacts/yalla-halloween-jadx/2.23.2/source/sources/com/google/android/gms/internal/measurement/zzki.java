package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzki extends zzjq {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f15268OooO0O0 = Logger.getLogger(zzki.class.getName());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f15269OooO0OO = o0oo0000.f15147OooO0o0;
    public static final /* synthetic */ int zzb = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0O0000O f15270OooO00o;

    public zzki() {
    }

    public /* synthetic */ zzki(int i) {
    }

    @Deprecated
    public static int OooO00o(int i, zzmi zzmiVar, oo0oO0 oo0oo0) {
        int iOooO00o = ((zzjk) zzmiVar).OooO00o(oo0oo0);
        int iZzx = zzx(i << 3);
        return iZzx + iZzx + iOooO00o;
    }

    public static int zzu(int i) {
        if (i >= 0) {
            return zzx(i);
        }
        return 10;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = oO00000o.OooO0OO(str);
        } catch (oO00000 unused) {
            length = str.getBytes(zzlj.f15277OooO00o).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzki zzz(byte[] bArr, int i, int i2) {
        return new o0O00000(bArr, i2);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzka zzkaVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, String str) throws IOException;

    public abstract void zzo(int i, int i2) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i, long j) throws IOException;

    public abstract void zzs(long j) throws IOException;
}
