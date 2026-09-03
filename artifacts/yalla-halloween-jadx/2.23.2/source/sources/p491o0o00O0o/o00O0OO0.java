package p491o0o00O0o;

import com.yalla.yalla.mixedroom.OooO0OO;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f48981OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        super(3);
        this.f48981OooO0Oo = loginOnRoomDialogActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        LoginOnRoomDialogActivity loginOnRoomDialogActivity = this.f48981OooO0Oo;
        ((LoginVM) loginOnRoomDialogActivity.f24740OooOo0.getValue()).thirdLogin(accessToken, type, str2).observe(loginOnRoomDialogActivity, new OooO0OO(loginOnRoomDialogActivity, 1));
        return Unit.INSTANCE;
    }
}
