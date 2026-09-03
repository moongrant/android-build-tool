package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.media3.session.o00O00;
import java.util.Iterator;
import p190o00o0O.OooO;
import p271o00ooooo.oO000Oo0;
import p271o00ooooo.oO00OOOo;
import p271o00ooooo.oO00Oo00;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends oO00Oo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f15416OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f15417OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f15418OooO0Oo;

    public zzd(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15417OooO0OO = new OooO();
        this.f15416OooO0O0 = new OooO();
    }

    @WorkerThread
    public final void OooO00o(long j, zzir zzirVar) {
        zzgd zzgdVar = this.f40788OooO00o;
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
        zzgd zzgdVar = this.f40788OooO00o;
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
        OooO oooO = this.f15416OooO0O0;
        Iterator it = ((OooO.OooO0OO) oooO.keySet()).iterator();
        while (it.hasNext()) {
            oooO.put((String) it.next(), Long.valueOf(j));
        }
        if (oooO.isEmpty()) {
            return;
        }
        this.f15418OooO0Oo = j;
    }

    public final void zzd(String str, long j) {
        zzgd zzgdVar = this.f40788OooO00o;
        if (str == null || str.length() == 0) {
            o00O00.OooO00o(zzgdVar, "Ad unit id must be a non-empty string");
        } else {
            zzgdVar.zzaB().zzp(new oO000Oo0(this, str, j));
        }
    }

    public final void zze(String str, long j) {
        zzgd zzgdVar = this.f40788OooO00o;
        if (str == null || str.length() == 0) {
            o00O00.OooO00o(zzgdVar, "Ad unit id must be a non-empty string");
        } else {
            zzgdVar.zzaB().zzp(new oO00OOOo(this, str, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzf(long j) {
        zzir zzirVarZzj = this.f40788OooO00o.zzs().zzj(false);
        OooO oooO = this.f15416OooO0O0;
        for (String str : (OooO.OooO0OO) oooO.keySet()) {
            OooO0O0(str, j - ((Long) oooO.getOrDefault(str, null)).longValue(), zzirVarZzj);
        }
        if (!oooO.isEmpty()) {
            OooO00o(j - this.f15418OooO0Oo, zzirVarZzj);
        }
        OooO0OO(j);
    }
}
