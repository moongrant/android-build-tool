package p658o0oooO0;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0O0;
import p659o0oooO00.o0O0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final byte[] f60155OooO00o;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f60155OooO00o = bytes;
    }

    @NotNull
    public static final String OooO00o(@NotNull o00000O o00000o, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(o00000o, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (o00000o.OooOo(j2) == ((byte) 13)) {
                String strOooooO0 = o00000o.OooooO0(j2);
                o00000o.skip(2L);
                return strOooooO0;
            }
        }
        String strOooooO1 = o00000o.OooooO0(j);
        o00000o.skip(1L);
        return strOooooO1;
    }

    public static final int OooO0O0(@NotNull o00000O o00000o, @NotNull o000O0O0 options, boolean z) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        o0O0ooO o0o0ooo;
        Intrinsics.checkNotNullParameter(o00000o, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        o0O0ooO o0o0ooo2 = o00000o.f60176OooO0Oo;
        if (o0o0ooo2 == null) {
            return z ? -2 : -1;
        }
        int i5 = o0o0ooo2.f60250OooO0O0;
        int i6 = o0o0ooo2.f60251OooO0OO;
        int[] iArr = options.f60215OooO0o0;
        byte[] bArr3 = o0o0ooo2.f60249OooO00o;
        o0O0ooO o0o0ooo3 = o0o0ooo2;
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
            if (o0o0ooo3 == null) {
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
                            o0o0ooo3 = o0o0ooo3.f60253OooO0o;
                            Intrinsics.checkNotNull(o0o0ooo3);
                            i3 = o0o0ooo3.f60250OooO0O0;
                            i2 = o0o0ooo3.f60251OooO0OO;
                            bArr = o0o0ooo3.f60249OooO00o;
                            if (o0o0ooo3 == o0o0ooo2) {
                                o0o0ooo3 = null;
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
                    Intrinsics.checkNotNull(o0o0ooo3);
                    o0O0ooO o0o0ooo4 = o0o0ooo3.f60253OooO0o;
                    Intrinsics.checkNotNull(o0o0ooo4);
                    i4 = o0o0ooo4.f60250OooO0O0;
                    int i19 = o0o0ooo4.f60251OooO0OO;
                    bArr2 = o0o0ooo4.f60249OooO00o;
                    if (o0o0ooo4 != o0o0ooo2) {
                        o0o0ooo = o0o0ooo4;
                        i6 = i19;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        i6 = i19;
                        o0o0ooo = null;
                    }
                } else {
                    o0O0ooO o0o0ooo5 = o0o0ooo3;
                    bArr2 = bArr3;
                    i4 = i17;
                    o0o0ooo = o0o0ooo5;
                }
                if (z2) {
                    i = iArr[i18];
                    int i20 = i4;
                    i2 = i6;
                    i3 = i20;
                    byte[] bArr4 = bArr2;
                    o0o0ooo3 = o0o0ooo;
                    bArr = bArr4;
                    break;
                }
                i5 = i4;
                bArr3 = bArr2;
                i11 = i18;
                o0o0ooo3 = o0o0ooo;
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
