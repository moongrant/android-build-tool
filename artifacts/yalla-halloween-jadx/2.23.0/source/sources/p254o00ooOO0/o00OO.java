package p254o00ooOO0;

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
public final class o00OO implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Api.Client f40964OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ApiKey<?> f40965OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f40968OooO0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public IAccountAccessor f40966OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Set<Scope> f40967OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f40969OooO0o0 = false;

    public o00OO(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.f40968OooO0o = googleApiManager;
        this.f40964OooO00o = client;
        this.f40965OooO0O0 = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        this.f40968OooO0o.f14745OooOOo0.post(new oo0O(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @WorkerThread
    public final void zae(ConnectionResult connectionResult) {
        zabq zabqVar = (zabq) this.f40968OooO0o.f14741OooOOO0.get(this.f40965OooO0O0);
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
        this.f40966OooO0OO = iAccountAccessor;
        this.f40967OooO0Oo = set;
        if (this.f40969OooO0o0) {
            this.f40964OooO00o.getRemoteService(iAccountAccessor, set);
        }
    }
}
