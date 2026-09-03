package p256o00ooOO0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0O0 implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f40348OooO0Oo;

    public oo0o0O0(StatusPendingResult statusPendingResult) {
        this.f40348OooO0Oo = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f40348OooO0Oo.setResult(new Status(8));
    }
}
