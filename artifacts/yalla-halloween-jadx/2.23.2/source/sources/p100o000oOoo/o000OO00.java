package p100o000oOoo;

import androidx.media3.common.util.UnstableApi;
import com.facebook.internal.security.CertificateUtil;
import java.util.regex.Pattern;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f35379OooO00o = 0;

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
        int i = o00.f34910OooO00o;
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
}
