package p576o0oOoOOo;

import android.webkit.WebView;
import com.code.android.util.o0OoOo0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 {
    public static void OooO00o(WebView webView, String script) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(script, "script");
        o0000O00.OooO0O0("WebView.callJs script = " + script + " \n resultCallback = " + ((Object) null));
        StringBuilder sb = new StringBuilder("javascript:");
        sb.append(script);
        webView.evaluateJavascript(sb.toString(), null);
    }

    public static final void OooO0O0(@NotNull WebView webView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        OooO00o(webView, "refreshAssociationYallaChat(" + str + ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        OooO00o(webView, "refreshCoins(" + o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue()) + ")");
    }
}
