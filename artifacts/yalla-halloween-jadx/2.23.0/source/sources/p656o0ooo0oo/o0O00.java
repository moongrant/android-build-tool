package p656o0ooo0oo;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00 {
    public static final boolean OooO00o(@NotNull o00000O isProbablyUtf8) {
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            o00000O o00000o = new o00000O();
            isProbablyUtf8.OooOo0(0L, RangesKt.coerceAtMost(isProbablyUtf8.f60177OooO0o0, 64L), o00000o);
            for (int i = 0; i < 16 && !o00000o.oo000o(); i++) {
                int iOoooOoo = o00000o.OoooOoo();
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
