package p242o00oo0O0;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f40416OooO0OO = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f40417OooO0Oo = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f40418OooO00o = new o00Oo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final StringBuilder f40419OooO0O0 = new StringBuilder();

    public static String OooO00o(o00Oo00 o00oo00, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = o00oo00.f40592OooO0O0;
        int i2 = o00oo00.f40593OooO0OO;
        while (i < i2 && !z) {
            char c = (char) o00oo00.f40591OooO00o[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        o00oo00.Oooo00o(i - o00oo00.f40592OooO0O0);
        return sb.toString();
    }

    @Nullable
    public static String OooO0O0(o00Oo00 o00oo00, StringBuilder sb) {
        OooO0OO(o00oo00);
        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0) {
            return null;
        }
        String strOooO00o = OooO00o(o00oo00, sb);
        if (!"".equals(strOooO00o)) {
            return strOooO00o;
        }
        return "" + ((char) o00oo00.OooOo0O());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    public static void OooO0OO(o00Oo00 o00oo00) {
        boolean z;
        boolean z2;
        while (true) {
            boolean z3 = true;
            while (true) {
                int i = o00oo00.f40593OooO0OO;
                int i2 = o00oo00.f40592OooO0O0;
                if (i - i2 > 0 && z3) {
                    char c = (char) o00oo00.f40591OooO00o[i2];
                    if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                        o00oo00.Oooo00o(1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    int i3 = o00oo00.f40592OooO0O0;
                    int i4 = o00oo00.f40593OooO0OO;
                    byte[] bArr = o00oo00.f40591OooO00o;
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
                                o00oo00.Oooo00o(i4 - o00oo00.f40592OooO0O0);
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
