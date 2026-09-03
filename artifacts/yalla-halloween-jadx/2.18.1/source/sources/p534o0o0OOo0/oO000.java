package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000 extends Lambda implements Function1<ApiResult<LoginModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43604Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f43604Oooo0o = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<LoginModel> apiResult) {
        ApiResult<LoginModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43604Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
