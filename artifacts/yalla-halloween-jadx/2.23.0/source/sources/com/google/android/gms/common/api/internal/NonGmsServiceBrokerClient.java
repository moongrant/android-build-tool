package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14760OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f14761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f14762OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ComponentName f14763OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f14764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zaq f14765OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConnectionCallbacks f14766OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OnConnectionFailedListener f14767OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public IBinder f14768OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f14769OooOO0;

    @KeepForSdk
    public NonGmsServiceBrokerClient(@NonNull Context context, @NonNull Looper looper, @NonNull ComponentName componentName, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, null, null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    @WorkerThread
    public final void OooO00o() {
        if (Thread.currentThread() != this.f14765OooO0o.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    public final void connect(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        OooO00o();
        String.valueOf(this.f14768OooO0oo);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f14763OooO0OO;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f14761OooO00o).setAction(this.f14762OooO0O0);
            }
            boolean zBindService = this.f14764OooO0Oo.bindService(intent, this, GmsClientSupervisor.getDefaultBindFlags());
            this.f14760OooO = zBindService;
            if (!zBindService) {
                this.f14768OooO0oo = null;
                this.f14767OooO0oO.onConnectionFailed(new ConnectionResult(16));
            }
            String.valueOf(this.f14768OooO0oo);
        } catch (SecurityException e) {
            this.f14760OooO = false;
            this.f14768OooO0oo = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    public final void disconnect() {
        OooO00o();
        String.valueOf(this.f14768OooO0oo);
        try {
            this.f14764OooO0Oo.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f14760OooO = false;
        this.f14768OooO0oo = null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Nullable
    @KeepForSdk
    @WorkerThread
    public IBinder getBinder() {
        OooO00o();
        return this.f14768OooO0oo;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    public final String getEndpointPackageName() {
        String str = this.f14761OooO00o;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f14763OooO0OO;
        Preconditions.checkNotNull(componentName);
        return componentName.getPackageName();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @Nullable
    public final String getLastDisconnectMessage() {
        return this.f14769OooOO0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @Nullable
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    public final boolean isConnected() {
        OooO00o();
        return this.f14768OooO0oo != null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    public final boolean isConnecting() {
        OooO00o();
        return this.f14760OooO;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull final IBinder iBinder) {
        this.f14765OooO0o.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                NonGmsServiceBrokerClient nonGmsServiceBrokerClient = this.zaa;
                IBinder iBinder2 = iBinder;
                nonGmsServiceBrokerClient.f14760OooO = false;
                nonGmsServiceBrokerClient.f14768OooO0oo = iBinder2;
                String.valueOf(iBinder2);
                nonGmsServiceBrokerClient.f14766OooO0o0.onConnected(new Bundle());
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f14765OooO0o.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                NonGmsServiceBrokerClient nonGmsServiceBrokerClient = this.zaa;
                nonGmsServiceBrokerClient.f14760OooO = false;
                nonGmsServiceBrokerClient.f14768OooO0oo = null;
                nonGmsServiceBrokerClient.f14766OooO0o0.onConnectionSuspended(1);
            }
        });
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(@NonNull BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return false;
    }

    public final void zac(@Nullable String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NonGmsServiceBrokerClient(Context context, Looper looper, @Nullable String str, @Nullable String str2, @Nullable ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this.f14760OooO = false;
        this.f14769OooOO0 = null;
        this.f14764OooO0Oo = context;
        this.f14765OooO0o = new zaq(looper);
        this.f14766OooO0o0 = connectionCallbacks;
        this.f14767OooO0oO = onConnectionFailedListener;
        if (str != null && str2 != null) {
            if (componentName == null) {
                componentName = null;
                this.f14761OooO00o = str;
                this.f14762OooO0O0 = str2;
                this.f14763OooO0OO = componentName;
                return;
            }
            throw new AssertionError("Must specify either package or component, but not both");
        }
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@NonNull Context context, @NonNull Looper looper, @NonNull String str, @NonNull String str2, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, null, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @WorkerThread
    public final void disconnect(@NonNull String str) {
        OooO00o();
        this.f14769OooOO0 = str;
        disconnect();
    }
}
