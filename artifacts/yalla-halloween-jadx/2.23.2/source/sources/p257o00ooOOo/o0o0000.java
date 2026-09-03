package p257o00ooOOo;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzn;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0000 implements Handler.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f40367OooO0Oo;

    public /* synthetic */ o0o0000(oO0Oo oo0oo) {
        this.f40367OooO0Oo = oo0oo;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f40367OooO0Oo.f40370OooO0o0) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    o0OOo000 o0ooo001 = (o0OOo000) this.f40367OooO0Oo.f40370OooO0o0.get(zznVar);
                    if (o0ooo001 != null && o0ooo001.f40360OooO00o.isEmpty()) {
                        if (o0ooo001.f40362OooO0OO) {
                            o0ooo001.f40366OooO0oO.f40371OooO0oO.removeMessages(1, o0ooo001.f40365OooO0o0);
                            oO0Oo oo0oo = o0ooo001.f40366OooO0oO;
                            oo0oo.f40368OooO.unbindService(oo0oo.f40369OooO0o, o0ooo001);
                            o0ooo001.f40362OooO0OO = false;
                            o0ooo001.f40361OooO0O0 = 2;
                        }
                        this.f40367OooO0Oo.f40370OooO0o0.remove(zznVar);
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
        synchronized (this.f40367OooO0Oo.f40370OooO0o0) {
            zzn zznVar2 = (zzn) message.obj;
            o0OOo000 o0ooo002 = (o0OOo000) this.f40367OooO0Oo.f40370OooO0o0.get(zznVar2);
            if (o0ooo002 != null && o0ooo002.f40361OooO0O0 == 3) {
                String strValueOf = String.valueOf(zznVar2);
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(strValueOf), new Exception());
                ComponentName componentName = o0ooo002.f40364OooO0o;
                if (componentName == null) {
                    componentName = zznVar2.zzb();
                }
                if (componentName == null) {
                    String strZzd = zznVar2.zzd();
                    Preconditions.checkNotNull(strZzd);
                    componentName = new ComponentName(strZzd, "unknown");
                }
                o0ooo002.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
