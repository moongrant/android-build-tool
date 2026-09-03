package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import p257o00ooOOo.o0OOO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f14686OooO0o0;

    @Nullable
    public final IBinder zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.f14686OooO0o0 = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // p257o00ooOOo.o0OOO0OO
    public final void OooO0OO(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f14686OooO0o0;
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.f14555OooOo0O;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
        }
        baseGmsClient.OooO0o(connectionResult);
    }

    @Override // p257o00ooOOo.o0OOO0OO
    public final boolean OooO0Oo() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.f14686OooO0o0;
            if (!baseGmsClient.OooO0Oo().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + baseGmsClient.OooO0Oo() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = baseGmsClient.createServiceInterface(this.zze);
            if (iInterfaceCreateServiceInterface == null || !(BaseGmsClient.OooO0oo(baseGmsClient, 2, 4, iInterfaceCreateServiceInterface) || BaseGmsClient.OooO0oo(baseGmsClient, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            baseGmsClient.f14557OooOoO = null;
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.f14553OooOo0;
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
