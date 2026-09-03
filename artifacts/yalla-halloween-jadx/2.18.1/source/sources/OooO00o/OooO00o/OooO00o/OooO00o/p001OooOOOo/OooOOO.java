package OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo;

import OooOO0.OooOO0;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f53Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOO0 oooOO1) {
        super(0);
        this.f53Oooo0o = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f53Oooo0o.f150OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, ResponseInfo.TimedOut, "Auth Rejected", 1));
        return Unit.INSTANCE;
    }
}
