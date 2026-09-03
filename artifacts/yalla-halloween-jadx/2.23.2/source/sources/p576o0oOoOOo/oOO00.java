package p576o0oOoOOo;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class oOO00 extends oO0o0000 {
    @JavascriptInterface
    public abstract void ContactCustomerService();

    @JavascriptInterface
    public abstract void CreateRoom();

    @JavascriptInterface
    public abstract void buySuccess();

    @JavascriptInterface
    public abstract void hideBackBtn(boolean z);

    @JavascriptInterface
    public abstract void onBackPress(boolean z);

    @JavascriptInterface
    public abstract void showClose(@NotNull String str);

    @JavascriptInterface
    public abstract void showOpenInBrowser(@NotNull String str);

    @JavascriptInterface
    public abstract void showShare(@NotNull String str);
}
