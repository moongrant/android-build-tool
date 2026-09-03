package p676o0oooo0O;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0O00;
import p674o0oooo0.o0O00OOO;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final byte[] f52108OooO00o;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        f52108OooO00o = bytes;
    }

    @NotNull
    public static final String OooO00o(@NotNull o0oOO readUtf8Line, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(readUtf8Line, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (readUtf8Line.OooOOoo(j2) == ((byte) 13)) {
                String strOooOOO0 = readUtf8Line.OooOOO0(j2);
                readUtf8Line.skip(2L);
                return strOooOOO0;
            }
        }
        String strOooOOO1 = readUtf8Line.OooOOO0(j);
        readUtf8Line.skip(1L);
        return strOooOOO1;
    }

    public static final int OooO0O0(@NotNull o0oOO selectPrefix, @NotNull o0O00 options, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        o0O00OOO o0o00ooo2;
        Intrinsics.checkNotNullParameter(selectPrefix, "$this$selectPrefix");
        Intrinsics.checkNotNullParameter(options, "options");
        o0O00OOO o0o00ooo3 = selectPrefix.f52098Oooo0o;
        if (o0o00ooo3 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = o0o00ooo3.f52067OooO00o;
        int i5 = o0o00ooo3.f52068OooO0O0;
        int i6 = o0o00ooo3.f52069OooO0OO;
        int[] iArr = options.f52041Oooo0oO;
        o0O00OOO o0o00ooo4 = o0o00ooo3;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (o0o00ooo4 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & UByte.MAX_VALUE;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == iArr[i11]) {
                        i2 = iArr[i11 + i10];
                        if (i == i6) {
                            o0o00ooo4 = o0o00ooo4.f52071OooO0o;
                            Intrinsics.checkNotNull(o0o00ooo4);
                            i = o0o00ooo4.f52068OooO0O0;
                            bArr = o0o00ooo4.f52067OooO00o;
                            i6 = o0o00ooo4.f52069OooO0OO;
                            if (o0o00ooo4 == o0o00ooo3) {
                                o0o00ooo4 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            int i15 = (i10 * (-1)) + i11;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & UByte.MAX_VALUE) != iArr[i11]) {
                    return i8;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    Intrinsics.checkNotNull(o0o00ooo4);
                    o0O00OOO o0o00ooo5 = o0o00ooo4.f52071OooO0o;
                    Intrinsics.checkNotNull(o0o00ooo5);
                    i4 = o0o00ooo5.f52068OooO0O0;
                    byte[] bArr2 = o0o00ooo5.f52067OooO00o;
                    i3 = o0o00ooo5.f52069OooO0OO;
                    if (o0o00ooo5 != o0o00ooo3) {
                        o0o00ooo2 = o0o00ooo5;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        o0o00ooo2 = null;
                    }
                } else {
                    o0O00OOO o0o00ooo6 = o0o00ooo4;
                    i3 = i6;
                    i4 = i16;
                    o0o00ooo2 = o0o00ooo6;
                }
                if (z2) {
                    i2 = iArr[i17];
                    i = i4;
                    i6 = i3;
                    o0o00ooo4 = o0o00ooo2;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                o0o00ooo4 = o0o00ooo2;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }
}
