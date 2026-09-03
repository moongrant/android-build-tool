package p175o00OooOo;

import android.view.animation.Animation;
import com.app.base.view.VerifyCodeView;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOo000 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f32753OooO00o;

    public o0OOo000(VerifyCodeView verifyCodeView) {
        this.f32753OooO00o = verifyCodeView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f32753OooO00o.f12151o000oOoO != 0) {
            for (int i = 0; i < this.f32753OooO00o.getChildCount(); i++) {
                this.f32753OooO00o.getChildAt(i).setBackgroundDrawable(this.f32753OooO00o.f12146OoooO);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
