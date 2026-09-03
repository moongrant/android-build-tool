package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends TaskApiCall {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskApiCall.Builder f14312OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f14312OooO0Oo = builder;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void OooO00o(Api.Client client, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f14312OooO0Oo.f14329OooO00o.accept(client, (TaskCompletionSource<ResultT>) taskCompletionSource);
    }
}
