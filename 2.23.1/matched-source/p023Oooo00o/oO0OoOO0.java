package p023Oooo00o;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Looper;
import android.widget.Toast;
import com.code.android.util.o000O00O;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOOo.OooOo00;
import p420o0Oo0ooO.c4;
import p425o0OoO0OO.o0000oo;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO0OoOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f982OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f983OooO0o0;

    public /* synthetic */ oO0OoOO0(int i, Object obj, Object obj2) {
        this.f981OooO0Oo = i;
        this.f983OooO0o0 = obj;
        this.f982OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f981OooO0Oo;
        Object obj = this.f982OooO0o;
        Object obj2 = this.f983OooO0o0;
        switch (i) {
            case 0:
                o.OooO0O0(((oO0000O.OooO0OO) obj2).f922OooO00o, (CameraCaptureSession) obj);
                break;
            case 1:
                OooOo00.OooO0O0 oooO0O0 = (OooOo00.OooO0O0) obj;
                try {
                    ((Runnable) obj2).run();
                } catch (Exception e) {
                    OooOo00.this.OooOO0O(e);
                }
                break;
            default:
                String errorType = (String) obj2;
                Throwable e2 = (Throwable) obj;
                c4 c4Var = c4.f46575OooO00o;
                Intrinsics.checkNotNullParameter(errorType, "$errorType");
                Intrinsics.checkNotNullParameter(e2, "$e");
                try {
                    Looper.prepare();
                    Toast toastMakeText = Toast.makeText(o000O00O.OooO00o(), errorType + ": " + o0000oo.OooO00o(e2), 1);
                    toastMakeText.setGravity(17, 0, 0);
                    toastMakeText.show();
                    Looper.loop();
                    c4.f46581OooO0oO = true;
                } catch (Exception e3) {
                    OooOOOO.OooO00o(101, "CrashHandler", "handleException Toast error" + e3, null);
                    return;
                }
                break;
        }
    }
}
