package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends UnregisterListenerMethod {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RegistrationMethods.Builder f14770OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.f14770OooO0O0 = builder;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void OooO00o(Api.Client client, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f14770OooO0O0.f14795OooO0O0.accept(client, (TaskCompletionSource<Boolean>) taskCompletionSource);
    }
}
