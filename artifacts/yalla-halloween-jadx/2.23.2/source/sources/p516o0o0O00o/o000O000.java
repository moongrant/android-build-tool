package p516o0o0O00o;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<Context, FrameLayout> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseWebView2, Unit> f51193OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f51194OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<WebView> f51195OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f51196OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<ContentState> f51197OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O000(Function1<? super BaseWebView2, Unit> function1, MutableState<WebView> mutableState, MutableState<Float> mutableState2, Function1<? super Boolean, Unit> function2, MutableState<ContentState> mutableState3) {
        super(1);
        this.f51193OooO0Oo = function1;
        this.f51195OooO0o0 = mutableState;
        this.f51194OooO0o = mutableState2;
        this.f51196OooO0oO = function2;
        this.f51197OooO0oo = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FrameLayout invoke(Context context) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        BaseWebView2 baseWebView2 = new BaseWebView2(context2);
        this.f51195OooO0o0.setValue(baseWebView2);
        MutableState<ContentState> mutableState = this.f51197OooO0oo;
        baseWebView2.setLoadStateListener(new o000(this.f51196OooO0oO, this.f51194OooO0o, mutableState));
        baseWebView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f51193OooO0Oo.invoke(baseWebView2);
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(baseWebView2);
        return frameLayout;
    }
}
