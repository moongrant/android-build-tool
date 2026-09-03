package p256o00ooOO0;

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

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Api.Client f40296OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ApiKey<?> f40297OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f40300OooO0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public IAccountAccessor f40298OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Set<Scope> f40299OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f40301OooO0o0 = false;

    public o00OOO0(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.f40300OooO0o = googleApiManager;
        this.f40296OooO00o = client;
        this.f40297OooO0O0 = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        this.f40300OooO0o.f14269OooOOo0.post(new o00OOO00(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @WorkerThread
    public final void zae(ConnectionResult connectionResult) {
        zabq zabqVar = (zabq) this.f40300OooO0o.f14265OooOOO0.get(this.f40297OooO0O0);
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
        this.f40298OooO0OO = iAccountAccessor;
        this.f40299OooO0Oo = set;
        if (this.f40301OooO0o0) {
            this.f40296OooO00o.getRemoteService(iAccountAccessor, set);
        }
    }
}
