package p254o00ooOO0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zaaw f41012OooO0Oo;

    public /* synthetic */ oo00o(zaaw zaawVar) {
        this.f41012OooO0Oo = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zaaw zaawVar = this.f41012OooO0Oo;
        ((zae) Preconditions.checkNotNull(zaawVar.f14827OooOO0O)).zad(new o00O00o0(zaawVar));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zaaw zaawVar = this.f41012OooO0Oo;
        Lock lock = zaawVar.f14819OooO0O0;
        Lock lock2 = zaawVar.f14819OooO0O0;
        lock.lock();
        try {
            if (zaawVar.f14828OooOO0o && !connectionResult.hasResolution()) {
                zaawVar.OooO00o();
                zaawVar.OooO0o();
            } else {
                zaawVar.OooO0Oo(connectionResult);
            }
        } finally {
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
