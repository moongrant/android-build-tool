package p393o0OOooo0;

import o0Oo00o0.OooO00o;
import o0Oo00o0.OooO0OO;
import p392o0OOooo.o00000O;
import p392o0OOooo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f38938OooO00o = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void OooO00o(o00000OO o00000oo2, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    o00000oo2.OooO0Oo(i5, i4);
                    o00000oo2.OooO0Oo(i5, i6);
                    o00000oo2.OooO0Oo(i4, i5);
                    o00000oo2.OooO0Oo(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        o00000oo2.OooO0Oo(i7, i7);
        int i8 = i7 + 1;
        o00000oo2.OooO0Oo(i8, i7);
        o00000oo2.OooO0Oo(i7, i8);
        int i9 = i + i2;
        o00000oo2.OooO0Oo(i9, i7);
        o00000oo2.OooO0Oo(i9, i8);
        o00000oo2.OooO0Oo(i9, i9 - 1);
    }

    public static o00000O OooO0O0(o00000O o00000o, int i, int i2) {
        OooO00o oooO00o;
        int i3 = o00000o.f38917Oooo0oO / i2;
        if (i2 == 4) {
            oooO00o = OooO00o.f38944OooOO0;
        } else if (i2 == 6) {
            oooO00o = OooO00o.f38941OooO;
        } else if (i2 == 8) {
            oooO00o = OooO00o.f38946OooOO0o;
        } else if (i2 == 10) {
            oooO00o = OooO00o.f38943OooO0oo;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            oooO00o = OooO00o.f38942OooO0oO;
        }
        OooO0OO oooO0OO = new OooO0OO(oooO00o);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = o00000o.f38917Oooo0oO / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= o00000o.OooO0oO((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        oooO0OO.OooO00o(iArr, i4 - i3);
        o00000O o00000o2 = new o00000O();
        o00000o2.OooO0o0(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            o00000o2.OooO0o0(iArr[i9], i2);
        }
        return o00000o2;
    }

    public static o00000O OooO0OO(o00000O o00000o, int i) {
        o00000O o00000o2 = new o00000O();
        int i2 = o00000o.f38917Oooo0oO;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || o00000o.OooO0oO(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                o00000o2.OooO0o0(i8, i);
            } else {
                if (i8 == 0) {
                    o00000o2.OooO0o0(i5 | 1, i);
                } else {
                    o00000o2.OooO0o0(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return o00000o2;
    }
}
