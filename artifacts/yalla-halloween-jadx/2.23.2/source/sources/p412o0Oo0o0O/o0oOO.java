package p412o0Oo0o0O;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicRepo$checkTopicInfoAvailable$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
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
import p384o0OOoo0O.Oooo0;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicCreateRepository$checkTopicName$1", f = "TopicCreateRepository.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class o0oOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46342OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<Boolean>, Unit> f46343OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f46344OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oOO(String str, Function1<? super Response<Boolean>, Unit> function1, Continuation<? super o0oOO> continuation) {
        super(2, continuation);
        this.f46344OooO0o0 = str;
        this.f46343OooO0o = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0oOO(this.f46344OooO0o0, this.f46343OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0oOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46342OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strOooOO0 = o00O00OO.OooOO0(this.f46344OooO0o0);
            this.f46342OooO0Oo = 1;
            String url = oo000o.OooO0Oo(Oooo0.f43412o0000OOo);
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strOooOO0, "checkValue");
            o0ooooo.OooO0O0(String.valueOf(1), "type");
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$checkTopicInfoAvailable$$inlined$call$1(o0ooooo, null), this);
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
        Function1<Response<Boolean>, Unit> function1 = this.f46343OooO0o;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, Boxing.boxBoolean(true), false, null, 12, null));
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            function1.invoke(new Response<>(false, Boxing.boxBoolean(false), false, null, 12, null));
        }
        return Unit.INSTANCE;
    }
}
