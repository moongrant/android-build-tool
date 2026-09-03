package p593o0oOooo0;

import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00oO0 extends Lambda implements Function1<WebView, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0O00oO0 f47467Oooo0o = new o0O00oO0();

    public o0O00oO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebView webView) {
        WebView it = webView;
        Intrinsics.checkNotNullParameter(it, "it");
        it.setScrollBarStyle(33554432);
        it.setDrawingCacheEnabled(false);
        it.getSettings().setJavaScriptEnabled(true);
        it.getSettings().setPluginState(WebSettings.PluginState.ON);
        it.getSettings().setMediaPlaybackRequiresUserGesture(false);
        it.getSettings().setAllowFileAccess(true);
        it.getSettings().setSupportZoom(false);
        it.getSettings().setCacheMode(2);
        it.getSettings().setDomStorageEnabled(true);
        it.getSettings().setUseWideViewPort(true);
        it.getSettings().setLoadWithOverviewMode(true);
        it.getSettings().setSavePassword(false);
        it.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        it.getSettings().setMixedContentMode(0);
        it.removeJavascriptInterface("searchBoxJavaBridge_");
        it.getSettings().setAllowFileAccessFromFileURLs(false);
        return Unit.INSTANCE;
    }
}
