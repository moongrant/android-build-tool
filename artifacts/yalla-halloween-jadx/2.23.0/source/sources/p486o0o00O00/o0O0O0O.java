package p486o0o00O00;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends BaseWebView2.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48381OooO00o;

    public o0O0O0O(WebActivity webActivity) {
        this.f48381OooO00o = webActivity;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView2.OooO0o
    public final void OooO00o(@Nullable ValueCallback valueCallback) {
        WebActivity webActivity = this.f48381OooO00o;
        webActivity.f25585OooOOo = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        webActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 1);
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView2.OooO0o
    public final void OooO0O0(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        WebActivity webActivity = this.f48381OooO00o;
        BaseWebView2 baseWebView2 = webActivity.f25592OooOo0o;
        if (baseWebView2 != null) {
            baseWebView2.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }
        if (webActivity.f25587OooOOoo) {
            String url = webView != null ? webView.getUrl() : null;
            if (url == null || StringsKt.isBlank(url)) {
                return;
            }
            String url2 = webView != null ? webView.getUrl() : null;
            Intrinsics.checkNotNull(url2);
            if (StringsKt.Oooo00o(url2, o0000.OooO0OO(oO00OOo0.single_instagram_callback_url))) {
                String url3 = webView.getUrl();
                Intrinsics.checkNotNull(url3);
                webActivity.f25590OooOo00 = url3;
                webActivity.finish();
            }
        }
    }
}
