package p254o00ooOO0;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends o00O0OOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f40946OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00O00O f40947OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(o00O00O o00o00o2, zaaw zaawVar, ConnectionResult connectionResult) {
        super(zaawVar);
        this.f40947OooO0OO = o00o00o2;
        this.f40946OooO0O0 = connectionResult;
    }

    @Override // p254o00ooOO0.o00O0OOO
    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f40947OooO0OO.f40948OooO0o.OooO0Oo(this.f40946OooO0O0);
    }
}
