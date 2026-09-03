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
public final class o0000 implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f9685OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f9686OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f9687OooO0OO;

    public /* synthetic */ o0000(OooO0o oooO0o, OooOOOO oooOOOO) {
        this.f9687OooO0OO = oooO0o;
        this.f9686OooO0O0 = oooOOOO;
    }

    public final void OooO00o(OooOo00 oooOo00) {
        synchronized (this.f9685OooO00o) {
            OooOOOO oooOOOO = this.f9686OooO0O0;
            if (oooOOOO != null) {
                oooOOOO.onBillingSetupFinished(oooOo00);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzn("BillingClient", "Billing service connected.");
        this.f9687OooO0OO.f9633OooO0o = zzd.zzo(iBinder);
        OooO0o oooO0o = this.f9687OooO0OO;
        if (oooO0o.OooOO0(new Callable() { // from class: com.android.billingclient.api.o00000O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle;
                int iZzr;
                o0000 o0000Var = this.f9695OooO00o;
                synchronized (o0000Var.f9685OooO00o) {
                }
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i = 3;
                try {
                    String packageName = o0000Var.f9687OooO0OO.f9634OooO0o0.getPackageName();
                    iZzr = 3;
                    int i2 = 17;
                    while (true) {
                        if (i2 < 3) {
                            i2 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                iZzr = o0000Var.f9687OooO0OO.f9633OooO0o.zzr(i2, packageName, "subs");
                            } catch (Exception e) {
                                e = e;
                                i = iZzr;
                                zzb.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                o0000Var.f9687OooO0OO.f9629OooO00o = 0;
                                o0000Var.f9687OooO0OO.f9633OooO0o = null;
                                iZzr = i;
                            }
                        } else {
                            iZzr = o0000Var.f9687OooO0OO.f9633OooO0o.zzc(i2, packageName, "subs", bundle);
                        }
                        if (iZzr == 0) {
                            break;
                        }
                        i2--;
                    }
                    OooO0o oooO0o2 = o0000Var.f9687OooO0OO;
                    boolean z = true;
                    oooO0o2.f9628OooO = i2 >= 5;
                    oooO0o2.f9636OooO0oo = i2 >= 3;
                    if (i2 < 3) {
                        zzb.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    for (int i3 = 17; i3 >= 3; i3--) {
                        iZzr = bundle == null ? o0000Var.f9687OooO0OO.f9633OooO0o.zzr(i3, packageName, "inapp") : o0000Var.f9687OooO0OO.f9633OooO0o.zzc(i3, packageName, "inapp", bundle);
                        if (iZzr == 0) {
                            o0000Var.f9687OooO0OO.f9637OooOO0 = i3;
                            break;
                        }
                    }
                    OooO0o oooO0o3 = o0000Var.f9687OooO0OO;
                    int i4 = oooO0o3.f9637OooOO0;
                    oooO0o3.f9646OooOOoo = i4 >= 17;
                    oooO0o3.f9644OooOOo = i4 >= 16;
                    oooO0o3.f9645OooOOo0 = i4 >= 15;
                    oooO0o3.f9643OooOOOo = i4 >= 14;
                    oooO0o3.f9642OooOOOO = i4 >= 12;
                    oooO0o3.f9640OooOOO = i4 >= 10;
                    oooO0o3.f9641OooOOO0 = i4 >= 9;
                    oooO0o3.f9639OooOO0o = i4 >= 8;
                    if (i4 < 6) {
                        z = false;
                    }
                    oooO0o3.f9638OooOO0O = z;
                    if (i4 < 3) {
                        zzb.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    if (iZzr == 0) {
                        o0000Var.f9687OooO0OO.f9629OooO00o = 2;
                    } else {
                        o0000Var.f9687OooO0OO.f9629OooO00o = 0;
                        o0000Var.f9687OooO0OO.f9633OooO0o = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (iZzr == 0) {
                    o0000Var.OooO00o(o0000O0O.f9709OooOO0O);
                } else {
                    o0000Var.OooO00o(o0000O0O.f9700OooO00o);
                }
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o00000OO
            @Override // java.lang.Runnable
            public final void run() {
                o0000 o0000Var = this.f9698OooO0Oo;
                o0000Var.f9687OooO0OO.f9629OooO00o = 0;
                o0000Var.f9687OooO0OO.f9633OooO0o = null;
                o0000Var.OooO00o(o0000O0O.f9712OooOOO0);
            }
        }, oooO0o.OooO0oO()) == null) {
            OooO00o(this.f9687OooO0OO.OooO());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzo("BillingClient", "Billing service disconnected.");
        this.f9687OooO0OO.f9633OooO0o = null;
        this.f9687OooO0OO.f9629OooO00o = 0;
        synchronized (this.f9685OooO00o) {
            OooOOOO oooOOOO = this.f9686OooO0O0;
            if (oooOOOO != null) {
                oooOOOO.onBillingServiceDisconnected();
            }
        }
    }
}
