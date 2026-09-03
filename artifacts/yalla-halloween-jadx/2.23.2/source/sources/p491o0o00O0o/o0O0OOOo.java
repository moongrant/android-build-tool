package p491o0o00O0o;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function1<ApiResult<LoginListModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f49025OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f49025OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<LoginListModel> apiResult) {
        if (apiResult.isSuccess()) {
            this.f49025OooO0Oo.finish();
        }
        return Unit.INSTANCE;
    }
}
