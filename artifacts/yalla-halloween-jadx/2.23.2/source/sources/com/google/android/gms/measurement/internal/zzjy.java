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
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import io.agora.rtc.Constants;
import p271o00ooooo.r;
import p271o00ooooo.s;
import p271o00ooooo.t;
import p271o00ooooo.u;
import p271o00ooooo.v;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzjy implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile boolean f15583OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile zzep f15584OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zzjz f15585OooO0OO;

    public zzjy(zzjz zzjzVar) {
        this.f15585OooO0OO = zzjzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f15584OooO0O0);
                this.f15585OooO0OO.f40788OooO00o.zzaB().zzp(new t(this, (zzej) this.f15584OooO0O0.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15584OooO0O0 = null;
                this.f15583OooO00o = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzet zzetVarZzl = this.f15585OooO0OO.f40788OooO00o.zzl();
        if (zzetVarZzl != null) {
            zzetVarZzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f15583OooO00o = false;
            this.f15584OooO0O0 = null;
        }
        this.f15585OooO0OO.f40788OooO00o.zzaB().zzp(new v(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        zzjz zzjzVar = this.f15585OooO0OO;
        zzjzVar.f40788OooO00o.zzaA().zzc().zza("Service connection suspended");
        zzjzVar.f40788OooO00o.zzaB().zzp(new u(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f15583OooO00o = false;
                this.f15585OooO0OO.f40788OooO00o.zzaA().zzd().zza("Service connected with null binder");
                return;
            }
            zzej zzehVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzehVar = iInterfaceQueryLocalInterface instanceof zzej ? (zzej) iInterfaceQueryLocalInterface : new zzeh(iBinder);
                    this.f15585OooO0OO.f40788OooO00o.zzaA().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.f15585OooO0OO.f40788OooO00o.zzaA().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f15585OooO0OO.f40788OooO00o.zzaA().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzehVar == null) {
                this.f15583OooO00o = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.f15585OooO0OO.f40788OooO00o.zzaw(), this.f15585OooO0OO.f15587OooO0OO);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f15585OooO0OO.f40788OooO00o.zzaB().zzp(new r(this, zzehVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        zzjz zzjzVar = this.f15585OooO0OO;
        zzjzVar.f40788OooO00o.zzaA().zzc().zza("Service disconnected");
        zzjzVar.f40788OooO00o.zzaB().zzp(new s(this, componentName));
    }

    @WorkerThread
    public final void zzb(Intent intent) {
        this.f15585OooO0OO.zzg();
        Context contextZzaw = this.f15585OooO0OO.f40788OooO00o.zzaw();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.f15583OooO00o) {
                this.f15585OooO0OO.f40788OooO00o.zzaA().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.f15585OooO0OO.f40788OooO00o.zzaA().zzj().zza("Using local app measurement service");
            this.f15583OooO00o = true;
            connectionTracker.bindService(contextZzaw, intent, this.f15585OooO0OO.f15587OooO0OO, Constants.ERR_WATERMARK_READ);
        }
    }

    @WorkerThread
    public final void zzc() {
        this.f15585OooO0OO.zzg();
        Context contextZzaw = this.f15585OooO0OO.f40788OooO00o.zzaw();
        synchronized (this) {
            if (this.f15583OooO00o) {
                this.f15585OooO0OO.f40788OooO00o.zzaA().zzj().zza("Connection attempt already in progress");
                return;
            }
            if (this.f15584OooO0O0 != null && (this.f15584OooO0O0.isConnecting() || this.f15584OooO0O0.isConnected())) {
                this.f15585OooO0OO.f40788OooO00o.zzaA().zzj().zza("Already awaiting connection attempt");
                return;
            }
            this.f15584OooO0O0 = new zzep(contextZzaw, Looper.getMainLooper(), this, this);
            this.f15585OooO0OO.f40788OooO00o.zzaA().zzj().zza("Connecting to remote service");
            this.f15583OooO00o = true;
            Preconditions.checkNotNull(this.f15584OooO0O0);
            this.f15584OooO0O0.checkAvailabilityAndConnect();
        }
    }

    @WorkerThread
    public final void zzd() {
        if (this.f15584OooO0O0 != null && (this.f15584OooO0O0.isConnected() || this.f15584OooO0O0.isConnecting())) {
            this.f15584OooO0O0.disconnect();
        }
        this.f15584OooO0O0 = null;
    }
}
