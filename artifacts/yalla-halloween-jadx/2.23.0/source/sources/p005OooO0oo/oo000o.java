package p005OooO0oo;

import android.webkit.JavascriptInterface;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.bean.Completion;
import com.yallatech.support.platform.base.web.WebBrowser;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends Oooo000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(@NotNull WebBrowser webBrowser) {
        super(webBrowser.getWebView());
        Intrinsics.checkNotNullParameter(webBrowser, "webBrowser");
    }

    @Override // p004OooO0oO.o00Oo0
    @NotNull
    public final String OooO00o() {
        return "YLApplicationBridge";
    }

    @JavascriptInterface
    public final boolean getApplicationID(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "");
        if (completion == null) {
            return false;
        }
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"applicationID\":\"" + YCSDKOpenKit.getAppId$lib_release() + "\"}");
        return true;
    }

    @JavascriptInterface
    public final boolean getClientID(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Completion completion = (Completion) Oooo000.OooO0O0(Completion.class, data, "");
        if (completion == null) {
            return false;
        }
        String packageName = this.f157OooO00o.getContext().getPackageName();
        OooO0Oo(completion.getCompletion().getFunctionID(), "{\"clientID\":\"" + ((Object) packageName) + "\"}");
        return true;
    }
}
