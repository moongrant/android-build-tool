package p254o00ooOO0;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zae;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zak f41005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zact f41006OooO0o0;

    public o0o0Oo(zact zactVar, zak zakVar) {
        this.f41006OooO0o0 = zactVar;
        this.f41005OooO0Oo = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.AbstractClientBuilder<? extends zae, SignInOptions> abstractClientBuilder = zact.f14899OooOO0O;
        zak zakVar = this.f41005OooO0Oo;
        ConnectionResult connectionResultZaa = zakVar.zaa();
        boolean zIsSuccess = connectionResultZaa.isSuccess();
        zact zactVar = this.f41006OooO0o0;
        if (zIsSuccess) {
            zav zavVar = (zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZaa2 = zavVar.zaa();
            if (!connectionResultZaa2.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZaa2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                zactVar.f14906OooOO0.zae(connectionResultZaa2);
                zactVar.f14900OooO.disconnect();
                return;
            }
            zactVar.f14906OooOO0.zaf(zavVar.zab(), zactVar.f14904OooO0oO);
        } else {
            zactVar.f14906OooOO0.zae(connectionResultZaa);
        }
        zactVar.f14900OooO.disconnect();
    }
}
