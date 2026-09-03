package p211o00oO0;

import kotlin.UByte;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f39604OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f39605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f39607OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0000O f39602OooO00o = new o0O0000O(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f39606OooO0o = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f39608OooO0oO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f39609OooO0oo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f39603OooO0O0 = new o00Oo00();

    public static int OooO0O0(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long OooO0OO(o00Oo00 o00oo00) {
        int i = o00oo00.f40592OooO0O0;
        if (o00oo00.f40593OooO0OO - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        o00oo00.OooO0Oo(0, 9, bArr);
        o00oo00.Oooo00O(i);
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

    public final void OooO00o(o00O00o0 o00o00o1) {
        byte[] bArr = o0O00.f40599OooO0o;
        o00Oo00 o00oo00 = this.f39603OooO0O0;
        o00oo00.getClass();
        o00oo00.OooOooo(bArr.length, bArr);
        this.f39604OooO0OO = true;
        o00o00o1.f39533OooO0o = 0;
    }
}
