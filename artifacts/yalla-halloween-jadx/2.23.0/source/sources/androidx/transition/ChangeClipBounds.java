package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.HashMap;
import java.util.WeakHashMap;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String[] f8111OooOoo0 = {"android:clipBounds:clip"};

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f8112OooO0Oo;

        public OooO00o(View view) {
            this.f8112OooO0Oo = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOO0.OooO0OO(this.f8112OooO0Oo, null);
        }
    }

    public ChangeClipBounds() {
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
        if (o00000o1 != null && o00000o2 != null) {
            HashMap map = o00000o1.f34936OooO00o;
            if (map.containsKey("android:clipBounds:clip")) {
                HashMap map2 = o00000o2.f34936OooO00o;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
                    boolean z = rect2 == null;
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    if (rect == null) {
                        rect = (Rect) map.get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
                        rect2 = (Rect) map2.get("android:clipBounds:bounds");
                    }
                    if (rect.equals(rect2)) {
                        return null;
                    }
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    View view = o00000o2.f34937OooO0O0;
                    ViewCompat.OooOO0.OooO0OO(view, rect);
                    ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, o0000O00.f34941OooO0OO, new o0Oo0oo(new Rect()), rect, rect2);
                    if (z) {
                        objectAnimatorOfObject.addListener(new OooO00o(view));
                    }
                    return objectAnimatorOfObject;
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOOoo() {
        return f8111OooOoo0;
    }

    public final void Oooo0o0(o00000O0 o00000o1) {
        View view = o00000o1.f34937OooO0O0;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        Rect rectOooO00o = ViewCompat.OooOO0.OooO00o(view);
        HashMap map = o00000o1.f34936OooO00o;
        map.put("android:clipBounds:clip", rectOooO00o);
        if (rectOooO00o == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
