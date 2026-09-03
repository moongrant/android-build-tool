package p269o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzkp;

/* JADX INFO: loaded from: classes3.dex */
public final class ooooO0O0 extends o0O0oo00 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO f41547OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(oOO ooo, zzgd zzgdVar) {
        super(zzgdVar);
        this.f41547OooO0o0 = ooo;
    }

    @Override // p269o00ooooo.o0O0oo00
    @WorkerThread
    public final void OooO0O0() {
        oOO ooo = this.f41547OooO0o0;
        ooo.f41419OooO0Oo.zzg();
        zzkp zzkpVar = ooo.f41419OooO0Oo;
        ooo.OooO00o(zzkpVar.f41276OooO00o.zzax().elapsedRealtime(), false, false);
        zzkpVar.f41276OooO00o.zzd().zzf(zzkpVar.f41276OooO00o.zzax().elapsedRealtime());
    }
}
