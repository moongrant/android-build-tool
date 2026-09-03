package p300o0O0OooO;

import java.io.IOException;
import p296o0O0OoO0.Oooo000;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f36009OooO00o = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    public static boolean OooO00o(o000oOoO o000oooo2, boolean z) throws IOException {
        boolean z2;
        int i;
        boolean z3;
        Oooo000 oooo000 = (Oooo000) o000oooo2;
        long j = oooo000.f35893OooO0OO;
        long j2 = 4096;
        long j3 = -1;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        int i2 = (int) j2;
        o000 o000Var = new o000(64);
        ?? r8 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            if (i3 < i2) {
                o000Var.OooOo(8);
                if (oooo000.OooO0OO(o000Var.f36661OooO00o, r8, 8, true)) {
                    long jOooOOo = o000Var.OooOOo();
                    int iOooO0Oo = o000Var.OooO0Oo();
                    if (jOooOOo == 1) {
                        oooo000.OooO0OO(o000Var.f36661OooO00o, 8, 8, r8);
                        o000Var.OooOoO(16);
                        jOooOOo = o000Var.OooOO0O();
                        i = 16;
                    } else {
                        if (jOooOOo == 0) {
                            long j4 = oooo000.f35893OooO0OO;
                            if (j4 != j3) {
                                jOooOOo = ((long) 8) + (j4 - oooo000.OooO0Oo());
                            }
                        }
                        i = 8;
                    }
                    long j5 = i;
                    if (jOooOOo < j5) {
                        return false;
                    }
                    i3 += i;
                    if (iOooO0Oo == 1836019574) {
                        i2 += (int) jOooOOo;
                        if (j != -1 && i2 > j) {
                            i2 = (int) j;
                        }
                    } else {
                        if (iOooO0Oo == 1836019558 || iOooO0Oo == 1836475768) {
                            z2 = true;
                            return !z4 && z == z2;
                        }
                        if ((((long) i3) + jOooOOo) - j5 < i2) {
                            int i4 = (int) (jOooOOo - j5);
                            i3 += i4;
                            if (iOooO0Oo == 1718909296) {
                                if (i4 < 8) {
                                    return false;
                                }
                                o000Var.OooOo(i4);
                                oooo000.OooO0OO(o000Var.f36661OooO00o, 0, i4, false);
                                int i5 = i4 / 4;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if (i6 != 1) {
                                        int iOooO0Oo2 = o000Var.OooO0Oo();
                                        if ((iOooO0Oo2 >>> 8) == 3368816) {
                                            z3 = true;
                                            break;
                                        }
                                        int[] iArr = f36009OooO00o;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= 28) {
                                                z3 = false;
                                                break;
                                            }
                                            if (iArr[i7] == iOooO0Oo2) {
                                                z3 = true;
                                                break;
                                            }
                                            i7++;
                                        }
                                        if (z3) {
                                            z4 = true;
                                            break;
                                        }
                                    } else {
                                        o000Var.OooOoo0(4);
                                    }
                                }
                                if (!z4) {
                                    return false;
                                }
                            } else if (i4 != 0) {
                                oooo000.OooOOOO(i4, false);
                            }
                        }
                    }
                    j3 = -1;
                    r8 = 0;
                }
            }
            z2 = false;
            if (z4) {
            }
        }
    }
}
