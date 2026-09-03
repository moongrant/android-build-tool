package p184o00o000o;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f33033OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f33034OooO0O0 = R.drawable.bg_lucky_gift;

    public Oooo000(ImageView imageView) {
        this.f33033OooO00o = imageView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f33033OooO00o.setImageResource(this.f33034OooO0O0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(200L);
        this.f33033OooO00o.startAnimation(alphaAnimation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
