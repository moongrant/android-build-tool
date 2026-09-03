package p406o0Oo0Ooo;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicRepo$createTopic$$inlined$call$1;
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
import p375o0OOoOO.o00000O0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;
import p417o0OoO0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.TopicCreateRepository$createTopic$1", f = "TopicCreateRepository.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f45160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f45161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f45162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<Boolean>, Unit> f45163OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(String str, String str2, String str3, Function1<? super Response<Boolean>, Unit> function1, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f45161OooO0o0 = str;
        this.f45160OooO0o = str2;
        this.f45162OooO0oO = str3;
        this.f45163OooO0oo = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new x(this.f45161OooO0o0, this.f45160OooO0o, this.f45162OooO0oO, this.f45163OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45159OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String strOooOO0 = o0000O0O.OooOO0(this.f45160OooO0o);
            String strOooOO1 = o0000O0O.OooOO0(this.f45162OooO0oO);
            this.f45159OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo(o0000O.f44155o0000Oo0);
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0o0oooOooO00o.OooO0O0(this.f45161OooO0o0, "cirImage");
            o0o0oooOooO00o.OooO0O0(strOooOO0, "cirName");
            o0o0oooOooO00o.OooO0O0(strOooOO1, "cirDescribe");
            objOooO0Oo = OooOOO.OooO0Oo(new TopicRepo$createTopic$$inlined$call$1(o0o0oooOooO00o, null), this);
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
        Function1<Response<Boolean>, Unit> function1 = this.f45163OooO0oo;
        if (zIsSuccess) {
            function1.invoke(new Response<>(true, Boxing.boxBoolean(true), false, null, 12, null));
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            function1.invoke(new Response<>(false, Boxing.boxBoolean(false), false, null, 12, null));
        }
        return Unit.INSTANCE;
    }
}
