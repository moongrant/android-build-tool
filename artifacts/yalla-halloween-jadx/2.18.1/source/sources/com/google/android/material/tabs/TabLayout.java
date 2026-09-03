package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o0000OO0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o0Oo0oo;
import p084o000Ooo.o0OOO0o;
import p105o000oo0o.o00Ooo;
import p337o0OO0o0.OooOOOO;
import p337o0OO0o0.OooOo;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public static final int f17754o000000 = Oooo000.Widget_Design_TabLayout;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public static final o000OO0O.OooO<OooOO0O> f17755o000000O = new o000OO0O.OooOO0O(16);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f17756Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ArrayList<OooOO0O> f17757Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooOO0O f17758Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final OooOO0 f17759Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17760OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f17761OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f17762OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17763OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ColorStateList f17764OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ColorStateList f17765OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NonNull
    public Drawable f17766OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f17767OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public PorterDuff.Mode f17768OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f17769OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f17770Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final int f17771Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f17772OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f17773OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final int f17774OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17775Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final int f17776Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f17777OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f17778Ooooooo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final o000OO0O.OooO<TabView> f17779o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ColorStateList f17780o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f17781o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f17782o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f17783o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f17784o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final ArrayList<OooO0OO> f17785o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f17786o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public boolean f17787o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f17788o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public OooOOO0 f17789o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @Nullable
    public o00Ooo f17790o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public OooO f17791o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f17792o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @Nullable
    public OooOOO f17793o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public ValueAnimator f17794o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @Nullable
    public ViewPager f17795o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public com.google.android.material.tabs.OooO00o f17796oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public OooO0O0 f17797oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f17798ooOO;

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    public class OooO extends DataSetObserver {
        public OooO() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.OooO0oo();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.OooO0oo();
        }
    }

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class OooO0O0 implements ViewPager.OooOO0O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f17801Oooo0o;

        public OooO0O0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOO0O
        public final void OooO00o(@NonNull ViewPager viewPager, @Nullable o00Ooo o00ooo2, @Nullable o00Ooo o00ooo3) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17795o0ooOoO == viewPager) {
                tabLayout.OooOO0(o00ooo3, this.f17801Oooo0o);
            }
        }
    }

    @Deprecated
    public interface OooO0OO<T extends OooOO0O> {
        void OooO00o();

        void OooO0O0(T t);

        void OooO0OO();
    }

    public interface OooO0o extends OooO0OO<OooOO0O> {
    }

    public class OooOO0 extends LinearLayout {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public static final /* synthetic */ int f17803OoooO0 = 0;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f17804Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ValueAnimator f17805Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f17806Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public float f17807Oooo0oo;

        public class OooO00o implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ View f17809Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ View f17810Oooo0oO;

            public OooO00o(View view, View view2) {
                this.f17809Oooo0o = view;
                this.f17810Oooo0oO = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                OooOO0.this.OooO0OO(this.f17809Oooo0o, this.f17810Oooo0oO, valueAnimator.getAnimatedFraction());
            }
        }

        public class OooO0O0 extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ int f17812Oooo0o;

            public OooO0O0(int i) {
                this.f17812Oooo0o = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                OooOO0.this.f17806Oooo0oO = this.f17812Oooo0o;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                OooOO0.this.f17806Oooo0oO = this.f17812Oooo0o;
            }
        }

        public OooOO0(Context context) {
            super(context);
            this.f17806Oooo0oO = -1;
            this.f17804Oooo = -1;
            setWillNotDraw(false);
        }

        public final void OooO00o() {
            View childAt = getChildAt(this.f17806Oooo0oO);
            TabLayout tabLayout = TabLayout.this;
            com.google.android.material.tabs.OooO00o oooO00o = tabLayout.f17796oo000o;
            Drawable drawable = tabLayout.f17766OoooOOo;
            Objects.requireNonNull(oooO00o);
            RectF rectFOooO00o = com.google.android.material.tabs.OooO00o.OooO00o(tabLayout, childAt);
            drawable.setBounds((int) rectFOooO00o.left, drawable.getBounds().top, (int) rectFOooO00o.right, drawable.getBounds().bottom);
        }

        public final void OooO0O0(int i) {
            Rect bounds = TabLayout.this.f17766OoooOOo.getBounds();
            TabLayout.this.f17766OoooOOo.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void OooO0OO(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f17796oo000o.OooO0O0(tabLayout, view, view2, f, tabLayout.f17766OoooOOo);
            } else {
                Drawable drawable = TabLayout.this.f17766OoooOOo;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f17766OoooOOo.getBounds().bottom);
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }

        public final void OooO0Oo(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f17806Oooo0oO);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                OooO00o();
                return;
            }
            OooO00o oooO00o = new OooO00o(childAt, childAt2);
            if (!z) {
                this.f17805Oooo0o.removeAllUpdateListeners();
                this.f17805Oooo0o.addUpdateListener(oooO00o);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17805Oooo0o = valueAnimator;
            valueAnimator.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            valueAnimator.addUpdateListener(oooO00o);
            valueAnimator.addListener(new OooO0O0(i));
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(@NonNull Canvas canvas) {
            int iHeight = TabLayout.this.f17766OoooOOo.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f17766OoooOOo.getIntrinsicHeight();
            }
            int i = TabLayout.this.f17792o0OoOo0;
            int height = 0;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i == 1) {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            } else if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f17766OoooOOo.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f17766OoooOOo.getBounds();
                TabLayout.this.f17766OoooOOo.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableOooO0o0 = tabLayout.f17766OoooOOo;
                if (tabLayout.f17767OoooOo0 != 0) {
                    drawableOooO0o0 = o0OOO0o.OooO0o0(drawableOooO0o0);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawableOooO0o0.setColorFilter(TabLayout.this.f17767OoooOo0, PorterDuff.Mode.SRC_IN);
                    } else {
                        o0OOO0o.OooO0O0.OooO0oO(drawableOooO0o0, TabLayout.this.f17767OoooOo0);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawableOooO0o0.setColorFilter(null);
                } else {
                    o0OOO0o.OooO0O0.OooO0oo(drawableOooO0o0, null);
                }
                drawableOooO0o0.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f17805Oooo0o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                OooO00o();
            } else {
                OooO0Oo(false, this.f17806Oooo0oO, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f17777OoooooO == 1 || tabLayout.f17798ooOO == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.o00Ooo.OooO0O0(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            layoutParams.width = iMax;
                            layoutParams.weight = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f17777OoooooO = 0;
                    tabLayout2.OooOOOO(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f17804Oooo == i) {
                return;
            }
            requestLayout();
            this.f17804Oooo = i;
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Drawable f17814OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public CharSequence f17815OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public CharSequence f17816OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public TabLayout f17818OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public View f17819OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NonNull
        public TabView f17820OooO0oO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17817OooO0Oo = -1;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f17821OooO0oo = -1;

        @NonNull
        public final OooOO0O OooO00o(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f17816OooO0OO) && !TextUtils.isEmpty(charSequence)) {
                this.f17820OooO0oO.setContentDescription(charSequence);
            }
            this.f17815OooO0O0 = charSequence;
            OooO0O0();
            return this;
        }

        public final void OooO0O0() {
            TabView tabView = this.f17820OooO0oO;
            if (tabView != null) {
                tabView.OooO0oO();
            }
        }
    }

    public static class OooOOO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ViewPager f17822OooO00o;

        public OooOOO(ViewPager viewPager) {
            this.f17822OooO00o = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.OooO0OO
        public final void OooO00o() {
        }

        @Override // com.google.android.material.tabs.TabLayout.OooO0OO
        public final void OooO0O0(@NonNull OooOO0O oooOO0O) {
            this.f17822OooO00o.setCurrentItem(oooOO0O.f17817OooO0Oo);
        }

        @Override // com.google.android.material.tabs.TabLayout.OooO0OO
        public final void OooO0OO() {
        }
    }

    public static class OooOOO0 implements ViewPager.OooOOO0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NonNull
        public final WeakReference<TabLayout> f17823Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f17824Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f17825Oooo0oo;

        public OooOOO0(TabLayout tabLayout) {
            this.f17823Oooo0o = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            this.f17824Oooo0oO = this.f17825Oooo0oo;
            this.f17825Oooo0oo = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f17823Oooo0o.get();
            if (tabLayout != null) {
                int i3 = this.f17825Oooo0oo;
                tabLayout.OooOO0O(i, f, i3 != 2 || this.f17824Oooo0oO == 1, (i3 == 2 && this.f17824Oooo0oO == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            TabLayout tabLayout = this.f17823Oooo0o.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f17825Oooo0oo;
            tabLayout.OooO((i < 0 || i >= tabLayout.getTabCount()) ? null : tabLayout.f17757Oooo0o.get(i), i2 == 0 || (i2 == 2 && this.f17824Oooo0oO == 0));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TabIndicatorGravity {
    }

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public static final /* synthetic */ int f17826OoooOOo = 0;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @Nullable
        public View f17827Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOO0O f17828Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public TextView f17829Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public ImageView f17830Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @Nullable
        public ImageView f17831OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @Nullable
        public View f17832OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @Nullable
        public BadgeDrawable f17833OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @Nullable
        public TextView f17834OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @Nullable
        public Drawable f17835OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f17837o000oOoO;

        public TabView(Context context) {
            super(context);
            this.f17837o000oOoO = 2;
            OooO0oo(context);
            int i = TabLayout.this.f17756Oooo;
            int i2 = TabLayout.this.f17762OoooO00;
            int i3 = TabLayout.this.f17761OoooO0;
            int i4 = TabLayout.this.f17763OoooO0O;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO.OooOO0O(this, i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.f17781o00O0O ? 1 : 0);
            setClickable(true);
            ViewCompat.OooOoO(this, o0Oo0oo.OooO00o(getContext()));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f17833OoooO00;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f17833OoooO00 == null) {
                Context context = getContext();
                int i = BadgeDrawable.f16478OoooOoo;
                int i2 = BadgeDrawable.f16477OoooOoO;
                this.f17833OoooO00 = new BadgeDrawable(context, null);
            }
            OooO0o0();
            BadgeDrawable badgeDrawable = this.f17833OoooO00;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void OooO(@Nullable TextView textView, @Nullable ImageView imageView) {
            Drawable drawable;
            OooOO0O oooOO0O = this.f17828Oooo0o;
            Drawable drawableMutate = (oooOO0O == null || (drawable = oooOO0O.f17814OooO00o) == null) ? null : o0OOO0o.OooO0o0(drawable).mutate();
            if (drawableMutate != null) {
                o0OOO0o.OooO0O0.OooO0oo(drawableMutate, TabLayout.this.f17780o000oOoO);
                PorterDuff.Mode mode = TabLayout.this.f17768OoooOoO;
                if (mode != null) {
                    o0OOO0o.OooO0O0.OooO(drawableMutate, mode);
                }
            }
            OooOO0O oooOO0O2 = this.f17828Oooo0o;
            CharSequence charSequence = oooOO0O2 != null ? oooOO0O2.f17815OooO0O0 : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    Objects.requireNonNull(this.f17828Oooo0o);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iOooO0O0 = (z && imageView.getVisibility() == 0) ? (int) com.google.android.material.internal.o00Ooo.OooO0O0(getContext(), 8) : 0;
                if (TabLayout.this.f17781o00O0O) {
                    if (iOooO0O0 != o000O0O0.OooOO0.OooO0O0(marginLayoutParams)) {
                        o000O0O0.OooOO0.OooO0oO(marginLayoutParams, iOooO0O0);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iOooO0O0 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iOooO0O0;
                    o000O0O0.OooOO0.OooO0oO(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            OooOO0O oooOO0O3 = this.f17828Oooo0o;
            CharSequence charSequence2 = oooOO0O3 != null ? oooOO0O3.f17816OooO0OO : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                o0000OO0.OooO00o(this, charSequence);
            }
        }

        public final void OooO00o(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        public final boolean OooO0O0() {
            return this.f17833OoooO00 != null;
        }

        public final void OooO0OO(@Nullable View view) {
            if (OooO0O0() && view != null) {
                OooO00o(false);
                com.google.android.material.badge.OooO00o.OooO00o(this.f17833OoooO00, view);
                this.f17827Oooo = view;
            }
        }

        public final void OooO0Oo() {
            if (OooO0O0()) {
                OooO00o(true);
                View view = this.f17827Oooo;
                if (view != null) {
                    com.google.android.material.badge.OooO00o.OooO0O0(this.f17833OoooO00, view);
                    this.f17827Oooo = null;
                }
            }
        }

        public final void OooO0o(@NonNull View view) {
            if (OooO0O0() && view == this.f17827Oooo) {
                com.google.android.material.badge.OooO00o.OooO0OO(this.f17833OoooO00, view);
            }
        }

        public final void OooO0o0() {
            OooOO0O oooOO0O;
            OooOO0O oooOO0O2;
            if (OooO0O0()) {
                if (this.f17832OoooO0 != null) {
                    OooO0Oo();
                    return;
                }
                ImageView imageView = this.f17830Oooo0oo;
                if (imageView != null && (oooOO0O2 = this.f17828Oooo0o) != null && oooOO0O2.f17814OooO00o != null) {
                    if (this.f17827Oooo == imageView) {
                        OooO0o(imageView);
                        return;
                    } else {
                        OooO0Oo();
                        OooO0OO(this.f17830Oooo0oo);
                        return;
                    }
                }
                if (this.f17829Oooo0oO == null || (oooOO0O = this.f17828Oooo0o) == null) {
                    OooO0Oo();
                    return;
                }
                Objects.requireNonNull(oooOO0O);
                View view = this.f17827Oooo;
                TextView textView = this.f17829Oooo0oO;
                if (view == textView) {
                    OooO0o(textView);
                } else {
                    OooO0Oo();
                    OooO0OO(this.f17829Oooo0oO);
                }
            }
        }

        public final void OooO0oO() {
            OooOO0O oooOO0O = this.f17828Oooo0o;
            View view = oooOO0O != null ? oooOO0O.f17819OooO0o0 : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f17832OoooO0 = view;
                TextView textView = this.f17829Oooo0oO;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f17830Oooo0oo;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f17830Oooo0oo.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f17834OoooO0O = textView2;
                if (textView2 != null) {
                    this.f17837o000oOoO = TextViewCompat.OooO00o.OooO0O0(textView2);
                }
                this.f17831OoooO = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view2 = this.f17832OoooO0;
                if (view2 != null) {
                    removeView(view2);
                    this.f17832OoooO0 = null;
                }
                this.f17834OoooO0O = null;
                this.f17831OoooO = null;
            }
            boolean z = false;
            if (this.f17832OoooO0 == null) {
                if (this.f17830Oooo0oo == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(OooOOOO.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f17830Oooo0oo = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f17829Oooo0oO == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(OooOOOO.design_layout_tab_text, (ViewGroup) this, false);
                    this.f17829Oooo0oO = textView3;
                    addView(textView3);
                    this.f17837o000oOoO = TextViewCompat.OooO00o.OooO0O0(this.f17829Oooo0oO);
                }
                TextViewCompat.OooO0o(this.f17829Oooo0oO, TabLayout.this.f17760OoooO);
                ColorStateList colorStateList = TabLayout.this.f17764OoooOO0;
                if (colorStateList != null) {
                    this.f17829Oooo0oO.setTextColor(colorStateList);
                }
                OooO(this.f17829Oooo0oO, this.f17830Oooo0oo);
                OooO0o0();
                ImageView imageView3 = this.f17830Oooo0oo;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.OooO0O0(this, imageView3));
                }
                TextView textView4 = this.f17829Oooo0oO;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new com.google.android.material.tabs.OooO0O0(this, textView4));
                }
            } else {
                TextView textView5 = this.f17834OoooO0O;
                if (textView5 != null || this.f17831OoooO != null) {
                    OooO(textView5, this.f17831OoooO);
                }
            }
            if (oooOO0O != null && !TextUtils.isEmpty(oooOO0O.f17816OooO0OO)) {
                setContentDescription(oooOO0O.f17816OooO0OO);
            }
            if (oooOO0O != null) {
                TabLayout tabLayout = oooOO0O.f17818OooO0o;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == oooOO0O.f17817OooO0Oo) {
                    z = true;
                }
            }
            setSelected(z);
        }

        public final void OooO0oo(Context context) {
            GradientDrawable gradientDrawable;
            int i = TabLayout.this.f17771Ooooo0o;
            if (i != 0) {
                Drawable drawableOooO0O0 = p012OooOo0.OooOO0O.OooO0O0(context, i);
                this.f17835OoooOO0 = drawableOooO0O0;
                if (drawableOooO0O0 != null && drawableOooO0O0.isStateful()) {
                    this.f17835OoooOO0.setState(getDrawableState());
                }
            } else {
                this.f17835OoooOO0 = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f17765OoooOOO != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListOooO00o = o0OOO0OO.OooO0O0.OooO00o(TabLayout.this.f17765OoooOOO);
                boolean z = TabLayout.this.f17787o00ooo;
                if (z) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListOooO00o, gradientDrawable, z ? null : gradientDrawable3);
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f17835OoooOO0;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f17835OoooOO0.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f17829Oooo0oO, this.f17830Oooo0oo, this.f17832OoooO0};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f17829Oooo0oO, this.f17830Oooo0oo, this.f17832OoooO0};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        @Nullable
        public OooOO0O getTab() {
            return this.f17828Oooo0o;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f17833OoooO00;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f17833OoooO00.OooO0OO()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o000O0o0.o0000OO0.OooO0OO.OooO00o(0, 1, this.f17828Oooo0o.f17817OooO0Oo, 1, isSelected()).f28217OooO00o);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o000O0o0.o0000OO0.OooO00o.f28200OooO0oO.f28212OooO00o);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(OooOo.item_view_role_description));
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f17772OooooO0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f17829Oooo0oO != null) {
                float f = TabLayout.this.f17769OoooOoo;
                int i3 = this.f17837o000oOoO;
                ImageView imageView = this.f17830Oooo0oo;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f17829Oooo0oO;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f17770Ooooo00;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f17829Oooo0oO.getTextSize();
                int lineCount = this.f17829Oooo0oO.getLineCount();
                int iOooO0O0 = TextViewCompat.OooO00o.OooO0O0(this.f17829Oooo0oO);
                if (f != textSize || (iOooO0O0 >= 0 && i3 != iOooO0O0)) {
                    if (TabLayout.this.f17798ooOO == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f17829Oooo0oO.getLayout();
                        if (layout != null) {
                            if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f17829Oooo0oO.setTextSize(0, f);
                        this.f17829Oooo0oO.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f17828Oooo0o == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            OooOO0O oooOO0O = this.f17828Oooo0o;
            TabLayout tabLayout = oooOO0O.f17818OooO0o;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.OooO(oooOO0O, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f17829Oooo0oO;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f17830Oooo0oo;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f17832OoooO0;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable OooOO0O oooOO0O) {
            if (oooOO0O != this.f17828Oooo0o) {
                this.f17828Oooo0o = oooOO0O;
                OooO0oO();
            }
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f17757Oooo0o.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            OooOO0O oooOO0O = this.f17757Oooo0o.get(i);
            if (oooOO0O != null && oooOO0O.f17814OooO00o != null && !TextUtils.isEmpty(oooOO0O.f17815OooO0O0)) {
                z = true;
                break;
            }
        }
        return (!z || this.f17781o00O0O) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f17773OooooOO;
        if (i != -1) {
            return i;
        }
        int i2 = this.f17798ooOO;
        if (i2 == 0 || i2 == 2) {
            return this.f17776Oooooo0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f17759Oooo0oo.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f17759Oooo0oo.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f17759Oooo0oo.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void OooO(@Nullable OooOO0O oooOO0O, boolean z) {
        OooOO0O oooOO0O2 = this.f17758Oooo0oO;
        if (oooOO0O2 == oooOO0O) {
            if (oooOO0O2 != null) {
                for (int size = this.f17785o00oO0O.size() - 1; size >= 0; size--) {
                    this.f17785o00oO0O.get(size).OooO00o();
                }
                OooO0OO(oooOO0O.f17817OooO0Oo);
                return;
            }
            return;
        }
        int i = oooOO0O != null ? oooOO0O.f17817OooO0Oo : -1;
        if (z) {
            if ((oooOO0O2 == null || oooOO0O2.f17817OooO0Oo == -1) && i != -1) {
                OooOO0O(i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true, true);
            } else {
                OooO0OO(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f17758Oooo0oO = oooOO0O;
        if (oooOO0O2 != null) {
            for (int size2 = this.f17785o00oO0O.size() - 1; size2 >= 0; size2--) {
                this.f17785o00oO0O.get(size2).OooO0OO();
            }
        }
        if (oooOO0O != null) {
            for (int size3 = this.f17785o00oO0O.size() - 1; size3 >= 0; size3--) {
                this.f17785o00oO0O.get(size3).OooO0O0(oooOO0O);
            }
        }
    }

    public final void OooO00o(@NonNull OooOO0O oooOO0O, boolean z) {
        int size = this.f17757Oooo0o.size();
        if (oooOO0O.f17818OooO0o != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        oooOO0O.f17817OooO0Oo = size;
        this.f17757Oooo0o.add(size, oooOO0O);
        int size2 = this.f17757Oooo0o.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f17757Oooo0o.get(size).f17817OooO0Oo = size;
            }
        }
        TabView tabView = oooOO0O.f17820OooO0oO;
        tabView.setSelected(false);
        tabView.setActivated(false);
        OooOO0 oooOO1 = this.f17759Oooo0oo;
        int i = oooOO0O.f17817OooO0Oo;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        OooOOO(layoutParams);
        oooOO1.addView(tabView, i, layoutParams);
        if (z) {
            TabLayout tabLayout = oooOO0O.f17818OooO0o;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.OooO(oooOO0O, true);
        }
    }

    public final void OooO0O0(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        OooOO0O oooOO0OOooO0oO = OooO0oO();
        CharSequence charSequence = tabItem.f17751Oooo0o;
        if (charSequence != null) {
            oooOO0OOooO0oO.OooO00o(charSequence);
        }
        Drawable drawable = tabItem.f17752Oooo0oO;
        if (drawable != null) {
            oooOO0OOooO0oO.f17814OooO00o = drawable;
            TabLayout tabLayout = oooOO0OOooO0oO.f17818OooO0o;
            if (tabLayout.f17777OoooooO == 1 || tabLayout.f17798ooOO == 2) {
                tabLayout.OooOOOO(true);
            }
            oooOO0OOooO0oO.OooO0O0();
        }
        int i = tabItem.f17753Oooo0oo;
        if (i != 0) {
            oooOO0OOooO0oO.f17819OooO0o0 = LayoutInflater.from(oooOO0OOooO0oO.f17820OooO0oO.getContext()).inflate(i, (ViewGroup) oooOO0OOooO0oO.f17820OooO0oO, false);
            oooOO0OOooO0oO.OooO0O0();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            oooOO0OOooO0oO.f17816OooO0OO = tabItem.getContentDescription();
            oooOO0OOooO0oO.OooO0O0();
        }
        OooO00o(oooOO0OOooO0oO, this.f17757Oooo0o.isEmpty());
    }

    public final void OooO0OO(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                OooOO0 oooOO1 = this.f17759Oooo0oo;
                int childCount = oooOO1.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else {
                        if (oooOO1.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int iOooO0o0 = OooO0o0(i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    if (scrollX != iOooO0o0) {
                        OooO0o();
                        this.f17794o0ooOOo.setIntValues(scrollX, iOooO0o0);
                        this.f17794o0ooOOo.start();
                    }
                    OooOO0 oooOO2 = this.f17759Oooo0oo;
                    int i3 = this.f17778Ooooooo;
                    ValueAnimator valueAnimator = oooOO2.f17805Oooo0o;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        oooOO2.f17805Oooo0o.cancel();
                    }
                    oooOO2.OooO0Oo(true, i, i3);
                    return;
                }
            }
        }
        OooOO0O(i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true, true);
    }

    public final void OooO0Oo() {
        int i = this.f17798ooOO;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f17775Oooooo - this.f17756Oooo) : 0;
        OooOO0 oooOO1 = this.f17759Oooo0oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO.OooOO0O(oooOO1, iMax, 0, 0, 0);
        int i2 = this.f17798ooOO;
        if (i2 == 0) {
            int i3 = this.f17777OoooooO;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                this.f17759Oooo0oo.setGravity(1);
            } else if (i3 == 2) {
            }
            this.f17759Oooo0oo.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f17777OoooooO == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f17759Oooo0oo.setGravity(1);
        }
        OooOOOO(true);
    }

    public final void OooO0o() {
        if (this.f17794o0ooOOo == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17794o0ooOOo = valueAnimator;
            valueAnimator.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
            this.f17794o0ooOOo.setDuration(this.f17778Ooooooo);
            this.f17794o0ooOOo.addUpdateListener(new OooO00o());
        }
    }

    public final int OooO0o0(int i, float f) {
        View childAt;
        int i2 = this.f17798ooOO;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f17759Oooo0oo.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < this.f17759Oooo0oo.getChildCount() ? this.f17759Oooo0oo.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 0 ? left + i4 : left - i4;
    }

    @NonNull
    public final OooOO0O OooO0oO() {
        OooOO0O oooOO0OOooO0O0 = f17755o000000O.OooO0O0();
        if (oooOO0OOooO0O0 == null) {
            oooOO0OOooO0O0 = new OooOO0O();
        }
        oooOO0OOooO0O0.f17818OooO0o = this;
        o000OO0O.OooO<TabView> oooO = this.f17779o000OOo;
        TabView tabViewOooO0O0 = oooO != null ? oooO.OooO0O0() : null;
        if (tabViewOooO0O0 == null) {
            tabViewOooO0O0 = new TabView(getContext());
        }
        tabViewOooO0O0.setTab(oooOO0OOooO0O0);
        tabViewOooO0O0.setFocusable(true);
        tabViewOooO0O0.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(oooOO0OOooO0O0.f17816OooO0OO)) {
            tabViewOooO0O0.setContentDescription(oooOO0OOooO0O0.f17815OooO0O0);
        } else {
            tabViewOooO0O0.setContentDescription(oooOO0OOooO0O0.f17816OooO0OO);
        }
        oooOO0OOooO0O0.f17820OooO0oO = tabViewOooO0O0;
        int i = oooOO0OOooO0O0.f17821OooO0oo;
        if (i != -1) {
            tabViewOooO0O0.setId(i);
        }
        return oooOO0OOooO0O0;
    }

    public final void OooO0oo() {
        OooOO0O oooOO0O;
        int currentItem;
        int childCount = this.f17759Oooo0oo.getChildCount() - 1;
        while (true) {
            oooOO0O = null;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) this.f17759Oooo0oo.getChildAt(childCount);
            this.f17759Oooo0oo.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f17779o000OOo.OooO00o(tabView);
            }
            requestLayout();
            childCount--;
        }
        Iterator<OooOO0O> it = this.f17757Oooo0o.iterator();
        while (it.hasNext()) {
            OooOO0O next = it.next();
            it.remove();
            next.f17818OooO0o = null;
            next.f17820OooO0oO = null;
            next.f17814OooO00o = null;
            next.f17821OooO0oo = -1;
            next.f17815OooO0O0 = null;
            next.f17816OooO0OO = null;
            next.f17817OooO0Oo = -1;
            next.f17819OooO0o0 = null;
            f17755o000000O.OooO00o(next);
        }
        this.f17758Oooo0oO = null;
        o00Ooo o00ooo2 = this.f17790o0OOO0o;
        if (o00ooo2 != null) {
            int iOooO0OO = o00ooo2.OooO0OO();
            for (int i = 0; i < iOooO0OO; i++) {
                OooOO0O oooOO0OOooO0oO = OooO0oO();
                oooOO0OOooO0oO.OooO00o(this.f17790o0OOO0o.OooO0o0(i));
                OooO00o(oooOO0OOooO0oO, false);
            }
            ViewPager viewPager = this.f17795o0ooOoO;
            if (viewPager == null || iOooO0OO <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                oooOO0O = this.f17757Oooo0o.get(currentItem);
            }
            OooO(oooOO0O, true);
        }
    }

    public final void OooOO0(@Nullable o00Ooo o00ooo2, boolean z) {
        OooO oooO;
        o00Ooo o00ooo3 = this.f17790o0OOO0o;
        if (o00ooo3 != null && (oooO = this.f17791o0Oo0oo) != null) {
            o00ooo3.OooOOOO(oooO);
        }
        this.f17790o0OOO0o = o00ooo2;
        if (z && o00ooo2 != null) {
            if (this.f17791o0Oo0oo == null) {
                this.f17791o0Oo0oo = new OooO();
            }
            o00ooo2.OooOO0(this.f17791o0Oo0oo);
        }
        OooO0oo();
    }

    public final void OooOO0O(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f17759Oooo0oo.getChildCount()) {
            return;
        }
        if (z2) {
            OooOO0 oooOO1 = this.f17759Oooo0oo;
            ValueAnimator valueAnimator = oooOO1.f17805Oooo0o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                oooOO1.f17805Oooo0o.cancel();
            }
            oooOO1.f17806Oooo0oO = i;
            oooOO1.f17807Oooo0oo = f;
            oooOO1.OooO0OO(oooOO1.getChildAt(i), oooOO1.getChildAt(oooOO1.f17806Oooo0oO + 1), oooOO1.f17807Oooo0oo);
        }
        ValueAnimator valueAnimator2 = this.f17794o0ooOOo;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f17794o0ooOOo.cancel();
        }
        scrollTo(i < 0 ? 0 : OooO0o0(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOO0o(@Nullable ViewPager viewPager, boolean z) {
        List<ViewPager.OooOO0O> list;
        ViewPager viewPager2 = this.f17795o0ooOoO;
        if (viewPager2 != null) {
            OooOOO0 oooOOO0 = this.f17789o0OO00O;
            if (oooOOO0 != null) {
                viewPager2.OooOo0O(oooOOO0);
            }
            OooO0O0 oooO0O0 = this.f17797oo0o0Oo;
            if (oooO0O0 != null && (list = this.f17795o0ooOoO.f9672o00000) != 0) {
                list.remove(oooO0O0);
            }
        }
        OooOOO oooOOO = this.f17793o0ooOO0;
        if (oooOOO != null) {
            this.f17785o00oO0O.remove(oooOOO);
            this.f17793o0ooOO0 = null;
        }
        if (viewPager != null) {
            this.f17795o0ooOoO = viewPager;
            if (this.f17789o0OO00O == null) {
                this.f17789o0OO00O = new OooOOO0(this);
            }
            OooOOO0 oooOOO1 = this.f17789o0OO00O;
            oooOOO1.f17825Oooo0oo = 0;
            oooOOO1.f17824Oooo0oO = 0;
            viewPager.OooO0O0(oooOOO1);
            OooOOO oooOOO2 = new OooOOO(viewPager);
            this.f17793o0ooOO0 = oooOOO2;
            if (!this.f17785o00oO0O.contains(oooOOO2)) {
                this.f17785o00oO0O.add(oooOOO2);
            }
            o00Ooo adapter = viewPager.getAdapter();
            if (adapter != null) {
                OooOO0(adapter, true);
            }
            if (this.f17797oo0o0Oo == null) {
                this.f17797oo0o0Oo = new OooO0O0();
            }
            OooO0O0 oooO0O1 = this.f17797oo0o0Oo;
            oooO0O1.f17801Oooo0o = true;
            if (viewPager.f9672o00000 == null) {
                viewPager.f9672o00000 = new ArrayList();
            }
            viewPager.f9672o00000.add(oooO0O1);
            OooOO0O(viewPager.getCurrentItem(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true, true);
        } else {
            this.f17795o0ooOoO = null;
            OooOO0(null, false);
        }
        this.f17788o0O0O00 = z;
    }

    public final void OooOOO(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f17798ooOO == 1 && this.f17777OoooooO == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
    }

    public final void OooOOO0() {
        int size = this.f17757Oooo0o.size();
        for (int i = 0; i < size; i++) {
            this.f17757Oooo0o.get(i).OooO0O0();
        }
    }

    public final void OooOOOO(boolean z) {
        for (int i = 0; i < this.f17759Oooo0oo.getChildCount(); i++) {
            View childAt = this.f17759Oooo0oo.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            OooOOO((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        OooO0O0(view);
    }

    public int getSelectedTabPosition() {
        OooOO0O oooOO0O = this.f17758Oooo0oO;
        if (oooOO0O != null) {
            return oooOO0O.f17817OooO0Oo;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f17757Oooo0o.size();
    }

    public int getTabGravity() {
        return this.f17777OoooooO;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f17780o000oOoO;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f17784o00o0O;
    }

    public int getTabIndicatorGravity() {
        return this.f17792o0OoOo0;
    }

    public int getTabMaxWidth() {
        return this.f17772OooooO0;
    }

    public int getTabMode() {
        return this.f17798ooOO;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f17765OoooOOO;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f17766OoooOOo;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f17764OoooOO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0OO(this);
        if (this.f17795o0ooOoO == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                OooOO0o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17788o0O0O00) {
            setupWithViewPager(null);
            this.f17788o0O0O00 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        for (int i = 0; i < this.f17759Oooo0oo.getChildCount(); i++) {
            View childAt = this.f17759Oooo0oo.getChildAt(i);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f17835OoooOO0) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f17835OoooOO0.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o000O0o0.o0000OO0.OooO0O0.OooO00o(1, getTabCount(), false, 1).f28216OooO00o);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(com.google.android.material.internal.o00Ooo.OooO0O0(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iOooO0O0 = this.f17774OooooOo;
            if (iOooO0O0 <= 0) {
                iOooO0O0 = (int) (size - com.google.android.material.internal.o00Ooo.OooO0O0(getContext(), 56));
            }
            this.f17772OooooO0 = iOooO0O0;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f17798ooOO;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z = true;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z = true;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (!(getTabMode() == 0 || getTabMode() == 2)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        o0O0O00.OooO0O0(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f17781o00O0O != z) {
            this.f17781o00O0O = z;
            for (int i = 0; i < this.f17759Oooo0oo.getChildCount(); i++) {
                View childAt = this.f17759Oooo0oo.getChildAt(i);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    tabView.setOrientation(!TabLayout.this.f17781o00O0O ? 1 : 0);
                    TextView textView = tabView.f17834OoooO0O;
                    if (textView == null && tabView.f17831OoooO == null) {
                        tabView.OooO(tabView.f17829Oooo0oO, tabView.f17830Oooo0oo);
                    } else {
                        tabView.OooO(textView, tabView.f17831OoooO);
                    }
                }
            }
            OooO0Oo();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OooO0o oooO0o) {
        setOnTabSelectedListener((OooO0OO) oooO0o);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        OooO0o();
        this.f17794o0ooOOo.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.f17766OoooOOo != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f17766OoooOOo = drawable;
            int intrinsicHeight = this.f17783o00Ooo;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.f17759Oooo0oo.OooO0O0(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f17767OoooOo0 = i;
        OooOOOO(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f17792o0OoOo0 != i) {
            this.f17792o0OoOo0 = i;
            OooOO0 oooOO1 = this.f17759Oooo0oo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(oooOO1);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f17783o00Ooo = i;
        this.f17759Oooo0oo.OooO0O0(i);
    }

    public void setTabGravity(int i) {
        if (this.f17777OoooooO != i) {
            this.f17777OoooooO = i;
            OooO0Oo();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f17780o000oOoO != colorStateList) {
            this.f17780o000oOoO = colorStateList;
            OooOOO0();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(p012OooOo0.OooOO0O.OooO00o(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f17784o00o0O = i;
        if (i == 0) {
            this.f17796oo000o = new com.google.android.material.tabs.OooO00o();
            return;
        }
        if (i == 1) {
            this.f17796oo000o = new p349o0OOO0oo.OooOo();
        } else {
            if (i == 2) {
                this.f17796oo000o = new p349o0OOO0oo.Oooo000();
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f17782o00Oo0 = z;
        OooOO0 oooOO1 = this.f17759Oooo0oo;
        int i = OooOO0.f17803OoooO0;
        oooOO1.OooO00o();
        OooOO0 oooOO2 = this.f17759Oooo0oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(oooOO2);
    }

    public void setTabMode(int i) {
        if (i != this.f17798ooOO) {
            this.f17798ooOO = i;
            OooO0Oo();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f17765OoooOOO != colorStateList) {
            this.f17765OoooOOO = colorStateList;
            for (int i = 0; i < this.f17759Oooo0oo.getChildCount(); i++) {
                View childAt = this.f17759Oooo0oo.getChildAt(i);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i2 = TabView.f17826OoooOOo;
                    ((TabView) childAt).OooO0oo(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(p012OooOo0.OooOO0O.OooO00o(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f17764OoooOO0 != colorStateList) {
            this.f17764OoooOO0 = colorStateList;
            OooOOO0();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable o00Ooo o00ooo2) {
        OooOO0(o00ooo2, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f17787o00ooo != z) {
            this.f17787o00ooo = z;
            for (int i = 0; i < this.f17759Oooo0oo.getChildCount(); i++) {
                View childAt = this.f17759Oooo0oo.getChildAt(i);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i2 = TabView.f17826OoooOOo;
                    ((TabView) childAt).OooO0oo(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        OooOO0o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        OooO0O0(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = this.f17786o00oO0o;
        if (oooO0OO2 != null) {
            this.f17785o00oO0O.remove(oooO0OO2);
        }
        this.f17786o00oO0o = oooO0OO;
        if (oooO0OO == null || this.f17785o00oO0O.contains(oooO0OO)) {
            return;
        }
        this.f17785o00oO0O.add(oooO0OO);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17754o000000;
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17757Oooo0o = new ArrayList<>();
        this.f17766OoooOOo = new GradientDrawable();
        this.f17767OoooOo0 = 0;
        this.f17772OooooO0 = Integer.MAX_VALUE;
        this.f17783o00Ooo = -1;
        this.f17785o00oO0O = new ArrayList<>();
        this.f17779o000OOo = new o000OO0O.OooOO0(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        OooOO0 oooOO1 = new OooOO0(context2);
        this.f17759Oooo0oo = oooOO1;
        super.addView(oooOO1, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = Oooo0.TabLayout;
        int i3 = Oooo0.TabLayout_tabTextAppearance;
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, iArr, i, i2, i3);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.OooOOOo(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.OooOOO0(context2);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            materialShapeDrawable.OooOOOO(ViewCompat.OooOOO.OooO(this));
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
        setSelectedTabIndicator(o0OOO0O.OooO0OO.OooO0Oo(context2, typedArrayOooO0Oo, Oooo0.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayOooO0Oo.getColor(Oooo0.TabLayout_tabIndicatorColor, 0));
        oooOO1.OooO0O0(typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayOooO0Oo.getInt(Oooo0.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayOooO0Oo.getInt(Oooo0.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayOooO0Oo.getBoolean(Oooo0.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabPadding, 0);
        this.f17763OoooO0O = dimensionPixelSize;
        this.f17761OoooO0 = dimensionPixelSize;
        this.f17762OoooO00 = dimensionPixelSize;
        this.f17756Oooo = dimensionPixelSize;
        this.f17756Oooo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f17762OoooO00 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabPaddingTop, this.f17762OoooO00);
        this.f17761OoooO0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabPaddingEnd, this.f17761OoooO0);
        this.f17763OoooO0O = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabPaddingBottom, this.f17763OoooO0O);
        int resourceId = typedArrayOooO0Oo.getResourceId(i3, Oooo000.TextAppearance_Design_Tab);
        this.f17760OoooO = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, OooOo00.OooOOOO.TextAppearance);
        try {
            this.f17769OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.OooOOOO.TextAppearance_android_textSize, 0);
            this.f17764OoooOO0 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, OooOo00.OooOOOO.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            int i4 = Oooo0.TabLayout_tabTextColor;
            if (typedArrayOooO0Oo.hasValue(i4)) {
                this.f17764OoooOO0 = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i4);
            }
            int i5 = Oooo0.TabLayout_tabSelectedTextColor;
            if (typedArrayOooO0Oo.hasValue(i5)) {
                this.f17764OoooOO0 = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayOooO0Oo.getColor(i5, 0), this.f17764OoooOO0.getDefaultColor()});
            }
            this.f17780o000oOoO = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.TabLayout_tabIconTint);
            this.f17768OoooOoO = com.google.android.material.internal.o00Ooo.OooO0oO(typedArrayOooO0Oo.getInt(Oooo0.TabLayout_tabIconTintMode, -1), null);
            this.f17765OoooOOO = o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, Oooo0.TabLayout_tabRippleColor);
            this.f17778Ooooooo = typedArrayOooO0Oo.getInt(Oooo0.TabLayout_tabIndicatorAnimationDuration, ShopVehicleListModel.VehicleTagType_Vip300);
            this.f17773OooooOO = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabMinWidth, -1);
            this.f17774OooooOo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabMaxWidth, -1);
            this.f17771Ooooo0o = typedArrayOooO0Oo.getResourceId(Oooo0.TabLayout_tabBackground, 0);
            this.f17775Oooooo = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.TabLayout_tabContentStart, 0);
            this.f17798ooOO = typedArrayOooO0Oo.getInt(Oooo0.TabLayout_tabMode, 1);
            this.f17777OoooooO = typedArrayOooO0Oo.getInt(Oooo0.TabLayout_tabGravity, 0);
            this.f17781o00O0O = typedArrayOooO0Oo.getBoolean(Oooo0.TabLayout_tabInlineLabel, false);
            this.f17787o00ooo = typedArrayOooO0Oo.getBoolean(Oooo0.TabLayout_tabUnboundedRipple, false);
            typedArrayOooO0Oo.recycle();
            Resources resources = getResources();
            this.f17770Ooooo00 = resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.design_tab_text_size_2line);
            this.f17776Oooooo0 = resources.getDimensionPixelSize(p337o0OO0o0.OooOO0.design_tab_scrollable_min_width);
            OooO0Oo();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        OooO0O0(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        OooO0O0(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
