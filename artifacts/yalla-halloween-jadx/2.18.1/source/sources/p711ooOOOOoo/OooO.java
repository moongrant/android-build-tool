package p711ooOOOOoo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f53507OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f53508OooO0O0;

    public OooO(OooO0O0 oooO0O0, OooO0o oooO0o) {
        this.f53507OooO00o = oooO0O0;
        this.f53508OooO0O0 = oooO0o;
    }

    @Override // p711ooOOOOoo.OooOO0
    public final OooO0o OooO00o() {
        return this.f53508OooO0O0;
    }

    @Override // p711ooOOOOoo.OooO0O0
    public final int OooO0O0() {
        int iOooO0O0 = this.f53507OooO00o.OooO0O0();
        int[] iArr = this.f53508OooO0O0.f53511OooO00o;
        return iOooO0O0 * iArr[iArr.length - 1];
    }

    @Override // p711ooOOOOoo.OooO0O0
    public final BigInteger OooO0OO() {
        return this.f53507OooO00o.OooO0OO();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return this.f53507OooO00o.equals(oooO.f53507OooO00o) && this.f53508OooO0O0.equals(oooO.f53508OooO0O0);
    }

    public final int hashCode() {
        return this.f53507OooO00o.hashCode() ^ Integer.rotateLeft(this.f53508OooO0O0.hashCode(), 16);
    }
}
