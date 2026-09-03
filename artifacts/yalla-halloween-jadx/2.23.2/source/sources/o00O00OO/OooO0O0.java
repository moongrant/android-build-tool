package o00O00OO;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f36038OooO00o;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f36038OooO00o = oooO0OO;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f36038OooO00o.OooO00o(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f36038OooO00o.OooO0O0(drawable);
    }
}
