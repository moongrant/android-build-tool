package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ListenerHolder.ListenerKey<L> f14809OooO00o;

    @KeepForSdk
    public UnregisterListenerMethod(@NonNull ListenerHolder.ListenerKey<L> listenerKey) {
        this.f14809OooO00o = listenerKey;
    }

    @KeepForSdk
    public abstract void OooO00o(@NonNull Api.Client client, @NonNull TaskCompletionSource taskCompletionSource) throws RemoteException;

    @NonNull
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.f14809OooO00o;
    }
}
