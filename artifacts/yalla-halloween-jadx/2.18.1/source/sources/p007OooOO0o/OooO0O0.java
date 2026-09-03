package p007OooOO0o;

import OooO0o.OooO00o;
import android.webkit.JavascriptInterface;
import com.facebook.internal.ServerProtocol;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.base.web.WebBrowser;
import com.yallatech.support.platform.login.bean.AppStatus;
import com.yallatech.support.platform.login.bean.ErrorCodeBean;
import com.yallatech.support.platform.login.bean.WebAuthCodeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p386o0OOoo0O.o00O00;
import p386o0OOoo0O.o00O00O;
import p386o0OOoo0O.o0O0ooO;
import p386o0OOoo0O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOO0.OooO0O0 f151OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function1<WebAuthCodeBean, Unit> f152OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function1<ErrorCodeBean, Unit> f154OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(@NotNull OooOO0.OooO0O0 request, @NotNull WebBrowser webBrowser, @NotNull Function1<? super WebAuthCodeBean, Unit> onAuthSuccess, @NotNull Function0<Unit> onAuthRejected, @NotNull Function1<? super ErrorCodeBean, Unit> onAuthFailed) {
        super(webBrowser.getWebView());
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(webBrowser, "webBrowser");
        Intrinsics.checkNotNullParameter(onAuthSuccess, "onAuthSuccess");
        Intrinsics.checkNotNullParameter(onAuthRejected, "onAuthRejected");
        Intrinsics.checkNotNullParameter(onAuthFailed, "onAuthFailed");
        this.f151OooO0O0 = request;
        this.f152OooO0OO = onAuthSuccess;
        this.f153OooO0Oo = onAuthRejected;
        this.f154OooO0o0 = onAuthFailed;
    }

    @Override // OooO0o.OooOO0
    @NotNull
    public final String OooO00o() {
        return "YLAuthBridge";
    }

    @JavascriptInterface
    public final boolean failToAuthorize(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ErrorCodeBean errorCodeBean = (ErrorCodeBean) OooO0O0(data, ErrorCodeBean.class, "");
        if (errorCodeBean == null) {
            return false;
        }
        this.f154OooO0o0.invoke(errorCodeBean);
        return true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @JavascriptInterface
    public final boolean getConfiguration(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "");
        if (completion == null) {
            return false;
        }
        AppStatus appStatus = this.f151OooO0O0.f117OooO0O0;
        String appName = appStatus == null ? null : appStatus.getAppName();
        o00O00O o00o00o2 = new o00O00O();
        o00o00o2.OooO0oO("applicationID", YCSDKOpenKit.getAppId$lib_release());
        o00o00o2.OooO0oO("applicationName", appName);
        o00o00o2.OooO0oO("redirectURI", YCSDKOpenKit.getDirectUrl$lib_release());
        o0O0ooO o0o0ooo = new o0O0ooO();
        String[] scope = this.f151OooO0O0.f146OooO0OO.getScope();
        if (scope != null) {
            int length = scope.length;
            for (int i = 0; i < length; i++) {
                String str = scope[i];
                o0o0ooo.f38886Oooo0o.add(str == null ? o00O00.f38884OooO00o : new oOO00O(str));
            }
        }
        o00o00o2.OooO0o0("scopes", o0o0ooo);
        o00o00o2.OooO0oO("responseType", "code");
        o00o00o2.OooO0oO(ServerProtocol.DIALOG_PARAM_STATE, this.f151OooO0O0.f146OooO0OO.getStateCode());
        OooO0OO(completion.getCompletion().getFunctionID(), o00o00o2);
        return true;
    }

    @JavascriptInterface
    public final boolean rejectAuthorization(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f153OooO0Oo.invoke();
        return true;
    }

    @JavascriptInterface
    public final boolean setAuthorizationCode(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        WebAuthCodeBean webAuthCodeBean = (WebAuthCodeBean) OooO0O0(data, WebAuthCodeBean.class, "");
        if (webAuthCodeBean == null) {
            return false;
        }
        this.f152OooO0OO.invoke(webAuthCodeBean);
        return true;
    }
}
