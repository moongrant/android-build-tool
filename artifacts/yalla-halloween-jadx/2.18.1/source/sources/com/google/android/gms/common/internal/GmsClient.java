package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Set<Scope> f15581OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final Account f15582Oooo000;

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i, @NonNull ClientSettings clientSettings, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        ConnectionCallbacks connectionCallbacks2 = (ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks);
        OnConnectionFailedListener onConnectionFailedListener2 = (OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener);
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, connectionCallbacks2 == null ? null : new OooO00o(connectionCallbacks2), onConnectionFailedListener2 == null ? null : new OooO0O0(onConnectionFailedListener2), clientSettings.zac());
        this.f15582Oooo000 = clientSettings.getAccount();
        Set<Scope> allRequestedScopes = clientSettings.getAllRequestedScopes();
        Iterator<Scope> it = allRequestedScopes.iterator();
        while (it.hasNext()) {
            if (!allRequestedScopes.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f15581OooOooo = allRequestedScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public final void OooO00o() {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    @KeepForSdk
    public final Set<Scope> OooO0OO() {
        return this.f15581OooOooo;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public final Account getAccount() {
        return this.f15582Oooo000;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.f15581OooOooo : Collections.emptySet();
    }
}
