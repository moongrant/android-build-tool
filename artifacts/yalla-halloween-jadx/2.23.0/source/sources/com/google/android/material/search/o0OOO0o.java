package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.oo0o0Oo;
import java.util.WeakHashMap;
import p203o00o0o0o.o0O00OOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final EditText f17561OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SearchView f17562OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f17563OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f17564OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FrameLayout f17565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final MaterialToolbar f17566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final FrameLayout f17567OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Toolbar f17568OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextView f17569OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ImageButton f17570OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final View f17571OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TouchObserverFrameLayout f17572OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public SearchBar f17573OooOOO0;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f17574OooO0Oo;

        public OooO00o(boolean z) {
            this.f17574OooO0Oo = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.f17574OooO0Oo;
            float f = z ? 1.0f : 0.0f;
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0OOO0o.OooO00o(o0ooo0o2, f);
            if (z) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = o0ooo0o2.f17564OooO0OO;
                clippableRoundedCornerLayout.f17137OooO0Oo = null;
                clippableRoundedCornerLayout.invalidate();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0OOO0o.OooO00o(o0OOO0o.this, this.f17574OooO0Oo ? 0.0f : 1.0f);
        }
    }

    public o0OOO0o(SearchView searchView) {
        this.f17562OooO00o = searchView;
        this.f17563OooO0O0 = searchView.f17527OooO0Oo;
        this.f17564OooO0OO = searchView.f17529OooO0o0;
        this.f17565OooO0Oo = searchView.f17531OooO0oo;
        this.f17567OooO0o0 = searchView.f17526OooO;
        this.f17566OooO0o = searchView.f17532OooOO0;
        this.f17568OooO0oO = searchView.f17533OooOO0O;
        this.f17569OooO0oo = searchView.f17534OooOO0o;
        this.f17561OooO = searchView.f17536OooOOO0;
        this.f17570OooOO0 = searchView.f17535OooOOO;
        this.f17571OooOO0O = searchView.f17537OooOOOO;
        this.f17572OooOO0o = searchView.f17538OooOOOo;
    }

    public static void OooO00o(o0OOO0o o0ooo0o2, float f) {
        ActionMenuView actionMenuViewOooO00o;
        o0ooo0o2.f17570OooOO0.setAlpha(f);
        o0ooo0o2.f17571OooOO0O.setAlpha(f);
        o0ooo0o2.f17572OooOO0o.setAlpha(f);
        if (!o0ooo0o2.f17562OooO00o.f17542OooOo || (actionMenuViewOooO00o = com.google.android.material.internal.o0ooOOo.OooO00o(o0ooo0o2.f17566OooO0o)) == null) {
            return;
        }
        actionMenuViewOooO00o.setAlpha(f);
    }

    public final void OooO0O0(AnimatorSet animatorSet) {
        ImageButton imageButtonOooO0O0 = com.google.android.material.internal.o0ooOOo.OooO0O0(this.f17566OooO0o);
        if (imageButtonOooO0O0 == null) {
            return;
        }
        Drawable drawableOooO0Oo = p053o00000oo.o00Ooo.OooO0Oo(imageButtonOooO0O0.getDrawable());
        if (!this.f17562OooO00o.f17546OooOo0o) {
            if (drawableOooO0Oo instanceof DrawerArrowDrawable) {
                DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawableOooO0Oo;
                if (drawerArrowDrawable.f2495OooO != 1.0f) {
                    drawerArrowDrawable.f2495OooO = 1.0f;
                    drawerArrowDrawable.invalidateSelf();
                }
            }
            if (drawableOooO0Oo instanceof com.google.android.material.internal.OooO) {
                ((com.google.android.material.internal.OooO) drawableOooO0Oo).OooO00o(1.0f);
                return;
            }
            return;
        }
        if (drawableOooO0Oo instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable2 = (DrawerArrowDrawable) drawableOooO0Oo;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.o00O0O
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    DrawerArrowDrawable drawerArrowDrawable3 = drawerArrowDrawable2;
                    if (drawerArrowDrawable3.f2495OooO != animatedFraction) {
                        drawerArrowDrawable3.f2495OooO = animatedFraction;
                        drawerArrowDrawable3.invalidateSelf();
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableOooO0Oo instanceof com.google.android.material.internal.OooO) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new o0OoOo0((com.google.android.material.internal.OooO) drawableOooO0Oo, 0));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
    }

    public final AnimatorSet OooO0OO(boolean z) {
        int i;
        char c;
        int i2;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[10];
        Interpolator interpolator = z ? o0O000.OooO0O0.f41571OooO00o : o0O000.OooO0O0.f41572OooO0O0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, interpolator));
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.OooOOOO(new com.google.android.material.internal.OooOOO(), this.f17563OooO0O0));
        animatorArr[0] = valueAnimatorOfFloat;
        SearchView searchView = this.f17562OooO00o;
        Rect rect = new Rect(searchView.getLeft(), searchView.getTop() + 0, searchView.getRight(), searchView.getBottom() + 0);
        int[] iArr = new int[2];
        this.f17573OooOOO0.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f17564OooO0OO.getLocationOnScreen(iArr2);
        int i5 = i3 - iArr2[0];
        int i6 = i4 - iArr2[1];
        Rect rect2 = new Rect(i5, i6, this.f17573OooOOO0.getWidth() + i5, this.f17573OooOOO0.getHeight() + i6);
        final Rect rect3 = new Rect(rect2);
        final float cornerSize = this.f17573OooOOO0.getCornerSize();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.Oooo0(rect3), rect2, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.o00Oo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0OOO0o o0ooo0o2 = this.f17556OooO0Oo;
                o0ooo0o2.getClass();
                float animatedFraction = (1.0f - valueAnimator.getAnimatedFraction()) * cornerSize;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = o0ooo0o2.f17564OooO0OO;
                clippableRoundedCornerLayout.getClass();
                Rect rect4 = rect3;
                RectF rectF = new RectF(rect4.left, rect4.top, rect4.right, rect4.bottom);
                if (clippableRoundedCornerLayout.f17137OooO0Oo == null) {
                    clippableRoundedCornerLayout.f17137OooO0Oo = new Path();
                }
                clippableRoundedCornerLayout.f17137OooO0Oo.reset();
                clippableRoundedCornerLayout.f17137OooO0Oo.addRoundRect(rectF, animatedFraction, animatedFraction, Path.Direction.CW);
                clippableRoundedCornerLayout.f17137OooO0Oo.close();
                clippableRoundedCornerLayout.invalidate();
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        p064o0000oO0.OooOO0 oooOO1 = o0O000.OooO0O0.f41572OooO0O0;
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        animatorArr[1] = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z ? 250L : 0L);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
        valueAnimatorOfFloat2.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new com.google.android.material.internal.OooOOOO(new com.google.android.material.internal.OooOOO(), this.f17570OooOO0));
        animatorArr[2] = valueAnimatorOfFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, linearInterpolator));
        View view = this.f17571OooOO0O;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f17572OooOO0o;
        valueAnimatorOfFloat3.addUpdateListener(new com.google.android.material.internal.OooOOOO(new com.google.android.material.internal.OooOOO(), view, touchObserverFrameLayout));
        animatorArr2[0] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        valueAnimatorOfFloat4.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(view));
        animatorArr2[1] = valueAnimatorOfFloat4;
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        valueAnimatorOfFloat5.addUpdateListener(new com.google.android.material.internal.OooOOOO(new com.app.base.protobuf.OooO00o(), touchObserverFrameLayout));
        animatorArr2[2] = valueAnimatorOfFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f17566OooO0o;
        View viewOooO0O0 = com.google.android.material.internal.o0ooOOo.OooO0O0(materialToolbar);
        if (viewOooO0O0 == null) {
            i = 2;
            c = 0;
            i2 = 1;
        } else {
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(OooO0o0(viewOooO0O0), 0.0f);
            valueAnimatorOfFloat6.addUpdateListener(new com.google.android.material.internal.OooOOOO(new o0O00OOO(), viewOooO0O0));
            i = 2;
            c = 0;
            i2 = 1;
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(OooO0o(), 0.0f);
            valueAnimatorOfFloat7.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(viewOooO0O0));
            animatorSet3.playTogether(valueAnimatorOfFloat6, valueAnimatorOfFloat7);
        }
        OooO0O0(animatorSet3);
        View viewOooO00o = com.google.android.material.internal.o0ooOOo.OooO00o(materialToolbar);
        if (viewOooO00o != null) {
            float[] fArr = new float[i];
            fArr[c] = OooO0Oo(viewOooO00o);
            fArr[i2] = 0.0f;
            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(fArr);
            View[] viewArr = new View[i2];
            viewArr[c] = viewOooO00o;
            valueAnimatorOfFloat8.addUpdateListener(new com.google.android.material.internal.OooOOOO(new o0O00OOO(), viewArr));
            ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(OooO0o(), 0.0f);
            valueAnimatorOfFloat9.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(viewOooO00o));
            animatorSet3.playTogether(valueAnimatorOfFloat8, valueAnimatorOfFloat9);
        }
        animatorSet3.setDuration(z ? 300L : 250L);
        animatorSet3.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        animatorArr[4] = animatorSet3;
        animatorArr[5] = OooO0oo(this.f17565OooO0Oo, z, false);
        Toolbar toolbar = this.f17568OooO0oO;
        animatorArr[6] = OooO0oo(toolbar, z, false);
        ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat10.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat10.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        if (searchView.f17542OooOo) {
            valueAnimatorOfFloat10.addUpdateListener(new com.google.android.material.internal.OooOO0(com.google.android.material.internal.o0ooOOo.OooO00o(toolbar), com.google.android.material.internal.o0ooOOo.OooO00o(materialToolbar)));
        }
        animatorArr[7] = valueAnimatorOfFloat10;
        animatorArr[8] = OooO0oo(this.f17561OooO, z, true);
        animatorArr[9] = OooO0oo(this.f17569OooO0oo, z, true);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new OooO00o(z));
        return animatorSet;
    }

    public final int OooO0Oo(View view) {
        int iOooO0O0 = androidx.core.view.o00O0O.OooO0O0((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return oo0o0Oo.OooO0o(this.f17573OooOOO0) ? this.f17573OooOOO0.getLeft() - iOooO0O0 : (this.f17573OooOOO0.getRight() - this.f17562OooO00o.getWidth()) + iOooO0O0;
    }

    public final int OooO0o() {
        FrameLayout frameLayout = this.f17567OooO0o0;
        return ((this.f17573OooOOO0.getBottom() + this.f17573OooOOO0.getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public final int OooO0o0(View view) {
        int iOooO0OO = androidx.core.view.o00O0O.OooO0OO((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        SearchBar searchBar = this.f17573OooOOO0;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(searchBar);
        return oo0o0Oo.OooO0o(this.f17573OooOOO0) ? ((this.f17573OooOOO0.getWidth() - this.f17573OooOOO0.getRight()) + iOooO0OO) - iOooO0o : (this.f17573OooOOO0.getLeft() - iOooO0OO) + iOooO0o;
    }

    public final AnimatorSet OooO0oO(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f17564OooO0OO;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        OooO0O0(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, o0O000.OooO0O0.f41572OooO0O0));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet OooO0oo(View view, boolean z, boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z2 ? OooO0o0(view) : OooO0Oo(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.OooOOOO(new o0O00OOO(), view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(OooO0o(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, o0O000.OooO0O0.f41572OooO0O0));
        return animatorSet;
    }
}
