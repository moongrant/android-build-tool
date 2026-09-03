package p381o0OOoOo0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOO0o.OooO0O0;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O<T> f43268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f43269OooO0o0;

    public o000oOoO(o00O0O<T> o00o0o2, boolean z) {
        this.f43268OooO0Oo = o00o0o2;
        this.f43269OooO0o0 = z;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ApiResult apiResult = (ApiResult) obj;
        boolean zIsSuccess = apiResult.isSuccess();
        o00O0O<T> o00o0o2 = this.f43268OooO0Oo;
        if (!zIsSuccess || apiResult.getData() == null) {
            ApiError error = (apiResult.isSuccess() && apiResult.getData() == null) ? new ApiError(2, null, null, 6, null) : apiResult.getError();
            o00o0o2.getClass();
            if (!this.f43269OooO0o0) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            }
        } else {
            Function1<? super T, Unit> function1 = o00o0o2.f43270OooO00o;
            if (function1 != null) {
                OooO0O0 oooO0O0 = (Object) apiResult.getData();
                Intrinsics.checkNotNull(oooO0O0);
                function1.invoke(oooO0O0);
            }
        }
        Function1<? super ApiResult<T>, Unit> function2 = o00o0o2.f43271OooO0O0;
        if (function2 != null) {
            function2.invoke(apiResult);
        }
        return Unit.INSTANCE;
    }
}
