package p507o0o00ooo;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p187o00o00oo.o00O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends Lambda implements Function1<WebView, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f50141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O f50142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f50143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f50144OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f50145OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOOOoo00(Function1<? super WebView, Unit> function1, Function0<Unit> function0, o00O o00o2, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f50141OooO0Oo = function1;
        this.f50143OooO0o0 = function0;
        this.f50142OooO0o = o00o2;
        this.f50144OooO0oO = mutableState;
        this.f50145OooO0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebView webView) {
        WebView it = webView;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f50141OooO0Oo.invoke(it);
        it.setBackgroundColor(0);
        it.addJavascriptInterface(new oOOO0OOO(this.f50143OooO0o0, this.f50142OooO0o, it, this.f50144OooO0oO, this.f50145OooO0oo), "Yalla");
        return Unit.INSTANCE;
    }
}
