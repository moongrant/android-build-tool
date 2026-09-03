package p225o00oOo;

import java.io.EOFException;
import java.io.IOException;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f39777OooO00o = new o00Oo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo00 f39778OooO0O0 = new o00Oo00(new byte[65025], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39779OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39780OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f39781OooO0o0;

    public final boolean OooO00o(o00O00o0 o00o00o1) throws IOException {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3 = this.f39781OooO0o0;
        o00Oo00 o00oo00 = this.f39778OooO0O0;
        if (z3) {
            this.f39781OooO0o0 = false;
            o00oo00.OooOooO(0);
        }
        while (true) {
            if (this.f39781OooO0o0) {
                return true;
            }
            int i4 = this.f39779OooO0OO;
            o00Oo0 o00oo1 = this.f39777OooO00o;
            if (i4 < 0) {
                if (!o00oo1.OooO0O0(o00o00o1, -1L) || !o00oo1.OooO00o(o00o00o1, true)) {
                    return false;
                }
                int i5 = o00oo1.f39785OooO0Oo;
                if ((o00oo1.f39782OooO00o & 1) == 1 && o00oo00.f40593OooO0OO == 0) {
                    this.f39780OooO0Oo = 0;
                    int i6 = 0;
                    do {
                        int i7 = this.f39780OooO0Oo;
                        int i8 = 0 + i7;
                        if (i8 >= o00oo1.f39784OooO0OO) {
                            break;
                        }
                        this.f39780OooO0Oo = i7 + 1;
                        i3 = o00oo1.f39786OooO0o[i8];
                        i6 += i3;
                    } while (i3 == 255);
                    i5 += i6;
                    i2 = this.f39780OooO0Oo + 0;
                } else {
                    i2 = 0;
                }
                try {
                    o00o00o1.OooOO0(i5);
                    z2 = true;
                } catch (EOFException unused) {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                this.f39779OooO0OO = i2;
            }
            int i9 = this.f39779OooO0OO;
            this.f39780OooO0Oo = 0;
            int i10 = 0;
            do {
                int i11 = this.f39780OooO0Oo;
                int i12 = i9 + i11;
                if (i12 >= o00oo1.f39784OooO0OO) {
                    break;
                }
                this.f39780OooO0Oo = i11 + 1;
                i = o00oo1.f39786OooO0o[i12];
                i10 += i;
            } while (i == 255);
            int i13 = this.f39779OooO0OO + this.f39780OooO0Oo;
            if (i10 > 0) {
                o00oo00.OooO00o(o00oo00.f40593OooO0OO + i10);
                try {
                    o00o00o1.OooO0oO(o00oo00.f40591OooO00o, o00oo00.f40593OooO0OO, i10, false);
                    z = true;
                } catch (EOFException unused2) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                o00oo00.Oooo000(o00oo00.f40593OooO0OO + i10);
                this.f39781OooO0o0 = o00oo1.f39786OooO0o[i13 + (-1)] != 255;
            }
            if (i13 == o00oo1.f39784OooO0OO) {
                i13 = -1;
            }
            this.f39779OooO0OO = i13;
        }
    }
}
