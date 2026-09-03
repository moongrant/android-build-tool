package p231o00oOoO;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000000 extends WebChromeClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0000O0O f39835OooO00o;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@Nullable WebView webView, int i) {
        super.onProgressChanged(webView, i);
        o0000O0O o0000o0o2 = this.f39835OooO00o;
        o0000O0O o0000o0o3 = null;
        if (o0000o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            o0000o0o2 = null;
        }
        if (o0000o0o2.OooO00o() instanceof o00000.OooO00o) {
            return;
        }
        o0000O0O o0000o0o4 = this.f39835OooO00o;
        if (o0000o0o4 != null) {
            o0000o0o3 = o0000o0o4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("state");
        }
        o00000.OooO0OO oooO0OO = new o00000.OooO0OO(i / 100.0f);
        o0000o0o3.getClass();
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        o0000o0o3.f39888OooO0OO.setValue(oooO0OO);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(@Nullable WebView webView, @Nullable Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        o0000O0O o0000o0o2 = this.f39835OooO00o;
        if (o0000o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            o0000o0o2 = null;
        }
        o0000o0o2.f39891OooO0o0.setValue(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
        super.onReceivedTitle(webView, str);
        o0000O0O o0000o0o2 = this.f39835OooO00o;
        if (o0000o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            o0000o0o2 = null;
        }
        o0000o0o2.f39889OooO0Oo.setValue(str);
    }
}
