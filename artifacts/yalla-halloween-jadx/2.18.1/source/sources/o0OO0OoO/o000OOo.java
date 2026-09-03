package o0OO0OoO;

import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzfg;
import com.google.android.gms.measurement.internal.zzfy;
import com.umeng.analytics.pro.ak;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzbr f37621Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzff f37622Oooo0oO;

    public o000OOo(zzff zzffVar, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f37622Oooo0oO = zzffVar;
        this.f37621Oooo0o = zzbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar = this.f37622Oooo0oO;
        zzfg zzfgVar = zzffVar.f16168OooO0O0;
        String str = zzffVar.f16167OooO00o;
        zzbr zzbrVar = this.f37621Oooo0o;
        zzfgVar.f16169OooO00o.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString(ak.f20239o, str);
        try {
            if (zzbrVar.zzd(bundle) == null) {
                zzfgVar.f16169OooO00o.zzay().zzd().zza("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            zzfgVar.f16169OooO00o.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfgVar.f16169OooO00o.zzaz().zzg();
        zzfy.OooO0OO();
        throw null;
    }
}
