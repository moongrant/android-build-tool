package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzax f15928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f15929OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f15930OooO0OO = new HashMap();
    public final zzg zza;

    public zzg(zzg zzgVar, zzax zzaxVar) {
        this.zza = zzgVar;
        this.f15928OooO00o = zzaxVar;
    }

    public final zzg zza() {
        return new zzg(this, this.f15928OooO00o);
    }

    public final zzap zzb(zzap zzapVar) {
        return this.f15928OooO00o.zza(this, zzapVar);
    }

    public final zzap zzc(zzae zzaeVar) {
        zzap zzapVarZza = zzap.zzf;
        Iterator itZzk = zzaeVar.zzk();
        while (itZzk.hasNext()) {
            zzapVarZza = this.f15928OooO00o.zza(this, zzaeVar.zze(((Integer) itZzk.next()).intValue()));
            if (zzapVarZza instanceof zzag) {
                break;
            }
        }
        return zzapVarZza;
    }

    public final zzap zzd(String str) {
        if (this.f15929OooO0O0.containsKey(str)) {
            return (zzap) this.f15929OooO0O0.get(str);
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void zze(String str, zzap zzapVar) {
        if (this.f15930OooO0OO.containsKey(str)) {
            return;
        }
        if (zzapVar == null) {
            this.f15929OooO0O0.remove(str);
        } else {
            this.f15929OooO0O0.put(str, zzapVar);
        }
    }

    public final void zzf(String str, zzap zzapVar) {
        zze(str, zzapVar);
        this.f15930OooO0OO.put(str, Boolean.TRUE);
    }

    public final void zzg(String str, zzap zzapVar) {
        zzg zzgVar;
        if (!this.f15929OooO0O0.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzh(str)) {
            this.zza.zzg(str, zzapVar);
        } else {
            if (this.f15930OooO0OO.containsKey(str)) {
                return;
            }
            if (zzapVar == null) {
                this.f15929OooO0O0.remove(str);
            } else {
                this.f15929OooO0O0.put(str, zzapVar);
            }
        }
    }

    public final boolean zzh(String str) {
        if (this.f15929OooO0O0.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        return false;
    }
}
