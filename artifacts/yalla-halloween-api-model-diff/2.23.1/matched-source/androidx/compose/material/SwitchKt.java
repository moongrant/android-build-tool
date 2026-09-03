package androidx.compose.material;

import androidx.compose.animation.Oooo000;
import androidx.compose.animation.SingleValueAnimationKt;
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
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
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
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aS\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010\"\u001a?\u0010#\u001a\u00020\u0016*\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001e\u001a\u00020'H\u0003¢\u0006\u0002\u0010(\u001a1\u0010)\u001a\u00020\u0016*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u000b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0010\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u0019\u0010\u0011\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\r\"\u0019\u0010\u0013\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\n\u00102\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0018\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001aX\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Lkotlin/Function0;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,421:1\n25#2:422\n25#2:431\n36#2:439\n67#2,3:446\n66#2:449\n83#2,3:456\n50#2:465\n49#2:466\n456#2,8:491\n464#2,3:505\n36#2:509\n467#2,3:516\n25#2:521\n50#2:528\n49#2:529\n36#2:536\n36#2:546\n1097#3,6:423\n1097#3,6:432\n1097#3,6:440\n1097#3,6:450\n1097#3,6:459\n1097#3,6:467\n1097#3,6:510\n1097#3,6:522\n1097#3,6:530\n1097#3,6:537\n1097#3,6:547\n76#4:429\n76#4:438\n76#4:473\n76#4:543\n76#4:544\n1#5:430\n66#6,6:474\n72#6:508\n76#6:520\n78#7,11:480\n91#7:519\n4144#8,6:499\n51#9:545\n58#9:566\n81#10:553\n107#10,2:554\n81#10:556\n81#10:557\n81#10:558\n81#10:559\n81#10:560\n154#11:561\n154#11:562\n154#11:563\n154#11:564\n154#11:565\n154#11:567\n154#11:568\n154#11:569\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n100#1:422\n109#1:431\n111#1:439\n121#1:446,3\n121#1:449\n124#1:456,3\n133#1:465\n133#1:466\n153#1:491,8\n153#1:505,3\n178#1:509\n153#1:516,3\n220#1:521\n222#1:528\n222#1:529\n245#1:536\n261#1:546\n100#1:423,6\n109#1:432,6\n111#1:440,6\n121#1:450,6\n124#1:459,6\n133#1:467,6\n178#1:510,6\n220#1:522,6\n222#1:530,6\n245#1:537,6\n261#1:547,6\n104#1:429\n110#1:438\n138#1:473\n249#1:543\n250#1:544\n153#1:474,6\n153#1:508\n153#1:520\n153#1:480,11\n153#1:519\n153#1:499,6\n250#1:545\n292#1:566\n109#1:553\n109#1:554,2\n119#1:556\n120#1:557\n241#1:558\n248#1:559\n251#1:560\n283#1:561\n284#1:562\n285#1:563\n287#1:564\n289#1:565\n296#1:567\n297#1:568\n420#1:569\n*E\n"})
public final class SwitchKt {

