package com.facebook.appevents.iap;

import android.content.Context;
import com.google.firebase.components.o0OoOo0;
import p319o0O0oo0O.o000O0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10600OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f10601OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10602OooO0o0;

    public /* synthetic */ OooO(int i, Object obj, Object obj2) {
        this.f10600OooO0Oo = i;
        this.f10602OooO0o0 = obj;
        this.f10601OooO0o = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10600OooO0Oo) {
            case 0:
                InAppPurchaseBillingClientWrapper.m4089queryPurchaseHistory$lambda0((InAppPurchaseBillingClientWrapper) this.f10602OooO0o0, (Runnable) this.f10601OooO0o);
                return;
            case 1:
                o0OoOo0 o0oooo0 = (o0OoOo0) this.f10602OooO0o0;
                p298o0O0o00o.OooO0OO oooO0OO = (p298o0O0o00o.OooO0OO) this.f10601OooO0o;
                synchronized (o0oooo0) {
                    if (o0oooo0.f19844OooO0O0 == 0) {
                        o0oooo0.f19843OooO00o.add((p298o0O0o00o.OooO0OO<T>) oooO0OO);
                    } else {
                        o0oooo0.f19844OooO0O0.add((T) oooO0OO.get());
                    }
                }
                return;
            default:
                o000O0o o000o0o2 = (o000O0o) this.f10602OooO0o0;
                Context context = (Context) this.f10601OooO0o;
                if (o000o0o2.f42673OooO00o != null || context == null) {
                    return;
                }
                o000o0o2.f42673OooO00o = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
        }
    }
}
