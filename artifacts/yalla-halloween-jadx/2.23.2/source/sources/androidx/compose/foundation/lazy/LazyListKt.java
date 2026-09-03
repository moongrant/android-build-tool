package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010!\u001a\u008d\u0001\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0002\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,339:1\n76#2:340\n83#3,3:341\n1097#4,6:344\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n122#1:340\n174#1:341,3\n174#1:344,6\n*E\n"})
public final class LazyListKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x015d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:114:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01df  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:164:0x026a  */
    /* JADX WARN: Code duplicated, block: B:165:0x026d  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyList(@NotNull final Modifier modifier, @NotNull final LazyListState state, @NotNull final PaddingValues contentPadding, final boolean z, final boolean z2, @NotNull final FlingBehavior flingBehavior, final boolean z3, int i, @Nullable Alignment.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Vertical vertical2, @Nullable Arrangement.Horizontal horizontal2, @NotNull final Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Alignment.Horizontal horizontal3;
        Arrangement.Vertical vertical3;
        Alignment.Vertical vertical4;
        Arrangement.Horizontal horizontal4;
        Composer composer2;
        Orientation orientation;
        final Arrangement.Vertical vertical5;
        final int i20;
        final Alignment.Horizontal horizontal5;
        final Arrangement.Horizontal horizontal6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(620764179);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        int i21 = i4 & 4;
        int i22 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i4 & 32) == 0) {
            if ((i2 & 458752) == 0) {
                i6 = composerStartRestartGroup.changed(flingBehavior) ? 131072 : 65536;
            }
            if ((i4 & 64) != 0) {
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i9;
                }
                i10 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i5 |= i11;
                }
                i12 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i12 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(vertical)) {
                        i13 = 536870912;
                    } else {
                        i13 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i13;
                }
                i14 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i14 != 0) {
                    i15 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i15 = i3 | i16;
                } else {
                    i15 = i3;
                }
                i17 = i4 & 2048;
                if (i17 != 0) {
                    i15 |= 48;
                } else if ((i3 & 112) == 0) {
                    i15 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
                }
                i18 = i15;
                if ((i4 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i3 & 896) == 0) {
                    if (!composerStartRestartGroup.changedInstance(content)) {
                        i22 = 128;
                    }
                    i18 |= i22;
                }
                if ((1533916891 & i5) != 306783378 && (i18 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    i20 = i;
                    horizontal5 = horizontal;
                    vertical5 = vertical;
                    vertical4 = vertical2;
                    horizontal6 = horizontal2;
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i8 != 0) {
                        i19 = 0;
                    } else {
                        i19 = i;
                    }
                    if (i10 != 0) {
                        horizontal3 = null;
                    } else {
                        horizontal3 = horizontal;
                    }
                    if (i12 != 0) {
                        vertical3 = null;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i14 != 0) {
                        vertical4 = null;
                    } else {
                        vertical4 = vertical2;
                    }
                    if (i17 != 0) {
                        horizontal4 = null;
                    } else {
                        horizontal4 = horizontal2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                    }
                    int i23 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i23);
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i23 | ((i5 >> 9) & 112));
                    int i24 = i5 & 112;
                    int i25 = i5 & 7168;
                    int i26 = i5 >> 6;
                    int i27 = i18 << 21;
                    int i28 = i5;
                    Arrangement.Vertical vertical6 = vertical3;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i24 | i25 | (i5 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i27 & 29360128) | (i27 & 234881024) | (1879048192 & i5), 0);
                    composer2 = composerStartRestartGroup;
                    ScrollPositionUpdater(function0RememberLazyListItemProviderLambda, state, composer2, i24);
                    ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                    OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer2, 6);
                    if (z2) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation2 = orientation;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState, orientation2, z3, z, composer2, (i26 & 57344) | ((i28 << 6) & 458752)), orientation2), state, i19, z, orientation2, composer2, ((i28 >> 15) & 896) | i24 | i25), overscrollEffect), state, orientation2, overscrollEffect, z3, scrollableDefaults.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical5 = vertical6;
                    i20 = i19;
                    horizontal5 = horizontal3;
                    horizontal6 = horizontal4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Alignment.Vertical vertical7 = vertical4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                    public final void invoke(@Nullable Composer composer3, int i29) {
                        LazyListKt.LazyList(modifier, state, contentPadding, z, z2, flingBehavior, z3, i20, horizontal5, vertical5, vertical7, horizontal6, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
            i5 |= 1572864;
            i8 = i4 & 128;
            if (i8 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i5 |= i9;
            }
            i10 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i12 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i12 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i13 = 536870912;
                } else {
                    i13 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i13;
            }
            i14 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i14 != 0) {
                i15 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i3 | i16;
            } else {
                i15 = i3;
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
                i15 |= 48;
            } else if ((i3 & 112) == 0) {
                i15 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
            }
            i18 = i15;
            if ((i4 & 4096) != 0) {
                i18 |= 384;
            } else if ((i3 & 896) == 0) {
                if (!composerStartRestartGroup.changedInstance(content)) {
                    i22 = 128;
                }
                i18 |= i22;
            }
            if ((1533916891 & i5) != 306783378) {
                if (i8 != 0) {
                    i19 = 0;
                } else {
                    i19 = i;
                }
                if (i10 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i12 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i14 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i17 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i29 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i29);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i29 | ((i5 >> 9) & 112));
                int i210 = i5 & 112;
                int i211 = i5 & 7168;
                int i212 = i5 >> 6;
                int i213 = i18 << 21;
                int i214 = i5;
                Arrangement.Vertical vertical8 = vertical3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda2, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i210 | i211 | (i5 & 57344) | (i212 & 458752) | (i212 & 3670016) | (i213 & 29360128) | (i213 & 234881024) | (1879048192 & i5), 0);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyListItemProviderLambda2, state, composer2, i210);
                ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect2 = scrollableDefaults2.overscrollEffect(composer2, 6);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation3 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda2, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda2, lazyLayoutSemanticStateRememberLazyListSemanticState2, orientation3, z3, z, composer2, (i212 & 57344) | ((i214 << 6) & 458752)), orientation3), state, i19, z, orientation3, composer2, ((i214 >> 15) & 896) | i210 | i211), overscrollEffect2), state, orientation3, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation3, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy2, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical5 = vertical8;
                i20 = i19;
                horizontal5 = horizontal3;
                horizontal6 = horizontal4;
            } else {
                if (i8 != 0) {
                    i19 = 0;
                } else {
                    i19 = i;
                }
                if (i10 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i12 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i14 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i17 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i215 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda3 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i215);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState3 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i215 | ((i5 >> 9) & 112));
                int i216 = i5 & 112;
                int i217 = i5 & 7168;
                int i218 = i5 >> 6;
                int i219 = i18 << 21;
                int i2110 = i5;
                Arrangement.Vertical vertical9 = vertical3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy3 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda3, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i216 | i217 | (i5 & 57344) | (i218 & 458752) | (i218 & 3670016) | (i219 & 29360128) | (i219 & 234881024) | (1879048192 & i5), 0);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyListItemProviderLambda3, state, composer2, i216);
                ScrollableDefaults scrollableDefaults3 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect3 = scrollableDefaults3.overscrollEffect(composer2, 6);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation4 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda3, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda3, lazyLayoutSemanticStateRememberLazyListSemanticState3, orientation4, z3, z, composer2, (i218 & 57344) | ((i2110 << 6) & 458752)), orientation4), state, i19, z, orientation4, composer2, ((i2110 >> 15) & 896) | i216 | i217), overscrollEffect3), state, orientation4, overscrollEffect3, z3, scrollableDefaults3.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation4, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy3, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical5 = vertical9;
                i20 = i19;
                horizontal5 = horizontal3;
                horizontal6 = horizontal4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Alignment.Vertical vertical10 = vertical4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                public final void invoke(@Nullable Composer composer3, int i220) {
                    LazyListKt.LazyList(modifier, state, contentPadding, z, z2, flingBehavior, z3, i20, horizontal5, vertical5, vertical10, horizontal6, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
        i6 = 196608;
        i5 |= i6;
        if ((i4 & 64) != 0) {
            if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            i8 = i4 & 128;
            if (i8 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i5 |= i9;
            }
            i10 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i5 |= i11;
            }
            i12 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i12 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(vertical)) {
                    i13 = 536870912;
                } else {
                    i13 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i13;
            }
            i14 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i14 != 0) {
                i15 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i15 = i3 | i16;
            } else {
                i15 = i3;
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
                i15 |= 48;
            } else if ((i3 & 112) == 0) {
                i15 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
            }
            i18 = i15;
            if ((i4 & 4096) != 0) {
                i18 |= 384;
            } else if ((i3 & 896) == 0) {
                if (!composerStartRestartGroup.changedInstance(content)) {
                    i22 = 128;
                }
                i18 |= i22;
            }
            if ((1533916891 & i5) != 306783378) {
                if (i8 != 0) {
                    i19 = 0;
                } else {
                    i19 = i;
                }
                if (i10 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i12 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i14 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i17 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i2111 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda4 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i2111);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState4 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i2111 | ((i5 >> 9) & 112));
                int i2112 = i5 & 112;
                int i2113 = i5 & 7168;
                int i2114 = i5 >> 6;
                int i2115 = i18 << 21;
                int i2116 = i5;
                Arrangement.Vertical vertical11 = vertical3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy4 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda4, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i2112 | i2113 | (i5 & 57344) | (i2114 & 458752) | (i2114 & 3670016) | (i2115 & 29360128) | (i2115 & 234881024) | (1879048192 & i5), 0);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyListItemProviderLambda4, state, composer2, i2112);
                ScrollableDefaults scrollableDefaults4 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect4 = scrollableDefaults4.overscrollEffect(composer2, 6);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation5 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda4, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda4, lazyLayoutSemanticStateRememberLazyListSemanticState4, orientation5, z3, z, composer2, (i2114 & 57344) | ((i2116 << 6) & 458752)), orientation5), state, i19, z, orientation5, composer2, ((i2116 >> 15) & 896) | i2112 | i2113), overscrollEffect4), state, orientation5, overscrollEffect4, z3, scrollableDefaults4.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation5, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy4, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical5 = vertical11;
                i20 = i19;
                horizontal5 = horizontal3;
                horizontal6 = horizontal4;
            } else {
                if (i8 != 0) {
                    i19 = 0;
                } else {
                    i19 = i;
                }
                if (i10 != 0) {
                    horizontal3 = null;
                } else {
                    horizontal3 = horizontal;
                }
                if (i12 != 0) {
                    vertical3 = null;
                } else {
                    vertical3 = vertical;
                }
                if (i14 != 0) {
                    vertical4 = null;
                } else {
                    vertical4 = vertical2;
                }
                if (i17 != 0) {
                    horizontal4 = null;
                } else {
                    horizontal4 = horizontal2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                int i2117 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda5 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i2117);
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState5 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i2117 | ((i5 >> 9) & 112));
                int i2118 = i5 & 112;
                int i2119 = i5 & 7168;
                int i21110 = i5 >> 6;
                int i21111 = i18 << 21;
                int i21112 = i5;
                Arrangement.Vertical vertical12 = vertical3;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy5 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda5, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i2118 | i2119 | (i5 & 57344) | (i21110 & 458752) | (i21110 & 3670016) | (i21111 & 29360128) | (i21111 & 234881024) | (1879048192 & i5), 0);
                composer2 = composerStartRestartGroup;
                ScrollPositionUpdater(function0RememberLazyListItemProviderLambda5, state, composer2, i2118);
                ScrollableDefaults scrollableDefaults5 = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect5 = scrollableDefaults5.overscrollEffect(composer2, 6);
                if (z2) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation6 = orientation;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda5, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda5, lazyLayoutSemanticStateRememberLazyListSemanticState5, orientation6, z3, z, composer2, (i21110 & 57344) | ((i21112 << 6) & 458752)), orientation6), state, i19, z, orientation6, composer2, ((i21112 >> 15) & 896) | i2118 | i2119), overscrollEffect5), state, orientation6, overscrollEffect5, z3, scrollableDefaults5.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation6, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy5, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical5 = vertical12;
                i20 = i19;
                horizontal5 = horizontal3;
                horizontal6 = horizontal4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Alignment.Vertical vertical13 = vertical4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                public final void invoke(@Nullable Composer composer3, int i220) {
                    LazyListKt.LazyList(modifier, state, contentPadding, z, z2, flingBehavior, z3, i20, horizontal5, vertical5, vertical13, horizontal6, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
        i5 |= 1572864;
        i8 = i4 & 128;
        if (i8 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i9 = 8388608;
            } else {
                i9 = Configuration.BLOCK_SIZE;
            }
            i5 |= i9;
        }
        i10 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i10 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        i12 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i12 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(vertical)) {
                i13 = 536870912;
            } else {
                i13 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i5 |= i13;
        }
        i14 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i14 != 0) {
            i15 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (composerStartRestartGroup.changed(vertical2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i3 | i16;
        } else {
            i15 = i3;
        }
        i17 = i4 & 2048;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i3 & 112) == 0) {
            i15 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
        }
        i18 = i15;
        if ((i4 & 4096) != 0) {
            i18 |= 384;
        } else if ((i3 & 896) == 0) {
            if (!composerStartRestartGroup.changedInstance(content)) {
                i22 = 128;
            }
            i18 |= i22;
        }
        if ((1533916891 & i5) != 306783378) {
            if (i8 != 0) {
                i19 = 0;
            } else {
                i19 = i;
            }
            if (i10 != 0) {
                horizontal3 = null;
            } else {
                horizontal3 = horizontal;
            }
            if (i12 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i14 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i17 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
            }
            int i21113 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda6 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i21113);
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState6 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i21113 | ((i5 >> 9) & 112));
            int i21114 = i5 & 112;
            int i21115 = i5 & 7168;
            int i21116 = i5 >> 6;
            int i21117 = i18 << 21;
            int i21118 = i5;
            Arrangement.Vertical vertical14 = vertical3;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy6 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda6, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i21114 | i21115 | (i5 & 57344) | (i21116 & 458752) | (i21116 & 3670016) | (i21117 & 29360128) | (i21117 & 234881024) | (1879048192 & i5), 0);
            composer2 = composerStartRestartGroup;
            ScrollPositionUpdater(function0RememberLazyListItemProviderLambda6, state, composer2, i21114);
            ScrollableDefaults scrollableDefaults6 = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect6 = scrollableDefaults6.overscrollEffect(composer2, 6);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation7 = orientation;
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda6, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda6, lazyLayoutSemanticStateRememberLazyListSemanticState6, orientation7, z3, z, composer2, (i21116 & 57344) | ((i21118 << 6) & 458752)), orientation7), state, i19, z, orientation7, composer2, ((i21118 >> 15) & 896) | i21114 | i21115), overscrollEffect6), state, orientation7, overscrollEffect6, z3, scrollableDefaults6.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation7, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy6, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            vertical5 = vertical14;
            i20 = i19;
            horizontal5 = horizontal3;
            horizontal6 = horizontal4;
        } else {
            if (i8 != 0) {
                i19 = 0;
            } else {
                i19 = i;
            }
            if (i10 != 0) {
                horizontal3 = null;
            } else {
                horizontal3 = horizontal;
            }
            if (i12 != 0) {
                vertical3 = null;
            } else {
                vertical3 = vertical;
            }
            if (i14 != 0) {
                vertical4 = null;
            } else {
                vertical4 = vertical2;
            }
            if (i17 != 0) {
                horizontal4 = null;
            } else {
                horizontal4 = horizontal2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620764179, i5, i18, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
            }
            int i21119 = (i5 >> 3) & 14;
            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda7 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, content, composerStartRestartGroup, ((i18 >> 3) & 112) | i21119);
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState7 = LazyListSemanticsKt.rememberLazyListSemanticState(state, z2, composerStartRestartGroup, i21119 | ((i5 >> 9) & 112));
            int i211110 = i5 & 112;
            int i211111 = i5 & 7168;
            int i211112 = i5 >> 6;
            int i211113 = i18 << 21;
            int i211114 = i5;
            Arrangement.Vertical vertical15 = vertical3;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy7 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda7, state, contentPadding, z, z2, i19, horizontal3, vertical4, horizontal4, vertical3, composerStartRestartGroup, (i5 & 896) | i211110 | i211111 | (i5 & 57344) | (i211112 & 458752) | (i211112 & 3670016) | (i211113 & 29360128) | (i211113 & 234881024) | (1879048192 & i5), 0);
            composer2 = composerStartRestartGroup;
            ScrollPositionUpdater(function0RememberLazyListItemProviderLambda7, state, composer2, i211110);
            ScrollableDefaults scrollableDefaults7 = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect7 = scrollableDefaults7.overscrollEffect(composer2, 6);
            if (z2) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation8 = orientation;
            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda7, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda7, lazyLayoutSemanticStateRememberLazyListSemanticState7, orientation8, z3, z, composer2, (i211112 & 57344) | ((i211114 << 6) & 458752)), orientation8), state, i19, z, orientation8, composer2, ((i211114 >> 15) & 896) | i211110 | i211111), overscrollEffect7), state, orientation8, overscrollEffect7, z3, scrollableDefaults7.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation8, z), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), function2RememberLazyListMeasurePolicy7, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            vertical5 = vertical15;
            i20 = i19;
            horizontal5 = horizontal3;
            horizontal6 = horizontal4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Alignment.Vertical vertical16 = vertical4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

            public final void invoke(@Nullable Composer composer3, int i220) {
                LazyListKt.LazyList(modifier, state, contentPadding, z, z2, flingBehavior, z3, i20, horizontal5, vertical5, vertical16, horizontal6, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalFoundationApi
    public static final void ScrollPositionUpdater(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-331135862);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-331135862, i, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:140)");
            }
            LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
            if (lazyListItemProviderInvoke.getItemCount() > 0) {
                LazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyListState, lazyListItemProviderInvoke, 0, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.ScrollPositionUpdater.1
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
                LazyListKt.ScrollPositionUpdater(function0, lazyListState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @Composable
    @ExperimentalFoundationApi
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(183156450);
        final Alignment.Horizontal horizontal3 = (i3 & 64) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i3 & 128) != 0 ? null : vertical;
        final Arrangement.Horizontal horizontal4 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : horizontal2;
        final Arrangement.Vertical vertical4 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : vertical2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183156450, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i4 = 0; i4 < 8; i4++) {
            zChanged |= composer.changed(objArr[i4]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m581invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m581invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i5;
                    float spacing;
                    long jIntOffset;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m199checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    int iMo320roundToPx0680j_4 = z2 ? lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.mo429calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo320roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo320roundToPx0680j_5 = z2 ? lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.mo430calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo320roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iMo320roundToPx0680j_6 = lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.getTop());
                    int iMo320roundToPx0680j_7 = lazyLayoutMeasureScope.mo320roundToPx0680j_4(paddingValues.getBottom());
                    final int i6 = iMo320roundToPx0680j_6 + iMo320roundToPx0680j_7;
                    final int i7 = iMo320roundToPx0680j_4 + iMo320roundToPx0680j_5;
                    boolean z3 = z2;
                    int i8 = z3 ? i6 : i7;
                    if (z3 && !z) {
                        i5 = iMo320roundToPx0680j_6;
                    } else if (z3 && z) {
                        i5 = iMo320roundToPx0680j_7;
                    } else {
                        i5 = (z3 || z) ? iMo320roundToPx0680j_5 : iMo320roundToPx0680j_4;
                    }
                    final int i9 = i8 - i5;
                    final long jM3759offsetNN6EwU = ConstraintsKt.m3759offsetNN6EwU(j, -i7, -i6);
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    final LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                    lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m3743getMaxWidthimpl(jM3759offsetNN6EwU), Constraints.m3742getMaxHeightimpl(jM3759offsetNN6EwU));
                    if (z2) {
                        Arrangement.Vertical vertical5 = vertical4;
                        if (vertical5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical5.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal5 = horizontal4;
                        if (horizontal5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal5.getSpacing();
                    }
                    final int iMo320roundToPx0680j_8 = lazyLayoutMeasureScope.mo320roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProviderInvoke.getItemCount();
                    int iM3742getMaxHeightimpl = z2 ? Constraints.m3742getMaxHeightimpl(j) - i6 : Constraints.m3743getMaxWidthimpl(j) - i7;
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
                    final Alignment.Horizontal horizontal6 = horizontal3;
                    final Alignment.Vertical vertical6 = vertical3;
                    final boolean z6 = z;
                    final int i10 = i5;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM3759offsetNN6EwU, z5, lazyListItemProviderInvoke, lazyLayoutMeasureScope, itemCount, iMo320roundToPx0680j_8, horizontal6, vertical6, z6, i10, i9, j2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$isVertical = z5;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = iMo320roundToPx0680j_8;
                            this.$horizontalAlignment = horizontal6;
                            this.$verticalAlignment = vertical6;
                            this.$reverseLayout = z6;
                            this.$beforeContentPadding = i10;
                            this.$afterContentPadding = i9;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        @NotNull
                        public LazyListMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, @NotNull List<? extends Placeable> placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, null);
                        }
                    };
                    lazyListState.m589setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState2.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState2.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                            Unit unit = Unit.INSTANCE;
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyListMeasureResult lazyListMeasureResultM583measureLazyListCD5nmq0 = LazyListMeasureKt.m583measureLazyListCD5nmq0(itemCount, lazyListMeasuredItemProvider, iM3742getMaxHeightimpl, i5, i9, iMo320roundToPx0680j_8, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), jM3759offsetNN6EwU, z2, lazyListItemProviderInvoke.getHeaderIndexes(), vertical4, horizontal4, z, lazyLayoutMeasureScope, lazyListState.getPlacementAnimator(), i, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo()), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i11, int i12, @NotNull Function1<? super Placeable.PlacementScope, Unit> placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m3757constrainWidthK40F9xA(j, i11 + i7), ConstraintsKt.m3756constrainHeightK40F9xA(j, i12 + i6), MapsKt.emptyMap(), placement);
                                }
                            });
                            lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResultM583measureLazyListCD5nmq0);
                            return lazyListMeasureResultM583measureLazyListCD5nmq0;
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
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }
}
