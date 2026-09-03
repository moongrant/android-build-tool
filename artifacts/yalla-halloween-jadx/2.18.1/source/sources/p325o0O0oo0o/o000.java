package p325o0O0oo0o;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000 extends WebChromeClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000O0O0 f36921OooO00o;

    @NotNull
    public final o000O0O0 OooO00o() {
        o000O0O0 o000o0o1 = this.f36921OooO00o;
        if (o000o0o1 != null) {
            return o000o0o1;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE);
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@Nullable WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (OooO00o().OooO0O0() instanceof o000O0o.OooO00o) {
            return;
        }
        OooO00o().OooO0OO(new o000O0o.OooO0OO(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(@Nullable WebView webView, @Nullable Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        OooO00o().f36956OooO0Oo.setValue(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
        super.onReceivedTitle(webView, str);
        OooO00o().f36955OooO0OO.setValue(str);
    }
}
