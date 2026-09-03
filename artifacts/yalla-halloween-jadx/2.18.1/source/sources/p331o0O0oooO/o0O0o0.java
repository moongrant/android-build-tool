package p331o0O0oooO;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f37104Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f37105Oooo0oO;

    public o0O0o0(o0oOo0O0 o0ooo0o1, ConnectionResult connectionResult) {
        this.f37105Oooo0oO = o0ooo0o1;
        this.f37104Oooo0o = connectionResult;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        o0oOo0O0 o0ooo0o1 = this.f37105Oooo0oO;
        zabq zabqVar = (zabq) o0ooo0o1.f37155OooO0o.f15246o000oOoO.get(o0ooo0o1.f37152OooO0O0);
        if (zabqVar == null) {
            return;
        }
        if (!this.f37104Oooo0o.isSuccess()) {
            zabqVar.zar(this.f37104Oooo0o, null);
            return;
        }
        o0oOo0O0 o0ooo0o2 = this.f37105Oooo0oO;
        o0ooo0o2.f37156OooO0o0 = true;
        if (o0ooo0o2.f37151OooO00o.requiresSignIn()) {
            o0oOo0O0 o0ooo0o3 = this.f37105Oooo0oO;
            if (!o0ooo0o3.f37156OooO0o0 || (iAccountAccessor = o0ooo0o3.f37153OooO0OO) == null) {
                return;
            }
            o0ooo0o3.f37151OooO00o.getRemoteService(iAccountAccessor, o0ooo0o3.f37154OooO0Oo);
            return;
        }
        try {
            Api.Client client = this.f37105Oooo0oO.f37151OooO00o;
            client.getRemoteService(null, client.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.f37105Oooo0oO.f37151OooO00o.disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), null);
        }
    }
}
