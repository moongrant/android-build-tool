package p187o00o00oo;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O00 extends WebChromeClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OO0O0 f38709OooO00o;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@Nullable WebView webView, int i) {
        super.onProgressChanged(webView, i);
        o00OO0O0 o00oo0o1 = this.f38709OooO00o;
        o00OO0O0 o00oo0o2 = null;
        if (o00oo0o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            o00oo0o1 = null;
        }
        if (o00oo0o1.OooO00o() instanceof o00O0O0O.OooO00o) {
            return;
        }
        o00OO0O0 o00oo0o3 = this.f38709OooO00o;
        if (o00oo0o3 != null) {
            o00oo0o2 = o00oo0o3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("state");
        }
        o00O0O0O.OooO0OO oooO0OO = new o00O0O0O.OooO0OO(i / 100.0f);
        o00oo0o2.getClass();
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        o00oo0o2.f38752OooO0OO.setValue(oooO0OO);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(@Nullable WebView webView, @Nullable Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        o00OO0O0 o00oo0o1 = this.f38709OooO00o;
        if (o00oo0o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            o00oo0o1 = null;
        }
        o00oo0o1.f38755OooO0o0.setValue(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
        super.onReceivedTitle(webView, str);
        o00OO0O0 o00oo0o1 = this.f38709OooO00o;
        if (o00oo0o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("state");
            o00oo0o1 = null;
        }
        o00oo0o1.f38753OooO0Oo.setValue(str);
    }
}
