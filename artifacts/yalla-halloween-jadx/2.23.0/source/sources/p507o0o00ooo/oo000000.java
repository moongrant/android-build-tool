package p507o0o00ooo;

import android.webkit.WebView;
import androidx.activity.o0OoOo0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p010OooOOoo.o000oOoO;
import p187o00o00oo.o00O;
import p187o00o00oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f50155OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f50156OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O f50157OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f50158OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f50159OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f50160OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f50161OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f50162OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo000000(o0OoOo0 o0oooo0, o00OO0O0 o00oo0o1, o00O o00o2, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        super(2);
        this.f50156OooO0Oo = o0oooo0;
        this.f50158OooO0o0 = o00oo0o1;
        this.f50157OooO0o = o00o2;
        this.f50159OooO0oO = i;
        this.f50160OooO0oo = function1;
        this.f50155OooO = function0;
        this.f50161OooOO0 = mutableState;
        this.f50162OooOO0O = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1108139108, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BaseWebView.<anonymous>.<anonymous>.<anonymous> (BaseWebView.kt:99)");
            }
            ProvidableCompositionLocal<o0OoOo0> providableCompositionLocal = o000oOoO.f216OooO00o;
            o0OoOo0 dispatcherOwner = this.f50156OooO0Oo;
            Intrinsics.checkNotNull(dispatcherOwner);
            Intrinsics.checkNotNullParameter(dispatcherOwner, "dispatcherOwner");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{o000oOoO.f216OooO00o.provides(dispatcherOwner)}, ComposableLambdaKt.composableLambda(composer2, 1698938788, true, new oOo0o00(this.f50158OooO0o0, this.f50157OooO0o, this.f50159OooO0oO, this.f50160OooO0oo, this.f50155OooO, this.f50161OooOO0, this.f50162OooOO0O)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
