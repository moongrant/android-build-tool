package p487o0o00O;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends BaseWebView2.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48881OooO00o;

    public o0O00o00(WebActivity webActivity) {
        this.f48881OooO00o = webActivity;
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView2.OooO0o
    public final void OooO00o(@Nullable ValueCallback valueCallback) {
        WebActivity webActivity = this.f48881OooO00o;
        webActivity.f25131OooOOo = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        webActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 1);
    }

    @Override // com.yalla.yalla.ui.view.webView.BaseWebView2.OooO0o
    public final void OooO0O0(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        WebActivity webActivity = this.f48881OooO00o;
        BaseWebView2 baseWebView2 = webActivity.f25138OooOo0o;
        if (baseWebView2 != null) {
            baseWebView2.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }
        if (webActivity.f25133OooOOoo) {
            String url = webView != null ? webView.getUrl() : null;
            if (url == null || StringsKt.isBlank(url)) {
                return;
            }
            String url2 = webView != null ? webView.getUrl() : null;
            Intrinsics.checkNotNull(url2);
            if (StringsKt__StringsJVMKt.startsWith$default(url2, o0000.OooO0OO(o000000.single_instagram_callback_url), false, 2, null)) {
                String url3 = webView.getUrl();
                Intrinsics.checkNotNull(url3);
                webActivity.f25136OooOo00 = url3;
                webActivity.finish();
            }
        }
    }
}
