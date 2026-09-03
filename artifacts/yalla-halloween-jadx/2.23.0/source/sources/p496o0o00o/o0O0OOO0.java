package p496o0o00o;

import androidx.camera.core.impl.o00OOO00;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.UserNameView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49075OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49075OooO0Oo = userInfoActivity;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        boolean z;
        String str2 = str;
        UserInfoActivity userInfoActivity = this.f49075OooO0Oo;
        String str3 = userInfoActivity.f27245OooOo0O;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str3)) {
            userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57697OooOoO0.setText(str2);
            UserNameView userNameView = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57697OooOoO0;
            Pair pair = (Pair) o000000O.OooOO0().getValue();
            if (pair != null && ((Number) pair.getFirst()).intValue() == VipState.Vip.getValue()) {
                Pair pair2 = (Pair) o000000O.OooOO0().getValue();
                z = (pair2 != null ? ((Number) pair2.getSecond()).intValue() : 0) >= VipLevel.Vip4.getValue();
            }
            userNameView.setFlash(z);
        }
        return Unit.INSTANCE;
    }
}
