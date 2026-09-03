package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzir f41400OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjz f41401OooO0o0;

    public oO0Oo0o0(zzjz zzjzVar, zzir zzirVar) {
        this.f41401OooO0o0 = zzjzVar;
        this.f41400OooO0Oo = zzirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.f41401OooO0o0;
        zzej zzejVar = zzjzVar.f16064OooO0Oo;
        zzgd zzgdVar = zzjzVar.f41276OooO00o;
        if (zzejVar == null) {
            o0O0OO0.OooO00o(zzgdVar, "Failed to send current screen to service");
            return;
        }
        try {
            zzir zzirVar = this.f41400OooO0Oo;
            if (zzirVar == null) {
                zzejVar.zzq(0L, null, null, zzgdVar.zzaw().getPackageName());
            } else {
                zzejVar.zzq(zzirVar.zzc, zzirVar.zza, zzirVar.zzb, zzgdVar.zzaw().getPackageName());
            }
            zzjzVar.OooO();
        } catch (RemoteException e) {
            zzjzVar.f41276OooO00o.zzaA().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
