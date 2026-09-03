package p331o0O0oooO;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOo0O0 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Api.Client f37151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ApiKey<?> f37152OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f37155OooO0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public IAccountAccessor f37153OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Set<Scope> f37154OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f37156OooO0o0 = false;

    public o0oOo0O0(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.f37155OooO0o = googleApiManager;
        this.f37151OooO00o = client;
        this.f37152OooO0O0 = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        this.f37155OooO0o.f15244OoooOoO.post(new o0O0o0(this, connectionResult));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // com.google.android.gms.common.api.internal.zacs
    @WorkerThread
    public final void zae(ConnectionResult connectionResult) {
        zabq zabqVar = (zabq) this.f37155OooO0o.f15246o000oOoO.get(this.f37152OooO0O0);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @WorkerThread
    public final void zaf(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zae(new ConnectionResult(4));
            return;
        }
        this.f37153OooO0OO = iAccountAccessor;
        this.f37154OooO0Oo = set;
        if (this.f37156OooO0o0) {
            this.f37151OooO00o.getRemoteService(iAccountAccessor, set);
        }
    }
}
