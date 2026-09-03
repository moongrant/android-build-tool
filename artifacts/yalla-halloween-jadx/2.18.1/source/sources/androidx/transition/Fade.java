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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p081o000OoO.o00oO0o;
import p101o000oOoo.oO000Oo;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00OO0O;

/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility {

    public class OooO00o extends OooO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f9495Oooo0o;

        public OooO00o(View view) {
            this.f9495Oooo0o = view;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            oO00OO0O.OooO0OO(this.f9495Oooo0o, 1.0f);
            Objects.requireNonNull(oO00OO0O.f29748OooO00o);
            transition.OooOoO(this);
        }
    }

    public static class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final View f9496Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f9497Oooo0oO = false;

        public OooO0O0(View view) {
            this.f9496Oooo0o = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oO00OO0O.OooO0OO(this.f9496Oooo0o, 1.0f);
            if (this.f9497Oooo0oO) {
                this.f9496Oooo0o.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f9496Oooo0o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO0o.OooO0oo(view) && this.f9496Oooo0o.getLayerType() == 0) {
                this.f9497Oooo0oO = true;
                this.f9496Oooo0o.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        Oooo(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
        oo00o0o.f29742OooO00o.put("android:fade:transitionAlpha", Float.valueOf(oO00OO0O.OooO00o(oo00o0o.f29743OooO0O0)));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oO(ViewGroup viewGroup, View view, oO00O0o oo00o0o, oO00O0o oo00o0o2) {
        Float f;
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fFloatValue = (oo00o0o == null || (f = (Float) oo00o0o.f29742OooO00o.get("android:fade:transitionAlpha")) == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f.floatValue();
        if (fFloatValue != 1.0f) {
            f2 = fFloatValue;
        }
        return OoooO00(view, f2, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Visibility
    @Nullable
    public final Animator Oooo0oo(ViewGroup viewGroup, View view, oO00O0o oo00o0o) {
        Float f;
        Objects.requireNonNull(oO00OO0O.f29748OooO00o);
        return OoooO00(view, (oo00o0o == null || (f = (Float) oo00o0o.f29742OooO00o.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    public final Animator OoooO00(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        oO00OO0O.OooO0OO(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, oO00OO0O.f29749OooO0O0, f2);
        objectAnimatorOfFloat.addListener(new OooO0O0(view));
        OooO0OO(new OooO00o(view));
        return objectAnimatorOfFloat;
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oO000Oo.f29734OooO0Oo);
        Oooo(o00oO0o.OooO0o(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f9592o0OoOo0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
