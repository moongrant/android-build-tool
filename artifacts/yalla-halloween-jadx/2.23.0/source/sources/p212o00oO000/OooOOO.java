package p212o00oO000;

import java.io.IOException;
import kotlin.UByte;
import p209o00o0oo0.o00O00o0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long[] f39632OooO0Oo = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f39633OooO00o = new byte[8];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39634OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39635OooO0OO;

    public static long OooO00o(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f39632OooO0Oo[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long OooO0O0(o00O00o0 o00o00o1, boolean z, boolean z2, int i) throws IOException {
        int i2;
        int i3 = this.f39634OooO0O0;
        byte[] bArr = this.f39633OooO00o;
        if (i3 == 0) {
            if (!o00o00o1.OooO0oO(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & UByte.MAX_VALUE;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f39632OooO0Oo[i5] & ((long) i4)) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.f39635OooO0OO = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f39634OooO0O0 = 1;
        }
        int i6 = this.f39635OooO0OO;
        if (i6 > i) {
            this.f39634OooO0O0 = 0;
            return -2L;
        }
        if (i6 != 1) {
            o00o00o1.OooO0oO(bArr, 1, i6 - 1, false);
        }
        this.f39634OooO0O0 = 0;
        return OooO00o(bArr, this.f39635OooO0OO, z2);
    }
}
