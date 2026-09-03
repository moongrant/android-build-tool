package com.code.android.util;

import android.util.TypedValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSizeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeUtil.kt\ncom/code/android/util/SizeUtilKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,79:1\n76#2:80\n76#2:82\n76#2:83\n76#2:85\n1#3:81\n154#4:84\n*S KotlinDebug\n*F\n+ 1 SizeUtil.kt\ncom/code/android/util/SizeUtilKt\n*L\n66#1:80\n69#1:82\n72#1:83\n79#1:85\n75#1:84\n*E\n"})
public final class o0000O0 {
    public static final int OooO00o(float f) {
        return (int) (TypedValue.applyDimension(1, f, o000O0.OooO00o().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static final int OooO0O0(int i) {
        return (int) ((i / o000O0.OooO00o().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Composable
    @JvmName(name = "getTextDp")
    public static final long OooO0OO(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(755694031);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(755694031, i2, -1, "com.code.android.util.<get-textDp> (SizeUtil.kt:78)");
        }
        long jMo326toSp0xMU5do = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo326toSp0xMU5do(Dp.m3765constructorimpl(i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jMo326toSp0xMU5do;
    }

    @Composable
    public static final float OooO0Oo(float f, @Nullable Composer composer) {
        composer.startReplaceableGroup(454436953);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454436953, 0, -1, "com.code.android.util.toDp (SizeUtil.kt:68)");
        }
        float fMo320toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo320toDpu2uoSUM(f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo320toDpu2uoSUM;
    }

    @Composable
    public static final float OooO0o0(int i, @Nullable Composer composer) {
        composer.startReplaceableGroup(-249551124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-249551124, 0, -1, "com.code.android.util.toDp (SizeUtil.kt:65)");
        }
        float fMo321toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo321toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo321toDpu2uoSUM;
    }
}
