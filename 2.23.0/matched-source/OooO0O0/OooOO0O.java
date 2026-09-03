package OooO0O0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.os.Looper;
import androidx.camera.video.OooOO0O;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p023Oooo00o.oO00O0o;
import p028Oooo0oO.o00O0O0;
import p044OooooOo.o0O00oO0;
import p044OooooOo.o0O0O0O;
import p045Oooooo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f98OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f99OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f100OooO0o0;

    public /* synthetic */ OooOO0O(int i, Object obj, Object obj2) {
        this.f98OooO0Oo = i;
        this.f100OooO0o0 = obj;
        this.f99OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        int i = this.f98OooO0Oo;
        Object obj = this.f99OooO0o;
        Object obj2 = this.f100OooO0o0;
        switch (i) {
            case 0:
                OooOOO0 this$0 = (OooOOO0) obj2;
                OooOOO data = (OooOOO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(data, "$data");
                o0OoOo0.OooO00o oooO00o = this$0.f107OooO0Oo;
                if (oooO00o != null) {
                    Bundle bundle = data.f103OooO0OO;
                    if (bundle == null) {
                        pair = null;
                    } else {
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        String string = bundle.getString("auth_sdk_version");
                        if (string == null) {
                            string = "";
                        }
                        pair = new Pair(string, Integer.valueOf(bundle.getInt("auth_service_version", -1)));
                    }
                    if (pair == null) {
                        pair = new Pair("", -1);
                    }
                    String str = (String) pair.component1();
                    ((Number) pair.component2()).intValue();
                    OooOo00 oooOo00 = OooOo00.f109OooO0O0;
                    oooOo00.getClass();
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    oooOo00.f95OooO00o = str;
                    oooO00o.invoke(oooOo00);
                    break;
                }
                break;
            case 1:
                ((oO00O0o.OooO0O0) obj2).f957OooO00o.onClosed((CameraDevice) obj);
                break;
            case 2:
                final o00O0O o00o0o2 = (o00O0O) obj;
                ((androidx.camera.video.OooOO0O) obj2).f3921OooO0OO.execute(new Runnable() { // from class: OoooOoo.o00O00o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o3 = (o00O0O) o00o0o2;
                        o00O0O0.OooO00o("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                        if (o0O0O0O.OooO00o(o0O00oO0.class) != null) {
                            OooOO0O.OooOOOo(o00o0o3);
                        }
                    }
                });
                break;
            default:
                DefaultDrmSessionManager.OooO0OO oooO0OO = (DefaultDrmSessionManager.OooO0OO) obj2;
                OooOo oooOo = (OooOo) obj;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f11731OooOOOo != 0 && !oooO0OO.f11746OooO0Oo) {
                    Looper looper = defaultDrmSessionManager.f11737OooOo00;
                    looper.getClass();
                    oooO0OO.f11745OooO0OO = defaultDrmSessionManager.OooO0o(looper, oooO0OO.f11744OooO0O0, oooOo, false);
                    defaultDrmSessionManager.f11728OooOOO.add(oooO0OO);
                    break;
                }
                break;
        }
    }
}
