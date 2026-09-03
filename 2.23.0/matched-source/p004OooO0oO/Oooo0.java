package p004OooO0oO;

import android.util.Log;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.o00O0;
import androidx.camera.video.OooOOOO;
import androidx.camera.video.VideoOutput;
import com.google.gson.JsonSyntaxException;
import com.yallatech.support.platform.base.bean.BridgeBean;
import com.yallatech.support.platform.base.bean.BridgeFunction;
import com.yallatech.support.platform.base.bean.NativeFuncInvokeError;
import com.yallatech.support.platform.base.web.WebBrowser;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p037OoooOo0.o00O0000;
import p040Ooooo00.OooO0o;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Object f151OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f152OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f153OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f154OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f155OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Object f156OooO0oo;

    public /* synthetic */ Oooo0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f152OooO0Oo = i;
        this.f154OooO0o0 = obj;
        this.f153OooO0o = obj2;
        this.f155OooO0oO = obj3;
        this.f156OooO0oo = obj4;
        this.f151OooO = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        NativeFuncInvokeError nativeFuncInvokeError;
        WebBrowser.OooO0o oooO0o;
        int i = this.f152OooO0Oo;
        Object obj = this.f151OooO;
        Object obj2 = this.f156OooO0oo;
        Object obj3 = this.f155OooO0oO;
        Object obj4 = this.f153OooO0o;
        Object obj5 = this.f154OooO0o0;
        switch (i) {
            case 0:
                Method targetMethod = (Method) obj5;
                o00Oo0 targetInterface = (o00Oo0) obj4;
                BridgeBean bridgeBean = (BridgeBean) obj3;
                o00O0O this$0 = (o00O0O) obj2;
                BridgeFunction callback = (BridgeFunction) obj;
                Intrinsics.checkNotNullParameter(targetMethod, "$targetMethod");
                Intrinsics.checkNotNullParameter(targetInterface, "$targetInterface");
                Intrinsics.checkNotNullParameter(bridgeBean, "$bridgeBean");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                try {
                    nativeFuncInvokeError = !Intrinsics.areEqual(targetMethod.invoke(targetInterface, bridgeBean.getParams()), Boolean.TRUE) ? new NativeFuncInvokeError(null, 3, NativeFuncInvokeError.code_3_msg, 1, null) : null;
                } catch (Throwable th) {
                    if (th instanceof JsonSyntaxException) {
                        th.printStackTrace();
                        String msg = Intrinsics.stringPlus("Json parse failed! \n", Unit.INSTANCE);
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        if (o000O.f56902OooO0O0) {
                            Log.e(o000O.f56901OooO00o, msg);
                        }
                        str = "Json parse failed!";
                    } else {
                        str = NativeFuncInvokeError.code_3_msg;
                    }
                    nativeFuncInvokeError = new NativeFuncInvokeError(null, 3, str, 1, null);
                }
                this$0.OooO00o(callback.getFunctionID(), nativeFuncInvokeError);
                if (nativeFuncInvokeError != null && (oooO0o = this$0.f160OooO0OO) != null) {
                    oooO0o.invoke(nativeFuncInvokeError.getMessage() + "\n BridgeBean = " + bridgeBean);
                }
                break;
            default:
                OooOOOO oooOOOO = (OooOOOO) obj5;
                o00O0000 o00o0001 = (o00O0000) obj4;
                CameraInternal cameraInternal = (CameraInternal) obj3;
                OooO0o oooO0o2 = (OooO0o) obj2;
                Timebase timebase = (Timebase) obj;
                OooOOOO.OooO0OO oooO0OO = OooOOOO.f4001OooOoOO;
                if (cameraInternal == oooOOOO.OooO0OO()) {
                    oooOOOO.f4009OooOOoo = o00o0001.OooO0OO(cameraInternal);
                    ((VideoOutput) ((o00O0) oooO0o2.getConfig()).OooO0O0(OooO0o.f1758Oooo000)).OooO00o(oooOOOO.f4009OooOOoo, timebase);
                    oooOOOO.Oooo0o0();
                }
                break;
        }
    }
}
