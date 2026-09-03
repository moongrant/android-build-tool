package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooOo;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooOo00;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.Oooo0;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.Oooo000;
import OooO0o.OooO00o;
import android.view.View;
import android.view.ViewStub;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.base.web.WebBrowser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f137OooO0O0;

    public o0O0O00(@NotNull o00Oo0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f137OooO0O0 = baseClient;
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new Runnable() { // from class: OooO0o0.oo0o0Oo
            @Override // java.lang.Runnable
            public final void run() {
                o0O0O00 this$0 = this.f147OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00Oo0.OooO00o oooO00o = this$0.f137OooO0O0.f134OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                o00Oo0 o00oo1 = this$0.f137OooO0O0;
                ViewStub viewStub = null;
                if (o00oo1.OooO0oO() == null) {
                    o00oo1.OooO0Oo(o00oo1.OooO00o(-2002, null));
                    return;
                }
                OooO00o oooO00o2 = o00oo1.f127OooO00o;
                ViewStub viewStub2 = oooO00o2.f115OooO0Oo;
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
                webBrowser.setOnInitErrorAction(new OooOo00(this$0));
                webBrowser.setOnCloseClickAction(new OooOo(this$0));
                webBrowser.setErrorHandler(Oooo000.f54OooO0Oo);
                webBrowser.setJumpOutsideHandler(new Oooo0(this$0));
                ((p007OooOOOo.OooOo00) IEnv.INSTANCE.impl()).getClass();
                p007OooOOOo.OooOo00.f199OooO0O0.getClass();
                webBrowser.loadUrl("https://www.yalla.chat");
                oooO00o2.f116OooO0o0 = webBrowser;
            }
        });
    }
}
