package p412o0Oo0o0O;

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
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicInfoRepository$loadTopicDetail$1", f = "TopicInfoRepository.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOoOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46331OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<TopicInfoModel>, Unit> f46332OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f46333OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOoOo(long j, Function1<? super Response<TopicInfoModel>, Unit> function1, Continuation<? super o0OoOoOo> continuation) {
        super(2, continuation);
        this.f46333OooO0o0 = j;
        this.f46332OooO0o = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoOoOo(this.f46333OooO0o0, this.f46332OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoOoOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46331OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strValueOf = String.valueOf(this.f46333OooO0o0);
            this.f46331OooO0Oo = 1;
            String url = oo000o.OooO0Oo(Oooo0.f43415o0000OoO);
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strValueOf, "circleid");
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$circleSingle$$inlined$call$1(o0ooooo, null), this);
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
        Function1<Response<TopicInfoModel>, Unit> function1 = this.f46332OooO0o;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, apiResult.getData(), false, null, 12, null));
        } else {
            function1.invoke(new Response<>(false, null, false, new Error(Boxing.boxInt(apiResult.getCode()), apiResult.getMessage()), 6, null));
        }
        return Unit.INSTANCE;
    }
}
