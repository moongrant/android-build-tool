package p053o00000oO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {
    @NotNull
    public static final o0000O00 OooO00o() {
        Intrinsics.checkNotNullParameter(o0000O00.f27125Oooo0oO, "<this>");
        return o0000O00.f27124Oooo;
    }

    public static final int OooO0O0(@NotNull o0000O00 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        o0000O00.OooO00o oooO00o = o0000O00.f27125Oooo0oO;
        boolean z = fontWeight.compareTo(OooO00o()) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }
}
