package p406o0Oo0Ooo;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicRepo$circlePersonal$$inlined$call$1;
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
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicInfoRepository$loadUserTopicListAll$1", f = "TopicInfoRepository.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class h0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44830OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f44831OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f44832OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Integer f44833OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<ArrayList<TopicInfoModel>>, Unit> f44834OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(String str, String str2, Integer num, Function1<? super Response<ArrayList<TopicInfoModel>>, Unit> function1, Continuation<? super h0> continuation) {
        super(2, continuation);
        this.f44832OooO0o0 = str;
        this.f44831OooO0o = str2;
        this.f44833OooO0oO = num;
        this.f44834OooO0oo = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new h0(this.f44832OooO0o0, this.f44831OooO0o, this.f44833OooO0oO, this.f44834OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((h0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44830OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Integer numBoxInt = Boxing.boxInt(1);
            this.f44830OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo(o0000O.f44161o0000o0o);
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0o0oooOooO00o.OooO0O0(String.valueOf(this.f44833OooO0oO), "pageindex");
            o0o0oooOooO00o.OooO0O0(this.f44832OooO0o0, "touserid");
            o0o0oooOooO00o.OooO0O0(String.valueOf(numBoxInt), "type");
            o0o0oooOooO00o.OooO0O0(this.f44831OooO0o, "datesort");
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$circlePersonal$$inlined$call$1(o0o0oooOooO00o, null), this);
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
        Function1<Response<ArrayList<TopicInfoModel>>, Unit> function1 = this.f44834OooO0oo;
        if (zIsSuccess) {
            int pageSize = apiResult.getPage().getPageSize();
            Object data = apiResult.getData();
            ArrayList arrayList = (ArrayList) apiResult.getData();
            Response<ArrayList<TopicInfoModel>> response = new Response<>(true, data, (arrayList != null ? arrayList.size() : 0) < pageSize, null, 8, null);
            response.getPage().setPageIndex(apiResult.getPage().getPageIndex());
            response.getPage().setPageSize(pageSize);
            response.getPage().setDateSort(apiResult.getPage().getDateSort());
            function1.invoke(response);
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            function1.invoke(new Response<>(false, null, false, new Error(Boxing.boxInt(apiResult.getCode()), apiResult.getMessage()), 6, null));
        }
        return Unit.INSTANCE;
    }
}
