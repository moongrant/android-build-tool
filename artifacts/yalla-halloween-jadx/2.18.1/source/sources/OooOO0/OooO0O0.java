package OooOO0;

import com.yallatech.support.platform.login.bean.AuthRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o00O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public AuthRequest f146OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(@NotNull AuthRequest authRequest) {
        super(authRequest);
        Intrinsics.checkNotNullParameter(authRequest, "authRequest");
        this.f146OooO0OO = authRequest;
    }
}
