package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f11316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f11317OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f11318OooO0OO;

    public o00Oo0(OooO0o oooO0o, String str, OooOo00 oooOo00) {
        this.f11318OooO0OO = oooO0o;
        this.f11316OooO00o = str;
        this.f11317OooO0O0 = oooOo00;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Purchase.OooO00o oooO00oOooO = OooO0o.OooO(this.f11318OooO0OO, this.f11316OooO00o);
        List<Purchase> list = oooO00oOooO.f11252OooO00o;
        if (list != null) {
            ((OooO) this.f11317OooO0O0).OooO00o(oooO00oOooO.f11253OooO0O0, list);
            return null;
        }
        ((OooO) this.f11317OooO0O0).OooO00o(oooO00oOooO.f11253OooO0O0, zzu.zzh());
        return null;
    }
}
