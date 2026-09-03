package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO00OO0O;
import p101o000oOoo.ooOOOOoo;

/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends Transition {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final String[] f9463o0OoOo0 = {"android:clipBounds:clip"};

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f9464Oooo0o;

        public OooO00o(View view) {
            this.f9464Oooo0o = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f9464Oooo0o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOO0.OooO0OO(view, null);
        }
    }

    public ChangeClipBounds() {
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (oo00o0o != null && oo00o0o2 != null && oo00o0o.f29742OooO00o.containsKey("android:clipBounds:clip") && oo00o0o2.f29742OooO00o.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) oo00o0o.f29742OooO00o.get("android:clipBounds:clip");
            Rect rect2 = (Rect) oo00o0o2.f29742OooO00o.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) oo00o0o.f29742OooO00o.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) oo00o0o2.f29742OooO00o.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            View view = oo00o0o2.f29743OooO0O0;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOO0.OooO0OO(view, rect);
            objectAnimatorOfObject = ObjectAnimator.ofObject(oo00o0o2.f29743OooO0O0, (Property<View, V>) oO00OO0O.f29750OooO0OO, (TypeEvaluator) new ooOOOOoo(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimatorOfObject.addListener(new OooO00o(oo00o0o2.f29743OooO0O0));
            }
        }
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOo00() {
        return f9463o0OoOo0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(oO00O0o oo00o0o) {
        View view = oo00o0o.f29743OooO0O0;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        Rect rectOooO00o = ViewCompat.OooOO0.OooO00o(view);
        oo00o0o.f29742OooO00o.put("android:clipBounds:clip", rectOooO00o);
        if (rectOooO00o == null) {
            oo00o0o.f29742OooO00o.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
