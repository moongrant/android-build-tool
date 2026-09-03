package p302o0O0o00;

import java.util.Objects;
import kotlin.UByte;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000O0O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f36092OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f36093OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f36095OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0O0 f36090OooO00o = new o000O0O0(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f36094OooO0o = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f36096OooO0oO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f36097OooO0oo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f36091OooO0O0 = new o000();

    public static long OooO0OO(o000 o000Var) {
        int i = o000Var.f36662OooO0O0;
        if (o000Var.f36663OooO0OO - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        o000Var.OooO0OO(bArr, 0, 9);
        o000Var.OooOoOO(i);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    public final void OooO00o(o000oOoO o000oooo2) {
        o000 o000Var = this.f36091OooO0O0;
        byte[] bArr = o000OOo0.f36744OooO0o;
        Objects.requireNonNull(o000Var);
        o000Var.OooOoO0(bArr, bArr.length);
        this.f36092OooO0OO = true;
        o000oooo2.OooO();
    }

    public final int OooO0O0(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
