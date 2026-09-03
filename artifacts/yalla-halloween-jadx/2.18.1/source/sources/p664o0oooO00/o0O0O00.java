package p664o0oooO00;

import OooO00o.OooO0OO;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 {
    public static final void OooO00o(oo0o0Oo oo0o0oo, o000000 o000000Var, String str) {
        o000000O.OooO0O0 oooO0O0 = o000000O.f51826OooOO0;
        Logger logger = o000000O.f51824OooO;
        StringBuilder sb = new StringBuilder();
        sb.append(o000000Var.f51822OooO0o);
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(oo0o0oo.f51839OooO0OO);
        logger.fine(sb.toString());
    }

    @NotNull
    public static final String OooO0O0(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return OooO0OO.OooO00o(new Object[]{str}, 1, "%6s", "java.lang.String.format(format, *args)");
    }
}
