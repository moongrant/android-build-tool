package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000OO00.OooO0o;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\r\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010!\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u000fH\u0002\"(\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", "AndroidView", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "createAndroidViewNodeFactory", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/Updater;", "", "compositeKeyHash", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lo000OO00/OooO0o;", "savedStateRegistryOwner", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Lo000OO00/OooO0o;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "updateViewHolderParams", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "requireViewFactoryHolder", "Lkotlin/ExtensionFunctionType;", "NoOpUpdate", "Lkotlin/jvm/functions/Function1;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,398:1\n76#2:399\n76#2:400\n76#2:401\n76#2:402\n76#2:423\n76#2:424\n286#3,10:403\n251#3,10:413\n4144#4,6:425\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n212#1:399\n213#1:400\n220#1:401\n221#1:402\n266#1:423\n268#1:424\n224#1:403,10\n242#1:413,10\n304#1:425,6\n*E\n"})
public final class AndroidView_androidKt {

    @NotNull
    private static final Function1<View, Unit> NoOpUpdate = new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }
    };

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@NotNull final Function1<? super Context, ? extends T> factory, @Nullable Modifier modifier, @Nullable Function1<? super T, Unit> function1, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(factory) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function1 = NoOpUpdate;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:100)");
            }
            AndroidView(factory, modifier, null, NoOpUpdate, function1, composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final Function1<? super T, Unit> function2 = function1;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1
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
                AndroidView_androidKt.AndroidView(factory, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @Composable
    private static final <T extends View> Function0<LayoutNode> createAndroidViewNodeFactory(final Function1<? super Context, ? extends T> function1, Composer composer, int i) {
        composer.startReplaceableGroup(2030558801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:261)");
        }
        final int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Function0<LayoutNode> function0 = new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.createAndroidViewNodeFactory.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LayoutNode invoke() {
                return new ViewFactoryHolder(context, function1, compositionContextRememberCompositionContext, saveableStateRegistry, currentCompositeKeyHash).getLayoutNode();
            }
        };
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }

    @NotNull
    public static final Function1<View, Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Intrinsics.checkNotNull(interopViewFactoryHolder, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (ViewFactoryHolder) interopViewFactoryHolder;
    }

    /* JADX INFO: renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m4002updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i, Density density, LifecycleOwner lifecycleOwner, OooO0o oooO0o, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.m1316setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m1316setimpl(composer, modifier, new Function2<LayoutNode, Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier2) {
                invoke2(layoutNode, modifier2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode set, @NotNull Modifier it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidView_androidKt.requireViewFactoryHolder(set).setModifier(it);
            }
        });
        Updater.m1316setimpl(composer, density, new Function2<LayoutNode, Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Density density2) {
                invoke2(layoutNode, density2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode set, @NotNull Density it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidView_androidKt.requireViewFactoryHolder(set).setDensity(it);
            }
        });
        Updater.m1316setimpl(composer, lifecycleOwner, new Function2<LayoutNode, LifecycleOwner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                invoke2(layoutNode, lifecycleOwner2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode set, @NotNull LifecycleOwner it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidView_androidKt.requireViewFactoryHolder(set).setLifecycleOwner(it);
            }
        });
        Updater.m1316setimpl(composer, oooO0o, new Function2<LayoutNode, OooO0o, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, OooO0o oooO0o2) {
                invoke2(layoutNode, oooO0o2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode set, @NotNull OooO0o it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidView_androidKt.requireViewFactoryHolder(set).setSavedStateRegistryOwner(it);
            }
        });
        Updater.m1316setimpl(composer, layoutDirection, new Function2<LayoutNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                invoke2(layoutNode, layoutDirection2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode set, @NotNull LayoutDirection it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                ViewFactoryHolder viewFactoryHolderRequireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(set);
                int i2 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolderRequireViewFactoryHolder.setLayoutDirection(i3);
            }
        });
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i))) {
            androidx.compose.animation.OooO0O0.OooO00o(i, composer, i, setCompositeKeyHash);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0137  */
    /* JADX WARN: Code duplicated, block: B:84:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x018a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0193  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b7  */
    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@NotNull final Function1<? super Context, ? extends T> factory, @Nullable Modifier modifier, @Nullable Function1<? super T, Unit> function1, @Nullable Function1<? super T, Unit> function2, @Nullable Function1<? super T, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super T, Unit> function4;
        int i5;
        int i6;
        Function1<? super T, Unit> function5;
        int i7;
        int i8;
        Function1<? super T, Unit> function6;
        int i9;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Modifier modifierMaterializeModifier;
        Density density;
        LayoutDirection layoutDirection;
        CompositionLocalMap currentCompositionLocalMap;
        LifecycleOwner lifecycleOwner;
        OooO0o oooO0o;
        final Function0<LayoutNode> function0CreateAndroidViewNodeFactory;
        final Function0<LayoutNode> function0CreateAndroidViewNodeFactory2;
        final Function1<? super T, Unit> function7;
        final Function1<? super T, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Composer composerStartRestartGroup = composer.startRestartGroup(-180024211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(factory) ? 4 : 2) | i;
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
                if ((i & 896) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((46811 & i3) != 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 != 0) {
                                function5 = NoOpUpdate;
                            }
                            if (i8 != 0) {
                                function6 = NoOpUpdate;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                            }
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                            if (function4 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-88753439);
                                function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                                composerStartRestartGroup.startReplaceableGroup(1405779621);
                                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final LayoutNode invoke() {
                                            return function0CreateAndroidViewNodeFactory2.invoke();
                                        }
                                    });
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                                m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                                Updater.m1316setimpl(composerM1309constructorimpl, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                        invoke(layoutNode, (Function1) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                    }
                                });
                                Updater.m1316setimpl(composerM1309constructorimpl, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                        invoke(layoutNode, (Function1) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                    }
                                });
                                Updater.m1316setimpl(composerM1309constructorimpl, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                        invoke(layoutNode, (Function1) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                    }
                                });
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-88752574);
                                function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                                composerStartRestartGroup.startReplaceableGroup(1886828752);
                                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final LayoutNode invoke() {
                                            return function0CreateAndroidViewNodeFactory.invoke();
                                        }
                                    });
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                                m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl2, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                                Updater.m1316setimpl(composerM1309constructorimpl2, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                        invoke(layoutNode, (Function1) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                    }
                                });
                                Updater.m1316setimpl(composerM1309constructorimpl2, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                        invoke(layoutNode, (Function1) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                    }
                                });
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        function7 = function4;
                        function8 = function6;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier3;
                        final Function1<? super T, Unit> function9 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                                AndroidView_androidKt.AndroidView(factory, modifier4, function7, function9, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    function6 = function3;
                    if ((46811 & i3) != 9362) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl3, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl3, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl3, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl3, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl4, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl4, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl4, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl5, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl5, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl5, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl5, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl6, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl6, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl6, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier5 = modifier3;
                    final Function1<? super T, Unit> function10 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                            AndroidView_androidKt.AndroidView(factory, modifier5, function7, function10, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                function5 = function2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((46811 & i3) != 9362) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl7 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl7, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl7, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl7, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl7, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl8 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl8, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl8, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl8, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl9 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl9, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl9, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl9, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl9, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl10 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl10, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl10, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl10, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier6 = modifier3;
                    final Function1<? super T, Unit> function11 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                            AndroidView_androidKt.AndroidView(factory, modifier6, function7, function11, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function6 = function3;
                if ((46811 & i3) != 9362) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl12 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl12, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl12, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl12, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl13 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl13, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl13, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl13, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl13, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl14 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl14, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl14, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl14, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier7 = modifier3;
                final Function1<? super T, Unit> function12 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                        AndroidView_androidKt.AndroidView(factory, modifier7, function7, function12, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            function4 = function1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((46811 & i3) != 9362) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl15 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl15, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl15, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl15, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl15, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl16 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl16, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl16, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl16, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl17 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl17, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl17, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl17, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl17, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl18 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl18, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl18, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl18, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier8 = modifier3;
                    final Function1<? super T, Unit> function13 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                            AndroidView_androidKt.AndroidView(factory, modifier8, function7, function13, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function6 = function3;
                if ((46811 & i3) != 9362) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl19 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl19, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl19, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl19, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl19, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl110 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl110, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl111 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl111, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl112 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl112, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier9 = modifier3;
                final Function1<? super T, Unit> function14 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                        AndroidView_androidKt.AndroidView(factory, modifier9, function7, function14, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function5 = function2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((46811 & i3) != 9362) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl113 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl113, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl113, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl113, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl114 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl114, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl114, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl115 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl115, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl115, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl115, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl116 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl116, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl116, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier10 = modifier3;
                final Function1<? super T, Unit> function15 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                        AndroidView_androidKt.AndroidView(factory, modifier10, function7, function15, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function6 = function3;
            if ((46811 & i3) != 9362) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl117 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl117, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl117, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl117, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl118 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl118, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl118, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl119 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl119, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl119, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl119, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl1110 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl1110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl1110, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier11 = modifier3;
            final Function1<? super T, Unit> function16 = function5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                    AndroidView_androidKt.AndroidView(factory, modifier11, function7, function16, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((46811 & i3) != 9362) {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl1111 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl1111, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl1111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl1111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl1112 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl1112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl1112, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = NoOpUpdate;
                        }
                        if (i8 != 0) {
                            function6 = NoOpUpdate;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                        }
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (function4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-88753439);
                            function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1405779621);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory2.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl1113 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl1113, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl1113, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl1113, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-88752574);
                            function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                            composerStartRestartGroup.startReplaceableGroup(1886828752);
                            if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final LayoutNode invoke() {
                                        return function0CreateAndroidViewNodeFactory.invoke();
                                    }
                                });
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1309constructorimpl1114 = Updater.m1309constructorimpl(composerStartRestartGroup);
                            m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                            Updater.m1316setimpl(composerM1309constructorimpl1114, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                                }
                            });
                            Updater.m1316setimpl(composerM1309constructorimpl1114, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                    invoke(layoutNode, (Function1) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                                }
                            });
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    function7 = function4;
                    function8 = function6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final Modifier modifier12 = modifier3;
                    final Function1<? super T, Unit> function17 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                            AndroidView_androidKt.AndroidView(factory, modifier12, function7, function17, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function6 = function3;
                if ((46811 & i3) != 9362) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl1115 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl1115, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1115, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1115, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl1116 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl1116, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1116, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl1117 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl1117, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1117, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1117, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl1118 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl1118, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1118, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier13 = modifier3;
                final Function1<? super T, Unit> function18 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                        AndroidView_androidKt.AndroidView(factory, modifier13, function7, function18, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function5 = function2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((46811 & i3) != 9362) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl1119 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl1119, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1119, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl1119, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11110 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11110, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11111 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11111, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11112 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11112, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier14 = modifier3;
                final Function1<? super T, Unit> function19 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                        AndroidView_androidKt.AndroidView(factory, modifier14, function7, function19, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function6 = function3;
            if ((46811 & i3) != 9362) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl11113 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl11113, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl11113, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl11113, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl11114 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl11114, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl11114, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl11115 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl11115, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl11115, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl11115, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl11116 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl11116, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl11116, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier15 = modifier3;
            final Function1<? super T, Unit> function110 = function5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                    AndroidView_androidKt.AndroidView(factory, modifier15, function7, function110, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        function4 = function1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((46811 & i3) != 9362) {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11117 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11117, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11117, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11117, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11118 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11118, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11118, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = NoOpUpdate;
                    }
                    if (i8 != 0) {
                        function6 = NoOpUpdate;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                    }
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (function4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-88753439);
                        function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1405779621);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory2.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl11119 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl11119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl11119, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11119, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl11119, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-88752574);
                        function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                        if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final LayoutNode invoke() {
                                    return function0CreateAndroidViewNodeFactory.invoke();
                                }
                            });
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1309constructorimpl111110 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                        Updater.m1316setimpl(composerM1309constructorimpl111110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                            }
                        });
                        Updater.m1316setimpl(composerM1309constructorimpl111110, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                                invoke(layoutNode, (Function1) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                            }
                        });
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function7 = function4;
                function8 = function6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Modifier modifier16 = modifier3;
                final Function1<? super T, Unit> function111 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                        AndroidView_androidKt.AndroidView(factory, modifier16, function7, function111, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function6 = function3;
            if ((46811 & i3) != 9362) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111111 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111111, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111112 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111112, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111113 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111113, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111113, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111113, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111113, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111114 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111114, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111114, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111114, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier17 = modifier3;
            final Function1<? super T, Unit> function112 = function5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                    AndroidView_androidKt.AndroidView(factory, modifier17, function7, function112, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function5 = function2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((46811 & i3) != 9362) {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111115 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111115, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111115, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111115, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111115, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111116 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111116, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111116, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111116, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = NoOpUpdate;
                }
                if (i8 != 0) {
                    function6 = NoOpUpdate;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
                }
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-88753439);
                    function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1405779621);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory2.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111117 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111117, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111117, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111117, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111117, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-88752574);
                    function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                    composerStartRestartGroup.startReplaceableGroup(1886828752);
                    if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final LayoutNode invoke() {
                                return function0CreateAndroidViewNodeFactory.invoke();
                            }
                        });
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1309constructorimpl111118 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111118, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                    Updater.m1316setimpl(composerM1309constructorimpl111118, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                        }
                    });
                    Updater.m1316setimpl(composerM1309constructorimpl111118, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                            invoke(layoutNode, (Function1) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                        }
                    });
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function7 = function4;
            function8 = function6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier18 = modifier3;
            final Function1<? super T, Unit> function113 = function5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                    AndroidView_androidKt.AndroidView(factory, modifier18, function7, function113, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        function6 = function3;
        if ((46811 & i3) != 9362) {
            if (i10 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                function4 = null;
            }
            if (i6 != 0) {
                function5 = NoOpUpdate;
            }
            if (i8 != 0) {
                function6 = NoOpUpdate;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
            }
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-88753439);
                function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.startReplaceableGroup(1405779621);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0CreateAndroidViewNodeFactory2.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl111119 = Updater.m1309constructorimpl(composerStartRestartGroup);
                m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl111119, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                Updater.m1316setimpl(composerM1309constructorimpl111119, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                    }
                });
                Updater.m1316setimpl(composerM1309constructorimpl111119, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                    }
                });
                Updater.m1316setimpl(composerM1309constructorimpl111119, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-88752574);
                function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.startReplaceableGroup(1886828752);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0CreateAndroidViewNodeFactory.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl1111110 = Updater.m1309constructorimpl(composerStartRestartGroup);
                m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1111110, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                Updater.m1316setimpl(composerM1309constructorimpl1111110, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                    }
                });
                Updater.m1316setimpl(composerM1309constructorimpl1111110, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i10 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                function4 = null;
            }
            if (i6 != 0) {
                function5 = NoOpUpdate;
            }
            if (i8 != 0) {
                function6 = NoOpUpdate;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:202)");
            }
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            oooO0o = (OooO0o) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-88753439);
                function0CreateAndroidViewNodeFactory2 = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.startReplaceableGroup(1405779621);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0CreateAndroidViewNodeFactory2.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl1111111 = Updater.m1309constructorimpl(composerStartRestartGroup);
                m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1111111, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                Updater.m1316setimpl(composerM1309constructorimpl1111111, function4, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setResetBlock(it);
                    }
                });
                Updater.m1316setimpl(composerM1309constructorimpl1111111, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                    }
                });
                Updater.m1316setimpl(composerM1309constructorimpl1111111, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-88752574);
                function0CreateAndroidViewNodeFactory = createAndroidViewNodeFactory(factory, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.startReplaceableGroup(1886828752);
                if (!(composerStartRestartGroup.getApplier() instanceof UiApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final LayoutNode invoke() {
                            return function0CreateAndroidViewNodeFactory.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1309constructorimpl1111112 = Updater.m1309constructorimpl(composerStartRestartGroup);
                m4002updateViewHolderParams6NefGtU(composerM1309constructorimpl1111112, modifierMaterializeModifier, currentCompositeKeyHash, density, lifecycleOwner, oooO0o, layoutDirection, currentCompositionLocalMap);
                Updater.m1316setimpl(composerM1309constructorimpl1111112, function6, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setUpdateBlock(it);
                    }
                });
                Updater.m1316setimpl(composerM1309constructorimpl1111112, function5, new Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
                        invoke(layoutNode, (Function1) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        AndroidView_androidKt.requireViewFactoryHolder(set).setReleaseBlock(it);
                    }
                });
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        function7 = function4;
        function8 = function6;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier19 = modifier3;
        final Function1<? super T, Unit> function114 = function5;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.4
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
                AndroidView_androidKt.AndroidView(factory, modifier19, function7, function114, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
