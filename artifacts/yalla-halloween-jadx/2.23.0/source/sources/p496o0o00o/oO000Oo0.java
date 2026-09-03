package p496o0o00o;

import com.google.android.material.search.Oooo000;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49136OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(UserInfoEditActivity userInfoEditActivity) {
        super(2);
        this.f49136OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        UserInfoEditActivity userInfoEditActivity = this.f49136OooO0Oo;
        if (zBooleanValue) {
            int i = UserInfoEditActivity.f27283Oooo0oO;
            userInfoEditActivity.OooOoO().f58082OooO0oO.setVisibility(8);
            userInfoEditActivity.OooOoO().f58086OooOO0o.setVisibility(0);
            userInfoEditActivity.OooOoO().f58079OooO0Oo.setVisibility(0);
        } else {
            int i2 = UserInfoEditActivity.f27283Oooo0oO;
            userInfoEditActivity.OooOoO().f58082OooO0oO.setVisibility(0);
            userInfoEditActivity.OooOoO().f58086OooOO0o.setVisibility(8);
            userInfoEditActivity.OooOoO().f58079OooO0Oo.setVisibility(8);
            userInfoEditActivity.OooOoO().f58077OooO0O0.setFocusable(false);
            userInfoEditActivity.OooOoO().f58077OooO0O0.setText(userInfoEditActivity.OooOoO().f58077OooO0O0.getText());
            userInfoEditActivity.OooOoO().f58077OooO0O0.setFocusableInTouchMode(false);
            userInfoEditActivity.OooOoO().f58077OooO0O0.postDelayed(new Oooo000(userInfoEditActivity, 1), 200L);
        }
        return Unit.INSTANCE;
    }
}
