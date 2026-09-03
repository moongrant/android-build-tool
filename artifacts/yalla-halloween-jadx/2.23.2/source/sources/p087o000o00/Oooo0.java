package p087o000o00;

import java.io.IOException;
import kotlin.UByte;
import o000OOoO.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long[] f35022OooO0Oo = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f35023OooO00o = new byte[8];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35024OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f35025OooO0OO;

    public static long OooO00o(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f35022OooO0Oo[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long OooO0O0(OooOO0O oooOO0O, boolean z, boolean z2, int i) throws IOException {
        int i2;
        int i3 = this.f35024OooO0O0;
        byte[] bArr = this.f35023OooO00o;
        if (i3 == 0) {
            if (!oooOO0O.OooO0o(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & UByte.MAX_VALUE;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f35022OooO0Oo[i5] & ((long) i4)) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.f35025OooO0OO = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f35024OooO0O0 = 1;
        }
        int i6 = this.f35025OooO0OO;
        if (i6 > i) {
            this.f35024OooO0O0 = 0;
            return -2L;
        }
        if (i6 != 1) {
            oooOO0O.OooO0o(bArr, 1, i6 - 1, false);
        }
        this.f35024OooO0O0 = 0;
        return OooO00o(bArr, this.f35025OooO0OO, z2);
    }
}
