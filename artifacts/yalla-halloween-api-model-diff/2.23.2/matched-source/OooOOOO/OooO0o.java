package OooOOOO;

import android.hardware.camera2.CameraCaptureSession;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.share.bean.ShareResponse;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.OooOo;
import o000OOO.o0OoOo0;
import p023Oooo00o.oO0000O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f186OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f187OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f188OooO0o0;

    public /* synthetic */ OooO0o(int i, Object obj, Object obj2) {
        this.f186OooO0Oo = i;
        this.f188OooO0o0 = obj;
        this.f187OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f186OooO0Oo;
        Object obj = this.f187OooO0o;
        Object obj2 = this.f188OooO0o0;
        switch (i) {
            case 0:
                OooO this$0 = (OooO) obj2;
                OooO0OO this_apply = (OooO0OO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                try {
                    this$0.OooO0o(this_apply.f185OooO0OO);
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    OooOOOO oooOOOO = this$0.f178OooO0O0;
                    oooOOOO.getClass();
                    oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.UnknownHost, message));
                    return;
                }
                break;
            case 1:
                ((oO0000O.OooO0OO) obj2).f920OooO00o.onReady((CameraCaptureSession) obj);
                break;
            case 2:
                androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = (androidx.media3.exoplayer.audio.OooO0O0.OooO00o) obj2;
                oooO00o.getClass();
                int i2 = o00.f34910OooO00o;
                oooO00o.f7530OooO0O0.OooO0oo((OooOo) obj);
                break;
            default:
                o0OoOo0.OooO00o oooO00o2 = (o0OoOo0.OooO00o) obj2;
                oooO00o2.getClass();
                int i3 = o00.f34910OooO00o;
                oooO00o2.f34594OooO0O0.OooO0O0((String) obj);
                break;
        }
    }
}
