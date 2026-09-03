package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n50#2:243\n49#2:244\n1097#3,6:235\n1097#3,6:245\n75#4:241\n75#4:254\n154#5:242\n154#5:251\n154#5:252\n154#5:253\n154#5:255\n154#5:256\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n116#1:243\n116#1:244\n79#1:235,6\n116#1:245,6\n83#1:241\n230#1:254\n83#1:242\n227#1:251\n228#1:252\n229#1:253\n231#1:255\n232#1:256\n*E\n"})
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m3775constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    static {
        float f = 2;
        RadioButtonPadding = Dp.m3775constructorimpl(f);
        float fM3775constructorimpl = Dp.m3775constructorimpl(20);
        RadioButtonSize = fM3775constructorimpl;
        RadioRadius = Dp.m3775constructorimpl(fM3775constructorimpl / f);
        RadioButtonDotSize = Dp.m3775constructorimpl(12);
        RadioStrokeWidth = Dp.m3775constructorimpl(f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0149  */
    /* JADX WARN: Code duplicated, block: B:105:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x0186  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x020c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:121:0x022a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0239  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void RadioButton(final boolean z, @Nullable final Function0<Unit> function0, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable RadioButtonColors radioButtonColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        RadioButtonColors radioButtonColors2;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        RadioButtonColors radioButtonColorsM1171colorsRGew2ao;
        Object objRememberedValue;
        float fM3775constructorimpl;
        final State<Dp> stateM70animateDpAsStateAjpBEmI;
        final State<Color> stateRadioColor;
        boolean z5;
        Modifier modifierM700selectableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean zChanged;
        Object objRememberedValue2;
        final RadioButtonColors radioButtonColors3;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1314435585);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
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
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            int i9 = composerStartRestartGroup.changed(radioButtonColors2) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
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
                                i3 &= -458753;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier4 = modifier3;
                                radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier4 = modifier3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                            }
                            if (z) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                            } else {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            }
                            stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                            int i10 = i3 >> 9;
                            stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i10 & 14) | (i10 & 896));
                            composerStartRestartGroup.startReplaceableGroup(1941632354);
                            if (function0 != null) {
                                z5 = z4;
                                modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                            } else {
                                z5 = z4;
                                modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (function0 != null) {
                                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                            } else {
                                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                            }
                            Modifier modifierM517requiredSize3ABfNKs = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                        float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                        float f = fMo326toPx0680j_4 / 2;
                                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                        if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM517requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                            z6 = z5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                        }
                        if (z) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        }
                        stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        int i11 = i3 >> 9;
                        stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i11 & 14) | (i11 & 896));
                        composerStartRestartGroup.startReplaceableGroup(1941632354);
                        if (function0 != null) {
                            z5 = z4;
                            modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                        } else {
                            z5 = z4;
                            modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierM517requiredSize3ABfNKs2 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                    float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f = fMo326toPx0680j_4 / 2;
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                    float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f = fMo326toPx0680j_4 / 2;
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM517requiredSize3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                        z6 = z5;
                        mutableInteractionSource5 = mutableInteractionSource4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composerStartRestartGroup = composerStartRestartGroup;
                        z6 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        radioButtonColors3 = radioButtonColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColors2)) {
                        }
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    }
                    stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i12 = i3 >> 9;
                    stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i12 & 14) | (i12 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM517requiredSize3ABfNKs3 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM517requiredSize3ABfNKs3, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                    z6 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    }
                    stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i13 = i3 >> 9;
                    stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i13 & 14) | (i13 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM517requiredSize3ABfNKs4 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM517requiredSize3ABfNKs4, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                    z6 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
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
                        RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColors2)) {
                        }
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    }
                    stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i14 = i3 >> 9;
                    stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i14 & 14) | (i14 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM517requiredSize3ABfNKs5 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM517requiredSize3ABfNKs5, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                    z6 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    }
                    stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i15 = i3 >> 9;
                    stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i15 & 14) | (i15 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM517requiredSize3ABfNKs6 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM517requiredSize3ABfNKs6, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                    z6 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i16) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    radioButtonColors2 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColors2)) {
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i3 |= i9;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                }
                stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i16 = i3 >> 9;
                stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i16 & 14) | (i16 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM517requiredSize3ABfNKs7 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM517requiredSize3ABfNKs7, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                z6 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                }
                stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i17 = i3 >> 9;
                stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i17 & 14) | (i17 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM517requiredSize3ABfNKs8 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM517requiredSize3ABfNKs8, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                z6 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
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
                    RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        radioButtonColors2 = radioButtonColors;
                        if (composerStartRestartGroup.changed(radioButtonColors2)) {
                        }
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    }
                    stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i18 = i3 >> 9;
                    stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i18 & 14) | (i18 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM517requiredSize3ABfNKs9 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM517requiredSize3ABfNKs9, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                    z6 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    } else {
                        if (i8 != 0) {
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
                            i3 &= -458753;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                            radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                    }
                    if (z) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                    } else {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    }
                    stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                    int i19 = i3 >> 9;
                    stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i19 & 14) | (i19 & 896));
                    composerStartRestartGroup.startReplaceableGroup(1941632354);
                    if (function0 != null) {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                    } else {
                        z5 = z4;
                        modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    Modifier modifierM517requiredSize3ABfNKs10 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                                float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                float f = fMo326toPx0680j_4 / 2;
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                    androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM517requiredSize3ABfNKs10, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                    z6 = z5;
                    mutableInteractionSource5 = mutableInteractionSource4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i110) {
                        RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    radioButtonColors2 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColors2)) {
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i3 |= i9;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                }
                stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i110 = i3 >> 9;
                stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i110 & 14) | (i110 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM517requiredSize3ABfNKs11 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM517requiredSize3ABfNKs11, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                z6 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                }
                stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i111 = i3 >> 9;
                stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i111 & 14) | (i111 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM517requiredSize3ABfNKs12 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM517requiredSize3ABfNKs12, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                z6 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i112) {
                    RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    radioButtonColors2 = radioButtonColors;
                    if (composerStartRestartGroup.changed(radioButtonColors2)) {
                    }
                    i3 |= i9;
                } else {
                    radioButtonColors2 = radioButtonColors;
                }
                i3 |= i9;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                }
                stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i112 = i3 >> 9;
                stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i112 & 14) | (i112 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM517requiredSize3ABfNKs13 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM517requiredSize3ABfNKs13, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                z6 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                } else {
                    if (i8 != 0) {
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
                        i3 &= -458753;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                        radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
                }
                if (z) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
                } else {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                }
                stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                int i113 = i3 >> 9;
                stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i113 & 14) | (i113 & 896));
                composerStartRestartGroup.startReplaceableGroup(1941632354);
                if (function0 != null) {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
                } else {
                    z5 = z4;
                    modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                Modifier modifierM517requiredSize3ABfNKs14 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                            float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                            float f = fMo326toPx0680j_4 / 2;
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                            if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM517requiredSize3ABfNKs14, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
                z6 = z5;
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i114) {
                    RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                radioButtonColors2 = radioButtonColors;
                if (composerStartRestartGroup.changed(radioButtonColors2)) {
                }
                i3 |= i9;
            } else {
                radioButtonColors2 = radioButtonColors;
            }
            i3 |= i9;
        } else {
            radioButtonColors2 = radioButtonColors;
        }
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
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
                    i3 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                }
            } else {
                if (i8 != 0) {
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
                    i3 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
            }
            if (z) {
                fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
            } else {
                fM3775constructorimpl = Dp.m3775constructorimpl(0);
            }
            stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            int i114 = i3 >> 9;
            stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i114 & 14) | (i114 & 896));
            composerStartRestartGroup.startReplaceableGroup(1941632354);
            if (function0 != null) {
                z5 = z4;
                modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
            } else {
                z5 = z4;
                modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierM517requiredSize3ABfNKs15 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f = fMo326toPx0680j_4 / 2;
                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f = fMo326toPx0680j_4 / 2;
                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM517requiredSize3ABfNKs15, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
            z6 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
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
                    i3 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                }
            } else {
                if (i8 != 0) {
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
                    i3 &= -458753;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = RadioButtonDefaults.INSTANCE.m1171colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    modifier4 = modifier3;
                    radioButtonColorsM1171colorsRGew2ao = radioButtonColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:73)");
            }
            if (z) {
                fM3775constructorimpl = Dp.m3775constructorimpl(RadioButtonDotSize / 2);
            } else {
                fM3775constructorimpl = Dp.m3775constructorimpl(0);
            }
            stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            int i115 = i3 >> 9;
            stateRadioColor = radioButtonColorsM1171colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i115 & 14) | (i115 & 896));
            composerStartRestartGroup.startReplaceableGroup(1941632354);
            if (function0 != null) {
                z5 = z4;
                modifierM700selectableO2vRcR0 = SelectableKt.m700selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m1288rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m3158boximpl(Role.INSTANCE.m3169getRadioButtono7Vup1c()), function0);
            } else {
                z5 = z4;
                modifierM700selectableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            Modifier modifierM517requiredSize3ABfNKs16 = SizeKt.m517requiredSize3ABfNKs(PaddingKt.m478padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM700selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r0, 2, null), RadioButtonPadding), RadioButtonSize);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(stateRadioColor) | composerStartRestartGroup.changed(stateM70animateDpAsStateAjpBEmI);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f = fMo326toPx0680j_4 / 2;
                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
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
                        float fMo326toPx0680j_4 = Canvas.mo326toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                        float f = fMo326toPx0680j_4 / 2;
                        androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        if (Dp.m3774compareTo0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), Dp.m3775constructorimpl(0)) > 0) {
                            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(Canvas, stateRadioColor.getValue().m1691unboximpl(), Canvas.mo326toPx0680j_4(stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM517requiredSize3ABfNKs16, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            radioButtonColors3 = radioButtonColorsM1171colorsRGew2ao;
            z6 = z5;
            mutableInteractionSource5 = mutableInteractionSource4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
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
                RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
