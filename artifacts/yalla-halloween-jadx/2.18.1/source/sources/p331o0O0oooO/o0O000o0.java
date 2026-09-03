package p331o0O0oooO;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabf;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000o0 extends o0O0O0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f37085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0OoO00O f37086OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(o0OoO00O o0ooo00o2, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f37086OooO0OO = o0ooo00o2;
        this.f37085OooO0O0 = connectionResult;
    }

    @Override // p331o0O0oooO.o0O0O0o0
    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f37086OooO0OO.f37144Oooo0oo.OooO0Oo(this.f37085OooO0O0);
    }
}
