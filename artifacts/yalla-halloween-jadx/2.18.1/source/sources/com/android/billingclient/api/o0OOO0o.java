package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f11322OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOO0 f11323OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f11324OooO0OO;

    public /* synthetic */ o0OOO0o(OooO0o oooO0o, OooOO0 oooOO1) {
        this.f11324OooO0OO = oooO0o;
        this.f11323OooO0O0 = oooOO1;
    }

    public final void OooO00o(OooOOO0 oooOOO0) {
        synchronized (this.f11322OooO00o) {
            OooOO0 oooOO1 = this.f11323OooO0O0;
            if (oooOO1 != null) {
                oooOO1.onBillingSetupFinished(oooOOO0);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzm("BillingClient", "Billing service connected.");
        this.f11324OooO0OO.f11221OooO0o = com.google.android.gms.internal.play_billing.zzd.zzo(iBinder);
        OooO0o oooO0o = this.f11324OooO0OO;
        if (oooO0o.OooO0oo(new Callable() { // from class: com.android.billingclient.api.o00oO0o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle;
                int iZzr;
                o0OOO0o o0ooo0o2 = this.f11321OooO00o;
                synchronized (o0ooo0o2.f11322OooO00o) {
                }
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i = 3;
                try {
                    String packageName = o0ooo0o2.f11324OooO0OO.f11222OooO0o0.getPackageName();
                    int i2 = 17;
                    iZzr = 3;
                    while (true) {
                        if (i2 < 3) {
                            i2 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                iZzr = o0ooo0o2.f11324OooO0OO.f11221OooO0o.zzr(i2, packageName, BillingClient.SkuType.SUBS);
                            } catch (Exception e) {
                                e = e;
                                i = iZzr;
                                zzb.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                o0ooo0o2.f11324OooO0OO.f11217OooO00o = 0;
                                o0ooo0o2.f11324OooO0OO.f11221OooO0o = null;
                                iZzr = i;
                            }
                        } else {
                            iZzr = o0ooo0o2.f11324OooO0OO.f11221OooO0o.zzc(i2, packageName, BillingClient.SkuType.SUBS, bundle);
                        }
                        if (iZzr == 0) {
                            break;
                        }
                        i2--;
                    }
                    Objects.requireNonNull(o0ooo0o2.f11324OooO0OO);
                    boolean z = true;
                    o0ooo0o2.f11324OooO0OO.f11224OooO0oo = i2 >= 3;
                    if (i2 < 3) {
                        zzb.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                    }
                    for (int i3 = 17; i3 >= 3; i3--) {
                        iZzr = bundle == null ? o0ooo0o2.f11324OooO0OO.f11221OooO0o.zzr(i3, packageName, BillingClient.SkuType.INAPP) : o0ooo0o2.f11324OooO0OO.f11221OooO0o.zzc(i3, packageName, BillingClient.SkuType.INAPP, bundle);
                        if (iZzr == 0) {
                            o0ooo0o2.f11324OooO0OO.f11216OooO = i3;
                            break;
                        }
                    }
                    OooO0o oooO0o2 = o0ooo0o2.f11324OooO0OO;
                    int i4 = oooO0o2.f11216OooO;
                    oooO0o2.f11231OooOOOo = i4 >= 17;
                    oooO0o2.f11230OooOOOO = i4 >= 16;
                    oooO0o2.f11228OooOOO = i4 >= 15;
                    oooO0o2.f11229OooOOO0 = i4 >= 14;
                    oooO0o2.f11227OooOO0o = i4 >= 10;
                    oooO0o2.f11226OooOO0O = i4 >= 9;
                    if (i4 < 6) {
                        z = false;
                    }
                    oooO0o2.f11225OooOO0 = z;
                    if (i4 < 3) {
                        zzb.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                    }
                    if (iZzr == 0) {
                        o0ooo0o2.f11324OooO0OO.f11217OooO00o = 2;
                    } else {
                        o0ooo0o2.f11324OooO0OO.f11217OooO00o = 0;
                        o0ooo0o2.f11324OooO0OO.f11221OooO0o = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (iZzr == 0) {
                    o0ooo0o2.OooO00o(o000OOo.f11304OooOO0O);
                } else {
                    o0ooo0o2.OooO00o(o000OOo.f11295OooO00o);
                }
                return null;
            }
        }, 30000L, new oo000o(this, 0), oooO0o.OooO0o0()) == null) {
            OooO00o(this.f11324OooO0OO.OooO0oO());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzn("BillingClient", "Billing service disconnected.");
        this.f11324OooO0OO.f11221OooO0o = null;
        this.f11324OooO0OO.f11217OooO00o = 0;
        synchronized (this.f11322OooO00o) {
            OooOO0 oooOO1 = this.f11323OooO0O0;
            if (oooOO1 != null) {
                oooOO1.onBillingServiceDisconnected();
            }
        }
    }
}
