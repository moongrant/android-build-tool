package p005OooO0oo;

import android.webkit.JavascriptInterface;
import com.google.gson.o00O0O;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.base.web.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends Oooo000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(@NotNull BaseWebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // p004OooO0oO.o00Oo0
    @NotNull
    public final String OooO00o() {
        return "YLSDKInfoBridge";
    }

    @JavascriptInterface
    public final boolean getSDKInfo(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O0O o00o0o2 = new o00O0O();
        o00o0o2.OooO0Oo("SDKID", "1");
        o00o0o2.OooO0Oo("SDKVersion", "1.2.0");
        OooO0OO(o00o0o2, completion.getCompletion().getFunctionID());
        return true;
    }
}
