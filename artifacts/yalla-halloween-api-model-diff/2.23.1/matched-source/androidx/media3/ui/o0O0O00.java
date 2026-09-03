package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9862OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PlayerControlView f9863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final View f9864OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9865OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9867OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9868OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9869OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ViewGroup f9870OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f9871OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f9872OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AnimatorSet f9873OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AnimatorSet f9874OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AnimatorSet f9875OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AnimatorSet f9876OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AnimatorSet f9877OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ValueAnimator f9878OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ValueAnimator f9879OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final androidx.media3.session.o0OOO0o f9882OooOo0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f9888OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f9890OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o0OoOo0 f9880OooOOoo = new o0OoOo0(this, 0);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final oo000o f9883OooOo00 = new Runnable() { // from class: androidx.media3.ui.oo000o
        @Override // java.lang.Runnable
        public final void run() {
            this.f9910OooO0Oo.f9874OooOOO.start();
        }
    };

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final p022Oooo00O.o0ooOOo f9884OooOo0O = new p022Oooo00O.o0ooOOo(this, 2);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00oO0o f9885OooOo0o = new Runnable() { // from class: androidx.media3.ui.o00oO0o
        @Override // java.lang.Runnable
        public final void run() {
            this.f9861OooO0Oo.OooO(2);
        }
    };

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0ooOOo f9881OooOo = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.o0ooOOo
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            o0O0O00 o0o0o00 = this.f9909OooO0Oo;
            PlayerControlView playerControlView = o0o0o00.f9863OooO00o;
            int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
            int height3 = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
            ViewGroup viewGroup = o0o0o00.f9865OooO0OO;
            int iOooO0Oo = o0O0O00.OooO0Oo(viewGroup);
            int i9 = 0;
            if (viewGroup != null) {
                paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int i10 = iOooO0Oo - paddingRight;
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
            int i11 = height - paddingBottom;
            int iMax = Math.max(i10, o0O0O00.OooO0Oo(o0o0o00.f9872OooOO0O) + o0O0O00.OooO0Oo(o0o0o00.f9862OooO));
            ViewGroup viewGroup2 = o0o0o00.f9866OooO0Oo;
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
            int i12 = 1;
            boolean z = width <= iMax || height3 <= (height2 * 2) + i11;
            if (o0o0o00.f9888OooOoOO != z) {
                o0o0o00.f9888OooOoOO = z;
                view.post(new p073o000O0oo.o0000Ooo(o0o0o00, i12));
            }
            i12 = i3 - i == i7 - i5 ? 0 : 1;
            if (o0o0o00.f9888OooOoOO || i12 == 0) {
                return;
            }
            view.post(new o00O0O(o0o0o00, i9));
        }
    };

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f9889OooOoo = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f9886OooOoO = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f9887OooOoO0 = new ArrayList();

    public class OooO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PlayerControlView f9891OooO0Oo;

        public OooO(PlayerControlView playerControlView) {
            this.f9891OooO0Oo = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            o0o0o00.OooO(2);
            if (o0o0o00.f9890OooOoo0) {
                this.f9891OooO0Oo.post(o0o0o00.f9880OooOOoo);
                o0o0o00.f9890OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00.this.OooO(3);
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            View view = o0o0o00.f9864OooO0O0;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = o0o0o00.f9865OooO0OO;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = o0o0o00.f9868OooO0o0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            View view = o0o0o00.f9871OooOO0;
            if (!(view instanceof DefaultTimeBar) || o0o0o00.f9888OooOoOO) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
            ValueAnimator valueAnimator = defaultTimeBar.f9575Oooo00o;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(defaultTimeBar.f9572Oooo0, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            View view = o0o0o00.f9864OooO0O0;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = o0o0o00.f9865OooO0OO;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = o0o0o00.f9868OooO0o0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(o0o0o00.f9888OooOoOO ? 0 : 4);
            }
            View view2 = o0o0o00.f9871OooOO0;
            if (!(view2 instanceof DefaultTimeBar) || o0o0o00.f9888OooOoOO) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
            ValueAnimator valueAnimator = defaultTimeBar.f9575Oooo00o;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            defaultTimeBar.f9576Oooo0O0 = false;
            valueAnimator.setFloatValues(defaultTimeBar.f9572Oooo0, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PlayerControlView f9895OooO0Oo;

        public OooO0OO(PlayerControlView playerControlView) {
            this.f9895OooO0Oo = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            o0o0o00.OooO(1);
            if (o0o0o00.f9890OooOoo0) {
                this.f9895OooO0Oo.post(o0o0o00.f9880OooOOoo);
                o0o0o00.f9890OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00.this.OooO(3);
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PlayerControlView f9897OooO0Oo;

        public OooO0o(PlayerControlView playerControlView) {
            this.f9897OooO0Oo = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            o0o0o00.OooO(2);
            if (o0o0o00.f9890OooOoo0) {
                this.f9897OooO0Oo.post(o0o0o00.f9880OooOOoo);
                o0o0o00.f9890OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00.this.OooO(3);
        }
    }

    public class OooOO0 extends AnimatorListenerAdapter {
        public OooOO0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0O0O00.this.OooO(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00.this.OooO(4);
        }
    }

    public class OooOO0O extends AnimatorListenerAdapter {
        public OooOO0O() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o0O0O00.this.OooO(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00.this.OooO(4);
        }
    }

    public class OooOOO extends AnimatorListenerAdapter {
        public OooOOO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = o0O0O00.this.f9870OooO0oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = o0O0O00.this.f9867OooO0o;
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
            ViewGroup viewGroup = o0O0O00.this.f9867OooO0o;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            o0O0O00 o0o0o00 = o0O0O00.this;
            ViewGroup viewGroup = o0o0o00.f9870OooO0oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = o0o0o00.f9870OooO0oo;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = o0o0o00.f9870OooO0oo;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.ui.oo000o] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.media3.session.o0OOO0o] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.ui.o00oO0o] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.ui.o0ooOOo] */
    public o0O0O00(PlayerControlView playerControlView) {
        this.f9863OooO00o = playerControlView;
        int i = 0;
        final int i2 = 1;
        this.f9882OooOo0 = new Runnable() { // from class: androidx.media3.session.o0OOO0o
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                Object obj = this;
                switch (i3) {
                    case 0:
                        ((Oooo0) obj).release();
                        break;
                    default:
                        ((androidx.media3.ui.o0O0O00) obj).f9875OooOOO0.start();
                        break;
                }
            }
        };
        this.f9864OooO0O0 = playerControlView.findViewById(o00000O.exo_controls_background);
        this.f9865OooO0OO = (ViewGroup) playerControlView.findViewById(o00000O.exo_center_controls);
        this.f9868OooO0o0 = (ViewGroup) playerControlView.findViewById(o00000O.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(o00000O.exo_bottom_bar);
        this.f9866OooO0Oo = viewGroup;
        this.f9862OooO = (ViewGroup) playerControlView.findViewById(o00000O.exo_time);
        View viewFindViewById = playerControlView.findViewById(o00000O.exo_progress);
        this.f9871OooOO0 = viewFindViewById;
        this.f9867OooO0o = (ViewGroup) playerControlView.findViewById(o00000O.exo_basic_controls);
        this.f9869OooO0oO = (ViewGroup) playerControlView.findViewById(o00000O.exo_extra_controls);
        this.f9870OooO0oo = (ViewGroup) playerControlView.findViewById(o00000O.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(o00000O.exo_overflow_show);
        this.f9872OooOO0O = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(o00000O.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new o0OOO0o(this, i));
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.o0Oo0oo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o0O0O00.OooO00o(this.f9906OooO0Oo, view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o0OO00O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0O0O00 o0o0o00 = this.f9903OooO0Oo;
                o0o0o00.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = o0o0o00.f9864OooO0O0;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = o0o0o00.f9865OooO0OO;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = o0o0o00.f9868OooO0o0;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new OooO00o());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.oo0o0Oo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0O0O00 o0o0o00 = this.f9911OooO0Oo;
                o0o0o00.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = o0o0o00.f9864OooO0O0;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = o0o0o00.f9865OooO0OO;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = o0o0o00.f9868OooO0o0;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new OooO0O0());
        Resources resources = playerControlView.getResources();
        int i3 = o000000O.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i3) - resources.getDimension(o000000O.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9873OooOO0o = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new OooO0OO(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(OooO0o0(viewFindViewById, 0.0f, dimension)).with(OooO0o0(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f9875OooOOO0 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new OooO0o(playerControlView));
        animatorSet2.play(OooO0o0(viewFindViewById, dimension, dimension2)).with(OooO0o0(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f9874OooOOO = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new OooO(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(OooO0o0(viewFindViewById, 0.0f, dimension2)).with(OooO0o0(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f9876OooOOOO = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new OooOO0());
        animatorSet4.play(valueAnimatorOfFloat2).with(OooO0o0(viewFindViewById, dimension, 0.0f)).with(OooO0o0(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f9877OooOOOo = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new OooOO0O());
        animatorSet5.play(valueAnimatorOfFloat2).with(OooO0o0(viewFindViewById, dimension2, 0.0f)).with(OooO0o0(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9879OooOOo0 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o00Oo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0O0O00 o0o0o00 = this.f9859OooO0Oo;
                o0o0o00.getClass();
                o0o0o00.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new OooOOO0());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f9878OooOOo = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o00Ooo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o0O0O00 o0o0o00 = this.f9860OooO0Oo;
                o0o0o00.getClass();
                o0o0o00.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new OooOOO());
    }

    public static void OooO00o(o0O0O00 o0o0o00, View view) {
        o0o0o00.OooO0oO();
        if (view.getId() == o00000O.exo_overflow_show) {
            o0o0o00.f9879OooOOo0.start();
        } else if (view.getId() == o00000O.exo_overflow_hide) {
            o0o0o00.f9878OooOOo.start();
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
        return id == o00000O.exo_bottom_bar || id == o00000O.exo_prev || id == o00000O.exo_next || id == o00000O.exo_rew || id == o00000O.exo_rew_with_amount || id == o00000O.exo_ffwd || id == o00000O.exo_ffwd_with_amount;
    }

    public final void OooO(int i) {
        int i2 = this.f9886OooOoO;
        this.f9886OooOoO = i;
        PlayerControlView playerControlView = this.f9863OooO00o;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator<PlayerControlView.OooOOOO> it = playerControlView.f9660OooO0oO.iterator();
            while (it.hasNext()) {
                it.next().OooOO0O(playerControlView.getVisibility());
            }
        }
    }

    public final void OooO0O0(float f) {
        ViewGroup viewGroup = this.f9870OooO0oo;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f9862OooO;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f9867OooO0o;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean OooO0OO(@Nullable View view) {
        return view != null && this.f9887OooOoO0.contains(view);
    }

    public final void OooO0o() {
        PlayerControlView playerControlView = this.f9863OooO00o;
        playerControlView.removeCallbacks(this.f9885OooOo0o);
        playerControlView.removeCallbacks(this.f9883OooOo00);
        playerControlView.removeCallbacks(this.f9884OooOo0O);
        playerControlView.removeCallbacks(this.f9882OooOo0);
    }

    public final void OooO0oO() {
        if (this.f9886OooOoO == 3) {
            return;
        }
        OooO0o();
        PlayerControlView playerControlView = this.f9863OooO00o;
        int showTimeoutMs = playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f9889OooOoo) {
                long j = showTimeoutMs;
                if (j >= 0) {
                    playerControlView.postDelayed(this.f9885OooOo0o, j);
                    return;
                }
                return;
            }
            if (this.f9886OooOoO == 1) {
                playerControlView.postDelayed(this.f9882OooOo0, 2000L);
                return;
            }
            long j2 = showTimeoutMs;
            if (j2 >= 0) {
                playerControlView.postDelayed(this.f9884OooOo0O, j2);
            }
        }
    }

    public final void OooO0oo(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f9887OooOoO0;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f9888OooOoOO && OooOO0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void OooOO0O() {
        if (!this.f9889OooOoo) {
            OooO(0);
            OooO0oO();
            return;
        }
        int i = this.f9886OooOoO;
        if (i == 1) {
            this.f9876OooOOOO.start();
        } else if (i == 2) {
            this.f9877OooOOOo.start();
        } else if (i == 3) {
            this.f9890OooOoo0 = true;
        } else if (i == 4) {
            return;
        }
        OooO0oO();
    }
}
