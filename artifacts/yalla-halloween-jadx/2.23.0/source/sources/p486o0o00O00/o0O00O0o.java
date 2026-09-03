package p486o0o00O00;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function1<BaseWebView2, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48346OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f48347OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(WebActivity webActivity, o0O0o000 o0o0o000) {
        super(1);
        this.f48346OooO0Oo = webActivity;
        this.f48347OooO0o0 = o0o0o000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BaseWebView2 baseWebView2) {
        BaseWebView2 it = baseWebView2;
        Intrinsics.checkNotNullParameter(it, "it");
        WebActivity webActivity = this.f48346OooO0Oo;
        webActivity.f25592OooOo0o = it;
        if (it != null) {
            it.setOnReceivedTitle(new o0O00oO0(webActivity));
        }
        BaseWebView2 baseWebView3 = webActivity.f25592OooOo0o;
        if (baseWebView3 != null) {
            baseWebView3.setWebClientBridge(new o0O0O0O(webActivity));
        }
        BaseWebView2 baseWebView4 = webActivity.f25592OooOo0o;
        if (baseWebView4 != null) {
            baseWebView4.addJavascriptInterface(new o0O00o00(webActivity, this.f48347OooO0o0), "Yalla");
        }
        WebPageInfo webPageInfo = webActivity.f25591OooOo0O;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        it.loadUrl(webPageInfo.OooO0O0(true));
        return Unit.INSTANCE;
    }
}
