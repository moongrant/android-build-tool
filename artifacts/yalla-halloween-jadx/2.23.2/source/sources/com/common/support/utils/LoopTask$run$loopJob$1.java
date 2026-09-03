package com.common.support.utils;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.common.support.utils.LoopTask$run$loopJob$1", f = "LoopTask.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class LoopTask$run$loopJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LoopTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopTask$run$loopJob$1(LoopTask loopTask, Continuation<? super LoopTask$run$loopJob$1> continuation) {
        super(2, continuation);
        this.this$0 = loopTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LoopTask$run$loopJob$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LoopTask$run$loopJob$1 loopTask$run$loopJob$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                this.this$0.onDoTaskError(th);
                loopTask$run$loopJob$1 = this;
                coroutine_suspended = coroutine_suspended;
            }
        }
        loopTask$run$loopJob$1 = this;
        while (true) {
            Job job = loopTask$run$loopJob$1.this$0.loopJob;
            boolean z = false;
            if (job != null && job.isActive()) {
                z = true;
            }
            if (!z) {
                return Unit.INSTANCE;
            }
            try {
                loopTask$run$loopJob$1.this$0.beforeTask();
                loopTask$run$loopJob$1.this$0.task();
                loopTask$run$loopJob$1.this$0.afterTask();
                long jDelayed = loopTask$run$loopJob$1.this$0.delayed();
                loopTask$run$loopJob$1.label = 1;
                if (DelayKt.delay(jDelayed, loopTask$run$loopJob$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                Object obj2 = coroutine_suspended;
                LoopTask$run$loopJob$1 loopTask$run$loopJob$2 = loopTask$run$loopJob$1;
                loopTask$run$loopJob$2.this$0.onDoTaskError(th2);
                loopTask$run$loopJob$1 = loopTask$run$loopJob$2;
                coroutine_suspended = obj2;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LoopTask$run$loopJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
