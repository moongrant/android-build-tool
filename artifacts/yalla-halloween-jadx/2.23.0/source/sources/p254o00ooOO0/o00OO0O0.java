package p254o00ooOO0;

import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0O0 implements BaseGmsClient.SignOutCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabq f40973OooO00o;

    public o00OO0O0(zabq zabqVar) {
        this.f40973OooO00o = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.f40973OooO00o.f14892OooOOOo.f14745OooOOo0.post(new o00OO00O(this));
    }
}
