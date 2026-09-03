package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001aM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"MaxItemsToRetainForReuse", "", "LazyLayout", "", "itemProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n36#2:139\n1097#3,6:140\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n*L\n48#1:139\n48#1:140,6\n*E\n"})
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void LazyLayout(@NotNull final LazyLayoutItemProvider itemProvider, @Nullable Modifier modifier, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(852831187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(itemProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(measurePolicy) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i3 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852831187, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:41)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(itemProvider);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final LazyLayoutItemProvider invoke() {
                        return itemProvider;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            LazyLayout((Function0<? extends LazyLayoutItemProvider>) objRememberedValue, modifier, lazyLayoutPrefetchState, measurePolicy, composerStartRestartGroup, (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.2
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

            public final void invoke(@Nullable Composer composer2, int i6) {
                LazyLayoutKt.LazyLayout(itemProvider, modifier2, lazyLayoutPrefetchState2, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(@NotNull final Function0<? extends LazyLayoutItemProvider> itemProvider, @Nullable Modifier modifier, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState, @NotNull final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> measurePolicy, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        int i5;
        int i6;
        final int i7;
        Modifier modifier2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState3;
        final Modifier modifier3;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer composerStartRestartGroup = composer.startRestartGroup(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(itemProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                    if (composerStartRestartGroup.changed(lazyLayoutPrefetchState2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) != 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    lazyLayoutPrefetchState4 = lazyLayoutPrefetchState2;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        lazyLayoutPrefetchState3 = null;
                    } else {
                        lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                    }
                    final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
                    final LazyLayoutPrefetchState lazyLayoutPrefetchState5 = lazyLayoutPrefetchState3;
                    final Modifier modifier4 = modifier2;
                    LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                            invoke(saveableStateHolder, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                            }
                            final State<Function0<LazyLayoutItemProvider>> state = stateRememberUpdatedState;
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LazyLayoutItemProvider invoke() {
                                        return state.getValue().invoke();
                                    }
                                });
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                            composer2.startReplaceableGroup(-492369756);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                            LazyLayoutPrefetchState lazyLayoutPrefetchState6 = lazyLayoutPrefetchState5;
                            composer2.startReplaceableGroup(-1523808190);
                            if (lazyLayoutPrefetchState6 != null) {
                                LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState5, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifier5 = modifier4;
                            final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = measurePolicy;
                            composer2.startReplaceableGroup(511388516);
                            boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    @NotNull
                                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                        return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier5, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.4
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

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        LazyLayoutKt.LazyLayout(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) != 1170) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                final State<? extends Function0<? extends LazyLayoutItemProvider>> stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
                final LazyLayoutPrefetchState lazyLayoutPrefetchState6 = lazyLayoutPrefetchState3;
                final Modifier modifier5 = modifier2;
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                        invoke(saveableStateHolder, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                        }
                        final State<? extends Function0<? extends LazyLayoutItemProvider>> state = stateRememberUpdatedState2;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LazyLayoutItemProvider invoke() {
                                    return state.getValue().invoke();
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                        LazyLayoutPrefetchState lazyLayoutPrefetchState7 = lazyLayoutPrefetchState6;
                        composer2.startReplaceableGroup(-1523808190);
                        if (lazyLayoutPrefetchState7 != null) {
                            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState6, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier6 = modifier5;
                        final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2 = measurePolicy;
                        composer2.startReplaceableGroup(511388516);
                        boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                    Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                    return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier6, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                final State<? extends Function0<? extends LazyLayoutItemProvider>> stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
                final LazyLayoutPrefetchState lazyLayoutPrefetchState7 = lazyLayoutPrefetchState3;
                final Modifier modifier6 = modifier2;
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                        invoke(saveableStateHolder, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                        }
                        final State<? extends Function0<? extends LazyLayoutItemProvider>> state = stateRememberUpdatedState3;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LazyLayoutItemProvider invoke() {
                                    return state.getValue().invoke();
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                        LazyLayoutPrefetchState lazyLayoutPrefetchState8 = lazyLayoutPrefetchState7;
                        composer2.startReplaceableGroup(-1523808190);
                        if (lazyLayoutPrefetchState8 != null) {
                            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState7, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier7 = modifier6;
                        final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2 = measurePolicy;
                        composer2.startReplaceableGroup(511388516);
                        boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                    Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                    return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier7, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.4
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    LazyLayoutKt.LazyLayout(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                if (composerStartRestartGroup.changed(lazyLayoutPrefetchState2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) != 1170) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                final State<? extends Function0<? extends LazyLayoutItemProvider>> stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
                final LazyLayoutPrefetchState lazyLayoutPrefetchState8 = lazyLayoutPrefetchState3;
                final Modifier modifier7 = modifier2;
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                        invoke(saveableStateHolder, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                        }
                        final State<? extends Function0<? extends LazyLayoutItemProvider>> state = stateRememberUpdatedState4;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LazyLayoutItemProvider invoke() {
                                    return state.getValue().invoke();
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                        LazyLayoutPrefetchState lazyLayoutPrefetchState9 = lazyLayoutPrefetchState8;
                        composer2.startReplaceableGroup(-1523808190);
                        if (lazyLayoutPrefetchState9 != null) {
                            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState8, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier8 = modifier7;
                        final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2 = measurePolicy;
                        composer2.startReplaceableGroup(511388516);
                        boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                    Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                    return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier8, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    lazyLayoutPrefetchState3 = null;
                } else {
                    lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
                }
                final State<? extends Function0<? extends LazyLayoutItemProvider>> stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
                final LazyLayoutPrefetchState lazyLayoutPrefetchState9 = lazyLayoutPrefetchState3;
                final Modifier modifier8 = modifier2;
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                        invoke(saveableStateHolder, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                        }
                        final State<? extends Function0<? extends LazyLayoutItemProvider>> state = stateRememberUpdatedState5;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LazyLayoutItemProvider invoke() {
                                    return state.getValue().invoke();
                                }
                            });
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                        composer2.startReplaceableGroup(-492369756);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                        LazyLayoutPrefetchState lazyLayoutPrefetchState10 = lazyLayoutPrefetchState9;
                        composer2.startReplaceableGroup(-1523808190);
                        if (lazyLayoutPrefetchState10 != null) {
                            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState9, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifier9 = modifier8;
                        final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2 = measurePolicy;
                        composer2.startReplaceableGroup(511388516);
                        boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                @NotNull
                                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                    Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                    return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier9, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.4
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    LazyLayoutKt.LazyLayout(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(measurePolicy)) {
                i6 = 2048;
            } else {
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) != 1170) {
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 != 0) {
                lazyLayoutPrefetchState3 = null;
            } else {
                lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            final State<? extends Function0<? extends LazyLayoutItemProvider>> stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
            final LazyLayoutPrefetchState lazyLayoutPrefetchState10 = lazyLayoutPrefetchState3;
            final Modifier modifier9 = modifier2;
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                    invoke(saveableStateHolder, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                    }
                    final State<? extends Function0<? extends LazyLayoutItemProvider>> state = stateRememberUpdatedState6;
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LazyLayoutItemProvider invoke() {
                                return state.getValue().invoke();
                            }
                        });
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                    LazyLayoutPrefetchState lazyLayoutPrefetchState11 = lazyLayoutPrefetchState10;
                    composer2.startReplaceableGroup(-1523808190);
                    if (lazyLayoutPrefetchState11 != null) {
                        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState10, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier10 = modifier9;
                    final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2 = measurePolicy;
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier10, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
        } else {
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 != 0) {
                lazyLayoutPrefetchState3 = null;
            } else {
                lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            final State<? extends Function0<? extends LazyLayoutItemProvider>> stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(itemProvider, composerStartRestartGroup, i7 & 14);
            final LazyLayoutPrefetchState lazyLayoutPrefetchState11 = lazyLayoutPrefetchState3;
            final Modifier modifier10 = modifier2;
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                    invoke(saveableStateHolder, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull SaveableStateHolder saveableStateHolder, @Nullable Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488997347, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:60)");
                    }
                    final State<? extends Function0<? extends LazyLayoutItemProvider>> state = stateRememberUpdatedState7;
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LazyLayoutItemProvider invoke() {
                                return state.getValue().invoke();
                            }
                        });
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                    composer2.startReplaceableGroup(-492369756);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                    LazyLayoutPrefetchState lazyLayoutPrefetchState12 = lazyLayoutPrefetchState11;
                    composer2.startReplaceableGroup(-1523808190);
                    if (lazyLayoutPrefetchState12 != null) {
                        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(lazyLayoutPrefetchState11, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, ((i7 >> 6) & 14) | 64 | (SubcomposeLayoutState.$stable << 6));
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifier11 = modifier10;
                    final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2 = measurePolicy;
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m633invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m633invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                                Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "$this$null");
                                return function2.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m3731boximpl(j));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier11, (Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>) objRememberedValue3, composer2, SubcomposeLayoutState.$stable | (i7 & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            lazyLayoutPrefetchState4 = lazyLayoutPrefetchState3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.4
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

            public final void invoke(@Nullable Composer composer2, int i9) {
                LazyLayoutKt.LazyLayout(itemProvider, modifier3, lazyLayoutPrefetchState4, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
