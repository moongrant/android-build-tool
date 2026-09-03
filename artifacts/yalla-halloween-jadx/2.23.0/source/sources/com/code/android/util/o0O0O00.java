package com.code.android.util;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nModifierUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,230:1\n25#2:231\n1097#3,6:232\n154#4:238\n154#4:239\n*S KotlinDebug\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt\n*L\n87#1:231\n87#1:232,6\n198#1:238\n216#1:239\n*E\n"})
public final class o0O0O00 {

    @SourceDebugExtension({"SMAP\nModifierUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt$rotationByLayoutDirection$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,230:1\n76#2:231\n36#3:232\n1097#4,6:233\n*S KotlinDebug\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt$rotationByLayoutDirection$1\n*L\n147#1:231\n148#1:232\n148#1:233,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f10393OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier composed = modifier;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer2.startReplaceableGroup(-319825248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-319825248, iIntValue, -1, "com.code.android.util.rotationByLayoutDirection.<anonymous> (ModifierUtil.kt:145)");
            }
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(layoutDirection);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oo0o0Oo(layoutDirection);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(composed, (Function1) objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierGraphicsLayer;
        }
    }

    public static Modifier OooO00o(Modifier addAroundCircle, float f, Color color, Brush brush, Dp dp, int i) {
        Color color2 = (i & 2) != 0 ? null : color;
        Brush brush2 = (i & 4) != 0 ? null : brush;
        Dp dp2 = (i & 8) != 0 ? null : dp;
        long jM1452getZeroF1C5BW0 = (i & 16) != 0 ? Offset.INSTANCE.m1452getZeroF1C5BW0() : 0L;
        Intrinsics.checkNotNullParameter(addAroundCircle, "$this$addAroundCircle");
        return DrawModifierKt.drawWithContent(addAroundCircle, new o0OOO0o(f, dp2, color2, jM1452getZeroF1C5BW0, brush2));
    }

    public static Modifier OooO0O0(Modifier avoidFastClick, boolean z, boolean z2, long j, boolean z3, String str, Role role, Function0 function0, Function0 onClick, int i) {
        boolean z4 = (i & 1) != 0 ? true : z;
        boolean z5 = (i & 2) != 0 ? true : z2;
        long j2 = (i & 4) != 0 ? 500L : j;
        boolean z6 = (i & 8) != 0 ? true : z3;
        String str2 = (i & 16) != 0 ? null : str;
        Role role2 = (i & 32) != 0 ? null : role;
        Function0 function1 = (i & 64) != 0 ? null : function0;
        Intrinsics.checkNotNullParameter(avoidFastClick, "$this$avoidFastClick");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(avoidFastClick, null, new o0OO00O(z4, z5, str2, role2, function1, null, z6, j2, onClick), 1, null);
    }

    @NotNull
    public static final Modifier OooO0OO(@NotNull Modifier modifier, @NotNull List<Color> colors, @NotNull Shape shape, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return modifier.then(BackgroundKt.background$default(Modifier.INSTANCE, z ? Brush.Companion.m1633verticalGradient8A3gB4$default(Brush.INSTANCE, colors, 0.0f, 0.0f, 0, 14, (Object) null) : Brush.Companion.m1625horizontalGradient8A3gB4$default(Brush.INSTANCE, colors, 0.0f, 0.0f, 0, 14, (Object) null), shape, 0.0f, 4, null));
    }

    @Composable
    @NotNull
    public static final Modifier OooO0Oo(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
        if (androidx.compose.animation.OooOOO.OooO00o(modifier, "<this>", composer, -1896558232)) {
            ComposerKt.traceEventStart(-1896558232, i, -1, "com.code.android.util.rotationByLayoutDirection (ModifierUtil.kt:145)");
        }
        Modifier modifierComposed$default = ComposedModifierKt.composed$default(modifier, null, OooO00o.f10393OooO0Oo, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierComposed$default;
    }
}
