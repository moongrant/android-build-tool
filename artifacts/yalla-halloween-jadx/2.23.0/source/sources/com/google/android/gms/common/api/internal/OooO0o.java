package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends RegisterListenerMethod {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RegistrationMethods.Builder f14787OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.f14787OooO0o0 = builder;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void OooO00o(Api.Client client, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f14787OooO0o0.f14794OooO00o.accept(client, (TaskCompletionSource<Void>) taskCompletionSource);
    }
}
