package p214o00oO00o;

import java.io.IOException;
import p209o00o0oo0.o00O0O00;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f39695OooO00o = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [o00o0oo0.o00O0O00] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    public static boolean OooO00o(o00O0O00 o00o0o01, boolean z, boolean z2) throws IOException {
        ?? r4;
        boolean z3;
        ?? r5;
        boolean z4;
        long jOooOOOO;
        int i;
        ?? r6;
        boolean z5;
        long length = o00o0o01.getLength();
        long j = -1;
        long j2 = 4096;
        if (length != -1 && length <= 4096) {
            j2 = length;
        }
        int i2 = (int) j2;
        o00Oo00 o00oo00 = new o00Oo00(64);
        ?? r8 = 0;
        int i3 = 0;
        boolean z6 = false;
        while (true) {
            if (i3 < i2) {
                o00oo00.OooOooO(8);
                if (o00o0o01.OooO0Oo(o00oo00.f40591OooO00o, r8, 8, true)) {
                    long jOooOo0o = o00oo00.OooOo0o();
                    int iOooO0o = o00oo00.OooO0o();
                    if (jOooOo0o == 1) {
                        o00o0o01.OooO0O0(8, 8, o00oo00.f40591OooO00o);
                        i = 16;
                        o00oo00.Oooo000(16);
                        jOooOOOO = o00oo00.OooOOOO();
                    } else {
                        if (jOooOo0o == 0) {
                            long length2 = o00o0o01.getLength();
                            if (length2 != j) {
                                jOooOo0o = (length2 - o00o0o01.OooO0oo()) + ((long) 8);
                            }
                        }
                        jOooOOOO = jOooOo0o;
                        i = 8;
                    }
                    long j3 = i;
                    if (jOooOOOO < j3) {
                        return r8;
                    }
                    i3 += i;
                    if (iOooO0o == 1836019574) {
                        i2 += (int) jOooOOOO;
                        if (length != -1 && i2 > length) {
                            i2 = (int) length;
                        }
                        r6 = r8;
                    } else if (iOooO0o == 1836019558 || iOooO0o == 1836475768) {
                        r5 = r8;
                        z3 = true;
                        z4 = true;
                    } else if ((((long) i3) + jOooOOOO) - j3 >= i2) {
                        r4 = 0;
                        z3 = true;
                        z4 = r4 == true ? 1 : 0;
                        r5 = r4;
                    } else {
                        int i4 = (int) (jOooOOOO - j3);
                        i3 += i4;
                        if (iOooO0o != 1718909296) {
                            r6 = 0;
                            r6 = 0;
                            if (i4 != 0) {
                                o00o0o01.OooO(i4);
                            }
                        } else {
                            if (i4 < 8) {
                                return false;
                            }
                            o00oo00.OooOooO(i4);
                            o00o0o01.OooO0O0(0, i4, o00oo00.f40591OooO00o);
                            int i5 = i4 / 4;
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (i6 != 1) {
                                    int iOooO0o2 = o00oo00.OooO0o();
                                    if ((iOooO0o2 >>> 8) == 3368816 || (iOooO0o2 == 1751476579 && z2)) {
                                        z5 = true;
                                        break;
                                    }
                                    int[] iArr = f39695OooO00o;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= 29) {
                                            z5 = false;
                                            break;
                                        }
                                        if (iArr[i7] == iOooO0o2) {
                                            z5 = true;
                                            break;
                                        }
                                        i7++;
                                    }
                                    if (z5) {
                                        z6 = true;
                                        break;
                                    }
                                } else {
                                    o00oo00.Oooo00o(4);
                                }
                            }
                            r6 = 0;
                            if (!z6) {
                                return false;
                            }
                        }
                    }
                    r8 = r6;
                    j = -1;
                    z6 = z6;
                }
                return (z6 || z != z4) ? r5 : z3;
            }
            r4 = r8;
            z3 = true;
            z4 = r4 == true ? 1 : 0;
            r5 = r4;
            if (z6) {
            }
        }
    }
}
