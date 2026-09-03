package p417o0OoO0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO {
    @NotNull
    public static final String OooO00o(long j) {
        return j >= 0 ? o0000O0O.OooO0O0(String.valueOf(j)) : o00O00OO.OooO00o("-", o0000O0O.OooO0O0(String.valueOf(Math.abs(j))));
    }

    @NotNull
    public static final String OooO0O0(long j) {
        String strOooO0o = OooOOOO.OooO0o(j, false);
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(this)");
        return strOooO0o;
    }
}
