package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0 extends o0OOO00 {
    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* synthetic */ void OooO(Object obj, o0O0000O o0o0000o2) throws IOException {
        ((zznl) obj).zzk(o0o0000o2);
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* synthetic */ int OooO00o(Object obj) {
        return ((zznl) obj).zza();
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* synthetic */ int OooO0O0(Object obj) {
        return ((zznl) obj).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* bridge */ /* synthetic */ zznl OooO0OO(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zznlVarOooO00o = zznl.OooO00o();
        zzlbVar.zzc = zznlVarOooO00o;
        return zznlVarOooO00o;
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* synthetic */ zznl OooO0Oo(Object obj) {
        return ((zzlb) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* bridge */ /* synthetic */ void OooO0o(int i, long j, Object obj) {
        ((zznl) obj).OooO0O0(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final Object OooO0o0(Object obj, Object obj2) {
        if (zznl.zzc().equals(obj2)) {
            return obj;
        }
        if (zznl.zzc().equals(obj)) {
            zznl zznlVar = (zznl) obj2;
            zznl zznlVar2 = (zznl) obj;
            int i = zznlVar2.f15286OooO00o + zznlVar.f15286OooO00o;
            int[] iArrCopyOf = Arrays.copyOf(zznlVar2.f15287OooO0O0, i);
            System.arraycopy(zznlVar.f15287OooO0O0, 0, iArrCopyOf, zznlVar2.f15286OooO00o, zznlVar.f15286OooO00o);
            Object[] objArrCopyOf = Arrays.copyOf(zznlVar2.f15288OooO0OO, i);
            System.arraycopy(zznlVar.f15288OooO0OO, 0, objArrCopyOf, zznlVar2.f15286OooO00o, zznlVar.f15286OooO00o);
            return new zznl(i, iArrCopyOf, objArrCopyOf, true);
        }
        zznl zznlVar3 = (zznl) obj2;
        zznl zznlVar4 = (zznl) obj;
        zznlVar4.getClass();
        if (zznlVar3.equals(zznl.f15285OooO0o)) {
            return obj;
        }
        if (!zznlVar4.f15290OooO0o0) {
            throw new UnsupportedOperationException();
        }
        int i2 = zznlVar4.f15286OooO00o + zznlVar3.f15286OooO00o;
        zznlVar4.OooO0OO(i2);
        System.arraycopy(zznlVar3.f15287OooO0O0, 0, zznlVar4.f15287OooO0O0, zznlVar4.f15286OooO00o, zznlVar3.f15286OooO00o);
        System.arraycopy(zznlVar3.f15288OooO0OO, 0, zznlVar4.f15288OooO0OO, zznlVar4.f15286OooO00o, zznlVar3.f15286OooO00o);
        zznlVar4.f15286OooO00o = i2;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final void OooO0oO(Object obj) {
        ((zzlb) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO00
    public final /* synthetic */ void OooO0oo(Object obj, Object obj2) {
        ((zzlb) obj).zzc = (zznl) obj2;
    }
}
