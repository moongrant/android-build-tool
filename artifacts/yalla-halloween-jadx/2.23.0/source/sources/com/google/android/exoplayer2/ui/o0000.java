package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import p022Oooo00O.o0OO0o;
import p039OoooOoo.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14033OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final StyledPlayerControlView f14034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final View f14035OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14036OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14037OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14038OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14039OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14040OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ViewGroup f14041OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f14042OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f14043OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AnimatorSet f14044OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AnimatorSet f14045OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AnimatorSet f14046OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AnimatorSet f14047OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AnimatorSet f14048OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ValueAnimator f14049OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ValueAnimator f14050OooOOo0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f14059OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f14061OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final oo0o0Oo f14051OooOOoo = new oo0o0Oo(this, 0);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final androidx.media3.ui.Oooo000 f14054OooOo00 = new androidx.media3.ui.Oooo000(this, 1);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o000000 f14053OooOo0 = new Runnable() { // from class: com.google.android.exoplayer2.ui.o000000
        @Override // java.lang.Runnable
        public final void run() {
            this.f14076OooO0Oo.f14046OooOOO0.start();
        }
    };

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o0OO0o f14055OooOo0O = new o0OO0o(this, 1);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final androidx.media3.ui.o00Ooo f14056OooOo0o = new androidx.media3.ui.o00Ooo(this, 1);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o000000O f14052OooOo = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.o000000O
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            final o0000 o0000Var = this.f14077OooO0Oo;
            StyledPlayerControlView styledPlayerControlView = o0000Var.f14034OooO00o;
            int width = (styledPlayerControlView.getWidth() - styledPlayerControlView.getPaddingLeft()) - styledPlayerControlView.getPaddingRight();
            int height3 = (styledPlayerControlView.getHeight() - styledPlayerControlView.getPaddingBottom()) - styledPlayerControlView.getPaddingTop();
            ViewGroup viewGroup = o0000Var.f14036OooO0OO;
            int iOooO0Oo = o0000.OooO0Oo(viewGroup);
            if (viewGroup != null) {
                paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int i9 = iOooO0Oo - paddingRight;
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            if (viewGroup != null) {
                paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
            } else {
                paddingBottom = 0;
            }
            int i10 = height - paddingBottom;
            int iMax = Math.max(i9, o0000.OooO0Oo(o0000Var.f14043OooOO0O) + o0000.OooO0Oo(o0000Var.f14033OooO));
            ViewGroup viewGroup2 = o0000Var.f14037OooO0Oo;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            int i11 = 1;
            boolean z = width <= iMax || height3 <= (height2 * 2) + i10;
            if (o0000Var.f14059OooOoOO != z) {
                o0000Var.f14059OooOoOO = z;
                view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.o0000Ooo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0000 o0000Var2 = o0000Var;
                        ViewGroup viewGroup3 = o0000Var2.f14039OooO0o0;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(o0000Var2.f14059OooOoOO ? 0 : 4);
                        }
                        View view2 = o0000Var2.f14042OooOO0;
                        if (view2 != null) {
                            int dimensionPixelSize = o0000Var2.f14034OooO00o.getResources().getDimensionPixelSize(OooOO0O.exo_styled_progress_margin_bottom);
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            if (marginLayoutParams3 != null) {
                                if (o0000Var2.f14059OooOoOO) {
                                    dimensionPixelSize = 0;
                                }
                                marginLayoutParams3.bottomMargin = dimensionPixelSize;
                                view2.setLayoutParams(marginLayoutParams3);
                            }
                            if (view2 instanceof DefaultTimeBar) {
                                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                                boolean z2 = o0000Var2.f14059OooOoOO;
                                Rect rect = defaultTimeBar.f13757OooO0Oo;
                                ValueAnimator valueAnimator = defaultTimeBar.f13788Oooo00o;
                                if (z2) {
                                    if (valueAnimator.isStarted()) {
                                        valueAnimator.cancel();
                                    }
                                    defaultTimeBar.f13789Oooo0O0 = true;
                                    defaultTimeBar.f13785Oooo0 = 0.0f;
                                    defaultTimeBar.invalidate(rect);
                                } else {
                                    int i12 = o0000Var2.f14057OooOoO;
                                    if (i12 == 1) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        defaultTimeBar.f13789Oooo0O0 = false;
                                        defaultTimeBar.f13785Oooo0 = 0.0f;
                                        defaultTimeBar.invalidate(rect);
                                    } else if (i12 != 3) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        defaultTimeBar.f13789Oooo0O0 = false;
                                        defaultTimeBar.f13785Oooo0 = 1.0f;
                                        defaultTimeBar.invalidate(defaultTimeBar.f13757OooO0Oo);
                                    }
                                }
                            }
                        }
                        for (View view3 : o0000Var2.f14058OooOoO0) {
                            view3.setVisibility((o0000Var2.f14059OooOoOO && o0000.OooOO0(view3)) ? 4 : 0);
                        }
                    }
                });
            }
            boolean z2 = i3 - i != i7 - i5;
            if (o0000Var.f14059OooOoOO || !z2) {
                return;
            }
            view.post(new o00O00OO(o0000Var, i11));
        }
    };

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f14060OooOoo = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f14057OooOoO = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f14058OooOoO0 = new ArrayList();

    public class OooO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f14062OooO0Oo;

        public OooO(StyledPlayerControlView styledPlayerControlView) {
            this.f14062OooO0Oo = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0000 o0000Var = o0000.this;
            o0000Var.OooO(2);
            if (o0000Var.f14061OooOoo0) {
                this.f14062OooO0Oo.post(o0000Var.f14051OooOOoo);
                o0000Var.f14061OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000.this.OooO(3);
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0000 o0000Var = o0000.this;
            View view = o0000Var.f14035OooO0O0;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = o0000Var.f14036OooO0OO;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = o0000Var.f14039OooO0o0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000 o0000Var = o0000.this;
            View view = o0000Var.f14042OooOO0;
            if (!(view instanceof DefaultTimeBar) || o0000Var.f14059OooOoOO) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
            ValueAnimator valueAnimator = defaultTimeBar.f13788Oooo00o;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(defaultTimeBar.f13785Oooo0, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000 o0000Var = o0000.this;
            View view = o0000Var.f14035OooO0O0;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = o0000Var.f14036OooO0OO;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = o0000Var.f14039OooO0o0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(o0000Var.f14059OooOoOO ? 0 : 4);
            }
            View view2 = o0000Var.f14042OooOO0;
            if (!(view2 instanceof DefaultTimeBar) || o0000Var.f14059OooOoOO) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
            ValueAnimator valueAnimator = defaultTimeBar.f13788Oooo00o;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            defaultTimeBar.f13789Oooo0O0 = false;
            valueAnimator.setFloatValues(defaultTimeBar.f13785Oooo0, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f14066OooO0Oo;

        public OooO0OO(StyledPlayerControlView styledPlayerControlView) {
            this.f14066OooO0Oo = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0000 o0000Var = o0000.this;
            o0000Var.OooO(1);
            if (o0000Var.f14061OooOoo0) {
                this.f14066OooO0Oo.post(o0000Var.f14051OooOOoo);
                o0000Var.f14061OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000.this.OooO(3);
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f14068OooO0Oo;

        public OooO0o(StyledPlayerControlView styledPlayerControlView) {
            this.f14068OooO0Oo = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0000 o0000Var = o0000.this;
            o0000Var.OooO(2);
            if (o0000Var.f14061OooOoo0) {
                this.f14068OooO0Oo.post(o0000Var.f14051OooOOoo);
                o0000Var.f14061OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000.this.OooO(3);
        }
    }

    public class OooOO0 extends AnimatorListenerAdapter {
        public OooOO0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0000.this.OooO(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000.this.OooO(4);
        }
    }

    public class OooOO0O extends AnimatorListenerAdapter {
        public OooOO0O() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0000.this.OooO(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000.this.OooO(4);
        }
    }

    public class OooOOO extends AnimatorListenerAdapter {
        public OooOOO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = o0000.this.f14041OooO0oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = o0000.this.f14038OooO0o;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public class OooOOO0 extends AnimatorListenerAdapter {
        public OooOOO0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = o0000.this.f14038OooO0o;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0000 o0000Var = o0000.this;
            ViewGroup viewGroup = o0000Var.f14041OooO0oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = o0000Var.f14041OooO0oo;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = o0000Var.f14041OooO0oo;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.exoplayer2.ui.o000000] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.exoplayer2.ui.o000000O] */
    public o0000(StyledPlayerControlView styledPlayerControlView) {
        this.f14034OooO00o = styledPlayerControlView;
        int i = 0;
        this.f14035OooO0O0 = styledPlayerControlView.findViewById(OooOOOO.exo_controls_background);
        this.f14036OooO0OO = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_center_controls);
        this.f14039OooO0o0 = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_bottom_bar);
        this.f14037OooO0Oo = viewGroup;
        this.f14033OooO = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_time);
        View viewFindViewById = styledPlayerControlView.findViewById(OooOOOO.exo_progress);
        this.f14042OooOO0 = viewFindViewById;
        this.f14038OooO0o = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_basic_controls);
        this.f14040OooO0oO = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_extra_controls);
        this.f14041OooO0oo = (ViewGroup) styledPlayerControlView.findViewById(OooOOOO.exo_extra_controls_scroll_view);
        View viewFindViewById2 = styledPlayerControlView.findViewById(OooOOOO.exo_overflow_show);
        this.f14043OooOO0O = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(OooOOOO.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new o00000(this, i));
            viewFindViewById3.setOnClickListener(new o00000O0(this, 0));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.o00000O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0000 o0000Var = this.f14078OooO0Oo;
                o0000Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = o0000Var.f14035OooO0O0;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = o0000Var.f14036OooO0OO;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = o0000Var.f14039OooO0o0;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new OooO00o());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.o00000OO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0000 o0000Var = this.f14081OooO0Oo;
                o0000Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = o0000Var.f14035OooO0O0;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = o0000Var.f14036OooO0OO;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = o0000Var.f14039OooO0o0;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new OooO0O0());
        Resources resources = styledPlayerControlView.getResources();
        int i2 = com.google.android.exoplayer2.ui.OooOO0O.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i2) - resources.getDimension(com.google.android.exoplayer2.ui.OooOO0O.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i2);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14044OooOO0o = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new OooO0OO(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(OooO0o0(viewFindViewById, 0.0f, dimension)).with(OooO0o0(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f14046OooOOO0 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new OooO0o(styledPlayerControlView));
        animatorSet2.play(OooO0o0(viewFindViewById, dimension, dimension2)).with(OooO0o0(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f14045OooOOO = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new OooO(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(OooO0o0(viewFindViewById, 0.0f, dimension2)).with(OooO0o0(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f14047OooOOOO = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new OooOO0());
        animatorSet4.play(valueAnimatorOfFloat2).with(OooO0o0(viewFindViewById, dimension, 0.0f)).with(OooO0o0(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f14048OooOOOo = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new OooOO0O());
        animatorSet5.play(valueAnimatorOfFloat2).with(OooO0o0(viewFindViewById, dimension2, 0.0f)).with(OooO0o0(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14050OooOOo0 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.o0O0O00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0000 o0000Var = this.f14133OooO0Oo;
                o0000Var.getClass();
                o0000Var.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new OooOOO0());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f14049OooOOo = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.o000OOo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0000 o0000Var = this.f14119OooO0Oo;
                o0000Var.getClass();
                o0000Var.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new OooOOO());
    }

    public static void OooO00o(o0000 o0000Var, View view) {
        o0000Var.OooO0oO();
        if (view.getId() == OooOOOO.exo_overflow_show) {
            o0000Var.f14050OooOOo0.start();
        } else if (view.getId() == OooOOOO.exo_overflow_hide) {
            o0000Var.f14049OooOOo.start();
        }
    }

    public static int OooO0Oo(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator OooO0o0(View view, float f, float f2) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean OooOO0(View view) {
        int id = view.getId();
        return id == OooOOOO.exo_bottom_bar || id == OooOOOO.exo_prev || id == OooOOOO.exo_next || id == OooOOOO.exo_rew || id == OooOOOO.exo_rew_with_amount || id == OooOOOO.exo_ffwd || id == OooOOOO.exo_ffwd_with_amount;
    }

    public final void OooO(int i) {
        int i2 = this.f14057OooOoO;
        this.f14057OooOoO = i;
        StyledPlayerControlView styledPlayerControlView = this.f14034OooO00o;
        if (i == 2) {
            styledPlayerControlView.setVisibility(8);
        } else if (i2 == 2) {
            styledPlayerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator<StyledPlayerControlView.OooOOOO> it = styledPlayerControlView.f13887OooO0oO.iterator();
            while (it.hasNext()) {
                it.next().OooO00o(styledPlayerControlView.getVisibility());
            }
        }
    }

    public final void OooO0O0(float f) {
        ViewGroup viewGroup = this.f14041OooO0oo;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f14033OooO;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f14038OooO0o;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean OooO0OO(@Nullable View view) {
        return view != null && this.f14058OooOoO0.contains(view);
    }

    public final void OooO0o() {
        StyledPlayerControlView styledPlayerControlView = this.f14034OooO00o;
        styledPlayerControlView.removeCallbacks(this.f14056OooOo0o);
        styledPlayerControlView.removeCallbacks(this.f14054OooOo00);
        styledPlayerControlView.removeCallbacks(this.f14055OooOo0O);
        styledPlayerControlView.removeCallbacks(this.f14053OooOo0);
    }

    public final void OooO0oO() {
        if (this.f14057OooOoO == 3) {
            return;
        }
        OooO0o();
        StyledPlayerControlView styledPlayerControlView = this.f14034OooO00o;
        int showTimeoutMs = styledPlayerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f14060OooOoo) {
                long j = showTimeoutMs;
                if (j >= 0) {
                    styledPlayerControlView.postDelayed(this.f14056OooOo0o, j);
                    return;
                }
                return;
            }
            if (this.f14057OooOoO == 1) {
                styledPlayerControlView.postDelayed(this.f14053OooOo0, 2000L);
                return;
            }
            long j2 = showTimeoutMs;
            if (j2 >= 0) {
                styledPlayerControlView.postDelayed(this.f14055OooOo0O, j2);
            }
        }
    }

    public final void OooO0oo(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f14058OooOoO0;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f14059OooOoOO && OooOO0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void OooOO0O() {
        if (!this.f14060OooOoo) {
            OooO(0);
            OooO0oO();
            return;
        }
        int i = this.f14057OooOoO;
        if (i == 1) {
            this.f14047OooOOOO.start();
        } else if (i == 2) {
            this.f14048OooOOOo.start();
        } else if (i == 3) {
            this.f14061OooOoo0 = true;
        } else if (i == 4) {
            return;
        }
        OooO0oO();
    }
}
