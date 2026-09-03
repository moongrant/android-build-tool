package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
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
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Deprecated
public abstract class GoogleApiClient {

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("sAllClients")
    public static final Set<GoogleApiClient> f14673OooO00o = Collections.newSetFromMap(new WeakHashMap());
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
        Set<GoogleApiClient> set = f14673OooO00o;
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
        Set<GoogleApiClient> set = f14673OooO00o;
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
        public final Context f14674OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Account f14675OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashSet f14676OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f14677OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14678OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f14679OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public View f14680OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f14681OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final OooOO0 f14682OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final OooOO0 f14683OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public LifecycleActivity f14684OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f14685OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Looper f14686OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public OnConnectionFailedListener f14687OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final GoogleApiAvailability f14688OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14689OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final ArrayList<OnConnectionFailedListener> f14690OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final ArrayList<ConnectionCallbacks> f14691OooOOo0;

        @KeepForSdk
        public Builder(@NonNull Context context) {
            this.f14676OooO0O0 = new HashSet();
            this.f14677OooO0OO = new HashSet();
            this.f14682OooO0oo = new OooOO0();
            this.f14683OooOO0 = new OooOO0();
            this.f14685OooOO0o = -1;
            this.f14688OooOOOO = GoogleApiAvailability.getInstance();
            this.f14689OooOOOo = com.google.android.gms.signin.zad.zac;
            this.f14691OooOOo0 = new ArrayList<>();
            this.f14690OooOOo = new ArrayList<>();
            this.f14674OooO = context;
            this.f14686OooOOO = context.getMainLooper();
            this.f14679OooO0o = context.getPackageName();
            this.f14681OooO0oO = context.getClass().getName();
        }

        public final <O extends Api.ApiOptions> void OooO00o(Api<O> api, @Nullable O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.f14682OooO0oo.put(api, new zab(hashSet));
        }

        @NonNull
        public Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.f14683OooOO0.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f14677OooO0OO.addAll(impliedScopes);
            this.f14676OooO0O0.addAll(impliedScopes);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.f14683OooOO0.put(api, o);
            OooO00o(api, o, scopeArr);
            return this;
        }

        @NonNull
        public Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.f14691OooOOo0.add(connectionCallbacks);
            return this;
        }

        @NonNull
        public Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.f14690OooOOo.add(onConnectionFailedListener);
            return this;
        }

        @NonNull
        public Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.f14676OooO0O0.add(scope);
            return this;
        }

        @NonNull
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.f14683OooOO0.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettingsZaa = zaa();
            Map<Api<?>, zab> mapZad = clientSettingsZaa.zad();
            OooOO0 oooOO1 = new OooOO0();
            OooOO0 oooOO2 = new OooOO0();
            ArrayList arrayList = new ArrayList();
            Api api = null;
            boolean z = false;
            for (Api api2 : (OooOO0.OooO0OO) this.f14683OooOO0.keySet()) {
                V orDefault = this.f14683OooOO0.getOrDefault(api2, null);
                boolean z2 = mapZad.get(api2) != null;
                oooOO1.put(api2, Boolean.valueOf(z2));
                zat zatVar = new zat(api2, z2);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client clientBuildClient = abstractClientBuilder.buildClient(this.f14674OooO, this.f14686OooOOO, clientSettingsZaa, orDefault, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                oooOO2.put(api2.zab(), clientBuildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z = orDefault != 0;
                }
                if (clientBuildClient.providesSignIn()) {
                    if (api != null) {
                        String strZad = api2.zad();
                        String strZad2 = api.zad();
                        throw new IllegalStateException(OooO0OO.OooO0OO(new StringBuilder(String.valueOf(strZad).length() + 21 + String.valueOf(strZad2).length()), strZad, " cannot be used with ", strZad2));
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    String strZad3 = api.zad();
                    throw new IllegalStateException(OooO0OO.OooO0OO(new StringBuilder(String.valueOf(strZad3).length() + 82), "With using ", strZad3, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
                Preconditions.checkState(this.f14675OooO00o == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                Preconditions.checkState(this.f14676OooO0O0.equals(this.f14677OooO0OO), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            zabe zabeVar = new zabe(this.f14674OooO, new ReentrantLock(), this.f14686OooOOO, clientSettingsZaa, this.f14688OooOOOO, this.f14689OooOOOo, oooOO1, this.f14691OooOOo0, this.f14690OooOOo, oooOO2, this.f14685OooOO0o, zabe.zad(oooOO2.values(), true), arrayList);
            Set<GoogleApiClient> set = GoogleApiClient.f14673OooO00o;
            synchronized (set) {
                set.add(zabeVar);
            }
            if (this.f14685OooOO0o >= 0) {
                zak.zaa(this.f14684OooOO0O).zad(this.f14685OooOO0o, zabeVar, this.f14687OooOOO0);
            }
            return zabeVar;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.f14685OooOO0o = i;
            this.f14687OooOOO0 = onConnectionFailedListener;
            this.f14684OooOO0O = lifecycleActivity;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            this.f14675OooO00o = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        @NonNull
        public Builder setGravityForPopups(int i) {
            this.f14678OooO0Oo = i;
            return this;
        }

        @NonNull
        public Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.f14686OooOOO = handler.getLooper();
            return this;
        }

        @NonNull
        public Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.f14680OooO0o0 = view;
            return this;
        }

        @NonNull
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        @VisibleForTesting
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            OooOO0 oooOO1 = this.f14683OooOO0;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.zag;
            if (oooOO1.containsKey(api)) {
                signInOptions = (SignInOptions) oooOO1.getOrDefault(api, null);
            }
            return new ClientSettings(this.f14675OooO00o, this.f14676OooO0O0, this.f14682OooO0oo, this.f14678OooO0Oo, this.f14680OooO0o0, this.f14679OooO0o, this.f14681OooO0oO, signInOptions, false);
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        @NonNull
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.f14683OooOO0.put(api, null);
            OooO00o(api, null, scopeArr);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.f14683OooOO0.put(api, o);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o);
            this.f14677OooO0OO.addAll(impliedScopes);
            this.f14676OooO0O0.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.f14691OooOOo0.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.f14690OooOOo.add(onConnectionFailedListener);
        }
    }
}
