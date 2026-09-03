package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0Ooooo extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43618Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f43618Oooo0o = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        ApiResult<Object> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        SmsCodeActivity smsCodeActivity = this.f43618Oooo0o;
        SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
        smsCodeActivity.Oooo0o0(false);
        this.f43618Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
