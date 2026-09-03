package p005OooO0oO;

import OooO0o.OooO00o;
import android.webkit.JavascriptInterface;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.base.web.WebBrowser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends OooO00o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(@NotNull WebBrowser webBrowser) {
        super(webBrowser.getWebView());
        Intrinsics.checkNotNullParameter(webBrowser, "webBrowser");
    }

    @Override // OooO0o.OooOO0
    @NotNull
    public final String OooO00o() {
        return "YLApplicationBridge";
    }

    @JavascriptInterface
    public final boolean getApplicationID(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "");
        if (completion == null) {
            return false;
        }
        String functionID = completion.getCompletion().getFunctionID();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("{\"applicationID\":\"");
        sbOooO0o0.append(YCSDKOpenKit.getAppId$lib_release());
        sbOooO0o0.append("\"}");
        OooO0Oo(functionID, sbOooO0o0.toString());
        return true;
    }

    @JavascriptInterface
    public final boolean getClientID(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) OooO0O0(data, Completion.class, "");
        if (completion == null) {
            return false;
        }
        String packageName = this.f128OooO00o.getContext().getPackageName();
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"clientID\":\"" + ((Object) packageName) + "\"}");
        return true;
    }
}
