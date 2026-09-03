package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends zzai {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ArrayList f15893Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final ArrayList f15894Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public zzg f15895OoooO00;

    public zzao(zzao zzaoVar) {
        super(zzaoVar.f15890Oooo0o);
        ArrayList arrayList = new ArrayList(zzaoVar.f15894Oooo0oo.size());
        this.f15894Oooo0oo = arrayList;
        arrayList.addAll(zzaoVar.f15894Oooo0oo);
        ArrayList arrayList2 = new ArrayList(zzaoVar.f15893Oooo.size());
        this.f15893Oooo = arrayList2;
        arrayList2.addAll(zzaoVar.f15893Oooo);
        this.f15895OoooO00 = zzaoVar.f15895OoooO00;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzg zzgVarZza = this.f15895OoooO00.zza();
        for (int i = 0; i < this.f15894Oooo0oo.size(); i++) {
            if (i < list.size()) {
                zzgVarZza.zze((String) this.f15894Oooo0oo.get(i), zzgVar.zzb((zzap) list.get(i)));
            } else {
                zzgVarZza.zze((String) this.f15894Oooo0oo.get(i), zzap.zzf);
            }
        }
        for (zzap zzapVar : this.f15893Oooo) {
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
        this.f15894Oooo0oo = new ArrayList();
        this.f15895OoooO00 = zzgVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f15894Oooo0oo.add(((zzap) it.next()).zzi());
            }
        }
        this.f15893Oooo = new ArrayList(list2);
    }
}
