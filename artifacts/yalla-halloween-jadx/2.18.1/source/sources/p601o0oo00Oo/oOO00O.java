package p601o0oo00Oo;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f48260OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f48261OooO0O0 = R.drawable.bg_lucky_gift;

    public oOO00O(ImageView imageView) {
        this.f48260OooO00o = imageView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f48260OooO00o.setImageResource(this.f48261OooO0O0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(200);
        this.f48260OooO00o.startAnimation(alphaAnimation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
