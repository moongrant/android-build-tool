package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;
import p058o0000Ooo.oo000o;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public class Fade extends Visibility {

    public static class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f8143OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f8144OooO0o0 = false;

        public OooO00o(View view) {
            this.f8143OooO0Oo = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f8143OooO0Oo;
            o0000O00.OooO0O0(view, 1.0f);
            if (this.f8144OooO0o0) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            View view = this.f8143OooO0Oo;
            if (ViewCompat.OooO0o.OooO0oo(view) && view.getLayerType() == 0) {
                this.f8144OooO0o0 = true;
                view.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f8240OooOoo0 = i;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
        o00000o1.f34936OooO00o.put("android:fade:transitionAlpha", Float.valueOf(o0000O00.f34939OooO00o.OooO0O0(o00000o1.f34937OooO0O0)));
    }

    public final ObjectAnimator Oooo(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        o0000O00.OooO0O0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, o0000O00.f34940OooO0O0, f2);
        objectAnimatorOfFloat.addListener(new OooO00o(view));
        OooO0O0(new OooO0O0(view));
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, o00000O0 o00000o1, o00000O0 o00000o2) {
        Float f;
        float fFloatValue = (o00000o1 == null || (f = (Float) o00000o1.f34936OooO00o.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        return Oooo(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oo(ViewGroup viewGroup, View view, o00000O0 o00000o1) {
        Float f;
        o0000O00.f34939OooO00o.getClass();
        return Oooo(view, (o00000o1 == null || (f = (Float) o00000o1.f34936OooO00o.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0O00.f34978OooO0Oo);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f8240OooOoo0);
        if ((iOooO0o0 & (-4)) == 0) {
            this.f8240OooOoo0 = iOooO0o0;
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
