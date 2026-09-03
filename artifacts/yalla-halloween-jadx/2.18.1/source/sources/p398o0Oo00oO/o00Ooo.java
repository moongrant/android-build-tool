package p398o0Oo00oO;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import org.conscrypt.NativeConstants;
import p390o0OOooOO.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public class o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static o00Ooo[] f38974OooO = {new o00Ooo(false, 3, 5, 8, 8, 1), new o00Ooo(false, 5, 7, 10, 10, 1), new o00Ooo(true, 5, 7, 16, 6, 1), new o00Ooo(false, 8, 10, 12, 12, 1), new o00Ooo(true, 10, 11, 14, 6, 2), new o00Ooo(false, 12, 12, 14, 14, 1), new o00Ooo(true, 16, 14, 24, 10, 1), new o00Ooo(false, 18, 14, 16, 16, 1), new o00Ooo(false, 22, 18, 18, 18, 1), new o00Ooo(true, 22, 18, 16, 10, 2), new o00Ooo(false, 30, 20, 20, 20, 1), new o00Ooo(true, 32, 24, 16, 14, 2), new o00Ooo(false, 36, 24, 22, 22, 1), new o00Ooo(false, 44, 28, 24, 24, 1), new o00Ooo(true, 49, 28, 22, 14, 2), new o00Ooo(false, 62, 36, 14, 14, 4), new o00Ooo(false, 86, 42, 16, 16, 4), new o00Ooo(false, 114, 48, 18, 18, 4), new o00Ooo(false, 144, 56, 20, 20, 4), new o00Ooo(false, 174, 68, 22, 22, 4), new o00Ooo(false, IZegoLiveEventCallback.StreamEvent.RetryPlaySuccess, 84, 24, 24, 4, 102, 42), new o00Ooo(false, 280, 112, 14, 14, 16, 140, 56), new o00Ooo(false, 368, 144, 16, 16, 16, 92, 36), new o00Ooo(false, 456, 192, 18, 18, 16, 114, 48), new o00Ooo(false, 576, 224, 20, 20, 16, 144, 56), new o00Ooo(false, 696, 272, 22, 22, 16, 174, 68), new o00Ooo(false, 816, 336, 24, 24, 16, 136, 56), new o00Ooo(false, 1050, NativeConstants.EVP_PKEY_EC, 18, 18, 36, 175, 68), new o00Ooo(false, 1304, 496, 20, 20, 36, 163, 62), new Oooo000()};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f38975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38976OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38977OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38978OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f38979OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38980OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f38981OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f38982OooO0oo;

    public o00Ooo(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    public static o00Ooo OooO(int i, SymbolShapeHint symbolShapeHint, oo00oO oo00oo, oo00oO oo00oo2) {
        o00Ooo[] o00oooArr = f38974OooO;
        for (int i2 = 0; i2 < 30; i2++) {
            o00Ooo o00ooo2 = o00oooArr[i2];
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && o00ooo2.f38975OooO00o) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || o00ooo2.f38975OooO00o) && ((oo00oo == null || (o00ooo2.OooO0oO() >= 0 && o00ooo2.OooO0o() >= 0)) && ((oo00oo2 == null || (o00ooo2.OooO0oO() <= 0 && o00ooo2.OooO0o() <= 0)) && i <= o00ooo2.f38976OooO0O0)))) {
                return o00ooo2;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    public int OooO00o(int i) {
        return this.f38981OooO0oO;
    }

    public final int OooO0O0() {
        int i = this.f38979OooO0o;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    public int OooO0OO() {
        return this.f38976OooO0O0 / this.f38981OooO0oO;
    }

    public final int OooO0Oo() {
        return OooO0oo() * this.f38980OooO0o0;
    }

    public final int OooO0o() {
        return OooO0Oo() + (OooO0oo() << 1);
    }

    public final int OooO0o0() {
        return OooO0O0() * this.f38978OooO0Oo;
    }

    public final int OooO0oO() {
        return OooO0o0() + (OooO0O0() << 1);
    }

    public final int OooO0oo() {
        int i = this.f38979OooO0o;
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
        sb.append(this.f38975OooO00o ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f38978OooO0Oo);
        sb.append('x');
        sb.append(this.f38980OooO0o0);
        sb.append(", symbol size ");
        sb.append(OooO0oO());
        sb.append('x');
        sb.append(OooO0o());
        sb.append(", symbol data size ");
        sb.append(OooO0o0());
        sb.append('x');
        sb.append(OooO0Oo());
        sb.append(", codewords ");
        sb.append(this.f38976OooO0O0);
        sb.append('+');
        sb.append(this.f38977OooO0OO);
        return sb.toString();
    }

    public o00Ooo(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f38975OooO00o = z;
        this.f38976OooO0O0 = i;
        this.f38977OooO0OO = i2;
        this.f38978OooO0Oo = i3;
        this.f38980OooO0o0 = i4;
        this.f38979OooO0o = i5;
        this.f38981OooO0oO = i6;
        this.f38982OooO0oo = i7;
    }
}
