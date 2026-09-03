package p507o0o00ooo;

import android.content.Context;
import android.webkit.WebView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOOo0O extends Lambda implements Function1<Context, WebView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOOOOo0O f50140OooO0Oo = new oOOOOo0O();

    public oOOOOo0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final WebView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        return new BaseWebView(it);
    }
}
