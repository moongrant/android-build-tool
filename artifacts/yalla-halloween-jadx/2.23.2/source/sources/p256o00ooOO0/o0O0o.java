package p256o00ooOO0;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zak;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40325OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final GoogleApiClient.OnConnectionFailedListener f40326OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final GoogleApiClient f40327OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zak f40328OooO0oO;

    public o0O0o(zak zakVar, int i, @Nullable GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f40328OooO0oO = zakVar;
        this.f40325OooO0Oo = i;
        this.f40327OooO0o0 = googleApiClient;
        this.f40326OooO0o = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f40328OooO0oO.zah(connectionResult, this.f40325OooO0Oo);
    }
}
