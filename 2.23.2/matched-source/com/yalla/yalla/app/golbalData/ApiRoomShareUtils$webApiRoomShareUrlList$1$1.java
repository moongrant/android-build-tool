package com.yalla.yalla.app.golbalData;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p384o0OOoo0O.Oooo0;
import p391o0OOooo0.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.ApiRoomShareUtils$webApiRoomShareUrlList$1$1", f = "ApiRoomShareUtils.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiRoomShareUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiRoomShareUtils.kt\ncom/yalla/yalla/app/golbalData/ApiRoomShareUtils$webApiRoomShareUrlList$1$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,157:1\n62#2:158\n*S KotlinDebug\n*F\n+ 1 ApiRoomShareUtils.kt\ncom/yalla/yalla/app/golbalData/ApiRoomShareUtils$webApiRoomShareUrlList$1$1\n*L\n99#1:158\n*E\n"})
public final class ApiRoomShareUtils$webApiRoomShareUrlList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22245OooO0Oo;

    public ApiRoomShareUtils$webApiRoomShareUrlList$1$1(Continuation<? super ApiRoomShareUtils$webApiRoomShareUrlList$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ApiRoomShareUtils$webApiRoomShareUrlList$1$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new ApiRoomShareUtils$webApiRoomShareUrlList$1$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22245OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = Oooo0.f43428o000OOo;
            ApiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1 apiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1 = new ApiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1(oo000o.OooO00o(str, "url", str, 0), null);
            this.f22245OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(apiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiRoomShareUtils.f22244OooO0Oo = true;
        ApiRoomShareUtils.f22242OooO0O0.set(false);
        ApiRoomShareUtils apiRoomShareUtils = ApiRoomShareUtils.f22241OooO00o;
        String strOooO00o = OooO.OooO00o((ApiResult) obj);
        apiRoomShareUtils.getClass();
        ApiRoomShareUtils.OooO0Oo(strOooO00o);
        return Unit.INSTANCE;
    }
}
