package p659o0ooo0o;

import com.facebook.internal.security.CertificateUtil;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO {
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[LOOP:2: B:24:0x0049->B:49:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4 A[LOOP:1: B:60:0x00a6->B:64:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ba A[EDGE_INSN: B:87:0x00ba->B:65:0x00ba BREAK  A[LOOP:1: B:60:0x00a6->B:64:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0086 A[SYNTHETIC] */
    public static final InetAddress OooO00o(String str, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        int i6;
        int iOooOOoo;
        int i7 = 16;
        byte[] bArr = new byte[16];
        int i8 = -1;
        int i9 = i;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (i9 < i2) {
            if (i10 == i7) {
                return null;
            }
            int i13 = i9 + 2;
            if (i13 <= i2 && StringsKt__StringsJVMKt.startsWith$default(str, "::", i9, false, 4, null)) {
                if (i11 != i8) {
                    return null;
                }
                i10 += 2;
                i11 = i10;
                if (i13 == i2) {
                    break;
                }
                i12 = i13;
                i9 = i12;
                i5 = 0;
                while (i9 < i2) {
                    iOooOOoo = o00OOO00.OooOOoo(str.charAt(i9));
                    if (iOooOOoo == -1) {
                        break;
                        break;
                    }
                    i5 = (i5 << 4) + iOooOOoo;
                    i9++;
                }
                i6 = i9 - i12;
                if (i6 != 0) {
                }
                return null;
            }
            if (i10 != 0) {
                if (!StringsKt__StringsJVMKt.startsWith$default(str, CertificateUtil.DELIMITER, i9, false, 4, null)) {
                    if (!StringsKt__StringsJVMKt.startsWith$default(str, ".", i9, false, 4, null)) {
                        return null;
                    }
                    int i14 = i10 - 2;
                    int i15 = i14;
                    loop2: while (true) {
                        if (i12 >= i2) {
                            if (i15 == i14 + 4) {
                                z = true;
                                break;
                            }
                        } else if (i15 != i7) {
                            if (i15 == i14) {
                                i3 = i12;
                                i4 = 0;
                                while (true) {
                                    if (i3 < i2) {
                                        cCharAt = str.charAt(i3);
                                        if (Intrinsics.compare((int) cCharAt, 48) < 0 && Intrinsics.compare((int) cCharAt, 57) <= 0) {
                                            if ((i4 != 0 || i12 == i3) && (i4 = ((i4 * 10) + cCharAt) - 48) <= 255) {
                                                i3++;
                                            }
                                        }
                                    }
                                    if (i3 - i12 == 0) {
                                        bArr[i15] = (byte) i4;
                                        i15++;
                                        i12 = i3;
                                        i7 = 16;
                                    }
                                }
                            } else if (str.charAt(i12) == '.') {
                                i12++;
                                i3 = i12;
                                i4 = 0;
                                while (true) {
                                    if (i3 < i2) {
                                        cCharAt = str.charAt(i3);
                                        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
                                        }
                                    }
                                    if (i3 - i12 == 0) {
                                        bArr[i15] = (byte) i4;
                                        i15++;
                                        i12 = i3;
                                        i7 = 16;
                                    }
                                    i3++;
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
                    break;
                }
                i9++;
            }
            i12 = i9;
            i9 = i12;
            i5 = 0;
            while (i9 < i2) {
                iOooOOoo = o00OOO00.OooOOoo(str.charAt(i9));
                if (iOooOOoo == -1) {
                    break;
                }
                i5 = (i5 << 4) + iOooOOoo;
                i9++;
            }
            i6 = i9 - i12;
            if (i6 != 0 || i6 > 4) {
                return null;
            }
            int i16 = i10 + 1;
            bArr[i10] = (byte) ((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            i10 = i16 + 1;
            bArr[i16] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
            i7 = 16;
            i8 = -1;
        }
        if (i10 != 16) {
            if (i11 == -1) {
                return null;
            }
            int i17 = i10 - i11;
            System.arraycopy(bArr, i11, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i11, (16 - i10) + i11, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    @Nullable
    public static final String OooO0O0(@NotNull String toCanonicalHost) {
        int i;
        Intrinsics.checkNotNullParameter(toCanonicalHost, "$this$toCanonicalHost");
        boolean z = true;
        int i2 = 0;
        int i3 = -1;
        if (!StringsKt__StringsKt.contains$default(toCanonicalHost, CertificateUtil.DELIMITER, false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(toCanonicalHost);
                Intrinsics.checkNotNullExpressionValue(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                while (i < length) {
                    char cCharAt = lowerCase.charAt(i);
                    i = (Intrinsics.compare((int) cCharAt, 31) > 0 && Intrinsics.compare((int) cCharAt, 127) < 0 && StringsKt__StringsKt.indexOf$default(" #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) == -1) ? i + 1 : 0;
                    if (z) {
                        return null;
                    }
                    return lowerCase;
                }
                z = false;
                if (z) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressOooO00o = (StringsKt.OooOoOO(toCanonicalHost, "[") && StringsKt__StringsJVMKt.endsWith$default(toCanonicalHost, "]", false, 2, null)) ? OooO00o(toCanonicalHost, 1, toCanonicalHost.length() - 1) : OooO00o(toCanonicalHost, 0, toCanonicalHost.length());
        if (inetAddressOooO00o == null) {
            return null;
        }
        byte[] address = inetAddressOooO00o.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressOooO00o.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + toCanonicalHost + '\'');
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i3 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        o0oOO o0ooo2 = new o0oOO();
        while (i2 < address.length) {
            if (i2 == i3) {
                o0ooo2.Ooooo0o(58);
                i2 += i5;
                if (i2 == 16) {
                    o0ooo2.Ooooo0o(58);
                }
            } else {
                if (i2 > 0) {
                    o0ooo2.Ooooo0o(58);
                }
                byte b = address[i2];
                byte[] bArr = o00OOO00.f51183OooO00o;
                o0ooo2.Ooooooo(((b & UByte.MAX_VALUE) << 8) | (address[i2 + 1] & UByte.MAX_VALUE));
                i2 += 2;
            }
        }
        return o0ooo2.Oooo0o();
    }
}
