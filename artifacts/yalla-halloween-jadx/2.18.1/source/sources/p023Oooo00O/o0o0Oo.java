package p023Oooo00O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo {
    @NotNull
    public static final <V extends o0O0O00> V OooO00o(@NotNull o00OOO00<V> o00ooo01, long j, @NotNull V start, @NotNull V end, @NotNull V startVelocity) {
        Intrinsics.checkNotNullParameter(o00ooo01, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(startVelocity, "startVelocity");
        return (V) o00ooo01.OooO0oO(j * 1000000, start, end, startVelocity);
    }
}
