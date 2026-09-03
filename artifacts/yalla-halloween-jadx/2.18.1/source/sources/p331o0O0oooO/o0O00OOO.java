package p331o0O0oooO;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00OOO implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zaaw f37092OooO00o;

    public /* synthetic */ o0O00OOO(zaaw zaawVar) {
        this.f37092OooO00o = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        ((zae) Preconditions.checkNotNull(this.f37092OooO00o.f15328OooOO0O)).zad(new o0O00OO(this.f37092OooO00o));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f37092OooO00o.f15320OooO0O0.lock();
        try {
            if (this.f37092OooO00o.f15329OooOO0o && !connectionResult.hasResolution()) {
                this.f37092OooO00o.OooO00o();
                this.f37092OooO00o.OooO0o();
            } else {
                this.f37092OooO00o.OooO0Oo(connectionResult);
            }
        } finally {
            this.f37092OooO00o.f15320OooO0O0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
