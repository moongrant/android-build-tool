package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f14456OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public zau f14457OooO0o0;
    public final Api<?> zaa;

    public zat(Api<?> api, boolean z) {
        this.zaa = api;
        this.f14456OooO0Oo = z;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Preconditions.checkNotNull(this.f14457OooO0o0, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f14457OooO0o0.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkNotNull(this.f14457OooO0o0, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f14457OooO0o0.zaa(connectionResult, this.zaa, this.f14456OooO0Oo);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkNotNull(this.f14457OooO0o0, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f14457OooO0o0.onConnectionSuspended(i);
    }

    public final void zaa(zau zauVar) {
        this.f14457OooO0o0 = zauVar;
    }
}
