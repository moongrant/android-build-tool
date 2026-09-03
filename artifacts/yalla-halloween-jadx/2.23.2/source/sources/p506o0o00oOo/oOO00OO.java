package p506o0o00oOo;

import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.UserNameView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00OO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50522OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00OO(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50522OooO0Oo = userInfoActivity;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        boolean z;
        String str2 = str;
        UserInfoActivity userInfoActivity = this.f50522OooO0Oo;
        String str3 = userInfoActivity.f26780OooOo0O;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str3)) {
            userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45461OooOoO0.setText(str2);
            UserNameView userNameView = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45461OooOoO0;
            Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
            if (pair != null && ((Number) pair.getFirst()).intValue() == VipState.Vip.getValue()) {
                Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
                z = (pair2 != null ? ((Number) pair2.getSecond()).intValue() : 0) >= VipLevel.Vip4.getValue();
            }
            userNameView.setFlash(z);
        }
        return Unit.INSTANCE;
    }
}
