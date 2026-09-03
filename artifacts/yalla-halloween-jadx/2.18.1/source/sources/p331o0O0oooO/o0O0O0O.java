package p331o0O0oooO;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f37097OooO00o;

    public o0O0O0O(StatusPendingResult statusPendingResult) {
        this.f37097OooO00o = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f37097OooO00o.setResult(new Status(8));
    }
}
