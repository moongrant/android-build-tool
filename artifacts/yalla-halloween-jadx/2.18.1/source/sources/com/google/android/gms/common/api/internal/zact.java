package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.Set;
import p331o0O0oooO.o0OO000;
import p331o0O0oooO.o0OO000o;

/* JADX INFO: loaded from: classes2.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15401OooO0oo = zad.zac;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15402OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f15403OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<Scope> f15405OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public com.google.android.gms.signin.zae f15406OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ClientSettings f15407OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public zacs f15408OooO0oO;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = f15401OooO0oo;
        this.f15402OooO00o = context;
        this.f15403OooO0O0 = handler;
        this.f15407OooO0o0 = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.f15405OooO0Oo = clientSettings.getRequiredScopes();
        this.f15404OooO0OO = abstractClientBuilder;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.f15406OooO0o.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f15408OooO0oO.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.f15406OooO0o.disconnect();
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.f15403OooO0O0.post(new o0OO000o(this, zakVar, 0));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @WorkerThread
    public final void zae(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.f15406OooO0o;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.f15407OooO0o0.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f15404OooO0OO;
        Context context = this.f15402OooO00o;
        Looper looper = this.f15403OooO0O0.getLooper();
        ClientSettings clientSettings = this.f15407OooO0o0;
        this.f15406OooO0o = abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.f15408OooO0oO = zacsVar;
        Set<Scope> set = this.f15405OooO0Oo;
        if (set == null || set.isEmpty()) {
            this.f15403OooO0O0.post(new o0OO000(this));
        } else {
            this.f15406OooO0o.zab();
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.f15406OooO0o;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
