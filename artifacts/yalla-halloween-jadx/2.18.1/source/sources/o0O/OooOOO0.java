package o0O;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Handler.Callback {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO f35016Oooo0o;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f35016Oooo0o.f35011OooO0o0) {
                zzn zznVar = (zzn) message.obj;
                OooOO0O oooOO0O = (OooOO0O) this.f35016Oooo0o.f35011OooO0o0.get(zznVar);
                if (oooOO0O != null && oooOO0O.f35002OooO00o.isEmpty()) {
                    if (oooOO0O.f35004OooO0OO) {
                        oooOO0O.f35008OooO0oO.f35012OooO0oO.removeMessages(1, oooOO0O.f35007OooO0o0);
                        OooOOO oooOOO = oooOO0O.f35008OooO0oO;
                        oooOOO.f35009OooO.unbindService(oooOOO.f35010OooO0o, oooOO0O);
                        oooOO0O.f35004OooO0OO = false;
                        oooOO0O.f35003OooO0O0 = 2;
                    }
                    this.f35016Oooo0o.f35011OooO0o0.remove(zznVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f35016Oooo0o.f35011OooO0o0) {
            zzn zznVar2 = (zzn) message.obj;
            OooOO0O oooOO0O2 = (OooOO0O) this.f35016Oooo0o.f35011OooO0o0.get(zznVar2);
            if (oooOO0O2 != null && oooOO0O2.f35003OooO0O0 == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(zznVar2), new Exception());
                ComponentName componentName = oooOO0O2.f35006OooO0o;
                if (componentName == null) {
                    componentName = zznVar2.zzb();
                }
                if (componentName == null) {
                    String strZzd = zznVar2.zzd();
                    Preconditions.checkNotNull(strZzd);
                    componentName = new ComponentName(strZzd, "unknown");
                }
                oooOO0O2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
