package p406o0Oo0Ooo;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicRepo$circleSingle$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicInfoRepository$loadTopicDetail$1", f = "TopicInfoRepository.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class g0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44826OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<TopicInfoModel>, Unit> f44827OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f44828OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(long j, Function1<? super Response<TopicInfoModel>, Unit> function1, Continuation<? super g0> continuation) {
        super(2, continuation);
        this.f44828OooO0o0 = j;
        this.f44827OooO0o = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g0(this.f44828OooO0o0, this.f44827OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44826OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strValueOf = String.valueOf(this.f44828OooO0o0);
            this.f44826OooO0Oo = 1;
            String url = o000OOo0.OooO0Oo(o0000O.f44156o0000OoO);
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strValueOf, "circleid");
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$circleSingle$$inlined$call$1(o0o0ooo, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objOooO0Oo = obj;
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        boolean zIsSuccess = apiResult.isSuccess();
        Function1<Response<TopicInfoModel>, Unit> function1 = this.f44827OooO0o;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, apiResult.getData(), false, null, 12, null));
        } else {
            function1.invoke(new Response<>(false, null, false, new Error(Boxing.boxInt(apiResult.getCode()), apiResult.getMessage()), 6, null));
        }
        return Unit.INSTANCE;
    }
}
