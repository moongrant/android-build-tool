package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import io.agora.rtc.Constants;
import o0OO0OoO.o0O00;
import o0OO0OoO.o0O00O;
import o0OO0OoO.o0O00O0o;
import o0OO0OoO.o0OoO00O;
import p331o0O0oooO.o0OO000o;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzjr implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile boolean f16263OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile zzek f16264OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zzjs f16265OooO0OO;

    public zzjr(zzjs zzjsVar) {
        this.f16265OooO0OO = zzjsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f16264OooO0O0);
                this.f16265OooO0OO.f37615OooO00o.zzaz().zzp(new o0OoO00O(this, (zzee) this.f16264OooO0O0.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f16264OooO0O0 = null;
                this.f16263OooO00o = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzeo zzeoVarZzl = this.f16265OooO0OO.f37615OooO00o.zzl();
        if (zzeoVarZzl != null) {
            zzeoVarZzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f16263OooO00o = false;
            this.f16264OooO0O0 = null;
        }
        this.f16265OooO0OO.f37615OooO00o.zzaz().zzp(new o0O00O(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f16265OooO0OO.f37615OooO00o.zzay().zzc().zza("Service connection suspended");
        this.f16265OooO0OO.f37615OooO00o.zzaz().zzp(new o0O00O0o(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f16263OooO00o = false;
                this.f16265OooO0OO.f37615OooO00o.zzay().zzd().zza("Service connected with null binder");
                return;
            }
            Object zzecVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzecVar = iInterfaceQueryLocalInterface instanceof zzee ? (zzee) iInterfaceQueryLocalInterface : new zzec(iBinder);
                    this.f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.f16265OooO0OO.f37615OooO00o.zzay().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f16265OooO0OO.f37615OooO00o.zzay().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzecVar == null) {
                this.f16263OooO00o = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.f16265OooO0OO.f37615OooO00o.zzau(), this.f16265OooO0OO.f16267OooO0OO);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f16265OooO0OO.f37615OooO00o.zzaz().zzp(new o0OO000o(this, zzecVar, 1));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f16265OooO0OO.f37615OooO00o.zzay().zzc().zza("Service disconnected");
        this.f16265OooO0OO.f37615OooO00o.zzaz().zzp(new o0O00(this, componentName));
    }

    @WorkerThread
    public final void zzb(Intent intent) {
        this.f16265OooO0OO.zzg();
        Context contextZzau = this.f16265OooO0OO.f37615OooO00o.zzau();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.f16263OooO00o) {
                this.f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Using local app measurement service");
            this.f16263OooO00o = true;
            connectionTracker.bindService(contextZzau, intent, this.f16265OooO0OO.f16267OooO0OO, Constants.ERR_WATERMARK_READ);
        }
    }

    @WorkerThread
    public final void zzc() {
        this.f16265OooO0OO.zzg();
        Context contextZzau = this.f16265OooO0OO.f37615OooO00o.zzau();
        synchronized (this) {
            if (this.f16263OooO00o) {
                this.f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            if (this.f16264OooO0O0 != null && (this.f16264OooO0O0.isConnecting() || this.f16264OooO0O0.isConnected())) {
                this.f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Already awaiting connection attempt");
                return;
            }
            this.f16264OooO0O0 = new zzek(contextZzau, Looper.getMainLooper(), this, this);
            this.f16265OooO0OO.f37615OooO00o.zzay().zzj().zza("Connecting to remote service");
            this.f16263OooO00o = true;
            Preconditions.checkNotNull(this.f16264OooO0O0);
            this.f16264OooO0O0.checkAvailabilityAndConnect();
        }
    }

    @WorkerThread
    public final void zzd() {
        if (this.f16264OooO0O0 != null && (this.f16264OooO0O0.isConnected() || this.f16264OooO0O0.isConnecting())) {
            this.f16264OooO0O0.disconnect();
        }
        this.f16264OooO0O0 = null;
    }
}
