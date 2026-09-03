package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzik f37756Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzjs f37757Oooo0oO;

    public o0O00o0(zzjs zzjsVar, zzik zzikVar) {
        this.f37757Oooo0oO = zzjsVar;
        this.f37756Oooo0o = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37757Oooo0oO;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Failed to send current screen to service");
            return;
        }
        try {
            zzik zzikVar = this.f37756Oooo0o;
            if (zzikVar == null) {
                zzeeVar.zzq(0L, null, null, zzjsVar.f37615OooO00o.zzau().getPackageName());
            } else {
                zzeeVar.zzq(zzikVar.zzc, zzikVar.zza, zzikVar.zzb, zzjsVar.f37615OooO00o.zzau().getPackageName());
            }
            this.f37757Oooo0oO.OooO();
        } catch (RemoteException e) {
            this.f37757Oooo0oO.f37615OooO00o.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
