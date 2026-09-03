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
import p254o00ooOO0.o00OOO0O;
import p254o00ooOO0.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14899OooOO0O = zad.zac;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public com.google.android.gms.signin.zae f14900OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f14901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14902OooO0o = f14899OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Handler f14903OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<Scope> f14904OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ClientSettings f14905OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public zacs f14906OooOO0;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        this.f14901OooO0Oo = context;
        this.f14903OooO0o0 = handler;
        this.f14905OooO0oo = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.f14904OooO0oO = clientSettings.getRequiredScopes();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.f14900OooO.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f14906OooOO0.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.f14900OooO.disconnect();
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.f14903OooO0o0.post(new o0o0Oo(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @WorkerThread
    public final void zae(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.f14900OooO;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        ClientSettings clientSettings = this.f14905OooO0oo;
        clientSettings.zae(numValueOf);
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f14902OooO0o;
        Context context = this.f14901OooO0Oo;
        Handler handler = this.f14903OooO0o0;
        this.f14900OooO = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.f14906OooOO0 = zacsVar;
        Set<Scope> set = this.f14904OooO0oO;
        if (set == null || set.isEmpty()) {
            handler.post(new o00OOO0O(this));
        } else {
            this.f14900OooO.zab();
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.f14900OooO;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
