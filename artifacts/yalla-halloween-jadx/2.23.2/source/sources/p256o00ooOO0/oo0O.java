package p256o00ooOO0;

import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0O implements BaseGmsClient.SignOutCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zabq f40347OooO00o;

    public oo0O(zabq zabqVar) {
        this.f40347OooO00o = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.f40347OooO00o.f14416OooOOOo.f14269OooOOo0.post(new o00OO0OO(this));
    }
}
