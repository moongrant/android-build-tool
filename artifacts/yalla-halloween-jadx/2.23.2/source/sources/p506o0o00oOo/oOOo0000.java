package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50544OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0000(UserInfoActivity userInfoActivity) {
        super(0);
        this.f50544OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("103019");
        UserInfoActivity userInfoActivity = this.f50544OooO0Oo;
        userInfoActivity.OooOooo().reportPublish().observe(userInfoActivity, new o000oOoO(new oOOOOo0O(userInfoActivity), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
