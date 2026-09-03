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
import p140o00OOooo.OooOO0;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.ApiRoomShareUtils$webApiRoomShareUrlList$1$1", f = "ApiRoomShareUtils.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiRoomShareUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiRoomShareUtils.kt\ncom/yalla/yalla/app/golbalData/ApiRoomShareUtils$webApiRoomShareUrlList$1$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,157:1\n62#2:158\n*S KotlinDebug\n*F\n+ 1 ApiRoomShareUtils.kt\ncom/yalla/yalla/app/golbalData/ApiRoomShareUtils$webApiRoomShareUrlList$1$1\n*L\n99#1:158\n*E\n"})
public final class ApiRoomShareUtils$webApiRoomShareUrlList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22718OooO0Oo;

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
        int i = this.f22718OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = o0000O.f44169o000OOo;
            ApiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1 apiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1 = new ApiRoomShareUtils$webApiRoomShareUrlList$1$1$invokeSuspend$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null);
            this.f22718OooO0Oo = 1;
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
        ApiRoomShareUtils.f22717OooO0Oo = true;
        ApiRoomShareUtils.f22715OooO0O0.set(false);
        ApiRoomShareUtils apiRoomShareUtils = ApiRoomShareUtils.f22714OooO00o;
        String strOooO00o = OooOO0.OooO00o((ApiResult) obj);
        apiRoomShareUtils.getClass();
        ApiRoomShareUtils.OooO0Oo(strOooO00o);
        return Unit.INSTANCE;
    }
}
