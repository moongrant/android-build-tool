package p271o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends oO00O0oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ e0 f40481OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, zzgd zzgdVar) {
        super(zzgdVar);
        this.f40481OooO0o0 = e0Var;
    }

    @Override // p271o00ooooo.oO00O0oO
    @WorkerThread
    public final void OooO0O0() {
        e0 e0Var = this.f40481OooO0o0;
        e0Var.f40493OooO0Oo.zzg();
        zzkp zzkpVar = e0Var.f40493OooO0Oo;
        e0Var.OooO00o(zzkpVar.f40788OooO00o.zzax().elapsedRealtime(), false, false);
        zzkpVar.f40788OooO00o.zzd().zzf(zzkpVar.f40788OooO00o.zzax().elapsedRealtime());
    }
}
