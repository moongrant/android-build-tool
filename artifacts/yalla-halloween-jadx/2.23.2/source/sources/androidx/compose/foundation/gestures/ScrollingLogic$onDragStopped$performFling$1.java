package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "velocity", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {464, 466, 468}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m350invokesFctU(velocity.getPackedValue(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m350invokesFctU(long j, @Nullable Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m3991boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM2599dispatchPreFlingQWom1Mo;
        long j;
        Object objM338doFlingAnimationQWom1Mo;
        long j2;
        long j3;
        long packedValue;
        Object objM2597dispatchPostFlingRZ2iAVY;
        long j4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                j = this.J$0;
                ResultKt.throwOnFailure(obj);
                objM2599dispatchPreFlingQWom1Mo = obj;
            } else if (i == 2) {
                j2 = this.J$1;
                long j5 = this.J$0;
                ResultKt.throwOnFailure(obj);
                objM338doFlingAnimationQWom1Mo = obj;
                j3 = j5;
                packedValue = ((Velocity) objM338doFlingAnimationQWom1Mo).getPackedValue();
                NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
                long jM4003minusAH228Gc = Velocity.m4003minusAH228Gc(j2, packedValue);
                this.J$0 = j3;
                this.J$1 = packedValue;
                this.label = 3;
                objM2597dispatchPostFlingRZ2iAVY = value.m2597dispatchPostFlingRZ2iAVY(jM4003minusAH228Gc, packedValue, this);
                if (objM2597dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = j3;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j6 = this.J$1;
                j4 = this.J$0;
                ResultKt.throwOnFailure(obj);
                packedValue = j6;
                objM2597dispatchPostFlingRZ2iAVY = obj;
            }
            return Velocity.m3991boximpl(Velocity.m4003minusAH228Gc(j4, Velocity.m4003minusAH228Gc(packedValue, ((Velocity) objM2597dispatchPostFlingRZ2iAVY).getPackedValue())));
        }
        ResultKt.throwOnFailure(obj);
        long j7 = this.J$0;
        NestedScrollDispatcher value2 = this.this$0.getNestedScrollDispatcher().getValue();
        this.J$0 = j7;
        this.label = 1;
        objM2599dispatchPreFlingQWom1Mo = value2.m2599dispatchPreFlingQWom1Mo(j7, this);
        if (objM2599dispatchPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = j7;
        long jM4003minusAH228Gc2 = Velocity.m4003minusAH228Gc(j, ((Velocity) objM2599dispatchPreFlingQWom1Mo).getPackedValue());
        ScrollingLogic scrollingLogic = this.this$0;
        this.J$0 = j;
        this.J$1 = jM4003minusAH228Gc2;
        this.label = 2;
        objM338doFlingAnimationQWom1Mo = scrollingLogic.m338doFlingAnimationQWom1Mo(jM4003minusAH228Gc2, this);
        if (objM338doFlingAnimationQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = jM4003minusAH228Gc2;
        j3 = j;
        packedValue = ((Velocity) objM338doFlingAnimationQWom1Mo).getPackedValue();
        NestedScrollDispatcher value3 = this.this$0.getNestedScrollDispatcher().getValue();
        long jM4003minusAH228Gc3 = Velocity.m4003minusAH228Gc(j2, packedValue);
        this.J$0 = j3;
        this.J$1 = packedValue;
        this.label = 3;
        objM2597dispatchPostFlingRZ2iAVY = value3.m2597dispatchPostFlingRZ2iAVY(jM4003minusAH228Gc3, packedValue, this);
        if (objM2597dispatchPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        j4 = j3;
        return Velocity.m3991boximpl(Velocity.m4003minusAH228Gc(j4, Velocity.m4003minusAH228Gc(packedValue, ((Velocity) objM2597dispatchPostFlingRZ2iAVY).getPackedValue())));
    }
}
