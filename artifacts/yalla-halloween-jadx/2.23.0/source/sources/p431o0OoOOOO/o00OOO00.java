package p431o0OoOOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f45911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f45912OooO0O0;

    public o00OOO00(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f45911OooO00o = i;
        this.f45912OooO0O0 = message;
    }

    @NotNull
    public final String toString() {
        return "PayError(code=" + this.f45911OooO00o + ", message='" + this.f45912OooO0O0 + "')";
    }
}
