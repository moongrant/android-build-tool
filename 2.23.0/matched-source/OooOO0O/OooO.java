package OooOO0O;

import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOO0O;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOO;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOO0;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOOO;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.material.ripple.RippleHostView;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.base.web.WebBrowser;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.jvm.internal.Intrinsics;
import p003OooO0o0.o00Oo0;
import p007OooOOOo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f170OooO0o0;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f169OooO0Oo = i;
        this.f170OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f169OooO0Oo;
        Object obj = this.f170OooO0o0;
        switch (i) {
            case 0:
                OooOO0 this$0 = (OooOO0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00Oo0.OooO00o oooO00o = this$0.f177OooO0O0.f136OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                OooO00o oooO00o2 = this$0.f177OooO0O0;
                ViewStub viewStub = null;
                if (oooO00o2.OooO0oO() == null) {
                    oooO00o2.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, null, 5));
                    return;
                }
                OooO0O0 oooO0O0OooO = oooO00o2.OooO0oO();
                Intrinsics.checkNotNull(oooO0O0OooO);
                OooO0o.OooO00o oooO00o3 = oooO00o2.f171OooO;
                ViewStub viewStub2 = oooO00o3.f116OooO0Oo;
                if (viewStub2 != null) {
                    viewStub = viewStub2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("webViewStub");
                }
                View viewInflate = viewStub.inflate();
                if (viewInflate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.base.web.WebBrowser");
                }
                WebBrowser webBrowser = (WebBrowser) viewInflate;
                webBrowser.setOnInitErrorAction(new OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooO(this$0));
                webBrowser.setOnCloseClickAction(new OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOO0(this$0));
                webBrowser.setErrorHandler(OooOO0O.f74OooO0Oo);
                webBrowser.addJavaBridge(new OooOOO0.OooO00o(oooO0O0OooO, webBrowser, new OooOOO0(oooO0O0OooO, this$0), new OooOOO(this$0), new OooOOOO(this$0)));
                ((OooOo00) IEnv.INSTANCE.impl()).getClass();
                OooOo00.f200OooO0O0.getClass();
                webBrowser.loadUrl("https://api.open.yalla.chat");
                oooO00o3.f117OooO0o0 = webBrowser;
                return;
            default:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                return;
        }
    }
}
