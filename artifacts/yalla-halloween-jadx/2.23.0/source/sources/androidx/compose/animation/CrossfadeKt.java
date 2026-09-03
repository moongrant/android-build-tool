package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008a\u0084\u0002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,147:1\n25#2:148\n25#2:156\n36#2:163\n456#2,8:200\n464#2,3:214\n467#2,3:224\n1097#3,3:149\n1100#3,3:153\n1097#3,6:157\n1097#3,6:164\n1#4:152\n350#5,7:170\n33#6,6:177\n33#6,6:218\n66#7,6:183\n72#7:217\n76#7:228\n78#8,11:189\n91#8:227\n4144#9,6:208\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n112#1:163\n139#1:200,8\n139#1:214,3\n139#1:224,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:164,6\n118#1:170,7\n127#1:177,6\n140#1:218,6\n139#1:183,6\n139#1:217\n139#1:228\n139#1:189,11\n139#1:227\n139#1:208,6\n*E\n"})
public final class CrossfadeKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final <T> void Crossfade(final T t, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable String str, @NotNull final Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        Modifier modifier3;
        FiniteAnimationSpec<Float> finiteAnimationSpecTween$default;
        String str3;
        final String str4;
        final Modifier modifier4;
        final FiniteAnimationSpec<Float> finiteAnimationSpec2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-310686752);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
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
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if (i4 != 4 && (46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier4 = modifier2;
                    str4 = str2;
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                    } else {
                        finiteAnimationSpecTween$default = finiteAnimationSpec;
                    }
                    if (i5 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                    }
                    String str5 = str3;
                    Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str4 = str5;
                    modifier4 = modifier3;
                    finiteAnimationSpec2 = finiteAnimationSpecTween$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.1
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
                        CrossfadeKt.Crossfade(t, modifier4, finiteAnimationSpec2, str4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            str2 = str;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if (i4 != 4) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str6 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str6;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str7 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str7;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.1
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
                    CrossfadeKt.Crossfade(t, modifier4, finiteAnimationSpec2, str4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if (i4 != 4) {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str8 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str8;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str9 = str3;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str9;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.1
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
                    CrossfadeKt.Crossfade(t, modifier4, finiteAnimationSpec2, str4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        str2 = str;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if (i4 != 4) {
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i5 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            String str10 = str3;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str10;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        } else {
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i5 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            String str11 = str3;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str3, composerStartRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, finiteAnimationSpecTween$default, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i3 & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str11;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.1
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
                CrossfadeKt.Crossfade(t, modifier4, finiteAnimationSpec2, str4, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    @Composable
    public static final /* synthetic */ void Crossfade(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(523603005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i;
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
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (i5 == 4 && (i3 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, composerStartRestartGroup, (i3 & 8) | (i3 & 14), 2), modifier, (FiniteAnimationSpec<Float>) finiteAnimationSpec, (Function1) null, content, composerStartRestartGroup, (i3 & 112) | ConstantsKt.MINIMUM_BLOCK_SIZE | ((i3 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                CrossfadeKt.Crossfade(obj, modifier2, finiteAnimationSpec2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab A[LOOP:1: B:100:0x01a9->B:101:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:107:0x022d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0231  */
    /* JADX WARN: Code duplicated, block: B:111:0x0242  */
    /* JADX WARN: Code duplicated, block: B:113:0x0250  */
    /* JADX WARN: Code duplicated, block: B:116:0x0274  */
    /* JADX WARN: Code duplicated, block: B:119:0x028c  */
    /* JADX WARN: Code duplicated, block: B:123:0x029f  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0190 A[EDGE_INSN: B:131:0x0190->B:96:0x0190 BREAK  A[LOOP:0: B:89:0x016f->B:94:0x018c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c A[LOOP:0: B:89:0x016f->B:94:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0192  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    @Composable
    @ExperimentalAnimationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final <T> void Crossfade(@NotNull final Transition<T> transition, @Nullable Modifier modifier, @Nullable FiniteAnimationSpec<Float> finiteAnimationSpec, @Nullable Function1<? super T, ? extends Object> function1, @NotNull final Function3<? super T, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1<? super T, ? extends Object> function2;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        FiniteAnimationSpec<Float> finiteAnimationSpecTween$default;
        Object objRememberedValue;
        Composer.Companion companion;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objRememberedValue2;
        Map map;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        int size;
        int i9;
        final Function1<? super T, ? extends Object> function3;
        final Modifier modifier4;
        final FiniteAnimationSpec<Float> finiteAnimationSpec2;
        Function2 function4;
        Iterator<T> it;
        int i10;
        int size2;
        int i11;
        boolean zChanged;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(679005231);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 1;
        if (i12 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 4;
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
                if ((i2 & 8) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if (i4 != 2 && (46811 & i8) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier4 = modifier2;
                    function3 = function2;
                } else {
                    if (i12 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                    } else {
                        finiteAnimationSpecTween$default = finiteAnimationSpec;
                    }
                    if (i5 != 0) {
                        function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                            @Override // kotlin.jvm.functions.Function1
                            public final T invoke(T t) {
                                return t;
                            }
                        };
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    obj = objRememberedValue;
                    if (objRememberedValue == companion.getEmpty()) {
                        SnapshotStateList snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
                        snapshotStateListMutableStateListOf.add(transition.getCurrentState());
                        composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf);
                        obj = snapshotStateListMutableStateListOf;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) obj;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new LinkedHashMap();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    map = (Map) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-1621449213);
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getTargetState()))) {
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(transition);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(T t) {
                                    return Boolean.valueOf(!Intrinsics.areEqual(t, transition.getTargetState()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                        map.clear();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (!map.containsKey(transition.getTargetState())) {
                        it = snapshotStateList.iterator();
                        i10 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = -1;
                                break;
                            } else if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (i10 == -1) {
                            snapshotStateList.add(transition.getTargetState());
                        } else {
                            snapshotStateList.set(i10, transition.getTargetState());
                        }
                        map.clear();
                        i11 = 0;
                        for (size2 = snapshotStateList.size(); i11 < size2; size2 = size2) {
                            T t = snapshotStateList.get(i11);
                            map.put(t, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t, content)));
                            i11++;
                        }
                    }
                    int i13 = (i8 >> 3) & 14;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i14 = i13 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i14 & 112) | (i14 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                    int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (!composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i15 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1621447954);
                    size = snapshotStateList.size();
                    for (i9 = 0; i9 < size; i9++) {
                        Object obj2 = snapshotStateList.get(i9);
                        composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj2));
                        function4 = (Function2) map.get(obj2);
                        if (function4 != null) {
                            function4.invoke(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endMovableGroup();
                    }
                    if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function2;
                    modifier4 = modifier3;
                    finiteAnimationSpec2 = finiteAnimationSpecTween$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.7
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
                        CrossfadeKt.Crossfade(transition, modifier4, finiteAnimationSpec2, function3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function2 = function1;
            if ((i2 & 8) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3;
            if (i4 != 2) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                        @Override // kotlin.jvm.functions.Function1
                        public final T invoke(T t2) {
                            return t2;
                        }
                    };
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf2 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf2.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf2);
                    obj = snapshotStateListMutableStateListOf2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t2) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t2, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t2) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t2, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (i10 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i10, transition.getTargetState());
                    }
                    map.clear();
                    i11 = 0;
                    while (i11 < size2) {
                        T t2 = snapshotStateList.get(i11);
                        map.put(t2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t2, content)));
                        i11++;
                    }
                }
                int i16 = (i8 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i17 = i16 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i17 & 112) | (i17 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl, currentCompositionLocalMap2);
                if (!composerM1309constructorimpl.getInserting()) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i18 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i9 < size) {
                    Object obj3 = snapshotStateList.get(i9);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj3));
                    function4 = (Function2) map.get(obj3);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                        @Override // kotlin.jvm.functions.Function1
                        public final T invoke(T t3) {
                            return t3;
                        }
                    };
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf3 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf3.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf3);
                    obj = snapshotStateListMutableStateListOf3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t3) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t3, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t3) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t3, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (i10 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i10, transition.getTargetState());
                    }
                    map.clear();
                    i11 = 0;
                    while (i11 < size2) {
                        T t3 = snapshotStateList.get(i11);
                        map.put(t3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t3, content)));
                        i11++;
                    }
                }
                int i19 = (i8 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i110 = i19 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i110 & 112) | (i110 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                int i111 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (!composerM1309constructorimpl.getInserting()) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i111 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i9 < size) {
                    Object obj4 = snapshotStateList.get(i9);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj4));
                    function4 = (Function2) map.get(obj4);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.7
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

                public final void invoke(@Nullable Composer composer2, int i112) {
                    CrossfadeKt.Crossfade(transition, modifier4, finiteAnimationSpec2, function3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 128;
        }
        i5 = i2 & 4;
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
            if ((i2 & 8) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3;
            if (i4 != 2) {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                        @Override // kotlin.jvm.functions.Function1
                        public final T invoke(T t4) {
                            return t4;
                        }
                    };
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf4 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf4.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf4);
                    obj = snapshotStateListMutableStateListOf4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t4) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t4, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t4) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t4, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (i10 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i10, transition.getTargetState());
                    }
                    map.clear();
                    i11 = 0;
                    while (i11 < size2) {
                        T t4 = snapshotStateList.get(i11);
                        map.put(t4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t4, content)));
                        i11++;
                    }
                }
                int i112 = (i8 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i113 = i112 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i113 & 112) | (i113 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifier3);
                int i114 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl, currentCompositionLocalMap4);
                if (!composerM1309constructorimpl.getInserting()) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i114 >> 3) & 112, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i9 < size) {
                    Object obj5 = snapshotStateList.get(i9);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj5));
                    function4 = (Function2) map.get(obj5);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
                } else {
                    finiteAnimationSpecTween$default = finiteAnimationSpec;
                }
                if (i5 != 0) {
                    function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                        @Override // kotlin.jvm.functions.Function1
                        public final T invoke(T t5) {
                            return t5;
                        }
                    };
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                obj = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    SnapshotStateList snapshotStateListMutableStateListOf5 = SnapshotStateKt.mutableStateListOf();
                    snapshotStateListMutableStateListOf5.add(transition.getCurrentState());
                    composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf5);
                    obj = snapshotStateListMutableStateListOf5;
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) obj;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                map = (Map) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-1621449213);
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(transition);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t5) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t5, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(T t5) {
                                return Boolean.valueOf(!Intrinsics.areEqual(t5, transition.getTargetState()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                    map.clear();
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (!map.containsKey(transition.getTargetState())) {
                    it = snapshotStateList.iterator();
                    i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        } else {
                            if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                                break;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (i10 == -1) {
                        snapshotStateList.add(transition.getTargetState());
                    } else {
                        snapshotStateList.set(i10, transition.getTargetState());
                    }
                    map.clear();
                    i11 = 0;
                    while (i11 < size2) {
                        T t5 = snapshotStateList.get(i11);
                        map.put(t5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t5, content)));
                        i11++;
                    }
                }
                int i115 = (i8 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i116 = i115 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i116 & 112) | (i116 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifier3);
                int i117 = ((((i115 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl, currentCompositionLocalMap5);
                if (!composerM1309constructorimpl.getInserting()) {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i117 >> 3) & 112, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1621447954);
                size = snapshotStateList.size();
                while (i9 < size) {
                    Object obj6 = snapshotStateList.get(i9);
                    composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj6));
                    function4 = (Function2) map.get(obj6);
                    if (function4 != null) {
                        function4.invoke(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endMovableGroup();
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
                modifier4 = modifier3;
                finiteAnimationSpec2 = finiteAnimationSpecTween$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.7
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
                    CrossfadeKt.Crossfade(transition, modifier4, finiteAnimationSpec2, function3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function2 = function1;
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i8 = i3;
        if (i4 != 2) {
            if (i12 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i5 != 0) {
                function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                    @Override // kotlin.jvm.functions.Function1
                    public final T invoke(T t6) {
                        return t6;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                SnapshotStateList snapshotStateListMutableStateListOf6 = SnapshotStateKt.mutableStateListOf();
                snapshotStateListMutableStateListOf6.add(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf6);
                obj = snapshotStateListMutableStateListOf6;
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) obj;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            map = (Map) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-1621449213);
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(transition);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(T t6) {
                            return Boolean.valueOf(!Intrinsics.areEqual(t6, transition.getTargetState()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(T t6) {
                            return Boolean.valueOf(!Intrinsics.areEqual(t6, transition.getTargetState()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                map.clear();
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (!map.containsKey(transition.getTargetState())) {
                it = snapshotStateList.iterator();
                i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                            break;
                            break;
                        }
                        i10++;
                    }
                }
                if (i10 == -1) {
                    snapshotStateList.add(transition.getTargetState());
                } else {
                    snapshotStateList.set(i10, transition.getTargetState());
                }
                map.clear();
                i11 = 0;
                while (i11 < size2) {
                    T t6 = snapshotStateList.get(i11);
                    map.put(t6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t6, content)));
                    i11++;
                }
            }
            int i118 = (i8 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i119 = i118 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i119 & 112) | (i119 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifier3);
            int i1110 = ((((i118 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl, currentCompositionLocalMap6);
            if (!composerM1309constructorimpl.getInserting()) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o((i1110 >> 3) & 112, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1621447954);
            size = snapshotStateList.size();
            while (i9 < size) {
                Object obj7 = snapshotStateList.get(i9);
                composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj7));
                function4 = (Function2) map.get(obj7);
                if (function4 != null) {
                    function4.invoke(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endMovableGroup();
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        } else {
            if (i12 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                finiteAnimationSpecTween$default = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            } else {
                finiteAnimationSpecTween$default = finiteAnimationSpec;
            }
            if (i5 != 0) {
                function2 = new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.3
                    @Override // kotlin.jvm.functions.Function1
                    public final T invoke(T t7) {
                        return t7;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679005231, i8, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                SnapshotStateList snapshotStateListMutableStateListOf7 = SnapshotStateKt.mutableStateListOf();
                snapshotStateListMutableStateListOf7.add(transition.getCurrentState());
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf7);
                obj = snapshotStateListMutableStateListOf7;
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) obj;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new LinkedHashMap();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            map = (Map) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-1621449213);
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(transition);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(T t7) {
                            return Boolean.valueOf(!Intrinsics.areEqual(t7, transition.getTargetState()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(T t7) {
                            return Boolean.valueOf(!Intrinsics.areEqual(t7, transition.getTargetState()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CollectionsKt.removeAll((List) snapshotStateList, (Function1) objRememberedValue3);
                map.clear();
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (!map.containsKey(transition.getTargetState())) {
                it = snapshotStateList.iterator();
                i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(function2.invoke(it.next()), function2.invoke(transition.getTargetState()))) {
                            break;
                            break;
                        }
                        i10++;
                    }
                }
                if (i10 == -1) {
                    snapshotStateList.add(transition.getTargetState());
                } else {
                    snapshotStateList.set(i10, transition.getTargetState());
                }
                map.clear();
                i11 = 0;
                while (i11 < size2) {
                    T t7 = snapshotStateList.get(i11);
                    map.put(t7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i8, finiteAnimationSpecTween$default, t7, content)));
                    i11++;
                }
            }
            int i1111 = (i8 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i1112 = i1111 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i1112 & 112) | (i1112 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifier3);
            int i1113 = ((((i1111 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1309constructorimpl, currentCompositionLocalMap7);
            if (!composerM1309constructorimpl.getInserting()) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o((i1113 >> 3) & 112, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1621447954);
            size = snapshotStateList.size();
            while (i9 < size) {
                Object obj8 = snapshotStateList.get(i9);
                composerStartRestartGroup.startMovableGroup(-450541366, function2.invoke(obj8));
                function4 = (Function2) map.get(obj8);
                if (function4 != null) {
                    function4.invoke(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endMovableGroup();
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
            modifier4 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpecTween$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.7
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

            public final void invoke(@Nullable Composer composer2, int i1114) {
                CrossfadeKt.Crossfade(transition, modifier4, finiteAnimationSpec2, function3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
