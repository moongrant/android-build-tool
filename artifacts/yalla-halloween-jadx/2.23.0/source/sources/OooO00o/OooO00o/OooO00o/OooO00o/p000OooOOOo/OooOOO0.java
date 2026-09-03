package OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo;

import OooOO0O.OooO0O0;
import OooOO0O.OooOO0;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.yallatech.support.platform.login.bean.WebAuthCodeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function1<WebAuthCodeBean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f76OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f77OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooO0O0 oooO0O0, OooOO0 oooOO1) {
        super(1);
        this.f76OooO0Oo = oooO0O0;
        this.f77OooO0o0 = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebAuthCodeBean webAuthCodeBean) {
        WebAuthCodeBean $receiver = webAuthCodeBean;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (Intrinsics.areEqual($receiver.getState(), this.f76OooO0Oo.f172OooO0OO.getStateCode())) {
            this.f77OooO0o0.f177OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, $receiver.getAuthorizationCode(), 0, null, 4));
        }
        return Unit.INSTANCE;
    }
}
