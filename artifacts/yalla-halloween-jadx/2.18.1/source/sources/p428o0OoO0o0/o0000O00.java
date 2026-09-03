package p428o0OoO0o0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f39890OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f39891OooO0O0;

    public void OooO00o(Bundle bundle) {
        this.f39890OooO00o = bundle.getString("_wxapi_basereq_transaction");
        this.f39891OooO0O0 = bundle.getString("_wxapi_basereq_openid");
    }

    public abstract int OooO0O0();

    public void OooO0OO(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", OooO0O0());
        bundle.putString("_wxapi_basereq_transaction", this.f39890OooO00o);
        bundle.putString("_wxapi_basereq_openid", this.f39891OooO0O0);
    }
}
