package p526o0o0OOO0;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O f53610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O00O f53611OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(o00000O o00000o, o00O00O o00o00o2) {
        super(4);
        this.f53610OooO0Oo = o00000o;
        this.f53611OooO0o0 = o00o00o2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        AnimatedContentScope composable = animatedContentScope;
        NavBackStackEntry it = navBackStackEntry;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1818021728, iIntValue, -1, "com.yalla.yalla.ui.screen.ScreenRegister.register.<anonymous> (ScreenRegister.kt:150)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{o00O.f53592OooO00o.provides(it), o00O.f53593OooO0O0.provides(this.f53610OooO0Oo)}, ComposableLambdaKt.composableLambda(composer2, -997924192, true, new oo0o0O0(this.f53611OooO0o0)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
