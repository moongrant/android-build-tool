package p679oooo00o;

import java.io.EOFException;
import java.io.IOException;
import o000OOoO.OooOO0O;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O000 f60394OooO00o = new oO0O000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O000 f60395OooO0O0 = new o000O000(new byte[65025], 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f60396OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f60397OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f60398OooO0o0;

    public final boolean OooO00o(OooOO0O oooOO0O) throws IOException {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3 = this.f60398OooO0o0;
        o000O000 o000o001 = this.f60395OooO0O0;
        if (z3) {
            this.f60398OooO0o0 = false;
            o000o001.OooOooO(0);
        }
        while (true) {
            if (this.f60398OooO0o0) {
                return true;
            }
            int i4 = this.f60396OooO0OO;
            oO0O000 oo0o000 = this.f60394OooO00o;
            if (i4 < 0) {
                if (!oo0o000.OooO0O0(oooOO0O, -1L) || !oo0o000.OooO00o(oooOO0O, true)) {
                    return false;
                }
                int i5 = oo0o000.f60405OooO0Oo;
                if ((oo0o000.f60402OooO00o & 1) == 1 && o000o001.f34964OooO0OO == 0) {
                    this.f60397OooO0Oo = 0;
                    int i6 = 0;
                    do {
                        int i7 = this.f60397OooO0Oo;
                        int i8 = 0 + i7;
                        if (i8 >= oo0o000.f60404OooO0OO) {
                            break;
                        }
                        this.f60397OooO0Oo = i7 + 1;
                        i3 = oo0o000.f60406OooO0o[i8];
                        i6 += i3;
                    } while (i3 == 255);
                    i5 += i6;
                    i2 = this.f60397OooO0Oo + 0;
                } else {
                    i2 = 0;
                }
                try {
                    oooOO0O.OooOO0(i5);
                    z2 = true;
                } catch (EOFException unused) {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                this.f60396OooO0OO = i2;
            }
            int i9 = this.f60396OooO0OO;
            this.f60397OooO0Oo = 0;
            int i10 = 0;
            do {
                int i11 = this.f60397OooO0Oo;
                int i12 = i9 + i11;
                if (i12 >= oo0o000.f60404OooO0OO) {
                    break;
                }
                this.f60397OooO0Oo = i11 + 1;
                i = oo0o000.f60406OooO0o[i12];
                i10 += i;
            } while (i == 255);
            int i13 = this.f60396OooO0OO + this.f60397OooO0Oo;
            if (i10 > 0) {
                o000o001.OooO00o(o000o001.f34964OooO0OO + i10);
                try {
                    oooOO0O.OooO0o(o000o001.f34962OooO00o, o000o001.f34964OooO0OO, i10, false);
                    z = true;
                } catch (EOFException unused2) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                o000o001.Oooo000(o000o001.f34964OooO0OO + i10);
                this.f60398OooO0o0 = oo0o000.f60406OooO0o[i13 + (-1)] != 255;
            }
            if (i13 == oo0o000.f60404OooO0OO) {
                i13 = -1;
            }
            this.f60396OooO0OO = i13;
        }
    }
}
