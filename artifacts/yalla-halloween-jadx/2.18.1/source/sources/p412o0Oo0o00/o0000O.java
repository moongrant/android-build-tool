package p412o0Oo0o00;

import Oooo000.o00O0O;
import com.facebook.internal.security.CertificateUtil;
import java.net.IDN;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.text.Typography;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final char[] f39258OooO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39259OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39260OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f39261OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f39262OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<String> f39263OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f39264OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<String> f39265OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f39266OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f39267OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f39270OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final List<String> f39271OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<String> f39273OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f39274OooO0oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f39268OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f39269OooO0OO = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f39272OooO0o0 = -1;

        public OooO00o() {
            ArrayList arrayList = new ArrayList();
            this.f39271OooO0o = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Code duplicated, block: B:101:0x013a  */
        /* JADX WARN: Code duplicated, block: B:108:0x014e  */
        /* JADX WARN: Code duplicated, block: B:112:0x0168  */
        /* JADX WARN: Code duplicated, block: B:138:0x00cb A[EDGE_INSN: B:138:0x00cb->B:68:0x00cb BREAK  A[LOOP:1: B:63:0x00b8->B:67:0x00c5], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x012c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x014a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x0146 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x013e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x0137 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x00ab A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:160:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x0077  */
        /* JADX WARN: Code duplicated, block: B:53:0x009c A[LOOP:5: B:28:0x0061->B:53:0x009c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:67:0x00c5 A[LOOP:1: B:63:0x00b8->B:67:0x00c5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:80:0x0104 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:82:0x0106  */
        /* JADX WARN: Code duplicated, block: B:84:0x010f  */
        /* JADX WARN: Code duplicated, block: B:87:0x0114  */
        /* JADX WARN: Code duplicated, block: B:89:0x0117  */
        /* JADX WARN: Code duplicated, block: B:96:0x012a  */
        public static String OooO0O0(String str, int i, int i2) {
            String lowerCase;
            InetAddress byAddress;
            byte[] address;
            int i3;
            int i4;
            int i5;
            o0oOO o0ooo2;
            int i6;
            int i7;
            int i8;
            boolean z;
            int i9;
            int i10;
            char cCharAt;
            int i11;
            int i12;
            int iOooO0O0;
            String strOooO0oo = o0000O.OooO0oo(str, i, i2);
            int i13 = 0;
            if (!strOooO0oo.startsWith("[") || !strOooO0oo.endsWith("]")) {
                try {
                    lowerCase = IDN.toASCII(strOooO0oo).toLowerCase(Locale.US);
                    if (lowerCase.isEmpty()) {
                        lowerCase = null;
                    }
                } catch (IllegalArgumentException unused) {
                }
                if (lowerCase == null) {
                    return null;
                }
                int length = lowerCase.length();
                if (o0000O.OooO0Oo(lowerCase, 0, length, "\u0000\t\n\r #%/:?@[\\]") != length) {
                    return null;
                }
                return lowerCase;
            }
            int i14 = 1;
            int length2 = strOooO0oo.length() - 1;
            int i15 = 16;
            byte[] bArr = new byte[16];
            int i16 = -1;
            int i17 = 1;
            int i18 = 0;
            int i19 = -1;
            int i20 = -1;
            while (true) {
                try {
                    if (i17 < length2) {
                        if (i18 != i15) {
                            int i21 = i17 + 2;
                            if (i21 > length2 || !strOooO0oo.regionMatches(i17, "::", i13, 2)) {
                                if (i18 != 0) {
                                    if (strOooO0oo.regionMatches(i17, CertificateUtil.DELIMITER, i13, i14)) {
                                        i17++;
                                    } else if (strOooO0oo.regionMatches(i17, ".", i13, i14)) {
                                        int i22 = i18 - 2;
                                        int i23 = i22;
                                        loop5: while (true) {
                                            if (i20 >= length2) {
                                                if (i23 == i22 + 4) {
                                                    z = true;
                                                    break;
                                                }
                                                break;
                                            }
                                            if (i23 != i15) {
                                                if (i23 == i22) {
                                                    i9 = i20;
                                                    i10 = 0;
                                                    while (true) {
                                                        if (i9 >= length2) {
                                                            cCharAt = strOooO0oo.charAt(i9);
                                                            if (cCharAt < '0' && cCharAt <= '9') {
                                                                if ((i10 != 0 || i20 == i9) && (i10 = ((i10 * 10) + cCharAt) - 48) <= 255) {
                                                                    i9++;
                                                                }
                                                            }
                                                        }
                                                        if (i9 - i20 == 0) {
                                                            bArr[i23] = (byte) i10;
                                                            i23++;
                                                            i20 = i9;
                                                            i15 = 16;
                                                        }
                                                    }
                                                } else if (strOooO0oo.charAt(i20) == '.') {
                                                    i20++;
                                                    i9 = i20;
                                                    i10 = 0;
                                                    while (true) {
                                                        if (i9 >= length2) {
                                                            cCharAt = strOooO0oo.charAt(i9);
                                                            if (cCharAt < '0') {
                                                            }
                                                        }
                                                        if (i9 - i20 == 0) {
                                                            bArr[i23] = (byte) i10;
                                                            i23++;
                                                            i20 = i9;
                                                            i15 = 16;
                                                        }
                                                        i9++;
                                                    }
                                                }
                                            }
                                            z = false;
                                            break;
                                        }
                                        if (z) {
                                            i18 += 2;
                                        }
                                        if (byAddress == null) {
                                            return null;
                                        }
                                        address = byAddress.getAddress();
                                        i3 = 16;
                                        if (address.length == 16) {
                                            throw new AssertionError();
                                        }
                                        i4 = 0;
                                        i5 = 0;
                                        while (i4 < address.length) {
                                            i7 = i4;
                                            while (i7 < i3 && address[i7] == 0 && address[i7 + 1] == 0) {
                                                i7 += 2;
                                                i3 = 16;
                                            }
                                            i8 = i7 - i4;
                                            if (i8 > i5) {
                                                i16 = i4;
                                                i5 = i8;
                                            }
                                            i4 = i7 + 2;
                                            i3 = 16;
                                        }
                                        o0ooo2 = new o0oOO();
                                        i6 = 0;
                                        while (i6 < address.length) {
                                            if (i6 == i16) {
                                                o0ooo2.Ooooo0o(58);
                                                i6 += i5;
                                                if (i6 == 16) {
                                                    o0ooo2.Ooooo0o(58);
                                                }
                                            } else {
                                                if (i6 > 0) {
                                                    o0ooo2.Ooooo0o(58);
                                                }
                                                o0ooo2.Ooooooo(((address[i6] & UByte.MAX_VALUE) << 8) | (address[i6 + 1] & UByte.MAX_VALUE));
                                                i6 += 2;
                                            }
                                        }
                                        return o0ooo2.Oooo0o();
                                    }
                                }
                                i20 = i17;
                                i17 = i20;
                                i11 = 0;
                                while (i17 < length2) {
                                    iOooO0O0 = o0000O.OooO0O0(strOooO0oo.charAt(i17));
                                    if (iOooO0O0 == -1) {
                                        break;
                                    }
                                    i11 = (i11 << 4) + iOooO0O0;
                                    i17++;
                                }
                                i12 = i17 - i20;
                                if (i12 == 0 && i12 <= 4) {
                                    int i24 = i18 + 1;
                                    bArr[i18] = (byte) ((i11 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                                    i18 = i24 + 1;
                                    bArr[i24] = (byte) (i11 & KotlinVersion.MAX_COMPONENT_VALUE);
                                    i13 = 0;
                                    i14 = 1;
                                    i15 = 16;
                                }
                            } else if (i19 == -1) {
                                i18 += 2;
                                i19 = i18;
                                if (i21 != length2) {
                                    i20 = i21;
                                    i17 = i20;
                                    i11 = 0;
                                    while (i17 < length2) {
                                        iOooO0O0 = o0000O.OooO0O0(strOooO0oo.charAt(i17));
                                        if (iOooO0O0 == -1) {
                                            break;
                                            break;
                                        }
                                        i11 = (i11 << 4) + iOooO0O0;
                                        i17++;
                                    }
                                    i12 = i17 - i20;
                                    if (i12 == 0) {
                                    }
                                }
                            }
                        }
                        byAddress = null;
                        if (byAddress == null) {
                            return null;
                        }
                        address = byAddress.getAddress();
                        i3 = 16;
                        if (address.length == 16) {
                            throw new AssertionError();
                        }
                        i4 = 0;
                        i5 = 0;
                        while (i4 < address.length) {
                            i7 = i4;
                            while (i7 < i3) {
                                i7 += 2;
                                i3 = 16;
                            }
                            i8 = i7 - i4;
                            if (i8 > i5) {
                                i16 = i4;
                                i5 = i8;
                            }
                            i4 = i7 + 2;
                            i3 = 16;
                        }
                        o0ooo2 = new o0oOO();
                        i6 = 0;
                        while (i6 < address.length) {
                            if (i6 == i16) {
                                o0ooo2.Ooooo0o(58);
                                i6 += i5;
                                if (i6 == 16) {
                                    o0ooo2.Ooooo0o(58);
                                }
                            } else {
                                if (i6 > 0) {
                                    o0ooo2.Ooooo0o(58);
                                }
                                o0ooo2.Ooooooo(((address[i6] & UByte.MAX_VALUE) << 8) | (address[i6 + 1] & UByte.MAX_VALUE));
                                i6 += 2;
                            }
                        }
                        return o0ooo2.Oooo0o();
                    }
                    if (i18 != 16) {
                        if (i19 == -1) {
                            byAddress = null;
                        } else {
                            int i25 = i18 - i19;
                            System.arraycopy(bArr, i19, bArr, 16 - i25, i25);
                            Arrays.fill(bArr, i19, (16 - i18) + i19, (byte) 0);
                        }
                        if (byAddress == null) {
                            return null;
                        }
                        address = byAddress.getAddress();
                        i3 = 16;
                        if (address.length == 16) {
                            throw new AssertionError();
                        }
                        i4 = 0;
                        i5 = 0;
                        while (i4 < address.length) {
                            i7 = i4;
                            while (i7 < i3) {
                                i7 += 2;
                                i3 = 16;
                            }
                            i8 = i7 - i4;
                            if (i8 > i5) {
                                i16 = i4;
                                i5 = i8;
                            }
                            i4 = i7 + 2;
                            i3 = 16;
                        }
                        o0ooo2 = new o0oOO();
                        i6 = 0;
                        while (i6 < address.length) {
                            if (i6 == i16) {
                                o0ooo2.Ooooo0o(58);
                                i6 += i5;
                                if (i6 == 16) {
                                    o0ooo2.Ooooo0o(58);
                                }
                            } else {
                                if (i6 > 0) {
                                    o0ooo2.Ooooo0o(58);
                                }
                                o0ooo2.Ooooooo(((address[i6] & UByte.MAX_VALUE) << 8) | (address[i6 + 1] & UByte.MAX_VALUE));
                                i6 += 2;
                            }
                        }
                        return o0ooo2.Oooo0o();
                    }
                    byAddress = InetAddress.getByAddress(bArr);
                    if (byAddress == null) {
                        return null;
                    }
                    address = byAddress.getAddress();
                    i3 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i4 = 0;
                    i5 = 0;
                    while (i4 < address.length) {
                        i7 = i4;
                        while (i7 < i3) {
                            i7 += 2;
                            i3 = 16;
                        }
                        i8 = i7 - i4;
                        if (i8 > i5) {
                            i16 = i4;
                            i5 = i8;
                        }
                        i4 = i7 + 2;
                        i3 = 16;
                    }
                    o0ooo2 = new o0oOO();
                    i6 = 0;
                    while (i6 < address.length) {
                        if (i6 == i16) {
                            o0ooo2.Ooooo0o(58);
                            i6 += i5;
                            if (i6 == 16) {
                                o0ooo2.Ooooo0o(58);
                            }
                        } else {
                            if (i6 > 0) {
                                o0ooo2.Ooooo0o(58);
                            }
                            o0ooo2.Ooooooo(((address[i6] & UByte.MAX_VALUE) << 8) | (address[i6 + 1] & UByte.MAX_VALUE));
                            i6 += 2;
                        }
                    }
                    return o0ooo2.Oooo0o();
                } catch (UnknownHostException unused2) {
                    throw new AssertionError();
                }
            }
        }

        public final o0000O OooO00o() {
            if (this.f39267OooO00o == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f39270OooO0Oo != null) {
                return new o0000O(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0089  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final o0000O OooO0OO(o0000O o0000o2, String str) {
            int i;
            int i2;
            int i3;
            char c;
            int iOooO0Oo;
            o0000O o0000o3;
            int i4;
            int i5;
            OooO00o oooO00o;
            OooO00o oooO00o2;
            OooO00o oooO00o3;
            int i6;
            int i7;
            String str2;
            String str3;
            String str4;
            int i8;
            int i9;
            OooO00o oooO00o4;
            String strSubstring;
            char cCharAt;
            OooO00o oooO00o5 = this;
            String str5 = str;
            int length = str.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i = length;
                    break;
                }
                char cCharAt2 = str5.charAt(i10);
                if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\f' && cCharAt2 != '\r' && cCharAt2 != ' ') {
                    i = i10;
                    break;
                }
                i10++;
            }
            int length2 = str.length() - 1;
            while (true) {
                if (length2 < i) {
                    i2 = i;
                    break;
                }
                char cCharAt3 = str5.charAt(length2);
                if (cCharAt3 != '\t' && cCharAt3 != '\n' && cCharAt3 != '\f' && cCharAt3 != '\r' && cCharAt3 != ' ') {
                    i2 = length2 + 1;
                    break;
                }
                length2--;
            }
            if (i2 - i >= 2) {
                char cCharAt4 = str5.charAt(i);
                char c2 = 'z';
                if ((cCharAt4 >= 'a' && cCharAt4 <= 'z') || (cCharAt4 >= 'A' && cCharAt4 <= 'Z')) {
                    i3 = i;
                    while (true) {
                        i3++;
                        if (i3 < i2) {
                            char cCharAt5 = str5.charAt(i3);
                            if ((cCharAt5 < 'a' || cCharAt5 > c2) && !((cCharAt5 >= 'A' && cCharAt5 <= 'Z') || cCharAt5 == '+' || cCharAt5 == '-' || cCharAt5 == '.')) {
                                if (cCharAt5 == ':') {
                                    break;
                                }
                                break;
                            }
                            c2 = 'z';
                        }
                        i3 = -1;
                        break;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            } else {
                i3 = -1;
                break;
            }
            if (i3 != -1) {
                if (str.regionMatches(true, i, "https:", 0, 6)) {
                    oooO00o5.f39267OooO00o = "https";
                    i += 6;
                } else {
                    if (!str.regionMatches(true, i, "http:", 0, 5)) {
                        return null;
                    }
                    oooO00o5.f39267OooO00o = "http";
                    i += 5;
                }
            } else {
                if (o0000o2 == null) {
                    return null;
                }
                oooO00o5.f39267OooO00o = o0000o2.f39259OooO00o;
            }
            int i11 = 0;
            int i12 = i;
            while (true) {
                c = '/';
                if (i12 >= i2 || !((cCharAt = str5.charAt(i12)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i11++;
                i12++;
            }
            String str6 = "";
            char c3 = '@';
            char c4 = '#';
            if (i11 >= 2 || o0000o2 == null || !o0000o2.f39259OooO00o.equals(oooO00o5.f39267OooO00o)) {
                int i13 = i + i11;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iOooO0Oo = o0000O.OooO0Oo(str5, i13, i2, "@/\\?#");
                    byte bCharAt = iOooO0Oo != i2 ? str5.charAt(iOooO0Oo) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c4 || bCharAt == c || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == c3) {
                        if (z) {
                            oooO00o5.f39269OooO0OO += "%40" + o0000O.OooO00o(str, i13, iOooO0Oo, " \"':;<=>@[]^`{}|/\\?#", true, false);
                        } else {
                            int iOooO0Oo2 = o0000O.OooO0Oo(str5, i13, iOooO0Oo, CertificateUtil.DELIMITER);
                            String strOooO00o = o0000O.OooO00o(str, i13, iOooO0Oo2, " \"':;<=>@[]^`{}|/\\?#", true, false);
                            if (z2) {
                                strOooO00o = o00O0O.OooO0O0(new StringBuilder(), oooO00o5.f39268OooO0O0, "%40", strOooO00o);
                            }
                            oooO00o5.f39268OooO0O0 = strOooO00o;
                            if (iOooO0Oo2 != iOooO0Oo) {
                                oooO00o5.f39269OooO0OO = o0000O.OooO00o(str, iOooO0Oo2 + 1, iOooO0Oo, " \"':;<=>@[]^`{}|/\\?#", true, false);
                                z = true;
                            }
                            z2 = true;
                        }
                        i13 = iOooO0Oo + 1;
                    }
                    c4 = '#';
                    c = '/';
                    c3 = '@';
                }
                int i14 = i13;
                while (true) {
                    if (i14 < iOooO0Oo) {
                        char cCharAt6 = str5.charAt(i14);
                        if (cCharAt6 == ':') {
                            break;
                        }
                        if (cCharAt6 == '[') {
                            i5 = 1;
                            do {
                                i14++;
                                if (i14 >= iOooO0Oo) {
                                    break;
                                }
                            } while (str5.charAt(i14) != ']');
                        } else {
                            i5 = 1;
                        }
                        i14 += i5;
                    } else {
                        i14 = iOooO0Oo;
                        break;
                    }
                }
                int i15 = i14 + 1;
                if (i15 < iOooO0Oo) {
                    oooO00o5.f39270OooO0Oo = OooO0O0(str5, i13, i14);
                    try {
                        i4 = Integer.parseInt(o0000O.OooO00o(str, i15, iOooO0Oo, "", false, false));
                        if (i4 <= 0 || i4 > 65535) {
                            i4 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    oooO00o5.f39272OooO0o0 = i4;
                    o0000o3 = null;
                    if (i4 == -1) {
                        return null;
                    }
                } else {
                    o0000o3 = null;
                    oooO00o5.f39270OooO0Oo = OooO0O0(str5, i13, i14);
                    oooO00o5.f39272OooO0o0 = o0000O.OooO0OO(oooO00o5.f39267OooO00o);
                }
                if (oooO00o5.f39270OooO0Oo == null) {
                    return o0000o3;
                }
                i = iOooO0Oo;
            } else {
                if (o0000o2.f39260OooO0O0.isEmpty()) {
                    strSubstring = "";
                } else {
                    int length3 = o0000o2.f39259OooO00o.length() + 3;
                    String str7 = o0000o2.f39266OooO0oo;
                    strSubstring = o0000o2.f39266OooO0oo.substring(length3, o0000O.OooO0Oo(str7, length3, str7.length(), ":@"));
                }
                oooO00o5.f39268OooO0O0 = strSubstring;
                oooO00o5.f39269OooO0OO = o0000o2.f39261OooO0OO.isEmpty() ? "" : o0000o2.f39266OooO0oo.substring(o0000o2.f39266OooO0oo.indexOf(58, o0000o2.f39259OooO00o.length() + 3) + 1, o0000o2.f39266OooO0oo.indexOf(64));
                oooO00o5.f39270OooO0Oo = o0000o2.f39262OooO0Oo;
                oooO00o5.f39272OooO0o0 = o0000o2.f39264OooO0o0;
                oooO00o5.f39271OooO0o.clear();
                List<String> list = oooO00o5.f39271OooO0o;
                int iIndexOf = o0000o2.f39266OooO0oo.indexOf(47, o0000o2.f39259OooO00o.length() + 3);
                String str8 = o0000o2.f39266OooO0oo;
                int iOooO0Oo3 = o0000O.OooO0Oo(str8, iIndexOf, str8.length(), "?#");
                ArrayList arrayList = new ArrayList();
                while (iIndexOf < iOooO0Oo3) {
                    int i16 = iIndexOf + 1;
                    int iOooO0Oo4 = o0000O.OooO0Oo(o0000o2.f39266OooO0oo, i16, iOooO0Oo3, "/");
                    arrayList.add(o0000o2.f39266OooO0oo.substring(i16, iOooO0Oo4));
                    iIndexOf = iOooO0Oo4;
                }
                list.addAll(arrayList);
                if (i == i2 || str5.charAt(i) == '#') {
                    String strOooO0o0 = o0000o2.OooO0o0();
                    oooO00o5.f39273OooO0oO = (ArrayList) (strOooO0o0 != null ? o0000O.OooOO0(o0000O.OooO00o(strOooO0o0, 0, strOooO0o0.length(), " \"'<>#", true, true)) : null);
                }
            }
            int iOooO0Oo5 = o0000O.OooO0Oo(str5, i, i2, "?#");
            if (i == iOooO0Oo5) {
                i6 = iOooO0Oo5;
                str2 = str5;
                i9 = i2;
                oooO00o4 = oooO00o5;
            } else {
                char cCharAt7 = str5.charAt(i);
                if (cCharAt7 == '/' || cCharAt7 == '\\') {
                    oooO00o5.f39271OooO0o.clear();
                    oooO00o5.f39271OooO0o.add("");
                    oooO00o = oooO00o5;
                    oooO00o2 = oooO00o;
                    oooO00o3 = oooO00o2;
                    i6 = iOooO0Oo5;
                    i7 = i6;
                    str2 = str5;
                    str3 = str2;
                    i++;
                    str4 = str5;
                    i8 = 1;
                } else {
                    List<String> list2 = oooO00o5.f39271OooO0o;
                    list2.set(list2.size() - 1, "");
                    oooO00o = oooO00o5;
                    oooO00o2 = oooO00o;
                    oooO00o3 = oooO00o2;
                    i6 = iOooO0Oo5;
                    i7 = i6;
                    str2 = str5;
                    str3 = str2;
                    str4 = str3;
                    i8 = 1;
                }
                loop5: while (true) {
                    i9 = i2;
                    int i17 = i;
                    while (true) {
                        if (i17 >= i7) {
                            break loop5;
                        }
                        int iOooO0Oo6 = o0000O.OooO0Oo(str4, i17, i7, "/\\");
                        boolean z3 = iOooO0Oo6 < i7;
                        String str9 = str6;
                        String strOooO00o2 = o0000O.OooO00o(str4, i17, iOooO0Oo6, " \"<>^`{}|/\\?#", true, false);
                        if (!(strOooO00o2.equals(".") || strOooO00o2.equalsIgnoreCase("%2e"))) {
                            if (strOooO00o2.equals("..") || strOooO00o2.equalsIgnoreCase("%2e.") || strOooO00o2.equalsIgnoreCase(".%2e") || strOooO00o2.equalsIgnoreCase("%2e%2e")) {
                                List<String> list3 = oooO00o3.f39271OooO0o;
                                if (!list3.remove(list3.size() - 1).isEmpty() || oooO00o3.f39271OooO0o.isEmpty()) {
                                    oooO00o3.f39271OooO0o.add(str9);
                                } else {
                                    List<String> list4 = oooO00o3.f39271OooO0o;
                                    list4.set(list4.size() - 1, str9);
                                }
                            } else {
                                List<String> list5 = oooO00o3.f39271OooO0o;
                                if (list5.get(list5.size() - 1).isEmpty()) {
                                    List<String> list6 = oooO00o3.f39271OooO0o;
                                    list6.set(list6.size() - i8, strOooO00o2);
                                } else {
                                    oooO00o3.f39271OooO0o.add(strOooO00o2);
                                }
                                if (z3) {
                                    oooO00o3.f39271OooO0o.add(str9);
                                }
                            }
                        }
                        if (z3) {
                            i2 = i9;
                            int i18 = i8;
                            i = iOooO0Oo6 + i18;
                            str4 = str4;
                            i8 = i18;
                            str6 = str9;
                        } else {
                            str6 = str9;
                            i17 = iOooO0Oo6;
                        }
                    }
                }
                str5 = str3;
                oooO00o5 = oooO00o;
                oooO00o4 = oooO00o2;
            }
            if (i6 < i9 && str2.charAt(i6) == '?') {
                int iOooO0Oo7 = o0000O.OooO0Oo(str2, i6, i9, "#");
                oooO00o5.f39273OooO0oO = (ArrayList) o0000O.OooOO0(o0000O.OooO00o(str5, i6 + 1, iOooO0Oo7, " \"'<>#", true, true));
                i6 = iOooO0Oo7;
            }
            if (i6 < i9 && str2.charAt(i6) == '#') {
                oooO00o5.f39274OooO0oo = o0000O.OooO00o(str5, i6 + 1, i9, "", true, false);
            }
            return oooO00o4.OooO00o();
        }

        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.String>] */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f39267OooO00o);
            sb.append("://");
            if (!this.f39268OooO0O0.isEmpty() || !this.f39269OooO0OO.isEmpty()) {
                sb.append(this.f39268OooO0O0);
                if (!this.f39269OooO0OO.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f39269OooO0OO);
                }
                sb.append('@');
            }
            if (this.f39270OooO0Oo.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f39270OooO0Oo);
                sb.append(']');
            } else {
                sb.append(this.f39270OooO0Oo);
            }
            int iOooO0OO = this.f39272OooO0o0;
            if (iOooO0OO == -1) {
                iOooO0OO = o0000O.OooO0OO(this.f39267OooO00o);
            }
            if (iOooO0OO != o0000O.OooO0OO(this.f39267OooO00o)) {
                sb.append(':');
                sb.append(iOooO0OO);
            }
            ?? r1 = this.f39271OooO0o;
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) r1.get(i));
            }
            if (this.f39273OooO0oO != null) {
                sb.append('?');
                o0000O.OooO0o(sb, this.f39273OooO0oO);
            }
            if (this.f39274OooO0oo != null) {
                sb.append('#');
                sb.append(this.f39274OooO0oo);
            }
            return sb.toString();
        }
    }

    public o0000O(OooO00o oooO00o) {
        this.f39259OooO00o = oooO00o.f39267OooO00o;
        this.f39260OooO0O0 = OooO0oO(oooO00o.f39268OooO0O0);
        this.f39261OooO0OO = OooO0oO(oooO00o.f39269OooO0OO);
        this.f39262OooO0Oo = oooO00o.f39270OooO0Oo;
        int i = oooO00o.f39272OooO0o0;
        this.f39264OooO0o0 = i == -1 ? OooO0OO(oooO00o.f39267OooO00o) : i;
        this.f39263OooO0o = OooO(oooO00o.f39271OooO0o);
        List<String> list = oooO00o.f39273OooO0oO;
        this.f39265OooO0oO = list != null ? OooO(list) : null;
        String str = oooO00o.f39274OooO0oo;
        if (str != null) {
            OooO0oO(str);
        }
        this.f39266OooO0oo = oooO00o.toString();
    }

    public static String OooO00o(String str, int i, int i2, String str2, boolean z, boolean z2) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && !z) || (z2 && iCodePointAt == 43))) {
                o0oOO o0ooo2 = new o0oOO();
                o0ooo2.o00oO0O(str, i, iCharCount);
                o0oOO o0ooo3 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (z2 && iCodePointAt2 == 43) {
                            o0ooo2.o00oO0o(z ? "%20" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && !z)) {
                            if (o0ooo3 == null) {
                                o0ooo3 = new o0oOO();
                            }
                            o0ooo3.oo0o0Oo(iCodePointAt2);
                            while (!o0ooo3.OooOooo()) {
                                int i3 = o0ooo3.readByte() & UByte.MAX_VALUE;
                                o0ooo2.Ooooo0o(37);
                                char[] cArr = f39258OooO;
                                o0ooo2.Ooooo0o(cArr[(i3 >> 4) & 15]);
                                o0ooo2.Ooooo0o(cArr[i3 & 15]);
                            }
                        } else {
                            o0ooo2.oo0o0Oo(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return o0ooo2.Oooo0o();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    public static int OooO0O0(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static int OooO0OO(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static int OooO0Oo(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static void OooO0o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String OooO0oO(String str) {
        return OooO0oo(str, 0, str.length());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public static String OooO0oo(String str, int i, int i2) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            if (str.charAt(iCharCount) == '%') {
                o0oOO o0ooo2 = new o0oOO();
                o0ooo2.o00oO0O(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i3 = iCharCount + 2) >= i2) {
                        o0ooo2.oo0o0Oo(iCodePointAt);
                    } else {
                        int iOooO0O0 = OooO0O0(str.charAt(iCharCount + 1));
                        int iOooO0O1 = OooO0O0(str.charAt(i3));
                        if (iOooO0O0 == -1 || iOooO0O1 == -1) {
                            o0ooo2.oo0o0Oo(iCodePointAt);
                        } else {
                            o0ooo2.Ooooo0o((iOooO0O0 << 4) + iOooO0O1);
                            iCharCount = i3;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return o0ooo2.Oooo0o();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static List<String> OooOO0(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public final List<String> OooO(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? OooO0oo(next, 0, next.length()) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String OooO0o0() {
        if (this.f39265OooO0oO == null) {
            return null;
        }
        int iIndexOf = this.f39266OooO0oo.indexOf(63) + 1;
        String str = this.f39266OooO0oo;
        return this.f39266OooO0oo.substring(iIndexOf, OooO0Oo(str, iIndexOf + 1, str.length(), "#"));
    }

    public final URI OooOO0O() {
        try {
            return new URI(this.f39266OooO0oo);
        } catch (URISyntaxException unused) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("not valid as a java.net.URI: ");
            sbOooO0o0.append(this.f39266OooO0oo);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0000O) && ((o0000O) obj).f39266OooO0oo.equals(this.f39266OooO0oo);
    }

    public final int hashCode() {
        return this.f39266OooO0oo.hashCode();
    }

    public final String toString() {
        return this.f39266OooO0oo;
    }
}
