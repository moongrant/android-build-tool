package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*b\b\u0002\u0010%\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f¨\u0006("}, d2 = {"SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutWithScale", "", "current", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SnackbarHost", "hostState", "Landroidx/compose/material/SnackbarHostState;", "snackbar", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "toMillis", "", "Landroidx/compose/material/SnackbarDuration;", "hasAction", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutTransition", "Lkotlin/ParameterName;", "name", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n76#2:374\n76#2:396\n25#3:375\n460#3,13:408\n473#3,3:428\n25#3:433\n25#3:440\n1114#4,6:376\n1114#4,6:434\n1114#4,6:441\n1549#5:382\n1620#5,3:383\n1620#5,3:386\n67#6,6:389\n73#6:421\n77#6:432\n75#7:395\n76#7,11:397\n89#7:431\n33#8,6:422\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n157#1:374\n316#1:396\n262#1:375\n316#1:408,13\n316#1:428,3\n348#1:433\n361#1:440\n262#1:376,6\n348#1:434,6\n361#1:441,6\n265#1:382\n265#1:383,3\n270#1:386,3\n316#1:389,6\n316#1:421\n316#1:432\n316#1:395\n316#1:397,11\n316#1:431\n318#1:422,6\n*E\n"})
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$SnackbarHost$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccessibilityManager $accessibilityManager;
        final /* synthetic */ SnackbarData $currentSnackbarData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentSnackbarData = snackbarData;
            this.$accessibilityManager = accessibilityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$currentSnackbarData, this.$accessibilityManager, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SnackbarData snackbarData = this.$currentSnackbarData;
                if (snackbarData != null) {
                    long millis = SnackbarHostKt.toMillis(snackbarData.getDuration(), this.$currentSnackbarData.getActionLabel() != null, this.$accessibilityManager);
                    this.label = 1;
                    if (DelayKt.delay(millis, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$currentSnackbarData.dismiss();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$animatedOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
    public static final class C07682 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
        final /* synthetic */ AnimationSpec<Float> $animation;
        final /* synthetic */ Function0<Unit> $onAnimationFinish;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07682(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Continuation<? super C07682> continuation) {
            super(2, continuation);
            this.$alpha = animatable;
            this.$visible = z;
            this.$animation = animationSpec;
            this.$onAnimationFinish = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C07682(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$alpha;
                Float fBoxFloat = Boxing.boxFloat(this.$visible ? 1.0f : 0.0f);
                AnimationSpec<Float> animationSpec = this.$animation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$onAnimationFinish.invoke();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$animatedScale$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
    public static final class C07691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animation;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07691(Animatable<Float, AnimationVector1D> animatable, boolean z, AnimationSpec<Float> animationSpec, Continuation<? super C07691> continuation) {
            super(2, continuation);
            this.$scale = animatable;
            this.$visible = z;
            this.$animation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C07691(this.$scale, this.$visible, this.$animation, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$scale;
                Float fBoxFloat = Boxing.boxFloat(this.$visible ? 1.0f : 0.8f);
                AnimationSpec<Float> animationSpec = this.$animation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fBoxFloat, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7 A[LOOP:0: B:52:0x00c1->B:54:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd A[LOOP:1: B:59:0x00f7->B:61:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc A[LOOP:2: B:70:0x01ba->B:71:0x01bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FadeInFadeOutWithScale(final SnackbarData snackbarData, Modifier modifier, final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final int i5;
        Modifier modifier3;
        Object objRememberedValue;
        final FadeInFadeOutState fadeInFadeOutState;
        Function0<ComposeUiNode> constructor;
        int i6;
        List items;
        int size;
        ArrayList arrayList;
        Iterator it;
        final List mutableList;
        List items2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2036134589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2036134589, i5, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FadeInFadeOutState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                fadeInFadeOutState = (FadeInFadeOutState) objRememberedValue;
                if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                    fadeInFadeOutState.setCurrent(snackbarData);
                    List items3 = fadeInFadeOutState.getItems();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items3, 10));
                    it = items3.iterator();
                    while (it.hasNext()) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it.next()).getKey());
                    }
                    mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List<SnackbarData> listFilterNotNull = CollectionsKt.filterNotNull(mutableList);
                    items2 = fadeInFadeOutState.getItems();
                    for (final SnackbarData snackbarData2 : listFilterNotNull) {
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -94104314, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> children, @Nullable Composer composer2, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(children, "children");
                                if ((i8 & 14) == 0) {
                                    i9 = i8 | (composer2.changedInstance(children) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-94104314, i9, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
                                }
                                boolean zAreEqual = Intrinsics.areEqual(snackbarData2, snackbarData);
                                int i10 = zAreEqual ? 150 : 75;
                                int i11 = (!zAreEqual || CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpecTween = AnimationSpecKt.tween(i10, i11, EasingKt.getLinearEasing());
                                final SnackbarData snackbarData3 = snackbarData2;
                                final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                                State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(tweenSpecTween, zAreEqual, new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        if (Intrinsics.areEqual(snackbarData3, fadeInFadeOutState2.getCurrent())) {
                                            return;
                                        }
                                        List<FadeInFadeOutAnimationItem<SnackbarData>> items4 = fadeInFadeOutState2.getItems();
                                        final SnackbarData snackbarData4 = snackbarData3;
                                        CollectionsKt.removeAll((List) items4, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            @NotNull
                                            public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> it2) {
                                                Intrinsics.checkNotNullParameter(it2, "it");
                                                return Boolean.valueOf(Intrinsics.areEqual(it2.getKey(), snackbarData4));
                                            }
                                        });
                                        RecomposeScope scope = fadeInFadeOutState2.getScope();
                                        if (scope != null) {
                                            scope.invalidate();
                                        }
                                    }
                                }, composer2, 0, 0);
                                State stateAnimatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i10, i11, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                                Modifier modifierM1827graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m1827graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                                final SnackbarData snackbarData4 = snackbarData2;
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1827graphicsLayerAp8cVGQ$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        SemanticsPropertiesKt.m3168setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m3147getPolite0phEisY());
                                        final SnackbarData snackbarData5 = snackbarData4;
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                snackbarData5.dismiss();
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }, 1, null);
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                children.invoke(composer2, Integer.valueOf(i9 & 14));
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })));
                    }
                }
                int i8 = (i5 >> 3) & 14;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i9 = i8 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i9 & 112) | (i9 & 14));
                Density density = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                int i10 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                androidx.compose.animation.OooOO0.OooO00o((i10 >> 3) & 112, function3MaterializerOf, OooO0OO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, density, composerM1309constructorimpl, layoutDirection, composerM1309constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceableGroup(-1656513320);
                items = fadeInFadeOutState.getItems();
                size = items.size();
                for (i6 = 0; i6 < size; i6++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items.get(i6);
                    final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.component1();
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component2 = fadeInFadeOutAnimationItem.component2();
                    composerStartRestartGroup.startMovableGroup(-208579897, snackbarData3);
                    function3Component2.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2041982076, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                        public final void invoke(@Nullable Composer composer2, int i11) {
                            if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2041982076, i11, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
                            }
                            Function3<SnackbarData, Composer, Integer, Unit> function4 = function3;
                            SnackbarData snackbarData4 = snackbarData3;
                            Intrinsics.checkNotNull(snackbarData4);
                            function4.invoke(snackbarData4, composer2, Integer.valueOf((i5 >> 3) & 112));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endMovableGroup();
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.3
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
                    SnackbarHostKt.FadeInFadeOutWithScale(snackbarData, modifier4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036134589, i5, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FadeInFadeOutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            fadeInFadeOutState = (FadeInFadeOutState) objRememberedValue;
            if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                fadeInFadeOutState.setCurrent(snackbarData);
                List items4 = fadeInFadeOutState.getItems();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items4, 10));
                it = items4.iterator();
                while (it.hasNext()) {
                    arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it.next()).getKey());
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                fadeInFadeOutState.getItems().clear();
                List<SnackbarData> listFilterNotNull2 = CollectionsKt.filterNotNull(mutableList);
                items2 = fadeInFadeOutState.getItems();
                while (r7.hasNext()) {
                    items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -94104314, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> children, @Nullable Composer composer2, int i11) {
                            int i12;
                            Intrinsics.checkNotNullParameter(children, "children");
                            if ((i11 & 14) == 0) {
                                i12 = i11 | (composer2.changedInstance(children) ? 4 : 2);
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-94104314, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
                            }
                            boolean zAreEqual = Intrinsics.areEqual(snackbarData2, snackbarData);
                            int i13 = zAreEqual ? 150 : 75;
                            int i14 = (!zAreEqual || CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                            TweenSpec tweenSpecTween = AnimationSpecKt.tween(i13, i14, EasingKt.getLinearEasing());
                            final SnackbarData snackbarData4 = snackbarData2;
                            final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                            State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(tweenSpecTween, zAreEqual, new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    if (Intrinsics.areEqual(snackbarData4, fadeInFadeOutState2.getCurrent())) {
                                        return;
                                    }
                                    List<FadeInFadeOutAnimationItem<SnackbarData>> items5 = fadeInFadeOutState2.getItems();
                                    final SnackbarData snackbarData5 = snackbarData4;
                                    CollectionsKt.removeAll((List) items5, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> it2) {
                                            Intrinsics.checkNotNullParameter(it2, "it");
                                            return Boolean.valueOf(Intrinsics.areEqual(it2.getKey(), snackbarData5));
                                        }
                                    });
                                    RecomposeScope scope = fadeInFadeOutState2.getScope();
                                    if (scope != null) {
                                        scope.invalidate();
                                    }
                                }
                            }, composer2, 0, 0);
                            State stateAnimatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i13, i14, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                            Modifier modifierM1827graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m1827graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                            final SnackbarData snackbarData5 = snackbarData2;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1827graphicsLayerAp8cVGQ$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.m3168setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m3147getPolite0phEisY());
                                    final SnackbarData snackbarData6 = snackbarData5;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            snackbarData6.dismiss();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }, 1, null);
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            children.invoke(composer2, Integer.valueOf(i12 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    })));
                }
            }
            int i11 = (i5 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i12 = i11 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
            Density density2 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifier3);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o((i13 >> 3) & 112, function3MaterializerOf2, OooO0OO.OooO00o(companion2, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl2, density2, composerM1309constructorimpl2, layoutDirection2, composerM1309constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceableGroup(-1656513320);
            items = fadeInFadeOutState.getItems();
            size = items.size();
            while (i6 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) items.get(i6);
                final SnackbarData snackbarData4 = (SnackbarData) fadeInFadeOutAnimationItem2.component1();
                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component3 = fadeInFadeOutAnimationItem2.component2();
                composerStartRestartGroup.startMovableGroup(-208579897, snackbarData4);
                function3Component3.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2041982076, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                    public final void invoke(@Nullable Composer composer2, int i14) {
                        if ((i14 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2041982076, i14, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
                        }
                        Function3<SnackbarData, Composer, Integer, Unit> function4 = function3;
                        SnackbarData snackbarData5 = snackbarData4;
                        Intrinsics.checkNotNull(snackbarData5);
                        function4.invoke(snackbarData5, composer2, Integer.valueOf((i5 >> 3) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 6);
                composerStartRestartGroup.endMovableGroup();
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036134589, i5, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FadeInFadeOutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            fadeInFadeOutState = (FadeInFadeOutState) objRememberedValue;
            if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                fadeInFadeOutState.setCurrent(snackbarData);
                List items5 = fadeInFadeOutState.getItems();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items5, 10));
                it = items5.iterator();
                while (it.hasNext()) {
                    arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it.next()).getKey());
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(snackbarData)) {
                    mutableList.add(snackbarData);
                }
                fadeInFadeOutState.getItems().clear();
                List<SnackbarData> listFilterNotNull3 = CollectionsKt.filterNotNull(mutableList);
                items2 = fadeInFadeOutState.getItems();
                while (r7.hasNext()) {
                    items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -94104314, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> children, @Nullable Composer composer2, int i14) {
                            int i15;
                            Intrinsics.checkNotNullParameter(children, "children");
                            if ((i14 & 14) == 0) {
                                i15 = i14 | (composer2.changedInstance(children) ? 4 : 2);
                            } else {
                                i15 = i14;
                            }
                            if ((i15 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-94104314, i15, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
                            }
                            boolean zAreEqual = Intrinsics.areEqual(snackbarData2, snackbarData);
                            int i16 = zAreEqual ? 150 : 75;
                            int i17 = (!zAreEqual || CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                            TweenSpec tweenSpecTween = AnimationSpecKt.tween(i16, i17, EasingKt.getLinearEasing());
                            final SnackbarData snackbarData5 = snackbarData2;
                            final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                            State stateAnimatedOpacity = SnackbarHostKt.animatedOpacity(tweenSpecTween, zAreEqual, new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    if (Intrinsics.areEqual(snackbarData5, fadeInFadeOutState2.getCurrent())) {
                                        return;
                                    }
                                    List<FadeInFadeOutAnimationItem<SnackbarData>> items6 = fadeInFadeOutState2.getItems();
                                    final SnackbarData snackbarData6 = snackbarData5;
                                    CollectionsKt.removeAll((List) items6, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> it2) {
                                            Intrinsics.checkNotNullParameter(it2, "it");
                                            return Boolean.valueOf(Intrinsics.areEqual(it2.getKey(), snackbarData6));
                                        }
                                    });
                                    RecomposeScope scope = fadeInFadeOutState2.getScope();
                                    if (scope != null) {
                                        scope.invalidate();
                                    }
                                }
                            }, composer2, 0, 0);
                            State stateAnimatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i16, i17, EasingKt.getFastOutSlowInEasing()), zAreEqual, composer2, 0);
                            Modifier modifierM1827graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m1827graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedScale.getValue()).floatValue(), ((Number) stateAnimatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                            final SnackbarData snackbarData6 = snackbarData2;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1827graphicsLayerAp8cVGQ$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.m3168setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m3147getPolite0phEisY());
                                    final SnackbarData snackbarData7 = snackbarData6;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            snackbarData7.dismiss();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }, 1, null);
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composer2, composer2), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            children.invoke(composer2, Integer.valueOf(i15 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    })));
                }
            }
            int i14 = (i5 >> 3) & 14;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i15 = i14 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i15 & 112) | (i15 & 14));
            Density density3 = (Density) OooO00o.OooO00o(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier3);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            androidx.compose.animation.OooOO0.OooO00o((i16 >> 3) & 112, function3MaterializerOf3, OooO0OO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl3, density3, composerM1309constructorimpl3, layoutDirection3, composerM1309constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceableGroup(-1656513320);
            items = fadeInFadeOutState.getItems();
            size = items.size();
            while (i6 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem3 = (FadeInFadeOutAnimationItem) items.get(i6);
                final SnackbarData snackbarData5 = (SnackbarData) fadeInFadeOutAnimationItem3.component1();
                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3Component4 = fadeInFadeOutAnimationItem3.component2();
                composerStartRestartGroup.startMovableGroup(-208579897, snackbarData5);
                function3Component4.invoke(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2041982076, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
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
                    public final void invoke(@Nullable Composer composer2, int i17) {
                        if ((i17 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2041982076, i17, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
                        }
                        Function3<SnackbarData, Composer, Integer, Unit> function4 = function3;
                        SnackbarData snackbarData6 = snackbarData5;
                        Intrinsics.checkNotNull(snackbarData6);
                        function4.invoke(snackbarData6, composer2, Integer.valueOf((i5 >> 3) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 6);
                composerStartRestartGroup.endMovableGroup();
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier5 = modifier3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.3
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

            public final void invoke(@Nullable Composer composer2, int i17) {
                SnackbarHostKt.FadeInFadeOutWithScale(snackbarData, modifier5, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@NotNull final SnackbarHostState hostState, @Nullable Modifier modifier, @Nullable Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(hostState, "hostState");
        Composer composerStartRestartGroup = composer.startRestartGroup(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(hostState) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.INSTANCE.m1053getLambda1$material_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431012348, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
            }
            SnackbarData currentSnackbarData = hostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData, new AnonymousClass1(currentSnackbarData, (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), composerStartRestartGroup, 64);
            FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), modifier, function3, composerStartRestartGroup, (i3 & 112) | (i3 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function4 = function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.SnackbarHost.2
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
                SnackbarHostKt.SnackbarHost(hostState, modifier2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1016418159);
        if ((i2 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt.animatedOpacity.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0<Unit> function1 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new C07682(animatable, z, animationSpec, function1, null), composer, ((i >> 3) & 14) | 64);
        State<Float> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(2003504988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new C07691(animatable, z, animationSpec, null), composer, ((i >> 3) & 14) | 64);
        State<Float> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final long toMillis(@NotNull SnackbarDuration snackbarDuration, boolean z, @Nullable AccessibilityManager accessibilityManager) {
        long j;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = LongCompanionObject.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }
}
