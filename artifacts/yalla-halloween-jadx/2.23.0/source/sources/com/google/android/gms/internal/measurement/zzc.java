package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzf f15677OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public zzg f15678OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzab f15679OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzz f15680OooO0Oo;

    public zzc() {
        zzf zzfVar = new zzf();
        this.f15677OooO00o = zzfVar;
        this.f15678OooO0O0 = zzfVar.f15692OooO0O0.zza();
        this.f15679OooO0OO = new zzab();
        this.f15680OooO0Oo = new zzz();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzv(this.zza.f15680OooO0Oo);
            }
        };
        zzj zzjVar = zzfVar.f15694OooO0Oo;
        zzjVar.zza("internal.registerCallback", callable);
        zzjVar.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(this.zza.f15679OooO0OO);
            }
        });
    }

    public final zzab zza() {
        return this.f15679OooO0OO;
    }

    public final void zzc(zzgt zzgtVar) throws zzd {
        zzai zzaiVar;
        zzf zzfVar = this.f15677OooO00o;
        try {
            this.f15678OooO0O0 = zzfVar.f15692OooO0O0.zza();
            if (zzfVar.zza(this.f15678OooO0O0, (zzgy[]) zzgtVar.zzc().toArray(new zzgy[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzgr zzgrVar : zzgtVar.zza().zzd()) {
                List listZzc = zzgrVar.zzc();
                String strZzb = zzgrVar.zzb();
                Iterator it = listZzc.iterator();
                while (it.hasNext()) {
                    zzap zzapVarZza = zzfVar.zza(this.f15678OooO0O0, (zzgy) it.next());
                    if (!(zzapVarZza instanceof zzam)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.f15678OooO0O0;
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
                    zzaiVar.zza(this.f15678OooO0O0, Collections.singletonList(zzapVarZza));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void zzd(String str, Callable callable) {
        this.f15677OooO00o.f15694OooO0Oo.zza(str, callable);
    }

    public final boolean zze(zzaa zzaaVar) throws zzd {
        zzab zzabVar = this.f15679OooO0OO;
        try {
            zzabVar.zzd(zzaaVar);
            this.f15677OooO00o.f15693OooO0OO.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f15680OooO0Oo.zzb(this.f15678OooO0O0.zza(), zzabVar);
            return zzg() || zzf();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzf() {
        return !this.f15679OooO0OO.zzc().isEmpty();
    }

    public final boolean zzg() {
        zzab zzabVar = this.f15679OooO0OO;
        return !zzabVar.zzb().equals(zzabVar.zza());
    }
}
