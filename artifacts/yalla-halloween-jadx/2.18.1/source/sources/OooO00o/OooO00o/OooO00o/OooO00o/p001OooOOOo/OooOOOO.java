package OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo;

import OooOO0.OooOO0;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.yallatech.support.platform.login.bean.ErrorCodeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends Lambda implements Function1<ErrorCodeBean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f56Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooOO0 oooOO1) {
        super(1);
        this.f56Oooo0o = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ErrorCodeBean errorCodeBean) {
        ErrorCodeBean $receiver = errorCodeBean;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.f56Oooo0o.f150OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, $receiver.getErrorCode(), null, 5));
        return Unit.INSTANCE;
    }
}
