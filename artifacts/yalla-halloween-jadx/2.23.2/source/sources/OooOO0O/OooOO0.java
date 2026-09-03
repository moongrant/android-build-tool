package OooOO0O;

import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f173OooO0O0;

    public OooOO0(@NotNull OooO00o loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f173OooO0O0 = loginClient;
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new OooO(this, 0));
    }
}
