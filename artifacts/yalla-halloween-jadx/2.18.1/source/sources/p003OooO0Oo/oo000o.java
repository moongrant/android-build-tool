package p003OooO0Oo;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooOo;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooOo00;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.Oooo0;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.Oooo000;
import OooOOOO.OooO00o;
import android.view.View;
import android.view.ViewStub;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.base.web.WebBrowser;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOo00 f124OooO0O0;

    public oo000o(@NotNull OooOo00 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f124OooO0O0 = baseClient;
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new Runnable() { // from class: OooO0Oo.o00Ooo
            @Override // java.lang.Runnable
            public final void run() {
                oo000o this$0 = this.f119Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo00.OooO00o oooO00o = this$0.f124OooO0O0.f112OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                ViewStub viewStub = null;
                if (this$0.f124OooO0O0.OooO0oO() == null) {
                    OooOo00 oooOo00 = this$0.f124OooO0O0;
                    oooOo00.OooO0Oo(oooOo00.OooO00o(-2002, null));
                    return;
                }
                ViewStub viewStub2 = this$0.f124OooO0O0.f105OooO00o.f134Oooo0o;
                if (viewStub2 != null) {
                    viewStub = viewStub2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("webViewStub");
                }
                View viewInflate = viewStub.inflate();
                Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type com.yallatech.support.platform.base.web.WebBrowser");
                WebBrowser webBrowser = (WebBrowser) viewInflate;
                webBrowser.setOnInitErrorAction(new OooOo00(this$0));
                webBrowser.setOnCloseClickAction(new OooOo(this$0));
                webBrowser.setErrorHandler(Oooo000.f29Oooo0o);
                webBrowser.setJumpOutsideHandler(new Oooo0(this$0));
                Objects.requireNonNull((OooO00o) IEnv.INSTANCE.impl());
                Objects.requireNonNull(OooO00o.f176OooO0O0);
                webBrowser.loadUrl("https://www.yalla.chat");
                this$0.f124OooO0O0.f105OooO00o.f135Oooo0oO = webBrowser;
            }
        });
    }
}
