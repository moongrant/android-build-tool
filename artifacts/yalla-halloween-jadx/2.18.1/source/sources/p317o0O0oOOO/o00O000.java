package p317o0O0oOOO;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.text.webvtt.WebvttCssStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o00000OO;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f36625OooO0OO = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f36626OooO00o = new o000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final StringBuilder f36627OooO0O0 = new StringBuilder();

    public static String OooO0O0(o000 o000Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = o000Var.f36662OooO0O0;
        int i2 = o000Var.f36663OooO0OO;
        while (i < i2 && !z) {
            char c = (char) o000Var.f36661OooO00o[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        o000Var.OooOoo0(i - o000Var.f36662OooO0O0);
        return sb.toString();
    }

    @Nullable
    public static String OooO0OO(o000 o000Var, StringBuilder sb) {
        OooO0Oo(o000Var);
        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 == 0) {
            return null;
        }
        String strOooO0O0 = OooO0O0(o000Var, sb);
        if (!"".equals(strOooO0O0)) {
            return strOooO0O0;
        }
        char cOooOOo0 = (char) o000Var.OooOOo0();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(cOooOOo0);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    public static void OooO0Oo(o000 o000Var) {
        boolean z;
        boolean z2;
        while (true) {
            boolean z3 = true;
            while (true) {
                int i = o000Var.f36663OooO0OO;
                int i2 = o000Var.f36662OooO0O0;
                if (i - i2 > 0 && z3) {
                    char c = (char) o000Var.f36661OooO00o[i2];
                    if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                        o000Var.OooOoo0(1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    int i3 = o000Var.f36662OooO0O0;
                    int i4 = o000Var.f36663OooO0OO;
                    byte[] bArr = o000Var.f36661OooO00o;
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
                                o000Var.OooOoo0(i4 - o000Var.f36662OooO0O0);
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

    /* JADX WARN: Code duplicated, block: B:100:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:101:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:120:0x021a  */
    /* JADX WARN: Code duplicated, block: B:122:0x021e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0226  */
    /* JADX WARN: Code duplicated, block: B:126:0x022f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x023a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x0249  */
    /* JADX WARN: Code duplicated, block: B:134:0x0251  */
    /* JADX WARN: Code duplicated, block: B:135:0x0254  */
    /* JADX WARN: Code duplicated, block: B:160:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    public final List<WebvttCssStyle> OooO00o(o000 o000Var) {
        String strTrim;
        String string;
        boolean z;
        int i = 0;
        this.f36627OooO0O0.setLength(0);
        int i2 = o000Var.f36662OooO0O0;
        while (!TextUtils.isEmpty(o000Var.OooO0o0())) {
        }
        this.f36626OooO00o.OooOoO0(o000Var.f36661OooO00o, o000Var.f36662OooO0O0);
        this.f36626OooO00o.OooOoOO(i2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            o000 o000Var2 = this.f36626OooO00o;
            StringBuilder sb = this.f36627OooO0O0;
            OooO0Oo(o000Var2);
            if (o000Var2.f36663OooO0OO - o000Var2.f36662OooO0O0 >= 5 && "::cue".equals(o000Var2.OooOOO(5))) {
                int i3 = o000Var2.f36662OooO0O0;
                String strOooO0OO = OooO0OO(o000Var2, sb);
                if (strOooO0OO == null) {
                    strTrim = null;
                } else if ("{".equals(strOooO0OO)) {
                    o000Var2.OooOoOO(i3);
                    strTrim = "";
                } else {
                    if ("(".equals(strOooO0OO)) {
                        int i4 = o000Var2.f36662OooO0O0;
                        int i5 = o000Var2.f36663OooO0OO;
                        boolean z2 = false;
                        while (i4 < i5 && !z2) {
                            int i6 = i4 + 1;
                            z2 = ((char) o000Var2.f36661OooO00o[i4]) == ')';
                            i4 = i6;
                        }
                        strTrim = o000Var2.OooOOO((i4 - 1) - o000Var2.f36662OooO0O0).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(OooO0OO(o000Var2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(OooO0OO(this.f36626OooO00o, this.f36627OooO0O0))) {
                return arrayList;
            }
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher = f36625OooO0OO.matcher(strTrim.substring(iIndexOf));
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        Objects.requireNonNull(strGroup);
                        webvttCssStyle.f14683OooO0Oo = strGroup;
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i7 = o000OOo0.f36740OooO00o;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    webvttCssStyle.f14681OooO0O0 = str.substring(i, iIndexOf2);
                    webvttCssStyle.f14680OooO00o = str.substring(iIndexOf2 + 1);
                } else {
                    webvttCssStyle.f14681OooO0O0 = str;
                }
                if (strArrSplit.length > 1) {
                    int length = strArrSplit.length;
                    o00000O0.OooO00o(length <= strArrSplit.length);
                    webvttCssStyle.f14682OooO0OO = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, 1, length)));
                }
            }
            boolean z3 = false;
            String str2 = null;
            while (!z3) {
                o000 o000Var3 = this.f36626OooO00o;
                int i8 = o000Var3.f36662OooO0O0;
                String strOooO0OO2 = OooO0OO(o000Var3, this.f36627OooO0O0);
                boolean z4 = strOooO0OO2 == null || "}".equals(strOooO0OO2);
                if (!z4) {
                    this.f36626OooO00o.OooOoOO(i8);
                    o000 o000Var4 = this.f36626OooO00o;
                    StringBuilder sb2 = this.f36627OooO0O0;
                    OooO0Oo(o000Var4);
                    String strOooO0O0 = OooO0O0(o000Var4, sb2);
                    if (!"".equals(strOooO0O0) && CertificateUtil.DELIMITER.equals(OooO0OO(o000Var4, sb2))) {
                        OooO0Oo(o000Var4);
                        StringBuilder sb3 = new StringBuilder();
                        boolean z5 = false;
                        while (true) {
                            if (z5) {
                                string = sb3.toString();
                                break;
                            }
                            int i9 = o000Var4.f36662OooO0O0;
                            String strOooO0OO3 = OooO0OO(o000Var4, sb2);
                            if (strOooO0OO3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strOooO0OO3) || ";".equals(strOooO0OO3)) {
                                o000Var4.OooOoOO(i9);
                                z5 = true;
                            } else {
                                sb3.append(strOooO0OO3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int i10 = o000Var4.f36662OooO0O0;
                            String strOooO0OO4 = OooO0OO(o000Var4, sb2);
                            if (";".equals(strOooO0OO4)) {
                                if ("color".equals(strOooO0O0)) {
                                    webvttCssStyle.f14684OooO0o = o00000OO.OooO00o(string, true);
                                    webvttCssStyle.f14686OooO0oO = true;
                                } else if ("background-color".equals(strOooO0O0)) {
                                    webvttCssStyle.f14687OooO0oo = o00000OO.OooO00o(string, true);
                                    webvttCssStyle.f14679OooO = true;
                                } else if ("ruby-position".equals(strOooO0O0)) {
                                    if ("over".equals(string)) {
                                        webvttCssStyle.f14693OooOOOO = 1;
                                    } else if ("under".equals(string)) {
                                        webvttCssStyle.f14693OooOOOO = 2;
                                    }
                                } else if ("text-combine-upright".equals(strOooO0O0)) {
                                    if ("all".equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    webvttCssStyle.f14694OooOOOo = z;
                                } else if ("text-decoration".equals(strOooO0O0)) {
                                    if ("underline".equals(string)) {
                                        webvttCssStyle.f14689OooOO0O = 1;
                                    }
                                } else if ("font-family".equals(strOooO0O0)) {
                                    webvttCssStyle.f14685OooO0o0 = o000OOo0.Oooo0(string);
                                } else if ("font-weight".equals(strOooO0O0)) {
                                    if ("bold".equals(string)) {
                                        webvttCssStyle.f14690OooOO0o = 1;
                                    }
                                } else if (!"font-style".equals(strOooO0O0)) {
                                }
                            } else if ("}".equals(strOooO0OO4)) {
                                o000Var4.OooOoOO(i10);
                                if ("color".equals(strOooO0O0)) {
                                    webvttCssStyle.f14684OooO0o = o00000OO.OooO00o(string, true);
                                    webvttCssStyle.f14686OooO0oO = true;
                                } else if ("background-color".equals(strOooO0O0)) {
                                    webvttCssStyle.f14687OooO0oo = o00000OO.OooO00o(string, true);
                                    webvttCssStyle.f14679OooO = true;
                                } else if ("ruby-position".equals(strOooO0O0)) {
                                    if ("over".equals(string)) {
                                        webvttCssStyle.f14693OooOOOO = 1;
                                    } else if ("under".equals(string)) {
                                        webvttCssStyle.f14693OooOOOO = 2;
                                    }
                                } else if ("text-combine-upright".equals(strOooO0O0)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    webvttCssStyle.f14694OooOOOo = z;
                                } else if ("text-decoration".equals(strOooO0O0)) {
                                    if ("underline".equals(string)) {
                                        webvttCssStyle.f14689OooOO0O = 1;
                                    }
                                } else if ("font-family".equals(strOooO0O0)) {
                                    webvttCssStyle.f14685OooO0o0 = o000OOo0.Oooo0(string);
                                } else if ("font-weight".equals(strOooO0O0)) {
                                    if ("bold".equals(string)) {
                                        webvttCssStyle.f14690OooOO0o = 1;
                                    }
                                } else if (!"font-style".equals(strOooO0O0) && "italic".equals(string)) {
                                    webvttCssStyle.f14692OooOOO0 = 1;
                                }
                            }
                        }
                    }
                }
                str2 = strOooO0OO2;
                z3 = z4;
            }
            if ("}".equals(str2)) {
                arrayList.add(webvttCssStyle);
            }
            i = 0;
        }
    }
}
