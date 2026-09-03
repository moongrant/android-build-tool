package p256o00ooOO0;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O extends o00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f40272OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f40273OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o00O00OO o00o00oo2, zaaw zaawVar, ConnectionResult connectionResult) {
        super(zaawVar);
        this.f40273OooO0OO = o00o00oo2;
        this.f40272OooO0O0 = connectionResult;
    }

    @Override // p256o00ooOO0.o00O
    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f40273OooO0OO.f40274OooO0o.OooO0Oo(this.f40272OooO0O0);
    }
}
