package p534o0o0OOo0;

import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p501o0o00o.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43582Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0(SmsCodeActivity smsCodeActivity) {
        super(3);
        this.f43582Oooo0o = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        SmsCodeActivity smsCodeActivity = this.f43582Oooo0o;
        SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
        LiveData<ApiResult<LoginListModel>> liveDataThirdLogin = smsCodeActivity.Oooo0O0().thirdLogin(accessToken, type, str2);
        SmsCodeActivity smsCodeActivity2 = this.f43582Oooo0o;
        liveDataThirdLogin.observe(smsCodeActivity2, new o0000oo(smsCodeActivity2, 2));
        return Unit.INSTANCE;
    }
}
