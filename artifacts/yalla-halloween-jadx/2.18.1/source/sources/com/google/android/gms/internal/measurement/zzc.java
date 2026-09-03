package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzf f15911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public zzg f15912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzab f15913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzz f15914OooO0Oo;

    public zzc() {
        zzf zzfVar = new zzf();
        this.f15911OooO00o = zzfVar;
        this.f15912OooO0O0 = zzfVar.f15925OooO0O0.zza();
        this.f15913OooO0OO = new zzab();
        this.f15914OooO0Oo = new zzz();
        zzfVar.f15927OooO0Oo.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzv(this.zza.f15914OooO0Oo);
            }
        });
        zzfVar.f15927OooO0Oo.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(this.zza.f15913OooO0OO);
            }
        });
    }

    public final zzab zza() {
        return this.f15913OooO0OO;
    }

    public final void zzc(zzgs zzgsVar) throws zzd {
        zzai zzaiVar;
        try {
            this.f15912OooO0O0 = this.f15911OooO00o.f15925OooO0O0.zza();
            if (this.f15911OooO00o.zza(this.f15912OooO0O0, (zzgx[]) zzgsVar.zzc().toArray(new zzgx[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzgq zzgqVar : zzgsVar.zza().zzd()) {
                List listZzc = zzgqVar.zzc();
                String strZzb = zzgqVar.zzb();
                Iterator it = listZzc.iterator();
                while (it.hasNext()) {
                    zzap zzapVarZza = this.f15911OooO00o.zza(this.f15912OooO0O0, (zzgx) it.next());
                    if (!(zzapVarZza instanceof zzam)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.f15912OooO0O0;
                    if (zzgVar.zzh(strZzb)) {
                        zzap zzapVarZzd = zzgVar.zzd(strZzb);
                        if (!(zzapVarZzd instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strZzb)));
                        }
                        zzaiVar = (zzai) zzapVarZzd;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strZzb)));
                    }
                    zzaiVar.zza(this.f15912OooO0O0, Collections.singletonList(zzapVarZza));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void zzd(String str, Callable callable) {
        this.f15911OooO00o.f15927OooO0Oo.zza(str, callable);
    }

    public final boolean zze(zzaa zzaaVar) throws zzd {
        try {
            this.f15913OooO0OO.zzd(zzaaVar);
            this.f15911OooO00o.f15926OooO0OO.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f15914OooO0Oo.zzb(this.f15912OooO0O0.zza(), this.f15913OooO0OO);
            return zzg() || zzf();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzf() {
        return !this.f15913OooO0OO.zzc().isEmpty();
    }

    public final boolean zzg() {
        zzab zzabVar = this.f15913OooO0OO;
        return !zzabVar.zzb().equals(zzabVar.zza());
    }
}
