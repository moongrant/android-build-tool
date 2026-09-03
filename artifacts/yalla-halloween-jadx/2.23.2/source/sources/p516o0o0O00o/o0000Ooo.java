package p516o0o0O00o;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p231o00oOoO.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function1<WebView, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f51185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f51186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f51187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f51188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51189OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000Ooo(Function1<? super WebView, Unit> function1, Function0<Unit> function0, o0000O00 o0000o00, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f51185OooO0Oo = function1;
        this.f51187OooO0o0 = function0;
        this.f51186OooO0o = o0000o00;
        this.f51188OooO0oO = mutableState;
        this.f51189OooO0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebView webView) {
        WebView it = webView;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f51185OooO0Oo.invoke(it);
        it.setBackgroundColor(0);
        it.addJavascriptInterface(new o00000OO(this.f51187OooO0o0, this.f51186OooO0o, it, this.f51188OooO0oO, this.f51189OooO0oo), "Yalla");
        return Unit.INSTANCE;
    }
}
