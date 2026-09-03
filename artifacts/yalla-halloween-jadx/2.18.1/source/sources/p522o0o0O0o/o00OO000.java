package p522o0o0O0o;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 {
    public static void OooO00o(WebView webView, String script) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(script, "script");
        o00O00.OooO0O0("WebView.callJs script = " + script + " \n resultCallback = " + ((Object) null));
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(script);
        webView.evaluateJavascript(sb.toString(), null);
    }

    public static final void OooO0O0(@NotNull WebView webView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        OooO00o(webView, "refreshAssociationYallaChat(" + str + ')');
    }

    public static final void OooO0OO(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        OooO00o(webView, "refreshCoins(" + oOO00O.OooO0o(OooOOO.f41216OooO00o.OooO0OO().getValue()) + ')');
    }
}
