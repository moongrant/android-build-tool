package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends zzai {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f15660OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f15661OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final zzg f15662OooO0oo;

    public zzao(zzao zzaoVar) {
        super(zzaoVar.f15657OooO0Oo);
        ArrayList arrayList = new ArrayList(zzaoVar.f15660OooO0o.size());
        this.f15660OooO0o = arrayList;
        arrayList.addAll(zzaoVar.f15660OooO0o);
        ArrayList arrayList2 = new ArrayList(zzaoVar.f15661OooO0oO.size());
        this.f15661OooO0oO = arrayList2;
        arrayList2.addAll(zzaoVar.f15661OooO0oO);
        this.f15662OooO0oo = zzaoVar.f15662OooO0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzg zzgVarZza = this.f15662OooO0oo.zza();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f15660OooO0o;
            if (i >= arrayList.size()) {
                break;
            }
            if (i < list.size()) {
                zzgVarZza.zze((String) arrayList.get(i), zzgVar.zzb((zzap) list.get(i)));
            } else {
                zzgVarZza.zze((String) arrayList.get(i), zzap.zzf);
            }
            i++;
        }
        for (zzap zzapVar : this.f15661OooO0oO) {
            zzap zzapVarZzb = zzgVarZza.zzb(zzapVar);
            if (zzapVarZzb instanceof zzaq) {
                zzapVarZzb = zzgVarZza.zzb(zzapVar);
            }
            if (zzapVarZzb instanceof zzag) {
                return ((zzag) zzapVarZzb).zzb();
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzao(this);
    }

    public zzao(String str, List list, List list2, zzg zzgVar) {
        super(str);
        this.f15660OooO0o = new ArrayList();
        this.f15662OooO0oo = zzgVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15660OooO0o.add(((zzap) it.next()).zzi());
            }
        }
        this.f15661OooO0oO = new ArrayList(list2);
    }
}
