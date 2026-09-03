package p412o0Oo0o0O;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.CircleCreateCheck;
import com.yalla.yalla.data.repository.TopicRepo$checkCreateTopicState$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicCreateCheckModel;
import com.yalla.yalla.model.topic.TopicState;
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
import p380o0OOoOo.oo000o;
import p381o0OOoOo0.Oooo000;
import p384o0OOoo0O.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicCreateRepository$checkCreateTopicState$1", f = "TopicCreateRepository.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
public final class o00OOOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46243OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<TopicCreateCheckModel>, Unit> f46244OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOOOo(Function1<? super Response<TopicCreateCheckModel>, Unit> function1, Continuation<? super o00OOOOo> continuation) {
        super(2, continuation);
        this.f46244OooO0o0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OOOOo(this.f46244OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OOOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        TopicState topicState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46243OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f46243OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo(Oooo0.f43411o0000OOO);
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$checkCreateTopicState$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0), null), this);
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
        Function1<Response<TopicCreateCheckModel>, Unit> function1 = this.f46244OooO0o0;
        if (zIsSuccess) {
            Response<TopicCreateCheckModel> response = new Response<>(true, null, false, null, 14, null);
            TopicCreateCheckModel topicCreateCheckModel = new TopicCreateCheckModel(null, null, null, null, 15, null);
            CircleCreateCheck circleCreateCheck = (CircleCreateCheck) apiResult.getData();
            Integer numBoxInt = circleCreateCheck != null ? Boxing.boxInt(circleCreateCheck.getCircleState()) : null;
            if (numBoxInt != null && numBoxInt.intValue() == 0) {
                topicState = TopicState.NULL;
            } else if (numBoxInt != null && numBoxInt.intValue() == 1) {
                topicState = TopicState.REVIEW;
            } else {
                topicState = (numBoxInt != null && numBoxInt.intValue() == 2) ? TopicState.CREATED : TopicState.NULL;
            }
            topicCreateCheckModel.setTopicState(topicState);
            CircleCreateCheck circleCreateCheck2 = (CircleCreateCheck) apiResult.getData();
            topicCreateCheckModel.setKeepLaw(circleCreateCheck2 != null ? Boxing.boxInt(circleCreateCheck2.getCheckPower()) : null);
            CircleCreateCheck circleCreateCheck3 = (CircleCreateCheck) apiResult.getData();
            topicCreateCheckModel.setRegTime(circleCreateCheck3 != null ? Boxing.boxInt(circleCreateCheck3.getCheckRegTime()) : null);
            CircleCreateCheck circleCreateCheck4 = (CircleCreateCheck) apiResult.getData();
            topicCreateCheckModel.setUserLevel(circleCreateCheck4 != null ? Boxing.boxInt(circleCreateCheck4.getCheckUserLevel()) : null);
            response.setData(topicCreateCheckModel);
            function1.invoke(response);
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            function1.invoke(new Response<>(false, null, false, null, 14, null));
        }
        return Unit.INSTANCE;
    }
}
