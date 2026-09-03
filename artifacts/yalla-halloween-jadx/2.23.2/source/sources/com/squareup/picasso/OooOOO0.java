package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo000o f21264OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO f21265OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final WeakReference<ImageView> f21266OooO0o0;

    public OooOOO0(oo000o oo000oVar, ImageView imageView, OooO oooO) {
        this.f21264OooO0Oo = oo000oVar;
        this.f21266OooO0o0 = new WeakReference<>(imageView);
        this.f21265OooO0o = oooO;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ImageView imageView = this.f21266OooO0o0.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            oo000o oo000oVar = this.f21264OooO0Oo;
            oo000oVar.f21379OooO0OO = false;
            oo000oVar.f21378OooO0O0.OooO00o(width, height);
            oo000oVar.OooO0O0(imageView, this.f21265OooO0o);
        }
        return true;
    }
}
