package p436o0OoOOo;

import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function1<ApiResult<RechargeMenuConfirmOrderResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47050OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o0000 o0000Var) {
        super(1);
        this.f47050OooO0Oo = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RechargeMenuConfirmOrderResultModel> apiResult) {
        ApiResult<RechargeMenuConfirmOrderResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        o0000 o0000Var = this.f47050OooO0Oo;
        o0000Var.f47033OooOO0o = false;
        ((o0OOO00) o0000Var.f47024OooO0O0.getValue()).dismiss();
        return Unit.INSTANCE;
    }
}
