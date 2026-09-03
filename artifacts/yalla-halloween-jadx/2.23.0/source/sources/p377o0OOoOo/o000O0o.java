package p377o0OOoOo;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f44230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f44231OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<ApiError, Unit> f44232OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<ApiResult<Object>, Unit> f44233OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(Function1 function1, Function1 function2, Function1 function3, boolean z) {
        super(1);
        this.f44230OooO0Oo = function1;
        this.f44232OooO0o0 = function2;
        this.f44231OooO0o = z;
        this.f44233OooO0oO = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        ApiResult<Object> result = apiResult;
        if (result.isSuccess()) {
            this.f44230OooO0Oo.invoke(result.getData());
        } else {
            Function1<ApiError, Unit> function1 = this.f44232OooO0o0;
            if (function1 != null) {
                function1.invoke(result.getError());
            }
            if (!this.f44231OooO0o) {
                ApiError error = result.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            }
        }
        Function1<ApiResult<Object>, Unit> function2 = this.f44233OooO0oO;
        if (function2 != null) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            function2.invoke(result);
        }
        return Unit.INSTANCE;
    }
}
