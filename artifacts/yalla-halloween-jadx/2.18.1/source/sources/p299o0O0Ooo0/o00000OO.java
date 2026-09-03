package p299o0O0Ooo0;

import java.io.IOException;
import kotlin.UByte;
import p296o0O0OoO0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long[] f35992OooO0Oo = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f35993OooO00o = new byte[8];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35994OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f35995OooO0OO;

    public static long OooO00o(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f35992OooO0Oo[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int OooO0O0(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f35992OooO0Oo;
            if (i2 >= 8) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public final long OooO0OO(o000oOoO o000oooo2, boolean z, boolean z2, int i) throws IOException {
        if (this.f35994OooO0O0 == 0) {
            if (!o000oooo2.OooO0O0(this.f35993OooO00o, 0, 1, z)) {
                return -1L;
            }
            int iOooO0O0 = OooO0O0(this.f35993OooO00o[0] & UByte.MAX_VALUE);
            this.f35995OooO0OO = iOooO0O0;
            if (iOooO0O0 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f35994OooO0O0 = 1;
        }
        int i2 = this.f35995OooO0OO;
        if (i2 > i) {
            this.f35994OooO0O0 = 0;
            return -2L;
        }
        if (i2 != 1) {
            o000oooo2.readFully(this.f35993OooO00o, 1, i2 - 1);
        }
        this.f35994OooO0O0 = 0;
        return OooO00o(this.f35993OooO00o, this.f35995OooO0OO, z2);
    }
}
