package com.google.android.gms.common.api;

import Oooo000.o00O0O;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@Deprecated
public abstract class GoogleApiClient {

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("sAllClients")
    public static final Set<GoogleApiClient> f15174OooO00o = Collections.newSetFromMap(new WeakHashMap());
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        Set<GoogleApiClient> set = f15174OooO00o;
        synchronized (set) {
            String strConcat = String.valueOf(str).concat("  ");
            int i = 0;
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(strConcat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = f15174OooO00o;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    public abstract ConnectionResult blockingConnect();

    @NonNull
    public abstract ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr);

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api<?> api);

    @NonNull
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@NonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final Context f15175OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Account f15176OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Set<Scope> f15177OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Set<Scope> f15178OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f15179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f15180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public View f15181OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public String f15182OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Map<Api<?>, zab> f15183OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final Map<Api<?>, Api.ApiOptions> f15184OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public LifecycleActivity f15185OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f15186OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Looper f15187OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public OnConnectionFailedListener f15188OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public GoogleApiAvailability f15189OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15190OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final ArrayList<OnConnectionFailedListener> f15191OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final ArrayList<ConnectionCallbacks> f15192OooOOo0;

        @KeepForSdk
        public Builder(@NonNull Context context) {
            this.f15177OooO0O0 = new HashSet();
            this.f15178OooO0OO = new HashSet();
            this.f15183OooO0oo = new Oooo0();
            this.f15184OooOO0 = new Oooo0();
            this.f15186OooOO0o = -1;
            this.f15189OooOOOO = GoogleApiAvailability.getInstance();
            this.f15190OooOOOo = com.google.android.gms.signin.zad.zac;
            this.f15192OooOOo0 = new ArrayList<>();
            this.f15191OooOOo = new ArrayList<>();
            this.f15175OooO = context;
            this.f15187OooOOO = context.getMainLooper();
            this.f15180OooO0o = context.getPackageName();
            this.f15182OooO0oO = context.getClass().getName();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final <O extends Api.ApiOptions> void OooO00o(Api<O> api, @Nullable O o2, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o2));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.f15183OooO0oo.put((Api<?>) api, new zab(hashSet));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NonNull
        public Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.f15184OooOO0.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f15178OooO0OO.addAll(impliedScopes);
            this.f15177OooO0O0.addAll(impliedScopes);
            return this;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o2, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o2, "Null options are not permitted for this Api");
            this.f15184OooOO0.put((Api<?>) api, o2);
            OooO00o(api, o2, scopeArr);
            return this;
        }

        @NonNull
        public Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.f15192OooOOo0.add(connectionCallbacks);
            return this;
        }

        @NonNull
        public Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.f15191OooOOo.add(onConnectionFailedListener);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.Scope>] */
        @NonNull
        public Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.f15177OooO0O0.add(scope);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [OooOooo.o00oO0o, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions>] */
        /* JADX WARN: Type inference failed for: r4v12, types: [OooOooo.o00oO0o, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions>] */
        @NonNull
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.f15184OooOO0.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettingsZaa = zaa();
            Map<Api<?>, zab> mapZad = clientSettingsZaa.zad();
            Oooo0 oooo0 = new Oooo0();
            Oooo0 oooo1 = new Oooo0();
            ArrayList arrayList = new ArrayList();
            Api api = null;
            boolean z = false;
            for (Api api2 : (Oooo0.OooO0OO) this.f15184OooOO0.keySet()) {
                Object orDefault = this.f15184OooOO0.getOrDefault(api2, null);
                boolean z2 = mapZad.get(api2) != null;
                oooo0.put(api2, Boolean.valueOf(z2));
                zat zatVar = new zat(api2, z2);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client clientBuildClient = abstractClientBuilder.buildClient(this.f15175OooO, this.f15187OooOOO, clientSettingsZaa, orDefault, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                oooo1.put(api2.zab(), clientBuildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z = orDefault != null;
                }
                if (clientBuildClient.providesSignIn()) {
                    if (api != null) {
                        String strZad = api2.zad();
                        String strZad2 = api.zad();
                        throw new IllegalStateException(o00O0O.OooO0O0(new StringBuilder(String.valueOf(strZad).length() + 21 + String.valueOf(strZad2).length()), strZad, " cannot be used with ", strZad2));
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    String strZad3 = api.zad();
                    throw new IllegalStateException(o00O0O.OooO0O0(new StringBuilder(String.valueOf(strZad3).length() + 82), "With using ", strZad3, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
                Preconditions.checkState(this.f15176OooO00o == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                Preconditions.checkState(this.f15177OooO0O0.equals(this.f15178OooO0OO), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            zabe zabeVar = new zabe(this.f15175OooO, new ReentrantLock(), this.f15187OooOOO, clientSettingsZaa, this.f15189OooOOOO, this.f15190OooOOOo, oooo0, this.f15192OooOOo0, this.f15191OooOOo, oooo1, this.f15186OooOO0o, zabe.zad(oooo1.values(), true), arrayList);
            Set<GoogleApiClient> set = GoogleApiClient.f15174OooO00o;
            synchronized (set) {
                set.add(zabeVar);
            }
            if (this.f15186OooOO0o >= 0) {
                zak.zaa(this.f15185OooOO0O).zad(this.f15186OooOO0o, zabeVar, this.f15188OooOOO0);
            }
            return zabeVar;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.f15186OooOO0o = i;
            this.f15188OooOOO0 = onConnectionFailedListener;
            this.f15185OooOO0O = lifecycleActivity;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            this.f15176OooO00o = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        @NonNull
        public Builder setGravityForPopups(int i) {
            this.f15179OooO0Oo = i;
            return this;
        }

        @NonNull
        public Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.f15187OooOOO = handler.getLooper();
            return this;
        }

        @NonNull
        public Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.f15181OooO0o0 = view;
            return this;
        }

        @NonNull
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [OooOooo.o00oO0o, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions>] */
        /* JADX WARN: Type inference failed for: r1v0, types: [OooOooo.o00oO0o, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions>] */
        @NonNull
        @VisibleForTesting
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            ?? r1 = this.f15184OooOO0;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.zag;
            if (r1.containsKey(api)) {
                signInOptions = (SignInOptions) this.f15184OooOO0.getOrDefault(api, null);
            }
            return new ClientSettings(this.f15176OooO00o, this.f15177OooO0O0, this.f15183OooO0oo, this.f15179OooO0Oo, this.f15181OooO0o0, this.f15180OooO0o, this.f15182OooO0oO, signInOptions, false);
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NonNull
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.f15184OooOO0.put(api, null);
            OooO00o(api, null, scopeArr);
            return this;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o2) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o2, "Null options are not permitted for this Api");
            this.f15184OooOO0.put((Api<?>) api, o2);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o2);
            this.f15178OooO0OO.addAll(impliedScopes);
            this.f15177OooO0O0.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.f15192OooOOo0.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.f15191OooOOo.add(onConnectionFailedListener);
        }
    }
}
