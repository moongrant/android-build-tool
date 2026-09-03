package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final StatusExceptionMapper f15161OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f15163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Api<O> f15164OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final O f15165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Looper f15166OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ApiKey<O> f15167OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f15168OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotOnlyInitialized
    public final zabv f15169OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final GoogleApiManager f15170OooOO0;

    @KeepForSdk
    public static class Settings {

        @NonNull
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();

        @NonNull
        public final StatusExceptionMapper zaa;

        @NonNull
        public final Looper zab;

        @KeepForSdk
        public static class Builder {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public StatusExceptionMapper f15171OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public Looper f15172OooO0O0;

            @KeepForSdk
            public Builder() {
            }

            @NonNull
            @KeepForSdk
            public Settings build() {
                if (this.f15171OooO00o == null) {
                    this.f15171OooO00o = new ApiExceptionMapper();
                }
                if (this.f15172OooO0O0 == null) {
                    this.f15172OooO0O0 = Looper.getMainLooper();
                }
                return new Settings(this.f15171OooO00o, this.f15172OooO0O0);
            }

            @NonNull
            @KeepForSdk
            public Builder setLooper(@NonNull Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.f15172OooO0O0 = looper;
                return this;
            }

            @NonNull
            @KeepForSdk
            public Builder setMapper(@NonNull StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.f15171OooO00o = statusExceptionMapper;
                return this;
            }
        }

        public Settings(StatusExceptionMapper statusExceptionMapper, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    @KeepForSdk
    @MainThread
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o2, @NonNull Settings settings) {
        this(activity, activity, api, o2, settings);
    }

    @NonNull
    @KeepForSdk
    public final ClientSettings.Builder OooO00o() {
        Account account;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o2 = this.f15165OooO0Oo;
        if (!(o2 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o2).getGoogleSignInAccount()) == null) {
            O o3 = this.f15165OooO0Oo;
            account = o3 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o3).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        builder.zab(account);
        O o4 = this.f15165OooO0Oo;
        Set<Scope> setEmptySet = (!(o4 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o4).getGoogleSignInAccount()) == null) ? Collections.emptySet() : googleSignInAccount.getRequestedScopes();
        builder.zaa(setEmptySet);
        builder.zac(this.f15162OooO00o.getClass().getName());
        builder.setRealClientPackageName(this.f15162OooO00o.getPackageName());
        return builder;
    }

    public final <TResult, A extends Api.AnyClient> Task<TResult> OooO0O0(int i, @NonNull TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15170OooOO0.zax(this, i, taskApiCall, taskCompletionSource, this.f15161OooO);
        return taskCompletionSource.getTask();
    }

    @NonNull
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.f15169OooO0oo;
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@NonNull T t) {
        t.zak();
        this.f15170OooOO0.zaw(this, 2, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@NonNull T t) {
        t.zak();
        this.f15170OooOO0.zaw(this, 0, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, @NonNull U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f15170OooOO0.zaq(this, t, u, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@NonNull T t) {
        t.zak();
        this.f15170OooOO0.zaw(this, 1, t);
        return t;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @NonNull
    public final ApiKey<O> getApiKey() {
        return this.f15167OooO0o0;
    }

    @NonNull
    @KeepForSdk
    public O getApiOptions() {
        return this.f15165OooO0Oo;
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return this.f15162OooO00o;
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        return this.f15166OooO0o;
    }

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l, @NonNull String str) {
        return ListenerHolders.createListenerHolder(l, this.f15166OooO0o, str);
    }

    public final int zaa() {
        return this.f15168OooO0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final Api.Client zab(Looper looper, zabq<O> zabqVar) {
        Api.Client clientBuildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.f15164OooO0OO.zaa())).buildClient(this.f15162OooO00o, looper, OooO00o().build(), this.f15165OooO0Oo, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String str = this.f15163OooO0O0;
        if (str != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionTag(str);
        }
        if (str != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zac(str);
        }
        return clientBuildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, OooO00o().build());
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o2, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
        this(activity, (Api) api, (Api.ApiOptions) o2, builder.build());
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey, int i) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.f15170OooOO0.zar(this, listenerKey, i);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return OooO0O0(2, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return OooO0O0(0, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return OooO0O0(1, taskApiCall);
    }

    public GoogleApi(@NonNull Context context, @Nullable Activity activity, Api<O> api, O o2, Settings settings) {
        String str;
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f15162OooO00o = context.getApplicationContext();
        if (PlatformVersion.isAtLeastR()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
        } else {
            str = null;
        }
        this.f15163OooO0O0 = str;
        this.f15164OooO0OO = api;
        this.f15165OooO0Oo = o2;
        this.f15166OooO0o = settings.zab;
        ApiKey<O> apiKeyZaa = ApiKey.zaa(api, o2, str);
        this.f15167OooO0o0 = apiKeyZaa;
        this.f15169OooO0oo = new zabv(this);
        GoogleApiManager googleApiManagerZam = GoogleApiManager.zam(this.f15162OooO00o);
        this.f15170OooOO0 = googleApiManagerZam;
        this.f15168OooO0oO = googleApiManagerZam.zaa();
        this.f15161OooO = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity, googleApiManagerZam, apiKeyZaa);
        }
        googleApiManagerZam.zaB(this);
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@NonNull RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.f15170OooOO0.zaq(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o2, @NonNull Looper looper, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setLooper(looper);
        builder.setMapper(statusExceptionMapper);
        this(context, api, o2, builder.build());
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o2, @NonNull Settings settings) {
        this(context, (Activity) null, api, o2, settings);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o2, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        this(context, api, o2, builder.build());
    }
}
