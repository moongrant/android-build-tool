package p005OooO0oO;

import OooO0o.OooO00o;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import com.yallatech.support.platform.base.bean.BackForwardAnchor;
import com.yallatech.support.platform.base.bean.EnableBackForward;
import com.yallatech.support.platform.base.bean.JumpBean;
import com.yallatech.support.platform.base.bean.PopWindow;
import com.yallatech.support.platform.base.bean.PushWindow;
import com.yallatech.support.platform.base.web.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final BaseWebView f138OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(@NotNull BaseWebView baseWebView) {
        super(baseWebView);
        Intrinsics.checkNotNullParameter(baseWebView, "baseWebView");
        this.f138OooO0O0 = baseWebView;
    }

    @Override // OooO0o.OooOO0
    @NotNull
    public final String OooO00o() {
        return "YLPageBridge";
    }

    public final int OooO0o0(String str) {
        int i;
        WebBackForwardList webBackForwardListCopyBackForwardList = this.f128OooO00o.copyBackForwardList();
        Intrinsics.checkNotNullExpressionValue(webBackForwardListCopyBackForwardList, "webView.copyBackForwardList()");
        int size = webBackForwardListCopyBackForwardList.getSize();
        if (size <= 0) {
            i = Integer.MAX_VALUE;
            break;
        }
        i = 0;
        while (true) {
            int i2 = i + 1;
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
            if (Intrinsics.areEqual(itemAtIndex.getUrl(), str) || Intrinsics.areEqual(itemAtIndex.getOriginalUrl(), str)) {
                break;
            }
            if (i2 >= size) {
                i = Integer.MAX_VALUE;
                break;
            }
            i = i2;
        }
        return i == Integer.MAX_VALUE ? i : i - webBackForwardListCopyBackForwardList.getCurrentIndex();
    }

    @JavascriptInterface
    public final boolean enableBackForward(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        EnableBackForward enableBackForward = (EnableBackForward) OooO0O0(data, EnableBackForward.class, "");
        if (enableBackForward == null) {
            return false;
        }
        this.f138OooO0O0.setCanGoBack(enableBackForward.getBack() != 0);
        this.f138OooO0O0.setCanGoForward(enableBackForward.getForward() != 0);
        return true;
    }

    @JavascriptInterface
    public final boolean goBack(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        JumpBean jumpBean = (JumpBean) OooO0O0(data, JumpBean.class, "");
        if (jumpBean == null) {
            return false;
        }
        int iOooO0o0 = OooO0o0(jumpBean.getUrl());
        if (iOooO0o0 != Integer.MAX_VALUE) {
            this.f138OooO0O0.goBackOrForward(iOooO0o0);
        }
        return true;
    }

    @JavascriptInterface
    public final boolean goForward(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        JumpBean jumpBean = (JumpBean) OooO0O0(data, JumpBean.class, "");
        if (jumpBean == null) {
            return false;
        }
        int iOooO0o0 = OooO0o0(jumpBean.getUrl());
        if (iOooO0o0 != Integer.MAX_VALUE) {
            this.f138OooO0O0.goBackOrForward(iOooO0o0);
        }
        return true;
    }

    @JavascriptInterface
    public final boolean popWindow(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((PopWindow) OooO0O0(data, PopWindow.class, "")) != null;
    }

    @JavascriptInterface
    public final boolean pushWindow(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        PushWindow pushWindow = (PushWindow) OooO0O0(data, PushWindow.class, "");
        if (pushWindow == null) {
            return false;
        }
        StringsKt.isBlank(pushWindow.getUrl());
        this.f138OooO0O0.loadUrl(pushWindow.getUrl());
        return true;
    }

    @JavascriptInterface
    public final boolean setBackForwardAnchor(@NotNull String data) {
        int iOooO0o0;
        Intrinsics.checkNotNullParameter(data, "data");
        BackForwardAnchor backForwardAnchor = (BackForwardAnchor) OooO0O0(data, BackForwardAnchor.class, "");
        if (backForwardAnchor == null) {
            return false;
        }
        if (!StringsKt.isBlank(backForwardAnchor.getBackAnchor())) {
            int iOooO0o1 = OooO0o0(backForwardAnchor.getBackAnchor());
            if (iOooO0o1 == Integer.MAX_VALUE) {
                return true;
            }
            this.f138OooO0O0.setGoBackStep(iOooO0o1);
            return true;
        }
        if (!(!StringsKt.isBlank(backForwardAnchor.getForwardAnchor())) || (iOooO0o0 = OooO0o0(backForwardAnchor.getForwardAnchor())) == Integer.MAX_VALUE) {
            return true;
        }
        this.f138OooO0O0.setGoForwardStep(iOooO0o0);
        return true;
    }
}
