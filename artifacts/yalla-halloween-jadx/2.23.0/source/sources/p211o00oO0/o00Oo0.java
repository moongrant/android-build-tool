package p211o00oO0;

import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00Oo0 {
    public static long OooO00o(int i, int i2, o00Oo00 o00oo00) {
        o00oo00.Oooo00O(i);
        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 5) {
            return -9223372036854775807L;
        }
        int iOooO0o = o00oo00.OooO0o();
        if ((8388608 & iOooO0o) != 0 || ((2096896 & iOooO0o) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((iOooO0o & 32) != 0) && o00oo00.OooOo0O() >= 7 && o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 >= 7) {
            if ((o00oo00.OooOo0O() & 16) == 16) {
                byte[] bArr = new byte[6];
                o00oo00.OooO0Oo(0, 6, bArr);
                return ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
