package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a?\u0010!\u001a\u00020\u0014*\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010\u001c\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u0014*\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\n\u0010\u000b\"\u0013\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u000b\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,380:1\n25#2:381\n460#2,13:410\n473#2,3:424\n25#2:429\n50#2:436\n49#2:437\n36#2:444\n36#2:454\n1114#3,6:382\n1114#3,6:430\n1114#3,6:438\n1114#3,6:445\n1114#3,6:455\n76#4:388\n76#4:390\n76#4:398\n76#4:451\n76#4:452\n1#5:389\n67#6,6:391\n73#6:423\n77#6:428\n75#7:397\n76#7,11:399\n89#7:427\n51#8:453\n58#8:468\n76#9:461\n76#9:462\n154#10:463\n154#10:464\n154#10:465\n154#10:466\n154#10:467\n154#10:469\n154#10:470\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n94#1:381\n115#1:410,13\n115#1:424,3\n185#1:429\n187#1:436\n187#1:437\n208#1:444\n223#1:454\n94#1:382,6\n185#1:430,6\n187#1:438,6\n208#1:445,6\n223#1:455,6\n98#1:388\n100#1:390\n115#1:398\n212#1:451\n213#1:452\n115#1:391,6\n115#1:423\n115#1:428\n115#1:397\n115#1:399,11\n115#1:427\n213#1:453\n254#1:468\n206#1:461\n211#1:462\n245#1:463\n246#1:464\n247#1:465\n249#1:466\n251#1:467\n258#1:469\n259#1:470\n*E\n"})
public final class SwitchKt {

