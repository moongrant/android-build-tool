package p256o00ooOO0;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO0 implements GoogleApiClient.ConnectionCallbacks {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zabe f40286OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f40287OooO0o0;

    public o00O0OO0(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f40286OooO0o = zabeVar;
        this.f40285OooO0Oo = atomicReference;
        this.f40287OooO0o0 = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        GoogleApiClient googleApiClient = (GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.f40285OooO0Oo.get());
        int i = zabe.f14364OooOoO0;
        zabe zabeVar = this.f40286OooO0o;
        zabeVar.getClass();
        Common.zaa.zaa(googleApiClient).setResultCallback(new o00O0OO(googleApiClient, this.f40287OooO0o0, zabeVar, true));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
