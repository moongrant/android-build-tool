package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO0O0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50582OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50582OooO0Oo = userInfoActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        boolean z = num2 == null;
        UserInfoActivity userInfoActivity = this.f50582OooO0Oo;
        if (z || (num2 != null && num2.intValue() == 0)) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45459OooOo0o.setVisibility(4);
        } else {
            UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26775Oooo0o;
            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45459OooOo0o.setVisibility(0);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            T value = o0O00oO0.OooOOO0().getValue();
            Intrinsics.checkNotNull(value);
            int iIntValue = ((Number) value).intValue();
            if (iIntValue == 1 || iIntValue == 8) {
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45459OooOo0o.setText(num2 + "+");
            } else {
                userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45459OooOo0o.setText("+" + num2);
            }
        }
        return Unit.INSTANCE;
    }
}
