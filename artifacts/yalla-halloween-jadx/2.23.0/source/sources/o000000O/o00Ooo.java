package o000000O;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements Interpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ p413o0Oo0oo.Oooo0 f33895OooO00o;

    public o00Ooo(p413o0Oo0oo.Oooo0 oooo0) {
        this.f33895OooO00o = oooo0;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f33895OooO00o.OooO00o(f);
    }
}
