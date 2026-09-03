package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzai f15375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzg f15376OooO0o0;

    public OooOO0O(zzai zzaiVar, zzg zzgVar) {
        this.f15375OooO0Oo = zzaiVar;
        this.f15376OooO0o0 = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        zzap zzapVar2 = (zzap) obj2;
        if (zzapVar instanceof zzau) {
            return !(zzapVar2 instanceof zzau) ? 1 : 0;
        }
        if (zzapVar2 instanceof zzau) {
            return -1;
        }
        zzai zzaiVar = this.f15375OooO0Oo;
        return zzaiVar == null ? zzapVar.zzi().compareTo(zzapVar2.zzi()) : (int) zzh.zza(zzaiVar.zza(this.f15376OooO0o0, Arrays.asList(zzapVar, zzapVar2)).zzh().doubleValue());
    }
}
