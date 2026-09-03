package com.airbnb.lottie;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Callable<o0OoOo0<OooOO0O>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f10038OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f10039OooO0O0;

    public OooOO0(LottieAnimationView lottieAnimationView, String str) {
        this.f10039OooO0O0 = lottieAnimationView;
        this.f10038OooO00o = str;
    }

    @Override // java.util.concurrent.Callable
    public final o0OoOo0<OooOO0O> call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f10039OooO0O0;
        if (!lottieAnimationView.f9966Ooooo0o) {
            return OooOOO0.OooO0Oo(lottieAnimationView.getContext(), this.f10038OooO00o, null);
        }
        Context context = lottieAnimationView.getContext();
        String str = this.f10038OooO00o;
        Map<String, o00Oo0<OooOO0O>> map = OooOOO0.f10057OooO00o;
        return OooOOO0.OooO0Oo(context, str, "asset_" + str);
    }
}
