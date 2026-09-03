package p231o00oOoO;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewKt$WebView$9$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
public final class o0000 extends Lambda implements Function1<Context, FrameLayout> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000000O f39825OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Context, WebView> f39826OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f39827OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f39828OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f39829OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f39830OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<WebView> f39831OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000(Function1<? super Context, ? extends WebView> function1, int i, int i2, Function1<? super WebView, Unit> function2, o000000 o000000Var, o000000O o000000o2, MutableState<WebView> mutableState) {
        super(1);
        this.f39826OooO0Oo = function1;
        this.f39828OooO0o0 = i;
        this.f39827OooO0o = i2;
        this.f39829OooO0oO = function2;
        this.f39830OooO0oo = o000000Var;
        this.f39825OooO = o000000o2;
        this.f39831OooOO0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FrameLayout invoke(Context context) {
        WebView webView;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Function1<Context, WebView> function1 = this.f39826OooO0Oo;
        if (function1 == null || (webView = function1.invoke(context2)) == null) {
            webView = new WebView(context2);
        }
        this.f39829OooO0oO.invoke(webView);
        int i = this.f39828OooO0o0;
        int i2 = this.f39827OooO0o;
        webView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        webView.setWebChromeClient(this.f39830OooO0oo);
        webView.setWebViewClient(this.f39825OooO);
        this.f39831OooOO0.setValue(webView);
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        frameLayout.addView(webView);
        return frameLayout;
    }
}
