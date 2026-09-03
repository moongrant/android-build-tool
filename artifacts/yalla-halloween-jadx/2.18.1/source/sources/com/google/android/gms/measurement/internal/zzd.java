package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import java.util.Iterator;
import o0OO0OoO.OooO0O0;
import o0OO0OoO.OooOo;
import o0OO0OoO.o00O0O;
import p021OooOooo.Oooo0;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends o00O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0 f16096OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo0 f16097OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f16098OooO0Oo;

    public zzd(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16097OooO0OO = new Oooo0();
        this.f16096OooO0O0 = new Oooo0();
    }

    @WorkerThread
    public final void OooO00o(long j, zzik zzikVar) {
        if (zzikVar == null) {
            o0OO0OoO.Oooo0.OooO00o(this.f37615OooO00o, "Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.f37615OooO00o.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        zzlh.zzK(zzikVar, bundle, true);
        this.f37615OooO00o.zzq().OooO0OO("am", "_xa", bundle);
    }

    @WorkerThread
    public final void OooO0O0(String str, long j, zzik zzikVar) {
        if (zzikVar == null) {
            o0OO0OoO.Oooo0.OooO00o(this.f37615OooO00o, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.f37615OooO00o.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        zzlh.zzK(zzikVar, bundle, true);
        this.f37615OooO00o.zzq().OooO0OO("am", "_xu", bundle);
    }

    @WorkerThread
    public final void OooO0OO(long j) {
        Iterator it = ((Oooo0.OooO0OO) this.f16096OooO0O0.keySet()).iterator();
        while (it.hasNext()) {
            this.f16096OooO0O0.put((String) it.next(), Long.valueOf(j));
        }
        if (this.f16096OooO0O0.isEmpty()) {
            return;
        }
        this.f16098OooO0Oo = j;
    }

    public final void zzd(String str, long j) {
        if (str == null || str.length() == 0) {
            OooOO0.OooO0O0(this.f37615OooO00o, "Ad unit id must be a non-empty string");
        } else {
            this.f37615OooO00o.zzaz().zzp(new OooO0O0(this, str, j));
        }
    }

    public final void zze(String str, long j) {
        if (str == null || str.length() == 0) {
            OooOO0.OooO0O0(this.f37615OooO00o, "Ad unit id must be a non-empty string");
        } else {
            this.f37615OooO00o.zzaz().zzp(new OooOo(this, str, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final void zzf(long j) {
        zzik zzikVarZzj = this.f37615OooO00o.zzs().zzj(false);
        for (String str : (Oooo0.OooO0OO) this.f16096OooO0O0.keySet()) {
            OooO0O0(str, j - ((Long) this.f16096OooO0O0.getOrDefault(str, null)).longValue(), zzikVarZzj);
        }
        if (!this.f16096OooO0O0.isEmpty()) {
            OooO00o(j - this.f16098OooO0Oo, zzikVarZzj);
        }
        OooO0OO(j);
    }
}
