package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
public final class zak implements Handler.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotOnlyInitialized
    public final zaj f14650OooO0Oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zaq f14656OooOO0O;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> f14652OooO0o0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> f14651OooO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<GoogleApiClient.OnConnectionFailedListener> f14653OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f14654OooO0oo = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicInteger f14649OooO = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f14655OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Object f14657OooOO0o = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.f14650OooO0Oo = zajVar;
        this.f14656OooOO0O = new zaq(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.f14657OooOO0o) {
            if (this.f14654OooO0oo && this.f14650OooO0Oo.isConnected() && this.f14652OooO0o0.contains(connectionCallbacks)) {
                connectionCallbacks.onConnected(null);
            }
        }
        return true;
    }

    public final void zaa() {
        this.f14654OooO0oo = false;
        this.f14649OooO.incrementAndGet();
    }

    public final void zab() {
        this.f14654OooO0oo = true;
    }

    @VisibleForTesting
    public final void zac(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f14656OooOO0O, "onConnectionFailure must only be called on the Handler thread");
        this.f14656OooOO0O.removeMessages(1);
        synchronized (this.f14657OooOO0o) {
            ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList = new ArrayList(this.f14653OooO0oO);
            int i = this.f14649OooO.get();
            for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList) {
                if (this.f14654OooO0oo && this.f14649OooO.get() == i) {
                    if (this.f14653OooO0oO.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    @VisibleForTesting
    public final void zad(@Nullable Bundle bundle) {
        Preconditions.checkHandlerThread(this.f14656OooOO0O, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f14657OooOO0o) {
            Preconditions.checkState(!this.f14655OooOO0);
            this.f14656OooOO0O.removeMessages(1);
            this.f14655OooOO0 = true;
            Preconditions.checkState(this.f14651OooO0o.isEmpty());
            ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.f14652OooO0o0);
            int i = this.f14649OooO.get();
            for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                if (!this.f14654OooO0oo || !this.f14650OooO0Oo.isConnected() || this.f14649OooO.get() != i) {
                    break;
                    break;
                    break;
                } else if (!this.f14651OooO0o.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.f14651OooO0o.clear();
            this.f14655OooOO0 = false;
        }
    }

    @VisibleForTesting
    public final void zae(int i) {
        Preconditions.checkHandlerThread(this.f14656OooOO0O, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f14656OooOO0O.removeMessages(1);
        synchronized (this.f14657OooOO0o) {
            this.f14655OooOO0 = true;
            ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.f14652OooO0o0);
            int i2 = this.f14649OooO.get();
            for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                if (!this.f14654OooO0oo || this.f14649OooO.get() != i2) {
                    break;
                    break;
                } else if (this.f14652OooO0o0.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.f14651OooO0o.clear();
            this.f14655OooOO0 = false;
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f14657OooOO0o) {
            if (this.f14652OooO0o0.contains(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f14652OooO0o0.add(connectionCallbacks);
            }
        }
        if (this.f14650OooO0Oo.isConnected()) {
            zaq zaqVar = this.f14656OooOO0O;
            zaqVar.sendMessage(zaqVar.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f14657OooOO0o) {
            if (this.f14653OooO0oO.contains(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f14653OooO0oO.add(onConnectionFailedListener);
            }
        }
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f14657OooOO0o) {
            if (!this.f14652OooO0o0.remove(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            } else if (this.f14655OooOO0) {
                this.f14651OooO0o.add(connectionCallbacks);
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f14657OooOO0o) {
            if (!this.f14653OooO0oO.remove(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean zaj(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f14657OooOO0o) {
            zContains = this.f14652OooO0o0.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final boolean zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f14657OooOO0o) {
            zContains = this.f14653OooO0oO.contains(onConnectionFailedListener);
        }
        return zContains;
    }
}
