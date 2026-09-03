package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
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
import p256o00ooOO0.o00OOOO0;
import p256o00ooOO0.o00OOOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14423OooOO0O = zad.zac;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public com.google.android.gms.signin.zae f14424OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f14425OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14426OooO0o = f14423OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Handler f14427OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<Scope> f14428OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ClientSettings f14429OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public zacs f14430OooOO0;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        this.f14425OooO0Oo = context;
        this.f14427OooO0o0 = handler;
        this.f14429OooO0oo = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.f14428OooO0oO = clientSettings.getRequiredScopes();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.f14424OooO.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f14430OooOO0.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.f14424OooO.disconnect();
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.f14427OooO0o0.post(new o00OOOOo(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @WorkerThread
    public final void zae(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.f14424OooO;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        ClientSettings clientSettings = this.f14429OooO0oo;
        clientSettings.zae(numValueOf);
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f14426OooO0o;
        Context context = this.f14425OooO0Oo;
        Handler handler = this.f14427OooO0o0;
        this.f14424OooO = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.f14430OooOO0 = zacsVar;
        Set<Scope> set = this.f14428OooO0oO;
        if (set == null || set.isEmpty()) {
            handler.post(new o00OOOO0(this));
        } else {
            this.f14424OooO.zab();
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.f14424OooO;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
