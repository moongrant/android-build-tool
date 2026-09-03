package p317o0O0oOOO;

import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float OooO00o(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long OooO0O0(String str) throws NumberFormatException {
        int i = o000OOo0.f36740OooO00o;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(CertificateUtil.DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static void OooO0OO(o000 o000Var) throws ParserException {
        int i = o000Var.f36662OooO0O0;
        String strOooO0o0 = o000Var.OooO0o0();
        if (strOooO0o0 != null && strOooO0o0.startsWith("WEBVTT")) {
            return;
        }
        o000Var.OooOoOO(i);
        String strValueOf = String.valueOf(o000Var.OooO0o0());
        throw new ParserException(strValueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(strValueOf) : new String("Expected WEBVTT. Got "));
    }
}
