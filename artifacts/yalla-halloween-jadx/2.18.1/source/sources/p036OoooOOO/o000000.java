package p036OoooOOO;

import OooO0O0.OooO00o;
import Oooo000.Oooo0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p145o00Oo0.o00O00;
import p403o0Oo0O0O.o0OoOo0;
import p439o0OoOOo0.o0000O0O;
import p517o0o0O00O.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 implements o0000OO0 {
    public static boolean OooO(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        o00O00.OooO00o oooO00o = o00O00.f32112OooO0O0;
        return jFloatToIntBits;
    }

    public static final long OooO0O0(float f, boolean z) {
        return ((z ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f)) << 32);
    }

    public static final void OooO0OO(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(Oooo0.OooO00o("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void OooO0Oo(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException(Oooo0.OooO00o("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(OooO00o.OooO00o("fromIndex (", i, ") is less than 0."));
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    public static void OooO0o(List list, List list2) {
        if (list == null || list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            o0000O0O o0000o0o2 = (o0000O0O) it.next();
            int i3 = i2;
            int i4 = 0;
            while (i2 < size) {
                int[] iArr = (int[]) list2.get(i2);
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = i6 - i5;
                if (i6 < o0000o0o2.f40130OooO00o) {
                    i += i7;
                    i3++;
                } else if (i6 < o0000o0o2.f40131OooO0O0) {
                    i4 += i7;
                }
                i2++;
            }
            int i8 = i4 + i;
            o0000o0o2.f40130OooO00o -= i8;
            o0000o0o2.f40131OooO0O0 -= i8;
            i2 = i3;
        }
    }

    public static void OooO0o0(List list, List list2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o0000O0O o0000o0o2 = (o0000O0O) it.next();
                int i = o0000o0o2.f40130OooO00o;
                int i2 = 0;
                Iterator it2 = list2.iterator();
                while (it2.hasNext() && ((Integer) it2.next()).intValue() - i2 <= i) {
                    i2++;
                }
                o0000o0o2.f40130OooO00o += i2;
                o0000o0o2.f40131OooO0O0 += i2;
            }
        }
    }

    public static int OooO0oO(o0OoOo0 o0oooo1, boolean z) {
        int i = z ? o0oooo1.f39021OooO0OO : o0oooo1.f39020OooO0O0;
        int i2 = z ? o0oooo1.f39020OooO0O0 : o0oooo1.f39021OooO0OO;
        byte[][] bArr = o0oooo1.f39019OooO00o;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 5) + 3 + i3;
            }
        }
        return i3;
    }

    public static long OooO0oo(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean OooOO0(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
