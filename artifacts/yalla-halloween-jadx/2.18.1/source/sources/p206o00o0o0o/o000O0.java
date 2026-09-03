package p206o00o0o0o;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f33253Oooo0o;

    public o000O0(View view) {
        this.f33253Oooo0o = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f33253Oooo0o.setBackgroundColor(Color.parseColor(o000OO0O.OooO00o(((Float) valueAnimator.getAnimatedValue()).floatValue())));
    }
}
