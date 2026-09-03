package oo0ooO;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import p326o0O0oooO.o00OOO00;

/* JADX INFO: loaded from: classes2.dex */
public class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooOOO[] f60952OooO = {new OooOOO(3, 5, 8, 8, 1, false), new OooOOO(5, 7, 10, 10, 1, false), new OooOOO(5, 7, 16, 6, 1, true), new OooOOO(8, 10, 12, 12, 1, false), new OooOOO(10, 11, 14, 6, 2, true), new OooOOO(12, 12, 14, 14, 1, false), new OooOOO(16, 14, 24, 10, 1, true), new OooOOO(18, 14, 16, 16, 1, false), new OooOOO(22, 18, 18, 18, 1, false), new OooOOO(22, 18, 16, 10, 2, true), new OooOOO(30, 20, 20, 20, 1, false), new OooOOO(32, 24, 16, 14, 2, true), new OooOOO(36, 24, 22, 22, 1, false), new OooOOO(44, 28, 24, 24, 1, false), new OooOOO(49, 28, 22, 14, 2, true), new OooOOO(62, 36, 14, 14, 4, false), new OooOOO(86, 42, 16, 16, 4, false), new OooOOO(114, 48, 18, 18, 4, false), new OooOOO(144, 56, 20, 20, 4, false), new OooOOO(174, 68, 22, 22, 4, false), new OooOOO(false, 204, 84, 24, 24, 4, 102, 42), new OooOOO(false, 280, 112, 14, 14, 16, 140, 56), new OooOOO(false, 368, 144, 16, 16, 16, 92, 36), new OooOOO(false, 456, 192, 18, 18, 16, 114, 48), new OooOOO(false, 576, 224, 20, 20, 16, 144, 56), new OooOOO(false, 696, 272, 22, 22, 16, 174, 68), new OooOOO(false, 816, 336, 24, 24, 16, 136, 56), new OooOOO(false, 1050, 408, 18, 18, 36, 175, 68), new OooOOO(false, 1304, 496, 20, 20, 36, 163, 62), new OooO0OO()};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f60953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f60954OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f60955OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f60956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f60957OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f60958OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f60959OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f60960OooO0oo;

    public OooOOO(int i, int i2, int i3, int i4, int i5, boolean z) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    public static OooOOO OooO0o(int i, SymbolShapeHint symbolShapeHint, o00OOO00 o00ooo01, o00OOO00 o00ooo02) {
        OooOOO[] oooOOOArr = f60952OooO;
        for (int i2 = 0; i2 < 30; i2++) {
            OooOOO oooOOO = oooOOOArr[i2];
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && oooOOO.f60953OooO00o) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || oooOOO.f60953OooO00o) && ((o00ooo01 == null || (oooOOO.OooO0Oo() >= 0 && (oooOOO.OooO0o0() * oooOOO.f60958OooO0o0) + (oooOOO.OooO0o0() << 1) >= 0)) && ((o00ooo02 == null || (oooOOO.OooO0Oo() <= 0 && (oooOOO.OooO0o0() * oooOOO.f60958OooO0o0) + (oooOOO.OooO0o0() << 1) <= 0)) && i <= oooOOO.f60954OooO0O0)))) {
                return oooOOO;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    public int OooO00o(int i) {
        return this.f60959OooO0oO;
    }

    public final int OooO0O0() {
        int i = 1;
        int i2 = this.f60957OooO0o;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i;
    }

    public int OooO0OO() {
        return this.f60954OooO0O0 / this.f60959OooO0oO;
    }

    public final int OooO0Oo() {
        return (OooO0O0() * this.f60956OooO0Oo) + (OooO0O0() << 1);
    }

    public final int OooO0o0() {
        int i = this.f60957OooO0o;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f60953OooO00o ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i = this.f60956OooO0Oo;
        sb.append(i);
        sb.append('x');
        int i2 = this.f60958OooO0o0;
        sb.append(i2);
        sb.append(", symbol size ");
        sb.append(OooO0Oo());
        sb.append('x');
        sb.append((OooO0o0() * i2) + (OooO0o0() << 1));
        sb.append(", symbol data size ");
        sb.append(OooO0O0() * i);
        sb.append('x');
        sb.append(OooO0o0() * i2);
        sb.append(", codewords ");
        sb.append(this.f60954OooO0O0);
        sb.append('+');
        sb.append(this.f60955OooO0OO);
        return sb.toString();
    }

    public OooOOO(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f60953OooO00o = z;
        this.f60954OooO0O0 = i;
        this.f60955OooO0OO = i2;
        this.f60956OooO0Oo = i3;
        this.f60958OooO0o0 = i4;
        this.f60957OooO0o = i5;
        this.f60959OooO0oO = i6;
        this.f60960OooO0oo = i7;
    }
}
