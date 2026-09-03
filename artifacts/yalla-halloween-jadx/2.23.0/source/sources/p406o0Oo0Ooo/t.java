package p406o0Oo0Ooo;

import com.code.android.util.OooOOO;
import com.yalla.yalla.api.old.ApiSearch$searchTopicBlackList$$inlined$call$1;
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
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;
import p417o0OoO0.o00000O0;
import p579o0oOoo.oO000Oo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicBlackRepository$searchTopicBlackList$1", f = "TopicBlackRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f45147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f45148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f45149OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> f45150OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(long j, int i, String str, Function1<? super Response<ArrayList<TopicBlackUserModel>>, Unit> function1, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f45148OooO0o0 = j;
        this.f45147OooO0o = i;
        this.f45149OooO0oO = str;
        this.f45150OooO0oo = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new t(this.f45148OooO0o0, this.f45147OooO0o, this.f45149OooO0oO, this.f45150OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45146OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f45146OooO0Oo = 1;
            String strOooO0oO = o000OOo0.OooO0oO(o0000O.f44172o00Oo0);
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
            o0o0oooOooO00o.OooO0O0(String.valueOf(this.f45148OooO0o0), "circleid");
            o0o0oooOooO00o.OooO0O0(String.valueOf(this.f45147OooO0o), "pageindex");
            o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(this.f45149OooO0oO), "search");
            objOooO0Oo = OooOOO.OooO0Oo(new ApiSearch$searchTopicBlackList$$inlined$call$1(o0o0oooOooO00o, null), this);
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
        Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> function1 = this.f45150OooO0oo;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, apiResult.getData(), o00000O0.OooO00o((ArrayList) apiResult.getData()), null, 8, null));
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p375o0OOoOO.o00000O0(error, null), 3, null);
            function1.invoke(new Response<>(false, null, false, new Error(Boxing.boxInt(apiResult.getCode()), apiResult.getMessage()), 6, null));
        }
        return Unit.INSTANCE;
    }
}
