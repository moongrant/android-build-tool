package p675o0oooo00;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 {
    public static final boolean OooO00o(@NotNull o0oOO isProbablyUtf8) {
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            o0oOO o0ooo2 = new o0oOO();
            isProbablyUtf8.OooOOo(o0ooo2, 0L, RangesKt.coerceAtMost(isProbablyUtf8.f52099Oooo0oO, 64L));
            for (int i = 0; i < 16 && !o0ooo2.OooOooo(); i++) {
                int iOoooO0 = o0ooo2.OoooO0();
                if (Character.isISOControl(iOoooO0) && !Character.isWhitespace(iOoooO0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
