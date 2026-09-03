package p209o00o0oo0;

import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo0o0O0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f39577OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x00b8, please report this as an issue */
    public static boolean OooO00o(o00Oo00 o00oo00, oo0oOO0 oo0ooo0, int i, OooO00o oooO00o) {
        boolean z;
        boolean z2;
        long jOooOo0o = o00oo00.OooOo0o();
        long j = jOooOo0o >>> 16;
        if (j != i) {
            return false;
        }
        boolean z3 = (j & 1) == 1;
        int i2 = (int) ((jOooOo0o >> 12) & 15);
        int i3 = (int) ((jOooOo0o >> 8) & 15);
        int i4 = (int) (15 & (jOooOo0o >> 4));
        int i5 = (int) ((jOooOo0o >> 1) & 7);
        boolean z4 = (jOooOo0o & 1) == 1;
        if (i4 > 7 ? !(i4 > 10 || oo0ooo0.f39585OooO0oO != 2) : i4 == oo0ooo0.f39585OooO0oO - 1) {
            if ((i5 == 0 || i5 == oo0ooo0.f39578OooO) && !z4) {
                try {
                    long jOooOoo0 = o00oo00.OooOoo0();
                    if (!z3) {
                        jOooOoo0 *= (long) oo0ooo0.f39580OooO0O0;
                    }
                    oooO00o.f39577OooO00o = jOooOoo0;
                    z = true;
                } catch (NumberFormatException unused) {
                    z = false;
                }
                if (z) {
                    int iOooO0O0 = OooO0O0(i2, o00oo00);
                    if (iOooO0O0 != -1 && iOooO0O0 <= oo0ooo0.f39580OooO0O0) {
                        int i6 = oo0ooo0.f39584OooO0o0;
                        if (i3 != 0) {
                            if (i3 <= 11) {
                                if (i3 == oo0ooo0.f39583OooO0o) {
                                }
                            } else if (i3 != 12) {
                                if (i3 <= 14) {
                                    int iOooOoOO = o00oo00.OooOoOO();
                                    if (i3 == 14) {
                                        iOooOoOO *= 10;
                                    }
                                    z2 = iOooOoOO == i6;
                                }
                            } else if (o00oo00.OooOo0O() * 1000 == i6) {
                            }
                        }
                        if (z2) {
                            int iOooOo0O = o00oo00.OooOo0O();
                            int i7 = o00oo00.f40592OooO0O0;
                            byte[] bArr = o00oo00.f40591OooO00o;
                            int i8 = i7 - 1;
                            int i9 = o0O00.f40595OooO00o;
                            int i10 = 0;
                            for (int i11 = o00oo00.f40592OooO0O0; i11 < i8; i11++) {
                                i10 = o0O00.f40608OooOOOO[i10 ^ (bArr[i11] & UByte.MAX_VALUE)];
                            }
                            if (iOooOo0O == i10) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int OooO0O0(int i, o00Oo00 o00oo00) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return o00oo00.OooOo0O() + 1;
            case 7:
                return o00oo00.OooOoOO() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES << (i - 8);
            default:
                return -1;
        }
    }
}
