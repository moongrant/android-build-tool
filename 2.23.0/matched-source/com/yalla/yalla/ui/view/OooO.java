package com.yalla.yalla.ui.view;

import android.view.animation.Animation;
import android.widget.ImageView;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o000O0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f30510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SwitchView.OooO00o f30511OooO0O0;

    public OooO(ImageView imageView, SwitchView.OooO00o oooO00o) {
        this.f30510OooO00o = imageView;
        this.f30511OooO0O0 = oooO00o;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@Nullable Animation animation) {
        SwitchView.OooO00o oooO00o = this.f30511OooO0O0;
        int height = oooO00o.f30751OooO0O0.getHeight();
        ImageView imageView = this.f30510OooO00o;
        o000O0Oo.OooO0O0(imageView, height);
        o000O0Oo.OooO0OO(imageView, oooO00o.f30751OooO0O0.getWidth());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@Nullable Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@Nullable Animation animation) {
    }
}
