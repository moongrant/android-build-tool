package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p080o000OoO.o0000OO0;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00O0O {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f34711OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x00b8, please report this as an issue */
    public static boolean OooO00o(o0000OO0 o0000oo1, oo000o oo000oVar, int i, OooO00o oooO00o) {
        boolean z;
        boolean z2;
        long jOooOo0o = o0000oo1.OooOo0o();
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
        if (i4 > 7 ? !(i4 > 10 || oo000oVar.f34736OooO0oO != 2) : i4 == oo000oVar.f34736OooO0oO - 1) {
            if ((i5 == 0 || i5 == oo000oVar.f34729OooO) && !z4) {
                try {
                    long jOooOoo0 = o0000oo1.OooOoo0();
                    if (!z3) {
                        jOooOoo0 *= (long) oo000oVar.f34731OooO0O0;
                    }
                    oooO00o.f34711OooO00o = jOooOoo0;
                    z = true;
                } catch (NumberFormatException unused) {
                    z = false;
                }
                if (z) {
                    int iOooO0O0 = OooO0O0(i2, o0000oo1);
                    if (iOooO0O0 != -1 && iOooO0O0 <= oo000oVar.f34731OooO0O0) {
                        int i6 = oo000oVar.f34735OooO0o0;
                        if (i3 != 0) {
                            if (i3 <= 11) {
                                if (i3 == oo000oVar.f34734OooO0o) {
                                }
                            } else if (i3 != 12) {
                                if (i3 <= 14) {
                                    int iOooOoOO = o0000oo1.OooOoOO();
                                    if (i3 == 14) {
                                        iOooOoOO *= 10;
                                    }
                                    z2 = iOooOoOO == i6;
                                }
                            } else if (o0000oo1.OooOo0O() * 1000 == i6) {
                            }
                        }
                        if (z2) {
                            int iOooOo0O = o0000oo1.OooOo0O();
                            int i7 = o0000oo1.f34950OooO0O0;
                            byte[] bArr = o0000oo1.f34949OooO00o;
                            int i8 = i7 - 1;
                            int i9 = o000OO00.f34965OooO00o;
                            int i10 = 0;
                            for (int i11 = o0000oo1.f34950OooO0O0; i11 < i8; i11++) {
                                i10 = o000OO00.f34976OooOOO0[i10 ^ (bArr[i11] & UByte.MAX_VALUE)];
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

    public static int OooO0O0(int i, o0000OO0 o0000oo1) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return o0000oo1.OooOo0O() + 1;
            case 7:
                return o0000oo1.OooOoOO() + 1;
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