    @NotNull
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float fM3775constructorimpl = Dp.m3775constructorimpl(34);
        TrackWidth = fM3775constructorimpl;
        TrackStrokeWidth = Dp.m3775constructorimpl(14);
        float fM3775constructorimpl2 = Dp.m3775constructorimpl(20);
        ThumbDiameter = fM3775constructorimpl2;
        ThumbRippleRadius = Dp.m3775constructorimpl(24);
        DefaultSwitchPadding = Dp.m3775constructorimpl(2);
        SwitchWidth = fM3775constructorimpl;
        SwitchHeight = fM3775constructorimpl2;
        ThumbPathLength = Dp.m3775constructorimpl(fM3775constructorimpl - fM3775constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m3775constructorimpl(1);
        ThumbPressedElevation = Dp.m3775constructorimpl(6);
        SwitchVelocityThreshold = Dp.m3775constructorimpl(125);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0187  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x021c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0222  */
    /* JADX WARN: Code duplicated, block: B:116:0x024a A[LOOP:0: B:115:0x0248->B:116:0x024a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0263  */
    /* JADX WARN: Code duplicated, block: B:124:0x029b  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:139:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0305  */
    /* JADX WARN: Code duplicated, block: B:144:0x0351  */
    /* JADX WARN: Code duplicated, block: B:147:0x035d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0361  */
    /* JADX WARN: Code duplicated, block: B:151:0x0372  */
    /* JADX WARN: Code duplicated, block: B:153:0x0380  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Switch(final boolean z, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SwitchColors switchColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        SwitchColors switchColors2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        SwitchColors switchColorsM1213colorsSQMK_m0;
        Object objRememberedValue;
        final float fMo326toPx0680j_4;
        Object objRememberedValue2;
        Composer.Companion companion;
        MutableState mutableState;
        final float fMo326toPx0680j_5;
        boolean zChanged;
        Object objRememberedValue3;
        final AnchoredDraggableState anchoredDraggableState;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        final float f;
        boolean zChanged2;
        Object objRememberedValue4;
        int i9;
        Object[] objArr;
        int i10;
        boolean zChanged3;
        Object objRememberedValue5;
        boolean zOooO00o;
        Object objRememberedValue6;
        boolean z5;
        Modifier modifierM704toggleableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean z6;
        Composer composer2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean zChanged4;
        Object objRememberedValue7;
        Modifier modifier5;
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
        int i11 = i2 & 4;
        if (i11 == 0) {
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
                            int i12 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i3 |= i12;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                z3 = true;
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
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                z4 = z3;
                            } else {
                                i8 = i3;
                                modifier4 = modifier3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                z4 = z3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                            }
                            fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                            Float fValueOf = Float.valueOf(fMo326toPx0680j_5);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(fValueOf);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                    @NotNull
                                    public final Float invoke(float f2) {
                                        return Float.valueOf(f2 * 0.7f);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                        return invoke(f2.floatValue());
                                    }
                                }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(fMo326toPx0680j_5);
                                    }
                                }, AnimationSpec, null, 16, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                            int i13 = i8 >> 3;
                            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i13 & 14);
                            int i14 = i8 & 14;
                            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i14);
                            f = 0.0f;
                            Float fValueOf2 = Float.valueOf(0.0f);
                            Float fValueOf3 = Float.valueOf(fMo326toPx0680j_4);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf3);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                            objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            i10 = 0;
                            zChanged3 = false;
                            for (i9 = 4; i10 < i9; i9 = 4) {
                                zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                                i10++;
                            }
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            Boolean boolValueOf2 = Boolean.valueOf(Switch$lambda$3(mutableState));
                            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zOooO00o || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue6, composerStartRestartGroup, i14 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (function1 != null) {
                                modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                            } else {
                                modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                            }
                            if (function1 != null) {
                                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                            } else {
                                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                            }
                            Modifier modifierThen = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                            Orientation orientation = Orientation.Horizontal;
                            if (z4 || function1 == null) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            Modifier modifierAnchoredDraggable = AnchoredDraggableKt.anchoredDraggable(modifierThen, anchoredDraggableState, orientation, z6, z5, mutableInteractionSource4);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierM519requiredSizeVpY3zN4 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable, companion2.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN4);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            boolean zBooleanValue = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                            composer2.startReplaceableGroup(1157296644);
                            zChanged4 = composer2.changed(anchoredDraggableState);
                            objRememberedValue7 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(anchoredDraggableState.requireOffset());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifier6 = modifier4;
                            SwitchImpl(boxScopeInstance, zBooleanValue, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i13 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                            if (OooO0o.OooO00o(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier6;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            switchColors3 = switchColorsM1213colorsSQMK_m0;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i8 = i3;
                            modifier4 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                        }
                        fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                        Float fValueOf4 = Float.valueOf(fMo326toPx0680j_5);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(fValueOf4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                @NotNull
                                public final Float invoke(float f2) {
                                    return Float.valueOf(f2 * 0.7f);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                    return invoke(f2.floatValue());
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(fMo326toPx0680j_5);
                                }
                            }, AnimationSpec, null, 16, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                @NotNull
                                public final Float invoke(float f2) {
                                    return Float.valueOf(f2 * 0.7f);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                    return invoke(f2.floatValue());
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(fMo326toPx0680j_5);
                                }
                            }, AnimationSpec, null, 16, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                        int i15 = i8 >> 3;
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i15 & 14);
                        int i16 = i8 & 14;
                        stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i16);
                        f = 0.0f;
                        Float fValueOf5 = Float.valueOf(0.0f);
                        Float fValueOf6 = Float.valueOf(fMo326toPx0680j_4);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(fValueOf5) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf6);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                        objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        i10 = 0;
                        zChanged3 = false;
                        while (i10 < i9) {
                            zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                            i10++;
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                        Boolean boolValueOf3 = Boolean.valueOf(z);
                        Boolean boolValueOf4 = Boolean.valueOf(Switch$lambda$3(mutableState));
                        zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zOooO00o) {
                            objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf4, (Function2) objRememberedValue6, composerStartRestartGroup, i16 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (function1 != null) {
                            modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                        } else {
                            modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        if (function1 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierThen2 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                        Orientation orientation2 = Orientation.Horizontal;
                        if (z4) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        Modifier modifierAnchoredDraggable2 = AnchoredDraggableKt.anchoredDraggable(modifierThen2, anchoredDraggableState, orientation2, z6, z5, mutableInteractionSource4);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        Modifier modifierM519requiredSizeVpY3zN5 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable2, companion4.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion4, false, composer2, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN5);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        boolean zBooleanValue2 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                        composer2.startReplaceableGroup(1157296644);
                        zChanged4 = composer2.changed(anchoredDraggableState);
                        objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(anchoredDraggableState.requireOffset());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        } else {
                            objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(anchoredDraggableState.requireOffset());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier7 = modifier4;
                        SwitchImpl(boxScopeInstance2, zBooleanValue2, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i15 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier7;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors3 = switchColorsM1213colorsSQMK_m0;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        z4 = z3;
                        composer2 = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors3 = switchColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier5;
                    final boolean z7 = z4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                        public final void invoke(@Nullable Composer composer3, int i17) {
                            SwitchKt.Switch(z, function1, modifier8, z7, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        i3 |= i12;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i12;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                    Float fValueOf7 = Float.valueOf(fMo326toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf7);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i17 = i8 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i17 & 14);
                    int i18 = i8 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i18);
                    f = 0.0f;
                    Float fValueOf8 = Float.valueOf(0.0f);
                    Float fValueOf9 = Float.valueOf(fMo326toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf8) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf9);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i10 = 0;
                    zChanged3 = false;
                    while (i10 < i9) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf5 = Boolean.valueOf(z);
                    Boolean boolValueOf6 = Boolean.valueOf(Switch$lambda$3(mutableState));
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf5, boolValueOf6, (Function2) objRememberedValue6, composerStartRestartGroup, i18 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (function1 != null) {
                        modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen3 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                    Orientation orientation3 = Orientation.Horizontal;
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierAnchoredDraggable3 = AnchoredDraggableKt.anchoredDraggable(modifierThen3, anchoredDraggableState, orientation3, z6, z5, mutableInteractionSource4);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN6 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable3, companion6.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o3 = Oooo000.OooO00o(companion6, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN6);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO00o3, composerM1320constructorimpl, currentCompositionLocalMap3);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue3 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged4 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier9 = modifier4;
                    SwitchImpl(boxScopeInstance3, zBooleanValue3, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i17 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier9;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1213colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                    Float fValueOf10 = Float.valueOf(fMo326toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i19 = i8 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i19 & 14);
                    int i110 = i8 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i110);
                    f = 0.0f;
                    Float fValueOf11 = Float.valueOf(0.0f);
                    Float fValueOf12 = Float.valueOf(fMo326toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf11) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf12);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i10 = 0;
                    zChanged3 = false;
                    while (i10 < i9) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf7 = Boolean.valueOf(z);
                    Boolean boolValueOf8 = Boolean.valueOf(Switch$lambda$3(mutableState));
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf7, boolValueOf8, (Function2) objRememberedValue6, composerStartRestartGroup, i110 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (function1 != null) {
                        modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen4 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                    Orientation orientation4 = Orientation.Horizontal;
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierAnchoredDraggable4 = AnchoredDraggableKt.anchoredDraggable(modifierThen4, anchoredDraggableState, orientation4, z6, z5, mutableInteractionSource4);
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN7 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable4, companion8.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o4 = Oooo000.OooO00o(companion8, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN7);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue4 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged4 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier10 = modifier4;
                    SwitchImpl(boxScopeInstance4, zBooleanValue4, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i19 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier10;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1213colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier11 = modifier5;
                final boolean z8 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                    public final void invoke(@Nullable Composer composer3, int i111) {
                        SwitchKt.Switch(z, function1, modifier11, z8, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        i3 |= i12;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i12;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                    Float fValueOf13 = Float.valueOf(fMo326toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf13);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i111 = i8 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i111 & 14);
                    int i112 = i8 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i112);
                    f = 0.0f;
                    Float fValueOf14 = Float.valueOf(0.0f);
                    Float fValueOf15 = Float.valueOf(fMo326toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf14) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf15);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i10 = 0;
                    zChanged3 = false;
                    while (i10 < i9) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf9 = Boolean.valueOf(z);
                    Boolean boolValueOf10 = Boolean.valueOf(Switch$lambda$3(mutableState));
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf9, boolValueOf10, (Function2) objRememberedValue6, composerStartRestartGroup, i112 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (function1 != null) {
                        modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen5 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                    Orientation orientation5 = Orientation.Horizontal;
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierAnchoredDraggable5 = AnchoredDraggableKt.anchoredDraggable(modifierThen5, anchoredDraggableState, orientation5, z6, z5, mutableInteractionSource4);
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN8 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable5, companion10.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o5 = Oooo000.OooO00o(companion10, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN8);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyOooO00o5, composerM1320constructorimpl, currentCompositionLocalMap5);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue5 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged4 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier12 = modifier4;
                    SwitchImpl(boxScopeInstance5, zBooleanValue5, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i111 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier12;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1213colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                    Float fValueOf16 = Float.valueOf(fMo326toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf16);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i113 = i8 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i113 & 14);
                    int i114 = i8 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i114);
                    f = 0.0f;
                    Float fValueOf17 = Float.valueOf(0.0f);
                    Float fValueOf18 = Float.valueOf(fMo326toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf17) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf18);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i10 = 0;
                    zChanged3 = false;
                    while (i10 < i9) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf11 = Boolean.valueOf(z);
                    Boolean boolValueOf12 = Boolean.valueOf(Switch$lambda$3(mutableState));
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf11, boolValueOf12, (Function2) objRememberedValue6, composerStartRestartGroup, i114 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (function1 != null) {
                        modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen6 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                    Orientation orientation6 = Orientation.Horizontal;
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierAnchoredDraggable6 = AnchoredDraggableKt.anchoredDraggable(modifierThen6, anchoredDraggableState, orientation6, z6, z5, mutableInteractionSource4);
                    Alignment.Companion companion12 = Alignment.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN9 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable6, companion12.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o6 = Oooo000.OooO00o(companion12, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN9);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyOooO00o6, composerM1320constructorimpl, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue6 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged4 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier13 = modifier4;
                    SwitchImpl(boxScopeInstance6, zBooleanValue6, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i113 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1213colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier5;
                final boolean z9 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                    public final void invoke(@Nullable Composer composer3, int i115) {
                        SwitchKt.Switch(z, function1, modifier14, z9, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                    i3 |= i12;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i12;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                Float fValueOf19 = Float.valueOf(fMo326toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf19);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i115 = i8 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i115 & 14);
                int i116 = i8 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i116);
                f = 0.0f;
                Float fValueOf110 = Float.valueOf(0.0f);
                Float fValueOf111 = Float.valueOf(fMo326toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf110) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf111);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i10 = 0;
                zChanged3 = false;
                while (i10 < i9) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf13 = Boolean.valueOf(z);
                Boolean boolValueOf14 = Boolean.valueOf(Switch$lambda$3(mutableState));
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf13, boolValueOf14, (Function2) objRememberedValue6, composerStartRestartGroup, i116 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (function1 != null) {
                    modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                } else {
                    modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen7 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                Orientation orientation7 = Orientation.Horizontal;
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                Modifier modifierAnchoredDraggable7 = AnchoredDraggableKt.anchoredDraggable(modifierThen7, anchoredDraggableState, orientation7, z6, z5, mutableInteractionSource4);
                Alignment.Companion companion14 = Alignment.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN10 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable7, companion14.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o7 = Oooo000.OooO00o(companion14, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN10);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue7 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged4 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged4) {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier15 = modifier4;
                SwitchImpl(boxScopeInstance7, zBooleanValue7, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i115 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier15;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1213colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                Float fValueOf112 = Float.valueOf(fMo326toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf112);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i117 = i8 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i117 & 14);
                int i118 = i8 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i118);
                f = 0.0f;
                Float fValueOf113 = Float.valueOf(0.0f);
                Float fValueOf114 = Float.valueOf(fMo326toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf113) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf114);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i10 = 0;
                zChanged3 = false;
                while (i10 < i9) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf15 = Boolean.valueOf(z);
                Boolean boolValueOf16 = Boolean.valueOf(Switch$lambda$3(mutableState));
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf15, boolValueOf16, (Function2) objRememberedValue6, composerStartRestartGroup, i118 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (function1 != null) {
                    modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                } else {
                    modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen8 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                Orientation orientation8 = Orientation.Horizontal;
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                Modifier modifierAnchoredDraggable8 = AnchoredDraggableKt.anchoredDraggable(modifierThen8, anchoredDraggableState, orientation8, z6, z5, mutableInteractionSource4);
                Alignment.Companion companion16 = Alignment.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN11 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable8, companion16.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o8 = Oooo000.OooO00o(companion16, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                constructor = companion17.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN11);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion17, composerM1320constructorimpl, measurePolicyOooO00o8, composerM1320constructorimpl, currentCompositionLocalMap8);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue8 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged4 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged4) {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier16 = modifier4;
                SwitchImpl(boxScopeInstance8, zBooleanValue8, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i117 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier16;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1213colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier5;
            final boolean z10 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                public final void invoke(@Nullable Composer composer3, int i119) {
                    SwitchKt.Switch(z, function1, modifier17, z10, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        i3 |= i12;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i3 |= i12;
                } else {
                    switchColors2 = switchColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                    Float fValueOf115 = Float.valueOf(fMo326toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf115);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i119 = i8 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i119 & 14);
                    int i1110 = i8 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i1110);
                    f = 0.0f;
                    Float fValueOf116 = Float.valueOf(0.0f);
                    Float fValueOf117 = Float.valueOf(fMo326toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf116) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf117);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i10 = 0;
                    zChanged3 = false;
                    while (i10 < i9) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf17 = Boolean.valueOf(z);
                    Boolean boolValueOf18 = Boolean.valueOf(Switch$lambda$3(mutableState));
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf17, boolValueOf18, (Function2) objRememberedValue6, composerStartRestartGroup, i1110 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (function1 != null) {
                        modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen9 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                    Orientation orientation9 = Orientation.Horizontal;
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierAnchoredDraggable9 = AnchoredDraggableKt.anchoredDraggable(modifierThen9, anchoredDraggableState, orientation9, z6, z5, mutableInteractionSource4);
                    Alignment.Companion companion18 = Alignment.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN12 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable9, companion18.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o9 = Oooo000.OooO00o(companion18, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN12);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl, measurePolicyOooO00o9, composerM1320constructorimpl, currentCompositionLocalMap9);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue9 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged4 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier18 = modifier4;
                    SwitchImpl(boxScopeInstance9, zBooleanValue9, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i119 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier18;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1213colorsSQMK_m0;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
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
                            mutableInteractionSource4 = mutableInteractionSource3;
                            switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            z4 = z3;
                        } else {
                            i8 = i3;
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z4 = z3;
                            switchColorsM1213colorsSQMK_m0 = switchColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                    }
                    fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                    Float fValueOf118 = Float.valueOf(fMo326toPx0680j_5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(fValueOf118);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            @NotNull
                            public final Float invoke(float f2) {
                                return Float.valueOf(f2 * 0.7f);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                return invoke(f2.floatValue());
                            }
                        }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(fMo326toPx0680j_5);
                            }
                        }, AnimationSpec, null, 16, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                    int i1111 = i8 >> 3;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i1111 & 14);
                    int i1112 = i8 & 14;
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i1112);
                    f = 0.0f;
                    Float fValueOf119 = Float.valueOf(0.0f);
                    Float fValueOf1110 = Float.valueOf(fMo326toPx0680j_4);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf119) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1110);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                    objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i10 = 0;
                    zChanged3 = false;
                    while (i10 < i9) {
                        zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                        i10++;
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                    Boolean boolValueOf19 = Boolean.valueOf(z);
                    Boolean boolValueOf110 = Boolean.valueOf(Switch$lambda$3(mutableState));
                    zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zOooO00o) {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(boolValueOf19, boolValueOf110, (Function2) objRememberedValue6, composerStartRestartGroup, i1112 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (function1 != null) {
                        modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                    } else {
                        modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    if (function1 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierThen10 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                    Orientation orientation10 = Orientation.Horizontal;
                    if (z4) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierAnchoredDraggable10 = AnchoredDraggableKt.anchoredDraggable(modifierThen10, anchoredDraggableState, orientation10, z6, z5, mutableInteractionSource4);
                    Alignment.Companion companion110 = Alignment.INSTANCE;
                    Modifier modifierM519requiredSizeVpY3zN13 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable10, companion110.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o10 = Oooo000.OooO00o(companion110, false, composer2, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN13);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1320constructorimpl, measurePolicyOooO00o10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    boolean zBooleanValue10 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                    composer2.startReplaceableGroup(1157296644);
                    zChanged4 = composer2.changed(anchoredDraggableState);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.requireOffset());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier19 = modifier4;
                    SwitchImpl(boxScopeInstance10, zBooleanValue10, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i1111 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier19;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    switchColors3 = switchColorsM1213colorsSQMK_m0;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier110 = modifier5;
                final boolean z11 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                    public final void invoke(@Nullable Composer composer3, int i1113) {
                        SwitchKt.Switch(z, function1, modifier110, z11, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                    i3 |= i12;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i12;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                Float fValueOf1111 = Float.valueOf(fMo326toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf1111);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i1113 = i8 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i1113 & 14);
                int i1114 = i8 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i1114);
                f = 0.0f;
                Float fValueOf1112 = Float.valueOf(0.0f);
                Float fValueOf1113 = Float.valueOf(fMo326toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1112) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1113);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i10 = 0;
                zChanged3 = false;
                while (i10 < i9) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf111 = Boolean.valueOf(z);
                Boolean boolValueOf112 = Boolean.valueOf(Switch$lambda$3(mutableState));
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf111, boolValueOf112, (Function2) objRememberedValue6, composerStartRestartGroup, i1114 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (function1 != null) {
                    modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                } else {
                    modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen11 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                Orientation orientation11 = Orientation.Horizontal;
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                Modifier modifierAnchoredDraggable11 = AnchoredDraggableKt.anchoredDraggable(modifierThen11, anchoredDraggableState, orientation11, z6, z5, mutableInteractionSource4);
                Alignment.Companion companion112 = Alignment.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN14 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable11, companion112.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o11 = Oooo000.OooO00o(companion112, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN14);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl, measurePolicyOooO00o11, composerM1320constructorimpl, currentCompositionLocalMap11);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue11 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged4 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged4) {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier111 = modifier4;
                SwitchImpl(boxScopeInstance11, zBooleanValue11, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i1113 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier111;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1213colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                Float fValueOf1114 = Float.valueOf(fMo326toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf1114);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i1115 = i8 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i1115 & 14);
                int i1116 = i8 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i1116);
                f = 0.0f;
                Float fValueOf1115 = Float.valueOf(0.0f);
                Float fValueOf1116 = Float.valueOf(fMo326toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1115) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1116);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i10 = 0;
                zChanged3 = false;
                while (i10 < i9) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf113 = Boolean.valueOf(z);
                Boolean boolValueOf114 = Boolean.valueOf(Switch$lambda$3(mutableState));
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf113, boolValueOf114, (Function2) objRememberedValue6, composerStartRestartGroup, i1116 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (function1 != null) {
                    modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                } else {
                    modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen12 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                Orientation orientation12 = Orientation.Horizontal;
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                Modifier modifierAnchoredDraggable12 = AnchoredDraggableKt.anchoredDraggable(modifierThen12, anchoredDraggableState, orientation12, z6, z5, mutableInteractionSource4);
                Alignment.Companion companion114 = Alignment.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN15 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable12, companion114.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o12 = Oooo000.OooO00o(companion114, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                constructor = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN15);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion115, composerM1320constructorimpl, measurePolicyOooO00o12, composerM1320constructorimpl, currentCompositionLocalMap12);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue12 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged4 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged4) {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier112 = modifier4;
                SwitchImpl(boxScopeInstance12, zBooleanValue12, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i1115 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier112;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1213colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier113 = modifier5;
            final boolean z12 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                public final void invoke(@Nullable Composer composer3, int i1117) {
                    SwitchKt.Switch(z, function1, modifier113, z12, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                    i3 |= i12;
                } else {
                    switchColors2 = switchColors;
                }
                i3 |= i12;
            } else {
                switchColors2 = switchColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                Float fValueOf1117 = Float.valueOf(fMo326toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf1117);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i1117 = i8 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i1117 & 14);
                int i1118 = i8 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i1118);
                f = 0.0f;
                Float fValueOf1118 = Float.valueOf(0.0f);
                Float fValueOf1119 = Float.valueOf(fMo326toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1118) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf1119);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i10 = 0;
                zChanged3 = false;
                while (i10 < i9) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf115 = Boolean.valueOf(z);
                Boolean boolValueOf116 = Boolean.valueOf(Switch$lambda$3(mutableState));
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf115, boolValueOf116, (Function2) objRememberedValue6, composerStartRestartGroup, i1118 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (function1 != null) {
                    modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                } else {
                    modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen13 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                Orientation orientation13 = Orientation.Horizontal;
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                Modifier modifierAnchoredDraggable13 = AnchoredDraggableKt.anchoredDraggable(modifierThen13, anchoredDraggableState, orientation13, z6, z5, mutableInteractionSource4);
                Alignment.Companion companion116 = Alignment.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN16 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable13, companion116.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o13 = Oooo000.OooO00o(companion116, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN16);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl, measurePolicyOooO00o13, composerM1320constructorimpl, currentCompositionLocalMap13);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue13 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged4 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged4) {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier114 = modifier4;
                SwitchImpl(boxScopeInstance13, zBooleanValue13, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i1117 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier114;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1213colorsSQMK_m0;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
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
                        mutableInteractionSource4 = mutableInteractionSource3;
                        switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        z4 = z3;
                    } else {
                        i8 = i3;
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z4 = z3;
                        switchColorsM1213colorsSQMK_m0 = switchColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
                }
                fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
                Float fValueOf11110 = Float.valueOf(fMo326toPx0680j_5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(fValueOf11110);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        @NotNull
                        public final Float invoke(float f2) {
                            return Float.valueOf(f2 * 0.7f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                            return invoke(f2.floatValue());
                        }
                    }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(fMo326toPx0680j_5);
                        }
                    }, AnimationSpec, null, 16, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                int i1119 = i8 >> 3;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i1119 & 14);
                int i11110 = i8 & 14;
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i11110);
                f = 0.0f;
                Float fValueOf11111 = Float.valueOf(0.0f);
                Float fValueOf11112 = Float.valueOf(fMo326toPx0680j_4);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(fValueOf11111) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf11112);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i10 = 0;
                zChanged3 = false;
                while (i10 < i9) {
                    zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                    i10++;
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
                Boolean boolValueOf117 = Boolean.valueOf(z);
                Boolean boolValueOf118 = Boolean.valueOf(Switch$lambda$3(mutableState));
                zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zOooO00o) {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf117, boolValueOf118, (Function2) objRememberedValue6, composerStartRestartGroup, i11110 | ConstantsKt.MINIMUM_BLOCK_SIZE);
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (function1 != null) {
                    modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
                } else {
                    modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
                }
                if (function1 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierThen14 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
                Orientation orientation14 = Orientation.Horizontal;
                if (z4) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                Modifier modifierAnchoredDraggable14 = AnchoredDraggableKt.anchoredDraggable(modifierThen14, anchoredDraggableState, orientation14, z6, z5, mutableInteractionSource4);
                Alignment.Companion companion118 = Alignment.INSTANCE;
                Modifier modifierM519requiredSizeVpY3zN17 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable14, companion118.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o14 = Oooo000.OooO00o(companion118, false, composer2, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN17);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion119, composerM1320constructorimpl, measurePolicyOooO00o14, composerM1320constructorimpl, currentCompositionLocalMap14);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                boolean zBooleanValue14 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
                composer2.startReplaceableGroup(1157296644);
                zChanged4 = composer2.changed(anchoredDraggableState);
                objRememberedValue7 = composer2.rememberedValue();
                if (zChanged4) {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.requireOffset());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                Modifier modifier115 = modifier4;
                SwitchImpl(boxScopeInstance14, zBooleanValue14, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i1119 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier115;
                mutableInteractionSource5 = mutableInteractionSource4;
                switchColors3 = switchColorsM1213colorsSQMK_m0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier116 = modifier5;
            final boolean z13 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

                public final void invoke(@Nullable Composer composer3, int i11111) {
                    SwitchKt.Switch(z, function1, modifier116, z13, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                i3 |= i12;
            } else {
                switchColors2 = switchColors;
            }
            i3 |= i12;
        } else {
            switchColors2 = switchColors;
        }
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
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
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    z4 = z3;
                } else {
                    i8 = i3;
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z4 = z3;
                    switchColorsM1213colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
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
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    z4 = z3;
                } else {
                    i8 = i3;
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z4 = z3;
                    switchColorsM1213colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
            }
            fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
            Float fValueOf11113 = Float.valueOf(fMo326toPx0680j_5);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(fValueOf11113);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                    @NotNull
                    public final Float invoke(float f2) {
                        return Float.valueOf(f2 * 0.7f);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }
                }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(fMo326toPx0680j_5);
                    }
                }, AnimationSpec, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                    @NotNull
                    public final Float invoke(float f2) {
                        return Float.valueOf(f2 * 0.7f);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }
                }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(fMo326toPx0680j_5);
                    }
                }, AnimationSpec, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
            int i11111 = i8 >> 3;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i11111 & 14);
            int i11112 = i8 & 14;
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i11112);
            f = 0.0f;
            Float fValueOf11114 = Float.valueOf(0.0f);
            Float fValueOf11115 = Float.valueOf(fMo326toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged2 = composerStartRestartGroup.changed(fValueOf11114) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf11115);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
            objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i10 = 0;
            zChanged3 = false;
            while (i10 < i9) {
                zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                i10++;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
            Boolean boolValueOf119 = Boolean.valueOf(z);
            Boolean boolValueOf1110 = Boolean.valueOf(Switch$lambda$3(mutableState));
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf119, boolValueOf1110, (Function2) objRememberedValue6, composerStartRestartGroup, i11112 | ConstantsKt.MINIMUM_BLOCK_SIZE);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (function1 != null) {
                modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
            } else {
                modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            if (function1 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierThen15 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
            Orientation orientation15 = Orientation.Horizontal;
            if (z4) {
                z6 = false;
            } else {
                z6 = false;
            }
            Modifier modifierAnchoredDraggable15 = AnchoredDraggableKt.anchoredDraggable(modifierThen15, anchoredDraggableState, orientation15, z6, z5, mutableInteractionSource4);
            Alignment.Companion companion1110 = Alignment.INSTANCE;
            Modifier modifierM519requiredSizeVpY3zN18 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable15, companion1110.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o15 = Oooo000.OooO00o(companion1110, false, composer2, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN18);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl, measurePolicyOooO00o15, composerM1320constructorimpl, currentCompositionLocalMap15);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            boolean zBooleanValue15 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
            composer2.startReplaceableGroup(1157296644);
            zChanged4 = composer2.changed(anchoredDraggableState);
            objRememberedValue7 = composer2.rememberedValue();
            if (zChanged4) {
                objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(anchoredDraggableState.requireOffset());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(anchoredDraggableState.requireOffset());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceableGroup();
            Modifier modifier117 = modifier4;
            SwitchImpl(boxScopeInstance15, zBooleanValue15, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i11111 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier117;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM1213colorsSQMK_m0;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
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
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    z4 = z3;
                } else {
                    i8 = i3;
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z4 = z3;
                    switchColorsM1213colorsSQMK_m0 = switchColors2;
                }
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
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
                    mutableInteractionSource4 = mutableInteractionSource3;
                    switchColorsM1213colorsSQMK_m0 = SwitchDefaults.INSTANCE.m1213colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    z4 = z3;
                } else {
                    i8 = i3;
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    z4 = z3;
                    switchColorsM1213colorsSQMK_m0 = switchColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(25866825, i8, -1, "androidx.compose.material.Switch (Switch.kt:94)");
            }
            fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(ThumbPathLength);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue2;
            fMo326toPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(SwitchVelocityThreshold);
            Float fValueOf11116 = Float.valueOf(fMo326toPx0680j_5);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(fValueOf11116);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                    @NotNull
                    public final Float invoke(float f2) {
                        return Float.valueOf(f2 * 0.7f);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }
                }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(fMo326toPx0680j_5);
                    }
                }, AnimationSpec, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                    @NotNull
                    public final Float invoke(float f2) {
                        return Float.valueOf(f2 * 0.7f);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                        return invoke(f2.floatValue());
                    }
                }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(fMo326toPx0680j_5);
                    }
                }, AnimationSpec, null, 16, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
            int i11113 = i8 >> 3;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, i11113 & 14);
            int i11114 = i8 & 14;
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, i11114);
            f = 0.0f;
            Float fValueOf11117 = Float.valueOf(0.0f);
            Float fValueOf11118 = Float.valueOf(fMo326toPx0680j_4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged2 = composerStartRestartGroup.changed(fValueOf11117) | composerStartRestartGroup.changed(anchoredDraggableState) | composerStartRestartGroup.changed(fValueOf11118);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AnchoredDraggableState.updateAnchors$material_release$default(anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(Boolean.FALSE, Float.valueOf(f)), TuplesKt.to(Boolean.TRUE, Float.valueOf(fMo326toPx0680j_4))), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
            objArr = new Object[]{anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i10 = 0;
            zChanged3 = false;
            while (i10 < i9) {
                zChanged3 |= composerStartRestartGroup.changed(objArr[i10]);
                i10++;
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new SwitchKt$Switch$3$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 64);
            Boolean boolValueOf1111 = Boolean.valueOf(z);
            Boolean boolValueOf1112 = Boolean.valueOf(Switch$lambda$3(mutableState));
            zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(z, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(anchoredDraggableState);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zOooO00o) {
                objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new SwitchKt$Switch$4$1(z, anchoredDraggableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf1111, boolValueOf1112, (Function2) objRememberedValue6, composerStartRestartGroup, i11114 | ConstantsKt.MINIMUM_BLOCK_SIZE);
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (function1 != null) {
                modifierM704toggleableO2vRcR0 = ToggleableKt.m704toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m3158boximpl(Role.INSTANCE.m3170getSwitcho7Vup1c()), function1);
            } else {
                modifierM704toggleableO2vRcR0 = Modifier.INSTANCE;
            }
            if (function1 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierThen16 = modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM704toggleableO2vRcR0);
            Orientation orientation16 = Orientation.Horizontal;
            if (z4) {
                z6 = false;
            } else {
                z6 = false;
            }
            Modifier modifierAnchoredDraggable16 = AnchoredDraggableKt.anchoredDraggable(modifierThen16, anchoredDraggableState, orientation16, z6, z5, mutableInteractionSource4);
            Alignment.Companion companion1112 = Alignment.INSTANCE;
            Modifier modifierM519requiredSizeVpY3zN19 = SizeKt.m519requiredSizeVpY3zN4(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifierAnchoredDraggable16, companion1112.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o16 = Oooo000.OooO00o(companion1112, false, composer2, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
            constructor = companion1113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM519requiredSizeVpY3zN19);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1113, composerM1320constructorimpl, measurePolicyOooO00o16, composerM1320constructorimpl, currentCompositionLocalMap16);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
            boolean zBooleanValue16 = ((Boolean) anchoredDraggableState.getTargetValue()).booleanValue();
            composer2.startReplaceableGroup(1157296644);
            zChanged4 = composer2.changed(anchoredDraggableState);
            objRememberedValue7 = composer2.rememberedValue();
            if (zChanged4) {
                objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(anchoredDraggableState.requireOffset());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$5$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(anchoredDraggableState.requireOffset());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceableGroup();
            Modifier modifier118 = modifier4;
            SwitchImpl(boxScopeInstance16, zBooleanValue16, z4, switchColorsM1213colorsSQMK_m0, (Function0) objRememberedValue7, mutableInteractionSource4, composer2, (i11113 & 896) | 6 | ((i8 >> 6) & 7168) | ((i8 << 3) & 458752));
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier118;
            mutableInteractionSource5 = mutableInteractionSource4;
            switchColors3 = switchColorsM1213colorsSQMK_m0;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier119 = modifier5;
        final boolean z14 = z4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.6
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

            public final void invoke(@Nullable Composer composer3, int i11115) {
                SwitchKt.Switch(z, function1, modifier119, z14, mutableInteractionSource5, switchColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> Switch$lambda$7(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final Function0<Float> function0, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(70908914);
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
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:212)");
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
                        SwitchKt.m1215drawTrackRPmYEkk(Canvas, SwitchKt.SwitchImpl$lambda$16(stateTrackColor), Canvas.mo326toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo326toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z2, z, composerStartRestartGroup, i4);
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float fM3775constructorimpl = Dp.m3775constructorimpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m3789unboximpl() + f);
            composerStartRestartGroup.startReplaceableGroup(-539243578);
            long jSwitchImpl$lambda$18 = (!Color.m1682equalsimpl0(SwitchImpl$lambda$18(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU()) || elevationOverlay == null) ? SwitchImpl$lambda$18(stateThumbColor) : elevationOverlay.mo1073apply7g2Lkgo(SwitchImpl$lambda$18(stateThumbColor), fM3775constructorimpl, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jSwitchImpl$lambda$18, null, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierAlign = boxScope.align(companion2, companion3.getCenterStart());
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged3 = composer2.changed(function0);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m3884boximpl(m1216invokeBjo55l4(density));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1216invokeBjo55l4(@NotNull Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(function0.invoke().floatValue()), 0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m170backgroundbw27NRU(ShadowKt.m1359shadows4CzXII$default(SizeKt.m517requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue4), interactionSource, RippleKt.m1288rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composer2, 54, 4)), ThumbDiameter), f, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$19(stateM58animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.SwitchImpl.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i5) {
                SwitchKt.SwitchImpl(boxScope, z, z2, switchColors, function0, interactionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$16(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    private static final long SwitchImpl$lambda$19(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1215drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOoo(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m1448getYimpl(drawScope.mo2117getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m1448getYimpl(drawScope.mo2117getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m2006getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
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
