package com.squareup.okhttp;

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
import kotlin.UByte;
import kotlin.text.Typography;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final char[] f21630OooO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f21631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f21632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f21633OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f21634OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<String> f21635OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f21636OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<String> f21637OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f21638OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f21639OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f21642OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ArrayList f21643OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList f21645OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f21646OooO0oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f21640OooO0O0 = "";

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f21641OooO0OO = "";

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f21644OooO0o0 = -1;

        public OooO00o() {
            ArrayList arrayList = new ArrayList();
            this.f21643OooO0o = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Code duplicated, block: B:102:0x013f  */
        /* JADX WARN: Code duplicated, block: B:109:0x0153  */
        /* JADX WARN: Code duplicated, block: B:113:0x016d  */
        /* JADX WARN: Code duplicated, block: B:139:0x00cf A[EDGE_INSN: B:139:0x00cf->B:68:0x00cf BREAK  A[LOOP:1: B:63:0x00bc->B:67:0x00c9], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x0131 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x014f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x014b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x0143 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x013c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x00be  */
        /* JADX WARN: Code duplicated, block: B:67:0x00c9 A[LOOP:1: B:63:0x00bc->B:67:0x00c9, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:81:0x0109 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:83:0x010b  */
        /* JADX WARN: Code duplicated, block: B:85:0x0114  */
        /* JADX WARN: Code duplicated, block: B:88:0x0119  */
        /* JADX WARN: Code duplicated, block: B:90:0x011c  */
        /* JADX WARN: Code duplicated, block: B:97:0x012f  */
        public static String OooO0O0(int i, int i2, String str) {
            String lowerCase;
            int i3;
            InetAddress byAddress;
            byte[] address;
            int i4;
            int i5;
            int i6;
            o00000O o00000o;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int iOooO0O0;
            String strOooO0oO = o0OoOo0.OooO0oO(i, i2, str);
            int i13 = 0;
            if (!strOooO0oO.startsWith("[") || !strOooO0oO.endsWith("]")) {
                try {
                    lowerCase = IDN.toASCII(strOooO0oO).toLowerCase(Locale.US);
                    if (lowerCase.isEmpty()) {
                        lowerCase = null;
                    }
                } catch (IllegalArgumentException unused) {
                }
                if (lowerCase == null) {
                    return null;
                }
                int length = lowerCase.length();
                if (o0OoOo0.OooO0Oo(0, length, lowerCase, "\u0000\t\n\r #%/:?@[\\]") != length) {
                    return null;
                }
                return lowerCase;
            }
            int i14 = 1;
            int length2 = strOooO0oO.length() - 1;
            int i15 = 16;
            byte[] bArr = new byte[16];
            int i16 = -1;
            int i17 = 0;
            int i18 = 1;
            int i19 = -1;
            int i20 = -1;
            while (true) {
                try {
                    if (i18 < length2) {
                        if (i17 != i15) {
                            int i21 = i18 + 2;
                            if (i21 > length2 || !strOooO0oO.regionMatches(i18, "::", i13, 2)) {
                                if (i17 != 0) {
                                    if (strOooO0oO.regionMatches(i18, CertificateUtil.DELIMITER, i13, i14)) {
                                        i18++;
                                    } else {
                                        if (strOooO0oO.regionMatches(i18, ".", i13, i14)) {
                                            int i22 = i17 - 2;
                                            int i23 = i22;
                                            loop5: while (true) {
                                                if (i20 >= length2) {
                                                    if (i23 == i22 + 4) {
                                                        i10 = 1;
                                                        break;
                                                    }
                                                    i10 = 0;
                                                    break loop5;
                                                }
                                                if (i23 != i15) {
                                                    if (i23 != i22) {
                                                        if (strOooO0oO.charAt(i20) == '.') {
                                                            i20++;
                                                        }
                                                    }
                                                    int i24 = i13;
                                                    int i25 = i20;
                                                    while (true) {
                                                        if (i25 < length2) {
                                                            char cCharAt = strOooO0oO.charAt(i25);
                                                            if (cCharAt >= '0' && cCharAt <= '9') {
                                                                if ((i24 != 0 || i20 == i25) && (i24 = ((i24 * 10) + cCharAt) - 48) <= 255) {
                                                                    i25++;
                                                                }
                                                            }
                                                            i10 = 0;
                                                            break loop5;
                                                        }
                                                        if (i25 - i20 == 0) {
                                                            i10 = 0;
                                                            break loop5;
                                                        }
                                                        bArr[i23] = (byte) i24;
                                                        i23++;
                                                        i20 = i25;
                                                        i13 = 0;
                                                        i15 = 16;
                                                    }
                                                }
                                                i10 = i13;
                                                break;
                                            }
                                            if (i10 != 0) {
                                                i17 += 2;
                                                i3 = 16;
                                            }
                                        }
                                        byAddress = null;
                                    }
                                    byAddress = null;
                                }
                                i20 = i18;
                                i18 = i20;
                                i11 = 0;
                                while (i18 < length2) {
                                    iOooO0O0 = o0OoOo0.OooO0O0(strOooO0oO.charAt(i18));
                                    if (iOooO0O0 == -1) {
                                        break;
                                    }
                                    i11 = (i11 << 4) + iOooO0O0;
                                    i18++;
                                }
                                i12 = i18 - i20;
                                if (i12 != 0 || i12 > 4) {
                                    byAddress = null;
                                } else {
                                    int i26 = i17 + 1;
                                    bArr[i17] = (byte) ((i11 >>> 8) & 255);
                                    i17 = i26 + 1;
                                    bArr[i26] = (byte) (i11 & 255);
                                    i13 = 0;
                                    i14 = 1;
                                    i15 = 16;
                                }
                            } else if (i19 == -1) {
                                i17 += 2;
                                if (i21 == length2) {
                                    i3 = i15;
                                    i19 = i17;
                                } else {
                                    i19 = i17;
                                    i20 = i21;
                                    i18 = i20;
                                    i11 = 0;
                                    while (i18 < length2) {
                                        iOooO0O0 = o0OoOo0.OooO0O0(strOooO0oO.charAt(i18));
                                        if (iOooO0O0 == -1) {
                                            break;
                                            break;
                                        }
                                        i11 = (i11 << 4) + iOooO0O0;
                                        i18++;
                                    }
                                    i12 = i18 - i20;
                                    if (i12 != 0) {
                                    }
                                    byAddress = null;
                                }
                            }
                            if (byAddress == null) {
                                return null;
                            }
                            address = byAddress.getAddress();
                            i4 = 16;
                            if (address.length == 16) {
                                throw new AssertionError();
                            }
                            i5 = 0;
                            i6 = 0;
                            while (i5 < address.length) {
                                i8 = i5;
                                while (i8 < i4 && address[i8] == 0 && address[i8 + 1] == 0) {
                                    i8 += 2;
                                    i4 = 16;
                                }
                                i9 = i8 - i5;
                                if (i9 > i6) {
                                    i16 = i5;
                                    i6 = i9;
                                }
                                i5 = i8 + 2;
                                i4 = 16;
                            }
                            o00000o = new o00000O();
                            i7 = 0;
                            while (i7 < address.length) {
                                if (i7 == i16) {
                                    o00000o.o00O0O(58);
                                    i7 += i6;
                                    if (i7 == 16) {
                                        o00000o.o00O0O(58);
                                    }
                                } else {
                                    if (i7 > 0) {
                                        o00000o.o00O0O(58);
                                    }
                                    o00000o.o00ooo(((address[i7] & UByte.MAX_VALUE) << 8) | (address[i7 + 1] & UByte.MAX_VALUE));
                                    i7 += 2;
                                }
                            }
                            return o00000o.OoooOO0();
                        }
                        byAddress = null;
                        if (byAddress == null) {
                            return null;
                        }
                        address = byAddress.getAddress();
                        i4 = 16;
                        if (address.length == 16) {
                            throw new AssertionError();
                        }
                        i5 = 0;
                        i6 = 0;
                        while (i5 < address.length) {
                            i8 = i5;
                            while (i8 < i4) {
                                i8 += 2;
                                i4 = 16;
                            }
                            i9 = i8 - i5;
                            if (i9 > i6) {
                                i16 = i5;
                                i6 = i9;
                            }
                            i5 = i8 + 2;
                            i4 = 16;
                        }
                        o00000o = new o00000O();
                        i7 = 0;
                        while (i7 < address.length) {
                            if (i7 == i16) {
                                o00000o.o00O0O(58);
                                i7 += i6;
                                if (i7 == 16) {
                                    o00000o.o00O0O(58);
                                }
                            } else {
                                if (i7 > 0) {
                                    o00000o.o00O0O(58);
                                }
                                o00000o.o00ooo(((address[i7] & UByte.MAX_VALUE) << 8) | (address[i7 + 1] & UByte.MAX_VALUE));
                                i7 += 2;
                            }
                        }
                        return o00000o.OoooOO0();
                    }
                    i3 = i15;
                    if (i17 != i3) {
                        if (i19 == -1) {
                            byAddress = null;
                        } else {
                            int i27 = i17 - i19;
                            System.arraycopy(bArr, i19, bArr, 16 - i27, i27);
                            Arrays.fill(bArr, i19, (16 - i17) + i19, (byte) 0);
                        }
                        if (byAddress == null) {
                            return null;
                        }
                        address = byAddress.getAddress();
                        i4 = 16;
                        if (address.length == 16) {
                            throw new AssertionError();
                        }
                        i5 = 0;
                        i6 = 0;
                        while (i5 < address.length) {
                            i8 = i5;
                            while (i8 < i4) {
                                i8 += 2;
                                i4 = 16;
                            }
                            i9 = i8 - i5;
                            if (i9 > i6) {
                                i16 = i5;
                                i6 = i9;
                            }
                            i5 = i8 + 2;
                            i4 = 16;
                        }
                        o00000o = new o00000O();
                        i7 = 0;
                        while (i7 < address.length) {
                            if (i7 == i16) {
                                o00000o.o00O0O(58);
                                i7 += i6;
                                if (i7 == 16) {
                                    o00000o.o00O0O(58);
                                }
                            } else {
                                if (i7 > 0) {
                                    o00000o.o00O0O(58);
                                }
                                o00000o.o00ooo(((address[i7] & UByte.MAX_VALUE) << 8) | (address[i7 + 1] & UByte.MAX_VALUE));
                                i7 += 2;
                            }
                        }
                        return o00000o.OoooOO0();
                    }
                    byAddress = InetAddress.getByAddress(bArr);
                    if (byAddress == null) {
                        return null;
                    }
                    address = byAddress.getAddress();
                    i4 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i5 = 0;
                    i6 = 0;
                    while (i5 < address.length) {
                        i8 = i5;
                        while (i8 < i4) {
                            i8 += 2;
                            i4 = 16;
                        }
                        i9 = i8 - i5;
                        if (i9 > i6) {
                            i16 = i5;
                            i6 = i9;
                        }
                        i5 = i8 + 2;
                        i4 = 16;
                    }
                    o00000o = new o00000O();
                    i7 = 0;
                    while (i7 < address.length) {
                        if (i7 == i16) {
                            o00000o.o00O0O(58);
                            i7 += i6;
                            if (i7 == 16) {
                                o00000o.o00O0O(58);
                            }
                        } else {
                            if (i7 > 0) {
                                o00000o.o00O0O(58);
                            }
                            o00000o.o00ooo(((address[i7] & UByte.MAX_VALUE) << 8) | (address[i7 + 1] & UByte.MAX_VALUE));
                            i7 += 2;
                        }
                    }
                    return o00000o.OoooOO0();
                } catch (UnknownHostException unused2) {
                    throw new AssertionError();
                }
            }
        }

        public final o0OoOo0 OooO00o() {
            if (this.f21639OooO00o == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f21642OooO0Oo != null) {
                return new o0OoOo0(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:128:0x023e  */
        /* JADX WARN: Code duplicated, block: B:130:0x0244  */
        /* JADX WARN: Code duplicated, block: B:132:0x0248  */
        /* JADX WARN: Code duplicated, block: B:133:0x024a  */
        /* JADX WARN: Code duplicated, block: B:136:0x024e  */
        /* JADX WARN: Code duplicated, block: B:142:0x025d  */
        /* JADX WARN: Code duplicated, block: B:148:0x027e  */
        /* JADX WARN: Code duplicated, block: B:151:0x0284 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:153:0x0286  */
        /* JADX WARN: Code duplicated, block: B:154:0x0288  */
        /* JADX WARN: Code duplicated, block: B:157:0x029b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:158:0x029c  */
        /* JADX WARN: Code duplicated, block: B:268:0x0259 A[EDGE_INSN: B:268:0x0259->B:140:0x0259 BREAK  A[LOOP:7: B:127:0x023c->B:138:0x0256], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:269:0x0258 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:271:0x0256 A[EDGE_INSN: B:271:0x0256->B:138:0x0256 BREAK  A[LOOP:8: B:134:0x024b->B:273:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x008a  */
        /* JADX WARN: Code duplicated, block: B:97:0x0192  */
        public final o0OoOo0 OooO0OO(o0OoOo0 o0oooo0, String str) {
            int i;
            int i2;
            int i3;
            int i4;
            int iOooO0Oo;
            byte bCharAt;
            String str2;
            int i5;
            int i6;
            o0OoOo0 o0oooo1;
            int i7;
            char cCharAt;
            int i8;
            int i9;
            int i10;
            String str3;
            String str4;
            int i11;
            String str5;
            String str6;
            int i12;
            OooO00o oooO00o;
            OooO00o oooO00o2;
            String strSubstring;
            char cCharAt2;
            String str7 = str;
            int length = str.length();
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i = length;
                    break;
                }
                char cCharAt3 = str7.charAt(i13);
                if (cCharAt3 != '\t' && cCharAt3 != '\n' && cCharAt3 != '\f' && cCharAt3 != '\r' && cCharAt3 != ' ') {
                    i = i13;
                    break;
                }
                i13++;
            }
            int length2 = str.length() - 1;
            while (true) {
                if (length2 < i) {
                    i2 = i;
                    break;
                }
                char cCharAt4 = str7.charAt(length2);
                if (cCharAt4 != '\t' && cCharAt4 != '\n' && cCharAt4 != '\f' && cCharAt4 != '\r' && cCharAt4 != ' ') {
                    i2 = length2 + 1;
                    break;
                }
                length2--;
            }
            if (i2 - i < 2) {
                i3 = -1;
                break;
            }
            char cCharAt5 = str7.charAt(i);
            char c = 'Z';
            if ((cCharAt5 < 'a' || cCharAt5 > 'z') && (cCharAt5 < 'A' || cCharAt5 > 'Z')) {
                i3 = -1;
                break;
            }
            i3 = i;
            while (true) {
                i3++;
                if (i3 < i2) {
                    char cCharAt6 = str7.charAt(i3);
                    if ((cCharAt6 < 'a' || cCharAt6 > 'z') && !((cCharAt6 >= 'A' && cCharAt6 <= c) || cCharAt6 == '+' || cCharAt6 == '-' || cCharAt6 == '.')) {
                        if (cCharAt6 == ':') {
                            break;
                        }
                        break;
                    }
                    c = 'Z';
                }
                i3 = -1;
                break;
            }
            if (i3 == -1) {
                if (o0oooo0 == null) {
                    return null;
                }
                this.f21639OooO00o = o0oooo0.f21631OooO00o;
            } else if (str.regionMatches(true, i, "https:", 0, 6)) {
                this.f21639OooO00o = "https";
                i += 6;
            } else {
                if (!str.regionMatches(true, i, "http:", 0, 5)) {
                    return null;
                }
                this.f21639OooO00o = "http";
                i += 5;
            }
            int i14 = 0;
            for (int i15 = i; i15 < i2 && ((cCharAt2 = str7.charAt(i15)) == '\\' || cCharAt2 == '/'); i15++) {
                i14++;
            }
            ArrayList arrayList = this.f21643OooO0o;
            char c2 = '@';
            String str8 = "";
            if (i14 >= 2 || o0oooo0 == null) {
                boolean z = false;
                i4 = i + i14;
                boolean z2 = false;
                while (true) {
                    iOooO0Oo = o0OoOo0.OooO0Oo(i4, i2, str7, "@/\\?#");
                    if (iOooO0Oo != i2) {
                        bCharAt = str7.charAt(iOooO0Oo);
                    } else {
                        bCharAt = -1;
                    }
                    if (bCharAt == -1 || bCharAt == 35 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt != c2) {
                        str8 = str8;
                    } else {
                        if (z2) {
                            i9 = iOooO0Oo;
                            this.f21641OooO0OO += "%40" + o0OoOo0.OooO00o(str, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, i9);
                        } else {
                            int iOooO0Oo2 = o0OoOo0.OooO0Oo(i4, iOooO0Oo, str7, CertificateUtil.DELIMITER);
                            i9 = iOooO0Oo;
                            String strOooO00o = o0OoOo0.OooO00o(str, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, iOooO0Oo2);
                            if (z) {
                                strOooO00o = androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO0OO(new StringBuilder(), this.f21640OooO0O0, "%40", strOooO00o);
                            }
                            this.f21640OooO0O0 = strOooO00o;
                            if (iOooO0Oo2 != i9) {
                                this.f21641OooO0OO = o0OoOo0.OooO00o(str, iOooO0Oo2 + 1, " \"':;<=>@[]^`{}|/\\?#", true, false, i9);
                                z2 = true;
                            }
                            z = true;
                        }
                        i4 = i9 + 1;
                    }
                    str8 = str8;
                    c2 = '@';
                }
                str2 = str8;
                i5 = i4;
                while (true) {
                    if (i5 >= iOooO0Oo) {
                        i5 = iOooO0Oo;
                        break;
                    }
                    cCharAt = str7.charAt(i5);
                    if (cCharAt != ':') {
                        break;
                    }
                    if (cCharAt != '[') {
                        i8 = 1;
                        do {
                            i5++;
                            if (i5 < iOooO0Oo) {
                                break;
                            }
                        } while (str7.charAt(i5) != ']');
                    } else {
                        i8 = 1;
                    }
                    i5 += i8;
                }
                i6 = i5 + 1;
                if (i6 < iOooO0Oo) {
                    this.f21642OooO0Oo = OooO0O0(i4, i5, str7);
                    try {
                        i7 = Integer.parseInt(o0OoOo0.OooO00o(str, i6, "", false, false, iOooO0Oo));
                        if (i7 > 0 || i7 > 65535) {
                            i7 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f21644OooO0o0 = i7;
                    if (i7 == -1) {
                        return null;
                    }
                    o0oooo1 = null;
                } else {
                    o0oooo1 = null;
                    this.f21642OooO0Oo = OooO0O0(i4, i5, str7);
                    this.f21644OooO0o0 = o0OoOo0.OooO0OO(this.f21639OooO00o);
                }
                if (this.f21642OooO0Oo == null) {
                    return o0oooo1;
                }
                i = iOooO0Oo;
            } else {
                String str9 = this.f21639OooO00o;
                String str10 = o0oooo0.f21631OooO00o;
                if (str10.equals(str9)) {
                    boolean zIsEmpty = o0oooo0.f21632OooO0O0.isEmpty();
                    String str11 = o0oooo0.f21638OooO0oo;
                    if (zIsEmpty) {
                        strSubstring = "";
                    } else {
                        int length3 = str10.length() + 3;
                        strSubstring = str11.substring(length3, o0OoOo0.OooO0Oo(length3, str11.length(), str11, ":@"));
                    }
                    this.f21640OooO0O0 = strSubstring;
                    this.f21641OooO0OO = o0oooo0.f21633OooO0OO.isEmpty() ? "" : str11.substring(str11.indexOf(58, str10.length() + 3) + 1, str11.indexOf(64));
                    this.f21642OooO0Oo = o0oooo0.f21634OooO0Oo;
                    this.f21644OooO0o0 = o0oooo0.f21636OooO0o0;
                    arrayList.clear();
                    int iIndexOf = str11.indexOf(47, str10.length() + 3);
                    int iOooO0Oo3 = o0OoOo0.OooO0Oo(iIndexOf, str11.length(), str11, "?#");
                    ArrayList arrayList2 = new ArrayList();
                    while (iIndexOf < iOooO0Oo3) {
                        int i16 = iIndexOf + 1;
                        int iOooO0Oo4 = o0OoOo0.OooO0Oo(i16, iOooO0Oo3, str11, "/");
                        arrayList2.add(str11.substring(i16, iOooO0Oo4));
                        iIndexOf = iOooO0Oo4;
                    }
                    arrayList.addAll(arrayList2);
                    if (i == i2 || str7.charAt(i) == '#') {
                        String strOooO0o0 = o0oooo0.OooO0o0();
                        this.f21645OooO0oO = strOooO0o0 != null ? o0OoOo0.OooO(o0OoOo0.OooO00o(strOooO0o0, 0, " \"'<>#", true, true, strOooO0o0.length())) : null;
                    }
                    str2 = "";
                } else {
                    boolean z3 = false;
                    i4 = i + i14;
                    boolean z4 = false;
                    while (true) {
                        iOooO0Oo = o0OoOo0.OooO0Oo(i4, i2, str7, "@/\\?#");
                        if (iOooO0Oo != i2) {
                            bCharAt = str7.charAt(iOooO0Oo);
                        } else {
                            bCharAt = -1;
                        }
                        if (bCharAt == -1) {
                            break;
                        }
                        break;
                        str8 = str8;
                        c2 = '@';
                    }
                    str2 = str8;
                    i5 = i4;
                    while (true) {
                        if (i5 >= iOooO0Oo) {
                            i5 = iOooO0Oo;
                            break;
                        }
                        cCharAt = str7.charAt(i5);
                        if (cCharAt != ':') {
                            break;
                            break;
                        }
                        if (cCharAt != '[') {
                            i8 = 1;
                            do {
                                i5++;
                                if (i5 < iOooO0Oo) {
                                    break;
                                    break;
                                }
                            } while (str7.charAt(i5) != ']');
                        } else {
                            i8 = 1;
                        }
                        i5 += i8;
                    }
                    i6 = i5 + 1;
                    if (i6 < iOooO0Oo) {
                        this.f21642OooO0Oo = OooO0O0(i4, i5, str7);
                        i7 = Integer.parseInt(o0OoOo0.OooO00o(str, i6, "", false, false, iOooO0Oo));
                        if (i7 > 0) {
                            i7 = -1;
                        } else {
                            i7 = -1;
                        }
                        this.f21644OooO0o0 = i7;
                        if (i7 == -1) {
                            return null;
                        }
                        o0oooo1 = null;
                    } else {
                        o0oooo1 = null;
                        this.f21642OooO0Oo = OooO0O0(i4, i5, str7);
                        this.f21644OooO0o0 = o0OoOo0.OooO0OO(this.f21639OooO00o);
                    }
                    if (this.f21642OooO0Oo == null) {
                        return o0oooo1;
                    }
                    i = iOooO0Oo;
                }
            }
            int iOooO0Oo5 = o0OoOo0.OooO0Oo(i, i2, str7, "?#");
            if (i == iOooO0Oo5) {
                oooO00o = this;
                oooO00o2 = oooO00o;
                i11 = iOooO0Oo5;
                str5 = str7;
                i2 = i2;
            } else {
                char cCharAt7 = str7.charAt(i);
                if (cCharAt7 == '/' || cCharAt7 == '\\') {
                    String str12 = str2;
                    arrayList.clear();
                    arrayList.add(str12);
                    i10 = iOooO0Oo5;
                    str3 = str12;
                    str4 = str7;
                    i11 = i10;
                    str5 = str4;
                    str6 = str7;
                    i12 = i + 1;
                    oooO00o = this;
                    oooO00o2 = this;
                } else {
                    String str13 = str2;
                    arrayList.set(arrayList.size() - 1, str13);
                    oooO00o = this;
                    oooO00o2 = oooO00o;
                    i10 = iOooO0Oo5;
                    str3 = str13;
                    str4 = str7;
                    str6 = str4;
                    i12 = i;
                    i11 = i10;
                    str5 = str6;
                }
                while (i12 < i10) {
                    int iOooO0Oo6 = o0OoOo0.OooO0Oo(i12, i10, str6, "/\\");
                    boolean z5 = iOooO0Oo6 < i10;
                    String strOooO00o2 = o0OoOo0.OooO00o(str6, i12, " \"<>^`{}|/\\?#", true, false, iOooO0Oo6);
                    if (!(strOooO00o2.equals(".") || strOooO00o2.equalsIgnoreCase("%2e"))) {
                        if (!(strOooO00o2.equals("..") || strOooO00o2.equalsIgnoreCase("%2e.") || strOooO00o2.equalsIgnoreCase(".%2e") || strOooO00o2.equalsIgnoreCase("%2e%2e"))) {
                            if (((String) p018OooOoo0.OooOOO.OooO0O0(arrayList, 1)).isEmpty()) {
                                arrayList.set(arrayList.size() - 1, strOooO00o2);
                            } else {
                                arrayList.add(strOooO00o2);
                            }
                            if (z5) {
                                arrayList.add(str3);
                            }
                        } else if (!((String) arrayList.remove(arrayList.size() - 1)).isEmpty() || arrayList.isEmpty()) {
                            arrayList.add(str3);
                        } else {
                            arrayList.set(arrayList.size() - 1, str3);
                        }
                    }
                    if (z5) {
                        str6 = str6;
                        i2 = i2;
                        i12 = iOooO0Oo6 + 1;
                        oooO00o = oooO00o;
                        oooO00o2 = oooO00o2;
                    } else {
                        i12 = iOooO0Oo6;
                    }
                }
                str7 = str4;
            }
            if (i11 < i2 && str5.charAt(i11) == '?') {
                int iOooO0Oo7 = o0OoOo0.OooO0Oo(i11, i2, str5, "#");
                oooO00o.f21645OooO0oO = o0OoOo0.OooO(o0OoOo0.OooO00o(str7, i11 + 1, " \"'<>#", true, true, iOooO0Oo7));
                i11 = iOooO0Oo7;
            }
            if (i11 < i2 && str5.charAt(i11) == '#') {
                oooO00o.f21646OooO0oo = o0OoOo0.OooO00o(str7, i11 + 1, "", true, false, i2);
            }
            return oooO00o2.OooO00o();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21639OooO00o);
            sb.append("://");
            if (!this.f21640OooO0O0.isEmpty() || !this.f21641OooO0OO.isEmpty()) {
                sb.append(this.f21640OooO0O0);
                if (!this.f21641OooO0OO.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f21641OooO0OO);
                }
                sb.append('@');
            }
            if (this.f21642OooO0Oo.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f21642OooO0Oo);
                sb.append(']');
            } else {
                sb.append(this.f21642OooO0Oo);
            }
            int iOooO0OO = this.f21644OooO0o0;
            if (iOooO0OO == -1) {
                iOooO0OO = o0OoOo0.OooO0OO(this.f21639OooO00o);
            }
            if (iOooO0OO != o0OoOo0.OooO0OO(this.f21639OooO00o)) {
                sb.append(':');
                sb.append(iOooO0OO);
            }
            ArrayList arrayList = this.f21643OooO0o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) arrayList.get(i));
            }
            if (this.f21645OooO0oO != null) {
                sb.append('?');
                o0OoOo0.OooO0o(sb, this.f21645OooO0oO);
            }
            if (this.f21646OooO0oo != null) {
                sb.append('#');
                sb.append(this.f21646OooO0oo);
            }
            return sb.toString();
        }
    }

    public o0OoOo0(OooO00o oooO00o) {
        this.f21631OooO00o = oooO00o.f21639OooO00o;
        String str = oooO00o.f21640OooO0O0;
        this.f21632OooO0O0 = OooO0oO(0, str.length(), str);
        String str2 = oooO00o.f21641OooO0OO;
        this.f21633OooO0OO = OooO0oO(0, str2.length(), str2);
        this.f21634OooO0Oo = oooO00o.f21642OooO0Oo;
        int i = oooO00o.f21644OooO0o0;
        this.f21636OooO0o0 = i == -1 ? OooO0OO(oooO00o.f21639OooO00o) : i;
        this.f21635OooO0o = OooO0oo(oooO00o.f21643OooO0o);
        ArrayList arrayList = oooO00o.f21645OooO0oO;
        this.f21637OooO0oO = arrayList != null ? OooO0oo(arrayList) : null;
        String str3 = oooO00o.f21646OooO0oo;
        if (str3 != null) {
            OooO0oO(0, str3.length(), str3);
        }
        this.f21638OooO0oo = oooO00o.toString();
    }

    public static ArrayList OooO(String str) {
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

    public static String OooO00o(String str, int i, String str2, boolean z, boolean z2, int i2) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && !z) || (z2 && iCodePointAt == 43))) {
                o00000O o00000o = new o00000O();
                o00000o.o000OOo(i, iCharCount, str);
                o00000O o00000o2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (z2 && iCodePointAt2 == 43) {
                            o00000o.o00000O(z ? "%20" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && !z)) {
                            if (o00000o2 == null) {
                                o00000o2 = new o00000O();
                            }
                            o00000o2.o00000o0(iCodePointAt2);
                            while (!o00000o2.oo000o()) {
                                int i3 = o00000o2.readByte() & UByte.MAX_VALUE;
                                o00000o.o00O0O(37);
                                char[] cArr = f21630OooO;
                                o00000o.o00O0O(cArr[(i3 >> 4) & 15]);
                                o00000o.o00O0O(cArr[i3 & 15]);
                            }
                        } else {
                            o00000o.o00000o0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return o00000o.OoooOO0();
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

    public static int OooO0Oo(int i, int i2, String str, String str2) {
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

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public static String OooO0oO(int i, int i2, String str) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            if (str.charAt(iCharCount) == '%') {
                o00000O o00000o = new o00000O();
                o00000o.o000OOo(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i3 = iCharCount + 2) >= i2) {
                        o00000o.o00000o0(iCodePointAt);
                    } else {
                        int iOooO0O0 = OooO0O0(str.charAt(iCharCount + 1));
                        int iOooO0O1 = OooO0O0(str.charAt(i3));
                        if (iOooO0O0 == -1 || iOooO0O1 == -1) {
                            o00000o.o00000o0(iCodePointAt);
                        } else {
                            o00000o.o00O0O((iOooO0O0 << 4) + iOooO0O1);
                            iCharCount = i3;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return o00000o.OoooOO0();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static List OooO0oo(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(str != null ? OooO0oO(0, str.length(), str) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String OooO0o0() {
        if (this.f21637OooO0oO == null) {
            return null;
        }
        String str = this.f21638OooO0oo;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, OooO0Oo(iIndexOf + 1, str.length(), str, "#"));
    }

    public final URI OooOO0() {
        String str = this.f21638OooO0oo;
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + str);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0OoOo0) && ((o0OoOo0) obj).f21638OooO0oo.equals(this.f21638OooO0oo);
    }

    public final int hashCode() {
        return this.f21638OooO0oo.hashCode();
    }

    public final String toString() {
        return this.f21638OooO0oo;
    }
}
