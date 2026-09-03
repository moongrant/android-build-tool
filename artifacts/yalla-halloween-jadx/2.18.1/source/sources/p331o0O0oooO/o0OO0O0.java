package p331o0O0oooO;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zak;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0O0 implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f37123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final GoogleApiClient f37124OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final GoogleApiClient.OnConnectionFailedListener f37125OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zak f37126OooO0Oo;

    public o0OO0O0(zak zakVar, int i, @Nullable GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f37126OooO0Oo = zakVar;
        this.f37123OooO00o = i;
        this.f37124OooO0O0 = googleApiClient;
        this.f37125OooO0OO = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f37126OooO0Oo.zah(connectionResult, this.f37123OooO00o);
    }
}
