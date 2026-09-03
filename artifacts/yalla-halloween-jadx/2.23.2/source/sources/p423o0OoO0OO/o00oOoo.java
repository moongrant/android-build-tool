package p423o0OoO0OO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo {
    @NotNull
    public static final String OooO00o(long j) {
        return j >= 0 ? o00O00OO.OooO0O0(String.valueOf(j)) : o00O00OO.OooO00o("-", o00O00OO.OooO0O0(String.valueOf(Math.abs(j))));
    }

    @NotNull
    public static final String OooO0O0(long j) {
        String strOooO0o = o0O0O0Oo.OooO0o(j, false);
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(...)");
        return strOooO0o;
    }
}
