package OooOO0;

import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooO00o f150OooO0O0;

    public OooOO0(@NotNull OooO00o loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f150OooO0O0 = loginClient;
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new OooO(this, 0));
    }
}
