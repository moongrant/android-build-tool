package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OnConnectionFailedListener f14624OooO00o;

    public OooO0O0(OnConnectionFailedListener onConnectionFailedListener) {
        this.f14624OooO00o = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f14624OooO00o.onConnectionFailed(connectionResult);
    }
}
