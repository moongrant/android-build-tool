package p474o0o00;

import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function1<ApiResult<LoginModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47320OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f47320OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<LoginModel> apiResult) {
        ApiResult<LoginModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47320OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
