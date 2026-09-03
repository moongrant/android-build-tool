package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzax {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f15667OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzbj f15668OooO0O0 = new zzbj();

    public zzax() {
        OooO00o(new zzav());
        OooO00o(new zzay());
        OooO00o(new zzaz());
        OooO00o(new zzbc());
        OooO00o(new zzbh());
        OooO00o(new zzbi());
        OooO00o(new zzbk());
    }

    public final void OooO00o(zzaw zzawVar) {
        Iterator it = zzawVar.f15666OooO00o.iterator();
        while (it.hasNext()) {
            this.f15667OooO00o.put(((zzbl) it.next()).zzb().toString(), zzawVar);
        }
    }

    public final zzap zza(zzg zzgVar, zzap zzapVar) {
        zzh.zzc(zzgVar);
        if (!(zzapVar instanceof zzaq)) {
            return zzapVar;
        }
        zzaq zzaqVar = (zzaq) zzapVar;
        ArrayList arrayListZzc = zzaqVar.zzc();
        String strZzb = zzaqVar.zzb();
        HashMap map = this.f15667OooO00o;
        return (map.containsKey(strZzb) ? (zzaw) map.get(strZzb) : this.f15668OooO0O0).zza(strZzb, zzgVar, arrayListZzc);
    }
}
