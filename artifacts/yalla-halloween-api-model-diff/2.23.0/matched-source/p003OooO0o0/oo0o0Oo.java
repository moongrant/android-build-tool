package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooOo;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.OooOo00;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.Oooo0;
import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.Oooo000;
import OooO0o.OooO00o;
import android.view.View;
import android.view.ViewStub;
import androidx.camera.video.OooOOOO;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.base.web.WebBrowser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f149OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f150OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f149OooO0Oo = i;
        this.f150OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f149OooO0Oo;
        ViewStub viewStub = null;
        Object obj = this.f150OooO0o0;
        switch (i) {
            case 0:
                o000OOo this$0 = (o000OOo) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00Oo0.OooO00o oooO00o = this$0.f126OooO0O0.f136OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                o00Oo0 o00oo1 = this$0.f126OooO0O0;
                if (o00oo1.OooO0oO() == null) {
                    o00oo1.OooO0Oo(o00oo1.OooO00o(-2002, null));
                    return;
                }
                OooO00o oooO00o2 = o00oo1.f129OooO00o;
                ViewStub viewStub2 = oooO00o2.f116OooO0Oo;
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
                p007OooOOOo.OooOo00.f200OooO0O0.getClass();
                webBrowser.loadUrl("https://www.yalla.chat");
                oooO00o2.f117OooO0o0 = webBrowser;
                return;
            case 1:
                OooOOOO.OooO0OO oooO0OO = OooOOOO.f4001OooOoOO;
                ((OooOOOO) obj).OooOOo0();
                return;
            default:
                o0O0O00.OooO0O0(obj);
                Intrinsics.checkNotNullParameter(null, "this$0");
                throw null;
        }
    }
}
