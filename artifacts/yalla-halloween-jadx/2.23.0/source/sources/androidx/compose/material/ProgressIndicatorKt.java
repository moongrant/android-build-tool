package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import io.agora.rtc.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aG\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aO\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a3\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a=\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a;\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aE\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a9\u0010:\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a9\u0010E\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010A\u001aA\u0010G\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001aA\u0010J\u001a\u00020\u001f*\u00020;2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a1\u0010O\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "backgroundColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,587:1\n83#2,3:588\n83#2,3:597\n1114#3,6:591\n1114#3,6:600\n76#4:606\n76#4:607\n75#5,7:608\n76#6:615\n76#6:616\n76#6:617\n76#6:618\n76#6:619\n76#6:620\n76#6:621\n76#6:622\n154#7:623\n154#7:624\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n86#1:588,3\n165#1:597,3\n86#1:591,6\n165#1:600,6\n296#1:606\n334#1:607\n512#1:608,7\n117#1:615\n128#1:616\n139#1:617\n150#1:618\n340#1:619\n352#1:620\n363#1:621\n375#1:622\n530#1:623\n534#1:624\n*E\n"})
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m3765constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m3765constructorimpl(40);

    @NotNull
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    @NotNull
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    @NotNull
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m1136CircularProgressIndicatorDUhRLBM(final float f, @Nullable Modifier modifier, long j, float f2, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long jM1023getPrimary0d7_KjU;
        int i5;
        float fM1135getStrokeWidthD9Ej5fM;
        int i6;
        int i7;
        long jM1705getTransparent0d7_KjU;
        int i8;
        int iM1995getButtKaPHkGw;
        final long j3;
        final long j4;
        final int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1746618448);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    jM1023getPrimary0d7_KjU = j;
                    int i11 = composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i4 |= i11;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                i4 |= i11;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    fM1135getStrokeWidthD9Ej5fM = f2;
                    if (composerStartRestartGroup.changed(fM1135getStrokeWidthD9Ej5fM)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((57344 & i2) == 0) {
                        jM1705getTransparent0d7_KjU = j2;
                        if (composerStartRestartGroup.changed(jM1705getTransparent0d7_KjU)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((458752 & i2) == 0) {
                        if ((i3 & 32) == 0) {
                            iM1995getButtKaPHkGw = i;
                            int i12 = composerStartRestartGroup.changed(iM1995getButtKaPHkGw) ? 131072 : 65536;
                            i4 |= i12;
                        } else {
                            iM1995getButtKaPHkGw = i;
                        }
                        i4 |= i12;
                    } else {
                        iM1995getButtKaPHkGw = i;
                    }
                    if ((i4 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            }
                            if (i5 != 0) {
                                fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                            }
                            if (i7 != 0) {
                                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                            }
                            if ((i3 & 32) != 0) {
                                iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                        }
                        final float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                        final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                        final long j5 = jM1705getTransparent0d7_KjU;
                        final long j6 = jM1023getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                float f3 = fCoerceIn * 360.0f;
                                ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j5, stroke);
                                ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f3, j6, stroke);
                            }
                        }, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    j3 = jM1023getPrimary0d7_KjU;
                    j4 = jM1705getTransparent0d7_KjU;
                    i9 = iM1995getButtKaPHkGw;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier3 = modifier2;
                    final float f3 = fM1135getStrokeWidthD9Ej5fM;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i13) {
                            ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j3, f3, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
                i4 |= 24576;
                jM1705getTransparent0d7_KjU = j2;
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        iM1995getButtKaPHkGw = i;
                        if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                        }
                        i4 |= i12;
                    } else {
                        iM1995getButtKaPHkGw = i;
                    }
                    i4 |= i12;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                if ((i4 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    final float fCoerceIn2 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    final Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                    final long j7 = jM1705getTransparent0d7_KjU;
                    final long j8 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn2, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float f4 = fCoerceIn2 * 360.0f;
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j7, stroke2);
                            ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f4, j8, stroke2);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    final float fCoerceIn3 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    final Stroke stroke3 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                    final long j9 = jM1705getTransparent0d7_KjU;
                    final long j10 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn3, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float f4 = fCoerceIn3 * 360.0f;
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j9, stroke3);
                            ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f4, j10, stroke3);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j3 = jM1023getPrimary0d7_KjU;
                j4 = jM1705getTransparent0d7_KjU;
                i9 = iM1995getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier4 = modifier2;
                final float f4 = fM1135getStrokeWidthD9Ej5fM;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier4, j3, f4, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 3072;
            fM1135getStrokeWidthD9Ej5fM = f2;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    jM1705getTransparent0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM1705getTransparent0d7_KjU)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        iM1995getButtKaPHkGw = i;
                        if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                        }
                        i4 |= i12;
                    } else {
                        iM1995getButtKaPHkGw = i;
                    }
                    i4 |= i12;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                if ((i4 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    final float fCoerceIn4 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    final Stroke stroke4 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                    final long j11 = jM1705getTransparent0d7_KjU;
                    final long j12 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn4, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float f5 = fCoerceIn4 * 360.0f;
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j11, stroke4);
                            ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f5, j12, stroke4);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    final float fCoerceIn5 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    final Stroke stroke5 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                    final long j13 = jM1705getTransparent0d7_KjU;
                    final long j14 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn5, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float f5 = fCoerceIn5 * 360.0f;
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j13, stroke5);
                            ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f5, j14, stroke5);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j3 = jM1023getPrimary0d7_KjU;
                j4 = jM1705getTransparent0d7_KjU;
                i9 = iM1995getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier2;
                final float f5 = fM1135getStrokeWidthD9Ej5fM;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier5, j3, f5, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 24576;
            jM1705getTransparent0d7_KjU = j2;
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    iM1995getButtKaPHkGw = i;
                    if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                    }
                    i4 |= i12;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                i4 |= i12;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            if ((i4 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                final float fCoerceIn6 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                final Stroke stroke6 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                final long j15 = jM1705getTransparent0d7_KjU;
                final long j16 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn6, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f6 = fCoerceIn6 * 360.0f;
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j15, stroke6);
                        ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f6, j16, stroke6);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                final float fCoerceIn7 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                final Stroke stroke7 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                final long j17 = jM1705getTransparent0d7_KjU;
                final long j18 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn7, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f6 = fCoerceIn7 * 360.0f;
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j17, stroke7);
                        ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f6, j18, stroke7);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j3 = jM1023getPrimary0d7_KjU;
            j4 = jM1705getTransparent0d7_KjU;
            i9 = iM1995getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier6 = modifier2;
            final float f6 = fM1135getStrokeWidthD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier6, j3, f6, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                jM1023getPrimary0d7_KjU = j;
                if (composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU)) {
                }
                i4 |= i11;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i4 |= i11;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                fM1135getStrokeWidthD9Ej5fM = f2;
                if (composerStartRestartGroup.changed(fM1135getStrokeWidthD9Ej5fM)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((57344 & i2) == 0) {
                    jM1705getTransparent0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM1705getTransparent0d7_KjU)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        iM1995getButtKaPHkGw = i;
                        if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                        }
                        i4 |= i12;
                    } else {
                        iM1995getButtKaPHkGw = i;
                    }
                    i4 |= i12;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                if ((i4 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    final float fCoerceIn8 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    final Stroke stroke8 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                    final long j19 = jM1705getTransparent0d7_KjU;
                    final long j110 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn8, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float f7 = fCoerceIn8 * 360.0f;
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j19, stroke8);
                            ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f7, j110, stroke8);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i5 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i7 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 32) != 0) {
                            iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    final float fCoerceIn9 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                    final Stroke stroke9 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                    final long j111 = jM1705getTransparent0d7_KjU;
                    final long j112 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn9, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float f7 = fCoerceIn9 * 360.0f;
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j111, stroke9);
                            ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f7, j112, stroke9);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j3 = jM1023getPrimary0d7_KjU;
                j4 = jM1705getTransparent0d7_KjU;
                i9 = iM1995getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier2;
                final float f7 = fM1135getStrokeWidthD9Ej5fM;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i13) {
                        ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier7, j3, f7, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 24576;
            jM1705getTransparent0d7_KjU = j2;
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    iM1995getButtKaPHkGw = i;
                    if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                    }
                    i4 |= i12;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                i4 |= i12;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            if ((i4 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                final float fCoerceIn10 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                final Stroke stroke10 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                final long j113 = jM1705getTransparent0d7_KjU;
                final long j114 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn10, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f8 = fCoerceIn10 * 360.0f;
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j113, stroke10);
                        ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f8, j114, stroke10);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                final float fCoerceIn11 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                final Stroke stroke11 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                final long j115 = jM1705getTransparent0d7_KjU;
                final long j116 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn11, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f8 = fCoerceIn11 * 360.0f;
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j115, stroke11);
                        ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f8, j116, stroke11);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j3 = jM1023getPrimary0d7_KjU;
            j4 = jM1705getTransparent0d7_KjU;
            i9 = iM1995getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier8 = modifier2;
            final float f8 = fM1135getStrokeWidthD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier8, j3, f8, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 3072;
        fM1135getStrokeWidthD9Ej5fM = f2;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((57344 & i2) == 0) {
                jM1705getTransparent0d7_KjU = j2;
                if (composerStartRestartGroup.changed(jM1705getTransparent0d7_KjU)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    iM1995getButtKaPHkGw = i;
                    if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                    }
                    i4 |= i12;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                i4 |= i12;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            if ((i4 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                final float fCoerceIn12 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                final Stroke stroke12 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                final long j117 = jM1705getTransparent0d7_KjU;
                final long j118 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn12, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f9 = fCoerceIn12 * 360.0f;
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j117, stroke12);
                        ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f9, j118, stroke12);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i5 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i7 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 32) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                final float fCoerceIn13 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                final Stroke stroke13 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
                final long j119 = jM1705getTransparent0d7_KjU;
                final long j1110 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn13, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f9 = fCoerceIn13 * 360.0f;
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j119, stroke13);
                        ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f9, j1110, stroke13);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j3 = jM1023getPrimary0d7_KjU;
            j4 = jM1705getTransparent0d7_KjU;
            i9 = iM1995getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier2;
            final float f9 = fM1135getStrokeWidthD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier9, j3, f9, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 24576;
        jM1705getTransparent0d7_KjU = j2;
        if ((458752 & i2) == 0) {
            if ((i3 & 32) == 0) {
                iM1995getButtKaPHkGw = i;
                if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                }
                i4 |= i12;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            i4 |= i12;
        } else {
            iM1995getButtKaPHkGw = i;
        }
        if ((i4 & 374491) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i5 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i7 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 32) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i5 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i7 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 32) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
            }
            final float fCoerceIn14 = RangesKt.coerceIn(f, 0.0f, 1.0f);
            final Stroke stroke14 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
            final long j1111 = jM1705getTransparent0d7_KjU;
            final long j1112 = jM1023getPrimary0d7_KjU;
            CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn14, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float f10 = fCoerceIn14 * 360.0f;
                    ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j1111, stroke14);
                    ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f10, j1112, stroke14);
                }
            }, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i5 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i7 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 32) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i5 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i7 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 32) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746618448, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
            }
            final float fCoerceIn15 = RangesKt.coerceIn(f, 0.0f, 1.0f);
            final Stroke stroke15 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(fM1135getStrokeWidthD9Ej5fM), 0.0f, iM1995getButtKaPHkGw, 0, null, 26, null);
            final long j1113 = jM1705getTransparent0d7_KjU;
            final long j1114 = jM1023getPrimary0d7_KjU;
            CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn15, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float f10 = fCoerceIn15 * 360.0f;
                    ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j1113, stroke15);
                    ProgressIndicatorKt.m1151drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f10, j1114, stroke15);
                }
            }, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j3 = jM1023getPrimary0d7_KjU;
        j4 = jM1705getTransparent0d7_KjU;
        i9 = iM1995getButtKaPHkGw;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier10 = modifier2;
        final float f10 = fM1135getStrokeWidthD9Ej5fM;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                ProgressIndicatorKt.m1136CircularProgressIndicatorDUhRLBM(f, modifier10, j3, f10, j4, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2 A[PHI: r2 r6 r10 r12
      0x00c2: PHI (r2v5 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v6 androidx.compose.ui.Modifier) binds: [B:81:0x00f1, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v6 long) = (r6v3 long), (r6v2 long) binds: [B:81:0x00f1, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r10v17 float) = (r10v3 float), (r10v2 float) binds: [B:81:0x00f1, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r12v7 long) = (r12v3 long), (r12v2 long) binds: [B:81:0x00f1, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0237  */
    /* JADX WARN: Code duplicated, block: B:93:0x0245  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m1137CircularProgressIndicatorLxG7B9w(@Nullable Modifier modifier, long j, float f, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM1023getPrimary0d7_KjU;
        float fM1135getStrokeWidthD9Ej5fM;
        int i5;
        long jM1705getTransparent0d7_KjU;
        int i6;
        int i7;
        Modifier modifier3;
        int iM1997getSquareKaPHkGw;
        final float f2;
        long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119119072);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                jM1023getPrimary0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU) ? 32 : 16;
                i4 |= i9;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i4 |= i9;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 896) == 0) {
                fM1135getStrokeWidthD9Ej5fM = f;
                i4 |= composerStartRestartGroup.changed(fM1135getStrokeWidthD9Ej5fM) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    jM1705getTransparent0d7_KjU = j2;
                    if (composerStartRestartGroup.changed(jM1705getTransparent0d7_KjU)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        i7 = i;
                        int i11 = composerStartRestartGroup.changed(i7) ? 16384 : 8192;
                        i4 |= i11;
                    } else {
                        i7 = i;
                    }
                    i4 |= i11;
                } else {
                    i7 = i;
                }
                if ((i4 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i3 & 2) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        }
                        if (i10 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        }
                        if (i5 != 0) {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        if ((i3 & 16) != 0) {
                            iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                            f2 = fM1135getStrokeWidthD9Ej5fM;
                            j3 = jM1705getTransparent0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                        }
                        final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
                        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                        int i12 = iM1997getSquareKaPHkGw;
                        InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                        int i13 = InfiniteTransition.$stable;
                        int i14 = InfiniteRepeatableSpec.$stable;
                        final State stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default, composerStartRestartGroup, i13 | 4528 | (i14 << 12));
                        final State stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i13 | 432 | (i14 << 9));
                        final State stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                                keyframes.at(Float.valueOf(290.0f), 666);
                            }
                        }), null, 0L, 6, null), composerStartRestartGroup, i13 | 432 | (i14 << 9));
                        final State stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                                keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                            }
                        }), null, 0L, 6, null), composerStartRestartGroup, i13 | 432 | (i14 << 9));
                        final long j4 = j3;
                        final float f3 = f2;
                        final long j5 = jM1023getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j4, stroke);
                                ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat3) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue) * 216.0f) % 360.0f) - 90.0f), f3, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat2) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat3)), j5, stroke);
                            }
                        }, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i7 = i12;
                        jM1705getTransparent0d7_KjU = j3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                    iM1997getSquareKaPHkGw = i7;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    final Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    int i15 = iM1997getSquareKaPHkGw;
                    InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i16 = InfiniteTransition.$stable;
                    int i17 = InfiniteRepeatableSpec.$stable;
                    final State<Integer> stateAnimateValue2 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default2, composerStartRestartGroup, i16 | 4528 | (i17 << 12));
                    final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i16 | 432 | (i17 << 9));
                    final State<Float> stateAnimateFloat5 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1332);
                            keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                            keyframes.at(Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), composerStartRestartGroup, i16 | 432 | (i17 << 9));
                    final State<Float> stateAnimateFloat6 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1332);
                            keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                            keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                        }
                    }), null, 0L, 6, null), composerStartRestartGroup, i16 | 432 | (i17 << 9));
                    final long j6 = j3;
                    final float f4 = f2;
                    final long j7 = jM1023getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j6, stroke2);
                            ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat6) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat4) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue2) * 216.0f) % 360.0f) - 90.0f), f4, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat5) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat6)), j7, stroke2);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i7 = i15;
                    jM1705getTransparent0d7_KjU = j3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier4 = modifier3;
                final long j8 = jM1023getPrimary0d7_KjU;
                final long j9 = jM1705getTransparent0d7_KjU;
                final int i18 = i7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        ProgressIndicatorKt.m1137CircularProgressIndicatorLxG7B9w(modifier4, j8, f2, j9, i18, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
            i4 |= 3072;
            jM1705getTransparent0d7_KjU = j2;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    i7 = i;
                    if (composerStartRestartGroup.changed(i7)) {
                    }
                    i4 |= i11;
                } else {
                    i7 = i;
                }
                i4 |= i11;
            } else {
                i7 = i;
            }
            if ((i4 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                final Stroke stroke3 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                int i19 = iM1997getSquareKaPHkGw;
                InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default3 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i110 = InfiniteTransition.$stable;
                int i111 = InfiniteRepeatableSpec.$stable;
                final State<Integer> stateAnimateValue3 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition3, 0, 5, vectorConverter3, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default3, composerStartRestartGroup, i110 | 4528 | (i111 << 12));
                final State<Float> stateAnimateFloat7 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i110 | 432 | (i111 << 9));
                final State<Float> stateAnimateFloat8 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i110 | 432 | (i111 << 9));
                final State<Float> stateAnimateFloat9 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i110 | 432 | (i111 << 9));
                final long j10 = j3;
                final float f5 = f2;
                final long j11 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j10, stroke3);
                        ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat9) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat7) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue3) * 216.0f) % 360.0f) - 90.0f), f5, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat8) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat9)), j11, stroke3);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i7 = i19;
                jM1705getTransparent0d7_KjU = j3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                final Stroke stroke4 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition4 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                int i112 = iM1997getSquareKaPHkGw;
                InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default4 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i113 = InfiniteTransition.$stable;
                int i114 = InfiniteRepeatableSpec.$stable;
                final State<Integer> stateAnimateValue4 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition4, 0, 5, vectorConverter4, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default4, composerStartRestartGroup, i113 | 4528 | (i114 << 12));
                final State<Float> stateAnimateFloat10 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i113 | 432 | (i114 << 9));
                final State<Float> stateAnimateFloat11 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i113 | 432 | (i114 << 9));
                final State<Float> stateAnimateFloat12 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i113 | 432 | (i114 << 9));
                final long j12 = j3;
                final float f6 = f2;
                final long j13 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j12, stroke4);
                        ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat12) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat10) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue4) * 216.0f) % 360.0f) - 90.0f), f6, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat11) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat12)), j13, stroke4);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i7 = i112;
                jM1705getTransparent0d7_KjU = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier5 = modifier3;
            final long j14 = jM1023getPrimary0d7_KjU;
            final long j15 = jM1705getTransparent0d7_KjU;
            final int i115 = i7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i116) {
                    ProgressIndicatorKt.m1137CircularProgressIndicatorLxG7B9w(modifier5, j14, f2, j15, i115, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 384;
        fM1135getStrokeWidthD9Ej5fM = f;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                jM1705getTransparent0d7_KjU = j2;
                if (composerStartRestartGroup.changed(jM1705getTransparent0d7_KjU)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    i7 = i;
                    if (composerStartRestartGroup.changed(i7)) {
                    }
                    i4 |= i11;
                } else {
                    i7 = i;
                }
                i4 |= i11;
            } else {
                i7 = i;
            }
            if ((i4 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                final Stroke stroke5 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition5 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                int i116 = iM1997getSquareKaPHkGw;
                InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default5 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i117 = InfiniteTransition.$stable;
                int i118 = InfiniteRepeatableSpec.$stable;
                final State<Integer> stateAnimateValue5 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition5, 0, 5, vectorConverter5, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default5, composerStartRestartGroup, i117 | 4528 | (i118 << 12));
                final State<Float> stateAnimateFloat13 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i117 | 432 | (i118 << 9));
                final State<Float> stateAnimateFloat14 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i117 | 432 | (i118 << 9));
                final State<Float> stateAnimateFloat15 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i117 | 432 | (i118 << 9));
                final long j16 = j3;
                final float f7 = f2;
                final long j17 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j16, stroke5);
                        ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat15) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat13) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue5) * 216.0f) % 360.0f) - 90.0f), f7, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat14) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat15)), j17, stroke5);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i7 = i116;
                jM1705getTransparent0d7_KjU = j3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if (i10 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    if (i5 != 0) {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    if ((i3 & 16) != 0) {
                        iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                    } else {
                        f2 = fM1135getStrokeWidthD9Ej5fM;
                        j3 = jM1705getTransparent0d7_KjU;
                        iM1997getSquareKaPHkGw = i7;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                final Stroke stroke6 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition6 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                int i119 = iM1997getSquareKaPHkGw;
                InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default6 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i1110 = InfiniteTransition.$stable;
                int i1111 = InfiniteRepeatableSpec.$stable;
                final State<Integer> stateAnimateValue6 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition6, 0, 5, vectorConverter6, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default6, composerStartRestartGroup, i1110 | 4528 | (i1111 << 12));
                final State<Float> stateAnimateFloat16 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i1110 | 432 | (i1111 << 9));
                final State<Float> stateAnimateFloat17 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i1110 | 432 | (i1111 << 9));
                final State<Float> stateAnimateFloat18 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), composerStartRestartGroup, i1110 | 432 | (i1111 << 9));
                final long j18 = j3;
                final float f8 = f2;
                final long j19 = jM1023getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j18, stroke6);
                        ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat18) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat16) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue6) * 216.0f) % 360.0f) - 90.0f), f8, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat17) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat18)), j19, stroke6);
                    }
                }, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i7 = i119;
                jM1705getTransparent0d7_KjU = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier6 = modifier3;
            final long j110 = jM1023getPrimary0d7_KjU;
            final long j111 = jM1705getTransparent0d7_KjU;
            final int i1112 = i7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1113) {
                    ProgressIndicatorKt.m1137CircularProgressIndicatorLxG7B9w(modifier6, j110, f2, j111, i1112, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 3072;
        jM1705getTransparent0d7_KjU = j2;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                i7 = i;
                if (composerStartRestartGroup.changed(i7)) {
                }
                i4 |= i11;
            } else {
                i7 = i;
            }
            i4 |= i11;
        } else {
            i7 = i;
        }
        if ((i4 & 46811) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i10 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i5 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 16) != 0) {
                    iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                } else {
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                    iM1997getSquareKaPHkGw = i7;
                }
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i10 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i5 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 16) != 0) {
                    iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                } else {
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                    iM1997getSquareKaPHkGw = i7;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
            }
            final Stroke stroke7 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition7 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter7 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            int i1113 = iM1997getSquareKaPHkGw;
            InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default7 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i1114 = InfiniteTransition.$stable;
            int i1115 = InfiniteRepeatableSpec.$stable;
            final State<Integer> stateAnimateValue7 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition7, 0, 5, vectorConverter7, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default7, composerStartRestartGroup, i1114 | 4528 | (i1115 << 12));
            final State<Float> stateAnimateFloat19 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i1114 | 432 | (i1115 << 9));
            final State<Float> stateAnimateFloat110 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1332);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                    keyframes.at(Float.valueOf(290.0f), 666);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i1114 | 432 | (i1115 << 9));
            final State<Float> stateAnimateFloat111 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1332);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                    keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i1114 | 432 | (i1115 << 9));
            final long j112 = j3;
            final float f9 = f2;
            final long j113 = jM1023getPrimary0d7_KjU;
            CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j112, stroke7);
                    ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat111) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat19) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue7) * 216.0f) % 360.0f) - 90.0f), f9, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat110) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat111)), j113, stroke7);
                }
            }, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i7 = i1113;
            jM1705getTransparent0d7_KjU = j3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i10 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i5 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 16) != 0) {
                    iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                } else {
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                    iM1997getSquareKaPHkGw = i7;
                }
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if (i10 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                }
                if (i5 != 0) {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                if ((i3 & 16) != 0) {
                    iM1997getSquareKaPHkGw = StrokeCap.INSTANCE.m1997getSquareKaPHkGw();
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                } else {
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                    j3 = jM1705getTransparent0d7_KjU;
                    iM1997getSquareKaPHkGw = i7;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119119072, i2, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
            }
            final Stroke stroke8 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(f2), 0.0f, iM1997getSquareKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition8 = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter8 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            int i1116 = iM1997getSquareKaPHkGw;
            InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default8 = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i1117 = InfiniteTransition.$stable;
            int i1118 = InfiniteRepeatableSpec.$stable;
            final State<Integer> stateAnimateValue8 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition8, 0, 5, vectorConverter8, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default8, composerStartRestartGroup, i1117 | 4528 | (i1118 << 12));
            final State<Float> stateAnimateFloat112 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, BaseRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), composerStartRestartGroup, i1117 | 432 | (i1118 << 9));
            final State<Float> stateAnimateFloat113 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1332);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                    keyframes.at(Float.valueOf(290.0f), 666);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i1117 | 432 | (i1118 << 9));
            final State<Float> stateAnimateFloat114 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, JumpRotationAngle, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1332);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                    keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i1117 | 432 | (i1118 << 9));
            final long j114 = j3;
            final float f10 = f2;
            final long j115 = jM1023getPrimary0d7_KjU;
            CanvasKt.Canvas(SizeKt.m523size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.m1150drawCircularIndicatorBackgroundbw27NRU(Canvas, j114, stroke8);
                    ProgressIndicatorKt.m1152drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat114) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat112) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue8) * 216.0f) % 360.0f) - 90.0f), f10, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat113) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat114)), j115, stroke8);
                }
            }, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i7 = i1116;
            jM1705getTransparent0d7_KjU = j3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier7 = modifier3;
        final long j116 = jM1023getPrimary0d7_KjU;
        final long j117 = jM1705getTransparent0d7_KjU;
        final int i1119 = i7;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11110) {
                ProgressIndicatorKt.m1137CircularProgressIndicatorLxG7B9w(modifier7, j116, f2, j117, i1119, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa A[PHI: r3 r4 r7
      0x00aa: PHI (r3v16 int) = (r3v12 int), (r3v17 int) binds: [B:68:0x00c5, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r4v5 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v7 androidx.compose.ui.Modifier) binds: [B:68:0x00c5, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r7v15 long) = (r7v7 long), (r7v6 long) binds: [B:68:0x00c5, B:60:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m1138CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM1023getPrimary0d7_KjU;
        int i4;
        float f3;
        int i5;
        Modifier modifier3;
        final float fM1135getStrokeWidthD9Ej5fM;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-409649739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    jM1023getPrimary0d7_KjU = j;
                    int i7 = composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i3 |= i7;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                i3 |= i7;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f3 = f2;
                    if (composerStartRestartGroup.changed(f3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                            j2 = jM1023getPrimary0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                        }
                        m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    j2 = jM1023getPrimary0d7_KjU;
                    fM1135getStrokeWidthD9Ej5fM = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                    }
                    m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j2 = jM1023getPrimary0d7_KjU;
                    fM1135getStrokeWidthD9Ej5fM = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier4 = modifier3;
                final long j3 = j2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i8) {
                        ProgressIndicatorKt.m1138CircularProgressIndicatorMBs18nI(f, modifier4, j3, fM1135getStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            f3 = f2;
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier5 = modifier3;
            final long j4 = j2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    ProgressIndicatorKt.m1138CircularProgressIndicatorMBs18nI(f, modifier5, j4, fM1135getStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM1023getPrimary0d7_KjU = j;
                if (composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU)) {
                }
                i3 |= i7;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i3 |= i7;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                        j2 = jM1023getPrimary0d7_KjU;
                    } else {
                        j2 = jM1023getPrimary0d7_KjU;
                        fM1135getStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier6 = modifier3;
            final long j5 = j2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    ProgressIndicatorKt.m1138CircularProgressIndicatorMBs18nI(f, modifier6, j5, fM1135getStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        f3 = f2;
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    j2 = jM1023getPrimary0d7_KjU;
                } else {
                    j2 = jM1023getPrimary0d7_KjU;
                    fM1135getStrokeWidthD9Ej5fM = f3;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    j2 = jM1023getPrimary0d7_KjU;
                } else {
                    j2 = jM1023getPrimary0d7_KjU;
                    fM1135getStrokeWidthD9Ej5fM = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
            }
            m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    j2 = jM1023getPrimary0d7_KjU;
                } else {
                    j2 = jM1023getPrimary0d7_KjU;
                    fM1135getStrokeWidthD9Ej5fM = f3;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    j2 = jM1023getPrimary0d7_KjU;
                } else {
                    j2 = jM1023getPrimary0d7_KjU;
                    fM1135getStrokeWidthD9Ej5fM = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
            }
            m1136CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier7 = modifier3;
        final long j6 = j2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                ProgressIndicatorKt.m1138CircularProgressIndicatorMBs18nI(f, modifier7, j6, fM1135getStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c A[PHI: r2 r4 r6
      0x008c: PHI (r2v5 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v7 androidx.compose.ui.Modifier) binds: [B:58:0x00ab, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r4v13 int) = (r4v10 int), (r4v14 int) binds: [B:58:0x00ab, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r6v10 long) = (r6v3 long), (r6v2 long) binds: [B:58:0x00ab, B:49:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final /* synthetic */ void m1139CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM1023getPrimary0d7_KjU;
        float f2;
        Modifier modifier3;
        float fM1135getStrokeWidthD9Ej5fM;
        int i4;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-392089979);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                jM1023getPrimary0d7_KjU = j;
                int i6 = composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU) ? 32 : 16;
                i3 |= i6;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i3 |= i6;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -113;
                    }
                    if (i7 != 0) {
                        fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                    }
                    long j3 = jM1023getPrimary0d7_KjU;
                    i4 = i3;
                    j2 = j3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-392089979, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
                    }
                    m1137CircularProgressIndicatorLxG7B9w(modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1997getSquareKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = fM1135getStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    modifier3 = modifier2;
                }
                fM1135getStrokeWidthD9Ej5fM = f2;
                long j4 = jM1023getPrimary0d7_KjU;
                i4 = i3;
                j2 = j4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-392089979, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
                }
                m1137CircularProgressIndicatorLxG7B9w(modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1997getSquareKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM1135getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j2 = jM1023getPrimary0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier4 = modifier3;
            final long j5 = j2;
            final float f3 = f2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    ProgressIndicatorKt.m1139CircularProgressIndicatoraMcp0Q(modifier4, j5, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                } else {
                    fM1135getStrokeWidthD9Ej5fM = f2;
                }
            } else {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                } else {
                    fM1135getStrokeWidthD9Ej5fM = f2;
                }
            }
            long j6 = jM1023getPrimary0d7_KjU;
            i4 = i3;
            j2 = j6;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392089979, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
            }
            m1137CircularProgressIndicatorLxG7B9w(modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1997getSquareKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM1135getStrokeWidthD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                } else {
                    fM1135getStrokeWidthD9Ej5fM = f2;
                }
            } else {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM1135getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1135getStrokeWidthD9Ej5fM();
                } else {
                    fM1135getStrokeWidthD9Ej5fM = f2;
                }
            }
            long j7 = jM1023getPrimary0d7_KjU;
            i4 = i3;
            j2 = j7;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392089979, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
            }
            m1137CircularProgressIndicatorLxG7B9w(modifier3, j2, fM1135getStrokeWidthD9Ej5fM, Color.INSTANCE.m1705getTransparent0d7_KjU(), StrokeCap.INSTANCE.m1997getSquareKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM1135getStrokeWidthD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier5 = modifier3;
        final long j8 = j2;
        final float f4 = f2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                ProgressIndicatorKt.m1139CircularProgressIndicatoraMcp0Q(modifier5, j8, f4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m1140LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM1023getPrimary0d7_KjU;
        long jM1669copywmQWz5c$default;
        int iM1995getButtKaPHkGw;
        Modifier modifier3;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501635280);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                jM1023getPrimary0d7_KjU = j;
                int i7 = composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU) ? 32 : 16;
                i4 |= i7;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i4 |= i7;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                jM1669copywmQWz5c$default = j2;
                int i8 = composerStartRestartGroup.changed(jM1669copywmQWz5c$default) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i4 |= i8;
            } else {
                jM1669copywmQWz5c$default = j2;
            }
            i4 |= i8;
        } else {
            jM1669copywmQWz5c$default = j2;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                iM1995getButtKaPHkGw = i;
                if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                    i5 = 2048;
                }
                i4 |= i5;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i4 |= i5;
        } else {
            iM1995getButtKaPHkGw = i;
        }
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if ((i3 & 4) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i3 & 8) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
            InfiniteRepeatableSpec infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default = AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(Constants.ERR_AUDIO_BT_NO_ROUTE);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframes.at(Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null);
            int i9 = InfiniteTransition.$stable;
            int i10 = InfiniteRepeatableSpec.$stable;
            final State stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM81infiniteRepeatable9IiC70o$default, composerStartRestartGroup, i9 | 432 | (i10 << 9));
            final State stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(Constants.ERR_AUDIO_BT_NO_ROUTE);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframes.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i9 | 432 | (i10 << 9));
            final State stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(Constants.ERR_AUDIO_BT_NO_ROUTE);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframes.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i9 | 432 | (i10 << 9));
            final State stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(Constants.ERR_AUDIO_BT_NO_ROUTE);
                    keyframes.with(keyframes.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframes.at(Float.valueOf(1.0f), Constants.ERR_AUDIO_BT_NO_ROUTE);
                }
            }), null, 0L, 6, null), composerStartRestartGroup, i9 | 432 | (i10 << 9));
            Modifier modifierM525sizeVpY3zN4 = SizeKt.m525sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr = {Color.m1660boximpl(jM1669copywmQWz5c$default), StrokeCap.m1988boximpl(iM1995getButtKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m1660boximpl(jM1023getPrimary0d7_KjU), stateAnimateFloat3, stateAnimateFloat4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i11 = 0; i11 < 7; i11++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i11]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final long j3 = jM1669copywmQWz5c$default;
                final int i12 = iM1995getButtKaPHkGw;
                final long j4 = jM1023getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM1502getHeightimpl = Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc());
                        ProgressIndicatorKt.m1154drawLinearIndicatorBackgroundAZGd3zU(Canvas, j3, fM1502getHeightimpl, i12);
                        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2) > 0.0f) {
                            ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2), j4, fM1502getHeightimpl, i12);
                        }
                        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4) > 0.0f) {
                            ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4), j4, fM1502getHeightimpl, i12);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM525sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final long j5 = jM1669copywmQWz5c$default;
        final int i13 = iM1995getButtKaPHkGw;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier4 = modifier3;
        final long j6 = jM1023getPrimary0d7_KjU;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i14) {
                ProgressIndicatorKt.m1140LinearProgressIndicator2cYBFYY(modifier4, j6, j5, i13, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1141LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM1023getPrimary0d7_KjU;
        long jM1669copywmQWz5c$default;
        Modifier modifier3;
        long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-819397058);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            jM1023getPrimary0d7_KjU = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU)) ? 32 : 16;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        if ((i & 896) == 0) {
            jM1669copywmQWz5c$default = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM1669copywmQWz5c$default)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            jM1669copywmQWz5c$default = j2;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = jM1023getPrimary0d7_KjU;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
            }
            int i5 = i3;
            j3 = jM1023getPrimary0d7_KjU;
            long j4 = jM1669copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m1140LinearProgressIndicator2cYBFYY(modifier3, j3, j4, StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i5 & 14) | (i5 & 112) | (i5 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM1669copywmQWz5c$default = j4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier4 = modifier3;
        final long j5 = j3;
        final long j6 = jM1669copywmQWz5c$default;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                ProgressIndicatorKt.m1141LinearProgressIndicatorRIQooxk(modifier4, j5, j6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c A[LOOP:0: B:85:0x014a->B:86:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0165  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:98:0x0191  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m1142LinearProgressIndicator_5eSRE(final float f, @Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long jM1023getPrimary0d7_KjU;
        long jM1669copywmQWz5c$default;
        int iM1995getButtKaPHkGw;
        final float fCoerceIn;
        Object[] objArr;
        int i5;
        boolean zChanged;
        Object objRememberedValue;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-531984864);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    jM1023getPrimary0d7_KjU = j;
                    int i8 = composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i4 |= i8;
                } else {
                    jM1023getPrimary0d7_KjU = j;
                }
                i4 |= i8;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    jM1669copywmQWz5c$default = j2;
                    if (composerStartRestartGroup.changed(jM1669copywmQWz5c$default)) {
                        i6 = 2048;
                    }
                    i4 |= i6;
                } else {
                    jM1669copywmQWz5c$default = j2;
                }
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i4 |= i6;
            } else {
                jM1669copywmQWz5c$default = j2;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    iM1995getButtKaPHkGw = i;
                    int i9 = composerStartRestartGroup.changed(iM1995getButtKaPHkGw) ? 16384 : 8192;
                    i4 |= i9;
                } else {
                    iM1995getButtKaPHkGw = i;
                }
                i4 |= i9;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            if ((i4 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    }
                    if ((i3 & 8) != 0) {
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if ((i3 & 16) != 0) {
                        iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531984864, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
                Modifier modifierM525sizeVpY3zN4 = SizeKt.m525sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                objArr = new Object[]{Color.m1660boximpl(jM1669copywmQWz5c$default), StrokeCap.m1988boximpl(iM1995getButtKaPHkGw), Float.valueOf(fCoerceIn), Color.m1660boximpl(jM1023getPrimary0d7_KjU)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i5 = 0;
                zChanged = false;
                for (int i10 = 4; i5 < i10; i10 = 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i5]);
                    i5++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j5 = jM1669copywmQWz5c$default;
                    final int i11 = iM1995getButtKaPHkGw;
                    final long j6 = jM1023getPrimary0d7_KjU;
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float fM1502getHeightimpl = Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc());
                            ProgressIndicatorKt.m1154drawLinearIndicatorBackgroundAZGd3zU(Canvas, j5, fM1502getHeightimpl, i11);
                            ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, 0.0f, fCoerceIn, j6, fM1502getHeightimpl, i11);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM525sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            j3 = jM1023getPrimary0d7_KjU;
            j4 = jM1669copywmQWz5c$default;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier3 = modifier2;
            final int i12 = iM1995getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    ProgressIndicatorKt.m1142LinearProgressIndicator_5eSRE(f, modifier3, j3, j4, i12, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                jM1023getPrimary0d7_KjU = j;
                if (composerStartRestartGroup.changed(jM1023getPrimary0d7_KjU)) {
                }
                i4 |= i8;
            } else {
                jM1023getPrimary0d7_KjU = j;
            }
            i4 |= i8;
        } else {
            jM1023getPrimary0d7_KjU = j;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                jM1669copywmQWz5c$default = j2;
                if (composerStartRestartGroup.changed(jM1669copywmQWz5c$default)) {
                    i6 = 2048;
                }
                i4 |= i6;
            } else {
                jM1669copywmQWz5c$default = j2;
            }
            i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i4 |= i6;
        } else {
            jM1669copywmQWz5c$default = j2;
        }
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                iM1995getButtKaPHkGw = i;
                if (composerStartRestartGroup.changed(iM1995getButtKaPHkGw)) {
                }
                i4 |= i9;
            } else {
                iM1995getButtKaPHkGw = i;
            }
            i4 |= i9;
        } else {
            iM1995getButtKaPHkGw = i;
        }
        if ((i4 & 46811) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if ((i3 & 8) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i3 & 16) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if ((i3 & 8) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i3 & 16) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531984864, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
            }
            fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
            Modifier modifierM525sizeVpY3zN5 = SizeKt.m525sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
            objArr = new Object[]{Color.m1660boximpl(jM1669copywmQWz5c$default), StrokeCap.m1988boximpl(iM1995getButtKaPHkGw), Float.valueOf(fCoerceIn), Color.m1660boximpl(jM1023getPrimary0d7_KjU)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i5 = 0;
            zChanged = false;
            while (i5 < i10) {
                zChanged |= composerStartRestartGroup.changed(objArr[i5]);
                i5++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                final long j7 = jM1669copywmQWz5c$default;
                final int i13 = iM1995getButtKaPHkGw;
                final long j8 = jM1023getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM1502getHeightimpl = Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc());
                        ProgressIndicatorKt.m1154drawLinearIndicatorBackgroundAZGd3zU(Canvas, j7, fM1502getHeightimpl, i13);
                        ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, 0.0f, fCoerceIn, j8, fM1502getHeightimpl, i13);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final long j9 = jM1669copywmQWz5c$default;
                final int i14 = iM1995getButtKaPHkGw;
                final long j10 = jM1023getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM1502getHeightimpl = Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc());
                        ProgressIndicatorKt.m1154drawLinearIndicatorBackgroundAZGd3zU(Canvas, j9, fM1502getHeightimpl, i14);
                        ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, 0.0f, fCoerceIn, j10, fM1502getHeightimpl, i14);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM525sizeVpY3zN5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if ((i3 & 8) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i3 & 16) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                }
                if ((i3 & 8) != 0) {
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i3 & 16) != 0) {
                    iM1995getButtKaPHkGw = StrokeCap.INSTANCE.m1995getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531984864, i2, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
            }
            fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
            Modifier modifierM525sizeVpY3zN6 = SizeKt.m525sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
            objArr = new Object[]{Color.m1660boximpl(jM1669copywmQWz5c$default), StrokeCap.m1988boximpl(iM1995getButtKaPHkGw), Float.valueOf(fCoerceIn), Color.m1660boximpl(jM1023getPrimary0d7_KjU)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i5 = 0;
            zChanged = false;
            while (i5 < i10) {
                zChanged |= composerStartRestartGroup.changed(objArr[i5]);
                i5++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                final long j11 = jM1669copywmQWz5c$default;
                final int i15 = iM1995getButtKaPHkGw;
                final long j12 = jM1023getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM1502getHeightimpl = Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc());
                        ProgressIndicatorKt.m1154drawLinearIndicatorBackgroundAZGd3zU(Canvas, j11, fM1502getHeightimpl, i15);
                        ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, 0.0f, fCoerceIn, j12, fM1502getHeightimpl, i15);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final long j13 = jM1669copywmQWz5c$default;
                final int i16 = iM1995getButtKaPHkGw;
                final long j14 = jM1023getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fM1502getHeightimpl = Size.m1502getHeightimpl(Canvas.mo2108getSizeNHjbRc());
                        ProgressIndicatorKt.m1154drawLinearIndicatorBackgroundAZGd3zU(Canvas, j13, fM1502getHeightimpl, i16);
                        ProgressIndicatorKt.m1153drawLinearIndicatorqYKTg0g(Canvas, 0.0f, fCoerceIn, j14, fM1502getHeightimpl, i16);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM525sizeVpY3zN6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j3 = jM1023getPrimary0d7_KjU;
        j4 = jM1669copywmQWz5c$default;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier4 = modifier2;
        final int i17 = iM1995getButtKaPHkGw;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i18) {
                ProgressIndicatorKt.m1142LinearProgressIndicator_5eSRE(f, modifier4, j3, j4, i17, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db A[PHI: r3 r4 r5
      0x00db: PHI (r3v16 int) = (r3v11 int), (r3v18 int) binds: [B:70:0x00c6, B:61:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r4v5 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v8 androidx.compose.ui.Modifier) binds: [B:70:0x00c6, B:61:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r5v11 long) = (r5v5 long), (r5v12 long) binds: [B:70:0x00c6, B:61:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m1143LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        Modifier modifier3;
        long jM1023getPrimary0d7_KjU;
        long jM1669copywmQWz5c$default;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850309746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                j3 = j;
                if ((i2 & 4) == 0 || !composerStartRestartGroup.changed(j3)) {
                    i5 = 128;
                } else {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & 7168) == 0) {
                j4 = j2;
                if ((i2 & 8) == 0 || !composerStartRestartGroup.changed(j4)) {
                    i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM1023getPrimary0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
                    }
                    m1142LinearProgressIndicator_5eSRE(f, modifier3, jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = jM1023getPrimary0d7_KjU;
                    j5 = jM1669copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    jM1023getPrimary0d7_KjU = j3;
                }
                jM1669copywmQWz5c$default = j4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
                }
                m1142LinearProgressIndicator_5eSRE(f, modifier3, jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = jM1023getPrimary0d7_KjU;
                j5 = jM1669copywmQWz5c$default;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier4 = modifier3;
            final long j6 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    ProgressIndicatorKt.m1143LinearProgressIndicatoreaDK9VM(f, modifier4, j6, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            j3 = j;
            if ((i2 & 4) == 0) {
                i5 = 128;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 7168) == 0) {
            j4 = j2;
            if ((i2 & 8) == 0) {
                i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else {
                i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i4;
        } else {
            j4 = j2;
        }
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                } else {
                    jM1023getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j4;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                } else {
                    jM1023getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j4;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
            }
            m1142LinearProgressIndicator_5eSRE(f, modifier3, jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = jM1023getPrimary0d7_KjU;
            j5 = jM1669copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                } else {
                    jM1023getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j4;
                }
            } else {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM1023getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1023getPrimary0d7_KjU();
                    i3 &= -897;
                } else {
                    jM1023getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM1669copywmQWz5c$default = Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM1669copywmQWz5c$default = j4;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
            }
            m1142LinearProgressIndicator_5eSRE(f, modifier3, jM1023getPrimary0d7_KjU, jM1669copywmQWz5c$default, StrokeCap.INSTANCE.m1995getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = jM1023getPrimary0d7_KjU;
            j5 = jM1669copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier5 = modifier3;
        final long j7 = j3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                ProgressIndicatorKt.m1143LinearProgressIndicatoreaDK9VM(f, modifier5, j7, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1149drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float fM1505getWidthimpl = Size.m1505getWidthimpl(drawScope.mo2108getSizeNHjbRc()) - (f3 * width);
        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo0O(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM1505getWidthimpl, fM1505getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1150drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m1149drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1151drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m1149drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1152drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m1149drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m1991equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m1995getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m3765constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1153drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float fM1505getWidthimpl = Size.m1505getWidthimpl(drawScope.mo2108getSizeNHjbRc());
        float fM1502getHeightimpl = Size.m1502getHeightimpl(drawScope.mo2108getSizeNHjbRc());
        float f4 = 2;
        float f5 = fM1502getHeightimpl / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * fM1505getWidthimpl;
        float f7 = (z ? f2 : 1.0f - f) * fM1505getWidthimpl;
        if (StrokeCap.m1991equalsimpl0(i, StrokeCap.INSTANCE.m1995getButtKaPHkGw()) || fM1502getHeightimpl > fM1505getWidthimpl) {
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(f8, fM1505getWidthimpl - f8);
        float fFloatValue = ((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(f6), (ClosedFloatingPointRange<Float>) closedFloatingPointRangeRangeTo)).floatValue();
        float fFloatValue2 = ((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(f7), (ClosedFloatingPointRange<Float>) closedFloatingPointRangeRangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(drawScope, j, OffsetKt.Offset(fFloatValue, f5), OffsetKt.Offset(fFloatValue2, f5), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1154drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m1153drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }
}
