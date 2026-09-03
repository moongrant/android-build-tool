package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import java.util.Iterator;
import p188o00o0O.OooOO0;
import p269o00ooooo.o0O0OO0;
import p269o00ooooo.o0O0OOO0;
import p269o00ooooo.o0OO000o;
import p269o00ooooo.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends oo0ooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f15892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0 f15893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f15894OooO0Oo;

    public zzd(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15893OooO0OO = new OooOO0();
        this.f15892OooO0O0 = new OooOO0();
    }

    @WorkerThread
    public final void OooO00o(long j, zzir zzirVar) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzirVar == null) {
            zzgdVar.zzaA().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzgdVar.zzaA().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        zzlp.zzK(zzirVar, bundle, true);
        zzgdVar.zzq().OooO0OO(bundle, "am", "_xa");
    }

    @WorkerThread
    public final void OooO0O0(String str, long j, zzir zzirVar) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzirVar == null) {
            zzgdVar.zzaA().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzgdVar.zzaA().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        zzlp.zzK(zzirVar, bundle, true);
        zzgdVar.zzq().OooO0OO(bundle, "am", "_xu");
    }

    @WorkerThread
    public final void OooO0OO(long j) {
        OooOO0 oooOO1 = this.f15892OooO0O0;
        Iterator it = ((OooOO0.OooO0OO) oooOO1.keySet()).iterator();
        while (it.hasNext()) {
            oooOO1.put((String) it.next(), Long.valueOf(j));
        }
        if (oooOO1.isEmpty()) {
            return;
        }
        this.f15894OooO0Oo = j;
    }

    public final void zzd(String str, long j) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (str == null || str.length() == 0) {
            o0O0OO0.OooO00o(zzgdVar, "Ad unit id must be a non-empty string");
        } else {
            zzgdVar.zzaB().zzp(new o0O0OOO0(this, str, j));
        }
    }

    public final void zze(String str, long j) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (str == null || str.length() == 0) {
            o0O0OO0.OooO00o(zzgdVar, "Ad unit id must be a non-empty string");
        } else {
            zzgdVar.zzaB().zzp(new o0OO000o(this, str, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzf(long j) {
        zzir zzirVarZzj = this.f41276OooO00o.zzs().zzj(false);
        OooOO0 oooOO1 = this.f15892OooO0O0;
        for (String str : (OooOO0.OooO0OO) oooOO1.keySet()) {
            OooO0O0(str, j - ((Long) oooOO1.getOrDefault(str, null)).longValue(), zzirVarZzj);
        }
        if (!oooOO1.isEmpty()) {
            OooO00o(j - this.f15894OooO0Oo, zzirVarZzj);
        }
        OooO0OO(j);
    }
}
