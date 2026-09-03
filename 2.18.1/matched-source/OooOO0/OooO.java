package OooOO0;

import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo.OooOO0O;
import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo.OooOOO;
import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo.OooOOO0;
import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo.OooOOOO;
import android.view.View;
import android.view.ViewStub;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.base.web.WebBrowser;
import com.yallatech.support.platform.login.bean.AuthResponse;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p003OooO0Oo.OooOo00;
import p310o0O0o0oo.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f143Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f144Oooo0oO;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f143Oooo0o = i;
        this.f144Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewStub viewStub = null;
        switch (this.f143Oooo0o) {
            case 0:
                OooOO0 this$0 = (OooOO0) this.f144Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooOo00.OooO00o oooO00o = this$0.f150OooO0O0.f112OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                if (this$0.f150OooO0O0.OooO0oO() == null) {
                    this$0.f150OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, null, 5));
                } else {
                    OooO0O0 oooO0O0OooO = this$0.f150OooO0O0.OooO0oO();
                    Intrinsics.checkNotNull(oooO0O0OooO);
                    ViewStub viewStub2 = this$0.f150OooO0O0.f145OooO.f134Oooo0o;
                    if (viewStub2 != null) {
                        viewStub = viewStub2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("webViewStub");
                    }
                    View viewInflate = viewStub.inflate();
                    Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type com.yallatech.support.platform.base.web.WebBrowser");
                    WebBrowser webBrowser = (WebBrowser) viewInflate;
                    webBrowser.setOnInitErrorAction(new OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo.OooO(this$0));
                    webBrowser.setOnCloseClickAction(new OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo.OooOO0(this$0));
                    webBrowser.setErrorHandler(OooOO0O.f52Oooo0o);
                    webBrowser.addJavaBridge(new p007OooOO0o.OooO0O0(oooO0O0OooO, webBrowser, new OooOOO0(oooO0O0OooO, this$0), new OooOOO(this$0), new OooOOOO(this$0)));
                    Objects.requireNonNull((OooOOOO.OooO00o) IEnv.INSTANCE.impl());
                    Objects.requireNonNull(OooOOOO.OooO00o.f176OooO0O0);
                    webBrowser.loadUrl("https://api.open.yalla.chat");
                    this$0.f150OooO0O0.f145OooO.f135Oooo0oO = webBrowser;
                }
                break;
            case 1:
                DeviceAuthDialog.m223schedulePoll$lambda3((DeviceAuthDialog) this.f144Oooo0oO);
                break;
            case 2:
                ((DefaultDrmSession) this.f144Oooo0oO).OooO0O0(null);
                break;
            case 3:
                o00O0OO0 o00o0oo1 = (o00O0OO0) this.f144Oooo0oO;
                Map<String, String> map = o00O0OO0.f36364o0Oo0oo;
                o00o0oo1.OooOoO0();
                break;
            default:
                UserInfoEditActivity this$1 = (UserInfoEditActivity) this.f144Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo00o();
                this$1.OooOooo().f50493OooO0O0.requestLayout();
                break;
        }
    }
}
