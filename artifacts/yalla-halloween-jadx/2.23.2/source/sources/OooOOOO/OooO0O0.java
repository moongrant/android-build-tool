package OooOOOO;

import OooO0O0.OooOo00;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f184OooO0O0;

    public OooO0O0(@NotNull o00Oo0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f184OooO0O0 = baseClient;
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        OooOo00 oooOo00;
        o00Oo0 o00oo1 = this.f184OooO0O0;
        o0Oo0oo o0oo0oo2 = o00oo1.f130OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f141OooO00o) == null) {
            oooOo00 = null;
        } else {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO00o(0, this, oooOo00));
        }
        if (oooOo00 == null) {
            o00oo1.OooO0Oo(o00oo1.OooO00o(-2002, null));
        }
    }
}
