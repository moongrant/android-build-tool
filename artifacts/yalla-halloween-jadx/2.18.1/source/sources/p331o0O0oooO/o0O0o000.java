package p331o0O0oooO;

import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 implements BaseGmsClient.SignOutCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabq f37106OooO00o;

    public o0O0o000(zabq zabqVar) {
        this.f37106OooO00o = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.f37106OooO00o.f15394OooOOO0.f15244OoooOoO.post(new oo0OOoo(this));
    }
}
