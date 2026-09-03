package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f15434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public zau f15435OooO0O0;
    public final Api<?> zaa;

    public zat(Api<?> api, boolean z) {
        this.zaa = api;
        this.f15434OooO00o = z;
    }

    public final zau OooO00o() {
        Preconditions.checkNotNull(this.f15435OooO0O0, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f15435OooO0O0;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        OooO00o().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        OooO00o().zaa(connectionResult, this.zaa, this.f15434OooO00o);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        OooO00o().onConnectionSuspended(i);
    }

    public final void zaa(zau zauVar) {
        this.f15435OooO0O0 = zauVar;
    }
}
