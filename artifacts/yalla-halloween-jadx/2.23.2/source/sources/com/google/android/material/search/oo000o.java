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
import androidx.core.view.o000OOo0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.o0ooOOo;
import com.google.android.material.internal.oo0o0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final EditText f17088OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SearchView f17089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f17090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f17091OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FrameLayout f17092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final MaterialToolbar f17093OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final FrameLayout f17094OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Toolbar f17095OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextView f17096OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ImageButton f17097OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final View f17098OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TouchObserverFrameLayout f17099OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public SearchBar f17100OooOOO0;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f17101OooO0Oo;

        public OooO00o(boolean z) {
            this.f17101OooO0Oo = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.f17101OooO0Oo;
            float f = z ? 1.0f : 0.0f;
            oo000o oo000oVar = oo000o.this;
            oo000o.OooO00o(oo000oVar, f);
            if (z) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = oo000oVar.f17091OooO0OO;
                clippableRoundedCornerLayout.f16664OooO0Oo = null;
                clippableRoundedCornerLayout.invalidate();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo000o.OooO00o(oo000o.this, this.f17101OooO0Oo ? 0.0f : 1.0f);
        }
    }

    public oo000o(SearchView searchView) {
        this.f17089OooO00o = searchView;
        this.f17090OooO0O0 = searchView.f17054OooO0Oo;
        this.f17091OooO0OO = searchView.f17056OooO0o0;
        this.f17092OooO0Oo = searchView.f17058OooO0oo;
        this.f17094OooO0o0 = searchView.f17053OooO;
        this.f17093OooO0o = searchView.f17059OooOO0;
        this.f17095OooO0oO = searchView.f17060OooOO0O;
        this.f17096OooO0oo = searchView.f17061OooOO0o;
        this.f17088OooO = searchView.f17063OooOOO0;
        this.f17097OooOO0 = searchView.f17062OooOOO;
        this.f17098OooOO0O = searchView.f17064OooOOOO;
        this.f17099OooOO0o = searchView.f17065OooOOOo;
    }

    public static void OooO00o(oo000o oo000oVar, float f) {
        ActionMenuView actionMenuViewOooO00o;
        oo000oVar.f17097OooOO0.setAlpha(f);
        oo000oVar.f17098OooOO0O.setAlpha(f);
        oo000oVar.f17099OooOO0o.setAlpha(f);
        if (!oo000oVar.f17089OooO00o.f17069OooOo || (actionMenuViewOooO00o = o0ooOOo.OooO00o(oo000oVar.f17093OooO0o)) == null) {
            return;
        }
        actionMenuViewOooO00o.setAlpha(f);
    }

    public final void OooO0O0(AnimatorSet animatorSet) {
        ImageButton imageButtonOooO0O0 = o0ooOOo.OooO0O0(this.f17093OooO0o);
        if (imageButtonOooO0O0 == null) {
            return;
        }
        Drawable drawableOooO0Oo = p053o00000oo.o00Ooo.OooO0Oo(imageButtonOooO0O0.getDrawable());
        if (!this.f17089OooO00o.f17073OooOo0o) {
            if (drawableOooO0Oo instanceof DrawerArrowDrawable) {
                DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawableOooO0Oo;
                if (drawerArrowDrawable.f2493OooO != 1.0f) {
                    drawerArrowDrawable.f2493OooO = 1.0f;
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
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.Oooo0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    DrawerArrowDrawable drawerArrowDrawable3 = drawerArrowDrawable2;
                    if (drawerArrowDrawable3.f2493OooO != animatedFraction) {
                        drawerArrowDrawable3.f2493OooO = animatedFraction;
                        drawerArrowDrawable3.invalidateSelf();
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableOooO0Oo instanceof com.google.android.material.internal.OooO) {
            final com.google.android.material.internal.OooO oooO = (com.google.android.material.internal.OooO) drawableOooO0Oo;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.Oooo000
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    oooO.OooO00o(valueAnimator.getAnimatedFraction());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
    }

    public final AnimatorSet OooO0OO(boolean z) {
        int i;
        char c;
        int i2;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[10];
        Interpolator interpolator = z ? o0O000.OooO0O0.f40880OooO00o : o0O000.OooO0O0.f40881OooO0O0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, interpolator));
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.OooOOOO(new p103o000oo00.Oooo0(), this.f17090OooO0O0));
        animatorArr[0] = valueAnimatorOfFloat;
        SearchView searchView = this.f17089OooO00o;
        Rect rect = new Rect(searchView.getLeft(), searchView.getTop() + 0, searchView.getRight(), searchView.getBottom() + 0);
        int[] iArr = new int[2];
        this.f17100OooOOO0.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f17091OooO0OO.getLocationOnScreen(iArr2);
        int i5 = i3 - iArr2[0];
        int i6 = i4 - iArr2[1];
        Rect rect2 = new Rect(i5, i6, this.f17100OooOOO0.getWidth() + i5, this.f17100OooOOO0.getHeight() + i6);
        final Rect rect3 = new Rect(rect2);
        final float cornerSize = this.f17100OooOOO0.getCornerSize();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.Oooo0(rect3), rect2, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.o000oOoO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                oo000o oo000oVar = this.f17081OooO0Oo;
                oo000oVar.getClass();
                float animatedFraction = (1.0f - valueAnimator.getAnimatedFraction()) * cornerSize;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = oo000oVar.f17091OooO0OO;
                clippableRoundedCornerLayout.getClass();
                Rect rect4 = rect3;
                RectF rectF = new RectF(rect4.left, rect4.top, rect4.right, rect4.bottom);
                if (clippableRoundedCornerLayout.f16664OooO0Oo == null) {
                    clippableRoundedCornerLayout.f16664OooO0Oo = new Path();
                }
                clippableRoundedCornerLayout.f16664OooO0Oo.reset();
                clippableRoundedCornerLayout.f16664OooO0Oo.addRoundRect(rectF, animatedFraction, animatedFraction, Path.Direction.CW);
                clippableRoundedCornerLayout.f16664OooO0Oo.close();
                clippableRoundedCornerLayout.invalidate();
            }
        });
        valueAnimatorOfObject.setDuration(z ? 300L : 250L);
        p064o0000oO0.OooOO0 oooOO1 = o0O000.OooO0O0.f40881OooO0O0;
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        animatorArr[1] = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z ? 250L : 0L);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
        valueAnimatorOfFloat2.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new com.google.android.material.internal.OooOOOO(new p103o000oo00.Oooo0(), this.f17097OooOO0));
        animatorArr[2] = valueAnimatorOfFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, linearInterpolator));
        View view = this.f17098OooOO0O;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f17099OooOO0o;
        valueAnimatorOfFloat3.addUpdateListener(new com.google.android.material.internal.OooOOOO(new p103o000oo00.Oooo0(), view, touchObserverFrameLayout));
        animatorArr2[0] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        valueAnimatorOfFloat4.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(view));
        animatorArr2[1] = valueAnimatorOfFloat4;
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        valueAnimatorOfFloat5.addUpdateListener(new com.google.android.material.internal.OooOOOO(new com.google.android.material.internal.OooOOO(), touchObserverFrameLayout));
        animatorArr2[2] = valueAnimatorOfFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f17093OooO0o;
        View viewOooO0O0 = o0ooOOo.OooO0O0(materialToolbar);
        if (viewOooO0O0 == null) {
            i = 2;
            c = 0;
            i2 = 1;
        } else {
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(OooO0o0(viewOooO0O0), 0.0f);
            valueAnimatorOfFloat6.addUpdateListener(new com.google.android.material.internal.OooOOOO(new p103o000oo00.Oooo000(), viewOooO0O0));
            i = 2;
            c = 0;
            i2 = 1;
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(OooO0o(), 0.0f);
            valueAnimatorOfFloat7.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(viewOooO0O0));
            animatorSet3.playTogether(valueAnimatorOfFloat6, valueAnimatorOfFloat7);
        }
        OooO0O0(animatorSet3);
        View viewOooO00o = o0ooOOo.OooO00o(materialToolbar);
        if (viewOooO00o != null) {
            float[] fArr = new float[i];
            fArr[c] = OooO0Oo(viewOooO00o);
            fArr[i2] = 0.0f;
            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(fArr);
            View[] viewArr = new View[i2];
            viewArr[c] = viewOooO00o;
            valueAnimatorOfFloat8.addUpdateListener(new com.google.android.material.internal.OooOOOO(new p103o000oo00.Oooo000(), viewArr));
            ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(OooO0o(), 0.0f);
            valueAnimatorOfFloat9.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(viewOooO00o));
            animatorSet3.playTogether(valueAnimatorOfFloat8, valueAnimatorOfFloat9);
        }
        animatorSet3.setDuration(z ? 300L : 250L);
        animatorSet3.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        animatorArr[4] = animatorSet3;
        animatorArr[5] = OooO0oo(this.f17092OooO0Oo, z, false);
        Toolbar toolbar = this.f17095OooO0oO;
        animatorArr[6] = OooO0oo(toolbar, z, false);
        ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat10.setDuration(z ? 300L : 250L);
        valueAnimatorOfFloat10.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, oooOO1));
        if (searchView.f17069OooOo) {
            valueAnimatorOfFloat10.addUpdateListener(new com.google.android.material.internal.OooOO0(o0ooOOo.OooO00o(toolbar), o0ooOOo.OooO00o(materialToolbar)));
        }
        animatorArr[7] = valueAnimatorOfFloat10;
        animatorArr[8] = OooO0oo(this.f17088OooO, z, true);
        animatorArr[9] = OooO0oo(this.f17096OooO0oo, z, true);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new OooO00o(z));
        return animatorSet;
    }

    public final int OooO0Oo(View view) {
        int iOooO0O0 = androidx.core.view.o00O0O.OooO0O0((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return oo0o0Oo.OooO0o(this.f17100OooOOO0) ? this.f17100OooOOO0.getLeft() - iOooO0O0 : (this.f17100OooOOO0.getRight() - this.f17089OooO00o.getWidth()) + iOooO0O0;
    }

    public final int OooO0o() {
        FrameLayout frameLayout = this.f17094OooO0o0;
        return ((this.f17100OooOOO0.getBottom() + this.f17100OooOOO0.getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public final int OooO0o0(View view) {
        int iOooO0OO = androidx.core.view.o00O0O.OooO0OO((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        SearchBar searchBar = this.f17100OooOOO0;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0o = ViewCompat.OooO.OooO0o(searchBar);
        return oo0o0Oo.OooO0o(this.f17100OooOOO0) ? ((this.f17100OooOOO0.getWidth() - this.f17100OooOOO0.getRight()) + iOooO0OO) - iOooO0o : (this.f17100OooOOO0.getLeft() - iOooO0OO) + iOooO0o;
    }

    public final AnimatorSet OooO0oO(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f17091OooO0OO;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        OooO0O0(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, o0O000.OooO0O0.f40881OooO0O0));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet OooO0oo(View view, boolean z, boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z2 ? OooO0o0(view) : OooO0Oo(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.OooOOOO(new p103o000oo00.Oooo000(), view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(OooO0o(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.OooOOOO.OooO00o(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.o000oOoO.OooO00o(z, o0O000.OooO0O0.f40881OooO0O0));
        return animatorSet;
    }
}
