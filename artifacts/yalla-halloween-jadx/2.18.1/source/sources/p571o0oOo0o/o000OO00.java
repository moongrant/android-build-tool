package p571o0oOo0o;

import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 extends Lambda implements Function1<WebView, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f45492Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f45493Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f45494Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO00(Function1<? super WebView, Unit> function1, Function0<Unit> function0, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f45492Oooo0o = function1;
        this.f45493Oooo0oO = function0;
        this.f45494Oooo0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebView webView) {
        WebView it = webView;
        Intrinsics.checkNotNullParameter(it, "it");
        it.setBackgroundColor(0);
        this.f45492Oooo0o.invoke(it);
        it.setScrollBarStyle(33554432);
        it.setDrawingCacheEnabled(false);
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
        it.getSettings().setJavaScriptEnabled(true);
        it.addJavascriptInterface(new o000O(this.f45493Oooo0oO, it, this.f45494Oooo0oo), "Yalla");
        return Unit.INSTANCE;
    }
}
