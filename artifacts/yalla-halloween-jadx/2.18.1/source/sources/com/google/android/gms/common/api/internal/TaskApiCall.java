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

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Feature[] f15303OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f15304OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f15305OooO0OO;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RemoteCall<A, TaskCompletionSource<ResultT>> f15306OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Feature[] f15308OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f15307OooO0O0 = true;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f15309OooO0Oo = 0;

        public Builder() {
        }

        public /* synthetic */ Builder(zacw zacwVar) {
        }

        @NonNull
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.f15306OooO00o != null, "execute parameter required");
            return new OooOO0(this, this.f15308OooO0OO, this.f15307OooO0O0, this.f15309OooO0Oo);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@NonNull final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.f15306OooO00o = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacu
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
            this.f15306OooO00o = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.f15307OooO0O0 = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@NonNull Feature... featureArr) {
            this.f15308OooO0OO = featureArr;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.f15309OooO0Oo = i;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.f15303OooO00o = null;
        this.f15304OooO0O0 = false;
        this.f15305OooO0OO = 0;
    }

    @KeepForSdk
    public TaskApiCall(@Nullable Feature[] featureArr, boolean z, int i) {
        this.f15303OooO00o = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f15304OooO0O0 = z2;
        this.f15305OooO0OO = i;
    }

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>(null);
    }

    @KeepForSdk
    public abstract void OooO00o(@NonNull A a, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.f15304OooO0O0;
    }

    public final int zaa() {
        return this.f15305OooO0OO;
    }

    @Nullable
    public final Feature[] zab() {
        return this.f15303OooO00o;
    }
}
