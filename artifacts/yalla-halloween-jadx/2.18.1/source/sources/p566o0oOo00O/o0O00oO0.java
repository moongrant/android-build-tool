package p566o0oOo00O;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45301Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(UserInfoActivity userInfoActivity) {
        super(0);
        this.f45301Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity userInfoActivity = this.f45301Oooo0o;
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        userInfoActivity.Oooo0().closeReportLogs().observe(this.f45301Oooo0o, new OooOo(null, null, o0O00o00.f45300Oooo0o, false, 11));
        return Unit.INSTANCE;
    }
}
