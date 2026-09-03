package p445o0OoOo0o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;
import p441o0OoOo.o00Ooo;
import p447o0OoOoO0.oo0o0O0;
import p450o0OoOoo.o00;
import p452o0OoOooO.oO00000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOOo implements oo0o0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static Map<Integer, o0O0o000> f40246OooO = new HashMap();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static o0O0OOOo f40247OooOO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Context f40250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O0o000 f40251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HeadsetBroadcastReceiver f40252OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public BluetoothHeadsetBroadcastReceiver f40254OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40248OooO00o = o0O0OOOo.class.getSimpleName();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f40249OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40253OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Handler f40255OooO0oo = new Handler(Looper.getMainLooper());

    public static o0O0OOOo OooO0O0() {
        if (f40247OooOO0 == null) {
            synchronized (o0O0OOOo.class) {
                if (f40247OooOO0 == null) {
                    f40247OooOO0 = new o0O0OOOo();
                }
            }
        }
        return f40247OooOO0;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0OoOo0o.o0O0o000>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0OoOo0o.o0O0o000>] */
    public final synchronized o0O0o000 OooO00o() {
        if (this.f40250OooO0OO == null) {
            o00.OooO0OO(5, "必须先调用 initializeParameter()");
            return new oo0OOoo();
        }
        o0O0o000 o0o0o000 = (o0O0o000) f40246OooO.get(Integer.valueOf(this.f40253OooO0o0));
        this.f40251OooO0Oo = o0o0o000;
        if (o0o0o000 == null) {
            int i = this.f40253OooO0o0;
            if (i == 0) {
                this.f40251OooO0Oo = new o00Ooo();
            } else if (i != 1) {
                this.f40251OooO0Oo = new oo0OOoo();
            } else {
                this.f40251OooO0Oo = new oO00000o();
            }
            this.f40251OooO0Oo.OooO0oo(this.f40250OooO0OO, this.f40249OooO0O0);
            f40246OooO.put(Integer.valueOf(this.f40253OooO0o0), this.f40251OooO0Oo);
        }
        o00.OooO0O0(this.f40248OooO00o, "audioChatEngine[" + this.f40253OooO0o0 + "]:" + this.f40251OooO0Oo.OooOoO0());
        return this.f40251OooO0Oo;
    }

    public final void OooO0OO(boolean z) {
        o00.OooO0OO(2, "====== 耳机状态 ======" + z);
        this.f40255OooO0oo.postDelayed(new o0O0OOO0(this, z), 100L);
    }
}
