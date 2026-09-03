package p429o0OoO0oO;

import android.os.Bundle;
import com.android.billingclient.api.o0O0O00;
import p426o0OoO0Oo.o0OO00O;
import p428o0OoO0o0.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 extends o0000O00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f39893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f39894OooO0Oo;

    @Override // p428o0OoO0o0.o0000O00
    public final int OooO0O0() {
        return 1;
    }

    @Override // p428o0OoO0o0.o0000O00
    public final void OooO0OO(Bundle bundle) {
        super.OooO0OO(bundle);
        bundle.putString("_wxapi_sendauth_req_scope", this.f39893OooO0OO);
        bundle.putString("_wxapi_sendauth_req_state", this.f39894OooO0Oo);
    }

    public final boolean OooO0Oo() {
        String str = this.f39893OooO0OO;
        if (str == null || str.length() == 0 || this.f39893OooO0OO.length() > 1024) {
            o0O0O00 o0o0o00 = o0OO00O.f39846OooO00o;
            return false;
        }
        String str2 = this.f39894OooO0Oo;
        if (str2 == null || str2.length() <= 1024) {
            return true;
        }
        o0O0O00 o0o0o01 = o0OO00O.f39846OooO00o;
        return false;
    }
}
