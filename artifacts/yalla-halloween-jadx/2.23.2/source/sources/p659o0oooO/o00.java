package p659o0oooO;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0OOO0;
import p662o0oooO0O.oO0Oo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final byte[] f59624OooO00o;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f59624OooO00o = bytes;
    }

    @NotNull
    public static final String OooO00o(@NotNull oo0OOoo oo0oooo, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(oo0oooo, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (oo0oooo.OooOo(j2) == ((byte) 13)) {
                String strOooooOO = oo0oooo.OooooOO(j2);
                oo0oooo.skip(2L);
                return strOooooOO;
            }
        }
        String strOooooOO2 = oo0oooo.OooooOO(j);
        oo0oooo.skip(1L);
        return strOooooOO2;
    }

    public static final int OooO0O0(@NotNull oo0OOoo oo0oooo, @NotNull o0OOO0 options, boolean z) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        oO0Oo oo0oo;
        Intrinsics.checkNotNullParameter(oo0oooo, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        oO0Oo oo0oo2 = oo0oooo.f59827OooO0Oo;
        if (oo0oo2 == null) {
            return z ? -2 : -1;
        }
        int i5 = oo0oo2.f59821OooO0O0;
        int i6 = oo0oo2.f59822OooO0OO;
        int[] iArr = options.f59783OooO0o0;
        byte[] bArr3 = oo0oo2.f59820OooO00o;
        oO0Oo oo0oo3 = oo0oo2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (oo0oo3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr3[i5] & UByte.MAX_VALUE;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            oo0oo3 = oo0oo3.f59824OooO0o;
                            Intrinsics.checkNotNull(oo0oo3);
                            i3 = oo0oo3.f59821OooO0O0;
                            i2 = oo0oo3.f59822OooO0OO;
                            bArr = oo0oo3.f59820OooO00o;
                            if (oo0oo3 == oo0oo2) {
                                oo0oo3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i2 = i6;
                            i3 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr3[i5] & UByte.MAX_VALUE) != iArr[i11]) {
                    return i7;
                }
                boolean z2 = i18 == i16;
                if (i17 == i6) {
                    Intrinsics.checkNotNull(oo0oo3);
                    oO0Oo oo0oo4 = oo0oo3.f59824OooO0o;
                    Intrinsics.checkNotNull(oo0oo4);
                    i4 = oo0oo4.f59821OooO0O0;
                    int i19 = oo0oo4.f59822OooO0OO;
                    bArr2 = oo0oo4.f59820OooO00o;
                    if (oo0oo4 != oo0oo2) {
                        oo0oo = oo0oo4;
                        i6 = i19;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        i6 = i19;
                        oo0oo = null;
                    }
                } else {
                    oO0Oo oo0oo5 = oo0oo3;
                    bArr2 = bArr3;
                    i4 = i17;
                    oo0oo = oo0oo5;
                }
                if (z2) {
                    i = iArr[i18];
                    int i20 = i4;
                    i2 = i6;
                    i3 = i20;
                    byte[] bArr4 = bArr2;
                    oo0oo3 = oo0oo;
                    bArr = bArr4;
                    break;
                }
                i5 = i4;
                bArr3 = bArr2;
                i11 = i18;
                oo0oo3 = oo0oo;
            }
            if (i >= 0) {
                return i;
            }
            byte[] bArr5 = bArr;
            i8 = -i;
            i5 = i3;
            i6 = i2;
            bArr3 = bArr5;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
