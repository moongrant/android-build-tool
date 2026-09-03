package p419o0Oo0oo0;

import OooO00o.OooO00o;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo implements HostnameVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000Ooo f39769OooO00o = new o0000Ooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f39770OooO0O0 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> OooO00o(X509Certificate x509Certificate) {
        List<String> listOooO0O0 = OooO0O0(x509Certificate, 7);
        List<String> listOooO0O1 = OooO0O0(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listOooO0O1.size() + listOooO0O0.size());
        arrayList.addAll(listOooO0O0);
        arrayList.addAll(listOooO0O1);
        return arrayList;
    }

    public static List<String> OooO0O0(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public final boolean OooO0OO(String str, X509Certificate x509Certificate) {
        String str2;
        int i;
        int i2;
        if (f39770OooO0O0.matcher(str).matches()) {
            List<String> listOooO0O0 = OooO0O0(x509Certificate, 7);
            int size = listOooO0O0.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!str.equalsIgnoreCase(listOooO0O0.get(i3))) {
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> listOooO0O1 = OooO0O0(x509Certificate, 2);
        int size2 = listOooO0O1.size();
        int i4 = 0;
        boolean z = false;
        while (i4 < size2) {
            if (!OooO0Oo(lowerCase, listOooO0O1.get(i4))) {
                i4++;
                z = true;
            }
        }
        if (!z) {
            o00000OO o00000oo2 = new o00000OO(x509Certificate.getSubjectX500Principal());
            o00000oo2.f39764OooO0OO = 0;
            o00000oo2.f39765OooO0Oo = 0;
            o00000oo2.f39767OooO0o0 = 0;
            o00000oo2.f39766OooO0o = 0;
            o00000oo2.f39768OooO0oO = o00000oo2.f39762OooO00o.toCharArray();
            String strOooO0OO = o00000oo2.OooO0OO();
            if (strOooO0OO == null) {
                str2 = null;
            } else {
                while (true) {
                    int i5 = o00000oo2.f39764OooO0OO;
                    int i6 = o00000oo2.f39763OooO0O0;
                    if (i5 == i6) {
                        break;
                    }
                    char c = o00000oo2.f39768OooO0oO[i5];
                    if (c == '\"') {
                        int i7 = i5 + 1;
                        o00000oo2.f39764OooO0OO = i7;
                        o00000oo2.f39765OooO0Oo = i7;
                        o00000oo2.f39767OooO0o0 = i7;
                        while (true) {
                            int i8 = o00000oo2.f39764OooO0OO;
                            if (i8 == o00000oo2.f39763OooO0O0) {
                                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unexpected end of DN: ");
                                sbOooO0o0.append(o00000oo2.f39762OooO00o);
                                throw new IllegalStateException(sbOooO0o0.toString());
                            }
                            char[] cArr = o00000oo2.f39768OooO0oO;
                            if (cArr[i8] == '\"') {
                                o00000oo2.f39764OooO0OO = i8 + 1;
                                while (true) {
                                    int i9 = o00000oo2.f39764OooO0OO;
                                    if (i9 >= o00000oo2.f39763OooO0O0 || o00000oo2.f39768OooO0oO[i9] != ' ') {
                                        break;
                                    }
                                    o00000oo2.f39764OooO0OO = i9 + 1;
                                }
                                char[] cArr2 = o00000oo2.f39768OooO0oO;
                                int i10 = o00000oo2.f39765OooO0Oo;
                                str2 = new String(cArr2, i10, o00000oo2.f39767OooO0o0 - i10);
                                break;
                            }
                            if (cArr[i8] == '\\') {
                                cArr[o00000oo2.f39767OooO0o0] = o00000oo2.OooO0O0();
                            } else {
                                cArr[o00000oo2.f39767OooO0o0] = cArr[i8];
                            }
                            o00000oo2.f39764OooO0OO++;
                            o00000oo2.f39767OooO0o0++;
                        }
                    } else if (c != '#') {
                        if (c != '+' && c != ',' && c != ';') {
                            o00000oo2.f39765OooO0Oo = i5;
                            o00000oo2.f39767OooO0o0 = i5;
                            while (true) {
                                int i11 = o00000oo2.f39764OooO0OO;
                                if (i11 < o00000oo2.f39763OooO0O0) {
                                    char[] cArr3 = o00000oo2.f39768OooO0oO;
                                    char c2 = cArr3[i11];
                                    if (c2 == ' ') {
                                        int i12 = o00000oo2.f39767OooO0o0;
                                        o00000oo2.f39766OooO0o = i12;
                                        o00000oo2.f39764OooO0OO = i11 + 1;
                                        o00000oo2.f39767OooO0o0 = i12 + 1;
                                        cArr3[i12] = ' ';
                                        while (true) {
                                            i = o00000oo2.f39764OooO0OO;
                                            i2 = o00000oo2.f39763OooO0O0;
                                            if (i >= i2) {
                                                break;
                                            }
                                            char[] cArr4 = o00000oo2.f39768OooO0oO;
                                            if (cArr4[i] != ' ') {
                                                break;
                                            }
                                            int i13 = o00000oo2.f39767OooO0o0;
                                            o00000oo2.f39767OooO0o0 = i13 + 1;
                                            cArr4[i13] = ' ';
                                            o00000oo2.f39764OooO0OO = i + 1;
                                        }
                                        if (i != i2) {
                                            char[] cArr5 = o00000oo2.f39768OooO0oO;
                                            if (cArr5[i] == ',' || cArr5[i] == '+' || cArr5[i] == ';') {
                                            }
                                        }
                                        char[] cArr6 = o00000oo2.f39768OooO0oO;
                                        int i14 = o00000oo2.f39765OooO0Oo;
                                        str2 = new String(cArr6, i14, o00000oo2.f39766OooO0o - i14);
                                        break;
                                    }
                                    if (c2 != ';') {
                                        if (c2 == '\\') {
                                            int i15 = o00000oo2.f39767OooO0o0;
                                            o00000oo2.f39767OooO0o0 = i15 + 1;
                                            cArr3[i15] = o00000oo2.OooO0O0();
                                            o00000oo2.f39764OooO0OO++;
                                        } else if (c2 != '+' && c2 != ',') {
                                            int i16 = o00000oo2.f39767OooO0o0;
                                            o00000oo2.f39767OooO0o0 = i16 + 1;
                                            cArr3[i16] = cArr3[i11];
                                            o00000oo2.f39764OooO0OO = i11 + 1;
                                        }
                                    }
                                    int i17 = o00000oo2.f39765OooO0Oo;
                                    str2 = new String(cArr3, i17, o00000oo2.f39767OooO0o0 - i17);
                                    break;
                                }
                                char[] cArr7 = o00000oo2.f39768OooO0oO;
                                int i18 = o00000oo2.f39765OooO0Oo;
                                str2 = new String(cArr7, i18, o00000oo2.f39767OooO0o0 - i18);
                                break;
                            }
                        }
                        str2 = "";
                    } else {
                        if (i5 + 4 >= i6) {
                            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Unexpected end of DN: ");
                            sbOooO0o1.append(o00000oo2.f39762OooO00o);
                            throw new IllegalStateException(sbOooO0o1.toString());
                        }
                        o00000oo2.f39765OooO0Oo = i5;
                        o00000oo2.f39764OooO0OO = i5 + 1;
                        while (true) {
                            int i19 = o00000oo2.f39764OooO0OO;
                            if (i19 != o00000oo2.f39763OooO0O0) {
                                char[] cArr8 = o00000oo2.f39768OooO0oO;
                                if (cArr8[i19] != '+' && cArr8[i19] != ',' && cArr8[i19] != ';') {
                                    if (cArr8[i19] == ' ') {
                                        o00000oo2.f39767OooO0o0 = i19;
                                        o00000oo2.f39764OooO0OO = i19 + 1;
                                        while (true) {
                                            int i20 = o00000oo2.f39764OooO0OO;
                                            if (i20 >= o00000oo2.f39763OooO0O0 || o00000oo2.f39768OooO0oO[i20] != ' ') {
                                                break;
                                            }
                                            o00000oo2.f39764OooO0OO = i20 + 1;
                                        }
                                    } else {
                                        if (cArr8[i19] >= 'A' && cArr8[i19] <= 'F') {
                                            cArr8[i19] = (char) (cArr8[i19] + ' ');
                                        }
                                        o00000oo2.f39764OooO0OO = i19 + 1;
                                    }
                                }
                            }
                            o00000oo2.f39767OooO0o0 = i19;
                            break;
                        }
                        int i21 = o00000oo2.f39767OooO0o0;
                        int i22 = o00000oo2.f39765OooO0Oo;
                        int i23 = i21 - i22;
                        if (i23 < 5 || (i23 & 1) == 0) {
                            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Unexpected end of DN: ");
                            sbOooO0o2.append(o00000oo2.f39762OooO00o);
                            throw new IllegalStateException(sbOooO0o2.toString());
                        }
                        int i24 = i23 / 2;
                        byte[] bArr = new byte[i24];
                        int i25 = i22 + 1;
                        for (int i26 = 0; i26 < i24; i26++) {
                            bArr[i26] = (byte) o00000oo2.OooO00o(i25);
                            i25 += 2;
                        }
                        str2 = new String(o00000oo2.f39768OooO0oO, o00000oo2.f39765OooO0Oo, i23);
                    }
                    if (!"cn".equalsIgnoreCase(strOooO0OO)) {
                        int i27 = o00000oo2.f39764OooO0OO;
                        if (i27 >= o00000oo2.f39763OooO0O0) {
                            break;
                        }
                        char[] cArr9 = o00000oo2.f39768OooO0oO;
                        if (cArr9[i27] != ',' && cArr9[i27] != ';' && cArr9[i27] != '+') {
                            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("Malformed DN: ");
                            sbOooO0o3.append(o00000oo2.f39762OooO00o);
                            throw new IllegalStateException(sbOooO0o3.toString());
                        }
                        o00000oo2.f39764OooO0OO = i27 + 1;
                        strOooO0OO = o00000oo2.OooO0OO();
                        if (strOooO0OO == null) {
                            StringBuilder sbOooO0o4 = OooO00o.OooO0o0("Malformed DN: ");
                            sbOooO0o4.append(o00000oo2.f39762OooO00o);
                            throw new IllegalStateException(sbOooO0o4.toString());
                        }
                    }
                }
                str2 = null;
            }
            if (str2 != null) {
                return OooO0Oo(lowerCase, str2);
            }
        }
        return false;
        return true;
    }

    public final boolean OooO0Oo(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return OooO0OO(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
