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

/* JADX INFO: loaded from: classes2.dex */
public final class zak implements Handler.Callback {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotOnlyInitialized
    public final zaj f15633Oooo0o;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final zaq f15636OoooO;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> f15634Oooo0oO = new ArrayList<>();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> f15635Oooo0oo = new ArrayList<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ArrayList<GoogleApiClient.OnConnectionFailedListener> f15632Oooo = new ArrayList<>();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile boolean f15638OoooO00 = false;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final AtomicInteger f15637OoooO0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f15639OoooO0O = false;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Object f15640OoooOO0 = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.f15633Oooo0o = zajVar;
        this.f15636OoooO = new zaq(looper, this);
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
        synchronized (this.f15640OoooOO0) {
            if (this.f15638OoooO00 && this.f15633Oooo0o.isConnected() && this.f15634Oooo0oO.contains(connectionCallbacks)) {
                connectionCallbacks.onConnected(null);
            }
        }
        return true;
    }

    public final void zaa() {
        this.f15638OoooO00 = false;
        this.f15637OoooO0.incrementAndGet();
    }

    public final void zab() {
        this.f15638OoooO00 = true;
    }

    @VisibleForTesting
    public final void zac(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f15636OoooO, "onConnectionFailure must only be called on the Handler thread");
        this.f15636OoooO.removeMessages(1);
        synchronized (this.f15640OoooOO0) {
            ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList = new ArrayList(this.f15632Oooo);
            int i = this.f15637OoooO0.get();
            for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList) {
                if (this.f15638OoooO00 && this.f15637OoooO0.get() == i) {
                    if (this.f15632Oooo.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    @VisibleForTesting
    public final void zad(@Nullable Bundle bundle) {
        Preconditions.checkHandlerThread(this.f15636OoooO, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f15640OoooOO0) {
            Preconditions.checkState(!this.f15639OoooO0O);
            this.f15636OoooO.removeMessages(1);
            this.f15639OoooO0O = true;
            Preconditions.checkState(this.f15635Oooo0oo.isEmpty());
            ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.f15634Oooo0oO);
            int i = this.f15637OoooO0.get();
            for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                if (!this.f15638OoooO00 || !this.f15633Oooo0o.isConnected() || this.f15637OoooO0.get() != i) {
                    break;
                    break;
                    break;
                } else if (!this.f15635Oooo0oo.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.f15635Oooo0oo.clear();
            this.f15639OoooO0O = false;
        }
    }

    @VisibleForTesting
    public final void zae(int i) {
        Preconditions.checkHandlerThread(this.f15636OoooO, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f15636OoooO.removeMessages(1);
        synchronized (this.f15640OoooOO0) {
            this.f15639OoooO0O = true;
            ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.f15634Oooo0oO);
            int i2 = this.f15637OoooO0.get();
            for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                if (!this.f15638OoooO00 || this.f15637OoooO0.get() != i2) {
                    break;
                    break;
                } else if (this.f15634Oooo0oO.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.f15635Oooo0oo.clear();
            this.f15639OoooO0O = false;
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f15640OoooOO0) {
            if (this.f15634Oooo0oO.contains(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f15634Oooo0oO.add(connectionCallbacks);
            }
        }
        if (this.f15633Oooo0o.isConnected()) {
            zaq zaqVar = this.f15636OoooO;
            zaqVar.sendMessage(zaqVar.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f15640OoooOO0) {
            if (this.f15632Oooo.contains(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f15632Oooo.add(onConnectionFailedListener);
            }
        }
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f15640OoooOO0) {
            if (!this.f15634Oooo0oO.remove(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            } else if (this.f15639OoooO0O) {
                this.f15635Oooo0oo.add(connectionCallbacks);
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f15640OoooOO0) {
            if (!this.f15632Oooo.remove(onConnectionFailedListener)) {
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
        synchronized (this.f15640OoooOO0) {
            zContains = this.f15634Oooo0oO.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final boolean zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f15640OoooOO0) {
            zContains = this.f15632Oooo.contains(onConnectionFailedListener);
        }
        return zContains;
    }
}
