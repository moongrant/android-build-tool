package p436o0OoOOo;

import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function1<ApiResult<RechargeMenuCreateOrderResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47051OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o0000 o0000Var) {
        super(1);
        this.f47051OooO0Oo = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RechargeMenuCreateOrderResultModel> apiResult) {
        ApiResult<RechargeMenuCreateOrderResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        ((o0OOO00) this.f47051OooO0Oo.f47024OooO0O0.getValue()).dismiss();
        return Unit.INSTANCE;
    }
}
