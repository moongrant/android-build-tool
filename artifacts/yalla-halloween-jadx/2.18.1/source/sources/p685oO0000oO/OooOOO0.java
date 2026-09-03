package p685oO0000oO;

import kotlin.jvm.internal.ByteCompanionObject;
import oO000Oo.OooO0OO;
import p684oO0000o.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends OooOO0O {
    public OooOOO0() {
    }

    public OooOOO0(OooOOO0 oooOOO0) {
        super(oooOOO0);
    }

    @Override // oO000Oo.OooO0OO
    public final void OooO(OooO0OO oooO0OO) {
        OooOOO((OooOOO0) oooO0OO);
    }

    @Override // p685oO0000oO.OooOO0O, p684oO0000o.OooO0OO
    public final void OooO00o() {
        this.f52493OooO0OO = 0L;
        this.f52494OooO0Oo = 0L;
        int i = 0;
        this.f52492OooO0O0 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f52491OooO00o;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f52502OooOOO = 0;
        while (true) {
            long[] jArr = this.f52503OooOOO0;
            if (i == jArr.length) {
                this.f52496OooO0o0 = 7640891576956012808L;
                this.f52495OooO0o = -4942790177534073029L;
                this.f52497OooO0oO = 4354685564936845355L;
                this.f52498OooO0oo = -6534734903238641935L;
                this.f52490OooO = 5840696475078001361L;
                this.f52499OooOO0 = -7276294671716946913L;
                this.f52500OooOO0O = 2270897969802886507L;
                this.f52501OooOO0o = 6620516959819538809L;
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // oO000Oo.OooO0OO
    public final OooO0OO OooO0O0() {
        return new OooOOO0(this);
    }

    @Override // p684oO0000o.OooO0OO
    public final void OooO0OO(byte[] bArr, int i) {
        OooOOO0();
        long j = this.f52493OooO0OO << 3;
        long j2 = this.f52494OooO0Oo;
        byte b = ByteCompanionObject.MIN_VALUE;
        while (true) {
            OooO0o0(b);
            if (this.f52492OooO0O0 == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.f52502OooOOO > 14) {
            OooOOOO();
        }
        long[] jArr = this.f52503OooOOO0;
        jArr[14] = j2;
        jArr[15] = j;
        OooOOOO();
        OooOO0.OooO0Oo(this.f52496OooO0o0, bArr, i);
        OooOO0.OooO0Oo(this.f52495OooO0o, bArr, i + 8);
        OooOO0.OooO0Oo(this.f52497OooO0oO, bArr, i + 16);
        OooOO0.OooO0Oo(this.f52498OooO0oo, bArr, i + 24);
        OooOO0.OooO0Oo(this.f52490OooO, bArr, i + 32);
        OooOO0.OooO0Oo(this.f52499OooOO0, bArr, i + 40);
        OooOO0.OooO0Oo(this.f52500OooOO0O, bArr, i + 48);
        OooOO0.OooO0Oo(this.f52501OooOO0o, bArr, i + 56);
        OooO00o();
    }

    @Override // p684oO0000o.OooO0OO
    public final void OooO0oO() {
    }

    @Override // p684oO0000o.OooO0OO
    public final void OooO0oo() {
    }
}
