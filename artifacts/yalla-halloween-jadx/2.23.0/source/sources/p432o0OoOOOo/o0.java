package p432o0OoOOOo;

import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function1<ApiResult<RechargeMenuCreateOrderResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45916OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(o00OOOOo o00ooooo2) {
        super(1);
        this.f45916OooO0Oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RechargeMenuCreateOrderResultModel> apiResult) {
        ApiResult<RechargeMenuCreateOrderResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        ((oO00O0oO) this.f45916OooO0Oo.f45921OooO0O0.getValue()).dismiss();
        return Unit.INSTANCE;
    }
}
