package o0OOOO0;

import android.os.Bundle;
import p349o0OOOOoO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends o0OOOO00.OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f42797OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f42798OooO0Oo;

    @Override // o0OOOO00.OooO00o
    public final int OooO0O0() {
        return 1;
    }

    @Override // o0OOOO00.OooO00o
    public final void OooO0OO(Bundle bundle) {
        super.OooO0OO(bundle);
        bundle.putString("_wxapi_sendauth_req_scope", this.f42797OooO0OO);
        bundle.putString("_wxapi_sendauth_req_state", this.f42798OooO0Oo);
    }

    public final boolean OooO0Oo() {
        String str = this.f42797OooO0OO;
        if (str == null || str.length() == 0 || this.f42797OooO0OO.length() > 1024) {
            int i = o00O0O.f42850OooO00o;
            return false;
        }
        String str2 = this.f42798OooO0Oo;
        if (str2 == null || str2.length() <= 1024) {
            return true;
        }
        int i2 = o00O0O.f42850OooO00o;
        return false;
    }
}
