package p677o0oooo0o;

import io.agora.rtc.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends oOO0000 {
    public f(boolean z, int i, oO0O00o0 oo0o00o0) {
        super(z, i, oo0o00o0);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oO0OO0O oo0oo0oOooOOOo = this.f52163Oooo0oo.OooO0O0().OooOOOo();
        boolean z = this.f52162Oooo0oO;
        int i = Constants.ERR_ALREADY_IN_RECORDING;
        if (z) {
            oo0oo00.OooOO0(Constants.ERR_ALREADY_IN_RECORDING, this.f52161Oooo0o);
            oo0oo00.OooO0oo(oo0oo0oOooOOOo.OooOO0O());
            oo0oo00.OooO(oo0oo0oOooOOOo);
        } else {
            if (!oo0oo0oOooOOOo.OooOOO0()) {
                i = 128;
            }
            oo0oo00.OooOO0(i, this.f52161Oooo0o);
            oo0oo00.OooO0oO(oo0oo0oOooOOOo);
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        int iOooOO0O = this.f52163Oooo0oo.OooO0O0().OooOOOo().OooOO0O();
        if (this.f52162Oooo0oO) {
            return m.OooO00o(iOooOO0O) + m.OooO0O0(this.f52161Oooo0o) + iOooOO0O;
        }
        return m.OooO0O0(this.f52161Oooo0o) + (iOooOO0O - 1);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        if (this.f52162Oooo0oO) {
            return true;
        }
        return this.f52163Oooo0oo.OooO0O0().OooOOOo().OooOOO0();
    }
}
