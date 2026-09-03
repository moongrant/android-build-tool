package OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo;

import OooOO0.OooO0O0;
import OooOO0.OooOO0;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.yallatech.support.platform.login.bean.WebAuthCodeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function1<WebAuthCodeBean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f54Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f55Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooO0O0 oooO0O0, OooOO0 oooOO1) {
        super(1);
        this.f54Oooo0o = oooO0O0;
        this.f55Oooo0oO = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebAuthCodeBean webAuthCodeBean) {
        WebAuthCodeBean $receiver = webAuthCodeBean;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (Intrinsics.areEqual($receiver.getState(), this.f54Oooo0o.f146OooO0OO.getStateCode())) {
            this.f55Oooo0oO.f150OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, $receiver.getAuthorizationCode(), 0, null, 4));
        }
        return Unit.INSTANCE;
    }
}
