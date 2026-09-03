package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public zzaa f15881OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public zzaa f15882OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f15883OooO0OO;

    public zzab() {
        this.f15881OooO00o = new zzaa("", 0L, null);
        this.f15882OooO0O0 = new zzaa("", 0L, null);
        this.f15883OooO0OO = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzabVar = new zzab(this.f15881OooO00o.clone());
        Iterator it = this.f15883OooO0OO.iterator();
        while (it.hasNext()) {
            zzabVar.f15883OooO0OO.add(((zzaa) it.next()).clone());
        }
        return zzabVar;
    }

    public final zzaa zza() {
        return this.f15881OooO00o;
    }

    public final zzaa zzb() {
        return this.f15882OooO0O0;
    }

    public final List zzc() {
        return this.f15883OooO0OO;
    }

    public final void zzd(zzaa zzaaVar) {
        this.f15881OooO00o = zzaaVar;
        this.f15882OooO0O0 = zzaaVar.clone();
        this.f15883OooO0OO.clear();
    }

    public final void zze(String str, long j, Map map) {
        this.f15883OooO0OO.add(new zzaa(str, j, map));
    }

    public final void zzf(zzaa zzaaVar) {
        this.f15882OooO0O0 = zzaaVar;
    }

    public zzab(zzaa zzaaVar) {
        this.f15881OooO00o = zzaaVar;
        this.f15882OooO0O0 = zzaaVar.clone();
        this.f15883OooO0OO = new ArrayList();
    }
}
