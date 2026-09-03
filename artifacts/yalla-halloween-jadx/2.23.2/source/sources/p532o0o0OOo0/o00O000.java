package p532o0o0OOo0;

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
import p105o000oo0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f53497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O0 f53498OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o00O00OO o00o00oo2, o000O0 o000o0) {
        super(4);
        this.f53497OooO0Oo = o00o00oo2;
        this.f53498OooO0o0 = o000o0;
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
            ComposerKt.traceEventStart(1818021728, iIntValue, -1, "com.yalla.yalla.ui.screen.ScreenRegister.register.<anonymous> (ScreenRegister.kt:152)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{o00O00O.f53500OooO00o.provides(it), o00O00O.f53501OooO0O0.provides(this.f53497OooO0Oo)}, ComposableLambdaKt.composableLambda(composer2, -997924192, true, new o00oOoo(this.f53498OooO0o0)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
