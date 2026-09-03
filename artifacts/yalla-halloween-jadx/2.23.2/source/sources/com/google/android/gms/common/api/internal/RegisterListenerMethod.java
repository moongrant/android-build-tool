package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ListenerHolder<L> f14314OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Feature[] f14315OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f14316OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f14317OooO0Oo;

    @KeepForSdk
    public RegisterListenerMethod(@NonNull ListenerHolder<L> listenerHolder, @Nullable Feature[] featureArr, boolean z, int i) {
        this.f14314OooO00o = listenerHolder;
        this.f14315OooO0O0 = featureArr;
        this.f14316OooO0OO = z;
        this.f14317OooO0Oo = i;
    }

    @KeepForSdk
    public abstract void OooO00o(@NonNull Api.Client client, @NonNull TaskCompletionSource taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public void clearListener() {
        this.f14314OooO00o.clear();
    }

    @Nullable
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.f14314OooO00o.getListenerKey();
    }

    @Nullable
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.f14315OooO0O0;
    }

    public final int zaa() {
        return this.f14317OooO0Oo;
    }

    public final boolean zab() {
        return this.f14316OooO0OO;
    }
}
