package androidx.compose.material;

import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001a\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a-\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00172\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\rH\u0007¢\u0006\u0002\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"DISMISS_THRESHOLD", "Landroidx/compose/ui/unit/Dp;", "F", "SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "background", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,243:1\n50#2:244\n49#2:245\n1097#3,6:246\n154#4:252\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n153#1:244\n153#1:245\n153#1:246,6\n243#1:252\n*E\n"})
public final class SwipeToDismissKt {
    private static final float DISMISS_THRESHOLD = Dp.m3775constructorimpl(56);

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SwipeToDismiss(@NotNull final DismissState state, @Nullable Modifier modifier, @Nullable Set<? extends DismissDirection> set, @Nullable Function1<? super DismissDirection, ? extends ThresholdConfig> function1, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> background, @NotNull final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> dismissContent, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function2;
        int i6;
        int i7;
        int i8;
        final int i9;
        Modifier modifier3;
        Set<? extends DismissDirection> of;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function3;
        final Modifier modifier4;
        final Set<? extends DismissDirection> set2;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(634380143);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 7168) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(background)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(dismissContent)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    i9 = i3;
                    if (i4 != 4 && (374491 & i9) == 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        set2 = set;
                        modifier4 = modifier2;
                        function4 = function2;
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                        } else {
                            of = set;
                        }
                        if (i5 != 0) {
                            function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                                }
                            };
                        } else {
                            function3 = function2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                        }
                        final Set<? extends DismissDirection> set3 = of;
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function5 = function3;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                                int i12;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i11 & 14) == 0) {
                                    i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                                } else {
                                    i12 = i11;
                                }
                                if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                                }
                                float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                                boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                Float fValueOf = Float.valueOf(0.0f);
                                DismissValue dismissValue = DismissValue.Default;
                                Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                                Set<DismissDirection> set4 = set3;
                                DismissDirection dismissDirection = DismissDirection.StartToEnd;
                                if (set4.contains(dismissDirection)) {
                                    Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                    mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                                }
                                Set<DismissDirection> set5 = set3;
                                DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                                if (set5.contains(dismissDirection2)) {
                                    Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                    mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                }
                                final Function1<DismissDirection, ThresholdConfig> function6 = function5;
                                composer2.startReplaceableGroup(1157296644);
                                boolean zChanged = composer2.changed(function6);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @NotNull
                                        public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                            Intrinsics.checkNotNullParameter(from, "from");
                                            Intrinsics.checkNotNullParameter(to, "to");
                                            Function1<DismissDirection, ThresholdConfig> function7 = function6;
                                            DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                            Intrinsics.checkNotNull(dismissDirection3);
                                            return function7.invoke(dismissDirection3);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                Function2 function7 = (Function2) objRememberedValue;
                                float f = set3.contains(dismissDirection2) ? 10.0f : 20.0f;
                                float f2 = set3.contains(dismissDirection) ? 10.0f : 20.0f;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(Object obj, Object obj2) {
                                        return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                    }
                                } : function7, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                                Function3<RowScope, Composer, Integer, Unit> function8 = background;
                                int i13 = i9;
                                final DismissState dismissState = state;
                                Function3<RowScope, Composer, Integer, Unit> function9 = dismissContent;
                                composer2.startReplaceableGroup(733328855);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                                int i14 = (i13 >> 3) & 7168;
                                composer2.startReplaceableGroup(693286680);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                int i15 = i14 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                                int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                function8.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(1157296644);
                                boolean zChanged2 = composer2.changed(dismissState);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                            return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                        }

                                        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                                int i17 = (i13 >> 6) & 7168;
                                composer2.startReplaceableGroup(693286680);
                                int i18 = i17 >> 3;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                                int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                                }
                                androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                function9.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        set2 = of;
                        function4 = function3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                            SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i8 = 196608;
                i3 |= i8;
                i9 = i3;
                if (i4 != 4) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of = set;
                    }
                    if (i5 != 0) {
                        function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    final Set<? extends DismissDirection> set4 = of;
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function6 = function3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                            }
                            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Float fValueOf = Float.valueOf(0.0f);
                            DismissValue dismissValue = DismissValue.Default;
                            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                            Set<DismissDirection> set5 = set4;
                            DismissDirection dismissDirection = DismissDirection.StartToEnd;
                            if (set5.contains(dismissDirection)) {
                                Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                            }
                            Set<DismissDirection> set6 = set4;
                            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                            if (set6.contains(dismissDirection2)) {
                                Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                            }
                            final Function1<? super DismissDirection, ? extends ThresholdConfig> function7 = function6;
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged = composer2.changed(function7);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                        Intrinsics.checkNotNullParameter(from, "from");
                                        Intrinsics.checkNotNullParameter(to, "to");
                                        Function1<DismissDirection, ThresholdConfig> function8 = function7;
                                        DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                        Intrinsics.checkNotNull(dismissDirection3);
                                        return function8.invoke(dismissDirection3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function2 function8 = (Function2) objRememberedValue;
                            float f = set4.contains(dismissDirection2) ? 10.0f : 20.0f;
                            float f2 = set4.contains(dismissDirection) ? 10.0f : 20.0f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                }
                            } : function8, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                            Function3<RowScope, Composer, Integer, Unit> function9 = background;
                            int i13 = i9;
                            final DismissState dismissState = state;
                            Function3<RowScope, Composer, Integer, Unit> function10 = dismissContent;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                            int i14 = (i13 >> 3) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i15 = i14 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function9.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer2.changed(dismissState);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                            int i17 = (i13 >> 6) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function10.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of;
                    function4 = function3;
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of = set;
                    }
                    if (i5 != 0) {
                        function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    final Set<? extends DismissDirection> set5 = of;
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function7 = function3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                            }
                            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Float fValueOf = Float.valueOf(0.0f);
                            DismissValue dismissValue = DismissValue.Default;
                            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                            Set<DismissDirection> set6 = set5;
                            DismissDirection dismissDirection = DismissDirection.StartToEnd;
                            if (set6.contains(dismissDirection)) {
                                Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                            }
                            Set<DismissDirection> set7 = set5;
                            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                            if (set7.contains(dismissDirection2)) {
                                Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                            }
                            final Function1<? super DismissDirection, ? extends ThresholdConfig> function8 = function7;
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged = composer2.changed(function8);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                        Intrinsics.checkNotNullParameter(from, "from");
                                        Intrinsics.checkNotNullParameter(to, "to");
                                        Function1<DismissDirection, ThresholdConfig> function9 = function8;
                                        DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                        Intrinsics.checkNotNull(dismissDirection3);
                                        return function9.invoke(dismissDirection3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function2 function9 = (Function2) objRememberedValue;
                            float f = set5.contains(dismissDirection2) ? 10.0f : 20.0f;
                            float f2 = set5.contains(dismissDirection) ? 10.0f : 20.0f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                }
                            } : function9, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                            Function3<RowScope, Composer, Integer, Unit> function10 = background;
                            int i13 = i9;
                            final DismissState dismissState = state;
                            Function3<RowScope, Composer, Integer, Unit> function11 = dismissContent;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                            int i14 = (i13 >> 3) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i15 = i14 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function10.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer2.changed(dismissState);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                            int i17 = (i13 >> 6) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function11.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                        SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function2 = function1;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(background)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(dismissContent)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                i9 = i3;
                if (i4 != 4) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of = set;
                    }
                    if (i5 != 0) {
                        function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    final Set<? extends DismissDirection> set6 = of;
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function8 = function3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                            }
                            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Float fValueOf = Float.valueOf(0.0f);
                            DismissValue dismissValue = DismissValue.Default;
                            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                            Set<DismissDirection> set7 = set6;
                            DismissDirection dismissDirection = DismissDirection.StartToEnd;
                            if (set7.contains(dismissDirection)) {
                                Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                            }
                            Set<DismissDirection> set8 = set6;
                            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                            if (set8.contains(dismissDirection2)) {
                                Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                            }
                            final Function1<? super DismissDirection, ? extends ThresholdConfig> function9 = function8;
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged = composer2.changed(function9);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                        Intrinsics.checkNotNullParameter(from, "from");
                                        Intrinsics.checkNotNullParameter(to, "to");
                                        Function1<DismissDirection, ThresholdConfig> function10 = function9;
                                        DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                        Intrinsics.checkNotNull(dismissDirection3);
                                        return function10.invoke(dismissDirection3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function2 function10 = (Function2) objRememberedValue;
                            float f = set6.contains(dismissDirection2) ? 10.0f : 20.0f;
                            float f2 = set6.contains(dismissDirection) ? 10.0f : 20.0f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                }
                            } : function10, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                            Function3<RowScope, Composer, Integer, Unit> function11 = background;
                            int i13 = i9;
                            final DismissState dismissState = state;
                            Function3<RowScope, Composer, Integer, Unit> function12 = dismissContent;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                            int i14 = (i13 >> 3) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i15 = i14 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function11.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer2.changed(dismissState);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                            int i17 = (i13 >> 6) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function12.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of;
                    function4 = function3;
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of = set;
                    }
                    if (i5 != 0) {
                        function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    final Set<? extends DismissDirection> set7 = of;
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function9 = function3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                            }
                            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Float fValueOf = Float.valueOf(0.0f);
                            DismissValue dismissValue = DismissValue.Default;
                            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                            Set<DismissDirection> set8 = set7;
                            DismissDirection dismissDirection = DismissDirection.StartToEnd;
                            if (set8.contains(dismissDirection)) {
                                Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                            }
                            Set<DismissDirection> set9 = set7;
                            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                            if (set9.contains(dismissDirection2)) {
                                Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                            }
                            final Function1<? super DismissDirection, ? extends ThresholdConfig> function10 = function9;
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged = composer2.changed(function10);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                        Intrinsics.checkNotNullParameter(from, "from");
                                        Intrinsics.checkNotNullParameter(to, "to");
                                        Function1<DismissDirection, ThresholdConfig> function11 = function10;
                                        DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                        Intrinsics.checkNotNull(dismissDirection3);
                                        return function11.invoke(dismissDirection3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function2 function11 = (Function2) objRememberedValue;
                            float f = set7.contains(dismissDirection2) ? 10.0f : 20.0f;
                            float f2 = set7.contains(dismissDirection) ? 10.0f : 20.0f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                }
                            } : function11, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                            Function3<RowScope, Composer, Integer, Unit> function12 = background;
                            int i13 = i9;
                            final DismissState dismissState = state;
                            Function3<RowScope, Composer, Integer, Unit> function13 = dismissContent;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                            int i14 = (i13 >> 3) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i15 = i14 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function12.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer2.changed(dismissState);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                            int i17 = (i13 >> 6) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function13.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                        SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 196608;
            i3 |= i8;
            i9 = i3;
            if (i4 != 4) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of = set;
                }
                if (i5 != 0) {
                    function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FixedThreshold invoke(@NotNull DismissDirection it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                        }
                    };
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                final Set<? extends DismissDirection> set8 = of;
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function10 = function3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                        int i12;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i11 & 14) == 0) {
                            i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i12 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                        }
                        float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set9 = set8;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set9.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set10 = set8;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set10.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function11 = function10;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(function11);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    Intrinsics.checkNotNullParameter(to, "to");
                                    Function1<DismissDirection, ThresholdConfig> function12 = function11;
                                    DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                    Intrinsics.checkNotNull(dismissDirection3);
                                    return function12.invoke(dismissDirection3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function12 = (Function2) objRememberedValue;
                        float f = set8.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set8.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                            }
                        } : function12, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function13 = background;
                        int i13 = i9;
                        final DismissState dismissState = state;
                        Function3<RowScope, Composer, Integer, Unit> function14 = dismissContent;
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                        int i14 = (i13 >> 3) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i15 = i14 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function13.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer2.changed(dismissState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i17 = (i13 >> 6) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function14.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of;
                function4 = function3;
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of = set;
                }
                if (i5 != 0) {
                    function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FixedThreshold invoke(@NotNull DismissDirection it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                        }
                    };
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                final Set<? extends DismissDirection> set9 = of;
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function11 = function3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                        int i12;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i11 & 14) == 0) {
                            i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i12 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                        }
                        float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set10 = set9;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set10.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set11 = set9;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set11.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function12 = function11;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(function12);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    Intrinsics.checkNotNullParameter(to, "to");
                                    Function1<DismissDirection, ThresholdConfig> function13 = function12;
                                    DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                    Intrinsics.checkNotNull(dismissDirection3);
                                    return function13.invoke(dismissDirection3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function13 = (Function2) objRememberedValue;
                        float f = set9.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set9.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                            }
                        } : function13, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function14 = background;
                        int i13 = i9;
                        final DismissState dismissState = state;
                        Function3<RowScope, Composer, Integer, Unit> function15 = dismissContent;
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                        int i14 = (i13 >> 3) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i15 = i14 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function14.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer2.changed(dismissState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i17 = (i13 >> 6) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function15.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                    SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 7168) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(background)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(dismissContent)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                i9 = i3;
                if (i4 != 4) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of = set;
                    }
                    if (i5 != 0) {
                        function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    final Set<? extends DismissDirection> set10 = of;
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function12 = function3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                            }
                            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Float fValueOf = Float.valueOf(0.0f);
                            DismissValue dismissValue = DismissValue.Default;
                            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                            Set<DismissDirection> set11 = set10;
                            DismissDirection dismissDirection = DismissDirection.StartToEnd;
                            if (set11.contains(dismissDirection)) {
                                Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                            }
                            Set<DismissDirection> set12 = set10;
                            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                            if (set12.contains(dismissDirection2)) {
                                Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                            }
                            final Function1<? super DismissDirection, ? extends ThresholdConfig> function13 = function12;
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged = composer2.changed(function13);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                        Intrinsics.checkNotNullParameter(from, "from");
                                        Intrinsics.checkNotNullParameter(to, "to");
                                        Function1<DismissDirection, ThresholdConfig> function14 = function13;
                                        DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                        Intrinsics.checkNotNull(dismissDirection3);
                                        return function14.invoke(dismissDirection3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function2 function14 = (Function2) objRememberedValue;
                            float f = set10.contains(dismissDirection2) ? 10.0f : 20.0f;
                            float f2 = set10.contains(dismissDirection) ? 10.0f : 20.0f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                }
                            } : function14, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                            Function3<RowScope, Composer, Integer, Unit> function15 = background;
                            int i13 = i9;
                            final DismissState dismissState = state;
                            Function3<RowScope, Composer, Integer, Unit> function16 = dismissContent;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                            int i14 = (i13 >> 3) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i15 = i14 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function15.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer2.changed(dismissState);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                            int i17 = (i13 >> 6) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function16.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of;
                    function4 = function3;
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                    } else {
                        of = set;
                    }
                    if (i5 != 0) {
                        function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final FixedThreshold invoke(@NotNull DismissDirection it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                            }
                        };
                    } else {
                        function3 = function2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                    }
                    final Set<? extends DismissDirection> set11 = of;
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function13 = function3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                            }
                            float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                            boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Float fValueOf = Float.valueOf(0.0f);
                            DismissValue dismissValue = DismissValue.Default;
                            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                            Set<DismissDirection> set12 = set11;
                            DismissDirection dismissDirection = DismissDirection.StartToEnd;
                            if (set12.contains(dismissDirection)) {
                                Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                                mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                            }
                            Set<DismissDirection> set13 = set11;
                            DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                            if (set13.contains(dismissDirection2)) {
                                Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                                mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                            }
                            final Function1<? super DismissDirection, ? extends ThresholdConfig> function14 = function13;
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged = composer2.changed(function14);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                        Intrinsics.checkNotNullParameter(from, "from");
                                        Intrinsics.checkNotNullParameter(to, "to");
                                        Function1<DismissDirection, ThresholdConfig> function15 = function14;
                                        DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                        Intrinsics.checkNotNull(dismissDirection3);
                                        return function15.invoke(dismissDirection3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            Function2 function15 = (Function2) objRememberedValue;
                            float f = set11.contains(dismissDirection2) ? 10.0f : 20.0f;
                            float f2 = set11.contains(dismissDirection) ? 10.0f : 20.0f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                                }
                            } : function15, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                            Function3<RowScope, Composer, Integer, Unit> function16 = background;
                            int i13 = i9;
                            final DismissState dismissState = state;
                            Function3<RowScope, Composer, Integer, Unit> function17 = dismissContent;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                            int i14 = (i13 >> 3) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            int i15 = i14 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            function16.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer2.changed(dismissState);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                    }

                                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                            int i17 = (i13 >> 6) & 7168;
                            composer2.startReplaceableGroup(693286680);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            function17.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    set2 = of;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                        SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i8 = 196608;
            i3 |= i8;
            i9 = i3;
            if (i4 != 4) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of = set;
                }
                if (i5 != 0) {
                    function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FixedThreshold invoke(@NotNull DismissDirection it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                        }
                    };
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                final Set<? extends DismissDirection> set12 = of;
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function14 = function3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                        int i12;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i11 & 14) == 0) {
                            i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i12 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                        }
                        float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set13 = set12;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set13.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set14 = set12;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set14.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function15 = function14;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(function15);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    Intrinsics.checkNotNullParameter(to, "to");
                                    Function1<DismissDirection, ThresholdConfig> function16 = function15;
                                    DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                    Intrinsics.checkNotNull(dismissDirection3);
                                    return function16.invoke(dismissDirection3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function16 = (Function2) objRememberedValue;
                        float f = set12.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set12.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                            }
                        } : function16, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function17 = background;
                        int i13 = i9;
                        final DismissState dismissState = state;
                        Function3<RowScope, Composer, Integer, Unit> function18 = dismissContent;
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                        int i14 = (i13 >> 3) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i15 = i14 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function17.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer2.changed(dismissState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i17 = (i13 >> 6) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function18.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of;
                function4 = function3;
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of = set;
                }
                if (i5 != 0) {
                    function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FixedThreshold invoke(@NotNull DismissDirection it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                        }
                    };
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                final Set<? extends DismissDirection> set13 = of;
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function15 = function3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                        int i12;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i11 & 14) == 0) {
                            i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i12 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                        }
                        float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set14 = set13;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set14.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set15 = set13;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set15.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function16 = function15;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(function16);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    Intrinsics.checkNotNullParameter(to, "to");
                                    Function1<DismissDirection, ThresholdConfig> function17 = function16;
                                    DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                    Intrinsics.checkNotNull(dismissDirection3);
                                    return function17.invoke(dismissDirection3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function17 = (Function2) objRememberedValue;
                        float f = set13.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set13.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                            }
                        } : function17, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function18 = background;
                        int i13 = i9;
                        final DismissState dismissState = state;
                        Function3<RowScope, Composer, Integer, Unit> function19 = dismissContent;
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                        int i14 = (i13 >> 3) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i15 = i14 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function18.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer2.changed(dismissState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i17 = (i13 >> 6) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function19.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                    SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function2 = function1;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(background)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((i2 & 32) != 0) {
            if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(dismissContent)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
            }
            i9 = i3;
            if (i4 != 4) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of = set;
                }
                if (i5 != 0) {
                    function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FixedThreshold invoke(@NotNull DismissDirection it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                        }
                    };
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                final Set<? extends DismissDirection> set14 = of;
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function16 = function3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                        int i12;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i11 & 14) == 0) {
                            i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i12 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                        }
                        float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set15 = set14;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set15.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set16 = set14;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set16.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function17 = function16;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(function17);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    Intrinsics.checkNotNullParameter(to, "to");
                                    Function1<DismissDirection, ThresholdConfig> function18 = function17;
                                    DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                    Intrinsics.checkNotNull(dismissDirection3);
                                    return function18.invoke(dismissDirection3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function18 = (Function2) objRememberedValue;
                        float f = set14.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set14.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                            }
                        } : function18, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function19 = background;
                        int i13 = i9;
                        final DismissState dismissState = state;
                        Function3<RowScope, Composer, Integer, Unit> function110 = dismissContent;
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                        int i14 = (i13 >> 3) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i15 = i14 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function19.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer2.changed(dismissState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i17 = (i13 >> 6) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function110.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of;
                function4 = function3;
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                } else {
                    of = set;
                }
                if (i5 != 0) {
                    function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final FixedThreshold invoke(@NotNull DismissDirection it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                        }
                    };
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
                }
                final Set<? extends DismissDirection> set15 = of;
                final Function1<? super DismissDirection, ? extends ThresholdConfig> function17 = function3;
                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                        int i12;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i11 & 14) == 0) {
                            i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                        } else {
                            i12 = i11;
                        }
                        if ((i12 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                        }
                        float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Float fValueOf = Float.valueOf(0.0f);
                        DismissValue dismissValue = DismissValue.Default;
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                        Set<DismissDirection> set16 = set15;
                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                        if (set16.contains(dismissDirection)) {
                            Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                        }
                        Set<DismissDirection> set17 = set15;
                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                        if (set17.contains(dismissDirection2)) {
                            Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                        }
                        final Function1<? super DismissDirection, ? extends ThresholdConfig> function18 = function17;
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(function18);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                    Intrinsics.checkNotNullParameter(from, "from");
                                    Intrinsics.checkNotNullParameter(to, "to");
                                    Function1<DismissDirection, ThresholdConfig> function19 = function18;
                                    DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                    Intrinsics.checkNotNull(dismissDirection3);
                                    return function19.invoke(dismissDirection3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Function2 function19 = (Function2) objRememberedValue;
                        float f = set15.contains(dismissDirection2) ? 10.0f : 20.0f;
                        float f2 = set15.contains(dismissDirection) ? 10.0f : 20.0f;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                            }
                        } : function19, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                        Function3<RowScope, Composer, Integer, Unit> function110 = background;
                        int i13 = i9;
                        final DismissState dismissState = state;
                        Function3<RowScope, Composer, Integer, Unit> function111 = dismissContent;
                        composer2.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                        int i14 = (i13 >> 3) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        int i15 = i14 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                        int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function110.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer2.changed(dismissState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                    return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                                }

                                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                        int i17 = (i13 >> 6) & 7168;
                        composer2.startReplaceableGroup(693286680);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        function111.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                set2 = of;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                    SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i8 = 196608;
        i3 |= i8;
        i9 = i3;
        if (i4 != 4) {
            if (i10 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            } else {
                of = set;
            }
            if (i5 != 0) {
                function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final FixedThreshold invoke(@NotNull DismissDirection it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                    }
                };
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
            }
            final Set<? extends DismissDirection> set16 = of;
            final Function1<? super DismissDirection, ? extends ThresholdConfig> function18 = function3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i11 & 14) == 0) {
                        i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                    }
                    float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                    boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Float fValueOf = Float.valueOf(0.0f);
                    DismissValue dismissValue = DismissValue.Default;
                    Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                    Set<DismissDirection> set17 = set16;
                    DismissDirection dismissDirection = DismissDirection.StartToEnd;
                    if (set17.contains(dismissDirection)) {
                        Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                        mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                    }
                    Set<DismissDirection> set18 = set16;
                    DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                    if (set18.contains(dismissDirection2)) {
                        Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                        mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                    }
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function19 = function18;
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged = composer2.changed(function19);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                Intrinsics.checkNotNullParameter(from, "from");
                                Intrinsics.checkNotNullParameter(to, "to");
                                Function1<DismissDirection, ThresholdConfig> function110 = function19;
                                DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                Intrinsics.checkNotNull(dismissDirection3);
                                return function110.invoke(dismissDirection3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Function2 function110 = (Function2) objRememberedValue;
                    float f = set16.contains(dismissDirection2) ? 10.0f : 20.0f;
                    float f2 = set16.contains(dismissDirection) ? 10.0f : 20.0f;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                        }
                    } : function110, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                    Function3<RowScope, Composer, Integer, Unit> function111 = background;
                    int i13 = i9;
                    final DismissState dismissState = state;
                    Function3<RowScope, Composer, Integer, Unit> function112 = dismissContent;
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                    int i14 = (i13 >> 3) & 7168;
                    composer2.startReplaceableGroup(693286680);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    int i15 = i14 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                    int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                    if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    function111.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer2.changed(dismissState);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                    int i17 = (i13 >> 6) & 7168;
                    composer2.startReplaceableGroup(693286680);
                    int i18 = i17 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                    int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                    if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    function112.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            set2 = of;
            function4 = function3;
        } else {
            if (i10 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                of = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
            } else {
                of = set;
            }
            if (i5 != 0) {
                function3 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final FixedThreshold invoke(@NotNull DismissDirection it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return new FixedThreshold(SwipeToDismissKt.DISMISS_THRESHOLD, null);
                    }
                };
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634380143, i9, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:172)");
            }
            final Set<? extends DismissDirection> set17 = of;
            final Function1<? super DismissDirection, ? extends ThresholdConfig> function19 = function3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 338007641, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer2, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i11 & 14) == 0) {
                        i12 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(338007641, i11, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)");
                    }
                    float fM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(BoxWithConstraints.mo416getConstraintsmsEJaDk());
                    boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Float fValueOf = Float.valueOf(0.0f);
                    DismissValue dismissValue = DismissValue.Default;
                    Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                    Set<DismissDirection> set18 = set17;
                    DismissDirection dismissDirection = DismissDirection.StartToEnd;
                    if (set18.contains(dismissDirection)) {
                        Pair pair = TuplesKt.to(Float.valueOf(fM3743getMaxWidthimpl), DismissValue.DismissedToEnd);
                        mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                    }
                    Set<DismissDirection> set19 = set17;
                    DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                    if (set19.contains(dismissDirection2)) {
                        Pair pair2 = TuplesKt.to(Float.valueOf(-fM3743getMaxWidthimpl), DismissValue.DismissedToStart);
                        mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                    }
                    final Function1<? super DismissDirection, ? extends ThresholdConfig> function110 = function19;
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged = composer2.changed(function110);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                Intrinsics.checkNotNullParameter(from, "from");
                                Intrinsics.checkNotNullParameter(to, "to");
                                Function1<DismissDirection, ThresholdConfig> function111 = function110;
                                DismissDirection dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                Intrinsics.checkNotNull(dismissDirection3);
                                return function111.invoke(dismissDirection3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Function2 function111 = (Function2) objRememberedValue;
                    float f = set17.contains(dismissDirection2) ? 10.0f : 20.0f;
                    float f2 = set17.contains(dismissDirection) ? 10.0f : 20.0f;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1211swipeablepPrIpRY = SwipeableKt.m1211swipeablepPrIpRY(companion, state, mapMutableMapOf, Orientation.Horizontal, (440 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (440 & 16) != 0 ? false : z, (440 & 32) != 0 ? null : null, (440 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m3775constructorimpl(56), null);
                        }
                    } : function111, (440 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM3743getMaxWidthimpl, f, f2), (440 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? SwipeableDefaults.INSTANCE.m1210getVelocityThresholdD9Ej5fM() : 0.0f);
                    Function3<RowScope, Composer, Integer, Unit> function112 = background;
                    int i13 = i9;
                    final DismissState dismissState = state;
                    Function3<RowScope, Composer, Integer, Unit> function113 = dismissContent;
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1211swipeablepPrIpRY);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
                    int i14 = (i13 >> 3) & 7168;
                    composer2.startReplaceableGroup(693286680);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    int i15 = i14 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i15 & 14) | (i15 & 112));
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierMatchParentSize);
                    int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
                    if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    function112.invoke(rowScopeInstance, composer2, Integer.valueOf(((i14 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer2.changed(dismissState);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                return IntOffset.m3884boximpl(m1209invokeBjo55l4(density));
                            }

                            /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m1209invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(MathKt.roundToInt(dismissState.getOffset().getValue().floatValue()), 0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
                    int i17 = (i13 >> 6) & 7168;
                    composer2.startReplaceableGroup(693286680);
                    int i18 = i17 >> 3;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, (i18 & 112) | (i18 & 14));
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOffset);
                    int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                    Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1320constructorimpl3, currentCompositionLocalMap3);
                    if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    function113.invoke(rowScopeInstance, composer2, Integer.valueOf(((i17 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ((i9 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            set2 = of;
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt.SwipeToDismiss.3
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
                SwipeToDismissKt.SwipeToDismiss(state, modifier4, set2, function4, background, dismissContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final DismissState rememberDismissState(@Nullable final DismissValue dismissValue, @Nullable final Function1<? super DismissValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1753522702);
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<DismissValue, Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt.rememberDismissState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DismissValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753522702, i, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:148)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(dismissValue) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final DismissState invoke() {
                    return new DismissState(dismissValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DismissState dismissState = (DismissState) RememberSaveableKt.m1333rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dismissState;
    }
}
