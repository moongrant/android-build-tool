package o0OOOO00;

import android.os.Bundle;
import p346o0OOOOoO.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends OooOo00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f43614OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f43615OooO0Oo;

    @Override // p346o0OOOOoO.OooOo00
    public final int OooO0O0() {
        return 1;
    }

    @Override // p346o0OOOOoO.OooOo00
    public final void OooO0OO(Bundle bundle) {
        super.OooO0OO(bundle);
        bundle.putString("_wxapi_sendauth_req_scope", this.f43614OooO0OO);
        bundle.putString("_wxapi_sendauth_req_state", this.f43615OooO0Oo);
    }

    public final boolean OooO0Oo() {
        String str = this.f43614OooO0OO;
        if (str == null || str.length() == 0 || this.f43614OooO0OO.length() > 1024) {
            int i = p343o0OOO0oo.OooOO0.f43608OooO00o;
            return false;
        }
        String str2 = this.f43615OooO0Oo;
        if (str2 == null || str2.length() <= 1024) {
            return true;
        }
        int i2 = p343o0OOO0oo.OooOO0.f43608OooO00o;
        return false;
    }
}
