package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zze implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14684OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f14685OooO0O0;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.f14685OooO0O0 = baseGmsClient;
        this.f14684OooO00o = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f14685OooO0O0;
        if (iBinder == null) {
            BaseGmsClient.OooO0oO(baseGmsClient);
            return;
        }
        synchronized (baseGmsClient.f14545OooOOO) {
            BaseGmsClient baseGmsClient2 = this.f14685OooO0O0;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.f14547OooOOOO = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new OooOO0(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
        }
        BaseGmsClient baseGmsClient3 = this.f14685OooO0O0;
        int i = this.f14684OooO00o;
        baseGmsClient3.getClass();
        zzg zzgVar = new zzg(baseGmsClient3, 0, null);
        OooOO0O oooOO0O = baseGmsClient3.f14544OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(7, i, -1, zzgVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient;
        synchronized (this.f14685OooO0O0.f14545OooOOO) {
            baseGmsClient = this.f14685OooO0O0;
            baseGmsClient.f14547OooOOOO = null;
        }
        OooOO0O oooOO0O = baseGmsClient.f14544OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(6, this.f14684OooO00o, 1));
    }
}
