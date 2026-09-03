package p375o0OOoOO;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO implements FlowCollector<ApiResult<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000<Object> f44053OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f44054OooO0o0;

    public o00000OO(o0000<Object> o0000Var, boolean z) {
        this.f44053OooO0Oo = o0000Var;
        this.f44054OooO0o0 = z;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(ApiResult<Object> apiResult, Continuation continuation) {
        ApiResult<Object> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        o0000<Object> o0000Var = this.f44053OooO0Oo;
        if (!zIsSuccess || apiResult2.getData() == null) {
            ApiError error = (apiResult2.isSuccess() && apiResult2.getData() == null) ? new ApiError(2, null, null, 6, null) : apiResult2.getError();
            o0000Var.getClass();
            if (!this.f44054OooO0o0) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            }
        } else {
            Function1<? super Object, Unit> function1 = o0000Var.f44046OooO00o;
            if (function1 != null) {
                Object data = apiResult2.getData();
                Intrinsics.checkNotNull(data);
                function1.invoke(data);
            }
        }
        Function1<? super ApiResult<Object>, Unit> function2 = o0000Var.f44047OooO0O0;
        if (function2 != null) {
            function2.invoke(apiResult2);
        }
        return Unit.INSTANCE;
    }
}
