package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49102OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(UserInfoActivity userInfoActivity) {
        super(0);
        this.f49102OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103019");
        UserInfoActivity userInfoActivity = this.f49102OooO0Oo;
        userInfoActivity.OooOooo().reportPublish().observe(userInfoActivity, new o0000OO0(new o0OOO0OO(userInfoActivity), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
