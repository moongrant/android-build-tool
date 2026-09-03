package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zze implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f15667OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15668OooO0O0;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.f15668OooO0O0 = baseGmsClient;
        this.f15667OooO00o = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f15668OooO0O0;
        if (iBinder == null) {
            BaseGmsClient.OooO0oo(baseGmsClient);
            return;
        }
        synchronized (baseGmsClient.f15525OooOOO) {
            BaseGmsClient baseGmsClient2 = this.f15668OooO0O0;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.f15527OooOOOO = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new OooOO0(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
        }
        BaseGmsClient baseGmsClient3 = this.f15668OooO0O0;
        int i = this.f15667OooO00o;
        OooOO0O oooOO0O = baseGmsClient3.f15524OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(7, i, -1, new zzg(baseGmsClient3, 0, null)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient;
        synchronized (this.f15668OooO0O0.f15525OooOOO) {
            baseGmsClient = this.f15668OooO0O0;
            baseGmsClient.f15527OooOOOO = null;
        }
        OooOO0O oooOO0O = baseGmsClient.f15524OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(6, this.f15667OooO00o, 1));
    }
}
