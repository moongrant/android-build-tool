package p331o0O0oooO;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0O0o implements ResultCallback<Status> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f37146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f37147OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ GoogleApiClient f37148OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zabe f37149OooO0Oo;

    public o0oO0O0o(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f37149OooO0Oo = zabeVar;
        this.f37146OooO00o = statusPendingResult;
        this.f37147OooO0O0 = z;
        this.f37148OooO0OO = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(@NonNull Result result) {
        Status status = (Status) result;
        Storage.getInstance(this.f37149OooO0Oo.f15346OooO0o).zac();
        if (status.isSuccess() && this.f37149OooO0Oo.isConnected()) {
            zabe zabeVar = this.f37149OooO0Oo;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.f37146OooO00o.setResult(status);
        if (this.f37147OooO0O0) {
            this.f37148OooO0OO.disconnect();
        }
    }
}
