package p539o0o0OoOO;

import android.view.animation.Animation;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes5.dex */
public final class q3 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f55653OooO00o;

    public q3(VerifyCodeView verifyCodeView) {
        this.f55653OooO00o = verifyCodeView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        VerifyCodeView verifyCodeView = this.f55653OooO00o;
        if (verifyCodeView.f30826OooOOO0 != 0) {
            for (int i = 0; i < verifyCodeView.getChildCount(); i++) {
                verifyCodeView.getChildAt(i).setBackgroundDrawable(verifyCodeView.f30824OooOO0O);
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
