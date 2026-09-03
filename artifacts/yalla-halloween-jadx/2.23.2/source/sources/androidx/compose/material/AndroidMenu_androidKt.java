package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aa\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,220:1\n154#2:221\n154#2:222\n25#3:223\n25#3:230\n36#3:238\n25#3:245\n1097#4,6:224\n1097#4,6:231\n1097#4,6:239\n1097#4,6:246\n76#5:237\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n89#1:221\n151#1:222\n156#1:223\n160#1:230\n165#1:238\n208#1:245\n156#1:224,6\n160#1:231,6\n165#1:239,6\n208#1:246,6\n161#1:237\n*E\n"})
public final class AndroidMenu_androidKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x0156  */
    /* JADX WARN: Code duplicated, block: B:107:0x0164  */
    /* JADX WARN: Code duplicated, block: B:110:0x017f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:126:0x0242  */
    /* JADX WARN: Code duplicated, block: B:131:0x0251  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final void m964DropdownMenu4kj_NE(final boolean z, @NotNull final Function0<Unit> onDismissRequest, @Nullable Modifier modifier, long j, @Nullable ScrollState scrollState, @Nullable PopupProperties popupProperties, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long jM3796DpOffsetYgX7TsA;
        int i5;
        final ScrollState scrollStateRememberScrollState;
        int i6;
        PopupProperties popupProperties2;
        int i7;
        int i8;
        Modifier modifier3;
        long j2;
        Modifier modifier4;
        ScrollState scrollState2;
        final int i9;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier5;
        final long j3;
        final PopupProperties popupProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2135362555);
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
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
                jM3796DpOffsetYgX7TsA = j;
            } else {
                jM3796DpOffsetYgX7TsA = j;
                if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changed(jM3796DpOffsetYgX7TsA)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    scrollStateRememberScrollState = scrollState;
                    int i11 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                i3 |= i11;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i8 = 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                float f = 0;
                                jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f));
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            }
                            if (i6 != 0) {
                                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                                scrollState2 = scrollStateRememberScrollState;
                                j2 = jM3796DpOffsetYgX7TsA;
                                modifier4 = modifier3;
                            } else {
                                j2 = jM3796DpOffsetYgX7TsA;
                                modifier4 = modifier3;
                            }
                            i9 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableTransitionState = (MutableTransitionState) objRememberedValue;
                            mutableTransitionState.setTargetState(Boolean.valueOf(z));
                            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) objRememberedValue2;
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(mutableState);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                            invoke2(intRect, intRect2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                final ScrollState scrollState3 = scrollState2;
                                final Modifier modifier6 = modifier4;
                                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                        }
                                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                        MutableState<TransformOrigin> mutableState2 = mutableState;
                                        ScrollState scrollState4 = scrollState3;
                                        Modifier modifier7 = modifier6;
                                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                        int i13 = MutableTransitionState.$stable | 48;
                                        int i14 = i9;
                                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState4, modifier7, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier4;
                            j3 = j2;
                            scrollStateRememberScrollState = scrollState2;
                            popupProperties3 = popupProperties2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier2;
                        }
                        scrollState2 = scrollStateRememberScrollState;
                        i9 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableTransitionState = (MutableTransitionState) objRememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z));
                        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                        mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                        mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final ScrollState scrollState4 = scrollState2;
                            final Modifier modifier7 = modifier4;
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density2, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                    }
                                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                    MutableState<TransformOrigin> mutableState2 = mutableState;
                                    ScrollState scrollState5 = scrollState4;
                                    Modifier modifier8 = modifier7;
                                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    int i13 = MutableTransitionState.$stable | 48;
                                    int i14 = i9;
                                    MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState5, modifier8, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                        mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                        mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final ScrollState scrollState5 = scrollState2;
                            final Modifier modifier8 = modifier4;
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density3, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                    }
                                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                    MutableState<TransformOrigin> mutableState2 = mutableState;
                                    ScrollState scrollState6 = scrollState5;
                                    Modifier modifier9 = modifier8;
                                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    int i13 = MutableTransitionState.$stable | 48;
                                    int i14 = i9;
                                    MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState6, modifier9, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j3 = j2;
                        scrollStateRememberScrollState = scrollState2;
                        popupProperties3 = popupProperties2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 1572864;
                i3 |= i8;
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f2 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f3 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState6 = scrollState2;
                        final Modifier modifier9 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density4, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState7 = scrollState6;
                                Modifier modifier10 = modifier9;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState7, modifier10, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState7 = scrollState2;
                        final Modifier modifier10 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density5, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState8 = scrollState7;
                                Modifier modifier11 = modifier10;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState8, modifier11, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f4 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f4), Dp.m3775constructorimpl(f4));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f5 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f5), Dp.m3775constructorimpl(f5));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState8 = scrollState2;
                        final Modifier modifier11 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density6, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState9 = scrollState8;
                                Modifier modifier12 = modifier11;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState9, modifier12, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState9 = scrollState2;
                        final Modifier modifier12 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density7, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState10 = scrollState9;
                                Modifier modifier13 = modifier12;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState10, modifier13, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 196608;
            popupProperties2 = popupProperties;
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f6 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f6), Dp.m3775constructorimpl(f6));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f7 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f7), Dp.m3775constructorimpl(f7));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState10 = scrollState2;
                        final Modifier modifier13 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density8, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState11 = scrollState10;
                                Modifier modifier14 = modifier13;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState11, modifier14, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState11 = scrollState2;
                        final Modifier modifier14 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density9, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState12 = scrollState11;
                                Modifier modifier15 = modifier14;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState12, modifier15, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f8 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f8), Dp.m3775constructorimpl(f8));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f9 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f9), Dp.m3775constructorimpl(f9));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState12 = scrollState2;
                        final Modifier modifier15 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density10, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState13 = scrollState12;
                                Modifier modifier16 = modifier15;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState13, modifier16, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState13 = scrollState2;
                        final Modifier modifier16 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density11, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState14 = scrollState13;
                                Modifier modifier17 = modifier16;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState14, modifier17, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 1572864;
            i3 |= i8;
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f10 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f10), Dp.m3775constructorimpl(f10));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f11 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f11), Dp.m3775constructorimpl(f11));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState14 = scrollState2;
                    final Modifier modifier17 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density12, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState15 = scrollState14;
                            Modifier modifier18 = modifier17;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState15, modifier18, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState15 = scrollState2;
                    final Modifier modifier18 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density13, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState16 = scrollState15;
                            Modifier modifier19 = modifier18;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState16, modifier19, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j3 = j2;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f12 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f12), Dp.m3775constructorimpl(f12));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f13 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f13), Dp.m3775constructorimpl(f13));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState16 = scrollState2;
                    final Modifier modifier19 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density14, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState17 = scrollState16;
                            Modifier modifier110 = modifier19;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState17, modifier110, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState17 = scrollState2;
                    final Modifier modifier110 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density15, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState18 = scrollState17;
                            Modifier modifier111 = modifier110;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState18, modifier111, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j3 = j2;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
            jM3796DpOffsetYgX7TsA = j;
        } else {
            jM3796DpOffsetYgX7TsA = j;
            if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(jM3796DpOffsetYgX7TsA)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                scrollStateRememberScrollState = scrollState;
                if (composerStartRestartGroup.changed(scrollStateRememberScrollState)) {
                }
                i3 |= i11;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            i3 |= i11;
        } else {
            scrollStateRememberScrollState = scrollState;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((458752 & i) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i2 & 64) != 0) {
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f14 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f14), Dp.m3775constructorimpl(f14));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f15 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f15), Dp.m3775constructorimpl(f15));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState18 = scrollState2;
                        final Modifier modifier111 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density16, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState19 = scrollState18;
                                Modifier modifier112 = modifier111;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState19, modifier112, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState19 = scrollState2;
                        final Modifier modifier112 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density17, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState110 = scrollState19;
                                Modifier modifier113 = modifier112;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState110, modifier113, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f16 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f16), Dp.m3775constructorimpl(f16));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f17 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f17), Dp.m3775constructorimpl(f17));
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i6 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j2 = jM3796DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i9 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState110 = scrollState2;
                        final Modifier modifier113 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density18, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState111 = scrollState110;
                                Modifier modifier114 = modifier113;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState111, modifier114, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final ScrollState scrollState111 = scrollState2;
                        final Modifier modifier114 = modifier4;
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density19, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                                }
                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                ScrollState scrollState112 = scrollState111;
                                Modifier modifier115 = modifier114;
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i13 = MutableTransitionState.$stable | 48;
                                int i14 = i9;
                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState112, modifier115, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j3 = j2;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 1572864;
            i3 |= i8;
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f18 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f18), Dp.m3775constructorimpl(f18));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f19 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f19), Dp.m3775constructorimpl(f19));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState112 = scrollState2;
                    final Modifier modifier115 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density110, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState113 = scrollState112;
                            Modifier modifier116 = modifier115;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState113, modifier116, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState113 = scrollState2;
                    final Modifier modifier116 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density111, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState114 = scrollState113;
                            Modifier modifier117 = modifier116;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState114, modifier117, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j3 = j2;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f110 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f110), Dp.m3775constructorimpl(f110));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f111 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f111), Dp.m3775constructorimpl(f111));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState114 = scrollState2;
                    final Modifier modifier117 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density112, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState115 = scrollState114;
                            Modifier modifier118 = modifier117;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState115, modifier118, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState115 = scrollState2;
                    final Modifier modifier118 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density113, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState116 = scrollState115;
                            Modifier modifier119 = modifier118;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState116, modifier119, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j3 = j2;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 196608;
        popupProperties2 = popupProperties;
        if ((i2 & 64) != 0) {
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i8 = 524288;
                }
            }
            if ((i3 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f112 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f112), Dp.m3775constructorimpl(f112));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f113 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f113), Dp.m3775constructorimpl(f113));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState116 = scrollState2;
                    final Modifier modifier119 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density114, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState117 = scrollState116;
                            Modifier modifier1110 = modifier119;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState117, modifier1110, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState117 = scrollState2;
                    final Modifier modifier1110 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density115, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState118 = scrollState117;
                            Modifier modifier1111 = modifier1110;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState118, modifier1111, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j3 = j2;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f114 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f114), Dp.m3775constructorimpl(f114));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f115 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f115), Dp.m3775constructorimpl(f115));
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i6 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j2 = jM3796DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i9 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState118 = scrollState2;
                    final Modifier modifier1111 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density116, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState119 = scrollState118;
                            Modifier modifier1112 = modifier1111;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState119, modifier1112, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                invoke2(intRect, intRect2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                                Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    final ScrollState scrollState119 = scrollState2;
                    final Modifier modifier1112 = modifier4;
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density117, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                            }
                            MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                            MutableState<TransformOrigin> mutableState2 = mutableState;
                            ScrollState scrollState1110 = scrollState119;
                            Modifier modifier1113 = modifier1112;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i13 = MutableTransitionState.$stable | 48;
                            int i14 = i9;
                            MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState1110, modifier1113, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j3 = j2;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i8 = 1572864;
        i3 |= i8;
        if ((i3 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f116 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f116), Dp.m3775constructorimpl(f116));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i6 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f117 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f117), Dp.m3775constructorimpl(f117));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i6 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            }
            i9 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState1110 = scrollState2;
                final Modifier modifier1113 = modifier4;
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density118, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        if ((i12 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        ScrollState scrollState1111 = scrollState1110;
                        Modifier modifier1114 = modifier1113;
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i13 = MutableTransitionState.$stable | 48;
                        int i14 = i9;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState1111, modifier1114, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState1111 = scrollState2;
                final Modifier modifier1114 = modifier4;
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density119, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        if ((i12 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        ScrollState scrollState1112 = scrollState1111;
                        Modifier modifier1115 = modifier1114;
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i13 = MutableTransitionState.$stable | 48;
                        int i14 = i9;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState1112, modifier1115, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j3 = j2;
            scrollStateRememberScrollState = scrollState2;
            popupProperties3 = popupProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f118 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f118), Dp.m3775constructorimpl(f118));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i6 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f119 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f119), Dp.m3775constructorimpl(f119));
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i6 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j2 = jM3796DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            }
            i9 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135362555, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState1112 = scrollState2;
                final Modifier modifier1115 = modifier4;
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density1110, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        if ((i12 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        ScrollState scrollState1113 = scrollState1112;
                        Modifier modifier1116 = modifier1115;
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i13 = MutableTransitionState.$stable | 48;
                        int i14 = i9;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState1113, modifier1116, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2030boximpl(TransformOrigin.INSTANCE.m2043getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                            invoke2(intRect, intRect2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IntRect parentBounds, @NotNull IntRect menuBounds) {
                            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                            mutableState.setValue(TransformOrigin.m2030boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ScrollState scrollState1113 = scrollState2;
                final Modifier modifier1116 = modifier4;
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density1111, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        if ((i12 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-47803778, i12, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                        }
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        MutableState<TransformOrigin> mutableState2 = mutableState;
                        ScrollState scrollState1114 = scrollState1113;
                        Modifier modifier1117 = modifier1116;
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i13 = MutableTransitionState.$stable | 48;
                        int i14 = i9;
                        MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, scrollState1114, modifier1117, function3, composer2, i13 | ((i14 >> 6) & 896) | ((i14 << 3) & 7168) | ((i14 >> 6) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j3 = j2;
            scrollStateRememberScrollState = scrollState2;
            popupProperties3 = popupProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidMenu_androidKt.m964DropdownMenu4kj_NE(z, onDismissRequest, modifier5, j3, scrollStateRememberScrollState, popupProperties3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0112  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final /* synthetic */ void m965DropdownMenuILWXrKs(final boolean z, final Function0 onDismissRequest, Modifier modifier, long j, PopupProperties popupProperties, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        long j2;
        int i5;
        int i6;
        PopupProperties popupProperties2;
        int i7;
        int i8;
        Modifier modifier3;
        long jM3796DpOffsetYgX7TsA;
        PopupProperties popupProperties3;
        final long j3;
        final PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-840283139);
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
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
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
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        popupProperties2 = popupProperties;
                        if (composerStartRestartGroup.changed(popupProperties2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i9 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                float f = 0;
                                jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f));
                            } else {
                                jM3796DpOffsetYgX7TsA = j2;
                            }
                            if (i6 != 0) {
                                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            } else {
                                popupProperties3 = popupProperties2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                            }
                            int i10 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i11 = i3 << 3;
                            m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i10 | (458752 & i11) | (i11 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            j3 = jM3796DpOffsetYgX7TsA;
                            popupProperties4 = popupProperties3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            j3 = j2;
                            popupProperties4 = popupProperties2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i8 = 196608;
                    i3 |= i8;
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f2 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i12 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i13 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i12 | (458752 & i13) | (i13 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f3 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i14 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i15 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i14 | (458752 & i15) | (i15 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                        public final void invoke(@Nullable Composer composer2, int i16) {
                            AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                popupProperties2 = popupProperties;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f4 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f4), Dp.m3775constructorimpl(f4));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i16 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i17 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i16 | (458752 & i17) | (i17 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f5 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f5), Dp.m3775constructorimpl(f5));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i18 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i19 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i18 | (458752 & i19) | (i19 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                        public final void invoke(@Nullable Composer composer2, int i110) {
                            AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f6 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f6), Dp.m3775constructorimpl(f6));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i110 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i111 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i110 | (458752 & i111) | (i111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f7 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f7), Dp.m3775constructorimpl(f7));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i112 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i113 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i112 | (458752 & i113) | (i113 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(@Nullable Composer composer2, int i114) {
                        AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            j2 = j;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f8 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f8), Dp.m3775constructorimpl(f8));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i114 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i115 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i114 | (458752 & i115) | (i115 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f9 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f9), Dp.m3775constructorimpl(f9));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i116 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i117 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i116 | (458752 & i117) | (i117 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                        public final void invoke(@Nullable Composer composer2, int i118) {
                            AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f10 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f10), Dp.m3775constructorimpl(f10));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i118 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i119 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i118 | (458752 & i119) | (i119 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f11 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f11), Dp.m3775constructorimpl(f11));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1110 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i1111 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1110 | (458752 & i1111) | (i1111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(@Nullable Composer composer2, int i1112) {
                        AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            popupProperties2 = popupProperties;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f12 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f12), Dp.m3775constructorimpl(f12));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1112 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i1113 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1112 | (458752 & i1113) | (i1113 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f13 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f13), Dp.m3775constructorimpl(f13));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1114 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i1115 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1114 | (458752 & i1115) | (i1115 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(@Nullable Composer composer2, int i1116) {
                        AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f14 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f14), Dp.m3775constructorimpl(f14));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1116 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1117 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1116 | (458752 & i1117) | (i1117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f15 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f15), Dp.m3775constructorimpl(f15));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1118 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1119 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1118 | (458752 & i1119) | (i1119 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                public final void invoke(@Nullable Composer composer2, int i11110) {
                    AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f16 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f16), Dp.m3775constructorimpl(f16));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i11110 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i11111 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11110 | (458752 & i11111) | (i11111 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i9 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            float f17 = 0;
                            jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f17), Dp.m3775constructorimpl(f17));
                        } else {
                            jM3796DpOffsetYgX7TsA = j2;
                        }
                        if (i6 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i11112 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i11113 = i3 << 3;
                        m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11112 | (458752 & i11113) | (i11113 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j3 = jM3796DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                        public final void invoke(@Nullable Composer composer2, int i11114) {
                            AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 196608;
                i3 |= i8;
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f18 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f18), Dp.m3775constructorimpl(f18));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i11114 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i11115 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11114 | (458752 & i11115) | (i11115 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f19 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f19), Dp.m3775constructorimpl(f19));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i11116 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i11117 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11116 | (458752 & i11117) | (i11117 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(@Nullable Composer composer2, int i11118) {
                        AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            popupProperties2 = popupProperties;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f110 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f110), Dp.m3775constructorimpl(f110));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i11118 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i11119 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11118 | (458752 & i11119) | (i11119 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f111 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f111), Dp.m3775constructorimpl(f111));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i111110 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i111111 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i111110 | (458752 & i111111) | (i111111 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(@Nullable Composer composer2, int i111112) {
                        AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f112 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f112), Dp.m3775constructorimpl(f112));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i111112 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i111113 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i111112 | (458752 & i111113) | (i111113 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f113 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f113), Dp.m3775constructorimpl(f113));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i111114 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i111115 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i111114 | (458752 & i111115) | (i111115 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                public final void invoke(@Nullable Composer composer2, int i111116) {
                    AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        j2 = j;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f114 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f114), Dp.m3775constructorimpl(f114));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i111116 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i111117 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i111116 | (458752 & i111117) | (i111117 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i9 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        float f115 = 0;
                        jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f115), Dp.m3775constructorimpl(f115));
                    } else {
                        jM3796DpOffsetYgX7TsA = j2;
                    }
                    if (i6 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i111118 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i111119 = i3 << 3;
                    m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i111118 | (458752 & i111119) | (i111119 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = jM3796DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(@Nullable Composer composer2, int i1111110) {
                        AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 196608;
            i3 |= i8;
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f116 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f116), Dp.m3775constructorimpl(f116));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1111110 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1111111 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1111110 | (458752 & i1111111) | (i1111111 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f117 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f117), Dp.m3775constructorimpl(f117));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1111112 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1111113 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1111112 | (458752 & i1111113) | (i1111113 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                public final void invoke(@Nullable Composer composer2, int i1111114) {
                    AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        popupProperties2 = popupProperties;
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f118 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f118), Dp.m3775constructorimpl(f118));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1111114 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1111115 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1111114 | (458752 & i1111115) | (i1111115 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    float f119 = 0;
                    jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f119), Dp.m3775constructorimpl(f119));
                } else {
                    jM3796DpOffsetYgX7TsA = j2;
                }
                if (i6 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1111116 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1111117 = i3 << 3;
                m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1111116 | (458752 & i1111117) | (i1111117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = jM3796DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                public final void invoke(@Nullable Composer composer2, int i1111118) {
                    AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i8 = 196608;
        i3 |= i8;
        if ((374491 & i3) == 74898) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                float f1110 = 0;
                jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f1110), Dp.m3775constructorimpl(f1110));
            } else {
                jM3796DpOffsetYgX7TsA = j2;
            }
            if (i6 != 0) {
                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
            }
            int i1111118 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i1111119 = i3 << 3;
            m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1111118 | (458752 & i1111119) | (i1111119 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            j3 = jM3796DpOffsetYgX7TsA;
            popupProperties4 = popupProperties3;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                float f1111 = 0;
                jM3796DpOffsetYgX7TsA = DpKt.m3796DpOffsetYgX7TsA(Dp.m3775constructorimpl(f1111), Dp.m3775constructorimpl(f1111));
            } else {
                jM3796DpOffsetYgX7TsA = j2;
            }
            if (i6 != 0) {
                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840283139, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
            }
            int i11111110 = (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i11111111 = i3 << 3;
            m964DropdownMenu4kj_NE(z, onDismissRequest, modifier3, jM3796DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11111110 | (458752 & i11111111) | (i11111111 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            j3 = jM3796DpOffsetYgX7TsA;
            popupProperties4 = popupProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

            public final void invoke(@Nullable Composer composer2, int i11111112) {
                AndroidMenu_androidKt.m965DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j3, popupProperties4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItem(@NotNull final Function0<Unit> onClick, @Nullable Modifier modifier, boolean z, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        int i9;
        int i10;
        Modifier modifier3;
        boolean z3;
        PaddingValues dropdownMenuItemContentPadding;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z4;
        final PaddingValues paddingValues3;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1988562892);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 57344) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 32) != 0) {
                            if ((i & 458752) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                            }
                            if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                if (i11 != 0) {
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
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues2;
                                }
                                if (i8 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                                }
                                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z4 = z3;
                                paddingValues3 = dropdownMenuItemContentPadding;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                z4 = z2;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                        i10 = 196608;
                        i3 |= i10;
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                paddingValues2 = paddingValues;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            z2 = z;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                        }
                        if ((374491 & i3) == 74898) {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i11 != 0) {
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
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i8 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i10 = 196608;
                    i3 |= i10;
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        z2 = z;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898) {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i11 != 0) {
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
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 196608;
                i3 |= i10;
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        paddingValues2 = paddingValues;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 57344) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i2 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i11 != 0) {
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
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i8 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                    public final void invoke(@Nullable Composer composer2, int i12) {
                        AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 196608;
            i3 |= i10;
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i11 != 0) {
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
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i8 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i10 = 196608;
        i3 |= i10;
        if ((374491 & i3) == 74898) {
            if (i11 != 0) {
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
                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            } else {
                dropdownMenuItemContentPadding = paddingValues2;
            }
            if (i8 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
            }
            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            paddingValues3 = dropdownMenuItemContentPadding;
        } else {
            if (i11 != 0) {
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
                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            } else {
                dropdownMenuItemContentPadding = paddingValues2;
            }
            if (i8 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988562892, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
            }
            MenuKt.DropdownMenuItemContent(onClick, modifier3, z3, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            paddingValues3 = dropdownMenuItemContentPadding;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem.2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier4, z4, paddingValues3, mutableInteractionSource3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
