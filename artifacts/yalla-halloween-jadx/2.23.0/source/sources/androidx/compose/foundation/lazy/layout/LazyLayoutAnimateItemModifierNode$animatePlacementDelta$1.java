package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1", f = "LazyLayoutAnimateItemModifierNode.kt", i = {0}, l = {97, 103}, m = "invokeSuspend", n = {"spec"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n79#2:136\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1\n*L\n102#1:136\n*E\n"})
public final class LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j, Continuation<? super LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutAnimateItemModifierNode;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this.this$0, this.$totalDelta, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    finiteAnimationSpec = (FiniteAnimationSpec) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.setAnimationInProgress(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FiniteAnimationSpec<IntOffset> placementAnimationSpec = (!this.this$0.placementDeltaAnimation.isRunning() || (this.this$0.getPlacementAnimationSpec() instanceof SpringSpec)) ? this.this$0.getPlacementAnimationSpec() : LazyLayoutAnimateItemModifierNodeKt.InterruptionSpec;
            finiteAnimationSpec = placementAnimationSpec;
            if (!this.this$0.placementDeltaAnimation.isRunning()) {
                Animatable animatable = this.this$0.placementDeltaAnimation;
                IntOffset intOffsetM3874boximpl = IntOffset.m3874boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec;
                this.label = 1;
                if (animatable.snapTo(intOffsetM3874boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = finiteAnimationSpec;
            long packedValue = ((IntOffset) this.this$0.placementDeltaAnimation.getValue()).getPackedValue();
            long j = this.$totalDelta;
            final long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m3883getXimpl(packedValue) - IntOffset.m3883getXimpl(j), IntOffset.m3884getYimpl(packedValue) - IntOffset.m3884getYimpl(j));
            Animatable animatable2 = this.this$0.placementDeltaAnimation;
            IntOffset intOffsetM3874boximpl2 = IntOffset.m3874boximpl(jIntOffset);
            final LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = this.this$0;
            Function1<Animatable<IntOffset, AnimationVector2D>, Unit> function1 = new Function1<Animatable<IntOffset, AnimationVector2D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable3) {
                    invoke2(animatable3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Animatable<IntOffset, AnimationVector2D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode2 = lazyLayoutAnimateItemModifierNode;
                    long packedValue2 = animateTo.getValue().getPackedValue();
                    long j2 = jIntOffset;
                    lazyLayoutAnimateItemModifierNode2.m617setPlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3883getXimpl(packedValue2) - IntOffset.m3883getXimpl(j2), IntOffset.m3884getYimpl(packedValue2) - IntOffset.m3884getYimpl(j2)));
                }
            };
            this.L$0 = null;
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, intOffsetM3874boximpl2, finiteAnimationSpec2, null, function1, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.this$0.setAnimationInProgress(false);
        } catch (CancellationException unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
