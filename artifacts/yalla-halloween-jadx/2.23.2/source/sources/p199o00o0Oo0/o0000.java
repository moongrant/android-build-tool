package p199o00o0Oo0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCustomSliderProgressText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSliderProgressText.kt\ncom/code/android/uikit/slider/CustomSliderProgressTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,46:1\n25#2:47\n50#2:61\n49#2:62\n1097#3,3:48\n1100#3,3:52\n1097#3,6:63\n154#4:51\n154#4:56\n154#4:59\n76#5:55\n75#6:57\n58#6:58\n51#6:60\n81#7:69\n107#7,2:70\n*S KotlinDebug\n*F\n+ 1 CustomSliderProgressText.kt\ncom/code/android/uikit/slider/CustomSliderProgressTextKt\n*L\n22#1:47\n38#1:61\n38#1:62\n22#1:48,3\n22#1:52,3\n38#1:63,6\n22#1:51\n28#1:56\n36#1:59\n24#1:55\n36#1:57\n36#1:58\n36#1:60\n22#1:69\n22#1:70,2\n*E\n"})
public final class o0000 {

    public static final class OooO00o extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Density f39205OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Dp> f39206OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Density density, MutableState<Dp> mutableState) {
            super(1);
            this.f39205OooO0Oo = density;
            this.f39206OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f39206OooO0o0.setValue(Dp.m3773boximpl(this.f39205OooO0Oo.mo323toDpu2uoSUM(IntSize.m3935getWidthimpl(it.mo2811getSizeYbymL2g()))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f39207OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f39208OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f39209OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f39210OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, float f, float f2, int i) {
            super(2);
            this.f39207OooO0Oo = boxScope;
            this.f39209OooO0o0 = f;
            this.f39208OooO0o = f2;
            this.f39210OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f39210OooO0oO | 1);
            float f = this.f39209OooO0o0;
            float f2 = this.f39208OooO0o;
            o0000.OooO00o(this.f39207OooO0Oo, f, f2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope CustomSliderProgressText, float f, float f2, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(CustomSliderProgressText, "$this$CustomSliderProgressText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-317276403);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(CustomSliderProgressText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-317276403, i2, -1, "com.code.android.uikit.slider.CustomSliderProgressText (CustomSliderProgressText.kt:20)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            String strValueOf = String.valueOf((int) (100 * f2));
            float fM3775constructorimpl = Dp.m3775constructorimpl(-20);
            if (strValueOf == null) {
                strValueOf = "";
            }
            String str = strValueOf;
            Modifier modifierM438offsetVpY3zN4 = OffsetKt.m438offsetVpY3zN4(CustomSliderProgressText.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m3775constructorimpl(Dp.m3775constructorimpl(4) + Dp.m3775constructorimpl(f - Dp.m3775constructorimpl(((Dp) mutableState.getValue()).m3789unboximpl() / 2))), fM3775constructorimpl);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO00o(density, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM438offsetVpY3zN4, (Function1) objRememberedValue2);
            int i3 = o0OOo000.f48347o00OOooO;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str, modifierOnGloballyPositioned, o0OOo000.f48149OooOOo, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(CustomSliderProgressText, f, f2, i));
    }
}
