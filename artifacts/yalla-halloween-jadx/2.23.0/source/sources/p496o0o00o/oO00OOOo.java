package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49143OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f49143OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = UserInfoEditActivity.f27283Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f49143OooO0Oo;
        userInfoEditActivity.OooOoO().f58083OooO0oo.setEnabled(false);
        OooO00o.OooO0OO(userInfoEditActivity, PermissionGroupReveal.f32883OooO0o, new oO00o0(userInfoEditActivity), new oOo00ooO(userInfoEditActivity));
        return Unit.INSTANCE;
    }
}
