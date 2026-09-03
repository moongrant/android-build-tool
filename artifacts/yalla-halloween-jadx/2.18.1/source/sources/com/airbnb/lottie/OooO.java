package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Callable<o0OoOo0<OooOO0O>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f10032OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f10033OooO0O0;

    public OooO(LottieAnimationView lottieAnimationView, int i) {
        this.f10033OooO0O0 = lottieAnimationView;
        this.f10032OooO00o = i;
    }

    @Override // java.util.concurrent.Callable
    public final o0OoOo0<OooOO0O> call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f10033OooO0O0;
        if (!lottieAnimationView.f9966Ooooo0o) {
            return OooOOO0.OooO0oo(lottieAnimationView.getContext(), this.f10032OooO00o, null);
        }
        Context context = lottieAnimationView.getContext();
        int i = this.f10032OooO00o;
        return OooOOO0.OooO0oo(context, i, OooOOO0.OooOOO0(context, i));
    }
}
