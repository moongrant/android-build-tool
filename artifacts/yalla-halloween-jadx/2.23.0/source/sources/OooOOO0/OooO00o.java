package OooOOO0;

import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOO;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOO0;
import OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo.OooOOOO;
import OooOO0O.OooO0O0;
import android.webkit.JavascriptInterface;
import com.google.gson.OooOo00;
import com.google.gson.o000oOoO;
import com.google.gson.o00Oo0;
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
    public final OooO0O0 f178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function1<WebAuthCodeBean, Unit> f179OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<ErrorCodeBean, Unit> f181OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(@NotNull OooO0O0 request, @NotNull WebBrowser webBrowser, @NotNull OooOOO0 onAuthSuccess, @NotNull OooOOO onAuthRejected, @NotNull OooOOOO onAuthFailed) {
        super(webBrowser.getWebView());
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(webBrowser, "webBrowser");
        Intrinsics.checkNotNullParameter(onAuthSuccess, "onAuthSuccess");
        Intrinsics.checkNotNullParameter(onAuthRejected, "onAuthRejected");
        Intrinsics.checkNotNullParameter(onAuthFailed, "onAuthFailed");
        this.f178OooO0O0 = request;
        this.f179OooO0OO = onAuthSuccess;
        this.f180OooO0Oo = onAuthRejected;
        this.f181OooO0o0 = onAuthFailed;
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
        this.f181OooO0o0.invoke(errorCodeBean);
        return true;
    }

    @JavascriptInterface
    public final boolean getConfiguration(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "");
        if (completion == null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f178OooO0O0;
        AppStatus appStatus = oooO0O0.f144OooO0O0;
        String appName = appStatus == null ? null : appStatus.getAppName();
        o0OoOo0 o0oooo0 = new o0OoOo0();
        o0oooo0.OooO0Oo("applicationID", YCSDKOpenKit.getAppId$lib_release());
        o0oooo0.OooO0Oo("applicationName", appName);
        o0oooo0.OooO0Oo("redirectURI", YCSDKOpenKit.getDirectUrl$lib_release());
        OooOo00 oooOo00 = new OooOo00();
        AuthRequest authRequest = oooO0O0.f172OooO0OO;
        String[] scope = authRequest.getScope();
        if (scope != null) {
            int length = scope.length;
            for (int i = 0; i < length; i++) {
                String str = scope[i];
                oooOo00.f20602OooO0Oo.add(str == null ? o000oOoO.f20713OooO0Oo : new o00Oo0(str));
            }
        }
        o0oooo0.OooO0OO("scopes", oooOo00);
        o0oooo0.OooO0Oo("responseType", "code");
        o0oooo0.OooO0Oo("state", authRequest.getStateCode());
        OooO0OO(o0oooo0, completion.getCompletion().getFunctionID());
        return true;
    }

    @JavascriptInterface
    public final boolean rejectAuthorization(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f180OooO0Oo.invoke();
        return true;
    }

    @JavascriptInterface
    public final boolean setAuthorizationCode(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        WebAuthCodeBean webAuthCodeBean = (WebAuthCodeBean) Oooo000.OooO0O0(WebAuthCodeBean.class, data, "");
        if (webAuthCodeBean == null) {
            return false;
        }
        this.f179OooO0OO.invoke(webAuthCodeBean);
        return true;
    }
}
