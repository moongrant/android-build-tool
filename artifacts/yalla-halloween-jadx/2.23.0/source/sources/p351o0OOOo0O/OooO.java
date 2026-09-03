package p351o0OOOo0O;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import java.util.HashMap;
import p348o0OOOo.OooO0OO;
import p352o0OOOo0o.OooOO0O;
import p353o0OOOoO.o0OOO0o;
import p355o0OOOoOo.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final HashMap f43699OooO = new HashMap();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static OooO f43700OooOO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Context f43703OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOO0 f43704OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HeadsetBroadcastReceiver f43705OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public BluetoothHeadsetBroadcastReceiver f43707OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f43701OooO00o = OooO.class.getSimpleName();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f43702OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43706OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Handler f43708OooO0oo = new Handler(Looper.getMainLooper());

    public static OooO OooO0O0() {
        if (f43700OooOO0 == null) {
            synchronized (OooO.class) {
                if (f43700OooOO0 == null) {
                    f43700OooOO0 = new OooO();
                }
            }
        }
        return f43700OooOO0;
    }

    public final synchronized OooOO0 OooO00o() {
        HashMap map = f43699OooO;
        OooOO0 oooOO1 = (OooOO0) map.get(Integer.valueOf(this.f43706OooO0o0));
        this.f43704OooO0Oo = oooOO1;
        if (oooOO1 == null) {
            int i = this.f43706OooO0o0;
            if (i == 0 || i != 1) {
                this.f43704OooO0Oo = new OooOO0O();
            } else {
                this.f43704OooO0Oo = new o0ooOOo();
            }
            this.f43704OooO0Oo.OooO00o(this.f43703OooO0OO, this.f43702OooO0O0);
            map.put(Integer.valueOf(this.f43706OooO0o0), this.f43704OooO0Oo);
        }
        o0OOO0o.OooO0O0(this.f43701OooO00o, "audioChatEngine[" + this.f43706OooO0o0 + "]:" + this.f43704OooO0Oo.getSdkVersion());
        return this.f43704OooO0Oo;
    }

    public final void OooO0OO(boolean z) {
        o0OOO0o.OooO0OO(2, "====== 耳机状态 ======" + z);
        this.f43708OooO0oo.postDelayed(new OooO0o(this, z), 100L);
    }
}
