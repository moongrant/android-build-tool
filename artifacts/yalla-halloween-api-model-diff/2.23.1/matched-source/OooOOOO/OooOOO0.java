package OooOOOO;

import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOo0.o0ooOOo;
import android.app.Dialog;
import android.hardware.camera2.CameraDevice;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.share.bean.ShareResponse;
import kotlin.jvm.internal.Intrinsics;
import p023Oooo00o.oO0O0OoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f194OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f195OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f196OooO0o0;

    public /* synthetic */ OooOOO0(int i, Object obj, Object obj2) {
        this.f194OooO0Oo = i;
        this.f196OooO0o0 = obj;
        this.f195OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f194OooO0Oo;
        Object obj = this.f195OooO0o;
        Object obj2 = this.f196OooO0o0;
        switch (i) {
            case 0:
                BaseResp response = (BaseResp) obj2;
                o0ooOOo this$0 = (o0ooOOo) obj;
                Intrinsics.checkNotNullParameter(response, "$response");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(response instanceof ShareResponse)) {
                    ShareResponse shareResponseCreateShareResponse$default = ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -2002, null, 2, null);
                    if (this$0.isAdded()) {
                        Dialog dialog = this$0.f82OooO0oO;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        this$0.OooO0O0(shareResponseCreateShareResponse$default);
                        break;
                    }
                } else {
                    ShareResponse shareResponse = (ShareResponse) response;
                    if (this$0.isAdded()) {
                        Dialog dialog2 = this$0.f82OooO0oO;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        this$0.OooO0O0(shareResponse);
                        break;
                    }
                }
                break;
            default:
                ((oO0O0OoO.OooO0O0) obj2).f972OooO00o.onClosed((CameraDevice) obj);
                break;
        }
    }
}
