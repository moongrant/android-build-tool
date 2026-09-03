package p271o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f40472OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzjz f40473OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzcf f40474OooO0o0;

    public c(zzjz zzjzVar, zzq zzqVar, zzcf zzcfVar) {
        this.f40473OooO0o = zzjzVar;
        this.f40472OooO0Oo = zzqVar;
        this.f40474OooO0o0 = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd zzgdVar;
        zzq zzqVar = this.f40472OooO0Oo;
        zzcf zzcfVar = this.f40474OooO0o0;
        zzjz zzjzVar = this.f40473OooO0o;
        String strZzd = null;
        try {
            try {
                boolean zZzj = zzjzVar.f40788OooO00o.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE);
                zzgdVar = zzjzVar.f40788OooO00o;
                if (zZzj) {
                    zzej zzejVar = zzjzVar.f15588OooO0Oo;
                    if (zzejVar == null) {
                        zzgdVar.zzaA().zzd().zza("Failed to get app instance id");
                    } else {
                        Preconditions.checkNotNull(zzqVar);
                        strZzd = zzejVar.zzd(zzqVar);
                        if (strZzd != null) {
                            zzgdVar.zzq().f15565OooO0oO.set(strZzd);
                            zzgdVar.zzm().f40767OooO0o.zzb(strZzd);
                        }
                        zzjzVar.OooO();
                    }
                } else {
                    zzgdVar.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    zzgdVar.zzq().f15565OooO0oO.set(null);
                    zzgdVar.zzm().f40767OooO0o.zzb(null);
                }
            } catch (RemoteException e) {
                zzjzVar.f40788OooO00o.zzaA().zzd().zzb("Failed to get app instance id", e);
                zzgdVar = zzjzVar.f40788OooO00o;
            }
            zzlp zzlpVarZzv = zzgdVar.zzv();
        } finally {
            zzjzVar.f40788OooO00o.zzv().zzW(zzcfVar, null);
        }
    }
}
