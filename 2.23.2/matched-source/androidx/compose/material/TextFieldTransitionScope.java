package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.Oooo0;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jµ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,376:1\n940#2:377\n858#2,5:378\n940#2:383\n858#2,5:384\n858#2,5:400\n858#2,5:416\n69#3,2:389\n71#3:395\n74#3:399\n69#3,2:405\n71#3:411\n74#3:415\n36#4:391\n36#4:407\n1097#5,3:392\n1100#5,3:396\n1097#5,3:408\n1100#5,3:412\n81#6:421\n81#6:422\n81#6:423\n81#6:424\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n281#1:377\n281#1:378,5\n292#1:383\n292#1:384,5\n320#1:400,5\n330#1:416,5\n320#1:389,2\n320#1:395\n320#1:399\n330#1:405,2\n330#1:411\n330#1:415\n320#1:391\n330#1:407\n320#1:392,3\n320#1:396,3\n330#1:408,3\n330#1:412,3\n281#1:421\n292#1:422\n320#1:423\n330#1:424\n*E\n"})
final class TextFieldTransitionScope {

    @NotNull
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0202  */
    /* JADX WARN: Code duplicated, block: B:124:0x020a  */
    /* JADX WARN: Code duplicated, block: B:127:0x024f  */
    /* JADX WARN: Code duplicated, block: B:130:0x025b  */
    /* JADX WARN: Code duplicated, block: B:131:0x025e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0266  */
    /* JADX WARN: Code duplicated, block: B:139:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02be  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x0362  */
    /* JADX WARN: Code duplicated, block: B:167:0x040a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc  */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    /* JADX INFO: renamed from: Transition-DTcfvLk, reason: not valid java name */
    public final void m1259TransitionDTcfvLk(@NotNull final InputPhase inputState, final long j, final long j2, @NotNull final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> contentColor, final boolean z, @NotNull final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        InputPhase inputPhase;
        long j3;
        ColorSpace colorSpaceM1685getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        InputPhase inputPhase2;
        long j4;
        InputPhase inputPhase3;
        long j5;
        ColorSpace colorSpaceM1685getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1988729962);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(contentColor) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 57344) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1988729962, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:262)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", composerStartRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i6) {
                    if (Oooo0.OooO00o(segment, "$this$animateFloat", composer2, -611722692)) {
                        ComposerKt.traceEventStart(-611722692, i6, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:282)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            InputPhase inputPhase4 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1158004136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:283)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i6 = iArr[inputPhase4.ordinal()];
            float f4 = 0.0f;
            if (i6 == 1) {
                f = 1.0f;
            } else if (i6 != 2) {
                if (i6 != 3) {
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
            InputPhase inputPhase5 = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1158004136);
            if (ComposerKt.isTraceInProgress()) {
                i3 = -1;
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:283)");
            } else {
                i3 = -1;
            }
            int i7 = iArr[inputPhase5.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    f2 = 0.0f;
                } else if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "LabelProgress", composerStartRestartGroup, 196608);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        if (Oooo0.OooO00o(segment, "$this$animateFloat", composer2, -1079955085)) {
                            ComposerKt.traceEventStart(-1079955085, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:293)");
                        }
                        InputPhase inputPhase6 = InputPhase.Focused;
                        InputPhase inputPhase7 = InputPhase.UnfocusedEmpty;
                        if (segment.isTransitioningTo(inputPhase6, inputPhase7)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                        } else {
                            finiteAnimationSpecTween = (segment.isTransitioningTo(inputPhase7, inputPhase6) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase7)) ? AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing()) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpecTween;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                InputPhase inputPhase6 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1376159017, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                }
                i4 = iArr[inputPhase6.ordinal()];
                if (i4 == 1) {
                    f3 = 1.0f;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z) {
                        f3 = 1.0f;
                    }
                    f3 = 0.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f3);
                InputPhase inputPhase7 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1376159017, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                }
                i5 = iArr[inputPhase7.ordinal()];
                if (i5 == 1) {
                    f4 = 1.0f;
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z) {
                    f4 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, 196608);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                        if (Oooo0.OooO00o(segment, "$this$animateColor", composer2, -130058045)) {
                            ComposerKt.traceEventStart(-130058045, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return tweenSpecTween$default;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                inputPhase = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[inputPhase.ordinal()] == 1) {
                    j3 = j;
                } else {
                    j3 = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                colorSpaceM1685getColorSpaceimpl = Color.m1685getColorSpaceimpl(j3);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(colorSpaceM1685getColorSpaceimpl);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                inputPhase2 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[inputPhase2.ordinal()] == 1) {
                    j4 = j;
                } else {
                    j4 = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Color colorM1671boximpl = Color.m1671boximpl(j4);
                inputPhase3 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1490209928);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                }
                if (iArr[inputPhase3.ordinal()] == 1) {
                    j5 = j;
                } else {
                    j5 = j2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM1671boximpl, Color.m1671boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                        if (Oooo0.OooO00o(segment, "$this$animateColor", composer2, -32667848)) {
                            ComposerKt.traceEventStart(-32667848, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:330)");
                        }
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return tweenSpecTween$default;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }
                };
                int i8 = (i2 & 7168) | 384;
                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                colorSpaceM1685getColorSpaceimpl2 = Color.m1685getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i8 >> 6) & 112)).m1691unboximpl());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(colorSpaceM1685getColorSpaceimpl2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i9 = (i8 & 14) | 64;
                int i10 = i8 << 3;
                int i11 = (i10 & 57344) | i9 | (i10 & 896) | (i10 & 7168);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                int i12 = (i11 >> 9) & 112;
                State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i12)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i12)), textFieldTransitionScope$Transition$labelContentColor$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & 458752));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m1671boximpl(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation3)), Color.m1671boximpl(Transition_DTcfvLk$lambda$6(stateCreateTransitionAnimation4)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation2)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "LabelProgress", composerStartRestartGroup, 196608);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$3 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i13) {
                    FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                    if (Oooo0.OooO00o(segment, "$this$animateFloat", composer2, -1079955085)) {
                        ComposerKt.traceEventStart(-1079955085, i13, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:293)");
                    }
                    InputPhase inputPhase8 = InputPhase.Focused;
                    InputPhase inputPhase9 = InputPhase.UnfocusedEmpty;
                    if (segment.isTransitioningTo(inputPhase8, inputPhase9)) {
                        finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                    } else {
                        finiteAnimationSpecTween = (segment.isTransitioningTo(inputPhase9, inputPhase8) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase9)) ? AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing()) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return finiteAnimationSpecTween;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            InputPhase inputPhase8 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1376159017);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1376159017, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
            }
            i4 = iArr[inputPhase8.ordinal()];
            if (i4 == 1) {
                f3 = 1.0f;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z) {
                    f3 = 1.0f;
                }
                f3 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf3 = Float.valueOf(f3);
            InputPhase inputPhase9 = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1376159017);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1376159017, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
            }
            i5 = iArr[inputPhase9.ordinal()];
            if (i5 == 1) {
                f4 = 1.0f;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z) {
                f4 = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation6 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "PlaceholderOpacity", composerStartRestartGroup, 196608);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$3 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i13) {
                    if (Oooo0.OooO00o(segment, "$this$animateColor", composer2, -130058045)) {
                        ComposerKt.traceEventStart(-130058045, i13, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:320)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            inputPhase = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1490209928);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
            }
            if (iArr[inputPhase.ordinal()] == 1) {
                j3 = j;
            } else {
                j3 = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            colorSpaceM1685getColorSpaceimpl = Color.m1685getColorSpaceimpl(j3);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(colorSpaceM1685getColorSpaceimpl);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            inputPhase2 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1490209928);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
            }
            if (iArr[inputPhase2.ordinal()] == 1) {
                j4 = j;
            } else {
                j4 = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Color colorM1671boximpl2 = Color.m1671boximpl(j4);
            inputPhase3 = (InputPhase) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1490209928);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, i3, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
            }
            if (iArr[inputPhase3.ordinal()] == 1) {
                j5 = j;
            } else {
                j5 = j2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation7 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM1671boximpl2, Color.m1671boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, 229376);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$3 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i13) {
                    if (Oooo0.OooO00o(segment, "$this$animateColor", composer2, -32667848)) {
                        ComposerKt.traceEventStart(-32667848, i13, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:330)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            int i13 = (i2 & 7168) | 384;
            composerStartRestartGroup.startReplaceableGroup(-1939694975);
            colorSpaceM1685getColorSpaceimpl2 = Color.m1685getColorSpaceimpl(contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i13 >> 6) & 112)).m1691unboximpl());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(colorSpaceM1685getColorSpaceimpl2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM1685getColorSpaceimpl2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i14 = (i13 & 14) | 64;
            int i15 = i13 << 3;
            int i16 = (i15 & 57344) | i14 | (i15 & 896) | (i15 & 7168);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            int i17 = (i16 >> 9) & 112;
            State stateCreateTransitionAnimation8 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, contentColor.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i17)), contentColor.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i17)), textFieldTransitionScope$Transition$labelContentColor$3.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, Integer.valueOf((i16 >> 3) & 112)), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, (i16 & 14) | ((i16 << 9) & 57344) | ((i16 << 6) & 458752));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation5)), Color.m1671boximpl(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation7)), Color.m1671boximpl(Transition_DTcfvLk$lambda$6(stateCreateTransitionAnimation8)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation6)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
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

            public final void invoke(@Nullable Composer composer2, int i18) {
                this.$tmp0_rcvr.m1259TransitionDTcfvLk(inputState, j, j2, contentColor, z, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}
