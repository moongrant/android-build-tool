package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50543OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(UserInfoActivity userInfoActivity) {
        super(0);
        this.f50543OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity userInfoActivity = this.f50543OooO0Oo;
        userInfoActivity.OooOooo().closeReportLogs().observe(userInfoActivity, new o000oOoO(null, null, oOOO0OOO.f50541OooO0Oo, false, 11));
        return Unit.INSTANCE;
    }
}
