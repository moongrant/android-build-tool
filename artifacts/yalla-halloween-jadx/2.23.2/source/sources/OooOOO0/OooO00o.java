package OooOOO0;

import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOO;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOO0;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOOO;
import OooOO0O.OooO0O0;
import android.webkit.JavascriptInterface;
import com.google.gson.OooOo00;
import com.google.gson.o00O0O;
import com.google.gson.o00Ooo;
import com.google.gson.o0OoOo0;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.base.web.WebBrowser;
import com.yallatech.support.platform.login.bean.AppStatus;
import com.yallatech.support.platform.login.bean.AuthRequest;
import com.yallatech.support.platform.login.bean.ErrorCodeBean;
import com.yallatech.support.platform.login.bean.WebAuthCodeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f174OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function1<WebAuthCodeBean, Unit> f175OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<ErrorCodeBean, Unit> f177OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(@NotNull OooO0O0 request, @NotNull WebBrowser webBrowser, @NotNull OooOOO0 onAuthSuccess, @NotNull OooOOO onAuthRejected, @NotNull OooOOOO onAuthFailed) {
        super(webBrowser.getWebView());
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(webBrowser, "webBrowser");
        Intrinsics.checkNotNullParameter(onAuthSuccess, "onAuthSuccess");
        Intrinsics.checkNotNullParameter(onAuthRejected, "onAuthRejected");
        Intrinsics.checkNotNullParameter(onAuthFailed, "onAuthFailed");
        this.f174OooO0O0 = request;
        this.f175OooO0OO = onAuthSuccess;
        this.f176OooO0Oo = onAuthRejected;
        this.f177OooO0o0 = onAuthFailed;
    }

    @Override // p004OooO0oO.o00Oo0
    @NotNull
    public final String OooO00o() {
        return "YLAuthBridge";
    }

    @JavascriptInterface
    public final boolean failToAuthorize(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ErrorCodeBean errorCodeBean = (ErrorCodeBean) Oooo000.OooO0O0(ErrorCodeBean.class, data, "");
        if (errorCodeBean == null) {
            return false;
        }
        this.f177OooO0o0.invoke(errorCodeBean);
        return true;
    }

    @JavascriptInterface
    public final boolean getConfiguration(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "");
        if (completion == null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f174OooO0O0;
        AppStatus appStatus = oooO0O0.f142OooO0O0;
        String appName = appStatus == null ? null : appStatus.getAppName();
        o00O0O o00o0o2 = new o00O0O();
        o00o0o2.OooO0Oo("applicationID", YCSDKOpenKit.getAppId$lib_release());
        o00o0o2.OooO0Oo("applicationName", appName);
        o00o0o2.OooO0Oo("redirectURI", YCSDKOpenKit.getDirectUrl$lib_release());
        OooOo00 oooOo00 = new OooOo00();
        AuthRequest authRequest = oooO0O0.f168OooO0OO;
        String[] scope = authRequest.getScope();
        if (scope != null) {
            int length = scope.length;
            for (int i = 0; i < length; i++) {
                String str = scope[i];
                oooOo00.f20129OooO0Oo.add(str == null ? o0OoOo0.f20242OooO0Oo : new o00Ooo(str));
            }
        }
        o00o0o2.OooO0OO("scopes", oooOo00);
        o00o0o2.OooO0Oo("responseType", "code");
        o00o0o2.OooO0Oo("state", authRequest.getStateCode());
        OooO0OO(o00o0o2, completion.getCompletion().getFunctionID());
        return true;
    }

    @JavascriptInterface
    public final boolean rejectAuthorization(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f176OooO0Oo.invoke();
        return true;
    }

    @JavascriptInterface
    public final boolean setAuthorizationCode(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        WebAuthCodeBean webAuthCodeBean = (WebAuthCodeBean) Oooo000.OooO0O0(WebAuthCodeBean.class, data, "");
        if (webAuthCodeBean == null) {
            return false;
        }
        this.f175OooO0OO.invoke(webAuthCodeBean);
        return true;
    }
}
