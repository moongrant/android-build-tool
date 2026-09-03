package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f11832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f11833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f11834OooO0OO;

    public OooOOO(Context context, String str, String str2) {
        this.f11832OooO00o = context;
        this.f11833OooO0O0 = str;
        this.f11834OooO0OO = str2;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        return OooOO0O.OooO0O0(this.f11832OooO00o, this.f11833OooO0O0, this.f11834OooO0OO);
    }
}
