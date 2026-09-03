package p060o0000o;

import android.view.animation.Interpolator;
import p057o0000Oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements Interpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000O f27760OooO00o;

    public o00O0O(o000000O o000000o2) {
        this.f27760OooO00o = o000000o2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f27760OooO00o.OooO00o(f);
    }
}
