package p003OooO0o0;

import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f126OooO0O0;

    public o000OOo(@NotNull o00Oo0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f126OooO0O0 = baseClient;
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        YCSDKOpenKit.INSTANCE.dispatchToMain$lib_release(new oo0o0Oo(this, 0));
    }
}
