package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50581OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO000(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50581OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        UserInfoActivity userInfoActivity = this.f50581OooO0Oo;
        String str = userInfoActivity.f26780OooOo0O;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str)) {
            if (num2 != null && num2.intValue() == 1) {
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setVisibility(0);
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setImageResource(o0Oo0oo.me_top_icon_male);
            } else if (num2 != null && num2.intValue() == 0) {
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setVisibility(0);
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setImageResource(o0Oo0oo.me_top_icon_female);
            } else {
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45447OooOO0o.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }
}
