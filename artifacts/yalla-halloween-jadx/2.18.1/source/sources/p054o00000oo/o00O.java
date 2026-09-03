package p054o00000oo;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00000O.OooO00o;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O {
    @NotNull
    public static final OooO00o OooO00o(@NotNull oo0oOO0 oo0ooo0) {
        Intrinsics.checkNotNullParameter(oo0ooo0, "<this>");
        OooO00o oooO00o = oo0ooo0.f27236OooO00o;
        long j = oo0ooo0.f27237OooO0O0;
        Objects.requireNonNull(oooO00o);
        return oooO00o.subSequence(o0OO00O.OooO0oO(j), o0OO00O.OooO0o(j));
    }

    @NotNull
    public static final OooO00o OooO0O0(@NotNull oo0oOO0 oo0ooo0, int i) {
        Intrinsics.checkNotNullParameter(oo0ooo0, "<this>");
        return oo0ooo0.f27236OooO00o.subSequence(o0OO00O.OooO0o(oo0ooo0.f27237OooO0O0), Math.min(o0OO00O.OooO0o(oo0ooo0.f27237OooO0O0) + i, oo0ooo0.f27236OooO00o.f26756Oooo0o.length()));
    }

    @NotNull
    public static final OooO00o OooO0OO(@NotNull oo0oOO0 oo0ooo0, int i) {
        Intrinsics.checkNotNullParameter(oo0ooo0, "<this>");
        return oo0ooo0.f27236OooO00o.subSequence(Math.max(0, o0OO00O.OooO0oO(oo0ooo0.f27237OooO0O0) - i), o0OO00O.OooO0oO(oo0ooo0.f27237OooO0O0));
    }
}
