package p384o0OOoo0O;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p381o0OOoOo0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f43458OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f43459OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<ApiError, Unit> f43460OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<ApiResult<Object>, Unit> f43461OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Function1 function1, Function1 function2, Function1 function3, boolean z) {
        super(1);
        this.f43458OooO0Oo = function1;
        this.f43460OooO0o0 = function2;
        this.f43459OooO0o = z;
        this.f43461OooO0oO = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        ApiResult<Object> apiResult2 = apiResult;
        if (apiResult2.isSuccess()) {
            this.f43458OooO0Oo.invoke(apiResult2.getData());
        } else {
            Function1<ApiError, Unit> function1 = this.f43460OooO0o0;
            if (function1 != null) {
                function1.invoke(apiResult2.getError());
            }
            if (!this.f43459OooO0o) {
                ApiError error = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
            }
        }
        Function1<ApiResult<Object>, Unit> function2 = this.f43461OooO0oO;
        if (function2 != null) {
            Intrinsics.checkNotNull(apiResult2);
            function2.invoke(apiResult2);
        }
        return Unit.INSTANCE;
    }
}
