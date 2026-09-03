package p005OooO0oo;

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
import p004OooO0oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final BaseWebView f163OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(@NotNull BaseWebView baseWebView) {
        super(baseWebView);
        Intrinsics.checkNotNullParameter(baseWebView, "baseWebView");
        this.f163OooO0O0 = baseWebView;
    }

    @Override // p004OooO0oO.o00Oo0
    @NotNull
    public final String OooO00o() {
        return "YLPageBridge";
    }

    public final int OooO0o0(String str) {
        int i;
        WebBackForwardList webBackForwardListCopyBackForwardList = this.f157OooO00o.copyBackForwardList();
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
        EnableBackForward enableBackForward = (EnableBackForward) Oooo000.OooO0O0(EnableBackForward.class, data, "");
        if (enableBackForward == null) {
            return false;
        }
        boolean z = enableBackForward.getBack() != 0;
        BaseWebView baseWebView = this.f163OooO0O0;
        baseWebView.setCanGoBack(z);
        baseWebView.setCanGoForward(enableBackForward.getForward() != 0);
        return true;
    }

    @JavascriptInterface
    public final boolean goBack(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        JumpBean jumpBean = (JumpBean) Oooo000.OooO0O0(JumpBean.class, data, "");
        if (jumpBean == null) {
            return false;
        }
        int iOooO0o0 = OooO0o0(jumpBean.getUrl());
        if (iOooO0o0 != Integer.MAX_VALUE) {
            this.f163OooO0O0.goBackOrForward(iOooO0o0);
        }
        return true;
    }

    @JavascriptInterface
    public final boolean goForward(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        JumpBean jumpBean = (JumpBean) Oooo000.OooO0O0(JumpBean.class, data, "");
        if (jumpBean == null) {
            return false;
        }
        int iOooO0o0 = OooO0o0(jumpBean.getUrl());
        if (iOooO0o0 != Integer.MAX_VALUE) {
            this.f163OooO0O0.goBackOrForward(iOooO0o0);
        }
        return true;
    }

    @JavascriptInterface
    public final boolean popWindow(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((PopWindow) Oooo000.OooO0O0(PopWindow.class, data, "")) != null;
    }

    @JavascriptInterface
    public final boolean pushWindow(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        PushWindow pushWindow = (PushWindow) Oooo000.OooO0O0(PushWindow.class, data, "");
        if (pushWindow == null) {
            return false;
        }
        StringsKt.isBlank(pushWindow.getUrl());
        this.f163OooO0O0.loadUrl(pushWindow.getUrl());
        return true;
    }

    @JavascriptInterface
    public final boolean setBackForwardAnchor(@NotNull String data) {
        int iOooO0o0;
        Intrinsics.checkNotNullParameter(data, "data");
        BackForwardAnchor backForwardAnchor = (BackForwardAnchor) Oooo000.OooO0O0(BackForwardAnchor.class, data, "");
        if (backForwardAnchor == null) {
            return false;
        }
        boolean z = !StringsKt.isBlank(backForwardAnchor.getBackAnchor());
        BaseWebView baseWebView = this.f163OooO0O0;
        if (z) {
            int iOooO0o1 = OooO0o0(backForwardAnchor.getBackAnchor());
            if (iOooO0o1 != Integer.MAX_VALUE) {
                baseWebView.setGoBackStep(iOooO0o1);
            }
        } else if ((!StringsKt.isBlank(backForwardAnchor.getForwardAnchor())) && (iOooO0o0 = OooO0o0(backForwardAnchor.getForwardAnchor())) != Integer.MAX_VALUE) {
            baseWebView.setGoForwardStep(iOooO0o0);
        }
        return true;
    }
}
