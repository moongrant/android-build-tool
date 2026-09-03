package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50425OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(UserInfoEditActivity userInfoEditActivity) {
        super(2);
        this.f50425OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        UserInfoEditActivity userInfoEditActivity = this.f50425OooO0Oo;
        if (zBooleanValue) {
            int i = UserInfoEditActivity.f26818Oooo0oO;
            userInfoEditActivity.OooOoO().f45662OooO0oO.setVisibility(8);
            userInfoEditActivity.OooOoO().f45666OooOO0o.setVisibility(0);
            userInfoEditActivity.OooOoO().f45659OooO0Oo.setVisibility(0);
        } else {
            int i2 = UserInfoEditActivity.f26818Oooo0oO;
            userInfoEditActivity.OooOoO().f45662OooO0oO.setVisibility(0);
            userInfoEditActivity.OooOoO().f45666OooOO0o.setVisibility(8);
            userInfoEditActivity.OooOoO().f45659OooO0Oo.setVisibility(8);
            userInfoEditActivity.OooOoO().f45657OooO0O0.setFocusable(false);
            userInfoEditActivity.OooOoO().f45657OooO0O0.setText(userInfoEditActivity.OooOoO().f45657OooO0O0.getText());
            userInfoEditActivity.OooOoO().f45657OooO0O0.setFocusableInTouchMode(false);
            userInfoEditActivity.OooOoO().f45657OooO0O0.postDelayed(new o0O00o0(userInfoEditActivity, 2), 200L);
        }
        return Unit.INSTANCE;
    }
}
