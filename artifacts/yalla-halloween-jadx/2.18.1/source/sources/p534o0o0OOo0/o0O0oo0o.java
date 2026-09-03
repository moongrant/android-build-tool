package p534o0o0OOo0;

import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo0o extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f43565Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        super(3);
        this.f43565Oooo0o = loginOnRoomDialogActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        LiveData<ApiResult<LoginListModel>> liveDataThirdLogin = ((LoginVM) this.f43565Oooo0o.f21771Ooooo0o.getValue()).thirdLogin(accessToken, type, str2);
        LoginOnRoomDialogActivity loginOnRoomDialogActivity = this.f43565Oooo0o;
        liveDataThirdLogin.observe(loginOnRoomDialogActivity, new o0000O00(loginOnRoomDialogActivity, 2));
        return Unit.INSTANCE;
    }
}
