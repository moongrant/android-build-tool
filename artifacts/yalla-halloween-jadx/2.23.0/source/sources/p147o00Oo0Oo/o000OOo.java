package p147o00Oo0Oo;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nThemes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Themes.kt\ncom/code/android/theme/ThemesKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,100:1\n76#2:101\n76#2:102\n76#2:103\n76#2:104\n76#2:105\n*S KotlinDebug\n*F\n+ 1 Themes.kt\ncom/code/android/theme/ThemesKt\n*L\n26#1:101\n74#1:102\n97#1:103\n98#1:104\n99#1:105\n*E\n"})
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Boolean> f37692OooO00o = CompositionLocalKt.compositionLocalOf$default(null, OooO00o.f37695OooO0Oo, 1, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<o0O0O00> f37693OooO0O0 = CompositionLocalKt.compositionLocalOf$default(null, OooO0O0.f37696OooO0Oo, 1, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o0O0O00 f37694OooO0OO = new o0O0O00(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 131071);

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f37695OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f37696OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            return o000OOo.f37694OooO0OO;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f37697OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f37698OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f37699OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f37697OooO0Oo = z;
            this.f37699OooO0o0 = function2;
            this.f37698OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37698OooO0o | 1);
            o000OOo.OooO00o(this.f37697OooO0Oo, this.f37699OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f37700OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f37700OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000OOo.OooO0O0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f37700OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO00o(boolean z, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1156992957);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1156992957, i3, -1, "com.code.android.theme.ProvideYLTheme (Themes.kt:42)");
            }
            int i4 = oo0o0Oo.f37739OooOo0o;
            long j = z ? oo0o0Oo.f37732OooOOOo : oo0o0Oo.f37734OooOOo0;
            long j2 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37731OooOOOO;
            long j3 = z ? oo0o0Oo.f37738OooOo0O : oo0o0Oo.f37729OooOOO;
            long j4 = z ? oo0o0Oo.f37738OooOo0O : oo0o0Oo.f37729OooOOO;
            long j5 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37737OooOo00;
            long j6 = z ? oo0o0Oo.f37736OooOo0 : oo0o0Oo.f37719OooO0O0;
            long j7 = z ? oo0o0Oo.f37733OooOOo : oo0o0Oo.f37735OooOOoo;
            long j8 = z ? oo0o0Oo.f37718OooO00o : oo0o0Oo.f37725OooO0oo;
            long j9 = z ? oo0o0Oo.f37717OooO : oo0o0Oo.f37724OooO0oO;
            long j10 = z ? oo0o0Oo.f37726OooOO0 : oo0o0Oo.f37722OooO0o;
            long j11 = z ? oo0o0Oo.f37727OooOO0O : oo0o0Oo.f37723OooO0o0;
            long j12 = z ? oo0o0Oo.f37728OooOO0o : oo0o0Oo.f37721OooO0Oo;
            long j13 = z ? oo0o0Oo.f37730OooOOO0 : oo0o0Oo.f37720OooO0OO;
            long j14 = z ? oo0o0Oo.f37732OooOOOo : oo0o0Oo.f37731OooOOOO;
            TweenSpec tweenSpec = new TweenSpec(600, 0, null, 6, null);
            o0O0O00 o0o0o00 = new o0O0O00(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j2, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j3, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j4, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j5, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j6, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j7, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j8, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j9, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j12, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j13, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j14, tweenSpec, null, null, composerStartRestartGroup, 48, 12).getValue().m1680unboximpl(), 49153);
            Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7);
            OooO0O0(composerStartRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{f37693OooO0O0.provides(o0o0o00), IndicationKt.getLocalIndication().provides(indicationM1277rememberRipple9IZ8Weo), RippleThemeKt.getLocalRippleTheme().provides(o00000.f37689OooO00o), f37692OooO00o.provides(Boolean.valueOf(z)), CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f))}, content, composerStartRestartGroup, (i3 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(z, content, i));
    }

    @Composable
    public static final void OooO0O0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2018477866);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2018477866, i, -1, "com.code.android.theme.ScreenAdaptation360DP (Themes.kt:95)");
            }
            ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp = 360;
            ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp = (int) (((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics().heightPixels / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }

    @Composable
    @JvmName(name = "getThemes")
    @NotNull
    public static final o0O0O00 OooO0OO(@Nullable Composer composer) {
        composer.startReplaceableGroup(505836867);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(505836867, 0, -1, "com.code.android.theme.<get-Themes> (Themes.kt:25)");
        }
        o0O0O00 o0o0o00 = (o0O0O00) composer.consume(f37693OooO0O0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0o0o00;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO0Oo(@NotNull ComposeView composeView, @NotNull ComposableLambda content) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-488493634, true, new o000000O(content)));
    }
}
