package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WeakReference f11838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f11839OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f11840OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f11841OooO0Oo;

    public OooOOOO(WeakReference weakReference, Context context, int i, String str) {
        this.f11838OooO00o = weakReference;
        this.f11839OooO0O0 = context;
        this.f11840OooO0OO = i;
        this.f11841OooO0Oo = str;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        Context context = (Context) this.f11838OooO00o.get();
        if (context == null) {
            context = this.f11839OooO0O0;
        }
        return OooOO0O.OooO0o(this.f11840OooO0OO, context, this.f11841OooO0Oo);
    }
}
