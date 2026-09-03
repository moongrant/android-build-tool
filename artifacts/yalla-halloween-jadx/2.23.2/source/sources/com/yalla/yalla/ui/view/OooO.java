package com.yalla.yalla.ui.view;

import android.view.animation.Animation;
import android.widget.ImageView;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f29965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SwitchView.OooO00o f29966OooO0O0;

    public OooO(ImageView imageView, SwitchView.OooO00o oooO00o) {
        this.f29965OooO00o = imageView;
        this.f29966OooO0O0 = oooO00o;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@Nullable Animation animation) {
        SwitchView.OooO00o oooO00o = this.f29966OooO0O0;
        int height = oooO00o.f30206OooO0O0.getHeight();
        ImageView imageView = this.f29965OooO00o;
        oo0oOO0.OooO0O0(imageView, height);
        oo0oOO0.OooO0OO(imageView, oooO00o.f30206OooO0O0.getWidth());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@Nullable Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@Nullable Animation animation) {
    }
}
