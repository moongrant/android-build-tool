package o0OOO00;

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

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 implements HostnameVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f43568OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f43569OooO0O0 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static ArrayList OooO00o(X509Certificate x509Certificate) {
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

    public static boolean OooO0OO(String str, X509Certificate x509Certificate) {
        String str2;
        char[] cArr;
        char c;
        int i;
        char c2;
        if (f43569OooO0O0.matcher(str).matches()) {
            List<String> listOooO0O0 = OooO0O0(x509Certificate, 7);
            int size = listOooO0O0.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!str.equalsIgnoreCase(listOooO0O0.get(i2))) {
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i3 = 2;
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
            OooO00o oooO00o = new OooO00o(x509Certificate.getSubjectX500Principal());
            oooO00o.f43563OooO0OO = 0;
            oooO00o.f43564OooO0Oo = 0;
            oooO00o.f43566OooO0o0 = 0;
            oooO00o.f43565OooO0o = 0;
            String str3 = oooO00o.f43561OooO00o;
            oooO00o.f43567OooO0oO = str3.toCharArray();
            String strOooO0OO = oooO00o.OooO0OO();
            if (strOooO0OO == null) {
                str2 = null;
            } else {
                while (true) {
                    int i5 = oooO00o.f43563OooO0OO;
                    int i6 = oooO00o.f43562OooO0O0;
                    if (i5 == i6) {
                        break;
                    }
                    char c3 = oooO00o.f43567OooO0oO[i5];
                    char c4 = '\\';
                    if (c3 == '\"') {
                        int i7 = i5 + 1;
                        oooO00o.f43563OooO0OO = i7;
                        oooO00o.f43564OooO0Oo = i7;
                        oooO00o.f43566OooO0o0 = i7;
                        while (true) {
                            int i8 = oooO00o.f43563OooO0OO;
                            if (i8 == i6) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = oooO00o.f43567OooO0oO;
                            char c5 = cArr2[i8];
                            if (c5 == '\"') {
                                oooO00o.f43563OooO0OO = i8 + 1;
                                while (true) {
                                    int i9 = oooO00o.f43563OooO0OO;
                                    if (i9 >= i6 || oooO00o.f43567OooO0oO[i9] != ' ') {
                                        break;
                                    }
                                    oooO00o.f43563OooO0OO = i9 + 1;
                                }
                                char[] cArr3 = oooO00o.f43567OooO0oO;
                                int i10 = oooO00o.f43564OooO0Oo;
                                str2 = new String(cArr3, i10, oooO00o.f43566OooO0o0 - i10);
                                break;
                            }
                            if (c5 == '\\') {
                                cArr2[oooO00o.f43566OooO0o0] = oooO00o.OooO0O0();
                            } else {
                                cArr2[oooO00o.f43566OooO0o0] = c5;
                            }
                            oooO00o.f43563OooO0OO++;
                            oooO00o.f43566OooO0o0++;
                            i3 = 2;
                        }
                    } else if (c3 == '#') {
                        if (i5 + 4 >= i6) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        oooO00o.f43564OooO0Oo = i5;
                        oooO00o.f43563OooO0OO = i5 + 1;
                        while (true) {
                            int i11 = oooO00o.f43563OooO0OO;
                            if (i11 == i6 || (c = (cArr = oooO00o.f43567OooO0oO)[i11]) == '+' || c == ',' || c == ';') {
                                oooO00o.f43566OooO0o0 = i11;
                                break;
                            }
                            if (c == ' ') {
                                oooO00o.f43566OooO0o0 = i11;
                                oooO00o.f43563OooO0OO = i11 + 1;
                                while (true) {
                                    int i12 = oooO00o.f43563OooO0OO;
                                    if (i12 >= i6 || oooO00o.f43567OooO0oO[i12] != ' ') {
                                        break;
                                    }
                                    oooO00o.f43563OooO0OO = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i11] = (char) (c + ' ');
                                }
                                oooO00o.f43563OooO0OO = i11 + 1;
                            }
                        }
                        int i13 = oooO00o.f43566OooO0o0;
                        int i14 = oooO00o.f43564OooO0Oo;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            bArr[i18] = (byte) oooO00o.OooO00o(i17);
                            i17 += i3;
                        }
                        str2 = new String(oooO00o.f43567OooO0oO, oooO00o.f43564OooO0Oo, i15);
                    } else if (c3 == '+' || c3 == ',' || c3 == ';') {
                        str2 = "";
                    } else {
                        oooO00o.f43564OooO0Oo = i5;
                        oooO00o.f43566OooO0o0 = i5;
                        while (true) {
                            int i19 = oooO00o.f43563OooO0OO;
                            if (i19 >= i6) {
                                char[] cArr4 = oooO00o.f43567OooO0oO;
                                int i20 = oooO00o.f43564OooO0Oo;
                                str2 = new String(cArr4, i20, oooO00o.f43566OooO0o0 - i20);
                                break;
                            }
                            char[] cArr5 = oooO00o.f43567OooO0oO;
                            char c6 = cArr5[i19];
                            if (c6 != ' ') {
                                if (c6 != ';') {
                                    if (c6 == c4) {
                                        int i21 = oooO00o.f43566OooO0o0;
                                        oooO00o.f43566OooO0o0 = i21 + 1;
                                        cArr5[i21] = oooO00o.OooO0O0();
                                        oooO00o.f43563OooO0OO++;
                                    } else if (c6 != '+' && c6 != ',') {
                                        int i22 = oooO00o.f43566OooO0o0;
                                        oooO00o.f43566OooO0o0 = i22 + 1;
                                        cArr5[i22] = c6;
                                        oooO00o.f43563OooO0OO = i19 + 1;
                                    }
                                    c4 = '\\';
                                }
                                int i23 = oooO00o.f43564OooO0Oo;
                                str2 = new String(cArr5, i23, oooO00o.f43566OooO0o0 - i23);
                                break;
                            }
                            int i24 = oooO00o.f43566OooO0o0;
                            oooO00o.f43565OooO0o = i24;
                            oooO00o.f43563OooO0OO = i19 + 1;
                            oooO00o.f43566OooO0o0 = i24 + 1;
                            cArr5[i24] = ' ';
                            while (true) {
                                i = oooO00o.f43563OooO0OO;
                                if (i >= i6) {
                                    break;
                                }
                                char[] cArr6 = oooO00o.f43567OooO0oO;
                                if (cArr6[i] != ' ') {
                                    break;
                                }
                                int i25 = oooO00o.f43566OooO0o0;
                                oooO00o.f43566OooO0o0 = i25 + 1;
                                cArr6[i25] = ' ';
                                oooO00o.f43563OooO0OO = i + 1;
                            }
                            if (i == i6 || (c2 = oooO00o.f43567OooO0oO[i]) == ',' || c2 == '+' || c2 == ';') {
                                char[] cArr7 = oooO00o.f43567OooO0oO;
                                int i26 = oooO00o.f43564OooO0Oo;
                                str2 = new String(cArr7, i26, oooO00o.f43565OooO0o - i26);
                                break;
                            }
                            c4 = '\\';
                        }
                    }
                    if (!"cn".equalsIgnoreCase(strOooO0OO)) {
                        int i27 = oooO00o.f43563OooO0OO;
                        if (i27 >= i6) {
                            break;
                        }
                        char c7 = oooO00o.f43567OooO0oO[i27];
                        if (c7 != ',' && c7 != ';' && c7 != '+') {
                            throw new IllegalStateException("Malformed DN: ".concat(str3));
                        }
                        oooO00o.f43563OooO0OO = i27 + 1;
                        strOooO0OO = oooO00o.OooO0OO();
                        if (strOooO0OO == null) {
                            throw new IllegalStateException("Malformed DN: ".concat(str3));
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

    public static boolean OooO0Oo(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
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