    @NotNull
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float fM3765constructorimpl = Dp.m3765constructorimpl(34);
        TrackWidth = fM3765constructorimpl;
        TrackStrokeWidth = Dp.m3765constructorimpl(14);
        float fM3765constructorimpl2 = Dp.m3765constructorimpl(20);
        ThumbDiameter = fM3765constructorimpl2;
        ThumbRippleRadius = Dp.m3765constructorimpl(24);
        DefaultSwitchPadding = Dp.m3765constructorimpl(2);
        SwitchWidth = fM3765constructorimpl;
        SwitchHeight = fM3765constructorimpl2;
        ThumbPathLength = Dp.m3765constructorimpl(fM3765constructorimpl - fM3765constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m3765constructorimpl(1);
        ThumbPressedElevation = Dp.m3765constructorimpl(6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:104:0x017b  */
    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:108:0x019d  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:127:0x0277  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x014b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Switch(final boolean z, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SwitchColors switchColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        SwitchColors switchColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        Modifier modifier4;
        boolean z5;
        SwitchColors switchColorsM1203colorsSQMK_m0;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue;
        Function1<? super Boolean, Unit> function2;
        boolean z6;
        Modifier modifierM702toggleableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean z7;
        Function0<ComposeUiNode> constructor;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource5;
        final SwitchColors switchColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(25866825);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            int i10 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i3 |= i10;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            if (i6 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) != 0) {
                                i8 = i3 & (-458753);
                                modifier4 = modifier3;
                                z5 = z4;
                                switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                z3 = z4;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                            }
                            float fMo324toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            if (function1 == null) {
                                function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                                    public final void invoke(boolean z8) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                function2 = function1;
                            }
                            SwipeableState swipeableStateRememberSwipeableStateFor = SwipeableKt.rememberSwipeableStateFor(boolValueOf, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (function1 != null) {
                                modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                            } else {
                                modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                            }
                            if (function1 != null) {
                                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                            } else {
                                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                            }
                            Modifier modifierThen = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                            Map mapMapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_4), Boolean.TRUE));
                            Orientation orientation = Orientation.Horizontal;
                            if (z5 || function1 == null) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            Modifier modifierM1195swipeablepPrIpRY = SwipeableKt.m1195swipeablepPrIpRY(modifierThen, swipeableStateRememberSwipeableStateFor, mapMapOf, orientation, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                                }
                            } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                                    return invoke(bool.booleanValue(), bool2.booleanValue());
                                }

                                @NotNull
                                public final ThresholdConfig invoke(boolean z8, boolean z9) {
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Modifier modifierM517requiredSizeVpY3zN4 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY, companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN4);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerStartRestartGroup.disableReusing();
                            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                            composer2 = composerStartRestartGroup;
                            int i11 = i8;
                            Modifier modifier5 = modifier4;
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                            int i12 = i11 << 3;
                            SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor.getOffset(), mutableInteractionSource4, composer2, ((i11 >> 6) & 7168) | (i12 & 112) | 6 | ((i11 >> 3) & 896) | (i12 & 458752));
                            if (OooOO0.OooO0O0(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier5;
                            z3 = z5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            switchColors3 = switchColorsM1203colorsSQMK_m0;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                        }
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                        }
                        float fMo324toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        if (function1 == null) {
                            function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                                public final void invoke(boolean z8) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        SwipeableState swipeableStateRememberSwipeableStateFor2 = SwipeableKt.rememberSwipeableStateFor(boolValueOf2, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (function1 != null) {
                            modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                        } else {
                            modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        if (function1 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierThen2 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                        Map mapMapOf2 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_5), Boolean.TRUE));
                        Orientation orientation2 = Orientation.Horizontal;
                        if (z5) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        Modifier modifierM1195swipeablepPrIpRY2 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen2, swipeableStateRememberSwipeableStateFor2, mapMapOf2, orientation2, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                            }
                        } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                                return invoke(bool.booleanValue(), bool2.booleanValue());
                            }

                            @NotNull
                            public final ThresholdConfig invoke(boolean z8, boolean z9) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf2.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Modifier modifierM517requiredSizeVpY3zN5 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY2, companion3.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        composer2 = composerStartRestartGroup;
                        int i13 = i8;
                        Modifier modifier6 = modifier4;
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                        int i14 = i13 << 3;
                        SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor2.getOffset(), mutableInteractionSource4, composer2, ((i13 >> 6) & 7168) | (i14 & 112) | 6 | ((i13 >> 3) & 896) | (i14 & 458752));
                        if (OooOO0.OooO0O0(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier6;
                        z3 = z5;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors3 = switchColorsM1203colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors3 = switchColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final boolean z8 = z3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i15) {
                            SwitchKt.Switch(z, function1, modifier2, z8, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i10;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                    }
                    float fMo324toPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z9) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor3 = SwipeableKt.rememberSwipeableStateFor(boolValueOf3, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen3 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                    Map mapMapOf3 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_6), Boolean.TRUE));
                    Orientation orientation3 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM1195swipeablepPrIpRY3 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen3, swipeableStateRememberSwipeableStateFor3, mapMapOf3, orientation3, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z9, boolean z10) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf3.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Modifier modifierM517requiredSizeVpY3zN6 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY3, companion5.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion5, false, composerStartRestartGroup, 0, -1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    composer2 = composerStartRestartGroup;
                    int i15 = i8;
                    Modifier modifier7 = modifier4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion6, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer2, composer2), composer2, 2058660585);
                    int i16 = i15 << 3;
                    SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor3.getOffset(), mutableInteractionSource4, composer2, ((i15 >> 6) & 7168) | (i16 & 112) | 6 | ((i15 >> 3) & 896) | (i16 & 458752));
                    if (OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier7;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1203colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                    }
                    float fMo324toPx0680j_7 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z9) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor4 = SwipeableKt.rememberSwipeableStateFor(boolValueOf4, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen4 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                    Map mapMapOf4 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_7), Boolean.TRUE));
                    Orientation orientation4 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM1195swipeablepPrIpRY4 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen4, swipeableStateRememberSwipeableStateFor4, mapMapOf4, orientation4, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z9, boolean z10) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf4.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    Modifier modifierM517requiredSizeVpY3zN7 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY4, companion7.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o4 = p018OooOoo0.OooOOO.OooO00o(companion7, false, composerStartRestartGroup, 0, -1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    constructor = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    composer2 = composerStartRestartGroup;
                    int i17 = i8;
                    Modifier modifier8 = modifier4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf4, OooO0OO.OooO00o(companion8, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, density4, composerM1309constructorimpl4, layoutDirection4, composerM1309constructorimpl4, viewConfiguration4, composer2, composer2), composer2, 2058660585);
                    int i18 = i17 << 3;
                    SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor4.getOffset(), mutableInteractionSource4, composer2, ((i17 >> 6) & 7168) | (i18 & 112) | 6 | ((i17 >> 3) & 896) | (i18 & 458752));
                    if (OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier8;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1203colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z9 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i19) {
                        SwitchKt.Switch(z, function1, modifier2, z9, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i10;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                    }
                    float fMo324toPx0680j_8 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf5 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z10) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor5 = SwipeableKt.rememberSwipeableStateFor(boolValueOf5, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen5 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                    Map mapMapOf5 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_8), Boolean.TRUE));
                    Orientation orientation5 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM1195swipeablepPrIpRY5 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen5, swipeableStateRememberSwipeableStateFor5, mapMapOf5, orientation5, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z10, boolean z11) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf5.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    Modifier modifierM517requiredSizeVpY3zN8 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY5, companion9.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o5 = p018OooOoo0.OooOOO.OooO00o(companion9, false, composerStartRestartGroup, 0, -1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    composer2 = composerStartRestartGroup;
                    int i19 = i8;
                    Modifier modifier9 = modifier4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf5, OooO0OO.OooO00o(companion10, composerM1309constructorimpl5, measurePolicyOooO00o5, composerM1309constructorimpl5, density5, composerM1309constructorimpl5, layoutDirection5, composerM1309constructorimpl5, viewConfiguration5, composer2, composer2), composer2, 2058660585);
                    int i110 = i19 << 3;
                    SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor5.getOffset(), mutableInteractionSource4, composer2, ((i19 >> 6) & 7168) | (i110 & 112) | 6 | ((i19 >> 3) & 896) | (i110 & 458752));
                    if (OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier9;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1203colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                    }
                    float fMo324toPx0680j_9 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z10) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor6 = SwipeableKt.rememberSwipeableStateFor(boolValueOf6, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen6 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                    Map mapMapOf6 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_9), Boolean.TRUE));
                    Orientation orientation6 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM1195swipeablepPrIpRY6 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen6, swipeableStateRememberSwipeableStateFor6, mapMapOf6, orientation6, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z10, boolean z11) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf6.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    Modifier modifierM517requiredSizeVpY3zN9 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY6, companion11.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o6 = p018OooOoo0.OooOOO.OooO00o(companion11, false, composerStartRestartGroup, 0, -1323940314);
                    Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    composer2 = composerStartRestartGroup;
                    int i111 = i8;
                    Modifier modifier10 = modifier4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf6, OooO0OO.OooO00o(companion12, composerM1309constructorimpl6, measurePolicyOooO00o6, composerM1309constructorimpl6, density6, composerM1309constructorimpl6, layoutDirection6, composerM1309constructorimpl6, viewConfiguration6, composer2, composer2), composer2, 2058660585);
                    int i112 = i111 << 3;
                    SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor6.getOffset(), mutableInteractionSource4, composer2, ((i111 >> 6) & 7168) | (i112 & 112) | 6 | ((i111 >> 3) & 896) | (i112 & 458752));
                    if (OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier10;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1203colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z10 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i113) {
                        SwitchKt.Switch(z, function1, modifier2, z10, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i3 |= i10;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i10;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                }
                float fMo324toPx0680j_10 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf7 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        public final void invoke(boolean z11) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor7 = SwipeableKt.rememberSwipeableStateFor(boolValueOf7, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                } else {
                    modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen7 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                Map mapMapOf7 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_10), Boolean.TRUE));
                Orientation orientation7 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM1195swipeablepPrIpRY7 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen7, swipeableStateRememberSwipeableStateFor7, mapMapOf7, orientation7, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z11, boolean z12) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf7.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                Modifier modifierM517requiredSizeVpY3zN10 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY7, companion13.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o7 = p018OooOoo0.OooOOO.OooO00o(companion13, false, composerStartRestartGroup, 0, -1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl7 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                int i113 = i8;
                Modifier modifier11 = modifier4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf7, OooO0OO.OooO00o(companion14, composerM1309constructorimpl7, measurePolicyOooO00o7, composerM1309constructorimpl7, density7, composerM1309constructorimpl7, layoutDirection7, composerM1309constructorimpl7, viewConfiguration7, composer2, composer2), composer2, 2058660585);
                int i114 = i113 << 3;
                SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor7.getOffset(), mutableInteractionSource4, composer2, ((i113 >> 6) & 7168) | (i114 & 112) | 6 | ((i113 >> 3) & 896) | (i114 & 458752));
                if (OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier11;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1203colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                }
                float fMo324toPx0680j_11 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf8 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        public final void invoke(boolean z11) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor8 = SwipeableKt.rememberSwipeableStateFor(boolValueOf8, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                } else {
                    modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen8 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                Map mapMapOf8 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_11), Boolean.TRUE));
                Orientation orientation8 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM1195swipeablepPrIpRY8 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen8, swipeableStateRememberSwipeableStateFor8, mapMapOf8, orientation8, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z11, boolean z12) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf8.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion15 = Alignment.INSTANCE;
                Modifier modifierM517requiredSizeVpY3zN11 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY8, companion15.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o8 = p018OooOoo0.OooOOO.OooO00o(companion15, false, composerStartRestartGroup, 0, -1323940314);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                constructor = companion16.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl8 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                int i115 = i8;
                Modifier modifier12 = modifier4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf8, OooO0OO.OooO00o(companion16, composerM1309constructorimpl8, measurePolicyOooO00o8, composerM1309constructorimpl8, density8, composerM1309constructorimpl8, layoutDirection8, composerM1309constructorimpl8, viewConfiguration8, composer2, composer2), composer2, 2058660585);
                int i116 = i115 << 3;
                SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor8.getOffset(), mutableInteractionSource4, composer2, ((i115 >> 6) & 7168) | (i116 & 112) | 6 | ((i115 >> 3) & 896) | (i116 & 458752));
                if (OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier12;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1203colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z11 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i117) {
                    SwitchKt.Switch(z, function1, modifier2, z11, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        switchColors2 = switchColors;
                        if (composerStartRestartGroup.changed(switchColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i10;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                    }
                    float fMo324toPx0680j_12 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf9 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z12) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor9 = SwipeableKt.rememberSwipeableStateFor(boolValueOf9, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen9 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                    Map mapMapOf9 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_12), Boolean.TRUE));
                    Orientation orientation9 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM1195swipeablepPrIpRY9 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen9, swipeableStateRememberSwipeableStateFor9, mapMapOf9, orientation9, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z12, boolean z13) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf9.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    Modifier modifierM517requiredSizeVpY3zN12 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY9, companion17.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o9 = p018OooOoo0.OooOOO.OooO00o(companion17, false, composerStartRestartGroup, 0, -1323940314);
                    Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl9 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    composer2 = composerStartRestartGroup;
                    int i117 = i8;
                    Modifier modifier13 = modifier4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf9, OooO0OO.OooO00o(companion18, composerM1309constructorimpl9, measurePolicyOooO00o9, composerM1309constructorimpl9, density9, composerM1309constructorimpl9, layoutDirection9, composerM1309constructorimpl9, viewConfiguration9, composer2, composer2), composer2, 2058660585);
                    int i118 = i117 << 3;
                    SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor9.getOffset(), mutableInteractionSource4, composer2, ((i117 >> 6) & 7168) | (i118 & 112) | 6 | ((i117 >> 3) & 896) | (i118 & 458752));
                    if (OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier13;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1203colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i2 & 32) != 0) {
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                            z5 = z4;
                            switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            z3 = z4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            i8 = i3;
                            modifier4 = modifier3;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColorsM1203colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                    }
                    float fMo324toPx0680j_13 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                    Boolean boolValueOf10 = Boolean.valueOf(z);
                    if (function1 == null) {
                        function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z12) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    SwipeableState swipeableStateRememberSwipeableStateFor10 = SwipeableKt.rememberSwipeableStateFor(boolValueOf10, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (function1 != null) {
                        modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen10 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                    Map mapMapOf10 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_13), Boolean.TRUE));
                    Orientation orientation10 = Orientation.Horizontal;
                    if (z5) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    Modifier modifierM1195swipeablepPrIpRY10 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen10, swipeableStateRememberSwipeableStateFor10, mapMapOf10, orientation10, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                        }
                    } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                            return invoke(bool.booleanValue(), bool2.booleanValue());
                        }

                        @NotNull
                        public final ThresholdConfig invoke(boolean z12, boolean z13) {
                            return new FractionalThreshold(0.5f);
                        }
                    }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf10.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                    Alignment.Companion companion19 = Alignment.INSTANCE;
                    Modifier modifierM517requiredSizeVpY3zN13 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY10, companion19.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o10 = p018OooOoo0.OooOOO.OooO00o(companion19, false, composerStartRestartGroup, 0, -1323940314);
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1309constructorimpl10 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    composer2 = composerStartRestartGroup;
                    int i119 = i8;
                    Modifier modifier14 = modifier4;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf10, OooO0OO.OooO00o(companion110, composerM1309constructorimpl10, measurePolicyOooO00o10, composerM1309constructorimpl10, density10, composerM1309constructorimpl10, layoutDirection10, composerM1309constructorimpl10, viewConfiguration10, composer2, composer2), composer2, 2058660585);
                    int i1110 = i119 << 3;
                    SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor10.getOffset(), mutableInteractionSource4, composer2, ((i119 >> 6) & 7168) | (i1110 & 112) | 6 | ((i119 >> 3) & 896) | (i1110 & 458752));
                    if (OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier14;
                    z3 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1203colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final boolean z12 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i1111) {
                        SwitchKt.Switch(z, function1, modifier2, z12, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i3 |= i10;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i10;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                }
                float fMo324toPx0680j_14 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf11 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        public final void invoke(boolean z13) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor11 = SwipeableKt.rememberSwipeableStateFor(boolValueOf11, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                } else {
                    modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen11 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                Map mapMapOf11 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_14), Boolean.TRUE));
                Orientation orientation11 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM1195swipeablepPrIpRY11 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen11, swipeableStateRememberSwipeableStateFor11, mapMapOf11, orientation11, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z13, boolean z14) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf11.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion111 = Alignment.INSTANCE;
                Modifier modifierM517requiredSizeVpY3zN14 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY11, companion111.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o11 = p018OooOoo0.OooOOO.OooO00o(companion111, false, composerStartRestartGroup, 0, -1323940314);
                Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl11 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                int i1111 = i8;
                Modifier modifier15 = modifier4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf11, OooO0OO.OooO00o(companion112, composerM1309constructorimpl11, measurePolicyOooO00o11, composerM1309constructorimpl11, density11, composerM1309constructorimpl11, layoutDirection11, composerM1309constructorimpl11, viewConfiguration11, composer2, composer2), composer2, 2058660585);
                int i1112 = i1111 << 3;
                SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor11.getOffset(), mutableInteractionSource4, composer2, ((i1111 >> 6) & 7168) | (i1112 & 112) | 6 | ((i1111 >> 3) & 896) | (i1112 & 458752));
                if (OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier15;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1203colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                }
                float fMo324toPx0680j_15 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf12 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        public final void invoke(boolean z13) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor12 = SwipeableKt.rememberSwipeableStateFor(boolValueOf12, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                } else {
                    modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen12 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                Map mapMapOf12 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_15), Boolean.TRUE));
                Orientation orientation12 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM1195swipeablepPrIpRY12 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen12, swipeableStateRememberSwipeableStateFor12, mapMapOf12, orientation12, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z13, boolean z14) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf12.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion113 = Alignment.INSTANCE;
                Modifier modifierM517requiredSizeVpY3zN15 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY12, companion113.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o12 = p018OooOoo0.OooOOO.OooO00o(companion113, false, composerStartRestartGroup, 0, -1323940314);
                Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                constructor = companion114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl12 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                int i1113 = i8;
                Modifier modifier16 = modifier4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf12, OooO0OO.OooO00o(companion114, composerM1309constructorimpl12, measurePolicyOooO00o12, composerM1309constructorimpl12, density12, composerM1309constructorimpl12, layoutDirection12, composerM1309constructorimpl12, viewConfiguration12, composer2, composer2), composer2, 2058660585);
                int i1114 = i1113 << 3;
                SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor12.getOffset(), mutableInteractionSource4, composer2, ((i1113 >> 6) & 7168) | (i1114 & 112) | 6 | ((i1113 >> 3) & 896) | (i1114 & 458752));
                if (OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier16;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1203colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z13 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i1115) {
                    SwitchKt.Switch(z, function1, modifier2, z13, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    switchColors2 = switchColors;
                    if (composerStartRestartGroup.changed(switchColors2)) {
                    }
                    i3 |= i10;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i10;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                }
                float fMo324toPx0680j_16 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf13 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        public final void invoke(boolean z14) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor13 = SwipeableKt.rememberSwipeableStateFor(boolValueOf13, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                } else {
                    modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen13 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                Map mapMapOf13 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_16), Boolean.TRUE));
                Orientation orientation13 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM1195swipeablepPrIpRY13 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen13, swipeableStateRememberSwipeableStateFor13, mapMapOf13, orientation13, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z14, boolean z15) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf13.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion115 = Alignment.INSTANCE;
                Modifier modifierM517requiredSizeVpY3zN16 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY13, companion115.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o13 = p018OooOoo0.OooOOO.OooO00o(companion115, false, composerStartRestartGroup, 0, -1323940314);
                Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN16);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl13 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                int i1115 = i8;
                Modifier modifier17 = modifier4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf13, OooO0OO.OooO00o(companion116, composerM1309constructorimpl13, measurePolicyOooO00o13, composerM1309constructorimpl13, density13, composerM1309constructorimpl13, layoutDirection13, composerM1309constructorimpl13, viewConfiguration13, composer2, composer2), composer2, 2058660585);
                int i1116 = i1115 << 3;
                SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor13.getOffset(), mutableInteractionSource4, composer2, ((i1115 >> 6) & 7168) | (i1116 & 112) | 6 | ((i1115 >> 3) & 896) | (i1116 & 458752));
                if (OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier17;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1203colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i2 & 32) != 0) {
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                        z5 = z4;
                        switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        z3 = z4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        i8 = i3;
                        modifier4 = modifier3;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        switchColorsM1203colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
                }
                float fMo324toPx0680j_17 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
                Boolean boolValueOf14 = Boolean.valueOf(z);
                if (function1 == null) {
                    function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                        public final void invoke(boolean z14) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                SwipeableState swipeableStateRememberSwipeableStateFor14 = SwipeableKt.rememberSwipeableStateFor(boolValueOf14, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (function1 != null) {
                    modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
                } else {
                    modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen14 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
                Map mapMapOf14 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_17), Boolean.TRUE));
                Orientation orientation14 = Orientation.Horizontal;
                if (z5) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                Modifier modifierM1195swipeablepPrIpRY14 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen14, swipeableStateRememberSwipeableStateFor14, mapMapOf14, orientation14, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                    }
                } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                        return invoke(bool.booleanValue(), bool2.booleanValue());
                    }

                    @NotNull
                    public final ThresholdConfig invoke(boolean z14, boolean z15) {
                        return new FractionalThreshold(0.5f);
                    }
                }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf14.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
                Alignment.Companion companion117 = Alignment.INSTANCE;
                Modifier modifierM517requiredSizeVpY3zN17 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY14, companion117.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o14 = p018OooOoo0.OooOOO.OooO00o(companion117, false, composerStartRestartGroup, 0, -1323940314);
                Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN17);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl14 = Updater.m1309constructorimpl(composerStartRestartGroup);
                composer2 = composerStartRestartGroup;
                int i1117 = i8;
                Modifier modifier18 = modifier4;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf14, OooO0OO.OooO00o(companion118, composerM1309constructorimpl14, measurePolicyOooO00o14, composerM1309constructorimpl14, density14, composerM1309constructorimpl14, layoutDirection14, composerM1309constructorimpl14, viewConfiguration14, composer2, composer2), composer2, 2058660585);
                int i1118 = i1117 << 3;
                SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor14.getOffset(), mutableInteractionSource4, composer2, ((i1117 >> 6) & 7168) | (i1118 & 112) | 6 | ((i1117 >> 3) & 896) | (i1118 & 458752));
                if (OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier18;
                z3 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1203colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z14 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i1119) {
                    SwitchKt.Switch(z, function1, modifier2, z14, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                switchColors2 = switchColors;
                if (composerStartRestartGroup.changed(switchColors2)) {
                }
                i3 |= i10;
            } else {
                switchColors2 = switchColors;
            }
            i3 |= i10;
        } else {
            switchColors2 = switchColors;
        }
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                    z5 = z4;
                    switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    z3 = z4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z3;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    switchColorsM1203colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                    z5 = z4;
                    switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    z3 = z4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z3;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    switchColorsM1203colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
            }
            float fMo324toPx0680j_18 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
            Boolean boolValueOf15 = Boolean.valueOf(z);
            if (function1 == null) {
                function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                    public final void invoke(boolean z15) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            SwipeableState swipeableStateRememberSwipeableStateFor15 = SwipeableKt.rememberSwipeableStateFor(boolValueOf15, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (function1 != null) {
                modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
            } else {
                modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            if (function1 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierThen15 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
            Map mapMapOf15 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_18), Boolean.TRUE));
            Orientation orientation15 = Orientation.Horizontal;
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            Modifier modifierM1195swipeablepPrIpRY15 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen15, swipeableStateRememberSwipeableStateFor15, mapMapOf15, orientation15, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(Object obj, Object obj2) {
                    return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                }
            } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                    return invoke(bool.booleanValue(), bool2.booleanValue());
                }

                @NotNull
                public final ThresholdConfig invoke(boolean z15, boolean z16) {
                    return new FractionalThreshold(0.5f);
                }
            }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf15.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
            Alignment.Companion companion119 = Alignment.INSTANCE;
            Modifier modifierM517requiredSizeVpY3zN18 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY15, companion119.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o15 = p018OooOoo0.OooOOO.OooO00o(companion119, false, composerStartRestartGroup, 0, -1323940314);
            Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN18);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl15 = Updater.m1309constructorimpl(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            int i1119 = i8;
            Modifier modifier19 = modifier4;
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf15, OooO0OO.OooO00o(companion1110, composerM1309constructorimpl15, measurePolicyOooO00o15, composerM1309constructorimpl15, density15, composerM1309constructorimpl15, layoutDirection15, composerM1309constructorimpl15, viewConfiguration15, composer2, composer2), composer2, 2058660585);
            int i11110 = i1119 << 3;
            SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor15.getOffset(), mutableInteractionSource4, composer2, ((i1119 >> 6) & 7168) | (i11110 & 112) | 6 | ((i1119 >> 3) & 896) | (i11110 & 458752));
            if (OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier19;
            z3 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM1203colorsSQMK_m0;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                    z5 = z4;
                    switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    z3 = z4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z3;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    switchColorsM1203colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i2 & 32) != 0) {
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                    z5 = z4;
                    switchColorsM1203colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1203colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    z3 = z4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    i8 = i3;
                    modifier4 = modifier3;
                    z5 = z3;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    switchColorsM1203colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:88)");
            }
            float fMo324toPx0680j_19 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(ThumbPathLength);
            Boolean boolValueOf16 = Boolean.valueOf(z);
            if (function1 == null) {
                function2 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                    public final void invoke(boolean z15) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            SwipeableState swipeableStateRememberSwipeableStateFor16 = SwipeableKt.rememberSwipeableStateFor(boolValueOf16, function2, AnimationSpec, composerStartRestartGroup, (i8 & 14) | 384, 0);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (function1 != null) {
                modifierM702toggleableO2vRcR0 = ToggleableKt.m702toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z5, Role.m3148boximpl(Role.INSTANCE.m3160getSwitcho7Vup1c()), function1);
            } else {
                modifierM702toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            if (function1 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierThen16 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM702toggleableO2vRcR0);
            Map mapMapOf16 = MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(fMo324toPx0680j_19), Boolean.TRUE));
            Orientation orientation16 = Orientation.Horizontal;
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            Modifier modifierM1195swipeablepPrIpRY16 = SwipeableKt.m1195swipeablepPrIpRY(modifierThen16, swipeableStateRememberSwipeableStateFor16, mapMapOf16, orientation16, (440 & 8) != 0 ? true : z7, (440 & 16) != 0 ? false : z6, (440 & 32) != 0 ? null : mutableInteractionSource4, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(Object obj, Object obj2) {
                    return new FixedThreshold(Dp.m3765constructorimpl(56), null);
                }
            } : new Function2<Boolean, Boolean, ThresholdConfig>() { // from class: androidx.compose.material.SwitchKt.Switch.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ ThresholdConfig invoke(Boolean bool, Boolean bool2) {
                    return invoke(bool.booleanValue(), bool2.booleanValue());
                }

                @NotNull
                public final ThresholdConfig invoke(boolean z15, boolean z16) {
                    return new FractionalThreshold(0.5f);
                }
            }, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf16.keySet(), 0.0f, 0.0f, 6, null) : null, (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1194getVelocityThresholdD9Ej5fM() : 0.0f);
            Alignment.Companion companion1111 = Alignment.INSTANCE;
            Modifier modifierM517requiredSizeVpY3zN19 = SizeKt.m517requiredSizeVpY3zN4(PaddingKt.m476padding3ABfNKs(SizeKt.wrapContentSize$default(modifierM1195swipeablepPrIpRY16, companion1111.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o16 = p018OooOoo0.OooOOO.OooO00o(companion1111, false, composerStartRestartGroup, 0, -1323940314);
            Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
            constructor = companion1112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierM517requiredSizeVpY3zN19);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl16 = Updater.m1309constructorimpl(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            int i11111 = i8;
            Modifier modifier110 = modifier4;
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf16, OooO0OO.OooO00o(companion1112, composerM1309constructorimpl16, measurePolicyOooO00o16, composerM1309constructorimpl16, density16, composerM1309constructorimpl16, layoutDirection16, composerM1309constructorimpl16, viewConfiguration16, composer2, composer2), composer2, 2058660585);
            int i11112 = i11111 << 3;
            SwitchImpl(BoxScopeInstance.INSTANCE, z, z5, switchColorsM1203colorsSQMK_m0, swipeableStateRememberSwipeableStateFor16.getOffset(), mutableInteractionSource4, composer2, ((i11111 >> 6) & 7168) | (i11112 & 112) | 6 | ((i11111 >> 3) & 896) | (i11112 & 458752));
            if (OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier110;
            z3 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM1203colorsSQMK_m0;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z15 = z3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i11113) {
                SwitchKt.Switch(z, function1, modifier2, z15, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final State<Float> state, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1834839253);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(switchColors) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1834839253, i2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i3 = (i2 >> 15) & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3 | 64);
            float f = snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation;
            int i4 = ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 3) & 896);
            final State<Color> stateTrackColor = switchColors.trackColor(z2, z, composerStartRestartGroup, i4);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
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
                        SwitchKt.m1205drawTrackRPmYEkk(Canvas, SwitchKt.SwitchImpl$lambda$5(stateTrackColor), Canvas.mo324toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo324toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z2, z, composerStartRestartGroup, i4);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM3765constructorimpl = Dp.m3765constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m3779unboximpl() + f);
            composerStartRestartGroup.startReplaceableGroup(-539245302);
            long jSwitchImpl$lambda$7 = (!Color.m1671equalsimpl0(SwitchImpl$lambda$7(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1027getSurface0d7_KjU()) || elevationOverlay == null) ? SwitchImpl$lambda$7(stateThumbColor) : elevationOverlay.mo1057apply7g2Lkgo(SwitchImpl$lambda$7(stateThumbColor), fM3765constructorimpl, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = boxScope.align(companion2, companion3.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m3874boximpl(m1206invokeBjo55l4(density));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1206invokeBjo55l4(@NotNull Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(state.getValue().floatValue()), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m168backgroundbw27NRU(ShadowKt.m1348shadows4CzXII$default(SizeKt.m515requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue4), interactionSource, RippleKt.m1277rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), ThumbDiameter), f, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), jSwitchImpl$lambda$7, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.SwitchImpl.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                SwitchKt.SwitchImpl(boxScope, z, z2, switchColors, state, interactionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$5(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    private static final long SwitchImpl$lambda$7(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1205drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m1437getYimpl(drawScope.mo2107getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m1437getYimpl(drawScope.mo2107getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m1996getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
