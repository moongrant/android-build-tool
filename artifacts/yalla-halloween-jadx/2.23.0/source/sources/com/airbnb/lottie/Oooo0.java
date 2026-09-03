package com.airbnb.lottie;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements LottieDrawable.Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f8756OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f8757OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f8758OooO0OO;

    public Oooo0(LottieDrawable lottieDrawable, int i, int i2) {
        this.f8758OooO0OO = lottieDrawable;
        this.f8756OooO00o = i;
        this.f8757OooO0O0 = i2;
    }

    @Override // com.airbnb.lottie.LottieDrawable.Oooo0
    public final void run() {
        LottieDrawable lottieDrawable = this.f8758OooO0OO;
        OooOO0 oooOO1 = lottieDrawable.f8673OooO0o0;
        int i = this.f8756OooO00o;
        int i2 = this.f8757OooO0O0;
        if (oooOO1 == null) {
            lottieDrawable.f8677OooOO0O.add(new Oooo0(lottieDrawable, i, i2));
        } else {
            lottieDrawable.f8672OooO0o.OooOO0(i, i2 + 0.99f);
        }
    }
}
