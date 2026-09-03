package p256o00ooOO0;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00o extends o00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zaaw f40344OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zak f40345OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(zaaw zaawVar, zaaw zaawVar2, zak zakVar) {
        super(zaawVar);
        this.f40344OooO0O0 = zaawVar2;
        this.f40345OooO0OO = zakVar;
    }

    @Override // p256o00ooOO0.o00O
    public final void OooO00o() {
        zaaw zaawVar = this.f40344OooO0O0;
        boolean z = false;
        if (zaawVar.OooO0oO(0)) {
            zak zakVar = this.f40345OooO0OO;
            ConnectionResult connectionResultZaa = zakVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                if (zaawVar.f14352OooOO0o && !connectionResultZaa.hasResolution()) {
                    z = true;
                }
                if (!z) {
                    zaawVar.OooO0Oo(connectionResultZaa);
                    return;
                } else {
                    zaawVar.OooO00o();
                    zaawVar.OooO0o();
                    return;
                }
            }
            zav zavVar = (zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResultZaa2)), new Exception());
                zaawVar.OooO0Oo(connectionResultZaa2);
                return;
            }
            zaawVar.f14353OooOOO = true;
            zaawVar.f14355OooOOOO = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.f14356OooOOOo = zavVar.zac();
            zaawVar.f14358OooOOo0 = zavVar.zad();
            zaawVar.OooO0o();
        }
    }
}
