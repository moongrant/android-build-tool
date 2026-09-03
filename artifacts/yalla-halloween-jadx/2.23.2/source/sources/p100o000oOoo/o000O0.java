package p100o000oOoo;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f35346OooO0OO = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f35347OooO0Oo = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f35348OooO00o = new o000O000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final StringBuilder f35349OooO0O0 = new StringBuilder();

    public static String OooO00o(o000O000 o000o001, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = o000o001.f34963OooO0O0;
        int i2 = o000o001.f34964OooO0OO;
        while (i < i2 && !z) {
            char c = (char) o000o001.f34962OooO00o[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        o000o001.Oooo00o(i - o000o001.f34963OooO0O0);
        return sb.toString();
    }

    @Nullable
    public static String OooO0O0(o000O000 o000o001, StringBuilder sb) {
        OooO0OO(o000o001);
        if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0) {
            return null;
        }
        String strOooO00o = OooO00o(o000o001, sb);
        if (!"".equals(strOooO00o)) {
            return strOooO00o;
        }
        return "" + ((char) o000o001.OooOo0O());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    public static void OooO0OO(o000O000 o000o001) {
        boolean z;
        boolean z2;
        while (true) {
            boolean z3 = true;
            while (true) {
                int i = o000o001.f34964OooO0OO;
                int i2 = o000o001.f34963OooO0O0;
                if (i - i2 > 0 && z3) {
                    char c = (char) o000o001.f34962OooO00o[i2];
                    if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                        o000o001.Oooo00o(1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    int i3 = o000o001.f34963OooO0O0;
                    int i4 = o000o001.f34964OooO0OO;
                    byte[] bArr = o000o001.f34962OooO00o;
                    if (i3 + 2 <= i4) {
                        int i5 = i3 + 1;
                        if (bArr[i3] == 47) {
                            int i6 = i5 + 1;
                            if (bArr[i5] == 42) {
                                while (true) {
                                    int i7 = i6 + 1;
                                    if (i7 >= i4) {
                                        break;
                                    }
                                    if (((char) bArr[i6]) == '*' && ((char) bArr[i7]) == '/') {
                                        i4 = i7 + 1;
                                        i6 = i4;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                o000o001.Oooo00o(i4 - o000o001.f34963OooO0O0);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    } else {
                        z3 = false;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
