package p651o0ooo0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p662o0oooO0O.o0O0o0;

/* JADX INFO: loaded from: classes5.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O0o0 f59251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f59252OooO0O0;

    public Oooo0(@NotNull o0O0o0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59251OooO00o = source;
        this.f59252OooO0O0 = 262144L;
    }

    @NotNull
    public final o0O000 OooO00o() throws IOException {
        o0O000.OooO00o oooO00o = new o0O000.OooO00o();
        while (true) {
            String line = this.f59251OooO00o.OooOooO(this.f59252OooO0O0);
            this.f59252OooO0O0 -= (long) line.length();
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
