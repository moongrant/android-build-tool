package p516o0o0O00o;

import android.webkit.WebView;
import androidx.activity.o00Oo0;
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
import p231o00oOoO.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f51175OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f51176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f51177OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ p231o00oOoO.o0000O0O f51178OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f51179OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebView, Unit> f51180OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f51181OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51182OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0O(o00Oo0 o00oo1, p231o00oOoO.o0000O0O o0000o0o2, o0000O00 o0000o00, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        super(2);
        this.f51176OooO0Oo = o00oo1;
        this.f51178OooO0o0 = o0000o0o2;
        this.f51177OooO0o = o0000o00;
        this.f51179OooO0oO = i;
        this.f51180OooO0oo = function1;
        this.f51175OooO = function0;
        this.f51181OooOO0 = mutableState;
        this.f51182OooOO0O = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1108139108, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BaseWebView.<anonymous>.<anonymous>.<anonymous> (BaseWebView.kt:100)");
            }
            ProvidableCompositionLocal<o00Oo0> providableCompositionLocal = o000oOoO.f215OooO00o;
            o00Oo0 dispatcherOwner = this.f51176OooO0Oo;
            Intrinsics.checkNotNull(dispatcherOwner);
            Intrinsics.checkNotNullParameter(dispatcherOwner, "dispatcherOwner");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{o000oOoO.f215OooO00o.provides(dispatcherOwner)}, ComposableLambdaKt.composableLambda(composer2, 1698938788, true, new o0000O0(this.f51178OooO0o0, this.f51177OooO0o, this.f51179OooO0oO, this.f51180OooO0oo, this.f51175OooO, this.f51181OooOO0, this.f51182OooOO0O)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
