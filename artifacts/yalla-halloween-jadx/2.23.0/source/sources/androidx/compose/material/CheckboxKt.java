package androidx.compose.material;

import androidx.compose.animation.OooOo;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010!\u001a9\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aA\u0010,\u001a\u00020\f*\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\n\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n50#2:493\n49#2:494\n25#2:501\n25#2:526\n83#2,3:533\n1114#3,6:487\n1114#3,6:495\n1114#3,6:502\n1114#3,6:527\n1114#3,6:536\n931#4,4:508\n852#4,5:512\n931#4,4:517\n852#4,5:521\n76#5:542\n76#5:543\n76#5:544\n76#5:545\n76#5:546\n154#6:547\n154#6:548\n154#6:549\n154#6:550\n154#6:551\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n96#1:493\n96#1:494\n137#1:501\n297#1:526\n301#1:533,3\n91#1:487,6\n96#1:495,6\n137#1:502,6\n297#1:527,6\n301#1:536,6\n266#1:508,4\n266#1:512,5\n282#1:517,4\n282#1:521,5\n266#1:542\n282#1:543\n298#1:544\n299#1:545\n300#1:546\n480#1:547\n481#1:548\n482#1:549\n483#1:550\n484#1:551\n*E\n"})
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m3765constructorimpl(24);
    private static final float CheckboxSize = Dp.m3765constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m3765constructorimpl(f);
        StrokeWidth = Dp.m3765constructorimpl(f);
        RadiusSize = Dp.m3765constructorimpl(f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x018b  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Checkbox(final boolean z, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable CheckboxColors checkboxColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        CheckboxColors checkboxColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        CheckboxColors checkboxColorsM1001colorszjMxDiM;
        Object objRememberedValue;
        Function0 function0;
        final CheckboxColors checkboxColors3;
        final boolean z5;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2118660998);
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
                    if ((i & 57344) == 0) {
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
                            checkboxColors2 = checkboxColors;
                            int i10 = composerStartRestartGroup.changed(checkboxColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
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
                                checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            } else {
                                i8 = i3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                            }
                            ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                            composerStartRestartGroup.startReplaceableGroup(1433125990);
                            if (function1 != null) {
                                Boolean boolValueOf = Boolean.valueOf(z);
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(function1);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            function1.invoke(Boolean.valueOf(!z));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function0 = (Function0) objRememberedValue2;
                            } else {
                                function0 = null;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            TriStateCheckbox(ToggleableState, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            boolean z6 = z4;
                            checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                            z5 = z6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i8 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                        }
                        ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                        composerStartRestartGroup.startReplaceableGroup(1433125990);
                        if (function1 != null) {
                            Boolean boolValueOf2 = Boolean.valueOf(z);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(function1);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        function1.invoke(Boolean.valueOf(!z));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        function1.invoke(Boolean.valueOf(!z));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function0 = (Function0) objRememberedValue2;
                        } else {
                            function0 = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TriStateCheckbox(ToggleableState2, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        boolean z7 = z4;
                        checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                        z5 = z7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier4 = modifier3;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            CheckboxKt.Checkbox(z, function1, modifier4, z5, mutableInteractionSource4, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState3 = ToggleableStateKt.ToggleableState(z);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf3 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState3, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z8 = z4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    z5 = z8;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState4 = ToggleableStateKt.ToggleableState(z);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf4 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf4) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState4, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z9 = z4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    z5 = z9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier5 = modifier3;
                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.Checkbox(z, function1, modifier5, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
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
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState5 = ToggleableStateKt.ToggleableState(z);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf5 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf5) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState5, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z10 = z4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    z5 = z10;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState6 = ToggleableStateKt.ToggleableState(z);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf6 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState6, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z11 = z4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    z5 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier6 = modifier3;
                final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.Checkbox(z, function1, modifier6, z5, mutableInteractionSource6, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState7 = ToggleableStateKt.ToggleableState(z);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf7 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf7) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState7, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z12 = z4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                z5 = z12;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState8 = ToggleableStateKt.ToggleableState(z);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf8 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf8) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState8, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z13 = z4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                z5 = z13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier7 = modifier3;
            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.Checkbox(z, function1, modifier7, z5, mutableInteractionSource7, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                if ((i & 57344) == 0) {
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
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState9 = ToggleableStateKt.ToggleableState(z);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf9 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf9) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState9, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z14 = z4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    z5 = z14;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        } else {
                            i8 = i3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState10 = ToggleableStateKt.ToggleableState(z);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf10 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf10) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.valueOf(!z));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState10, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z15 = z4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    z5 = z15;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier8 = modifier3;
                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.Checkbox(z, function1, modifier8, z5, mutableInteractionSource8, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState11 = ToggleableStateKt.ToggleableState(z);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf11 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf11) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState11, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z16 = z4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                z5 = z16;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState12 = ToggleableStateKt.ToggleableState(z);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf12 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf12) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState12, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z17 = z4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                z5 = z17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier9 = modifier3;
            final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.Checkbox(z, function1, modifier9, z5, mutableInteractionSource9, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
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
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState13 = ToggleableStateKt.ToggleableState(z);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf13 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf13) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState13, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z18 = z4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                z5 = z18;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    } else {
                        i8 = i3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState14 = ToggleableStateKt.ToggleableState(z);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf14 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf14) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(Boolean.valueOf(!z));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState14, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z19 = z4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                z5 = z19;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier10 = modifier3;
            final MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.Checkbox(z, function1, modifier10, z5, mutableInteractionSource10, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) == 0) {
            if ((i2 & 32) == 0) {
                checkboxColors2 = checkboxColors;
                if (composerStartRestartGroup.changed(checkboxColors2)) {
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
            }
            i3 |= i10;
        } else {
            checkboxColors2 = checkboxColors;
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
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                } else {
                    i8 = i3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                } else {
                    i8 = i3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
            }
            ToggleableState ToggleableState15 = ToggleableStateKt.ToggleableState(z);
            composerStartRestartGroup.startReplaceableGroup(1433125990);
            if (function1 != null) {
                Boolean boolValueOf15 = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf15) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function0 = (Function0) objRememberedValue2;
            } else {
                function0 = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState15, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z110 = z4;
            checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            z5 = z110;
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
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                } else {
                    i8 = i3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
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
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                } else {
                    i8 = i3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118660998, i8, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
            }
            ToggleableState ToggleableState16 = ToggleableStateKt.ToggleableState(z);
            composerStartRestartGroup.startReplaceableGroup(1433125990);
            if (function1 != null) {
                Boolean boolValueOf16 = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf16) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.CheckboxKt$Checkbox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(Boolean.valueOf(!z));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function0 = (Function0) objRememberedValue2;
            } else {
                function0 = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState16, function0, modifier3, z4, mutableInteractionSource3, checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z111 = z4;
            checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            z5 = z111;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier11 = modifier3;
        final MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.Checkbox.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                CheckboxKt.Checkbox(z, function1, modifier11, z5, mutableInteractionSource11, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:112:0x0270 A[LOOP:0: B:111:0x026e->B:112:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0288  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:76:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c3  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CheckboxImpl(final boolean z, final ToggleableState toggleableState, final Modifier modifier, final CheckboxColors checkboxColors, Composer composer, final int i) {
        float f;
        float f2;
        final State stateCreateTransitionAnimation;
        int i2;
        int i3;
        float f3;
        int i4;
        int i5;
        final State stateCreateTransitionAnimation2;
        Object objRememberedValue;
        final CheckDrawingCache checkDrawingCache;
        final State<Color> stateCheckmarkColor;
        final State<Color> stateBoxColor;
        final State<Color> stateBorderColor;
        Object[] objArr;
        boolean zChanged;
        int i6;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2118895727);
        int i7 = (i & 14) == 0 ? (composerStartRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i7 |= composerStartRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i7 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i7 |= composerStartRestartGroup.changed(checkboxColors) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i8 = i7;
        if ((i8 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118895727, i8, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)");
            }
            int i9 = i8 >> 3;
            int i10 = i9 & 14;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(toggleableState, (String) null, composerStartRestartGroup, i10, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> segment, @Nullable Composer composer2, int i11) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
                    if (OooOo.OooO00o(segment, "$this$animateFloat", composer2, -1707702900)) {
                        ComposerKt.traceEventStart(-1707702900, i11, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:266)");
                    }
                    ToggleableState initialState = segment.getInitialState();
                    ToggleableState toggleableState2 = ToggleableState.Off;
                    if (initialState == toggleableState2) {
                        finiteAnimationSpecSnap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    } else {
                        finiteAnimationSpecSnap = segment.getTargetState() == toggleableState2 ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecSnap;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            ToggleableState toggleableState2 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1798345588);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i11 = iArr[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i11 == 1) {
                f = 1.0f;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf = Float.valueOf(f);
            ToggleableState toggleableState3 = (ToggleableState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1798345588);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int i12 = iArr[toggleableState3.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    f2 = 0.0f;
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> segment, @Nullable Composer composer2, int i13) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
                        if (OooOo.OooO00o(segment, "$this$animateFloat", composer2, 1075283605)) {
                            ComposerKt.traceEventStart(1075283605, i13, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)");
                        }
                        ToggleableState initialState = segment.getInitialState();
                        ToggleableState toggleableState4 = ToggleableState.Off;
                        if (initialState == toggleableState4) {
                            finiteAnimationSpecSnap = AnimationSpecKt.snap$default(0, 1, null);
                        } else {
                            finiteAnimationSpecSnap = segment.getTargetState() == toggleableState4 ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpecSnap;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                ToggleableState toggleableState4 = (ToggleableState) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-2098942571);
                if (ComposerKt.isTraceInProgress()) {
                    i2 = -1;
                    ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                } else {
                    i2 = -1;
                }
                i3 = iArr[toggleableState4.ordinal()];
                if (i3 != 1 || i3 == 2) {
                    f3 = 0.0f;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f3 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f3);
                ToggleableState toggleableState5 = (ToggleableState) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-2098942571);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2098942571, 0, i2, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                }
                i4 = iArr[toggleableState5.ordinal()];
                if (i4 != 1) {
                    i5 = 2;
                    if (i4 != 2) {
                        if (i4 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f4 = 1.0f;
                    }
                } else {
                    i5 = 2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i13 = i5;
                stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CheckDrawingCache(null, null, null, 7, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                checkDrawingCache = (CheckDrawingCache) objRememberedValue;
                stateCheckmarkColor = checkboxColors.checkmarkColor(toggleableState, composerStartRestartGroup, i10 | ((i8 >> 6) & 112));
                int i14 = (i9 & 896) | (i8 & 14) | (i8 & 112);
                stateBoxColor = checkboxColors.boxColor(z, toggleableState, composerStartRestartGroup, i14);
                stateBorderColor = checkboxColors.borderColor(z, toggleableState, composerStartRestartGroup, i14);
                Modifier modifierM515requiredSize3ABfNKs = SizeKt.m515requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, i13, null), CheckboxSize);
                objArr = new Object[6];
                objArr[0] = stateBoxColor;
                objArr[1] = stateBorderColor;
                objArr[i13] = stateCheckmarkColor;
                objArr[3] = stateCreateTransitionAnimation;
                objArr[4] = stateCreateTransitionAnimation2;
                objArr[5] = checkDrawingCache;
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                for (i6 = 0; i6 < 6; i6++) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i6]);
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
                            float fFloor = (float) Math.floor(Canvas.mo324toPx0680j_4(CheckboxKt.StrokeWidth));
                            CheckboxKt.m1004drawBox1wkBAMs(Canvas, CheckboxKt.CheckboxImpl$lambda$9(stateBoxColor), CheckboxKt.CheckboxImpl$lambda$10(stateBorderColor), Canvas.mo324toPx0680j_4(CheckboxKt.RadiusSize), fFloor);
                            CheckboxKt.m1005drawCheck3IgeMak(Canvas, CheckboxKt.CheckboxImpl$lambda$8(stateCheckmarkColor), CheckboxKt.CheckboxImpl$lambda$4(stateCreateTransitionAnimation), CheckboxKt.CheckboxImpl$lambda$6(stateCreateTransitionAnimation2), fFloor, checkDrawingCache);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM515requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$3 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<ToggleableState> segment, @Nullable Composer composer2, int i15) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
                    if (OooOo.OooO00o(segment, "$this$animateFloat", composer2, 1075283605)) {
                        ComposerKt.traceEventStart(1075283605, i15, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)");
                    }
                    ToggleableState initialState = segment.getInitialState();
                    ToggleableState toggleableState6 = ToggleableState.Off;
                    if (initialState == toggleableState6) {
                        finiteAnimationSpecSnap = AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        finiteAnimationSpecSnap = segment.getTargetState() == toggleableState6 ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecSnap;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            ToggleableState toggleableState6 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-2098942571);
            if (ComposerKt.isTraceInProgress()) {
                i2 = -1;
                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
            } else {
                i2 = -1;
            }
            i3 = iArr[toggleableState6.ordinal()];
            if (i3 != 1) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf3 = Float.valueOf(f3);
            ToggleableState toggleableState7 = (ToggleableState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-2098942571);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098942571, 0, i2, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
            }
            i4 = iArr[toggleableState7.ordinal()];
            if (i4 != 1) {
                i5 = 2;
                if (i4 != 2) {
                    if (i4 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4 = 1.0f;
                }
            } else {
                i5 = 2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i15 = i5;
            stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CheckDrawingCache(null, null, null, 7, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            checkDrawingCache = (CheckDrawingCache) objRememberedValue;
            stateCheckmarkColor = checkboxColors.checkmarkColor(toggleableState, composerStartRestartGroup, i10 | ((i8 >> 6) & 112));
            int i16 = (i9 & 896) | (i8 & 14) | (i8 & 112);
            stateBoxColor = checkboxColors.boxColor(z, toggleableState, composerStartRestartGroup, i16);
            stateBorderColor = checkboxColors.borderColor(z, toggleableState, composerStartRestartGroup, i16);
            Modifier modifierM515requiredSize3ABfNKs2 = SizeKt.m515requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, i15, null), CheckboxSize);
            objArr = new Object[6];
            objArr[0] = stateBoxColor;
            objArr[1] = stateBorderColor;
            objArr[i15] = stateCheckmarkColor;
            objArr[3] = stateCreateTransitionAnimation;
            objArr[4] = stateCreateTransitionAnimation2;
            objArr[5] = checkDrawingCache;
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i6 < 6) {
                zChanged |= composerStartRestartGroup.changed(objArr[i6]);
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
                        float fFloor = (float) Math.floor(Canvas.mo324toPx0680j_4(CheckboxKt.StrokeWidth));
                        CheckboxKt.m1004drawBox1wkBAMs(Canvas, CheckboxKt.CheckboxImpl$lambda$9(stateBoxColor), CheckboxKt.CheckboxImpl$lambda$10(stateBorderColor), Canvas.mo324toPx0680j_4(CheckboxKt.RadiusSize), fFloor);
                        CheckboxKt.m1005drawCheck3IgeMak(Canvas, CheckboxKt.CheckboxImpl$lambda$8(stateCheckmarkColor), CheckboxKt.CheckboxImpl$lambda$4(stateCreateTransitionAnimation), CheckboxKt.CheckboxImpl$lambda$6(stateCreateTransitionAnimation2), fFloor, checkDrawingCache);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
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
                        float fFloor = (float) Math.floor(Canvas.mo324toPx0680j_4(CheckboxKt.StrokeWidth));
                        CheckboxKt.m1004drawBox1wkBAMs(Canvas, CheckboxKt.CheckboxImpl$lambda$9(stateBoxColor), CheckboxKt.CheckboxImpl$lambda$10(stateBorderColor), Canvas.mo324toPx0680j_4(CheckboxKt.RadiusSize), fFloor);
                        CheckboxKt.m1005drawCheck3IgeMak(Canvas, CheckboxKt.CheckboxImpl$lambda$8(stateCheckmarkColor), CheckboxKt.CheckboxImpl$lambda$4(stateCreateTransitionAnimation), CheckboxKt.CheckboxImpl$lambda$6(stateCreateTransitionAnimation2), fFloor, checkDrawingCache);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM515requiredSize3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.CheckboxImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i17) {
                CheckboxKt.CheckboxImpl(z, toggleableState, modifier, checkboxColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$10(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$8(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$9(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153  */
    /* JADX WARN: Code duplicated, block: B:103:0x0161  */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:108:0x019d  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TriStateCheckbox(@NotNull final ToggleableState state, @Nullable final Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable CheckboxColors checkboxColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        CheckboxColors checkboxColors2;
        Modifier modifier3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        CheckboxColors checkboxColorsM1001colorszjMxDiM;
        int i8;
        Object objRememberedValue;
        Modifier modifierM706triStateToggleableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource5;
        final CheckboxColors checkboxColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2031255194);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
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
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
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
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            int i10 = composerStartRestartGroup.changed(checkboxColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
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
                                z3 = true;
                            } else {
                                z3 = z2;
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
                                z4 = z3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                                i8 = i3 & (-458753);
                                modifier4 = modifier3;
                            } else {
                                modifier4 = modifier3;
                                z4 = z3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                                i8 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i8 = i3;
                            z4 = z2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            modifier4 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1517549514);
                        if (function0 != null) {
                            modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                        } else {
                            modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        z5 = z4;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z5 = z2;
                        composerStartRestartGroup = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
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
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z5 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z5 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
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
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
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
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z5 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z5 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
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
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z5 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z5 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
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
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (composerStartRestartGroup.changed(checkboxColors2)) {
                        }
                        i3 |= i10;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
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
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z5 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
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
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                            i8 = i3 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                            i8 = i3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z5 = z4;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
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
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z5 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z5 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
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
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i3 |= i10;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
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
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z5 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
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
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                        i8 = i3 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                        i8 = i3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z5 = z4;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                checkboxColors2 = checkboxColors;
                if (composerStartRestartGroup.changed(checkboxColors2)) {
                }
                i3 |= i10;
            } else {
                checkboxColors2 = checkboxColors;
            }
            i3 |= i10;
        } else {
            checkboxColors2 = checkboxColors;
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
                    z3 = true;
                } else {
                    z3 = z2;
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
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    i8 = i3;
                }
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
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
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    i8 = i3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1517549514);
            if (function0 != null) {
                modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
            } else {
                modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            z5 = z4;
            mutableInteractionSource5 = mutableInteractionSource4;
            checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
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
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    i8 = i3;
                }
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
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
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = CheckboxDefaults.INSTANCE.m1001colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 196608, 31);
                    i8 = i3 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z4 = z3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM1001colorszjMxDiM = checkboxColors2;
                    i8 = i3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031255194, i8, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1517549514);
            if (function0 != null) {
                modifierM706triStateToggleableO2vRcR0 = ToggleableKt.m706triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m1277rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, composerStartRestartGroup, 54, 4), z4, Role.m3148boximpl(Role.INSTANCE.m3156getCheckboxo7Vup1c()), function0);
            } else {
                modifierM706triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            CheckboxImpl(z4, state, PaddingKt.m476padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM706triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsM1001colorszjMxDiM, composerStartRestartGroup, ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            z5 = z4;
            mutableInteractionSource5 = mutableInteractionSource4;
            checkboxColors3 = checkboxColorsM1001colorszjMxDiM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.CheckboxKt.TriStateCheckbox.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                CheckboxKt.TriStateCheckbox(state, function0, modifier2, z5, mutableInteractionSource5, checkboxColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1004drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float fM1505getWidthimpl = Size.m1505getWidthimpl(drawScope.mo2108getSizeNHjbRc());
        if (Color.m1671equalsimpl0(j, j2)) {
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawScope, j, 0L, androidx.compose.ui.geometry.SizeKt.Size(fM1505getWidthimpl, fM1505getWidthimpl), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f4 = fM1505getWidthimpl - (2 * f2);
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawScope, j, OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f4, f4), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f - f2), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f5 = fM1505getWidthimpl - f2;
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawScope, j2, OffsetKt.Offset(f3, f3), androidx.compose.ui.geometry.SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(f - f3, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m1005drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m1997getSquareKaPHkGw(), 0, null, 26, null);
        float fM1505getWidthimpl = Size.m1505getWidthimpl(drawScope.mo2108getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * fM1505getWidthimpl, fLerp3 * fM1505getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(fLerp * fM1505getWidthimpl, fLerp2 * fM1505getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * fM1505getWidthimpl, fM1505getWidthimpl * fLerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo00O(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }
}
