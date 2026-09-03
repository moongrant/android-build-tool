package OooOOO;

import OooO00o.OooOo;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.Oooo000;
import p003OooO0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOo00 f161OooO0O0;

    public OooO0O0(@NotNull OooOo00 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f161OooO0O0 = baseClient;
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        OooOo oooOo;
        o00O0O o00o0o2 = this.f161OooO0O0.f108OooO0Oo;
        if (o00o0o2 == null || (oooOo = o00o0o2.f116OooO00o) == null) {
            oooOo = null;
        } else {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO00o(this, oooOo, 0));
        }
        if (oooOo == null) {
            OooOo00 oooOo00 = this.f161OooO0O0;
            oooOo00.OooO0Oo(oooOo00.OooO00o(-2002, null));
        }
    }
}
