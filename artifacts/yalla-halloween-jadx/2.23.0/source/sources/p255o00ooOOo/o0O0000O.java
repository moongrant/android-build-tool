package p255o00ooOOo;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzn;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0000O implements Handler.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O000 f41038OooO0Oo;

    public /* synthetic */ o0O0000O(o0O000 o0o001) {
        this.f41038OooO0Oo = o0o001;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f41038OooO0Oo.f41026OooO0o0) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    o0O00000 o0o00000 = (o0O00000) this.f41038OooO0Oo.f41026OooO0o0.get(zznVar);
                    if (o0o00000 != null && o0o00000.f41031OooO00o.isEmpty()) {
                        if (o0o00000.f41033OooO0OO) {
                            o0o00000.f41037OooO0oO.f41027OooO0oO.removeMessages(1, o0o00000.f41036OooO0o0);
                            o0O000 o0o001 = o0o00000.f41037OooO0oO;
                            o0o001.f41024OooO.unbindService(o0o001.f41025OooO0o, o0o00000);
                            o0o00000.f41033OooO0OO = false;
                            o0o00000.f41032OooO0O0 = 2;
                        }
                        this.f41038OooO0Oo.f41026OooO0o0.remove(zznVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f41038OooO0Oo.f41026OooO0o0) {
            zzn zznVar2 = (zzn) message.obj;
            o0O00000 o0o00001 = (o0O00000) this.f41038OooO0Oo.f41026OooO0o0.get(zznVar2);
            if (o0o00001 != null && o0o00001.f41032OooO0O0 == 3) {
                String strValueOf = String.valueOf(zznVar2);
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(strValueOf), new Exception());
                ComponentName componentName = o0o00001.f41035OooO0o;
                if (componentName == null) {
                    componentName = zznVar2.zzb();
                }
                if (componentName == null) {
                    String strZzd = zznVar2.zzd();
                    Preconditions.checkNotNull(strZzd);
                    componentName = new ComponentName(strZzd, "unknown");
                }
                o0o00001.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
