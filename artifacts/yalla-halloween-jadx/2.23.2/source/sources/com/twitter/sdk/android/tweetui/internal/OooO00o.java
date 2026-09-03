package com.twitter.sdk.android.tweetui.internal;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.twitter.sdk.android.tweetui.internal.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f21885OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f21886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f21887OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f21888OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f21889OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public InterfaceC0282OooO00o f21890OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f21891OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21892OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f21893OooOO0o;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetui.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0282OooO00o {
        void OooO00o();

        void onDismiss();
    }

    public interface OooO0O0 {
        boolean OooO00o();
    }

    public OooO00o(InterfaceC0282OooO00o interfaceC0282OooO00o, int i, float f) {
        this.f21890OooO0oo = interfaceC0282OooO00o;
        this.f21886OooO0Oo = i;
        this.f21887OooO0o = f;
        this.f21889OooO0oO = 0.2f * f;
    }

    public static OooO00o OooO00o(View view, InterfaceC0282OooO00o interfaceC0282OooO00o) {
        return new OooO00o(interfaceC0282OooO00o, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), view.getContext().getResources().getDisplayMetrics().heightPixels * 0.5f);
    }

    public final void OooO0O0(View view) {
        if (view.getTranslationY() != 0.0f) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f).setDuration(100L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OOOo00.OooOOOO
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OooO00o oooO00o = this.f42894OooO0Oo;
                    oooO00o.getClass();
                    ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    OooO00o.InterfaceC0282OooO00o interfaceC0282OooO00o = oooO00o.f21890OooO0oo;
                    if (interfaceC0282OooO00o != null) {
                        interfaceC0282OooO00o.OooO00o();
                    }
                }
            });
            duration.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        float fPow;
        float f;
        float f2;
        InterfaceC0282OooO00o interfaceC0282OooO00o;
        if (!(view instanceof OooO0O0) || ((OooO0O0) view).OooO00o() || this.f21893OooOO0o) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                float f3 = this.f21889OooO0oO;
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float f4 = rawY - this.f21888OooO0o0;
                        float f5 = rawX - this.f21885OooO;
                        float f6 = rawY - this.f21891OooOO0;
                        this.f21885OooO = rawX;
                        this.f21891OooOO0 = rawY;
                        if (this.f21892OooOO0O >= 0 && motionEvent.getPointerCount() == 1) {
                            if (this.f21893OooOO0o) {
                                this.f21893OooOO0o = true;
                                float translationY = view.getTranslationY();
                                fPow = translationY + ((float) ((1.0d - (Math.pow(Math.abs(translationY), 2.0d) / Math.pow(f3 * 2.0f, 2.0d))) * ((double) f6)));
                                f = this.f21887OooO0o;
                                f2 = -f;
                                if (fPow < f2) {
                                    fPow = f2;
                                } else if (fPow > f) {
                                    fPow = f;
                                }
                                view.setTranslationY(fPow);
                                interfaceC0282OooO00o = this.f21890OooO0oo;
                                if (interfaceC0282OooO00o != null) {
                                    interfaceC0282OooO00o.OooO00o();
                                }
                            } else {
                                if (Math.abs(f4) > ((float) this.f21886OooO0Oo)) {
                                    if (Math.abs(f6) > Math.abs(f5)) {
                                        this.f21893OooOO0o = true;
                                        float translationY2 = view.getTranslationY();
                                        fPow = translationY2 + ((float) ((1.0d - (Math.pow(Math.abs(translationY2), 2.0d) / Math.pow(f3 * 2.0f, 2.0d))) * ((double) f6)));
                                        f = this.f21887OooO0o;
                                        f2 = -f;
                                        if (fPow < f2) {
                                            fPow = f2;
                                        } else if (fPow > f) {
                                            fPow = f;
                                        }
                                        view.setTranslationY(fPow);
                                        interfaceC0282OooO00o = this.f21890OooO0oo;
                                        if (interfaceC0282OooO00o != null) {
                                            interfaceC0282OooO00o.OooO00o();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            OooO0O0(view);
                            this.f21893OooOO0o = false;
                            this.f21892OooOO0O = -1;
                        }
                    }
                }
                if ((this.f21892OooOO0O >= 0 && motionEvent.getPointerCount() == 1) && this.f21893OooOO0o) {
                    float translationY3 = view.getTranslationY();
                    if (translationY3 > f3 || translationY3 < (-f3)) {
                        InterfaceC0282OooO00o interfaceC0282OooO00o2 = this.f21890OooO0oo;
                        if (interfaceC0282OooO00o2 != null) {
                            interfaceC0282OooO00o2.onDismiss();
                        }
                        z = true;
                    } else {
                        OooO0O0(view);
                        z = false;
                    }
                } else {
                    z = false;
                }
                this.f21893OooOO0o = false;
            } else {
                this.f21885OooO = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                this.f21891OooOO0 = rawY2;
                this.f21888OooO0o0 = rawY2;
                this.f21893OooOO0o = false;
                this.f21892OooOO0O = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            }
            z = false;
        } else {
            z = false;
        }
        return z || view.onTouchEvent(motionEvent);
    }
}
