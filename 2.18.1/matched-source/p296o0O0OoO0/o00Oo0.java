package p296o0O0OoO0;

import kotlin.UByte;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f35911OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x00bb, please report this as an issue */
    public static boolean OooO00o(o000 o000Var, o00oO0o o00oo0o2, int i, OooO00o oooO00o) {
        boolean z;
        boolean z2;
        long jOooOOo = o000Var.OooOOo();
        long j = jOooOOo >>> 16;
        if (j != i) {
            return false;
        }
        boolean z3 = (j & 1) == 1;
        int i2 = (int) ((jOooOOo >> 12) & 15);
        int i3 = (int) ((jOooOOo >> 8) & 15);
        int i4 = (int) (15 & (jOooOOo >> 4));
        int i5 = (int) ((jOooOOo >> 1) & 7);
        boolean z4 = (jOooOOo & 1) == 1;
        if (!(i4 > 7 ? !(i4 > 10 || o00oo0o2.f35919OooO0oO != 2) : i4 == o00oo0o2.f35919OooO0oO - 1)) {
            return false;
        }
        if (!(i5 == 0 || i5 == o00oo0o2.f35912OooO) || z4) {
            return false;
        }
        try {
            long jOooOo0o = o000Var.OooOo0o();
            if (!z3) {
                jOooOo0o *= (long) o00oo0o2.f35914OooO0O0;
            }
            oooO00o.f35911OooO00o = jOooOo0o;
            z = true;
        } catch (NumberFormatException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        int iOooO0O0 = OooO0O0(o000Var, i2);
        if (!(iOooO0O0 != -1 && iOooO0O0 <= o00oo0o2.f35914OooO0O0)) {
            return false;
        }
        int i6 = o00oo0o2.f35918OooO0o0;
        if (i3 != 0) {
            if (i3 <= 11) {
                if (i3 == o00oo0o2.f35917OooO0o) {
                }
            } else if (i3 != 12) {
                if (i3 <= 14) {
                    int iOooOo0O = o000Var.OooOo0O();
                    if (i3 == 14) {
                        iOooOo0O *= 10;
                    }
                    z2 = iOooOo0O == i6;
                }
            } else if (o000Var.OooOOo0() * 1000 == i6) {
            }
        }
        if (!z2) {
            return false;
        }
        int iOooOOo0 = o000Var.OooOOo0();
        int i7 = o000Var.f36662OooO0O0;
        byte[] bArr = o000Var.f36661OooO00o;
        int i8 = i7 - 1;
        int i9 = o000OOo0.f36740OooO00o;
        int i10 = 0;
        for (int i11 = o000Var.f36662OooO0O0; i11 < i8; i11++) {
            i10 = o000OOo0.f36749OooOO0O[i10 ^ (bArr[i11] & UByte.MAX_VALUE)];
        }
        return iOooOOo0 == i10;
    }

    public static int OooO0O0(o000 o000Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return o000Var.OooOOo0() + 1;
            case 7:
                return o000Var.OooOo0O() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
