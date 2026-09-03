package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f12810OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f12811OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f12812OooO0OO;

    public /* synthetic */ o00000OO(OooO0o oooO0o, OooOOOO oooOOOO) {
        this.f12812OooO0OO = oooO0o;
        this.f12811OooO0O0 = oooOOOO;
    }

    public final void OooO00o(OooOo00 oooOo00) {
        synchronized (this.f12810OooO00o) {
            OooOOOO oooOOOO = this.f12811OooO0O0;
            if (oooOOOO != null) {
                oooOOOO.onBillingSetupFinished(oooOo00);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzn("BillingClient", "Billing service connected.");
        this.f12812OooO0OO.f12724OooO0o = zzd.zzo(iBinder);
        OooO0o oooO0o = this.f12812OooO0OO;
        if (oooO0o.OooOO0(new Callable() { // from class: com.android.billingclient.api.o00000O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle;
                int iZzr;
                o00000OO o00000oo2 = this.f12809OooO00o;
                synchronized (o00000oo2.f12810OooO00o) {
                }
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i = 3;
                try {
                    String packageName = o00000oo2.f12812OooO0OO.f12725OooO0o0.getPackageName();
                    iZzr = 3;
                    int i2 = 17;
                    while (true) {
                        if (i2 < 3) {
                            i2 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                iZzr = o00000oo2.f12812OooO0OO.f12724OooO0o.zzr(i2, packageName, "subs");
                            } catch (Exception e) {
                                e = e;
                                i = iZzr;
                                zzb.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                o00000oo2.f12812OooO0OO.f12720OooO00o = 0;
                                o00000oo2.f12812OooO0OO.f12724OooO0o = null;
                                iZzr = i;
                            }
                        } else {
                            iZzr = o00000oo2.f12812OooO0OO.f12724OooO0o.zzc(i2, packageName, "subs", bundle);
                        }
                        if (iZzr == 0) {
                            break;
                        }
                        i2--;
                    }
                    OooO0o oooO0o2 = o00000oo2.f12812OooO0OO;
                    boolean z = true;
                    oooO0o2.f12719OooO = i2 >= 5;
                    oooO0o2.f12727OooO0oo = i2 >= 3;
                    if (i2 < 3) {
                        zzb.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    for (int i3 = 17; i3 >= 3; i3--) {
                        iZzr = bundle == null ? o00000oo2.f12812OooO0OO.f12724OooO0o.zzr(i3, packageName, "inapp") : o00000oo2.f12812OooO0OO.f12724OooO0o.zzc(i3, packageName, "inapp", bundle);
                        if (iZzr == 0) {
                            o00000oo2.f12812OooO0OO.f12728OooOO0 = i3;
                            break;
                        }
                    }
                    OooO0o oooO0o3 = o00000oo2.f12812OooO0OO;
                    int i4 = oooO0o3.f12728OooOO0;
                    oooO0o3.f12737OooOOoo = i4 >= 17;
                    oooO0o3.f12735OooOOo = i4 >= 16;
                    oooO0o3.f12736OooOOo0 = i4 >= 15;
                    oooO0o3.f12734OooOOOo = i4 >= 14;
                    oooO0o3.f12733OooOOOO = i4 >= 12;
                    oooO0o3.f12731OooOOO = i4 >= 10;
                    oooO0o3.f12732OooOOO0 = i4 >= 9;
                    oooO0o3.f12730OooOO0o = i4 >= 8;
                    if (i4 < 6) {
                        z = false;
                    }
                    oooO0o3.f12729OooOO0O = z;
                    if (i4 < 3) {
                        zzb.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    if (iZzr == 0) {
                        o00000oo2.f12812OooO0OO.f12720OooO00o = 2;
                    } else {
                        o00000oo2.f12812OooO0OO.f12720OooO00o = 0;
                        o00000oo2.f12812OooO0OO.f12724OooO0o = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (iZzr == 0) {
                    o00000oo2.OooO00o(o0000.f12789OooOO0O);
                } else {
                    o00000oo2.OooO00o(o0000.f12780OooO00o);
                }
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o00000O
            @Override // java.lang.Runnable
            public final void run() {
                o00000OO o00000oo2 = this.f12808OooO0Oo;
                o00000oo2.f12812OooO0OO.f12720OooO00o = 0;
                o00000oo2.f12812OooO0OO.f12724OooO0o = null;
                o00000oo2.OooO00o(o0000.f12792OooOOO0);
            }
        }, oooO0o.OooO0oO()) == null) {
            OooO00o(this.f12812OooO0OO.OooO());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzo("BillingClient", "Billing service disconnected.");
        this.f12812OooO0OO.f12724OooO0o = null;
        this.f12812OooO0OO.f12720OooO00o = 0;
        synchronized (this.f12810OooO00o) {
            OooOOOO oooOOOO = this.f12811OooO0O0;
            if (oooOOOO != null) {
                oooOOOO.onBillingServiceDisconnected();
            }
        }
    }
}
