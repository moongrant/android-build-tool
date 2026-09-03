package p029Oooo0oo;

import android.os.Looper;
import android.widget.Toast;
import androidx.camera.core.ImageCaptureException;
import com.code.android.util.o000O0;
import kotlin.jvm.internal.Intrinsics;
import p033OoooO0O.o00oO0o;
import p410o0Oo0oO.OooOo00;
import p417o0OoO0.o0OoOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0o00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1277OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1278OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1279OooO0o0;

    public /* synthetic */ o0O0o00O(int i, Object obj, Object obj2) {
        this.f1277OooO0Oo = i;
        this.f1279OooO0o0 = obj;
        this.f1278OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f1277OooO0Oo;
        boolean z = true;
        int i2 = 0;
        Object obj = this.f1278OooO0o;
        Object obj2 = this.f1279OooO0o0;
        switch (i) {
            case 0:
                o0O o0o = (o0O) obj2;
                o0O.OooO0O0 oooO0O0 = (o0O.OooO0O0) obj;
                o0o.getClass();
                o0OO000 o0oo000OooO0O0 = oooO0O0.OooO0O0();
                try {
                    if (oooO0O0.OooO0O0().f1285OooO00o != null) {
                        z = false;
                    }
                    if (z) {
                        o00oO0o.OooO0OO().execute(new o0O0o0(i2, o0oo000OooO0O0, o0o.OooO0O0(oooO0O0)));
                    } else {
                        o00oO0o.OooO0OO().execute(new o0oOo0O0(i2, o0oo000OooO0O0, o0o.OooO0OO(oooO0O0)));
                    }
                } catch (ImageCaptureException e) {
                    o00oO0o.OooO0OO().execute(new o0O0oo00(i2, o0oo000OooO0O0, e));
                    return;
                } catch (OutOfMemoryError e2) {
                    o00oO0o.OooO0OO().execute(new o0O0oo00(i2, o0oo000OooO0O0, new ImageCaptureException(e2, "Processing failed due to low memory.")));
                    return;
                } catch (RuntimeException e3) {
                    o00oO0o.OooO0OO().execute(new o0O0oo00(i2, o0oo000OooO0O0, new ImageCaptureException(e3, "Processing failed.")));
                    return;
                }
                break;
            default:
                String errorType = (String) obj2;
                Throwable e4 = (Throwable) obj;
                OooOo00 oooOo00 = OooOo00.f45226OooO00o;
                Intrinsics.checkNotNullParameter(errorType, "$errorType");
                Intrinsics.checkNotNullParameter(e4, "$e");
                try {
                    Looper.prepare();
                    Toast toastMakeText = Toast.makeText(o000O0.OooO00o(), errorType + ": " + o0OoOo0.OooO00o(e4), 1);
                    toastMakeText.setGravity(17, 0, 0);
                    toastMakeText.show();
                    Looper.loop();
                    OooOo00.f45232OooO0oO = true;
                } catch (Exception e5) {
                    OooOOO0.OooO00o(101, "CrashHandler", "handleException Toast error" + e5, null);
                    return;
                }
                break;
        }
    }
}
