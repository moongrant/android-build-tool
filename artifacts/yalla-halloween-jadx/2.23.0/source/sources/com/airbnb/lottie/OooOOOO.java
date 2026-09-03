package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WeakReference f8748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f8749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f8750OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f8751OooO0Oo;

    public OooOOOO(WeakReference weakReference, Context context, int i, String str) {
        this.f8748OooO00o = weakReference;
        this.f8749OooO0O0 = context;
        this.f8750OooO0OO = i;
        this.f8751OooO0Oo = str;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        Context context = (Context) this.f8748OooO00o.get();
        if (context == null) {
            context = this.f8749OooO0O0;
        }
        return OooOO0O.OooO0o(this.f8750OooO0OO, context, this.f8751OooO0Oo);
    }
}
