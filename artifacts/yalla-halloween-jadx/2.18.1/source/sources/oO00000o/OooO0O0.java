package oO00000o;

import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oO0oO000;
import p677o0oooo0o.oOo0o0oO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends oOo0o0oO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO0oO000 f52373Oooo0o;

    public OooO0O0(oO0oO000 oo0oo000) {
        this.f52373Oooo0o = oo0oo000;
    }

    public final OooO00o OooO() {
        if (this.f52373Oooo0o.size() == 0) {
            return null;
        }
        return OooO00o.OooO(this.f52373Oooo0o.OooOo00(0));
    }

    @Override // p677o0oooo0o.oOo0o0oO, p677o0oooo0o.oO0O00o0
    public final oO0OO0O OooO0O0() {
        return this.f52373Oooo0o;
    }

    public final OooO00o[] OooOO0() {
        int size = this.f52373Oooo0o.size();
        OooO00o[] oooO00oArr = new OooO00o[size];
        for (int i = 0; i != size; i++) {
            oooO00oArr[i] = OooO00o.OooO(this.f52373Oooo0o.OooOo00(i));
        }
        return oooO00oArr;
    }

    public final boolean OooOO0O() {
        return this.f52373Oooo0o.size() > 1;
    }
}
