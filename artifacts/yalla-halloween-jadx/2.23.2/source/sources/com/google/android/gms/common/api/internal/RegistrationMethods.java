package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class RegistrationMethods<A extends Api.AnyClient, L> {

    @NonNull
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;

    @NonNull
    public final UnregisterListenerMethod<A, L> zaa;

    @NonNull
    public final Runnable zab;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, L> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RemoteCall<A, TaskCompletionSource<Void>> f14318OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public RemoteCall<A, TaskCompletionSource<Boolean>> f14319OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ListenerHolder<L> f14321OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Feature[] f14323OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f14324OooO0oO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Runnable f14320OooO0OO = zacj.zaa;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f14322OooO0o = true;

        public Builder() {
        }

        @NonNull
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            Preconditions.checkArgument(this.f14318OooO00o != null, "Must set register function");
            Preconditions.checkArgument(this.f14319OooO0O0 != null, "Must set unregister function");
            Preconditions.checkArgument(this.f14321OooO0Oo != null, "Must set holder");
            return new RegistrationMethods<>(new OooO0o(this, this.f14321OooO0Oo, this.f14323OooO0o0, this.f14322OooO0o, this.f14324OooO0oO), new OooO(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.f14321OooO0Oo.getListenerKey(), "Key must not be null")), this.f14320OooO0OO);
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@NonNull Runnable runnable) {
            this.f14320OooO0OO = runnable;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> register(@NonNull RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.f14318OooO00o = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.f14322OooO0o = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> setFeatures(@NonNull Feature... featureArr) {
            this.f14323OooO0o0 = featureArr;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.f14324OooO0oO = i;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> unregister(@NonNull RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.f14319OooO0O0 = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> withHolder(@NonNull ListenerHolder<L> listenerHolder) {
            this.f14321OooO0Oo = listenerHolder;
            return this;
        }

        public /* synthetic */ Builder(int i) {
        }
    }

    public /* synthetic */ RegistrationMethods(OooO0o oooO0o, OooO oooO, Runnable runnable) {
        this.register = oooO0o;
        this.zaa = oooO;
        this.zab = runnable;
    }

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>(0);
    }
}
