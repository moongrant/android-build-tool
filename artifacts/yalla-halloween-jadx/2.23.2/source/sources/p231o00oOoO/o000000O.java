package p231o00oOoO;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000000O extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0000O0O f39836OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0000O00 f39837OooO0O0;

    @NotNull
    public final o0000O0O OooO00o() {
        o0000O0O o0000o0o2 = this.f39836OooO00o;
        if (o0000o0o2 != null) {
            return o0000o0o2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state");
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        o0000O00 o0000o00 = this.f39837OooO0O0;
        o0000O00 o0000o01 = null;
        if (o0000o00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
            o0000o00 = null;
        }
        o0000o00.f39875OooO0OO.setValue(Boolean.valueOf(webView != null ? webView.canGoBack() : false));
        o0000O00 o0000o02 = this.f39837OooO0O0;
        if (o0000o02 != null) {
            o0000o01 = o0000o02;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
        }
        o0000o01.f39876OooO0Oo.setValue(Boolean.valueOf(webView != null ? webView.canGoForward() : false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        o0000O0O o0000o0oOooO00o = OooO00o();
        o00000.OooO00o oooO00o = o00000.OooO00o.f39832OooO00o;
        o0000o0oOooO00o.getClass();
        Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
        o0000o0oOooO00o.f39888OooO0OO.setValue(oooO00o);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        o0000O0O o0000o0oOooO00o = OooO00o();
        o00000.OooO0OO oooO0OO = new o00000.OooO0OO(0.0f);
        o0000o0oOooO00o.getClass();
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        o0000o0oOooO00o.f39888OooO0OO.setValue(oooO0OO);
        OooO00o().f39890OooO0o.clear();
        OooO00o().f39889OooO0Oo.setValue(null);
        OooO00o().f39891OooO0o0.setValue(null);
        OooO00o().f39886OooO00o.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            OooO00o().f39890OooO0o.add(new o00000O(webResourceRequest, webResourceError));
        }
    }
}
