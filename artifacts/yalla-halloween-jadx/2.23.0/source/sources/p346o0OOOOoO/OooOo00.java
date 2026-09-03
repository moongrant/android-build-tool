package p346o0OOOOoO;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f43668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f43669OooO0O0;

    public void OooO00o(Bundle bundle) {
        this.f43668OooO00o = bundle.getString("_wxapi_basereq_transaction");
        this.f43669OooO0O0 = bundle.getString("_wxapi_basereq_openid");
    }

    public abstract int OooO0O0();

    public void OooO0OO(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", OooO0O0());
        bundle.putString("_wxapi_basereq_transaction", this.f43668OooO00o);
        bundle.putString("_wxapi_basereq_openid", this.f43669OooO0O0);
    }
}
