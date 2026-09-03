package p003OooO0Oo;

import OooO00o.OooO;
import OooO00o.OooOo;
import OooO0O0.OooO0OO;
import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOo00 f118OooO0O0;

    public o00Oo0(@NotNull OooOo00 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f118OooO0O0 = baseClient;
    }

    public final void OooO0o(OooO oooO) {
        BizResponse<AppStatus> bizResponseOooO00o = OooO0OO.f88OooO00o.OooO00o(YCSDKOpenKit.getAppId$lib_release(), oooO);
        if (!bizResponseOooO00o.isSuccess()) {
            OooOo00 oooOo00 = this.f118OooO0O0;
            oooOo00.OooO0Oo(oooOo00.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
            return;
        }
        AppStatus data = bizResponseOooO00o.getData();
        if (data == null) {
            OooOo00 oooOo01 = this.f118OooO0O0;
            oooOo01.OooO0Oo(oooOo01.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
            return;
        }
        int status = data.getStatus();
        if (status == 1) {
            OooOo00 oooOo02 = this.f118OooO0O0;
            o00O0O o00o0o2 = oooOo02.f108OooO0Oo;
            if (o00o0o2 != null) {
                o00o0o2.f117OooO0O0 = data;
            }
            oooOo02.OooO0oo();
            return;
        }
        if (status != 2) {
            OooOo00 oooOo03 = this.f118OooO0O0;
            oooOo03.OooO0Oo(oooOo03.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
        } else {
            OooOo00 oooOo04 = this.f118OooO0O0;
            oooOo04.OooO0Oo(oooOo04.OooO00o(100010, bizResponseOooO00o.getMessage()));
        }
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        final OooOo oooOo;
        o00O0O o00o0o2 = this.f118OooO0O0.f108OooO0Oo;
        if (o00o0o2 == null || (oooOo = o00o0o2.f116OooO00o) == null) {
            oooOo = null;
        } else if (OooO0Oo()) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooO0Oo.o0OoOo0
                @Override // java.lang.Runnable
                public final void run() {
                    o00Oo0 this$0 = this.f120Oooo0o;
                    OooO this_apply = oooOo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    this$0.OooO0o(this_apply);
                }
            });
        } else {
            OooO0o(oooOo);
        }
        if (oooOo == null) {
            OooOo00 oooOo00 = this.f118OooO0O0;
            oooOo00.OooO0Oo(oooOo00.OooO00o(-2002, "appInfo is null"));
        }
    }
}
