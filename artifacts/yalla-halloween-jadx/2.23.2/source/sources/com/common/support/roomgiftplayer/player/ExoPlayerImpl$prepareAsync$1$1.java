package com.common.support.roomgiftplayer.player;

import androidx.media3.exoplayer.OooO;
import androidx.media3.exoplayer.source.OooOOOO;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.player.ExoPlayerImpl$prepareAsync$1$1", f = "ExoPlayerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExoPlayerImpl$prepareAsync$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OooOOOO $it;
    int label;
    final /* synthetic */ ExoPlayerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerImpl$prepareAsync$1$1(ExoPlayerImpl exoPlayerImpl, OooOOOO oooOOOO, Continuation<? super ExoPlayerImpl$prepareAsync$1$1> continuation) {
        super(2, continuation);
        this.this$0 = exoPlayerImpl;
        this.$it = oooOOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ExoPlayerImpl$prepareAsync$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ((OooO) this.this$0.exoPlayer).o0ooOO0(this.$it);
        ((OooO) this.this$0.exoPlayer).OooO0o0();
        ((OooO) this.this$0.exoPlayer).o0OOO0o(true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ExoPlayerImpl$prepareAsync$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
