package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49090OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49090OooO0Oo = userInfoActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer num2 = num;
        boolean z = num2 == null;
        UserInfoActivity userInfoActivity = this.f49090OooO0Oo;
        if (z || (num2 != null && num2.intValue() == 0)) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57703Oooo000.setVisibility(4);
        } else {
            UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57703Oooo000.setVisibility(0);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            T value = o000000O.OooOOO0().getValue();
            Intrinsics.checkNotNull(value);
            int iIntValue = ((Number) value).intValue();
            if (iIntValue == 1 || iIntValue == 8) {
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57703Oooo000.setText(num2 + "+");
            } else {
                userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57703Oooo000.setText("+" + num2);
            }
        }
        return Unit.INSTANCE;
    }
}
