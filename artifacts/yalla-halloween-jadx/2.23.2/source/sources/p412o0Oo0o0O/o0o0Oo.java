package p412o0Oo0o0O;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicRepo$circleBlackList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
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
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p381o0OOoOo0.Oooo000;
import p423o0OoO0OO.o000OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicBlackRepository$loadBlackListUser$1", f = "TopicBlackRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class o0o0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f46335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f46336OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Long f46337OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> f46338OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0o0Oo(long j, int i, Long l, Function1<? super Response<ArrayList<TopicBlackUserModel>>, Unit> function1, Continuation<? super o0o0Oo> continuation) {
        super(2, continuation);
        this.f46336OooO0o0 = j;
        this.f46335OooO0o = i;
        this.f46337OooO0oO = l;
        this.f46338OooO0oo = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0o0Oo(this.f46336OooO0o0, this.f46335OooO0o, this.f46337OooO0oO, this.f46338OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0o0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46334OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strValueOf = String.valueOf(this.f46337OooO0oO);
            this.f46334OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Circle/CircleBlackList");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(String.valueOf(this.f46336OooO0o0), "circleid");
            o0oooooOooO00o.OooO0O0(String.valueOf(this.f46335OooO0o), "pageindex");
            o0oooooOooO00o.OooO0O0(strValueOf, "datesort");
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$circleBlackList$$inlined$call$1(o0oooooOooO00o, null), this);
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
        Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> function1 = this.f46338OooO0oo;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, apiResult.getData(), o000OOo0.OooO00o((ArrayList) apiResult.getData()), null, 8, null));
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            function1.invoke(new Response<>(false, null, false, new Error(Boxing.boxInt(apiResult.getCode()), apiResult.getMessage()), 6, null));
        }
        return Unit.INSTANCE;
    }
}
