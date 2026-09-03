package androidx.media3.ui;

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
import p022Oooo00O.o0OO;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6766OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PlayerControlView f6767OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final View f6768OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6769OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6770OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6771OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6772OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6773OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ViewGroup f6774OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f6775OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f6776OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AnimatorSet f6777OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final AnimatorSet f6778OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AnimatorSet f6779OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AnimatorSet f6780OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AnimatorSet f6781OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ValueAnimator f6782OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ValueAnimator f6783OooOOo0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f6792OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f6794OooOoo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Oooo000 f6784OooOOoo = new Oooo000(this, 0);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o00Ooo f6787OooOo00 = new o00Ooo(this, 0);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0OO f6786OooOo0 = new o0OO(this, 1);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final oo000o f6788OooOo0O = new Runnable() { // from class: androidx.media3.ui.oo000o
        @Override // java.lang.Runnable
        public final void run() {
            oo0o0Oo oo0o0oo = this.f6765OooO0Oo;
            oo0o0oo.f6777OooOO0o.start();
            oo0o0oo.f6767OooO00o.postDelayed(oo0o0oo.f6786OooOo0, 2000L);
        }
    };

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00oO0o f6789OooOo0o = new Runnable() { // from class: androidx.media3.ui.o00oO0o
        @Override // java.lang.Runnable
        public final void run() {
            this.f6758OooO0Oo.OooO(2);
        }
    };

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0ooOOo f6785OooOo = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.o0ooOOo
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            final oo0o0Oo oo0o0oo = this.f6764OooO0Oo;
            PlayerControlView playerControlView = oo0o0oo.f6767OooO00o;
            int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
            int height3 = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
            ViewGroup viewGroup = oo0o0oo.f6769OooO0OO;
            int iOooO0Oo = oo0o0Oo.OooO0Oo(viewGroup);
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
            int iMax = Math.max(i9, oo0o0Oo.OooO0Oo(oo0o0oo.f6776OooOO0O) + oo0o0Oo.OooO0Oo(oo0o0oo.f6766OooO));
            ViewGroup viewGroup2 = oo0o0oo.f6770OooO0Oo;
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
            boolean z = width <= iMax || height3 <= (height2 * 2) + i10;
            if (oo0o0oo.f6792OooOoOO != z) {
                oo0o0oo.f6792OooOoOO = z;
                view.post(new Runnable() { // from class: androidx.media3.ui.o000oOoO
                    @Override // java.lang.Runnable
                    public final void run() {
                        oo0o0Oo oo0o0oo2 = oo0o0oo;
                        ViewGroup viewGroup3 = oo0o0oo2.f6772OooO0o0;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(oo0o0oo2.f6792OooOoOO ? 0 : 4);
                        }
                        View view2 = oo0o0oo2.f6775OooOO0;
                        if (view2 != null) {
                            int dimensionPixelSize = oo0o0oo2.f6767OooO00o.getResources().getDimensionPixelSize(o000000.exo_styled_progress_margin_bottom);
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            if (marginLayoutParams3 != null) {
                                if (oo0o0oo2.f6792OooOoOO) {
                                    dimensionPixelSize = 0;
                                }
                                marginLayoutParams3.bottomMargin = dimensionPixelSize;
                                view2.setLayoutParams(marginLayoutParams3);
                            }
                            if (view2 instanceof DefaultTimeBar) {
                                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                                boolean z2 = oo0o0oo2.f6792OooOoOO;
                                Rect rect = defaultTimeBar.f6469OooO0Oo;
                                ValueAnimator valueAnimator = defaultTimeBar.f6500Oooo00o;
                                if (z2) {
                                    if (valueAnimator.isStarted()) {
                                        valueAnimator.cancel();
                                    }
                                    defaultTimeBar.f6501Oooo0O0 = true;
                                    defaultTimeBar.f6497Oooo0 = 0.0f;
                                    defaultTimeBar.invalidate(rect);
                                } else {
                                    int i11 = oo0o0oo2.f6790OooOoO;
                                    if (i11 == 1) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        defaultTimeBar.f6501Oooo0O0 = false;
                                        defaultTimeBar.f6497Oooo0 = 0.0f;
                                        defaultTimeBar.invalidate(rect);
                                    } else if (i11 != 3) {
                                        if (valueAnimator.isStarted()) {
                                            valueAnimator.cancel();
                                        }
                                        defaultTimeBar.f6501Oooo0O0 = false;
                                        defaultTimeBar.f6497Oooo0 = 1.0f;
                                        defaultTimeBar.invalidate(defaultTimeBar.f6469OooO0Oo);
                                    }
                                }
                            }
                        }
                        for (View view3 : oo0o0oo2.f6791OooOoO0) {
                            view3.setVisibility((oo0o0oo2.f6792OooOoOO && oo0o0Oo.OooOO0(view3)) ? 4 : 0);
                        }
                    }
                });
            }
            boolean z2 = i3 - i != i7 - i5;
            if (oo0o0oo.f6792OooOoOO || !z2) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.media3.ui.o0OoOo0
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup3;
                    int i11;
                    oo0o0Oo oo0o0oo2 = oo0o0oo;
                    ViewGroup viewGroup4 = oo0o0oo2.f6771OooO0o;
                    if (viewGroup4 == null || (viewGroup3 = oo0o0oo2.f6773OooO0oO) == null) {
                        return;
                    }
                    PlayerControlView playerControlView2 = oo0o0oo2.f6767OooO00o;
                    int width2 = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                    while (true) {
                        if (viewGroup3.getChildCount() <= 1) {
                            break;
                        }
                        int childCount = viewGroup3.getChildCount() - 2;
                        View childAt = viewGroup3.getChildAt(childCount);
                        viewGroup3.removeViewAt(childCount);
                        viewGroup4.addView(childAt, 0);
                    }
                    View view2 = oo0o0oo2.f6776OooOO0O;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    int iOooO0Oo2 = oo0o0Oo.OooO0Oo(oo0o0oo2.f6766OooO);
                    int childCount2 = viewGroup4.getChildCount() - 1;
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        iOooO0Oo2 += oo0o0Oo.OooO0Oo(viewGroup4.getChildAt(i12));
                    }
                    if (iOooO0Oo2 <= width2) {
                        ViewGroup viewGroup5 = oo0o0oo2.f6774OooO0oo;
                        if (viewGroup5 == null || viewGroup5.getVisibility() != 0) {
                            return;
                        }
                        ValueAnimator valueAnimator = oo0o0oo2.f6782OooOOo;
                        if (valueAnimator.isStarted()) {
                            return;
                        }
                        oo0o0oo2.f6783OooOOo0.cancel();
                        valueAnimator.start();
                        return;
                    }
                    if (view2 != null) {
                        view2.setVisibility(0);
                        iOooO0Oo2 += oo0o0Oo.OooO0Oo(view2);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        View childAt2 = viewGroup4.getChildAt(i13);
                        iOooO0Oo2 -= oo0o0Oo.OooO0Oo(childAt2);
                        arrayList.add(childAt2);
                        if (iOooO0Oo2 <= width2) {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    viewGroup4.removeViews(0, arrayList.size());
                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                        viewGroup3.addView((View) arrayList.get(i11), viewGroup3.getChildCount() - 1);
                    }
                }
            });
        }
    };

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f6793OooOoo = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f6790OooOoO = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f6791OooOoO0 = new ArrayList();

    public class OooO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PlayerControlView f6795OooO0Oo;

        public OooO(PlayerControlView playerControlView) {
            this.f6795OooO0Oo = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            oo0o0oo.OooO(2);
            if (oo0o0oo.f6794OooOoo0) {
                this.f6795OooO0Oo.post(oo0o0oo.f6784OooOOoo);
                oo0o0oo.f6794OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo.this.OooO(3);
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            View view = oo0o0oo.f6768OooO0O0;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = oo0o0oo.f6769OooO0OO;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = oo0o0oo.f6772OooO0o0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            View view = oo0o0oo.f6775OooOO0;
            if (!(view instanceof DefaultTimeBar) || oo0o0oo.f6792OooOoOO) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
            ValueAnimator valueAnimator = defaultTimeBar.f6500Oooo00o;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(defaultTimeBar.f6497Oooo0, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {
        public OooO0O0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            View view = oo0o0oo.f6768OooO0O0;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = oo0o0oo.f6769OooO0OO;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = oo0o0oo.f6772OooO0o0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(oo0o0oo.f6792OooOoOO ? 0 : 4);
            }
            View view2 = oo0o0oo.f6775OooOO0;
            if (!(view2 instanceof DefaultTimeBar) || oo0o0oo.f6792OooOoOO) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
            ValueAnimator valueAnimator = defaultTimeBar.f6500Oooo00o;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            defaultTimeBar.f6501Oooo0O0 = false;
            valueAnimator.setFloatValues(defaultTimeBar.f6497Oooo0, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PlayerControlView f6799OooO0Oo;

        public OooO0OO(PlayerControlView playerControlView) {
            this.f6799OooO0Oo = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            oo0o0oo.OooO(1);
            if (oo0o0oo.f6794OooOoo0) {
                this.f6799OooO0Oo.post(oo0o0oo.f6784OooOOoo);
                oo0o0oo.f6794OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo.this.OooO(3);
        }
    }

    public class OooO0o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PlayerControlView f6801OooO0Oo;

        public OooO0o(PlayerControlView playerControlView) {
            this.f6801OooO0Oo = playerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            oo0o0oo.OooO(2);
            if (oo0o0oo.f6794OooOoo0) {
                this.f6801OooO0Oo.post(oo0o0oo.f6784OooOOoo);
                oo0o0oo.f6794OooOoo0 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo.this.OooO(3);
        }
    }

    public class OooOO0 extends AnimatorListenerAdapter {
        public OooOO0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oo0o0Oo.this.OooO(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo.this.OooO(4);
        }
    }

    public class OooOO0O extends AnimatorListenerAdapter {
        public OooOO0O() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            oo0o0Oo.this.OooO(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo.this.OooO(4);
        }
    }

    public class OooOOO extends AnimatorListenerAdapter {
        public OooOOO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = oo0o0Oo.this.f6774OooO0oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = oo0o0Oo.this.f6771OooO0o;
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
            ViewGroup viewGroup = oo0o0Oo.this.f6771OooO0o;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            ViewGroup viewGroup = oo0o0oo.f6774OooO0oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = oo0o0oo.f6774OooO0oo;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = oo0o0oo.f6774OooO0oo;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.media3.ui.oo000o] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.ui.o00oO0o] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.media3.ui.o0ooOOo] */
    public oo0o0Oo(PlayerControlView playerControlView) {
        this.f6767OooO00o = playerControlView;
        this.f6768OooO0O0 = playerControlView.findViewById(o00000O0.exo_controls_background);
        this.f6769OooO0OO = (ViewGroup) playerControlView.findViewById(o00000O0.exo_center_controls);
        this.f6772OooO0o0 = (ViewGroup) playerControlView.findViewById(o00000O0.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(o00000O0.exo_bottom_bar);
        this.f6770OooO0Oo = viewGroup;
        this.f6766OooO = (ViewGroup) playerControlView.findViewById(o00000O0.exo_time);
        View viewFindViewById = playerControlView.findViewById(o00000O0.exo_progress);
        this.f6775OooOO0 = viewFindViewById;
        this.f6771OooO0o = (ViewGroup) playerControlView.findViewById(o00000O0.exo_basic_controls);
        this.f6773OooO0oO = (ViewGroup) playerControlView.findViewById(o00000O0.exo_extra_controls);
        this.f6774OooO0oo = (ViewGroup) playerControlView.findViewById(o00000O0.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(o00000O0.exo_overflow_show);
        this.f6776OooOO0O = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(o00000O0.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.o0OOO0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oo0o0Oo.OooO00o(this.f6760OooO0Oo, view);
                }
            });
            viewFindViewById3.setOnClickListener(new o0Oo0oo(this, 0));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o0OO00O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                oo0o0Oo oo0o0oo = this.f6759OooO0Oo;
                oo0o0oo.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = oo0o0oo.f6768OooO0O0;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = oo0o0oo.f6769OooO0OO;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = oo0o0oo.f6772OooO0o0;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new OooO00o());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.Oooo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                oo0o0Oo oo0o0oo = this.f6574OooO0Oo;
                oo0o0oo.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = oo0o0oo.f6768OooO0O0;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = oo0o0oo.f6769OooO0OO;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = oo0o0oo.f6772OooO0o0;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new OooO0O0());
        Resources resources = playerControlView.getResources();
        int i = o000000.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i) - resources.getDimension(o000000.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6777OooOO0o = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new OooO0OO(playerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(OooO0o0(viewFindViewById, 0.0f, dimension)).with(OooO0o0(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f6779OooOOO0 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new OooO0o(playerControlView));
        animatorSet2.play(OooO0o0(viewFindViewById, dimension, dimension2)).with(OooO0o0(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f6778OooOOO = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new OooO(playerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(OooO0o0(viewFindViewById, 0.0f, dimension2)).with(OooO0o0(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f6780OooOOOO = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new OooOO0());
        animatorSet4.play(valueAnimatorOfFloat2).with(OooO0o0(viewFindViewById, dimension, 0.0f)).with(OooO0o0(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f6781OooOOOo = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new OooOO0O());
        animatorSet5.play(valueAnimatorOfFloat2).with(OooO0o0(viewFindViewById, dimension2, 0.0f)).with(OooO0o0(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6783OooOOo0 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o00O0O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                oo0o0Oo oo0o0oo = this.f6754OooO0Oo;
                oo0o0oo.getClass();
                oo0o0oo.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new OooOOO0());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f6782OooOOo = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o00Oo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                oo0o0Oo oo0o0oo = this.f6755OooO0Oo;
                oo0o0oo.getClass();
                oo0o0oo.OooO0O0(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new OooOOO());
    }

    public static void OooO00o(oo0o0Oo oo0o0oo, View view) {
        oo0o0oo.OooO0oO();
        if (view.getId() == o00000O0.exo_overflow_show) {
            oo0o0oo.f6783OooOOo0.start();
        } else if (view.getId() == o00000O0.exo_overflow_hide) {
            oo0o0oo.f6782OooOOo.start();
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
        return id == o00000O0.exo_bottom_bar || id == o00000O0.exo_prev || id == o00000O0.exo_next || id == o00000O0.exo_rew || id == o00000O0.exo_rew_with_amount || id == o00000O0.exo_ffwd || id == o00000O0.exo_ffwd_with_amount;
    }

    public final void OooO(int i) {
        int i2 = this.f6790OooOoO;
        this.f6790OooOoO = i;
        PlayerControlView playerControlView = this.f6767OooO00o;
        if (i == 2) {
            playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            Iterator<PlayerControlView.OooOOOO> it = playerControlView.f6582OooO0oO.iterator();
            while (it.hasNext()) {
                it.next().OooO00o(playerControlView.getVisibility());
            }
        }
    }

    public final void OooO0O0(float f) {
        ViewGroup viewGroup = this.f6774OooO0oo;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f6766OooO;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f6771OooO0o;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean OooO0OO(@Nullable View view) {
        return view != null && this.f6791OooOoO0.contains(view);
    }

    public final void OooO0o() {
        PlayerControlView playerControlView = this.f6767OooO00o;
        playerControlView.removeCallbacks(this.f6789OooOo0o);
        playerControlView.removeCallbacks(this.f6787OooOo00);
        playerControlView.removeCallbacks(this.f6788OooOo0O);
        playerControlView.removeCallbacks(this.f6786OooOo0);
    }

    public final void OooO0oO() {
        if (this.f6790OooOoO == 3) {
            return;
        }
        OooO0o();
        PlayerControlView playerControlView = this.f6767OooO00o;
        int showTimeoutMs = playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f6793OooOoo) {
                long j = showTimeoutMs;
                if (j >= 0) {
                    playerControlView.postDelayed(this.f6789OooOo0o, j);
                    return;
                }
                return;
            }
            if (this.f6790OooOoO == 1) {
                playerControlView.postDelayed(this.f6786OooOo0, 2000L);
                return;
            }
            long j2 = showTimeoutMs;
            if (j2 >= 0) {
                playerControlView.postDelayed(this.f6788OooOo0O, j2);
            }
        }
    }

    public final void OooO0oo(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f6791OooOoO0;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f6792OooOoOO && OooOO0(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void OooOO0O() {
        if (!this.f6793OooOoo) {
            OooO(0);
            OooO0oO();
            return;
        }
        int i = this.f6790OooOoO;
        if (i == 1) {
            this.f6780OooOOOO.start();
        } else if (i == 2) {
            this.f6781OooOOOo.start();
        } else if (i == 3) {
            this.f6794OooOoo0 = true;
        } else if (i == 4) {
            return;
        }
        OooO0oO();
    }
}
