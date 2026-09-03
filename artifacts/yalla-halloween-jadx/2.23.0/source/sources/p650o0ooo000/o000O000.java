package p650o0ooo000;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.oo0O;
import p659o0oooO00.o0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000 f59828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f59829OooO0O0;

    public o000O000(@NotNull o0000 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59828OooO00o = source;
        this.f59829OooO0O0 = 262144L;
    }

    @NotNull
    public final oo0O OooO00o() throws IOException {
        oo0O.OooO00o oooO00o = new oo0O.OooO00o();
        while (true) {
            String line = this.f59828OooO00o.OooOoo0(this.f59829OooO0O0);
            this.f59829OooO0O0 -= (long) line.length();
            if (line.length() == 0) {
                return oooO00o.OooO0OO();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                oooO00o.OooO0O0(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                oooO00o.OooO0O0("", strSubstring3);
            } else {
                oooO00o.OooO0O0("", line);
            }
        }
    }
}
