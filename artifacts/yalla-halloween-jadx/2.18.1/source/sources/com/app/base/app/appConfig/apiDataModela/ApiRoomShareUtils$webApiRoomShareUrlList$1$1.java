package com.app.base.app.appConfig.apiDataModela;

import com.yalla.yalla.common.model.ApiResult;
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
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o0000O0;
import p516o0o0O000.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.app.base.app.appConfig.apiDataModela.ApiRoomShareUtils$webApiRoomShareUrlList$1$1", f = "ApiRoomShareUtils.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class ApiRoomShareUtils$webApiRoomShareUrlList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;

    public ApiRoomShareUtils$webApiRoomShareUrlList$1$1(Continuation<? super ApiRoomShareUtils$webApiRoomShareUrlList$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ApiRoomShareUtils$webApiRoomShareUrlList$1$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ApiRoomShareUtils$webApiRoomShareUrlList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32280o00000;
            ApiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1 apiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1 = new ApiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1(OooO00o.OooO0O0(str, "url", str, 0), null);
            this.label = 1;
            obj = o0000O0.OooO0OO(apiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiRoomShareUtils apiRoomShareUtils = ApiRoomShareUtils.INSTANCE;
        ApiRoomShareUtils.hasGetWepApi = true;
        ApiRoomShareUtils.isRun.set(false);
        apiRoomShareUtils.toShareMapForResponse(o0Oo0oo.OooO0O0((ApiResult) obj));
        return Unit.INSTANCE;
    }
}
