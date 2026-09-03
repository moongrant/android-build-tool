package p516o0o0O00o;

import android.content.Context;
import android.webkit.WebView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function1<Context, WebView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000 f51119OooO0Oo = new o0000();

    public o0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final WebView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        return new BaseWebView(it);
    }
}
