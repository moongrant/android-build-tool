package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000 extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f15611OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f15612OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzt f15613OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.f15613OooO0oo = zztVar;
        this.f15611OooO0o = z;
        this.f15612OooO0oO = z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[LOOP:0: B:24:0x0082->B:26:0x008c, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i;
        int i2;
        String strZzi;
        ArrayList arrayList;
        zzh.zzi("log", 1, list);
        int size = list.size();
        zzt zztVar = this.f15613OooO0oo;
        if (size == 1) {
            zztVar.f15830OooO0o.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.f15611OooO0o, this.f15612OooO0oO);
            return zzap.zzf;
        }
        int iZzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (iZzb != 2) {
            i = 3;
            if (iZzb == 3) {
                i2 = 1;
            } else if (iZzb == 5) {
                i2 = 5;
            } else if (iZzb == 6) {
                i2 = 2;
            }
            strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                zztVar.f15830OooO0o.zza(i2, strZzi, Collections.emptyList(), this.f15611OooO0o, this.f15612OooO0oO);
                return zzap.zzf;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(zzgVar.zzb((zzap) list.get(i3)).zzi());
            }
            zztVar.f15830OooO0o.zza(i2, strZzi, arrayList, this.f15611OooO0o, this.f15612OooO0oO);
            return zzap.zzf;
        }
        i = 4;
        i2 = i;
        strZzi = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            zztVar.f15830OooO0o.zza(i2, strZzi, Collections.emptyList(), this.f15611OooO0o, this.f15612OooO0oO);
            return zzap.zzf;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zzb((zzap) list.get(i3)).zzi());
        }
        zztVar.f15830OooO0o.zza(i2, strZzi, arrayList, this.f15611OooO0o, this.f15612OooO0oO);
        return zzap.zzf;
    }
}
