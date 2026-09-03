package oO0000o0;

import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOOO0OO0;
import p677o0oooo0o.oOo0o0oO;
import p677o0oooo0o.ooOOO00O;
import p696oO0OO0oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final oOOO0OO0 f52454Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public p696oO0OO0oo.OooOO0O f52455Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooOo00 f52456Oooo0oo;

    public OooOO0(p696oO0OO0oo.OooOO0O oooOO0O, ooOOO00O ooooo00o) {
        this(oooOO0O, ooooo00o.OooOOoo());
    }

    public OooOO0(p696oO0OO0oo.OooOO0O oooOO0O, byte[] bArr) {
        this.f52455Oooo0oO = oooOO0O;
        this.f52454Oooo0o = new oOOO0OO0(oO000Oo.OooO00o.OooO0OO(bArr));
    }

    public OooOO0(OooOo00 oooOo00, boolean z) {
        byte[] bArr;
        this.f52456Oooo0oo = oooOo00.OooOOO();
        if (oooOo00.OooOO0()) {
            bArr = new byte[1];
        } else {
            OooOo00 oooOo00OooOOO = oooOo00.OooOOO();
            byte[] bArrOooO0o0 = oooOo00OooOOO.f52787OooO0O0.OooO0o0();
            byte[] bArrOooO0o1 = oooOo00OooOOO.OooO0oo().OooO0o0();
            byte[] bArr2 = new byte[bArrOooO0o0.length + bArrOooO0o1.length + 1];
            bArr2[0] = 4;
            System.arraycopy(bArrOooO0o0, 0, bArr2, 1, bArrOooO0o0.length);
            System.arraycopy(bArrOooO0o1, 0, bArr2, bArrOooO0o0.length + 1, bArrOooO0o1.length);
            bArr = bArr2;
        }
        this.f52454Oooo0o = new oOOO0OO0(bArr);
    }

    public final synchronized OooOo00 OooO() {
        if (this.f52456Oooo0oo == null) {
            this.f52456Oooo0oo = this.f52455Oooo0oO.OooO0Oo(this.f52454Oooo0o.f52196Oooo0o).OooOOO();
        }
        return this.f52456Oooo0oo;
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return this.f52454Oooo0o;
    }
}
