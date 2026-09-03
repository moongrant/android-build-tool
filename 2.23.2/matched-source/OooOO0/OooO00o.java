package OooOO0;

import android.hardware.camera2.CameraCaptureSession;
import com.facebook.appevents.codeless.ViewIndexer;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.OooOo;
import o000OOO.o0OoOo0;
import o0O0OOOo.OooOo00;
import p023Oooo00o.oO0000O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f163OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f161OooO0Oo = i;
        this.f163OooO0o0 = obj;
        this.f162OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.f161OooO0Oo;
        Object obj = this.f162OooO0o;
        Object obj2 = this.f163OooO0o0;
        switch (i) {
            case 0:
                OooO this$0 = (OooO) obj2;
                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                return;
            case 1:
                ((oO0000O.OooO0OO) obj2).f920OooO00o.onConfigured((CameraCaptureSession) obj);
                return;
            case 2:
                o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) obj2;
                oooO00o.getClass();
                int i2 = o00.f34910OooO00o;
                oooO00o.f34594OooO0O0.OooOO0o((OooOo) obj);
                return;
            case 3:
                ViewIndexer.m4085sendToServer$lambda1((String) obj2, (ViewIndexer) obj);
                return;
            default:
                OooOo00.OooO0O0 oooO0O0 = (OooOo00.OooO0O0) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } catch (Exception e) {
                    OooOo00.this.OooOO0O(e);
                    throw e;
                }
        }
    }
}
