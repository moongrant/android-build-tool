package p230o00oOo0o;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p623o0oo0oo0.o00O00;
import p623o0oo0oo0.o00O000o;
import p623o0oo0oo0.o00O00OO;
import p623o0oo0oo0.o00O00o0;
import p623o0oo0oo0.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/PagerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,580:1\n154#2:581\n154#2:582\n154#2:583\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/PagerDefaults\n*L\n139#1:581\n180#1:582\n220#1:583\n*E\n"})
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f39788OooO00o = OooO00o.f39789OooO0Oo;

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f39789OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(o00O00o0 o00o00o1, Integer num, Integer num2) {
            o00O00o0 layoutInfo = o00o00o1;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
            return Integer.valueOf(RangesKt.coerceIn(RangesKt.coerceIn(iIntValue2, iIntValue - 1, iIntValue + 1), 0, layoutInfo.OooO0oo() - 1));
        }
    }

    @NotNull
    @ExperimentalSnapperApi
    @Deprecated(message = "\naccompanist/pager is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.pager.PagerDefaults.flingBehavior(state = state)", imports = {"androidx.compose.foundation.pager.PagerDefaults"}))
    @Composable
    public static o00O00 OooO00o(@NotNull o000000 state, float f, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(132228799);
        int i2 = 0;
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        SpringSpec springSpec = o00O00OO.f57646OooO00o;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(132228799, i, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:215)");
        }
        int i3 = ((i << 3) & 458752) | (i & 14) | 576 | (i & 7168);
        Intrinsics.checkNotNullParameter(state, "state");
        Object snapIndex = f39788OooO00o;
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-776119664);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776119664, i3, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:175)");
        }
        LazyListState lazyListState = state.f39752OooO00o;
        o00O000o.OooO0O0 oooO0O0 = o00O000o.f57643OooO00o;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-632875458);
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1050829263);
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(lazyListState) | composer.changed(oooO0O0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o00oOoo(lazyListState, oooO0O0);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        o00oOoo layoutInfo = (o00oOoo) objRememberedValue;
        layoutInfo.f57651OooO0OO.setValue(Integer.valueOf(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f)));
        composer.endReplaceableGroup();
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-632874525);
        Object[] objArr = {layoutInfo, decayAnimationSpecRememberSplineBasedDecay, springSpec, snapIndex};
        composer.startReplaceableGroup(-3685570);
        boolean zChanged2 = false;
        while (i2 < 4) {
            Object obj = objArr[i2];
            i2++;
            zChanged2 |= composer.changed(obj);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new o00O00(layoutInfo, decayAnimationSpecRememberSplineBasedDecay, springSpec);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        o00O00 o00o01 = (o00O00) objRememberedValue2;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o00o01;
    }
}
