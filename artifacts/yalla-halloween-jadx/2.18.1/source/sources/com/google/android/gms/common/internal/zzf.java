package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf extends o0O.OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15669OooO0o0;

    @Nullable
    public final IBinder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.f15669OooO0o0 = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // o0O.OooO
    public final void OooO0OO(ConnectionResult connectionResult) {
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = this.f15669OooO0o0.f15535OooOo0O;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
        }
        this.f15669OooO0o0.OooO0o(connectionResult);
    }

    @Override // o0O.OooO
    public final boolean OooO0Oo() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f15669OooO0o0.OooO0Oo().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f15669OooO0o0.OooO0Oo() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f15669OooO0o0.createServiceInterface(this.zze);
            if (iInterfaceCreateServiceInterface == null || !(BaseGmsClient.OooO(this.f15669OooO0o0, 2, 4, iInterfaceCreateServiceInterface) || BaseGmsClient.OooO(this.f15669OooO0o0, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            BaseGmsClient baseGmsClient = this.f15669OooO0o0;
            baseGmsClient.f15537OooOoO = null;
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = this.f15669OooO0o0.f15533OooOo0;
            if (baseConnectionCallbacks == null) {
                return true;
            }
            baseConnectionCallbacks.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
