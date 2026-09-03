package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlh;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37795Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzaw f37796Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f37797Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzcf f37798Oooo0oo;

    public o0O0o(zzjs zzjsVar, zzaw zzawVar, String str, zzcf zzcfVar) {
        this.f37795Oooo = zzjsVar;
        this.f37796Oooo0o = zzawVar;
        this.f37797Oooo0oO = str;
        this.f37798Oooo0oo = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy zzfyVar;
        byte[] bArrZzu = null;
        try {
            try {
                zzjs zzjsVar = this.f37795Oooo;
                zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                if (zzeeVar == null) {
                    zzjsVar.f37615OooO00o.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzfyVar = this.f37795Oooo.f37615OooO00o;
                } else {
                    bArrZzu = zzeeVar.zzu(this.f37796Oooo0o, this.f37797Oooo0oO);
                    this.f37795Oooo.OooO();
                    zzfyVar = this.f37795Oooo.f37615OooO00o;
                }
            } catch (RemoteException e) {
                this.f37795Oooo.f37615OooO00o.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
                zzfyVar = this.f37795Oooo.f37615OooO00o;
            }
            zzlh zzlhVarZzv = zzfyVar.zzv();
        } finally {
            this.f37795Oooo.f37615OooO00o.zzv().zzS(this.f37798Oooo0oo, bArrZzu);
        }
    }
}
