package p566o0oOo00O;

import OooOO0.OooO;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45321Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(UserInfoEditActivity userInfoEditActivity) {
        super(2);
        this.f45321Oooo0o = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        if (bool.booleanValue()) {
            UserInfoEditActivity userInfoEditActivity = this.f45321Oooo0o;
            UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
            userInfoEditActivity.OooOooo().f50498OooO0oO.setVisibility(8);
            this.f45321Oooo0o.OooOooo().f50502OooOO0o.setVisibility(0);
            this.f45321Oooo0o.OooOooo().f50495OooO0Oo.setVisibility(0);
        } else {
            UserInfoEditActivity userInfoEditActivity2 = this.f45321Oooo0o;
            UserInfoEditActivity.OooO00o oooO00o2 = UserInfoEditActivity.f23493o0ooOOo;
            userInfoEditActivity2.OooOooo().f50498OooO0oO.setVisibility(0);
            this.f45321Oooo0o.OooOooo().f50502OooOO0o.setVisibility(8);
            this.f45321Oooo0o.OooOooo().f50495OooO0Oo.setVisibility(8);
            this.f45321Oooo0o.OooOooo().f50493OooO0O0.setFocusable(false);
            this.f45321Oooo0o.OooOooo().f50493OooO0O0.setText(this.f45321Oooo0o.OooOooo().f50493OooO0O0.getText());
            this.f45321Oooo0o.OooOooo().f50493OooO0O0.setFocusableInTouchMode(false);
            this.f45321Oooo0o.OooOooo().f50493OooO0O0.postDelayed(new OooO(this.f45321Oooo0o, 4), 200L);
        }
        return Unit.INSTANCE;
    }
}
