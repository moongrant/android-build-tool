package p355o0OOOo0o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.o0000O0O;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import java.util.HashMap;
import p357o0OOOoO0.OooO0OO;
import p359o0OOOoo0.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final HashMap f42898OooO = new HashMap();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static OooO0o f42899OooOO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Context f42902OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO f42903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HeadsetBroadcastReceiver f42904OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public BluetoothHeadsetBroadcastReceiver f42906OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42900OooO00o = OooO0o.class.getSimpleName();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f42901OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f42905OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Handler f42907OooO0oo = new Handler(Looper.getMainLooper());

    public static OooO0o OooO0O0() {
        if (f42899OooOO0 == null) {
            synchronized (OooO0o.class) {
                if (f42899OooOO0 == null) {
                    f42899OooOO0 = new OooO0o();
                }
            }
        }
        return f42899OooOO0;
    }

    public final synchronized OooO OooO00o() {
        HashMap map = f42898OooO;
        OooO oooO = (OooO) map.get(Integer.valueOf(this.f42905OooO0o0));
        this.f42903OooO0Oo = oooO;
        if (oooO == null) {
            int i = this.f42905OooO0o0;
            if (i == 0 || i != 1) {
                this.f42903OooO0Oo = new p351o0OOOo.OooO0OO();
            } else {
                this.f42903OooO0Oo = new OooO();
            }
            this.f42903OooO0Oo.OooO00o(this.f42902OooO0OO, this.f42901OooO0O0);
            map.put(Integer.valueOf(this.f42905OooO0o0), this.f42903OooO0Oo);
        }
        o0000O0O.OooO0Oo(this.f42900OooO00o, "audioChatEngine[" + this.f42905OooO0o0 + "]:" + this.f42903OooO0Oo.getSdkVersion());
        return this.f42903OooO0Oo;
    }

    public final void OooO0OO(boolean z) {
        o0000O0O.OooO0o0(2, "====== 耳机状态 ======" + z);
        this.f42907OooO0oo.postDelayed(new OooO0OO(this, z), 100L);
    }
}
