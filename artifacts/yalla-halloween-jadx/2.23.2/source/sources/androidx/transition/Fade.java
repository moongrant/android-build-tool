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
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import oOO00O.o00oO0o;
import oOO00O.o0OoOo0;
import oOO00O.oo0o0Oo;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class Fade extends Visibility {

    public static class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f11237OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f11238OooO0o0 = false;

        public OooO00o(View view) {
            this.f11237OooO0Oo = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f11237OooO0Oo;
            oo0o0Oo.OooO0O0(view, 1.0f);
            if (this.f11238OooO0o0) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            View view = this.f11237OooO0Oo;
            if (ViewCompat.OooO0o.OooO0oo(view) && view.getLayerType() == 0) {
                this.f11238OooO0o0 = true;
                view.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f11334OooOoo0 = i;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooO(@NonNull o00oO0o o00oo0o2) {
        Oooo0OO(o00oo0o2);
        o00oo0o2.f60157OooO00o.put("android:fade:transitionAlpha", Float.valueOf(oo0o0Oo.f60176OooO00o.OooO0O0(o00oo0o2.f60158OooO0O0)));
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0o(ViewGroup viewGroup, View view, o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        Float f;
        float fFloatValue = (o00oo0o2 == null || (f = (Float) o00oo0o2.f60157OooO00o.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        return Oooo0oo(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, o00oO0o o00oo0o2) {
        Float f;
        oo0o0Oo.f60176OooO00o.getClass();
        return Oooo0oo(view, (o00oo0o2 == null || (f = (Float) o00oo0o2.f60157OooO00o.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
    }

    public final ObjectAnimator Oooo0oo(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        oo0o0Oo.OooO0O0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, oo0o0Oo.f60177OooO0O0, f2);
        objectAnimatorOfFloat.addListener(new OooO00o(view));
        OooO0O0(new OooO0O0(view));
        return objectAnimatorOfFloat;
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OoOo0.f60167OooO0Oo);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f11334OooOoo0);
        if ((iOooO0o0 & (-4)) == 0) {
            this.f11334OooOoo0 = iOooO0o0;
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
