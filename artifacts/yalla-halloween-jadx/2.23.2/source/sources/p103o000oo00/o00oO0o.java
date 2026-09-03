package p103o000oo00;

import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00oO0o {
    public static long OooO00o(int i, int i2, o000O000 o000o001) {
        o000o001.Oooo00O(i);
        if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 5) {
            return -9223372036854775807L;
        }
        int iOooO0o = o000o001.OooO0o();
        if ((8388608 & iOooO0o) != 0 || ((2096896 & iOooO0o) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((iOooO0o & 32) != 0) && o000o001.OooOo0O() >= 7 && o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 >= 7) {
            if ((o000o001.OooOo0O() & 16) == 16) {
                byte[] bArr = new byte[6];
                o000o001.OooO0Oo(0, 6, bArr);
                return ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
