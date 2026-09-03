package com.yalla.yalla.ui.view;

import android.view.animation.Animation;
import android.widget.ImageView;
import org.jetbrains.annotations.Nullable;
import p425o0OoO0OO.o00O0OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageView f29975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SwitchView.OooO00o f29976OooO0O0;

    public OooO(ImageView imageView, SwitchView.OooO00o oooO00o) {
        this.f29975OooO00o = imageView;
        this.f29976OooO0O0 = oooO00o;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@Nullable Animation animation) {
        SwitchView.OooO00o oooO00o = this.f29976OooO0O0;
        int height = oooO00o.f30216OooO0O0.getHeight();
        ImageView imageView = this.f29975OooO00o;
        o00O0OOO.OooO0O0(imageView, height);
        o00O0OOO.OooO0OO(imageView, oooO00o.f30216OooO0O0.getWidth());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@Nullable Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@Nullable Animation animation) {
    }
}
