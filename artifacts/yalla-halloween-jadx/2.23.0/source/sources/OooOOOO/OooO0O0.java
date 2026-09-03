package OooOOOO;

import OooO0O0.OooOo00;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f187OooO0O0;

    public OooO0O0(@NotNull o00Oo0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f187OooO0O0 = baseClient;
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        final OooOo00 oooOo00;
        o00Oo0 o00oo1 = this.f187OooO0O0;
        o0Oo0oo o0oo0oo2 = o00oo1.f132OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f143OooO00o) == null) {
            oooOo00 = null;
        } else {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooOOOO.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    OooO0O0 this$0 = this.f185OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    OooO0O0.OooO0o this_apply = oooOo00;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    this$0.getClass();
                    Pair<String, String>[] pairArr = OooO0OO.OooOO0O.f110OooO00o;
                    BizResponse bizResponseOooO00o = OooO0OO.OooOO0O.OooO00o(YCSDKOpenKit.getAppId$lib_release(), this_apply);
                    boolean zIsSuccess = bizResponseOooO00o.isSuccess();
                    o00Oo0 o00oo2 = this$0.f187OooO0O0;
                    if (!zIsSuccess) {
                        o00oo2.OooO0Oo(o00oo2.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                        return;
                    }
                    AppStatus appStatus = (AppStatus) bizResponseOooO00o.getData();
                    if (appStatus == null) {
                        o00oo2.OooO0Oo(o00oo2.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                        return;
                    }
                    int status = appStatus.getStatus();
                    if (status != 1) {
                        if (status != 2) {
                            o00oo2.OooO0Oo(o00oo2.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                            return;
                        } else {
                            o00oo2.OooO0Oo(o00oo2.OooO00o(100010, bizResponseOooO00o.getMessage()));
                            return;
                        }
                    }
                    if (appStatus.getShareStatus() == 2) {
                        o00oo2.OooO0Oo(o00oo2.OooO00o(-1006, bizResponseOooO00o.getMessage()));
                        return;
                    }
                    o0Oo0oo o0oo0oo3 = o00oo2.f132OooO0Oo;
                    if (o0oo0oo3 != null) {
                        o0oo0oo3.f144OooO0O0 = appStatus;
                    }
                    o00oo2.OooO0oo();
                }
            });
        }
        if (oooOo00 == null) {
            o00oo1.OooO0Oo(o00oo1.OooO00o(-2002, null));
        }
    }
}
