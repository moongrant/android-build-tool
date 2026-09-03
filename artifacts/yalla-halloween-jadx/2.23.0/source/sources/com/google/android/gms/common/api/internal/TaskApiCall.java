package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Feature[] f14802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f14803OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14804OooO0OO;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RemoteCall<A, TaskCompletionSource<ResultT>> f14805OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Feature[] f14807OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f14806OooO0O0 = true;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14808OooO0Oo = 0;

        public Builder() {
        }

        @NonNull
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.f14805OooO00o != null, "execute parameter required");
            return new OooOO0(this, this.f14807OooO0OO, this.f14806OooO0O0, this.f14808OooO0Oo);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@NonNull final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.f14805OooO00o = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacu
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    biConsumer.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> run(@NonNull RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.f14805OooO00o = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.f14806OooO0O0 = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@NonNull Feature... featureArr) {
            this.f14807OooO0OO = featureArr;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.f14808OooO0Oo = i;
            return this;
        }

        public /* synthetic */ Builder(int i) {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.f14802OooO00o = null;
        this.f14803OooO0O0 = false;
        this.f14804OooO0OO = 0;
    }

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>(0);
    }

    @KeepForSdk
    public abstract void OooO00o(@NonNull Api.Client client, @NonNull TaskCompletionSource taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.f14803OooO0O0;
    }

    public final int zaa() {
        return this.f14804OooO0OO;
    }

    @Nullable
    public final Feature[] zab() {
        return this.f14802OooO00o;
    }

    @KeepForSdk
    public TaskApiCall(@Nullable Feature[] featureArr, boolean z, int i) {
        this.f14802OooO00o = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f14803OooO0O0 = z2;
        this.f14804OooO0OO = i;
    }
}
