package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50599OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f50599OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = UserInfoEditActivity.f26818Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f50599OooO0Oo;
        userInfoEditActivity.OooOoO().f45663OooO0oo.setEnabled(false);
        OooO00o.OooO0OO(userInfoEditActivity, PermissionGroupReveal.f32339OooO0o, new g0(userInfoEditActivity), new i0(userInfoEditActivity));
        return Unit.INSTANCE;
    }
}
