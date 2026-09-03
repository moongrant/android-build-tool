package p325o0O0oo0o;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000O000 extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000O0O0 f36926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000O0Oo f36927OooO0O0;

    @NotNull
    public final o000O0O0 OooO00o() {
        o000O0O0 o000o0o1 = this.f36926OooO00o;
        if (o000o0o1 != null) {
            return o000o0o1;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ServerProtocol.DIALOG_PARAM_STATE);
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null) {
            String str2 = null;
            if (StringsKt.OooOoOO(str, "data:text/html")) {
                return;
            }
            o000Oo0 o000oo0OooO00o = OooO00o().OooO00o();
            Objects.requireNonNull(o000oo0OooO00o);
            if (o000oo0OooO00o instanceof o000Oo0.OooO0O0) {
                str2 = ((o000Oo0.OooO0O0) o000oo0OooO00o).f36974OooO00o;
            } else {
                if (!(o000oo0OooO00o instanceof o000Oo0.OooO00o)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (Intrinsics.areEqual(str2, str)) {
                return;
            }
            o000O0O0 o000o0o0OooO00o = OooO00o();
            o000Oo0.OooO0O0 OooO0o1 = o000O00O.OooO0o0(OooO00o().OooO00o(), str);
            Objects.requireNonNull(o000o0o0OooO00o);
            Intrinsics.checkNotNullParameter(OooO0o1, "<set-?>");
            o000o0o0OooO00o.f36953OooO00o.setValue(OooO0o1);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        OooO00o().OooO0OO(o000O0o.OooO00o.f36969OooO00o);
        o000O0Oo o000o0oo2 = this.f36927OooO0O0;
        o000O0Oo o000o0oo3 = null;
        if (o000o0oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
            o000o0oo2 = null;
        }
        o000o0oo2.f36960OooO0OO.setValue(Boolean.valueOf(webView != null ? webView.canGoBack() : false));
        o000O0Oo o000o0oo4 = this.f36927OooO0O0;
        if (o000o0oo4 != null) {
            o000o0oo3 = o000o0oo4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
        }
        o000o0oo3.f36961OooO0Oo.setValue(Boolean.valueOf(webView != null ? webView.canGoForward() : false));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        OooO00o().OooO0OO(new o000O0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        OooO00o().f36957OooO0o0.clear();
        OooO00o().f36955OooO0OO.setValue(null);
        OooO00o().f36956OooO0Oo.setValue(null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            OooO00o().f36957OooO0o0.add(new o000O00(webResourceRequest, webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null) {
            return true;
        }
        o000O0O0 o000o0o0OooO00o = OooO00o();
        o000Oo0 o000oo0OooO00o = OooO00o().OooO00o();
        String string = webResourceRequest.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "it.url.toString()");
        o000Oo0.OooO0O0 OooO0o1 = o000O00O.OooO0o0(o000oo0OooO00o, string);
        Objects.requireNonNull(o000o0o0OooO00o);
        Intrinsics.checkNotNullParameter(OooO0o1, "<set-?>");
        o000o0o0OooO00o.f36953OooO00o.setValue(OooO0o1);
        return true;
    }
}
