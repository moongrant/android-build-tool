package com.airbnb.lottie;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f8714OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f8715OooO0O0;

    public OooO(LottieAnimationView lottieAnimationView, String str) {
        this.f8715OooO0O0 = lottieAnimationView;
        this.f8714OooO00o = str;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f8715OooO0O0;
        boolean z = lottieAnimationView.f8655OooOOo0;
        String str = this.f8714OooO00o;
        if (!z) {
            return OooOO0O.OooO0O0(lottieAnimationView.getContext(), str, null);
        }
        Context context = lottieAnimationView.getContext();
        HashMap map = OooOO0O.f8737OooO00o;
        return OooOO0O.OooO0O0(context, str, "asset_" + str);
    }
}
