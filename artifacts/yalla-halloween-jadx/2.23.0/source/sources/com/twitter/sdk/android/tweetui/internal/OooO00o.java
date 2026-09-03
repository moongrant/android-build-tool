package com.twitter.sdk.android.tweetui.internal;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.twitter.sdk.android.tweetui.internal.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f22359OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f22360OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f22361OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f22362OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f22363OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public InterfaceC0283OooO00o f22364OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f22365OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22366OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f22367OooOO0o;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetui.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0283OooO00o {
        void OooO00o();

        void onDismiss();
    }

    public interface OooO0O0 {
        boolean OooO00o();
    }

    public OooO00o(InterfaceC0283OooO00o interfaceC0283OooO00o, int i, float f) {
        this.f22364OooO0oo = interfaceC0283OooO00o;
        this.f22360OooO0Oo = i;
        this.f22361OooO0o = f;
        this.f22363OooO0oO = 0.2f * f;
    }

    public static OooO00o OooO00o(View view, InterfaceC0283OooO00o interfaceC0283OooO00o) {
        return new OooO00o(interfaceC0283OooO00o, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), view.getContext().getResources().getDisplayMetrics().heightPixels * 0.5f);
    }

    public final void OooO0O0(View view) {
        if (view.getTranslationY() != 0.0f) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f).setDuration(100L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OOOOoo.oo000o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OooO00o oooO00o = this.f43685OooO0Oo;
                    oooO00o.getClass();
                    ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    OooO00o.InterfaceC0283OooO00o interfaceC0283OooO00o = oooO00o.f22364OooO0oo;
                    if (interfaceC0283OooO00o != null) {
                        interfaceC0283OooO00o.OooO00o();
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
        InterfaceC0283OooO00o interfaceC0283OooO00o;
        if (!(view instanceof OooO0O0) || ((OooO0O0) view).OooO00o() || this.f22367OooOO0o) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                float f3 = this.f22363OooO0oO;
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float f4 = rawY - this.f22362OooO0o0;
                        float f5 = rawX - this.f22359OooO;
                        float f6 = rawY - this.f22365OooOO0;
                        this.f22359OooO = rawX;
                        this.f22365OooOO0 = rawY;
                        if (this.f22366OooOO0O >= 0 && motionEvent.getPointerCount() == 1) {
                            if (this.f22367OooOO0o) {
                                this.f22367OooOO0o = true;
                                float translationY = view.getTranslationY();
                                fPow = translationY + ((float) ((1.0d - (Math.pow(Math.abs(translationY), 2.0d) / Math.pow(f3 * 2.0f, 2.0d))) * ((double) f6)));
                                f = this.f22361OooO0o;
                                f2 = -f;
                                if (fPow < f2) {
                                    fPow = f2;
                                } else if (fPow > f) {
                                    fPow = f;
                                }
                                view.setTranslationY(fPow);
                                interfaceC0283OooO00o = this.f22364OooO0oo;
                                if (interfaceC0283OooO00o != null) {
                                    interfaceC0283OooO00o.OooO00o();
                                }
                            } else {
                                if (Math.abs(f4) > ((float) this.f22360OooO0Oo)) {
                                    if (Math.abs(f6) > Math.abs(f5)) {
                                        this.f22367OooOO0o = true;
                                        float translationY2 = view.getTranslationY();
                                        fPow = translationY2 + ((float) ((1.0d - (Math.pow(Math.abs(translationY2), 2.0d) / Math.pow(f3 * 2.0f, 2.0d))) * ((double) f6)));
                                        f = this.f22361OooO0o;
                                        f2 = -f;
                                        if (fPow < f2) {
                                            fPow = f2;
                                        } else if (fPow > f) {
                                            fPow = f;
                                        }
                                        view.setTranslationY(fPow);
                                        interfaceC0283OooO00o = this.f22364OooO0oo;
                                        if (interfaceC0283OooO00o != null) {
                                            interfaceC0283OooO00o.OooO00o();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            OooO0O0(view);
                            this.f22367OooOO0o = false;
                            this.f22366OooOO0O = -1;
                        }
                    }
                }
                if ((this.f22366OooOO0O >= 0 && motionEvent.getPointerCount() == 1) && this.f22367OooOO0o) {
                    float translationY3 = view.getTranslationY();
                    if (translationY3 > f3 || translationY3 < (-f3)) {
                        InterfaceC0283OooO00o interfaceC0283OooO00o2 = this.f22364OooO0oo;
                        if (interfaceC0283OooO00o2 != null) {
                            interfaceC0283OooO00o2.onDismiss();
                        }
                        z = true;
                    } else {
                        OooO0O0(view);
                        z = false;
                    }
                } else {
                    z = false;
                }
                this.f22367OooOO0o = false;
            } else {
                this.f22359OooO = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                this.f22365OooOO0 = rawY2;
                this.f22362OooO0o0 = rawY2;
                this.f22367OooOO0o = false;
                this.f22366OooOO0O = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            }
            z = false;
        } else {
            z = false;
        }
        return z || view.onTouchEvent(motionEvent);
    }
}
