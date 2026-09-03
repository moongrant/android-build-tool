package p003OooO0o0;

import OooO0O0.OooO0o;
import OooO0O0.OooOo00;
import OooO0OO.OooOO0O;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f139OooO0O0;

    public o0OO00O(@NotNull o00Oo0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f139OooO0O0 = baseClient;
    }

    public final void OooO0o(OooO0o oooO0o) {
        Pair<String, String>[] pairArr = OooOO0O.f110OooO00o;
        BizResponse bizResponseOooO00o = OooOO0O.OooO00o(YCSDKOpenKit.getAppId$lib_release(), oooO0o);
        boolean zIsSuccess = bizResponseOooO00o.isSuccess();
        o00Oo0 o00oo1 = this.f139OooO0O0;
        if (!zIsSuccess) {
            o00oo1.OooO0Oo(o00oo1.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
            return;
        }
        AppStatus appStatus = (AppStatus) bizResponseOooO00o.getData();
        if (appStatus == null) {
            o00oo1.OooO0Oo(o00oo1.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
            return;
        }
        int status = appStatus.getStatus();
        if (status != 1) {
            if (status != 2) {
                o00oo1.OooO0Oo(o00oo1.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                return;
            } else {
                o00oo1.OooO0Oo(o00oo1.OooO00o(100010, bizResponseOooO00o.getMessage()));
                return;
            }
        }
        o0Oo0oo o0oo0oo2 = o00oo1.f132OooO0Oo;
        if (o0oo0oo2 != null) {
            o0oo0oo2.f144OooO0O0 = appStatus;
        }
        o00oo1.OooO0oo();
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        OooOo00 oooOo00;
        o00Oo0 o00oo1 = this.f139OooO0O0;
        o0Oo0oo o0oo0oo2 = o00oo1.f132OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f143OooO00o) == null) {
            oooOo00 = null;
        } else if (oo000o.OooO0Oo()) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new o0OOO0o(0, this, oooOo00));
        } else {
            OooO0o(oooOo00);
        }
        if (oooOo00 == null) {
            o00oo1.OooO0Oo(o00oo1.OooO00o(-2002, "appInfo is null"));
        }
    }
}
