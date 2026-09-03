package p331o0O0oooO;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O extends o0O0O0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zaaw f37087OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zak f37088OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(zabf zabfVar, zaaw zaawVar, zak zakVar) {
        super(zabfVar);
        this.f37087OooO0O0 = zaawVar;
        this.f37088OooO0OO = zakVar;
    }

    @Override // p331o0O0oooO.o0O0O0o0
    public final void OooO00o() {
        zaaw zaawVar = this.f37087OooO0O0;
        zak zakVar = this.f37088OooO0OO;
        boolean z = false;
        if (zaawVar.OooO0oO(0)) {
            ConnectionResult connectionResultZaa = zakVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                if (zaawVar.f15329OooOO0o && !connectionResultZaa.hasResolution()) {
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
                String strValueOf = String.valueOf(connectionResultZaa2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                zaawVar.OooO0Oo(connectionResultZaa2);
                return;
            }
            zaawVar.f15330OooOOO = true;
            zaawVar.f15332OooOOOO = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.f15333OooOOOo = zavVar.zac();
            zaawVar.f15335OooOOo0 = zavVar.zad();
            zaawVar.OooO0o();
        }
    }
}
