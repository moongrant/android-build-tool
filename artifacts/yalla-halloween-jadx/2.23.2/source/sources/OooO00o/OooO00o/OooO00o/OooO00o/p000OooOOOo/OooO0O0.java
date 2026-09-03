package OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo;

import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy<OooO0O0> f71OooO00o = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) OooO00o.f72OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f72OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0O0 invoke() {
            return new OooO0O0();
        }
    }

    @Override // p003OooO0o0.o0ooOOo
    @NotNull
    public final BaseResp OooO0O0() {
        return AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -1002, "Auth Canceled", 1);
    }

    @Override // p003OooO0o0.o0ooOOo
    public final int OooO0o0() {
        return YCSDKCallbackManagerImpl.RequestCodeOffset.Login.OooO00o();
    }
}
