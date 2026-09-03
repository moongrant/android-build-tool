package p331o0O0oooO;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00oO0 implements GoogleApiClient.ConnectionCallbacks {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f37095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zabe f37096OooO0OO;

    public o0O00oO0(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f37096OooO0OO = zabeVar;
        this.f37094OooO00o = atomicReference;
        this.f37095OooO0O0 = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zabe zabeVar = this.f37096OooO0OO;
        GoogleApiClient googleApiClient = (GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.f37094OooO00o.get());
        StatusPendingResult statusPendingResult = this.f37095OooO0O0;
        int i = zabe.f15341OooOoO;
        Objects.requireNonNull(zabeVar);
        Common.zaa.zaa(googleApiClient).setResultCallback(new o0oO0O0o(zabeVar, statusPendingResult, true, googleApiClient));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
