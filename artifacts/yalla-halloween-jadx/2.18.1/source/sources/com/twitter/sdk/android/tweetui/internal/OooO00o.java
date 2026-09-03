package com.twitter.sdk.android.tweetui.internal;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.twitter.sdk.android.tweetui.internal.OooO00o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f20163Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f20164Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f20165Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f20166Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20167OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f20168OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public InterfaceC0183OooO00o f20169OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f20170OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f20171OoooOO0;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetui.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0183OooO00o {
        void OooO00o();

        void onDismiss();
    }

    public interface OooO0O0 {
        boolean OooO00o();
    }

    public OooO00o(InterfaceC0183OooO00o interfaceC0183OooO00o, int i, float f) {
        this.f20169OoooO00 = interfaceC0183OooO00o;
        this.f20164Oooo0o = i;
        this.f20166Oooo0oo = f;
        this.f20163Oooo = 0.2f * f;
    }

    public static OooO00o OooO00o(View view, InterfaceC0183OooO00o interfaceC0183OooO00o) {
        return new OooO00o(interfaceC0183OooO00o, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), view.getContext().getResources().getDisplayMetrics().heightPixels * 0.5f);
    }

    public final void OooO0O0(View view) {
        if (view.getTranslationY() != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(100L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOOo.o000O000
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OooO00o oooO00o = this.f40108Oooo0o;
                    Objects.requireNonNull(oooO00o);
                    ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    OooO00o.InterfaceC0183OooO00o interfaceC0183OooO00o = oooO00o.f20169OoooO00;
                    if (interfaceC0183OooO00o != null) {
                        interfaceC0183OooO00o.OooO00o();
                    }
                }
            });
            duration.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        float fPow;
        float f;
        float f2;
        InterfaceC0183OooO00o interfaceC0183OooO00o;
        if (!(view instanceof OooO0O0) || ((OooO0O0) view).OooO00o() || this.f20171OoooOO0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float f3 = rawY - this.f20165Oooo0oO;
                        float f4 = rawX - this.f20168OoooO0;
                        float f5 = rawY - this.f20170OoooO0O;
                        this.f20168OoooO0 = rawX;
                        this.f20170OoooO0O = rawY;
                        if (this.f20167OoooO >= 0 && motionEvent.getPointerCount() == 1) {
                            if (this.f20171OoooOO0) {
                                this.f20171OoooOO0 = true;
                                float translationY = view.getTranslationY();
                                fPow = translationY + ((float) ((1.0d - (Math.pow(Math.abs(translationY), 2.0d) / Math.pow(this.f20163Oooo * 2.0f, 2.0d))) * ((double) f5)));
                                f = this.f20166Oooo0oo;
                                f2 = -f;
                                if (fPow < f2) {
                                    fPow = f2;
                                } else if (fPow > f) {
                                    fPow = f;
                                }
                                view.setTranslationY(fPow);
                                interfaceC0183OooO00o = this.f20169OoooO00;
                                if (interfaceC0183OooO00o != null) {
                                    interfaceC0183OooO00o.OooO00o();
                                }
                            } else {
                                if (Math.abs(f3) > ((float) this.f20164Oooo0o)) {
                                    if (Math.abs(f5) > Math.abs(f4)) {
                                        this.f20171OoooOO0 = true;
                                        float translationY2 = view.getTranslationY();
                                        fPow = translationY2 + ((float) ((1.0d - (Math.pow(Math.abs(translationY2), 2.0d) / Math.pow(this.f20163Oooo * 2.0f, 2.0d))) * ((double) f5)));
                                        f = this.f20166Oooo0oo;
                                        f2 = -f;
                                        if (fPow < f2) {
                                            fPow = f2;
                                        } else if (fPow > f) {
                                            fPow = f;
                                        }
                                        view.setTranslationY(fPow);
                                        interfaceC0183OooO00o = this.f20169OoooO00;
                                        if (interfaceC0183OooO00o != null) {
                                            interfaceC0183OooO00o.OooO00o();
                                        }
                                    }
                                }
                            }
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            OooO0O0(view);
                            this.f20171OoooOO0 = false;
                            this.f20167OoooO = -1;
                        }
                    }
                }
                if ((this.f20167OoooO >= 0 && motionEvent.getPointerCount() == 1) && this.f20171OoooOO0) {
                    float translationY3 = view.getTranslationY();
                    float f6 = this.f20163Oooo;
                    if (translationY3 > f6 || translationY3 < (-f6)) {
                        InterfaceC0183OooO00o interfaceC0183OooO00o2 = this.f20169OoooO00;
                        if (interfaceC0183OooO00o2 != null) {
                            interfaceC0183OooO00o2.onDismiss();
                        }
                        z = true;
                    } else {
                        OooO0O0(view);
                        z = false;
                    }
                } else {
                    z = false;
                }
                this.f20171OoooOO0 = false;
            } else {
                this.f20168OoooO0 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                this.f20170OoooO0O = rawY2;
                this.f20165Oooo0oO = rawY2;
                this.f20171OoooOO0 = false;
                this.f20167OoooO = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            }
            z = false;
        } else {
            z = false;
        }
        return z || view.onTouchEvent(motionEvent);
    }
}
