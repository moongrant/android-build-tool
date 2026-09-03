package p572o0oOoOO0;

import android.webkit.WebView;
import com.code.android.util.o0OoOo0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000Oo0 {
    public static void OooO00o(WebView webView, String script) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(script, "script");
        OooOOO0.OooO0O0("WebView.callJs script = " + script + " \n resultCallback = " + ((Object) null));
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
        o000000O o000000o2 = o000000O.f46674OooO00o;
        OooO00o(webView, "refreshCoins(" + o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue()) + ")");
    }
}
