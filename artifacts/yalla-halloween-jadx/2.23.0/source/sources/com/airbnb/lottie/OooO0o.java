package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f8720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f8721OooO0O0;

    public OooO0o(LottieAnimationView lottieAnimationView, int i) {
        this.f8721OooO0O0 = lottieAnimationView;
        this.f8720OooO00o = i;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f8721OooO0O0;
        boolean z = lottieAnimationView.f8655OooOOo0;
        int i = this.f8720OooO00o;
        if (!z) {
            return OooOO0O.OooO0o(i, lottieAnimationView.getContext(), null);
        }
        Context context = lottieAnimationView.getContext();
        return OooOO0O.OooO0o(i, context, OooOO0O.OooO(i, context));
    }
}
