package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Logger;
import p334o0OO00o.o00OOOO0;
import p334o0OO00o.o00OOOOo;
import p334o0OO00o.o0O0OOOo;
import p334o0OO00o.o0OO0oO0;
import p334o0OO00o.o0OOO0;
import p334o0OO00o.o0OOO0OO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjl extends zzit {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f15970OooO0O0 = Logger.getLogger(zzjl.class.getName());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f15971OooO0OO = o0OO0oO0.f37430OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OOOOo f15972OooO00o;

    public zzjl() {
    }

    public /* synthetic */ zzjl(zzjk zzjkVar) {
    }

    @Deprecated
    public static int OooO00o(int i, zzll zzllVar, o0O0OOOo o0o0oooo) {
        int iZzA = zzA(i << 3);
        int i2 = iZzA + iZzA;
        zzin zzinVar = (zzin) zzllVar;
        int iOooO00o = zzinVar.OooO00o();
        if (iOooO00o == -1) {
            iOooO00o = o0o0oooo.OooO0o(zzinVar);
            zzinVar.OooO0OO(iOooO00o);
        }
        return i2 + iOooO00o;
    }

    public static int OooO0O0(zzll zzllVar, o0O0OOOo o0o0oooo) {
        zzin zzinVar = (zzin) zzllVar;
        int iOooO00o = zzinVar.OooO00o();
        if (iOooO00o == -1) {
            iOooO00o = o0o0oooo.OooO0o(zzinVar);
            zzinVar.OooO0OO(iOooO00o);
        }
        return zzA(iOooO00o) + iOooO00o;
    }

    public static int zzA(int i) {
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

    public static int zzB(long j) {
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
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static zzjl zzC(byte[] bArr) {
        return new o00OOOO0(bArr, bArr.length);
    }

    public static int zzt(zzjd zzjdVar) {
        int iZzd = zzjdVar.zzd();
        return zzA(iZzd) + iZzd;
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzw(zzkr zzkrVar) {
        int iZza = zzkrVar.zza();
        return zzA(iZza) + iZza;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = o0OOO0OO.OooO0OO(str);
        } catch (o0OOO0 unused) {
            length = str.getBytes(zzkm.f15980OooO00o).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i) {
        return zzA(i << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzjd zzjdVar) throws IOException;

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
