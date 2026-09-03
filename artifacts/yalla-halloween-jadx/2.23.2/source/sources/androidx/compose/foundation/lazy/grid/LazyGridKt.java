package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a#\u0010\u001c\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010 \u001a\u008c\u0001\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\u0007¢\u0006\u0002\b\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003ø\u0001\u0000¢\u0006\u0002\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Lkotlin/ExtensionFunctionType;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "rememberLazyGridMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,375:1\n154#2:376\n76#3:377\n83#4,3:378\n1097#5,6:381\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n61#1:376\n120#1:377\n174#1:378,3\n174#1:381,6\n*E\n"})
public final class LazyGridKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:153:0x025d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0260  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyGrid(@Nullable Modifier modifier, @NotNull final LazyGridState state, @NotNull final Function2<? super Density, ? super Constraints, LazyGridSlots> slots, @Nullable PaddingValues paddingValues, boolean z, final boolean z2, @Nullable FlingBehavior flingBehavior, final boolean z3, @NotNull final Arrangement.Vertical verticalArrangement, @NotNull final Arrangement.Horizontal horizontalArrangement, @NotNull final Function1<? super LazyGridScope, Unit> content, @Nullable Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        PaddingValues paddingValuesM471PaddingValues0680j_4;
        FlingBehavior flingBehavior2;
        int i13;
        boolean z4;
        Composer composer2;
        Orientation orientation;
        final boolean z5;
        final PaddingValues paddingValues2;
        final Modifier modifier4;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(152645664);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(slots) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i16 = i3 & 8;
        if (i16 == 0) {
            if ((i & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i3 & 32) != 0) {
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i3 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i14 = 524288;
                    } else {
                        i14 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i4 |= i14;
                }
                if ((i3 & 128) != 0) {
                    if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i8 = 8388608;
                        } else {
                            i8 = Configuration.BLOCK_SIZE;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i) == 0) {
                            if (composerStartRestartGroup.changed(verticalArrangement)) {
                                i9 = 67108864;
                            } else {
                                i9 = 33554432;
                            }
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            if ((1879048192 & i) == 0) {
                                if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                    i10 = 536870912;
                                } else {
                                    i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                                }
                            }
                            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                i11 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i12 = 4;
                                } else {
                                    i12 = 2;
                                }
                                i11 = i2 | i12;
                            } else {
                                i11 = i2;
                            }
                            if ((i4 & 1533916891) != 306783378 && (i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                z5 = z;
                                modifier4 = modifier2;
                                composer2 = composerStartRestartGroup;
                                paddingValues2 = paddingValues;
                                flingBehavior3 = flingBehavior;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i15 != 0) {
                                        modifier3 = Modifier.INSTANCE;
                                    } else {
                                        modifier3 = modifier2;
                                    }
                                    if (i16 != 0) {
                                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                    } else {
                                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                    }
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) != 0) {
                                        i13 = i4 & (-3670017);
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        i13 = i4;
                                    }
                                    z4 = z6;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    i13 = i4;
                                    z4 = z;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                                }
                                ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                                OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composerStartRestartGroup, 6);
                                int i17 = i13 >> 3;
                                int i18 = i17 & 14;
                                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i18 | ((i11 << 3) & 112));
                                int i19 = i13 >> 9;
                                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i18 | (i19 & 112));
                                int i20 = i13 & 112;
                                int i21 = i13;
                                boolean z7 = z4;
                                Modifier modifier5 = modifier3;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i20 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i19 & 3670016) | (i17 & 29360128), 0);
                                state.setVertical$foundation_release(z2);
                                composer2 = composerStartRestartGroup;
                                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda, state, composer2, i20);
                                if (z2) {
                                    orientation = Orientation.Vertical;
                                } else {
                                    orientation = Orientation.Horizontal;
                                }
                                Orientation orientation2 = orientation;
                                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState, orientation2, z3, z7, composer2, (i19 & 57344) | ((i21 << 3) & 458752)), orientation2), state, z7, orientation2, composer2, i20 | ((i21 >> 6) & 896)), overscrollEffect), state, orientation2, overscrollEffect, z3, scrollableDefaults.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z7), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z7;
                                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                                modifier4 = modifier5;
                                flingBehavior3 = flingBehavior2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                                public final void invoke(@Nullable Composer composer3, int i22) {
                                    LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                        i10 = 805306368;
                        i4 |= i10;
                        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect2 = scrollableDefaults2.overscrollEffect(composerStartRestartGroup, 6);
                            int i110 = i13 >> 3;
                            int i111 = i110 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda2 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111 | ((i11 << 3) & 112));
                            int i112 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState2 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111 | (i112 & 112));
                            int i22 = i13 & 112;
                            int i23 = i13;
                            boolean z8 = z4;
                            Modifier modifier6 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda2, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i22 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i112 & 3670016) | (i110 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda2, state, composer2, i22);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation3 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda2, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier6.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda2, lazyLayoutSemanticStateRememberLazyGridSemanticState2, orientation3, z3, z8, composer2, (i112 & 57344) | ((i23 << 3) & 458752)), orientation3), state, z8, orientation3, composer2, i22 | ((i23 >> 6) & 896)), overscrollEffect2), state, orientation3, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation3, z8), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy2, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z8;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier6;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults3 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect3 = scrollableDefaults3.overscrollEffect(composerStartRestartGroup, 6);
                            int i113 = i13 >> 3;
                            int i114 = i113 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda3 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i114 | ((i11 << 3) & 112));
                            int i115 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState3 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i114 | (i115 & 112));
                            int i24 = i13 & 112;
                            int i25 = i13;
                            boolean z9 = z4;
                            Modifier modifier7 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy3 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda3, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i24 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i115 & 3670016) | (i113 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda3, state, composer2, i24);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation4 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda3, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier7.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda3, lazyLayoutSemanticStateRememberLazyGridSemanticState3, orientation4, z3, z9, composer2, (i115 & 57344) | ((i25 << 3) & 458752)), orientation4), state, z9, orientation4, composer2, i24 | ((i25 >> 6) & 896)), overscrollEffect3), state, orientation4, overscrollEffect3, z3, scrollableDefaults3.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation4, z9), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy3, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z9;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier7;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                            public final void invoke(@Nullable Composer composer3, int i26) {
                                LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                    i9 = 100663296;
                    i4 |= i9;
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i10 = 536870912;
                            } else {
                                i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults4 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect4 = scrollableDefaults4.overscrollEffect(composerStartRestartGroup, 6);
                            int i116 = i13 >> 3;
                            int i117 = i116 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda4 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i117 | ((i11 << 3) & 112));
                            int i118 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState4 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i117 | (i118 & 112));
                            int i26 = i13 & 112;
                            int i27 = i13;
                            boolean z10 = z4;
                            Modifier modifier8 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy4 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda4, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i26 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i118 & 3670016) | (i116 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda4, state, composer2, i26);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation5 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda4, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier8.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda4, lazyLayoutSemanticStateRememberLazyGridSemanticState4, orientation5, z3, z10, composer2, (i118 & 57344) | ((i27 << 3) & 458752)), orientation5), state, z10, orientation5, composer2, i26 | ((i27 >> 6) & 896)), overscrollEffect4), state, orientation5, overscrollEffect4, z3, scrollableDefaults4.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation5, z10), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy4, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z10;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier8;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults5 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect5 = scrollableDefaults5.overscrollEffect(composerStartRestartGroup, 6);
                            int i119 = i13 >> 3;
                            int i1110 = i119 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda5 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1110 | ((i11 << 3) & 112));
                            int i1111 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState5 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1110 | (i1111 & 112));
                            int i28 = i13 & 112;
                            int i29 = i13;
                            boolean z11 = z4;
                            Modifier modifier9 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy5 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda5, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i28 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111 & 3670016) | (i119 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda5, state, composer2, i28);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation6 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda5, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier9.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda5, lazyLayoutSemanticStateRememberLazyGridSemanticState5, orientation6, z3, z11, composer2, (i1111 & 57344) | ((i29 << 3) & 458752)), orientation6), state, z11, orientation6, composer2, i28 | ((i29 >> 6) & 896)), overscrollEffect5), state, orientation6, overscrollEffect5, z3, scrollableDefaults5.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation6, z11), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy5, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z11;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier9;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                            public final void invoke(@Nullable Composer composer3, int i210) {
                                LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                    i10 = 805306368;
                    i4 |= i10;
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults6 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect6 = scrollableDefaults6.overscrollEffect(composerStartRestartGroup, 6);
                        int i1112 = i13 >> 3;
                        int i1113 = i1112 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda6 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1113 | ((i11 << 3) & 112));
                        int i1114 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState6 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1113 | (i1114 & 112));
                        int i210 = i13 & 112;
                        int i211 = i13;
                        boolean z12 = z4;
                        Modifier modifier10 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy6 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda6, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i210 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1114 & 3670016) | (i1112 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda6, state, composer2, i210);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation7 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda6, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier10.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda6, lazyLayoutSemanticStateRememberLazyGridSemanticState6, orientation7, z3, z12, composer2, (i1114 & 57344) | ((i211 << 3) & 458752)), orientation7), state, z12, orientation7, composer2, i210 | ((i211 >> 6) & 896)), overscrollEffect6), state, orientation7, overscrollEffect6, z3, scrollableDefaults6.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation7, z12), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy6, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z12;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier10;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults7 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect7 = scrollableDefaults7.overscrollEffect(composerStartRestartGroup, 6);
                        int i1115 = i13 >> 3;
                        int i1116 = i1115 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda7 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1116 | ((i11 << 3) & 112));
                        int i1117 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState7 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1116 | (i1117 & 112));
                        int i212 = i13 & 112;
                        int i213 = i13;
                        boolean z13 = z4;
                        Modifier modifier11 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy7 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda7, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i212 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1117 & 3670016) | (i1115 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda7, state, composer2, i212);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation8 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda7, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda7, lazyLayoutSemanticStateRememberLazyGridSemanticState7, orientation8, z3, z13, composer2, (i1117 & 57344) | ((i213 << 3) & 458752)), orientation8), state, z13, orientation8, composer2, i212 | ((i213 >> 6) & 896)), overscrollEffect7), state, orientation8, overscrollEffect7, z3, scrollableDefaults7.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation8, z13), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy7, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z13;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier11;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i214) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i4 |= 12582912;
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changed(verticalArrangement)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i10 = 536870912;
                            } else {
                                i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults8 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect8 = scrollableDefaults8.overscrollEffect(composerStartRestartGroup, 6);
                            int i1118 = i13 >> 3;
                            int i1119 = i1118 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda8 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1119 | ((i11 << 3) & 112));
                            int i11110 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState8 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1119 | (i11110 & 112));
                            int i214 = i13 & 112;
                            int i215 = i13;
                            boolean z14 = z4;
                            Modifier modifier12 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy8 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda8, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i214 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11110 & 3670016) | (i1118 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda8, state, composer2, i214);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation9 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda8, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier12.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda8, lazyLayoutSemanticStateRememberLazyGridSemanticState8, orientation9, z3, z14, composer2, (i11110 & 57344) | ((i215 << 3) & 458752)), orientation9), state, z14, orientation9, composer2, i214 | ((i215 >> 6) & 896)), overscrollEffect8), state, orientation9, overscrollEffect8, z3, scrollableDefaults8.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation9, z14), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy8, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z14;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier12;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults9 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect9 = scrollableDefaults9.overscrollEffect(composerStartRestartGroup, 6);
                            int i11111 = i13 >> 3;
                            int i11112 = i11111 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda9 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11112 | ((i11 << 3) & 112));
                            int i11113 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState9 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11112 | (i11113 & 112));
                            int i216 = i13 & 112;
                            int i217 = i13;
                            boolean z15 = z4;
                            Modifier modifier13 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy9 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda9, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i216 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11113 & 3670016) | (i11111 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda9, state, composer2, i216);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation10 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda9, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier13.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda9, lazyLayoutSemanticStateRememberLazyGridSemanticState9, orientation10, z3, z15, composer2, (i11113 & 57344) | ((i217 << 3) & 458752)), orientation10), state, z15, orientation10, composer2, i216 | ((i217 >> 6) & 896)), overscrollEffect9), state, orientation10, overscrollEffect9, z3, scrollableDefaults9.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation10, z15), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy9, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z15;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier13;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                            public final void invoke(@Nullable Composer composer3, int i218) {
                                LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                    i10 = 805306368;
                    i4 |= i10;
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults10 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect10 = scrollableDefaults10.overscrollEffect(composerStartRestartGroup, 6);
                        int i11114 = i13 >> 3;
                        int i11115 = i11114 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda10 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11115 | ((i11 << 3) & 112));
                        int i11116 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState10 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11115 | (i11116 & 112));
                        int i218 = i13 & 112;
                        int i219 = i13;
                        boolean z16 = z4;
                        Modifier modifier14 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy10 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda10, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i218 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11116 & 3670016) | (i11114 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda10, state, composer2, i218);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda10, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier14.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda10, lazyLayoutSemanticStateRememberLazyGridSemanticState10, orientation11, z3, z16, composer2, (i11116 & 57344) | ((i219 << 3) & 458752)), orientation11), state, z16, orientation11, composer2, i218 | ((i219 >> 6) & 896)), overscrollEffect10), state, orientation11, overscrollEffect10, z3, scrollableDefaults10.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11, z16), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy10, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z16;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier14;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults11 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect11 = scrollableDefaults11.overscrollEffect(composerStartRestartGroup, 6);
                        int i11117 = i13 >> 3;
                        int i11118 = i11117 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11118 | ((i11 << 3) & 112));
                        int i11119 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11118 | (i11119 & 112));
                        int i2110 = i13 & 112;
                        int i2111 = i13;
                        boolean z17 = z4;
                        Modifier modifier15 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11119 & 3670016) | (i11117 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11, state, composer2, i2110);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation12 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier15.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11, lazyLayoutSemanticStateRememberLazyGridSemanticState11, orientation12, z3, z17, composer2, (i11119 & 57344) | ((i2111 << 3) & 458752)), orientation12), state, z17, orientation12, composer2, i2110 | ((i2111 >> 6) & 896)), overscrollEffect11), state, orientation12, overscrollEffect11, z3, scrollableDefaults11.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation12, z17), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z17;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier15;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i2112) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i9 = 100663296;
                i4 |= i9;
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i10 = 536870912;
                        } else {
                            i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults12 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect12 = scrollableDefaults12.overscrollEffect(composerStartRestartGroup, 6);
                        int i111110 = i13 >> 3;
                        int i111111 = i111110 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda12 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111 | ((i11 << 3) & 112));
                        int i111112 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState12 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111 | (i111112 & 112));
                        int i2112 = i13 & 112;
                        int i2113 = i13;
                        boolean z18 = z4;
                        Modifier modifier16 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy12 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda12, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111112 & 3670016) | (i111110 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda12, state, composer2, i2112);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation13 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda12, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier16.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda12, lazyLayoutSemanticStateRememberLazyGridSemanticState12, orientation13, z3, z18, composer2, (i111112 & 57344) | ((i2113 << 3) & 458752)), orientation13), state, z18, orientation13, composer2, i2112 | ((i2113 >> 6) & 896)), overscrollEffect12), state, orientation13, overscrollEffect12, z3, scrollableDefaults12.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation13, z18), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy12, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z18;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier16;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults13 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect13 = scrollableDefaults13.overscrollEffect(composerStartRestartGroup, 6);
                        int i111113 = i13 >> 3;
                        int i111114 = i111113 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda13 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111114 | ((i11 << 3) & 112));
                        int i111115 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState13 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111114 | (i111115 & 112));
                        int i2114 = i13 & 112;
                        int i2115 = i13;
                        boolean z19 = z4;
                        Modifier modifier17 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy13 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda13, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111115 & 3670016) | (i111113 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda13, state, composer2, i2114);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation14 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda13, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier17.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda13, lazyLayoutSemanticStateRememberLazyGridSemanticState13, orientation14, z3, z19, composer2, (i111115 & 57344) | ((i2115 << 3) & 458752)), orientation14), state, z19, orientation14, composer2, i2114 | ((i2115 >> 6) & 896)), overscrollEffect13), state, orientation14, overscrollEffect13, z3, scrollableDefaults13.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation14, z19), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy13, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z19;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier17;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i2116) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i10 = 805306368;
                i4 |= i10;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults14 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect14 = scrollableDefaults14.overscrollEffect(composerStartRestartGroup, 6);
                    int i111116 = i13 >> 3;
                    int i111117 = i111116 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda14 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111117 | ((i11 << 3) & 112));
                    int i111118 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState14 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111117 | (i111118 & 112));
                    int i2116 = i13 & 112;
                    int i2117 = i13;
                    boolean z110 = z4;
                    Modifier modifier18 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy14 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda14, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111118 & 3670016) | (i111116 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda14, state, composer2, i2116);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation15 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda14, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier18.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda14, lazyLayoutSemanticStateRememberLazyGridSemanticState14, orientation15, z3, z110, composer2, (i111118 & 57344) | ((i2117 << 3) & 458752)), orientation15), state, z110, orientation15, composer2, i2116 | ((i2117 >> 6) & 896)), overscrollEffect14), state, orientation15, overscrollEffect14, z3, scrollableDefaults14.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation15, z110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy14, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z110;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier18;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults15 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect15 = scrollableDefaults15.overscrollEffect(composerStartRestartGroup, 6);
                    int i111119 = i13 >> 3;
                    int i1111110 = i111119 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda15 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111110 | ((i11 << 3) & 112));
                    int i1111111 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState15 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111110 | (i1111111 & 112));
                    int i2118 = i13 & 112;
                    int i2119 = i13;
                    boolean z111 = z4;
                    Modifier modifier19 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy15 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda15, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111 & 3670016) | (i111119 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda15, state, composer2, i2118);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation16 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda15, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier19.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda15, lazyLayoutSemanticStateRememberLazyGridSemanticState15, orientation16, z3, z111, composer2, (i1111111 & 57344) | ((i2119 << 3) & 458752)), orientation16), state, z111, orientation16, composer2, i2118 | ((i2119 >> 6) & 896)), overscrollEffect15), state, orientation16, overscrollEffect15, z3, scrollableDefaults15.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation16, z111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy15, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier19;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i21110) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i7 = 196608;
            i4 |= i7;
            if ((i & 3670016) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i3 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i8;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changed(verticalArrangement)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i10 = 536870912;
                            } else {
                                i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults16 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect16 = scrollableDefaults16.overscrollEffect(composerStartRestartGroup, 6);
                            int i1111112 = i13 >> 3;
                            int i1111113 = i1111112 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda16 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111113 | ((i11 << 3) & 112));
                            int i1111114 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState16 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111113 | (i1111114 & 112));
                            int i21110 = i13 & 112;
                            int i21111 = i13;
                            boolean z112 = z4;
                            Modifier modifier110 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy16 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda16, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111114 & 3670016) | (i1111112 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda16, state, composer2, i21110);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation17 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda16, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier110.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda16, lazyLayoutSemanticStateRememberLazyGridSemanticState16, orientation17, z3, z112, composer2, (i1111114 & 57344) | ((i21111 << 3) & 458752)), orientation17), state, z112, orientation17, composer2, i21110 | ((i21111 >> 6) & 896)), overscrollEffect16), state, orientation17, overscrollEffect16, z3, scrollableDefaults16.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation17, z112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy16, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z112;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier110;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults17 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect17 = scrollableDefaults17.overscrollEffect(composerStartRestartGroup, 6);
                            int i1111115 = i13 >> 3;
                            int i1111116 = i1111115 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda17 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111116 | ((i11 << 3) & 112));
                            int i1111117 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState17 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111116 | (i1111117 & 112));
                            int i21112 = i13 & 112;
                            int i21113 = i13;
                            boolean z113 = z4;
                            Modifier modifier111 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy17 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda17, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111117 & 3670016) | (i1111115 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda17, state, composer2, i21112);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation18 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda17, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda17, lazyLayoutSemanticStateRememberLazyGridSemanticState17, orientation18, z3, z113, composer2, (i1111117 & 57344) | ((i21113 << 3) & 458752)), orientation18), state, z113, orientation18, composer2, i21112 | ((i21113 >> 6) & 896)), overscrollEffect17), state, orientation18, overscrollEffect17, z3, scrollableDefaults17.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation18, z113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy17, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z113;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier111;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                            public final void invoke(@Nullable Composer composer3, int i21114) {
                                LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                    i10 = 805306368;
                    i4 |= i10;
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults18 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect18 = scrollableDefaults18.overscrollEffect(composerStartRestartGroup, 6);
                        int i1111118 = i13 >> 3;
                        int i1111119 = i1111118 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda18 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111119 | ((i11 << 3) & 112));
                        int i11111110 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState18 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111119 | (i11111110 & 112));
                        int i21114 = i13 & 112;
                        int i21115 = i13;
                        boolean z114 = z4;
                        Modifier modifier112 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy18 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda18, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111110 & 3670016) | (i1111118 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda18, state, composer2, i21114);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation19 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda18, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier112.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda18, lazyLayoutSemanticStateRememberLazyGridSemanticState18, orientation19, z3, z114, composer2, (i11111110 & 57344) | ((i21115 << 3) & 458752)), orientation19), state, z114, orientation19, composer2, i21114 | ((i21115 >> 6) & 896)), overscrollEffect18), state, orientation19, overscrollEffect18, z3, scrollableDefaults18.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation19, z114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy18, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z114;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier112;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults19 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect19 = scrollableDefaults19.overscrollEffect(composerStartRestartGroup, 6);
                        int i11111111 = i13 >> 3;
                        int i11111112 = i11111111 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda19 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111112 | ((i11 << 3) & 112));
                        int i11111113 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState19 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111112 | (i11111113 & 112));
                        int i21116 = i13 & 112;
                        int i21117 = i13;
                        boolean z115 = z4;
                        Modifier modifier113 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy19 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda19, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111113 & 3670016) | (i11111111 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda19, state, composer2, i21116);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation110 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda19, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier113.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda19, lazyLayoutSemanticStateRememberLazyGridSemanticState19, orientation110, z3, z115, composer2, (i11111113 & 57344) | ((i21117 << 3) & 458752)), orientation110), state, z115, orientation110, composer2, i21116 | ((i21117 >> 6) & 896)), overscrollEffect19), state, orientation110, overscrollEffect19, z3, scrollableDefaults19.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation110, z115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy19, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z115;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier113;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i21118) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i9 = 100663296;
                i4 |= i9;
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i10 = 536870912;
                        } else {
                            i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults110 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect110 = scrollableDefaults110.overscrollEffect(composerStartRestartGroup, 6);
                        int i11111114 = i13 >> 3;
                        int i11111115 = i11111114 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111115 | ((i11 << 3) & 112));
                        int i11111116 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111115 | (i11111116 & 112));
                        int i21118 = i13 & 112;
                        int i21119 = i13;
                        boolean z116 = z4;
                        Modifier modifier114 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda110, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111116 & 3670016) | (i11111114 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda110, state, composer2, i21118);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda110, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier114.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda110, lazyLayoutSemanticStateRememberLazyGridSemanticState110, orientation111, z3, z116, composer2, (i11111116 & 57344) | ((i21119 << 3) & 458752)), orientation111), state, z116, orientation111, composer2, i21118 | ((i21119 >> 6) & 896)), overscrollEffect110), state, orientation111, overscrollEffect110, z3, scrollableDefaults110.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111, z116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy110, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z116;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier114;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults111 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect111 = scrollableDefaults111.overscrollEffect(composerStartRestartGroup, 6);
                        int i11111117 = i13 >> 3;
                        int i11111118 = i11111117 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111118 | ((i11 << 3) & 112));
                        int i11111119 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111118 | (i11111119 & 112));
                        int i211110 = i13 & 112;
                        int i211111 = i13;
                        boolean z117 = z4;
                        Modifier modifier115 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111119 & 3670016) | (i11111117 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111, state, composer2, i211110);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation112 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier115.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111, lazyLayoutSemanticStateRememberLazyGridSemanticState111, orientation112, z3, z117, composer2, (i11111119 & 57344) | ((i211111 << 3) & 458752)), orientation112), state, z117, orientation112, composer2, i211110 | ((i211111 >> 6) & 896)), overscrollEffect111), state, orientation112, overscrollEffect111, z3, scrollableDefaults111.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation112, z117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z117;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier115;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i211112) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i10 = 805306368;
                i4 |= i10;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults112 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect112 = scrollableDefaults112.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111110 = i13 >> 3;
                    int i111111111 = i111111110 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111 | ((i11 << 3) & 112));
                    int i111111112 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111 | (i111111112 & 112));
                    int i211112 = i13 & 112;
                    int i211113 = i13;
                    boolean z118 = z4;
                    Modifier modifier116 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda112, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111112 & 3670016) | (i111111110 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda112, state, composer2, i211112);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation113 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda112, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier116.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda112, lazyLayoutSemanticStateRememberLazyGridSemanticState112, orientation113, z3, z118, composer2, (i111111112 & 57344) | ((i211113 << 3) & 458752)), orientation113), state, z118, orientation113, composer2, i211112 | ((i211113 >> 6) & 896)), overscrollEffect112), state, orientation113, overscrollEffect112, z3, scrollableDefaults112.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation113, z118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z118;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier116;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults113 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect113 = scrollableDefaults113.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111113 = i13 >> 3;
                    int i111111114 = i111111113 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111114 | ((i11 << 3) & 112));
                    int i111111115 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111114 | (i111111115 & 112));
                    int i211114 = i13 & 112;
                    int i211115 = i13;
                    boolean z119 = z4;
                    Modifier modifier117 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda113, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111115 & 3670016) | (i111111113 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda113, state, composer2, i211114);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation114 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda113, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier117.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda113, lazyLayoutSemanticStateRememberLazyGridSemanticState113, orientation114, z3, z119, composer2, (i111111115 & 57344) | ((i211115 << 3) & 458752)), orientation114), state, z119, orientation114, composer2, i211114 | ((i211115 >> 6) & 896)), overscrollEffect113), state, orientation114, overscrollEffect113, z3, scrollableDefaults113.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation114, z119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z119;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier117;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i211116) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i4 |= 12582912;
            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changed(verticalArrangement)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i10 = 536870912;
                        } else {
                            i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults114 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect114 = scrollableDefaults114.overscrollEffect(composerStartRestartGroup, 6);
                        int i111111116 = i13 >> 3;
                        int i111111117 = i111111116 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111117 | ((i11 << 3) & 112));
                        int i111111118 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111117 | (i111111118 & 112));
                        int i211116 = i13 & 112;
                        int i211117 = i13;
                        boolean z1110 = z4;
                        Modifier modifier118 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda114, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111118 & 3670016) | (i111111116 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda114, state, composer2, i211116);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation115 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda114, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier118.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda114, lazyLayoutSemanticStateRememberLazyGridSemanticState114, orientation115, z3, z1110, composer2, (i111111118 & 57344) | ((i211117 << 3) & 458752)), orientation115), state, z1110, orientation115, composer2, i211116 | ((i211117 >> 6) & 896)), overscrollEffect114), state, orientation115, overscrollEffect114, z3, scrollableDefaults114.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation115, z1110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy114, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z1110;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier118;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults115 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect115 = scrollableDefaults115.overscrollEffect(composerStartRestartGroup, 6);
                        int i111111119 = i13 >> 3;
                        int i1111111110 = i111111119 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111110 | ((i11 << 3) & 112));
                        int i1111111111 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111110 | (i1111111111 & 112));
                        int i211118 = i13 & 112;
                        int i211119 = i13;
                        boolean z1111 = z4;
                        Modifier modifier119 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda115, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111 & 3670016) | (i111111119 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda115, state, composer2, i211118);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation116 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda115, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier119.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda115, lazyLayoutSemanticStateRememberLazyGridSemanticState115, orientation116, z3, z1111, composer2, (i1111111111 & 57344) | ((i211119 << 3) & 458752)), orientation116), state, z1111, orientation116, composer2, i211118 | ((i211119 >> 6) & 896)), overscrollEffect115), state, orientation116, overscrollEffect115, z3, scrollableDefaults115.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation116, z1111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy115, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z1111;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier119;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i2111110) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i10 = 805306368;
                i4 |= i10;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults116 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect116 = scrollableDefaults116.overscrollEffect(composerStartRestartGroup, 6);
                    int i1111111112 = i13 >> 3;
                    int i1111111113 = i1111111112 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111113 | ((i11 << 3) & 112));
                    int i1111111114 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111113 | (i1111111114 & 112));
                    int i2111110 = i13 & 112;
                    int i2111111 = i13;
                    boolean z1112 = z4;
                    Modifier modifier1110 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda116, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111114 & 3670016) | (i1111111112 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda116, state, composer2, i2111110);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation117 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda116, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1110.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda116, lazyLayoutSemanticStateRememberLazyGridSemanticState116, orientation117, z3, z1112, composer2, (i1111111114 & 57344) | ((i2111111 << 3) & 458752)), orientation117), state, z1112, orientation117, composer2, i2111110 | ((i2111111 >> 6) & 896)), overscrollEffect116), state, orientation117, overscrollEffect116, z3, scrollableDefaults116.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation117, z1112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy116, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z1112;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier1110;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults117 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect117 = scrollableDefaults117.overscrollEffect(composerStartRestartGroup, 6);
                    int i1111111115 = i13 >> 3;
                    int i1111111116 = i1111111115 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111116 | ((i11 << 3) & 112));
                    int i1111111117 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111116 | (i1111111117 & 112));
                    int i2111112 = i13 & 112;
                    int i2111113 = i13;
                    boolean z1113 = z4;
                    Modifier modifier1111 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda117, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111117 & 3670016) | (i1111111115 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda117, state, composer2, i2111112);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation118 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda117, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda117, lazyLayoutSemanticStateRememberLazyGridSemanticState117, orientation118, z3, z1113, composer2, (i1111111117 & 57344) | ((i2111113 << 3) & 458752)), orientation118), state, z1113, orientation118, composer2, i2111112 | ((i2111113 >> 6) & 896)), overscrollEffect117), state, orientation118, overscrollEffect117, z3, scrollableDefaults117.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation118, z1113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy117, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z1113;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier1111;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i2111114) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i9 = 100663296;
            i4 |= i9;
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i10 = 536870912;
                    } else {
                        i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults118 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect118 = scrollableDefaults118.overscrollEffect(composerStartRestartGroup, 6);
                    int i1111111118 = i13 >> 3;
                    int i1111111119 = i1111111118 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111119 | ((i11 << 3) & 112));
                    int i11111111110 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111119 | (i11111111110 & 112));
                    int i2111114 = i13 & 112;
                    int i2111115 = i13;
                    boolean z1114 = z4;
                    Modifier modifier1112 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda118, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111110 & 3670016) | (i1111111118 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda118, state, composer2, i2111114);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation119 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda118, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1112.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda118, lazyLayoutSemanticStateRememberLazyGridSemanticState118, orientation119, z3, z1114, composer2, (i11111111110 & 57344) | ((i2111115 << 3) & 458752)), orientation119), state, z1114, orientation119, composer2, i2111114 | ((i2111115 >> 6) & 896)), overscrollEffect118), state, orientation119, overscrollEffect118, z3, scrollableDefaults118.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation119, z1114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy118, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z1114;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier1112;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults119 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect119 = scrollableDefaults119.overscrollEffect(composerStartRestartGroup, 6);
                    int i11111111111 = i13 >> 3;
                    int i11111111112 = i11111111111 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111112 | ((i11 << 3) & 112));
                    int i11111111113 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111112 | (i11111111113 & 112));
                    int i2111116 = i13 & 112;
                    int i2111117 = i13;
                    boolean z1115 = z4;
                    Modifier modifier1113 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda119, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111113 & 3670016) | (i11111111111 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda119, state, composer2, i2111116);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1110 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda119, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1113.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda119, lazyLayoutSemanticStateRememberLazyGridSemanticState119, orientation1110, z3, z1115, composer2, (i11111111113 & 57344) | ((i2111117 << 3) & 458752)), orientation1110), state, z1115, orientation1110, composer2, i2111116 | ((i2111117 >> 6) & 896)), overscrollEffect119), state, orientation1110, overscrollEffect119, z3, scrollableDefaults119.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1110, z1115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy119, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z1115;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier1113;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i2111118) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i10 = 805306368;
            i4 |= i10;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults1110 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect1110 = scrollableDefaults1110.overscrollEffect(composerStartRestartGroup, 6);
                int i11111111114 = i13 >> 3;
                int i11111111115 = i11111111114 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111115 | ((i11 << 3) & 112));
                int i11111111116 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111115 | (i11111111116 & 112));
                int i2111118 = i13 & 112;
                int i2111119 = i13;
                boolean z1116 = z4;
                Modifier modifier1114 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1110, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111116 & 3670016) | (i11111111114 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1110, state, composer2, i2111118);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1110, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1114.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1110, lazyLayoutSemanticStateRememberLazyGridSemanticState1110, orientation1111, z3, z1116, composer2, (i11111111116 & 57344) | ((i2111119 << 3) & 458752)), orientation1111), state, z1116, orientation1111, composer2, i2111118 | ((i2111119 >> 6) & 896)), overscrollEffect1110), state, orientation1111, overscrollEffect1110, z3, scrollableDefaults1110.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111, z1116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1110, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1116;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier1114;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults1111 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect1111 = scrollableDefaults1111.overscrollEffect(composerStartRestartGroup, 6);
                int i11111111117 = i13 >> 3;
                int i11111111118 = i11111111117 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111118 | ((i11 << 3) & 112));
                int i11111111119 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111118 | (i11111111119 & 112));
                int i21111110 = i13 & 112;
                int i21111111 = i13;
                boolean z1117 = z4;
                Modifier modifier1115 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111119 & 3670016) | (i11111111117 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1111, state, composer2, i21111110);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1112 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1115.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111, lazyLayoutSemanticStateRememberLazyGridSemanticState1111, orientation1112, z3, z1117, composer2, (i11111111119 & 57344) | ((i21111111 << 3) & 458752)), orientation1112), state, z1117, orientation1112, composer2, i21111110 | ((i21111111 >> 6) & 896)), overscrollEffect1111), state, orientation1112, overscrollEffect1111, z3, scrollableDefaults1111.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1112, z1117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1117;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier1115;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                public final void invoke(@Nullable Composer composer3, int i21111112) {
                    LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
        i4 |= 3072;
        i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((i3 & 32) != 0) {
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i3 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i3 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                    i4 |= i8;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changed(verticalArrangement)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(horizontalArrangement)) {
                                i10 = 536870912;
                            } else {
                                i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 4;
                            } else {
                                i12 = 2;
                            }
                            i11 = i2 | i12;
                        } else {
                            i11 = i2;
                        }
                        if ((i4 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults1112 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect1112 = scrollableDefaults1112.overscrollEffect(composerStartRestartGroup, 6);
                            int i111111111110 = i13 >> 3;
                            int i111111111111 = i111111111110 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111 | ((i11 << 3) & 112));
                            int i111111111112 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111 | (i111111111112 & 112));
                            int i21111112 = i13 & 112;
                            int i21111113 = i13;
                            boolean z1118 = z4;
                            Modifier modifier1116 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1112, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111112 & 3670016) | (i111111111110 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1112, state, composer2, i21111112);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1113 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1112, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1116.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1112, lazyLayoutSemanticStateRememberLazyGridSemanticState1112, orientation1113, z3, z1118, composer2, (i111111111112 & 57344) | ((i21111113 << 3) & 458752)), orientation1113), state, z1118, orientation1113, composer2, i21111112 | ((i21111113 >> 6) & 896)), overscrollEffect1112), state, orientation1113, overscrollEffect1112, z3, scrollableDefaults1112.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1113, z1118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1112, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z1118;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier1116;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            } else {
                                if (i15 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i16 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                                }
                                if (i5 == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                    i13 = i4 & (-3670017);
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                } else {
                                    flingBehavior2 = flingBehavior;
                                    i13 = i4;
                                }
                                z4 = z6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            ScrollableDefaults scrollableDefaults1113 = ScrollableDefaults.INSTANCE;
                            OverscrollEffect overscrollEffect1113 = scrollableDefaults1113.overscrollEffect(composerStartRestartGroup, 6);
                            int i111111111113 = i13 >> 3;
                            int i111111111114 = i111111111113 & 14;
                            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111114 | ((i11 << 3) & 112));
                            int i111111111115 = i13 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111114 | (i111111111115 & 112));
                            int i21111114 = i13 & 112;
                            int i21111115 = i13;
                            boolean z1119 = z4;
                            Modifier modifier1117 = modifier3;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1113, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111115 & 3670016) | (i111111111113 & 29360128), 0);
                            state.setVertical$foundation_release(z2);
                            composer2 = composerStartRestartGroup;
                            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1113, state, composer2, i21111114);
                            if (z2) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1114 = orientation;
                            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1113, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1117.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1113, lazyLayoutSemanticStateRememberLazyGridSemanticState1113, orientation1114, z3, z1119, composer2, (i111111111115 & 57344) | ((i21111115 << 3) & 458752)), orientation1114), state, z1119, orientation1114, composer2, i21111114 | ((i21111115 >> 6) & 896)), overscrollEffect1113), state, orientation1114, overscrollEffect1113, z3, scrollableDefaults1113.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1114, z1119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1113, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z1119;
                            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                            modifier4 = modifier1117;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                            public final void invoke(@Nullable Composer composer3, int i21111116) {
                                LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                    i10 = 805306368;
                    i4 |= i10;
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults1114 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect1114 = scrollableDefaults1114.overscrollEffect(composerStartRestartGroup, 6);
                        int i111111111116 = i13 >> 3;
                        int i111111111117 = i111111111116 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111117 | ((i11 << 3) & 112));
                        int i111111111118 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111117 | (i111111111118 & 112));
                        int i21111116 = i13 & 112;
                        int i21111117 = i13;
                        boolean z11110 = z4;
                        Modifier modifier1118 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1114, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111118 & 3670016) | (i111111111116 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1114, state, composer2, i21111116);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1115 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1114, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1118.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1114, lazyLayoutSemanticStateRememberLazyGridSemanticState1114, orientation1115, z3, z11110, composer2, (i111111111118 & 57344) | ((i21111117 << 3) & 458752)), orientation1115), state, z11110, orientation1115, composer2, i21111116 | ((i21111117 >> 6) & 896)), overscrollEffect1114), state, orientation1115, overscrollEffect1114, z3, scrollableDefaults1114.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1115, z11110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1114, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z11110;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier1118;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults1115 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect1115 = scrollableDefaults1115.overscrollEffect(composerStartRestartGroup, 6);
                        int i111111111119 = i13 >> 3;
                        int i1111111111110 = i111111111119 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111110 | ((i11 << 3) & 112));
                        int i1111111111111 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111110 | (i1111111111111 & 112));
                        int i21111118 = i13 & 112;
                        int i21111119 = i13;
                        boolean z11111 = z4;
                        Modifier modifier1119 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1115, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111 & 3670016) | (i111111111119 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1115, state, composer2, i21111118);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1116 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1115, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1119.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1115, lazyLayoutSemanticStateRememberLazyGridSemanticState1115, orientation1116, z3, z11111, composer2, (i1111111111111 & 57344) | ((i21111119 << 3) & 458752)), orientation1116), state, z11111, orientation1116, composer2, i21111118 | ((i21111119 >> 6) & 896)), overscrollEffect1115), state, orientation1116, overscrollEffect1115, z3, scrollableDefaults1115.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1116, z11111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1115, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z11111;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier1119;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i211111110) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i9 = 100663296;
                i4 |= i9;
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i10 = 536870912;
                        } else {
                            i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults1116 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect1116 = scrollableDefaults1116.overscrollEffect(composerStartRestartGroup, 6);
                        int i1111111111112 = i13 >> 3;
                        int i1111111111113 = i1111111111112 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111113 | ((i11 << 3) & 112));
                        int i1111111111114 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111113 | (i1111111111114 & 112));
                        int i211111110 = i13 & 112;
                        int i211111111 = i13;
                        boolean z11112 = z4;
                        Modifier modifier11110 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1116, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111114 & 3670016) | (i1111111111112 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1116, state, composer2, i211111110);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1117 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1116, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11110.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1116, lazyLayoutSemanticStateRememberLazyGridSemanticState1116, orientation1117, z3, z11112, composer2, (i1111111111114 & 57344) | ((i211111111 << 3) & 458752)), orientation1117), state, z11112, orientation1117, composer2, i211111110 | ((i211111111 >> 6) & 896)), overscrollEffect1116), state, orientation1117, overscrollEffect1116, z3, scrollableDefaults1116.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1117, z11112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1116, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z11112;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier11110;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults1117 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect1117 = scrollableDefaults1117.overscrollEffect(composerStartRestartGroup, 6);
                        int i1111111111115 = i13 >> 3;
                        int i1111111111116 = i1111111111115 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111116 | ((i11 << 3) & 112));
                        int i1111111111117 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111116 | (i1111111111117 & 112));
                        int i211111112 = i13 & 112;
                        int i211111113 = i13;
                        boolean z11113 = z4;
                        Modifier modifier11111 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1117, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111117 & 3670016) | (i1111111111115 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1117, state, composer2, i211111112);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1118 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1117, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11111.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1117, lazyLayoutSemanticStateRememberLazyGridSemanticState1117, orientation1118, z3, z11113, composer2, (i1111111111117 & 57344) | ((i211111113 << 3) & 458752)), orientation1118), state, z11113, orientation1118, composer2, i211111112 | ((i211111113 >> 6) & 896)), overscrollEffect1117), state, orientation1118, overscrollEffect1117, z3, scrollableDefaults1117.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1118, z11113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1117, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z11113;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier11111;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i211111114) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i10 = 805306368;
                i4 |= i10;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults1118 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect1118 = scrollableDefaults1118.overscrollEffect(composerStartRestartGroup, 6);
                    int i1111111111118 = i13 >> 3;
                    int i1111111111119 = i1111111111118 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111119 | ((i11 << 3) & 112));
                    int i11111111111110 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111119 | (i11111111111110 & 112));
                    int i211111114 = i13 & 112;
                    int i211111115 = i13;
                    boolean z11114 = z4;
                    Modifier modifier11112 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1118, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111110 & 3670016) | (i1111111111118 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1118, state, composer2, i211111114);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1119 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1118, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11112.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1118, lazyLayoutSemanticStateRememberLazyGridSemanticState1118, orientation1119, z3, z11114, composer2, (i11111111111110 & 57344) | ((i211111115 << 3) & 458752)), orientation1119), state, z11114, orientation1119, composer2, i211111114 | ((i211111115 >> 6) & 896)), overscrollEffect1118), state, orientation1119, overscrollEffect1118, z3, scrollableDefaults1118.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1119, z11114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1118, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z11114;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier11112;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults1119 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect1119 = scrollableDefaults1119.overscrollEffect(composerStartRestartGroup, 6);
                    int i11111111111111 = i13 >> 3;
                    int i11111111111112 = i11111111111111 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111112 | ((i11 << 3) & 112));
                    int i11111111111113 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111112 | (i11111111111113 & 112));
                    int i211111116 = i13 & 112;
                    int i211111117 = i13;
                    boolean z11115 = z4;
                    Modifier modifier11113 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1119, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111113 & 3670016) | (i11111111111111 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1119, state, composer2, i211111116);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11110 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1119, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11113.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1119, lazyLayoutSemanticStateRememberLazyGridSemanticState1119, orientation11110, z3, z11115, composer2, (i11111111111113 & 57344) | ((i211111117 << 3) & 458752)), orientation11110), state, z11115, orientation11110, composer2, i211111116 | ((i211111117 >> 6) & 896)), overscrollEffect1119), state, orientation11110, overscrollEffect1119, z3, scrollableDefaults1119.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11110, z11115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1119, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z11115;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier11113;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i211111118) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i4 |= 12582912;
            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changed(verticalArrangement)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i10 = 536870912;
                        } else {
                            i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults11110 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect11110 = scrollableDefaults11110.overscrollEffect(composerStartRestartGroup, 6);
                        int i11111111111114 = i13 >> 3;
                        int i11111111111115 = i11111111111114 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111115 | ((i11 << 3) & 112));
                        int i11111111111116 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111115 | (i11111111111116 & 112));
                        int i211111118 = i13 & 112;
                        int i211111119 = i13;
                        boolean z11116 = z4;
                        Modifier modifier11114 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11110, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111116 & 3670016) | (i11111111111114 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11110, state, composer2, i211111118);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11111 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11110, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11114.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11110, lazyLayoutSemanticStateRememberLazyGridSemanticState11110, orientation11111, z3, z11116, composer2, (i11111111111116 & 57344) | ((i211111119 << 3) & 458752)), orientation11111), state, z11116, orientation11111, composer2, i211111118 | ((i211111119 >> 6) & 896)), overscrollEffect11110), state, orientation11111, overscrollEffect11110, z3, scrollableDefaults11110.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11111, z11116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11110, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z11116;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier11114;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults11111 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect11111 = scrollableDefaults11111.overscrollEffect(composerStartRestartGroup, 6);
                        int i11111111111117 = i13 >> 3;
                        int i11111111111118 = i11111111111117 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111118 | ((i11 << 3) & 112));
                        int i11111111111119 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111118 | (i11111111111119 & 112));
                        int i2111111110 = i13 & 112;
                        int i2111111111 = i13;
                        boolean z11117 = z4;
                        Modifier modifier11115 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11111, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111119 & 3670016) | (i11111111111117 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11111, state, composer2, i2111111110);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11112 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11111, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11115.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11111, lazyLayoutSemanticStateRememberLazyGridSemanticState11111, orientation11112, z3, z11117, composer2, (i11111111111119 & 57344) | ((i2111111111 << 3) & 458752)), orientation11112), state, z11117, orientation11112, composer2, i2111111110 | ((i2111111111 >> 6) & 896)), overscrollEffect11111), state, orientation11112, overscrollEffect11111, z3, scrollableDefaults11111.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11112, z11117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11111, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z11117;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier11115;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i2111111112) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i10 = 805306368;
                i4 |= i10;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults11112 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect11112 = scrollableDefaults11112.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111111111110 = i13 >> 3;
                    int i111111111111111 = i111111111111110 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111111 | ((i11 << 3) & 112));
                    int i111111111111112 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111111 | (i111111111111112 & 112));
                    int i2111111112 = i13 & 112;
                    int i2111111113 = i13;
                    boolean z11118 = z4;
                    Modifier modifier11116 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11112, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111112 & 3670016) | (i111111111111110 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11112, state, composer2, i2111111112);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11113 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11112, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11116.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11112, lazyLayoutSemanticStateRememberLazyGridSemanticState11112, orientation11113, z3, z11118, composer2, (i111111111111112 & 57344) | ((i2111111113 << 3) & 458752)), orientation11113), state, z11118, orientation11113, composer2, i2111111112 | ((i2111111113 >> 6) & 896)), overscrollEffect11112), state, orientation11113, overscrollEffect11112, z3, scrollableDefaults11112.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11113, z11118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z11118;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier11116;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults11113 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect11113 = scrollableDefaults11113.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111111111113 = i13 >> 3;
                    int i111111111111114 = i111111111111113 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111114 | ((i11 << 3) & 112));
                    int i111111111111115 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111114 | (i111111111111115 & 112));
                    int i2111111114 = i13 & 112;
                    int i2111111115 = i13;
                    boolean z11119 = z4;
                    Modifier modifier11117 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11113, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111115 & 3670016) | (i111111111111113 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11113, state, composer2, i2111111114);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11114 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11113, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11117.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11113, lazyLayoutSemanticStateRememberLazyGridSemanticState11113, orientation11114, z3, z11119, composer2, (i111111111111115 & 57344) | ((i2111111115 << 3) & 458752)), orientation11114), state, z11119, orientation11114, composer2, i2111111114 | ((i2111111115 >> 6) & 896)), overscrollEffect11113), state, orientation11114, overscrollEffect11113, z3, scrollableDefaults11113.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11114, z11119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z11119;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier11117;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i2111111116) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i9 = 100663296;
            i4 |= i9;
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i10 = 536870912;
                    } else {
                        i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults11114 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect11114 = scrollableDefaults11114.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111111111116 = i13 >> 3;
                    int i111111111111117 = i111111111111116 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111117 | ((i11 << 3) & 112));
                    int i111111111111118 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111117 | (i111111111111118 & 112));
                    int i2111111116 = i13 & 112;
                    int i2111111117 = i13;
                    boolean z111110 = z4;
                    Modifier modifier11118 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11114, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111118 & 3670016) | (i111111111111116 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11114, state, composer2, i2111111116);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11115 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11114, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11118.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11114, lazyLayoutSemanticStateRememberLazyGridSemanticState11114, orientation11115, z3, z111110, composer2, (i111111111111118 & 57344) | ((i2111111117 << 3) & 458752)), orientation11115), state, z111110, orientation11115, composer2, i2111111116 | ((i2111111117 >> 6) & 896)), overscrollEffect11114), state, orientation11115, overscrollEffect11114, z3, scrollableDefaults11114.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11115, z111110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11114, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111110;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier11118;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults11115 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect11115 = scrollableDefaults11115.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111111111119 = i13 >> 3;
                    int i1111111111111110 = i111111111111119 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111110 | ((i11 << 3) & 112));
                    int i1111111111111111 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111110 | (i1111111111111111 & 112));
                    int i2111111118 = i13 & 112;
                    int i2111111119 = i13;
                    boolean z111111 = z4;
                    Modifier modifier11119 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11115, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111111 & 3670016) | (i111111111111119 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11115, state, composer2, i2111111118);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11116 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11115, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier11119.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11115, lazyLayoutSemanticStateRememberLazyGridSemanticState11115, orientation11116, z3, z111111, composer2, (i1111111111111111 & 57344) | ((i2111111119 << 3) & 458752)), orientation11116), state, z111111, orientation11116, composer2, i2111111118 | ((i2111111119 >> 6) & 896)), overscrollEffect11115), state, orientation11116, overscrollEffect11115, z3, scrollableDefaults11115.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11116, z111111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11115, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111111;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier11119;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i21111111110) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i10 = 805306368;
            i4 |= i10;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults11116 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect11116 = scrollableDefaults11116.overscrollEffect(composerStartRestartGroup, 6);
                int i1111111111111112 = i13 >> 3;
                int i1111111111111113 = i1111111111111112 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111113 | ((i11 << 3) & 112));
                int i1111111111111114 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111113 | (i1111111111111114 & 112));
                int i21111111110 = i13 & 112;
                int i21111111111 = i13;
                boolean z111112 = z4;
                Modifier modifier111110 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11116, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111114 & 3670016) | (i1111111111111112 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11116, state, composer2, i21111111110);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11117 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11116, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111110.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11116, lazyLayoutSemanticStateRememberLazyGridSemanticState11116, orientation11117, z3, z111112, composer2, (i1111111111111114 & 57344) | ((i21111111111 << 3) & 458752)), orientation11117), state, z111112, orientation11117, composer2, i21111111110 | ((i21111111111 >> 6) & 896)), overscrollEffect11116), state, orientation11117, overscrollEffect11116, z3, scrollableDefaults11116.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11117, z111112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11116, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z111112;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier111110;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults11117 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect11117 = scrollableDefaults11117.overscrollEffect(composerStartRestartGroup, 6);
                int i1111111111111115 = i13 >> 3;
                int i1111111111111116 = i1111111111111115 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111116 | ((i11 << 3) & 112));
                int i1111111111111117 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111116 | (i1111111111111117 & 112));
                int i21111111112 = i13 & 112;
                int i21111111113 = i13;
                boolean z111113 = z4;
                Modifier modifier111111 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11117, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111117 & 3670016) | (i1111111111111115 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11117, state, composer2, i21111111112);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11118 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11117, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111111.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11117, lazyLayoutSemanticStateRememberLazyGridSemanticState11117, orientation11118, z3, z111113, composer2, (i1111111111111117 & 57344) | ((i21111111113 << 3) & 458752)), orientation11118), state, z111113, orientation11118, composer2, i21111111112 | ((i21111111113 >> 6) & 896)), overscrollEffect11117), state, orientation11118, overscrollEffect11117, z3, scrollableDefaults11117.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11118, z111113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11117, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z111113;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier111111;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                public final void invoke(@Nullable Composer composer3, int i21111111114) {
                    LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
        i7 = 196608;
        i4 |= i7;
        if ((i & 3670016) != 0) {
            if ((i3 & 64) == 0) {
                i14 = 524288;
            } else {
                i14 = 524288;
            }
            i4 |= i14;
        }
        if ((i3 & 128) != 0) {
            if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
                i4 |= i8;
            }
            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changed(verticalArrangement)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(horizontalArrangement)) {
                            i10 = 536870912;
                        } else {
                            i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i11 = i2 | i12;
                    } else {
                        i11 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults11118 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect11118 = scrollableDefaults11118.overscrollEffect(composerStartRestartGroup, 6);
                        int i1111111111111118 = i13 >> 3;
                        int i1111111111111119 = i1111111111111118 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111119 | ((i11 << 3) & 112));
                        int i11111111111111110 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111119 | (i11111111111111110 & 112));
                        int i21111111114 = i13 & 112;
                        int i21111111115 = i13;
                        boolean z111114 = z4;
                        Modifier modifier111112 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11118, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111110 & 3670016) | (i1111111111111118 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11118, state, composer2, i21111111114);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11119 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11118, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111112.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11118, lazyLayoutSemanticStateRememberLazyGridSemanticState11118, orientation11119, z3, z111114, composer2, (i11111111111111110 & 57344) | ((i21111111115 << 3) & 458752)), orientation11119), state, z111114, orientation11119, composer2, i21111111114 | ((i21111111115 >> 6) & 896)), overscrollEffect11118), state, orientation11119, overscrollEffect11118, z3, scrollableDefaults11118.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation11119, z111114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11118, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z111114;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier111112;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        } else {
                            if (i15 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i16 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                                i13 = i4 & (-3670017);
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            } else {
                                flingBehavior2 = flingBehavior;
                                i13 = i4;
                            }
                            z4 = z6;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        ScrollableDefaults scrollableDefaults11119 = ScrollableDefaults.INSTANCE;
                        OverscrollEffect overscrollEffect11119 = scrollableDefaults11119.overscrollEffect(composerStartRestartGroup, 6);
                        int i11111111111111111 = i13 >> 3;
                        int i11111111111111112 = i11111111111111111 & 14;
                        Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda11119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111111112 | ((i11 << 3) & 112));
                        int i11111111111111113 = i13 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState11119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111111112 | (i11111111111111113 & 112));
                        int i21111111116 = i13 & 112;
                        int i21111111117 = i13;
                        boolean z111115 = z4;
                        Modifier modifier111113 = modifier3;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy11119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda11119, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111113 & 3670016) | (i11111111111111111 & 29360128), 0);
                        state.setVertical$foundation_release(z2);
                        composer2 = composerStartRestartGroup;
                        ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda11119, state, composer2, i21111111116);
                        if (z2) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111110 = orientation;
                        LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda11119, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111113.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda11119, lazyLayoutSemanticStateRememberLazyGridSemanticState11119, orientation111110, z3, z111115, composer2, (i11111111111111113 & 57344) | ((i21111111117 << 3) & 458752)), orientation111110), state, z111115, orientation111110, composer2, i21111111116 | ((i21111111117 >> 6) & 896)), overscrollEffect11119), state, orientation111110, overscrollEffect11119, z3, scrollableDefaults11119.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111110, z111115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy11119, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z111115;
                        paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                        modifier4 = modifier111113;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                        public final void invoke(@Nullable Composer composer3, int i21111111118) {
                            LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
                i10 = 805306368;
                i4 |= i10;
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults111110 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect111110 = scrollableDefaults111110.overscrollEffect(composerStartRestartGroup, 6);
                    int i11111111111111114 = i13 >> 3;
                    int i11111111111111115 = i11111111111111114 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111111115 | ((i11 << 3) & 112));
                    int i11111111111111116 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111111115 | (i11111111111111116 & 112));
                    int i21111111118 = i13 & 112;
                    int i21111111119 = i13;
                    boolean z111116 = z4;
                    Modifier modifier111114 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111110, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111116 & 3670016) | (i11111111111111114 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111110, state, composer2, i21111111118);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111111 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111110, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111114.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111110, lazyLayoutSemanticStateRememberLazyGridSemanticState111110, orientation111111, z3, z111116, composer2, (i11111111111111116 & 57344) | ((i21111111119 << 3) & 458752)), orientation111111), state, z111116, orientation111111, composer2, i21111111118 | ((i21111111119 >> 6) & 896)), overscrollEffect111110), state, orientation111111, overscrollEffect111110, z3, scrollableDefaults111110.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111111, z111116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111110, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111116;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier111114;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults111111 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect111111 = scrollableDefaults111111.overscrollEffect(composerStartRestartGroup, 6);
                    int i11111111111111117 = i13 >> 3;
                    int i11111111111111118 = i11111111111111117 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111111118 | ((i11 << 3) & 112));
                    int i11111111111111119 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111111118 | (i11111111111111119 & 112));
                    int i211111111110 = i13 & 112;
                    int i211111111111 = i13;
                    boolean z111117 = z4;
                    Modifier modifier111115 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111111, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111119 & 3670016) | (i11111111111111117 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111111, state, composer2, i211111111110);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111112 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111111, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111115.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111111, lazyLayoutSemanticStateRememberLazyGridSemanticState111111, orientation111112, z3, z111117, composer2, (i11111111111111119 & 57344) | ((i211111111111 << 3) & 458752)), orientation111112), state, z111117, orientation111112, composer2, i211111111110 | ((i211111111111 >> 6) & 896)), overscrollEffect111111), state, orientation111112, overscrollEffect111111, z3, scrollableDefaults111111.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111112, z111117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111111, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111117;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier111115;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i211111111112) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i9 = 100663296;
            i4 |= i9;
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i10 = 536870912;
                    } else {
                        i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults111112 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect111112 = scrollableDefaults111112.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111111111111110 = i13 >> 3;
                    int i111111111111111111 = i111111111111111110 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111111111 | ((i11 << 3) & 112));
                    int i111111111111111112 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111111111 | (i111111111111111112 & 112));
                    int i211111111112 = i13 & 112;
                    int i211111111113 = i13;
                    boolean z111118 = z4;
                    Modifier modifier111116 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111112, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111111112 & 3670016) | (i111111111111111110 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111112, state, composer2, i211111111112);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111113 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111112, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111116.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111112, lazyLayoutSemanticStateRememberLazyGridSemanticState111112, orientation111113, z3, z111118, composer2, (i111111111111111112 & 57344) | ((i211111111113 << 3) & 458752)), orientation111113), state, z111118, orientation111113, composer2, i211111111112 | ((i211111111113 >> 6) & 896)), overscrollEffect111112), state, orientation111113, overscrollEffect111112, z3, scrollableDefaults111112.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111113, z111118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111112, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111118;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier111116;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults111113 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect111113 = scrollableDefaults111113.overscrollEffect(composerStartRestartGroup, 6);
                    int i111111111111111113 = i13 >> 3;
                    int i111111111111111114 = i111111111111111113 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111111114 | ((i11 << 3) & 112));
                    int i111111111111111115 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111111114 | (i111111111111111115 & 112));
                    int i211111111114 = i13 & 112;
                    int i211111111115 = i13;
                    boolean z111119 = z4;
                    Modifier modifier111117 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111113, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111111115 & 3670016) | (i111111111111111113 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111113, state, composer2, i211111111114);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111114 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111113, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111117.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111113, lazyLayoutSemanticStateRememberLazyGridSemanticState111113, orientation111114, z3, z111119, composer2, (i111111111111111115 & 57344) | ((i211111111115 << 3) & 458752)), orientation111114), state, z111119, orientation111114, composer2, i211111111114 | ((i211111111115 >> 6) & 896)), overscrollEffect111113), state, orientation111114, overscrollEffect111113, z3, scrollableDefaults111113.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111114, z111119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111113, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z111119;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier111117;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i211111111116) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i10 = 805306368;
            i4 |= i10;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults111114 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect111114 = scrollableDefaults111114.overscrollEffect(composerStartRestartGroup, 6);
                int i111111111111111116 = i13 >> 3;
                int i111111111111111117 = i111111111111111116 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111114 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111111117 | ((i11 << 3) & 112));
                int i111111111111111118 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111114 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111111117 | (i111111111111111118 & 112));
                int i211111111116 = i13 & 112;
                int i211111111117 = i13;
                boolean z1111110 = z4;
                Modifier modifier111118 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111114 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111114, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111111118 & 3670016) | (i111111111111111116 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111114, state, composer2, i211111111116);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111115 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111114, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111118.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111114, lazyLayoutSemanticStateRememberLazyGridSemanticState111114, orientation111115, z3, z1111110, composer2, (i111111111111111118 & 57344) | ((i211111111117 << 3) & 458752)), orientation111115), state, z1111110, orientation111115, composer2, i211111111116 | ((i211111111117 >> 6) & 896)), overscrollEffect111114), state, orientation111115, overscrollEffect111114, z3, scrollableDefaults111114.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111115, z1111110), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111114, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1111110;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier111118;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults111115 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect111115 = scrollableDefaults111115.overscrollEffect(composerStartRestartGroup, 6);
                int i111111111111111119 = i13 >> 3;
                int i1111111111111111110 = i111111111111111119 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111115 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111111110 | ((i11 << 3) & 112));
                int i1111111111111111111 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111115 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111111110 | (i1111111111111111111 & 112));
                int i211111111118 = i13 & 112;
                int i211111111119 = i13;
                boolean z1111111 = z4;
                Modifier modifier111119 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111115 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111115, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i211111111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111111111 & 3670016) | (i111111111111111119 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111115, state, composer2, i211111111118);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111116 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111115, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier111119.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111115, lazyLayoutSemanticStateRememberLazyGridSemanticState111115, orientation111116, z3, z1111111, composer2, (i1111111111111111111 & 57344) | ((i211111111119 << 3) & 458752)), orientation111116), state, z1111111, orientation111116, composer2, i211111111118 | ((i211111111119 >> 6) & 896)), overscrollEffect111115), state, orientation111116, overscrollEffect111115, z3, scrollableDefaults111115.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111116, z1111111), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111115, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1111111;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier111119;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                public final void invoke(@Nullable Composer composer3, int i2111111111110) {
                    LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
        i4 |= 12582912;
        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i) == 0) {
                if (composerStartRestartGroup.changed(verticalArrangement)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
            }
            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(horizontalArrangement)) {
                        i10 = 536870912;
                    } else {
                        i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults111116 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect111116 = scrollableDefaults111116.overscrollEffect(composerStartRestartGroup, 6);
                    int i1111111111111111112 = i13 >> 3;
                    int i1111111111111111113 = i1111111111111111112 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111116 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111111113 | ((i11 << 3) & 112));
                    int i1111111111111111114 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111116 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111111113 | (i1111111111111111114 & 112));
                    int i2111111111110 = i13 & 112;
                    int i2111111111111 = i13;
                    boolean z1111112 = z4;
                    Modifier modifier1111110 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111116 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111116, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111111114 & 3670016) | (i1111111111111111112 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111116, state, composer2, i2111111111110);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111117 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111116, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111110.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111116, lazyLayoutSemanticStateRememberLazyGridSemanticState111116, orientation111117, z3, z1111112, composer2, (i1111111111111111114 & 57344) | ((i2111111111111 << 3) & 458752)), orientation111117), state, z1111112, orientation111117, composer2, i2111111111110 | ((i2111111111111 >> 6) & 896)), overscrollEffect111116), state, orientation111117, overscrollEffect111116, z3, scrollableDefaults111116.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111117, z1111112), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111116, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z1111112;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier1111110;
                    flingBehavior3 = flingBehavior2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    } else {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i16 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                            i13 = i4 & (-3670017);
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                            i13 = i4;
                        }
                        z4 = z6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    ScrollableDefaults scrollableDefaults111117 = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect111117 = scrollableDefaults111117.overscrollEffect(composerStartRestartGroup, 6);
                    int i1111111111111111115 = i13 >> 3;
                    int i1111111111111111116 = i1111111111111111115 & 14;
                    Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111117 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111111116 | ((i11 << 3) & 112));
                    int i1111111111111111117 = i13 >> 9;
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111117 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111111116 | (i1111111111111111117 & 112));
                    int i2111111111112 = i13 & 112;
                    int i2111111111113 = i13;
                    boolean z1111113 = z4;
                    Modifier modifier1111111 = modifier3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111117 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111117, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i1111111111111111117 & 3670016) | (i1111111111111111115 & 29360128), 0);
                    state.setVertical$foundation_release(z2);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111117, state, composer2, i2111111111112);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111118 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111117, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111111.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111117, lazyLayoutSemanticStateRememberLazyGridSemanticState111117, orientation111118, z3, z1111113, composer2, (i1111111111111111117 & 57344) | ((i2111111111113 << 3) & 458752)), orientation111118), state, z1111113, orientation111118, composer2, i2111111111112 | ((i2111111111113 >> 6) & 896)), overscrollEffect111117), state, orientation111118, overscrollEffect111117, z3, scrollableDefaults111117.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111118, z1111113), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111117, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z1111113;
                    paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                    modifier4 = modifier1111111;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                    public final void invoke(@Nullable Composer composer3, int i2111111111114) {
                        LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            i10 = 805306368;
            i4 |= i10;
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults111118 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect111118 = scrollableDefaults111118.overscrollEffect(composerStartRestartGroup, 6);
                int i1111111111111111118 = i13 >> 3;
                int i1111111111111111119 = i1111111111111111118 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111118 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i1111111111111111119 | ((i11 << 3) & 112));
                int i11111111111111111110 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111118 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i1111111111111111119 | (i11111111111111111110 & 112));
                int i2111111111114 = i13 & 112;
                int i2111111111115 = i13;
                boolean z1111114 = z4;
                Modifier modifier1111112 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111118 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111118, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111111110 & 3670016) | (i1111111111111111118 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111118, state, composer2, i2111111111114);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111119 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111118, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111112.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111118, lazyLayoutSemanticStateRememberLazyGridSemanticState111118, orientation111119, z3, z1111114, composer2, (i11111111111111111110 & 57344) | ((i2111111111115 << 3) & 458752)), orientation111119), state, z1111114, orientation111119, composer2, i2111111111114 | ((i2111111111115 >> 6) & 896)), overscrollEffect111118), state, orientation111119, overscrollEffect111118, z3, scrollableDefaults111118.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation111119, z1111114), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111118, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1111114;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier1111112;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults111119 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect111119 = scrollableDefaults111119.overscrollEffect(composerStartRestartGroup, 6);
                int i11111111111111111111 = i13 >> 3;
                int i11111111111111111112 = i11111111111111111111 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda111119 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111111111112 | ((i11 << 3) & 112));
                int i11111111111111111113 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState111119 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111111111112 | (i11111111111111111113 & 112));
                int i2111111111116 = i13 & 112;
                int i2111111111117 = i13;
                boolean z1111115 = z4;
                Modifier modifier1111113 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy111119 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda111119, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111111116 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111111113 & 3670016) | (i11111111111111111111 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda111119, state, composer2, i2111111111116);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111110 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda111119, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111113.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda111119, lazyLayoutSemanticStateRememberLazyGridSemanticState111119, orientation1111110, z3, z1111115, composer2, (i11111111111111111113 & 57344) | ((i2111111111117 << 3) & 458752)), orientation1111110), state, z1111115, orientation1111110, composer2, i2111111111116 | ((i2111111111117 >> 6) & 896)), overscrollEffect111119), state, orientation1111110, overscrollEffect111119, z3, scrollableDefaults111119.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111110, z1111115), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy111119, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1111115;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier1111113;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                public final void invoke(@Nullable Composer composer3, int i2111111111118) {
                    LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
        i9 = 100663296;
        i4 |= i9;
        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changed(horizontalArrangement)) {
                    i10 = 536870912;
                } else {
                    i10 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            if ((i4 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults1111110 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect1111110 = scrollableDefaults1111110.overscrollEffect(composerStartRestartGroup, 6);
                int i11111111111111111114 = i13 >> 3;
                int i11111111111111111115 = i11111111111111111114 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111110 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111111111115 | ((i11 << 3) & 112));
                int i11111111111111111116 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111110 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111111111115 | (i11111111111111111116 & 112));
                int i2111111111118 = i13 & 112;
                int i2111111111119 = i13;
                boolean z1111116 = z4;
                Modifier modifier1111114 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111110 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111110, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i2111111111118 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111111116 & 3670016) | (i11111111111111111114 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1111110, state, composer2, i2111111111118);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111111 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111110, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111114.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111110, lazyLayoutSemanticStateRememberLazyGridSemanticState1111110, orientation1111111, z3, z1111116, composer2, (i11111111111111111116 & 57344) | ((i2111111111119 << 3) & 458752)), orientation1111111), state, z1111116, orientation1111111, composer2, i2111111111118 | ((i2111111111119 >> 6) & 896)), overscrollEffect1111110), state, orientation1111111, overscrollEffect1111110, z3, scrollableDefaults1111110.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111111, z1111116), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111110, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1111116;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier1111114;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) != 0) {
                        i13 = i4 & (-3670017);
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                        i13 = i4;
                    }
                    z4 = z6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                ScrollableDefaults scrollableDefaults1111111 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect1111111 = scrollableDefaults1111111.overscrollEffect(composerStartRestartGroup, 6);
                int i11111111111111111117 = i13 >> 3;
                int i11111111111111111118 = i11111111111111111117 & 14;
                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111111 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i11111111111111111118 | ((i11 << 3) & 112));
                int i11111111111111111119 = i13 >> 9;
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111111 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i11111111111111111118 | (i11111111111111111119 & 112));
                int i21111111111110 = i13 & 112;
                int i21111111111111 = i13;
                boolean z1111117 = z4;
                Modifier modifier1111115 = modifier3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111111 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111111, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111111110 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i11111111111111111119 & 3670016) | (i11111111111111111117 & 29360128), 0);
                state.setVertical$foundation_release(z2);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1111111, state, composer2, i21111111111110);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111112 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111111, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111115.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111111, lazyLayoutSemanticStateRememberLazyGridSemanticState1111111, orientation1111112, z3, z1111117, composer2, (i11111111111111111119 & 57344) | ((i21111111111111 << 3) & 458752)), orientation1111112), state, z1111117, orientation1111112, composer2, i21111111111110 | ((i21111111111111 >> 6) & 896)), overscrollEffect1111111), state, orientation1111112, overscrollEffect1111111, z3, scrollableDefaults1111111.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111112, z1111117), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111111, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z1111117;
                paddingValues2 = paddingValuesM471PaddingValues0680j_4;
                modifier4 = modifier1111115;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

                public final void invoke(@Nullable Composer composer3, int i21111111111112) {
                    LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
        i10 = 805306368;
        i4 |= i10;
        if ((i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i2 | i12;
        } else {
            i11 = i2;
        }
        if ((i4 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) != 0) {
                    i13 = i4 & (-3670017);
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                    i13 = i4;
                }
                z4 = z6;
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) != 0) {
                    i13 = i4 & (-3670017);
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                    i13 = i4;
                }
                z4 = z6;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
            }
            ScrollableDefaults scrollableDefaults1111112 = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect1111112 = scrollableDefaults1111112.overscrollEffect(composerStartRestartGroup, 6);
            int i111111111111111111110 = i13 >> 3;
            int i111111111111111111111 = i111111111111111111110 & 14;
            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111112 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111111111111 | ((i11 << 3) & 112));
            int i111111111111111111112 = i13 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111112 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111111111111 | (i111111111111111111112 & 112));
            int i21111111111112 = i13 & 112;
            int i21111111111113 = i13;
            boolean z1111118 = z4;
            Modifier modifier1111116 = modifier3;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111112 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111112, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111111112 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111111111112 & 3670016) | (i111111111111111111110 & 29360128), 0);
            state.setVertical$foundation_release(z2);
            composer2 = composerStartRestartGroup;
            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1111112, state, composer2, i21111111111112);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111113 = orientation;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111112, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111116.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111112, lazyLayoutSemanticStateRememberLazyGridSemanticState1111112, orientation1111113, z3, z1111118, composer2, (i111111111111111111112 & 57344) | ((i21111111111113 << 3) & 458752)), orientation1111113), state, z1111118, orientation1111113, composer2, i21111111111112 | ((i21111111111113 >> 6) & 896)), overscrollEffect1111112), state, orientation1111113, overscrollEffect1111112, z3, scrollableDefaults1111112.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111113, z1111118), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111112, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z1111118;
            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
            modifier4 = modifier1111116;
            flingBehavior3 = flingBehavior2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) != 0) {
                    i13 = i4 & (-3670017);
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                    i13 = i4;
                }
                z4 = z6;
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues;
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) != 0) {
                    i13 = i4 & (-3670017);
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                    i13 = i4;
                }
                z4 = z6;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(152645664, i13, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
            }
            ScrollableDefaults scrollableDefaults1111113 = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect1111113 = scrollableDefaults1111113.overscrollEffect(composerStartRestartGroup, 6);
            int i111111111111111111113 = i13 >> 3;
            int i111111111111111111114 = i111111111111111111113 & 14;
            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda1111113 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, content, composerStartRestartGroup, i111111111111111111114 | ((i11 << 3) & 112));
            int i111111111111111111115 = i13 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState1111113 = LazySemanticsKt.rememberLazyGridSemanticState(state, z4, composerStartRestartGroup, i111111111111111111114 | (i111111111111111111115 & 112));
            int i21111111111114 = i13 & 112;
            int i21111111111115 = i13;
            boolean z1111119 = z4;
            Modifier modifier1111117 = modifier3;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy1111113 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda1111113, state, slots, paddingValuesM471PaddingValues0680j_4, z4, z2, horizontalArrangement, verticalArrangement, composerStartRestartGroup, (i13 & 896) | i21111111111114 | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i111111111111111111115 & 3670016) | (i111111111111111111113 & 29360128), 0);
            state.setVertical$foundation_release(z2);
            composer2 = composerStartRestartGroup;
            ScrollPositionUpdater(function0RememberLazyGridItemProviderLambda1111113, state, composer2, i21111111111114);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111114 = orientation;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda1111113, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyGridBeyondBoundsModifierKt.lazyGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier1111117.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda1111113, lazyLayoutSemanticStateRememberLazyGridSemanticState1111113, orientation1111114, z3, z1111119, composer2, (i111111111111111111115 & 57344) | ((i21111111111115 << 3) & 458752)), orientation1111114), state, z1111119, orientation1111114, composer2, i21111111111114 | ((i21111111111115 >> 6) & 896)), overscrollEffect1111113), state, orientation1111114, overscrollEffect1111113, z3, scrollableDefaults1111113.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation1111114, z1111119), flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyGridMeasurePolicy1111113, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z1111119;
            paddingValues2 = paddingValuesM471PaddingValues0680j_4;
            modifier4 = modifier1111117;
            flingBehavior3 = flingBehavior2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
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

            public final void invoke(@Nullable Composer composer3, int i21111111111116) {
                LazyGridKt.LazyGrid(modifier4, state, slots, paddingValues2, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649335720);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649335720, i, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:138)");
            }
            LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
            if (lazyGridItemProviderInvoke.getItemCount() > 0) {
                LazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyGridState, lazyGridItemProviderInvoke, 0, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.ScrollPositionUpdater.1
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

            public final void invoke(@Nullable Composer composer2, int i3) {
                LazyGridKt.ScrollPositionUpdater(function0, lazyGridState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @Composable
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final Function2<? super Density, ? super Constraints, LazyGridSlots> function2, final PaddingValues paddingValues, final boolean z, final boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1292704639);
        final Arrangement.Horizontal horizontal2 = (i2 & 64) != 0 ? null : horizontal;
        final Arrangement.Vertical vertical2 = (i2 & 128) != 0 ? null : vertical;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1292704639, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:156)");
        }
        Object[] objArr = {lazyGridState, function2, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal2, vertical2};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i3 = 0; i3 < 7; i3++) {
            zChanged |= composer.changed(objArr[i3]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m610invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r32v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
                /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m610invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    float spacing;
                    long jIntOffset;
                    int firstVisibleItemScrollOffset;
                    int lineIndexOfItem;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m199checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo320roundToPx0680j_4 = z2 ? lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.mo429calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo320roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo320roundToPx0680j_5 = z2 ? lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.mo430calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo320roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo320roundToPx0680j_6 = lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.getTop());
                    int iMo320roundToPx0680j_7 = lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.getBottom());
                    final int i5 = iMo320roundToPx0680j_6 + iMo320roundToPx0680j_7;
                    final int i6 = iMo320roundToPx0680j_4 + iMo320roundToPx0680j_5;
                    boolean z3 = z2;
                    int i7 = z3 ? i5 : i6;
                    if (z3 && !z) {
                        i4 = iMo320roundToPx0680j_6;
                    } else if (z3 && z) {
                        i4 = iMo320roundToPx0680j_7;
                    } else {
                        i4 = (z3 || z) ? iMo320roundToPx0680j_5 : iMo320roundToPx0680j_4;
                    }
                    final int i8 = i7 - i4;
                    long jM3759offsetNN6EwU = ConstraintsKt.m3759offsetNN6EwU(j, -i6, -i5);
                    final LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
                    final LazyGridSlots lazyGridSlotsInvoke = function2.invoke(lazyLayoutMeasureScope, Constraints.m3731boximpl(j));
                    int length = lazyGridSlotsInvoke.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(length);
                    if (z2) {
                        Arrangement.Vertical vertical3 = vertical2;
                        if (vertical3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical3.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal3 = horizontal2;
                        if (horizontal3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal3.getSpacing();
                    }
                    final int iMo320roundToPx0680j_8 = lazyLayoutMeasureScope.mo320roundToPx0680j_4(spacing);
                    final int itemCount = lazyGridItemProviderInvoke.getItemCount();
                    int iM3742getMaxHeightimpl = z2 ? Constraints.m3742getMaxHeightimpl(j) - i5 : Constraints.m3743getMaxWidthimpl(j) - i6;
                    if (!z || iM3742getMaxHeightimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo320roundToPx0680j_4, iMo320roundToPx0680j_6);
                    } else {
                        boolean z4 = z2;
                        if (!z4) {
                            iMo320roundToPx0680j_4 += iM3742getMaxHeightimpl;
                        }
                        if (z4) {
                            iMo320roundToPx0680j_6 += iM3742getMaxHeightimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo320roundToPx0680j_4, iMo320roundToPx0680j_6);
                    }
                    final long j2 = jIntOffset;
                    final boolean z5 = z2;
                    final boolean z6 = z;
                    final int i9 = i4;
                    final ?? r32 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope, iMo320roundToPx0680j_8, z5, z6, i9, i8, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$isVertical = z5;
                            this.$reverseLayout = z6;
                            this.$beforeContentPadding = i9;
                            this.$afterContentPadding = i8;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        @NotNull
                        public LazyGridMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, int crossAxisSize, int mainAxisSpacing, @NotNull List<? extends Placeable> placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, null);
                        }
                    };
                    final boolean z7 = z2;
                    final ?? r9 = new LazyGridMeasuredLineProvider(z7, lazyGridSlotsInvoke, itemCount, iMo320roundToPx0680j_8, r32, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z7, lazyGridSlotsInvoke, itemCount, iMo320roundToPx0680j_8, r32, spanLayoutProvider);
                            this.$isVertical = z7;
                            this.$resolvedSlots = lazyGridSlotsInvoke;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        @NotNull
                        public LazyGridMeasuredLine createLine(int index, @NotNull LazyGridMeasuredItem[] items, @NotNull List<GridItemSpan> spans, int mainAxisSpacing) {
                            Intrinsics.checkNotNullParameter(items, "items");
                            Intrinsics.checkNotNullParameter(spans, "spans");
                            return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                        }
                    };
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        @NotNull
                        public final ArrayList<Pair<Integer, Constraints>> invoke(int i10) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i10);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r9;
                            int size = spans.size();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size; i12++) {
                                int iM595getCurrentLineSpanimpl = GridItemSpan.m595getCurrentLineSpanimpl(spans.get(i12).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m3731boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m616childConstraintsJhjzzOo$foundation_release(i11, iM595getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i11 += iM595getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState2.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState2.getFirstVisibleItemIndex());
                            if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                                int lineIndexOfItem2 = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                                firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                                lineIndexOfItem = lineIndexOfItem2;
                            } else {
                                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                            }
                            Unit unit = Unit.INSTANCE;
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyGridMeasureResult lazyGridMeasureResultM611measureLazyGridZRKPzZ8 = LazyGridMeasureKt.m611measureLazyGridZRKPzZ8(itemCount, r9, r32, iM3742getMaxHeightimpl, i4, i8, iMo320roundToPx0680j_8, lineIndexOfItem, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), jM3759offsetNN6EwU, z2, vertical2, horizontal2, z, lazyLayoutMeasureScope, lazyGridState.getPlacementAnimator(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo()), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i10, int i11, @NotNull Function1<? super Placeable.PlacementScope, Unit> placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m3757constrainWidthK40F9xA(j, i10 + i6), ConstraintsKt.m3756constrainHeightK40F9xA(j, i11 + i5), MapsKt.emptyMap(), placement);
                                }
                            });
                            lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResultM611measureLazyGridZRKPzZ8);
                            return lazyGridMeasureResultM611measureLazyGridZRKPzZ8;
                        } catch (Throwable th) {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th2;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function3 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function3;
    }
}
