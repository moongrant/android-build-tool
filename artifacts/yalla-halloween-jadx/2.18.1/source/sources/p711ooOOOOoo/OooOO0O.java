package p711ooOOOOoo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BigInteger f53512OooO00o;

    public OooOO0O(BigInteger bigInteger) {
        this.f53512OooO00o = bigInteger;
    }

    @Override // p711ooOOOOoo.OooO0O0
    public final int OooO0O0() {
        return 1;
    }

    @Override // p711ooOOOOoo.OooO0O0
    public final BigInteger OooO0OO() {
        return this.f53512OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            return this.f53512OooO00o.equals(((OooOO0O) obj).f53512OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53512OooO00o.hashCode();
    }
}
