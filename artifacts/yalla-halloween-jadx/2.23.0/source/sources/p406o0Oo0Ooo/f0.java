package p406o0Oo0Ooo;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicRepo$circleSearchRmdList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;
import p376o0OOoOOO.o000OOo0;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicInfoRepository$loadSearchRecommendTopic$1", f = "TopicInfoRepository.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class f0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44820OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<ArrayList<TopicInfoModel>>, Unit> f44821OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(Function1<? super Response<ArrayList<TopicInfoModel>>, Unit> function1, Continuation<? super f0> continuation) {
        super(2, continuation);
        this.f44821OooO0o0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f0(this.f44821OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44820OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f44820OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo(o0000O.f44160o0000o0O);
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$circleSearchRmdList$$inlined$call$1(o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0), null), this);
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
        Function1<Response<ArrayList<TopicInfoModel>>, Unit> function1 = this.f44821OooO0o0;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, apiResult.getData(), false, null, 12, null));
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            function1.invoke(new Response<>(false, null, false, new Error(Boxing.boxInt(apiResult.getCode()), apiResult.getMessage()), 6, null));
        }
        return Unit.INSTANCE;
    }
}
