package p254o00ooOO0;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f41017OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO f41018OooO0o0;

    public oo0O(o00OO o00oo2, ConnectionResult connectionResult) {
        this.f41018OooO0o0 = o00oo2;
        this.f41017OooO0Oo = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        o00OO o00oo2 = this.f41018OooO0o0;
        zabq zabqVar = (zabq) o00oo2.f40968OooO0o.f14741OooOOO0.get(o00oo2.f40965OooO0O0);
        if (zabqVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.f41017OooO0Oo;
        if (!connectionResult.isSuccess()) {
            zabqVar.zar(connectionResult, null);
            return;
        }
        o00oo2.f40969OooO0o0 = true;
        Api.Client client = o00oo2.f40964OooO00o;
        if (client.requiresSignIn()) {
            if (!o00oo2.f40969OooO0o0 || (iAccountAccessor = o00oo2.f40966OooO0OO) == null) {
                return;
            }
            client.getRemoteService(iAccountAccessor, o00oo2.f40967OooO0Oo);
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
