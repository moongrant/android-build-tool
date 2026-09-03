package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ConnectionCallbacks f14623OooO00o;

    public OooO00o(ConnectionCallbacks connectionCallbacks) {
        this.f14623OooO00o = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.f14623OooO00o.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f14623OooO00o.onConnectionSuspended(i);
    }
}
