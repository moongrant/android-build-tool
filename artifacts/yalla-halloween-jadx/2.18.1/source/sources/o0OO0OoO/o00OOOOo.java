package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37709Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzcf f37710Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37711Oooo0oo;

    public o00OOOOo(zzjs zzjsVar, zzq zzqVar, zzcf zzcfVar) {
        this.f37711Oooo0oo = zzjsVar;
        this.f37709Oooo0o = zzqVar;
        this.f37710Oooo0oO = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        String strZzd = null;
        try {
            if (this.f37711Oooo0oo.f37615OooO00o.zzm().OooO0o().zzi(zzah.ANALYTICS_STORAGE)) {
                zzjs zzjsVar = this.f37711Oooo0oo;
                zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                if (zzeeVar == null) {
                    zzjsVar.f37615OooO00o.zzay().zzd().zza("Failed to get app instance id");
                    zzfyVar = this.f37711Oooo0oo.f37615OooO00o;
                } else {
                    Preconditions.checkNotNull(this.f37709Oooo0o);
                    strZzd = zzeeVar.zzd(this.f37709Oooo0o);
                    if (strZzd != null) {
                        this.f37711Oooo0oo.f37615OooO00o.zzq().OooO(strZzd);
                        this.f37711Oooo0oo.f37615OooO00o.zzm().f37766OooO0o.zzb(strZzd);
                    }
                    this.f37711Oooo0oo.OooO();
                    zzfyVar = this.f37711Oooo0oo.f37615OooO00o;
                }
            } else {
                this.f37711Oooo0oo.f37615OooO00o.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.f37711Oooo0oo.f37615OooO00o.zzq().OooO(null);
                this.f37711Oooo0oo.f37615OooO00o.zzm().f37766OooO0o.zzb(null);
                zzfyVar = this.f37711Oooo0oo.f37615OooO00o;
            }
        } catch (RemoteException e) {
            this.f37711Oooo0oo.f37615OooO00o.zzay().zzd().zzb("Failed to get app instance id", e);
            zzfyVar = this.f37711Oooo0oo.f37615OooO00o;
        } finally {
            this.f37711Oooo0oo.f37615OooO00o.zzv().zzV(this.f37710Oooo0oO, null);
        }
        zzlh zzlhVarZzv = zzfyVar.zzv();
    }
}
