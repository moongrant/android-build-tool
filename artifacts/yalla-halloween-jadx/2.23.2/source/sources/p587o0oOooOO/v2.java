package p587o0oOooOO;

import android.view.animation.Animation;
import com.yalla.yalla.ui.view.VerifyCodeView;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VerifyCodeView f57000OooO00o;

    public v2(VerifyCodeView verifyCodeView) {
        this.f57000OooO00o = verifyCodeView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        VerifyCodeView verifyCodeView = this.f57000OooO00o;
        if (verifyCodeView.f30281OooOOO0 != 0) {
            for (int i = 0; i < verifyCodeView.getChildCount(); i++) {
                verifyCodeView.getChildAt(i).setBackgroundDrawable(verifyCodeView.f30279OooOO0O);
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
