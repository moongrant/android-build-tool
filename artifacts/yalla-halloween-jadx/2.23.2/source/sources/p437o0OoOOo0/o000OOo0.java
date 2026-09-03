package p437o0OoOOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f47166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f47167OooO0O0;

    public o000OOo0(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f47166OooO00o = i;
        this.f47167OooO0O0 = message;
    }

    @NotNull
    public final String toString() {
        return "PayError(code=" + this.f47166OooO00o + ", message='" + this.f47167OooO0O0 + "')";
    }
}
