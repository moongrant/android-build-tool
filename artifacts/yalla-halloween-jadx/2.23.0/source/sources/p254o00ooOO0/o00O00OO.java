package p254o00ooOO0;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO extends o00O0OOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zaaw f40950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zak f40951OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(zaaw zaawVar, zaaw zaawVar2, zak zakVar) {
        super(zaawVar);
        this.f40950OooO0O0 = zaawVar2;
        this.f40951OooO0OO = zakVar;
    }

    @Override // p254o00ooOO0.o00O0OOO
    public final void OooO00o() {
        zaaw zaawVar = this.f40950OooO0O0;
        boolean z = false;
        if (zaawVar.OooO0oO(0)) {
            zak zakVar = this.f40951OooO0OO;
            ConnectionResult connectionResultZaa = zakVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                if (zaawVar.f14828OooOO0o && !connectionResultZaa.hasResolution()) {
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
            zaawVar.f14829OooOOO = true;
            zaawVar.f14831OooOOOO = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.f14832OooOOOo = zavVar.zac();
            zaawVar.f14834OooOOo0 = zavVar.zad();
            zaawVar.OooO0o();
        }
    }
}
