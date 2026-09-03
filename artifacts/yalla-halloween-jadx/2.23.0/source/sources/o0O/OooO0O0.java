package o0O;

import p385o0OOooOO.o00O00;
import p579o0oOoo.oOOOoo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f41552OooO00o = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static oOOOoo00 f41553OooO0O0;

    public static void OooO00o(o0OO000.OooO0O0 oooO0O0, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    oooO0O0.OooO0Oo(i5, i4);
                    oooO0O0.OooO0Oo(i5, i6);
                    oooO0O0.OooO0Oo(i4, i5);
                    oooO0O0.OooO0Oo(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        oooO0O0.OooO0Oo(i7, i7);
        int i8 = i7 + 1;
        oooO0O0.OooO0Oo(i8, i7);
        oooO0O0.OooO0Oo(i7, i8);
        int i9 = i + i2;
        oooO0O0.OooO0Oo(i9, i7);
        oooO0O0.OooO0Oo(i9, i8);
        oooO0O0.OooO0Oo(i9, i9 - 1);
    }

    public static o0OO000.OooO00o OooO0O0(o0OO000.OooO00o oooO00o, int i, int i2) {
        o0OO000o.OooO00o oooO00o2;
        int i3 = oooO00o.f42979OooO0o0 / i2;
        if (i2 == 4) {
            oooO00o2 = o0OO000o.OooO00o.f42987OooOO0;
        } else if (i2 == 6) {
            oooO00o2 = o0OO000o.OooO00o.f42984OooO;
        } else if (i2 == 8) {
            oooO00o2 = o0OO000o.OooO00o.f42989OooOO0o;
        } else if (i2 == 10) {
            oooO00o2 = o0OO000o.OooO00o.f42986OooO0oo;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            oooO00o2 = o0OO000o.OooO00o.f42985OooO0oO;
        }
        o0OO000o.OooO0OO oooO0OO = new o0OO000o.OooO0OO(oooO00o2);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = oooO00o.f42979OooO0o0 / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= oooO00o.OooO0o((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        oooO0OO.OooO00o(i4 - i3, iArr);
        o0OO000.OooO00o oooO00o3 = new o0OO000.OooO00o();
        oooO00o3.OooO0Oo(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            oooO00o3.OooO0Oo(iArr[i9], i2);
        }
        return oooO00o3;
    }

    public static o0OO000.OooO00o OooO0OO(int i, o0OO000.OooO00o oooO00o) {
        o0OO000.OooO00o oooO00o2 = new o0OO000.OooO00o();
        int i2 = oooO00o.f42979OooO0o0;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || oooO00o.OooO0o(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                oooO00o2.OooO0Oo(i8, i);
            } else {
                if (i8 == 0) {
                    oooO00o2.OooO0Oo(i5 | 1, i);
                } else {
                    oooO00o2.OooO0Oo(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return oooO00o2;
    }

    public static oOOOoo00 OooO0Oo() {
        if (f41553OooO0O0 == null) {
            synchronized (o00O00.class) {
                if (f41553OooO0O0 == null) {
                    f41553OooO0O0 = new oOOOoo00();
                }
            }
        }
        return f41553OooO0O0;
    }
}
