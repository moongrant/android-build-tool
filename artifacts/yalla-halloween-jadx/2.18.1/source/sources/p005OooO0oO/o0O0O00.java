package p005OooO0oO;

import OooO0o.OooO00o;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.umeng.commonsdk.internal.a;
import com.yallatech.support.platform.base.bean.Completion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p386o0OOoo0O.o00O00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends OooO00o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(@NotNull WebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // OooO0o.OooOO0
    @NotNull
    public final String OooO00o() {
        return "YLSDKInfoBridge";
    }

    @JavascriptInterface
    public final boolean getSDKInfo(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "Completion not found in params!");
        if (completion == null) {
            return false;
        }
        o00O00O o00o00o2 = new o00O00O();
        o00o00o2.OooO0oO("SDKID", "1");
        o00o00o2.OooO0oO("SDKVersion", a.e);
        OooO0OO(completion.getCompletion().getFunctionID(), o00o00o2);
        return true;
    }
}
