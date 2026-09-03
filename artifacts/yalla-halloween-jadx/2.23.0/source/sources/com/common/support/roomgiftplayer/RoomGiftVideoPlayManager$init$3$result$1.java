package com.common.support.roomgiftplayer;

import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.RoomGiftVideoPlayManager$init$3$result$1", f = "RoomGiftVideoPlayManager.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomGiftVideoPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftVideoPlayManager.kt\ncom/common/support/roomgiftplayer/RoomGiftVideoPlayManager$init$3$result$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,203:1\n314#2,11:204\n*S KotlinDebug\n*F\n+ 1 RoomGiftVideoPlayManager.kt\ncom/common/support/roomgiftplayer/RoomGiftVideoPlayManager$init$3$result$1\n*L\n59#1:204,11\n*E\n"})
public final class RoomGiftVideoPlayManager$init$3$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ VideoModel $videoModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomGiftVideoPlayManager$init$3$result$1(VideoModel videoModel, Continuation<? super RoomGiftVideoPlayManager$init$3$result$1> continuation) {
        super(2, continuation);
        this.$videoModel = videoModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RoomGiftVideoPlayManager$init$3$result$1(this.$videoModel, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            VideoModel videoModel = this.$videoModel;
            this.L$0 = videoModel;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            RoomGiftVideoPlayDownloadManager.INSTANCE.waitToPlayVideoModel$RoomGiftVideoPlayer_release(videoModel, cancellableContinuationImpl);
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((RoomGiftVideoPlayManager$init$3$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
