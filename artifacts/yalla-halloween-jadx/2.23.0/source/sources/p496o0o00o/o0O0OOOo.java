package p496o0o00o;

import androidx.camera.core.impl.o00OOO00;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49076OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49076OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        UserInfoActivity userInfoActivity = this.f49076OooO0Oo;
        String str = userInfoActivity.f27245OooOo0O;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str)) {
            if (num2 != null && num2.intValue() == 1) {
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setVisibility(0);
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setImageResource(oOo00OO0.me_top_icon_male);
            } else if (num2 != null && num2.intValue() == 0) {
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setVisibility(0);
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setImageResource(oOo00OO0.me_top_icon_female);
            } else {
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57683OooOO0o.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}
