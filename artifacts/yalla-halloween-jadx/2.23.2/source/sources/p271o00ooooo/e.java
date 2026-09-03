package p271o00ooooo;

import android.os.RemoteException;
import androidx.media3.session.o00O00;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzir f40488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjz f40489OooO0o0;

    public e(zzjz zzjzVar, zzir zzirVar) {
        this.f40489OooO0o0 = zzjzVar;
        this.f40488OooO0Oo = zzirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.f40489OooO0o0;
        zzej zzejVar = zzjzVar.f15588OooO0Oo;
        zzgd zzgdVar = zzjzVar.f40788OooO00o;
        if (zzejVar == null) {
            o00O00.OooO00o(zzgdVar, "Failed to send current screen to service");
            return;
        }
        try {
            zzir zzirVar = this.f40488OooO0Oo;
            if (zzirVar == null) {
                zzejVar.zzq(0L, null, null, zzgdVar.zzaw().getPackageName());
            } else {
                zzejVar.zzq(zzirVar.zzc, zzirVar.zza, zzirVar.zzb, zzgdVar.zzaw().getPackageName());
            }
            zzjzVar.OooO();
        } catch (RemoteException e) {
            zzjzVar.f40788OooO00o.zzaA().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
