package p103o000oo00;

import kotlin.UByte;
import o000OOoO.OooOO0O;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f35671OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f35672OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f35674OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo f35669OooO00o = new o000O0Oo(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f35673OooO0o = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f35675OooO0oO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f35676OooO0oo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f35670OooO0O0 = new o000O000();

    public static int OooO0O0(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long OooO0OO(o000O000 o000o001) {
        int i = o000o001.f34963OooO0O0;
        if (o000o001.f34964OooO0OO - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        o000o001.OooO0Oo(0, 9, bArr);
        o000o001.Oooo00O(i);
        byte b = bArr[0];
        if ((b & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final void OooO00o(OooOO0O oooOO0O) {
        byte[] bArr = o00.f34914OooO0o;
        o000O000 o000o001 = this.f35670OooO0O0;
        o000o001.getClass();
        o000o001.OooOooo(bArr.length, bArr);
        this.f35671OooO0OO = true;
        oooOO0O.f34679OooO0o = 0;
    }
}
