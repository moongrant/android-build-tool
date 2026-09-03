package p187o00o00oo;

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
public final class o00O0O0 extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OO0O0 f38707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00O f38708OooO0O0;

    @NotNull
    public final o00OO0O0 OooO00o() {
        o00OO0O0 o00oo0o1 = this.f38707OooO00o;
        if (o00oo0o1 != null) {
            return o00oo0o1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state");
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        o00O o00o2 = this.f38708OooO0O0;
        o00O o00o3 = null;
        if (o00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
            o00o2 = null;
        }
        o00o2.f38696OooO0OO.setValue(Boolean.valueOf(webView != null ? webView.canGoBack() : false));
        o00O o00o4 = this.f38708OooO0O0;
        if (o00o4 != null) {
            o00o3 = o00o4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
        }
        o00o3.f38697OooO0Oo.setValue(Boolean.valueOf(webView != null ? webView.canGoForward() : false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        o00OO0O0 o00oo0o0OooO00o = OooO00o();
        o00O0O0O.OooO00o oooO00o = o00O0O0O.OooO00o.f38710OooO00o;
        o00oo0o0OooO00o.getClass();
        Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
        o00oo0o0OooO00o.f38752OooO0OO.setValue(oooO00o);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        o00OO0O0 o00oo0o0OooO00o = OooO00o();
        o00O0O0O.OooO0OO oooO0OO = new o00O0O0O.OooO0OO(0.0f);
        o00oo0o0OooO00o.getClass();
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        o00oo0o0OooO00o.f38752OooO0OO.setValue(oooO0OO);
        OooO00o().f38754OooO0o.clear();
        OooO00o().f38753OooO0Oo.setValue(null);
        OooO00o().f38755OooO0o0.setValue(null);
        OooO00o().f38750OooO00o.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            OooO00o().f38754OooO0o.add(new oo0o0O0(webResourceRequest, webResourceError));
        }
    }
}
