package com.yalla.yalla.common.manager;

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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.manager.RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1", f = "RoomEffectGiftPlayer.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
public final class RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ RoomEffectGiftPlayer.EffectGiftModel $giftModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1(RoomEffectGiftPlayer.EffectGiftModel effectGiftModel, Continuation<? super RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1> continuation) {
        super(2, continuation);
        this.$giftModel = effectGiftModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1(this.$giftModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return ((RoomEffectGiftPlayer$createGiftInfo$videoFilePath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GiftVideoManager giftVideoManager = GiftVideoManager.INSTANCE;
            String giftVideoUrl = this.$giftModel.getGiftVideoUrl();
            this.label = 1;
            obj = giftVideoManager.getVideoFilePathByUrl(giftVideoUrl, this);
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
}
