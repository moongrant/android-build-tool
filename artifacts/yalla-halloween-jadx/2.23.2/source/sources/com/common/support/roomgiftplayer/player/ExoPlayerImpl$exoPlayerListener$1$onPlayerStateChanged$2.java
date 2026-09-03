package com.common.support.roomgiftplayer.player;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o0OOO0OO.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ExoPlayerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2(ExoPlayerImpl exoPlayerImpl, Continuation<? super ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2> continuation) {
        super(2, continuation);
        this.this$0 = exoPlayerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OooO0OO.OooO00o completionListener = this.this$0.getCompletionListener();
        if (completionListener != null) {
            completionListener.OooO0O0();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ExoPlayerImpl$exoPlayerListener$1$onPlayerStateChanged$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
