package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f49056OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f49056OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        ApiResult<Object> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = SmsCodeActivity.f24843Oooo0;
        SmsCodeActivity smsCodeActivity = this.f49056OooO0Oo;
        smsCodeActivity.Oooo00O(false);
        smsCodeActivity.OooOo0();
        return Unit.INSTANCE;
    }
}
