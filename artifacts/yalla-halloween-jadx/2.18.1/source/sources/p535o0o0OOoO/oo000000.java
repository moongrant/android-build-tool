package p535o0o0OOoO;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000000 extends BaseWebView.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f43732OooO00o;

    public oo000000(WebActivity webActivity) {
        this.f43732OooO00o = webActivity;
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO
    public final void OooO00o(@Nullable String str) {
        HeaderLayout headerLayout = this.f43732OooO00o.f11463OoooO;
        if (headerLayout == null) {
            return;
        }
        headerLayout.setTitle(str);
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/webkit/WebView;Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;Landroid/webkit/WebChromeClient$FileChooserParams;)Z */
    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO
    public final void OooO0O0(@Nullable ValueCallback valueCallback) {
        this.f43732OooO00o.f22112Ooooo00 = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        this.f43732OooO00o.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 1);
    }

    @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO
    public final void OooO0OO(@Nullable WebView webView) {
        if (this.f43732OooO00o.f22113Ooooo0o) {
            String url = webView != null ? webView.getUrl() : null;
            if (url == null || StringsKt.isBlank(url)) {
                return;
            }
            String url2 = webView != null ? webView.getUrl() : null;
            Intrinsics.checkNotNull(url2);
            if (StringsKt.OooOoOO(url2, OooOOO.OooO0OO(R.string.single_instagram_callback_url))) {
                WebActivity webActivity = this.f43732OooO00o;
                String url3 = webView.getUrl();
                Intrinsics.checkNotNull(url3);
                webActivity.f22114OooooO0 = url3;
                this.f43732OooO00o.finish();
            }
        }
    }
}
