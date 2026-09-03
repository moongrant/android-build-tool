package p256o00ooOO0;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f40302OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f40303OooO0o0;

    public o00OOO00(o00OOO0 o00ooo1, ConnectionResult connectionResult) {
        this.f40303OooO0o0 = o00ooo1;
        this.f40302OooO0Oo = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        o00OOO0 o00ooo1 = this.f40303OooO0o0;
        zabq zabqVar = (zabq) o00ooo1.f40300OooO0o.f14265OooOOO0.get(o00ooo1.f40297OooO0O0);
        if (zabqVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.f40302OooO0Oo;
        if (!connectionResult.isSuccess()) {
            zabqVar.zar(connectionResult, null);
            return;
        }
        o00ooo1.f40301OooO0o0 = true;
        Api.Client client = o00ooo1.f40296OooO00o;
        if (client.requiresSignIn()) {
            if (!o00ooo1.f40301OooO0o0 || (iAccountAccessor = o00ooo1.f40298OooO0OO) == null) {
                return;
            }
            client.getRemoteService(iAccountAccessor, o00ooo1.f40299OooO0Oo);
            return;
        }
        try {
            client.getRemoteService(null, client.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            client.disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), null);
        }
    }
}
