package OooOOO;

import com.yallatech.support.basecore.net.BizResponse;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AppStatus;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.o00O0O;
import p296o0O0OoO0.oo0o0Oo;
import p310o0O0o0oo.o00O0OO0;
import p310o0O0o0oo.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f158Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f159Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f160Oooo0oo;

    public /* synthetic */ OooO00o(Object obj, Object obj2, int i) {
        this.f158Oooo0o = i;
        this.f159Oooo0oO = obj;
        this.f160Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f158Oooo0o) {
            case 0:
                OooO0O0 this$0 = (OooO0O0) this.f159Oooo0oO;
                OooO00o.OooO this_apply = (OooO00o.OooO) this.f160Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Objects.requireNonNull(this$0);
                BizResponse<AppStatus> bizResponseOooO00o = OooO0O0.OooO0OO.f88OooO00o.OooO00o(YCSDKOpenKit.getAppId$lib_release(), this_apply);
                if (!bizResponseOooO00o.isSuccess()) {
                    OooOo00 oooOo00 = this$0.f161OooO0O0;
                    oooOo00.OooO0Oo(oooOo00.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                } else {
                    AppStatus data = bizResponseOooO00o.getData();
                    if (data != null) {
                        int status = data.getStatus();
                        if (status == 1) {
                            if (data.getShareStatus() != 2) {
                                OooOo00 oooOo01 = this$0.f161OooO0O0;
                                o00O0O o00o0o2 = oooOo01.f108OooO0Oo;
                                if (o00o0o2 != null) {
                                    o00o0o2.f117OooO0O0 = data;
                                }
                                oooOo01.OooO0oo();
                            } else {
                                OooOo00 oooOo02 = this$0.f161OooO0O0;
                                oooOo02.OooO0Oo(oooOo02.OooO00o(-1006, bizResponseOooO00o.getMessage()));
                            }
                        } else if (status == 2) {
                            OooOo00 oooOo03 = this$0.f161OooO0O0;
                            oooOo03.OooO0Oo(oooOo03.OooO00o(100010, bizResponseOooO00o.getMessage()));
                        } else {
                            OooOo00 oooOo04 = this$0.f161OooO0O0;
                            oooOo04.OooO0Oo(oooOo04.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                        }
                    } else {
                        OooOo00 oooOo05 = this$0.f161OooO0O0;
                        oooOo05.OooO0Oo(oooOo05.OooO00o(bizResponseOooO00o.getCode(), bizResponseOooO00o.getMessage()));
                    }
                }
                break;
            default:
                o00O0OO0 o00o0oo1 = (o00O0OO0) this.f159Oooo0oO;
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f160Oooo0oo;
                o00o0oo1.f36397o0OoOo0 = o00o0oo1.f36381OooooO0 == null ? oo0o0oo : new oo0o0Oo.OooO0O0(-9223372036854775807L);
                o00o0oo1.f36402ooOO = oo0o0oo.OooO0oo();
                boolean z = o00o0oo1.f36401oo000o == -1 && oo0o0oo.OooO0oo() == -9223372036854775807L;
                o00o0oo1.f36389o00O0O = z;
                o00o0oo1.f36390o00Oo0 = z ? 7 : 1;
                ((oo0o0O0) o00o0oo1.f36372OoooO0O).OooOo00(o00o0oo1.f36402ooOO, oo0o0oo.OooO0O0(), o00o0oo1.f36389o00O0O);
                if (!o00o0oo1.f36384Oooooo) {
                    o00o0oo1.OooOoO0();
                }
                break;
        }
    }
}
