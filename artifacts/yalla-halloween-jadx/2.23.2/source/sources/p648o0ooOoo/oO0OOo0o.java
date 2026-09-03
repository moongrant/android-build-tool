package p648o0ooOoo;

import com.facebook.internal.security.CertificateUtil;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OOo0o {
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[LOOP:2: B:24:0x004b->B:49:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8 A[LOOP:1: B:60:0x00aa->B:64:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00be A[EDGE_INSN: B:87:0x00be->B:65:0x00be BREAK  A[LOOP:1: B:60:0x00aa->B:64:0x00b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0088 A[SYNTHETIC] */
    public static final InetAddress OooO00o(int i, int i2, String str) {
        int i3;
        boolean z;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int iOooOOo;
        int i8 = 16;
        byte[] bArr = new byte[16];
        int i9 = -1;
        int i10 = 0;
        int i11 = i;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i11 >= i2) {
                i3 = i8;
                break;
            }
            if (i10 == i8) {
                return null;
            }
            int i14 = i11 + 2;
            if (i14 <= i2 && StringsKt__StringsJVMKt.startsWith$default(str, "::", i11, false, 4, null)) {
                if (i12 != i9) {
                    return null;
                }
                i10 += 2;
                if (i14 == i2) {
                    i3 = i8;
                    i12 = i10;
                    break;
                }
                i12 = i10;
                i13 = i14;
                i11 = i13;
                i6 = 0;
                while (i11 < i2) {
                    iOooOOo = oO000o00.OooOOo(str.charAt(i11));
                    if (iOooOOo == -1) {
                        break;
                        break;
                    }
                    i6 = (i6 << 4) + iOooOOo;
                    i11++;
                }
                i7 = i11 - i13;
                if (i7 != 0) {
                }
                return null;
            }
            if (i10 != 0) {
                if (!StringsKt__StringsJVMKt.startsWith$default(str, CertificateUtil.DELIMITER, i11, false, 4, null)) {
                    if (!StringsKt__StringsJVMKt.startsWith$default(str, ".", i11, false, 4, null)) {
                        return null;
                    }
                    int i15 = i10 - 2;
                    int i16 = i15;
                    loop2: while (true) {
                        if (i13 >= i2) {
                            if (i16 == i15 + 4) {
                                z = true;
                                break;
                            }
                        } else if (i16 != i8) {
                            if (i16 == i15) {
                                i4 = i13;
                                i5 = 0;
                                while (true) {
                                    if (i4 < i2) {
                                        cCharAt = str.charAt(i4);
                                        if (Intrinsics.compare((int) cCharAt, 48) < 0 && Intrinsics.compare((int) cCharAt, 57) <= 0) {
                                            if ((i5 != 0 || i13 == i4) && (i5 = ((i5 * 10) + cCharAt) - 48) <= 255) {
                                                i4++;
                                            }
                                        }
                                    }
                                    if (i4 - i13 == 0) {
                                        bArr[i16] = (byte) i5;
                                        i16++;
                                        i13 = i4;
                                        i8 = 16;
                                    }
                                }
                            } else if (str.charAt(i13) == '.') {
                                i13++;
                                i4 = i13;
                                i5 = 0;
                                while (true) {
                                    if (i4 < i2) {
                                        cCharAt = str.charAt(i4);
                                        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
                                        }
                                    }
                                    if (i4 - i13 == 0) {
                                        bArr[i16] = (byte) i5;
                                        i16++;
                                        i13 = i4;
                                        i8 = 16;
                                    }
                                    i4++;
                                }
                            }
                        }
                        z = false;
                        break loop2;
                    }
                    if (!z) {
                        return null;
                    }
                    i10 += 2;
                    i3 = 16;
                    break;
                }
                i11++;
            }
            i13 = i11;
            i11 = i13;
            i6 = 0;
            while (i11 < i2) {
                iOooOOo = oO000o00.OooOOo(str.charAt(i11));
                if (iOooOOo == -1) {
                    break;
                }
                i6 = (i6 << 4) + iOooOOo;
                i11++;
            }
            i7 = i11 - i13;
            if (i7 != 0 || i7 > 4) {
                return null;
            }
            int i17 = i10 + 1;
            bArr[i10] = (byte) ((i6 >>> 8) & 255);
            i10 = i17 + 1;
            bArr[i17] = (byte) (i6 & 255);
            i8 = 16;
            i9 = -1;
        }
        if (i10 != i3) {
            if (i12 == -1) {
                return null;
            }
            int i18 = i10 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i12, (16 - i10) + i12, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    @Nullable
    public static final String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!StringsKt__StringsKt.contains$default(str, CertificateUtil.DELIMITER, false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    char cCharAt = lowerCase.charAt(i3);
                    if (Intrinsics.compare((int) cCharAt, 31) > 0 && Intrinsics.compare((int) cCharAt, 127) < 0 && StringsKt__StringsKt.indexOf$default(" #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) == -1) {
                        i3 = i4;
                    }
                    i = 1;
                    break;
                }
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressOooO00o = (StringsKt__StringsJVMKt.startsWith$default(str, "[", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(str, "]", false, 2, null)) ? OooO00o(1, str.length() - 1, str) : OooO00o(0, str.length(), str);
        if (inetAddressOooO00o == null) {
            return null;
        }
        byte[] address = inetAddressOooO00o.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressOooO00o.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        oo0OOoo oo0oooo = new oo0OOoo();
        while (i < address.length) {
            if (i == i2) {
                oo0oooo.o00o0O(58);
                i += i6;
                if (i == 16) {
                    oo0oooo.o00o0O(58);
                }
            } else {
                if (i > 0) {
                    oo0oooo.o00o0O(58);
                }
                byte b = address[i];
                byte[] bArr = oO000o00.f58124OooO00o;
                oo0oooo.o0ooOoO(((b & UByte.MAX_VALUE) << 8) | (address[i + 1] & UByte.MAX_VALUE));
                i += 2;
            }
        }
        return oo0oooo.OoooOO0();
    }
}
