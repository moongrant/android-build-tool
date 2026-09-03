package p663o0oooO0o;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000O0 {
    public static final boolean OooO00o(@NotNull oo0OOoo isProbablyUtf8) {
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            oo0OOoo oo0oooo = new oo0OOoo();
            isProbablyUtf8.OooOo0(0L, RangesKt.coerceAtMost(isProbablyUtf8.f59828OooO0o0, 64L), oo0oooo);
            for (int i = 0; i < 16 && !oo0oooo.o00oO0O(); i++) {
                int iOoooOoo = oo0oooo.OoooOoo();
                if (Character.isISOControl(iOoooOoo) && !Character.isWhitespace(iOoooOoo)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
