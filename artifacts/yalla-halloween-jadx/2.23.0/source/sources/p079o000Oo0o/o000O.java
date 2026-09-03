package p079o000Oo0o;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f34987OooO00o;

    public o000O(o000OO00 o000oo01) {
        this.f34987OooO00o = o000oo01;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f34987OooO00o.OooO00o(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f34987OooO00o.OooO0O0(drawable);
    }
}
