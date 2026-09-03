package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
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
import androidx.appcompat.widget.o000O0O0;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o00000OO;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0O;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import org.jctools.util.Pow2;
import p013OooOo0o.o00Oo0;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000O00;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p277o0O00Ooo.OooOOOO;
import p280o0O00o0O.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final int f17385OoooOoO = o0000O0O.Widget_Design_TabLayout;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final o000OO.OooOO0O f17386OoooOoo = new o000OO.OooOO0O(16);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f17387OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f17388OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOO0O f17389OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<OooOO0O> f17390OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final OooOO0 f17391OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f17392OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f17393OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f17394OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f17395OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f17396OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f17397OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ColorStateList f17398OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ColorStateList f17399OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public Drawable f17400OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ColorStateList f17401OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17402OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f17403OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final float f17404OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final PorterDuff.Mode f17405OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f17406OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f17407OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f17408OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f17409OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f17410OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f17411OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f17412OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f17413OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f17414OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooOOO f17415Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f17416Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f17417Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f17418Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f17419Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f17420Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f17421Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final TimeInterpolator f17422Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public com.google.android.material.tabs.OooO00o f17423Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooO0OO f17424Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final ArrayList<OooO0OO> f17425Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO f17426OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public ViewPager f17427OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ValueAnimator f17428OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public p114o00O00o.OooO0OO f17429OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOOO0 f17430OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f17431OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f17432OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o000OO.OooOO0 f17433OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO0O0 f17434o000oOoO;

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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f17437OooO0Oo;

        public OooO0O0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOO0O
        public final void OooO00o(@NonNull ViewPager viewPager, @Nullable p114o00O00o.OooO0OO oooO0OO, @Nullable p114o00O00o.OooO0OO oooO0OO2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17427OoooO0 == viewPager) {
                tabLayout.OooOO0(oooO0OO2, this.f17437OooO0Oo);
            }
        }
    }

    @Deprecated
    public interface OooO0OO<T extends OooOO0O> {
        void OooO00o(T t);

        void OooO0O0();

        void OooO0OO();
    }

    public interface OooO0o extends OooO0OO<OooOO0O> {
    }

    public class OooOO0 extends LinearLayout {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final /* synthetic */ int f17439OooO0o = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ValueAnimator f17440OooO0Oo;

        public OooOO0(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void OooO00o(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17432OoooOOo == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.OooO00o oooO00o = tabLayout.f17423Oooo0o0;
                Drawable drawable = tabLayout.f17400OooOOo;
                oooO00o.getClass();
                RectF rectFOooO00o = com.google.android.material.tabs.OooO00o.OooO00o(tabLayout, childAt);
                drawable.setBounds((int) rectFOooO00o.left, drawable.getBounds().top, (int) rectFOooO00o.right, drawable.getBounds().bottom);
                tabLayout.f17388OooO0Oo = i;
            }
        }

        public final void OooO0O0(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f17400OooOOo.getBounds();
            tabLayout.f17400OooOOo.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void OooO0OO(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f17423Oooo0o0.OooO0O0(tabLayout, view, view2, f, tabLayout.f17400OooOOo);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.f17400OooOOo;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.f17400OooOOo.getBounds().bottom);
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }

        public final void OooO0Oo(int i, int i2, boolean z) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17388OooO0Oo == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                OooO00o(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f17388OooO0Oo = i;
            com.google.android.material.tabs.OooO0O0 oooO0O0 = new com.google.android.material.tabs.OooO0O0(this, childAt, childAt2);
            if (!z) {
                this.f17440OooO0Oo.removeAllUpdateListeners();
                this.f17440OooO0Oo.addUpdateListener(oooO0O0);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17440OooO0Oo = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f17422Oooo0o);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(oooO0O0);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(@NonNull Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.f17400OooOOo.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.f17400OooOOo.getIntrinsicHeight();
            }
            int i = tabLayout.f17414OooOooo;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.f17400OooOOo.getBounds().width() > 0) {
                Rect bounds = tabLayout.f17400OooOOo.getBounds();
                tabLayout.f17400OooOOo.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.f17400OooOOo.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f17440OooO0Oo;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                OooO0Oo(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f17388OooO0Oo == -1) {
                tabLayout.f17388OooO0Oo = tabLayout.getSelectedTabPosition();
            }
            OooO00o(tabLayout.f17388OooO0Oo);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f17411OooOoo == 1 || tabLayout.f17417Oooo000 == 2) {
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
                if (iMax * childCount <= getMeasuredWidth() - (((int) oo0o0Oo.OooO0O0(16, getContext())) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.f17411OooOoo = 0;
                    tabLayout.OooOOO0(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Drawable f17443OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public CharSequence f17444OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public CharSequence f17445OooO0OO;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public View f17448OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public TabLayout f17449OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public TabView f17450OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17446OooO0Oo = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @LabelVisibility
        public final int f17447OooO0o = 1;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f17442OooO = -1;
    }

    public static class OooOOO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ViewPager f17451OooO00o;

        public OooOOO(ViewPager viewPager) {
            this.f17451OooO00o = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.OooO0OO
        public final void OooO00o(@NonNull OooOO0O oooOO0O) {
            this.f17451OooO00o.setCurrentItem(oooOO0O.f17446OooO0Oo);
        }

        @Override // com.google.android.material.tabs.TabLayout.OooO0OO
        public final void OooO0O0() {
        }

        @Override // com.google.android.material.tabs.TabLayout.OooO0OO
        public final void OooO0OO() {
        }
    }

    public static class OooOOO0 implements ViewPager.OooOOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final WeakReference<TabLayout> f17452OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f17453OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f17454OooO0o0;

        public OooOOO0(TabLayout tabLayout) {
            this.f17452OooO0Oo = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            this.f17454OooO0o0 = this.f17453OooO0o;
            this.f17453OooO0o = i;
            TabLayout tabLayout = this.f17452OooO0Oo.get();
            if (tabLayout != null) {
                tabLayout.f17432OoooOOo = this.f17453OooO0o;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f17452OooO0Oo.get();
            if (tabLayout != null) {
                int i3 = this.f17453OooO0o;
                tabLayout.OooOO0O(i, f, i3 != 2 || this.f17454OooO0o0 == 1, (i3 == 2 && this.f17454OooO0o0 == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            TabLayout tabLayout = this.f17452OooO0Oo.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f17453OooO0o;
            tabLayout.OooO((i < 0 || i >= tabLayout.getTabCount()) ? null : tabLayout.f17390OooO0o0.get(i), i2 == 0 || (i2 == 2 && this.f17454OooO0o0 == 0));
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

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final /* synthetic */ int f17455OooOOOO = 0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public View f17456OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOO0O f17457OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ImageView f17458OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f17459OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public View f17460OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public BadgeDrawable f17461OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public TextView f17462OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public ImageView f17463OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public Drawable f17464OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f17466OooOOO0;

        public TabView(Context context) {
            super(context);
            this.f17466OooOOO0 = 2;
            OooO0o0(context);
            int i = TabLayout.this.f17392OooO0oo;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO.OooOO0O(this, i, TabLayout.this.f17387OooO, TabLayout.this.f17393OooOO0, TabLayout.this.f17394OooOO0O);
            setGravity(17);
            setOrientation(!TabLayout.this.f17418Oooo00O ? 1 : 0);
            setClickable(true);
            ViewCompat.OooOOo0(this, Build.VERSION.SDK_INT >= 24 ? new o00000OO(o00000OO.OooO00o.OooO0O0(getContext(), 1002)) : new o00000OO(null));
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f17461OooO0oo;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f17461OooO0oo == null) {
                this.f17461OooO0oo = new BadgeDrawable(getContext(), null);
            }
            OooO0O0();
            BadgeDrawable badgeDrawable = this.f17461OooO0oo;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void OooO00o() {
            if (this.f17461OooO0oo != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f17460OooO0oO;
                if (view != null) {
                    BadgeDrawable badgeDrawable = this.f17461OooO0oo;
                    if (badgeDrawable != null) {
                        if (badgeDrawable.OooO0Oo() != null) {
                            badgeDrawable.OooO0Oo().setForeground(null);
                        } else {
                            view.getOverlay().remove(badgeDrawable);
                        }
                    }
                    this.f17460OooO0oO = null;
                }
            }
        }

        public final void OooO0O0() {
            OooOO0O oooOO0O;
            OooOO0O oooOO0O2;
            if (this.f17461OooO0oo != null) {
                if (this.f17456OooO != null) {
                    OooO00o();
                    return;
                }
                ImageView imageView = this.f17458OooO0o;
                if (imageView != null && (oooOO0O2 = this.f17457OooO0Oo) != null && oooOO0O2.f17443OooO00o != null) {
                    if (this.f17460OooO0oO == imageView) {
                        OooO0OO(imageView);
                        return;
                    }
                    OooO00o();
                    ImageView imageView2 = this.f17458OooO0o;
                    if ((this.f17461OooO0oo != null) && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        BadgeDrawable badgeDrawable = this.f17461OooO0oo;
                        Rect rect = new Rect();
                        imageView2.getDrawingRect(rect);
                        badgeDrawable.setBounds(rect);
                        badgeDrawable.OooO0oo(imageView2, null);
                        if (badgeDrawable.OooO0Oo() != null) {
                            badgeDrawable.OooO0Oo().setForeground(badgeDrawable);
                        } else {
                            imageView2.getOverlay().add(badgeDrawable);
                        }
                        this.f17460OooO0oO = imageView2;
                        return;
                    }
                    return;
                }
                TextView textView = this.f17459OooO0o0;
                if (textView == null || (oooOO0O = this.f17457OooO0Oo) == null || oooOO0O.f17447OooO0o != 1) {
                    OooO00o();
                    return;
                }
                if (this.f17460OooO0oO == textView) {
                    OooO0OO(textView);
                    return;
                }
                OooO00o();
                TextView textView2 = this.f17459OooO0o0;
                if ((this.f17461OooO0oo != null) && textView2 != null) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup2 = (ViewGroup) getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.setClipChildren(false);
                        viewGroup2.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable2 = this.f17461OooO0oo;
                    Rect rect2 = new Rect();
                    textView2.getDrawingRect(rect2);
                    badgeDrawable2.setBounds(rect2);
                    badgeDrawable2.OooO0oo(textView2, null);
                    if (badgeDrawable2.OooO0Oo() != null) {
                        badgeDrawable2.OooO0Oo().setForeground(badgeDrawable2);
                    } else {
                        textView2.getOverlay().add(badgeDrawable2);
                    }
                    this.f17460OooO0oO = textView2;
                }
            }
        }

        public final void OooO0OO(@NonNull View view) {
            BadgeDrawable badgeDrawable = this.f17461OooO0oo;
            if ((badgeDrawable != null) && view == this.f17460OooO0oO) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                badgeDrawable.setBounds(rect);
                badgeDrawable.OooO0oo(view, null);
            }
        }

        public final void OooO0Oo() {
            OooO0o();
            OooOO0O oooOO0O = this.f17457OooO0Oo;
            boolean z = false;
            if (oooOO0O != null) {
                TabLayout tabLayout = oooOO0O.f17449OooO0oO;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == oooOO0O.f17446OooO0Oo) {
                    z = true;
                }
            }
            setSelected(z);
        }

        public final void OooO0o() {
            int i;
            ViewParent parent;
            OooOO0O oooOO0O = this.f17457OooO0Oo;
            View view = oooOO0O != null ? oooOO0O.f17448OooO0o0 : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f17456OooO;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f17456OooO);
                    }
                    addView(view);
                }
                this.f17456OooO = view;
                TextView textView = this.f17459OooO0o0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f17458OooO0o;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f17458OooO0o.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f17462OooOO0 = textView2;
                if (textView2 != null) {
                    this.f17466OooOOO0 = TextViewCompat.OooO00o.OooO0O0(textView2);
                }
                this.f17463OooOO0O = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f17456OooO;
                if (view3 != null) {
                    removeView(view3);
                    this.f17456OooO = null;
                }
                this.f17462OooOO0 = null;
                this.f17463OooOO0O = null;
            }
            if (this.f17456OooO == null) {
                if (this.f17458OooO0o == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(o0000O00.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f17458OooO0o = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f17459OooO0o0 == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(o0000O00.design_layout_tab_text, (ViewGroup) this, false);
                    this.f17459OooO0o0 = textView3;
                    addView(textView3);
                    this.f17466OooOOO0 = TextViewCompat.OooO00o.OooO0O0(this.f17459OooO0o0);
                }
                TextView textView4 = this.f17459OooO0o0;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.f17395OooOO0o);
                if (!isSelected() || (i = tabLayout.f17396OooOOO) == -1) {
                    this.f17459OooO0o0.setTextAppearance(tabLayout.f17397OooOOO0);
                } else {
                    this.f17459OooO0o0.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.f17398OooOOOO;
                if (colorStateList != null) {
                    this.f17459OooO0o0.setTextColor(colorStateList);
                }
                OooO0oO(this.f17459OooO0o0, this.f17458OooO0o, true);
                OooO0O0();
                ImageView imageView3 = this.f17458OooO0o;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.OooO0OO(this, imageView3));
                }
                TextView textView5 = this.f17459OooO0o0;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.OooO0OO(this, textView5));
                }
            } else {
                TextView textView6 = this.f17462OooOO0;
                if (textView6 != null || this.f17463OooOO0O != null) {
                    OooO0oO(textView6, this.f17463OooOO0O, false);
                }
            }
            if (oooOO0O == null || TextUtils.isEmpty(oooOO0O.f17445OooO0OO)) {
                return;
            }
            setContentDescription(oooOO0O.f17445OooO0OO);
        }

        public final void OooO0o0(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.f17407OooOo0o;
            if (i != 0) {
                Drawable drawableOooO00o = o00Oo0.OooO00o(context, i);
                this.f17464OooOO0o = drawableOooO00o;
                if (drawableOooO00o != null && drawableOooO00o.isStateful()) {
                    this.f17464OooOO0o.setState(getDrawableState());
                }
            } else {
                this.f17464OooOO0o = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (tabLayout.f17401OooOOo0 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListOooO00o = OooOOOO.OooO00o(tabLayout.f17401OooOOo0);
                boolean z = tabLayout.f17421Oooo0OO;
                if (z) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListOooO00o, gradientDrawable, z ? null : gradientDrawable3);
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, rippleDrawable);
            tabLayout.invalidate();
        }

        public final void OooO0oO(@Nullable TextView textView, @Nullable ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            OooOO0O oooOO0O = this.f17457OooO0Oo;
            Drawable drawableMutate = (oooOO0O == null || (drawable = oooOO0O.f17443OooO00o) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                o00Ooo.OooO0O0.OooO0oo(drawableMutate, tabLayout.f17399OooOOOo);
                PorterDuff.Mode mode = tabLayout.f17405OooOo00;
                if (mode != null) {
                    o00Ooo.OooO0O0.OooO(drawableMutate, mode);
                }
            }
            OooOO0O oooOO0O2 = this.f17457OooO0Oo;
            CharSequence charSequence = oooOO0O2 != null ? oooOO0O2.f17444OooO0O0 : null;
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
            boolean z3 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                z2 = z3 && this.f17457OooO0Oo.f17447OooO0o == 1;
                textView.setText(z3 ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (z3) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iOooO0O0 = (z2 && imageView.getVisibility() == 0) ? (int) oo0o0Oo.OooO0O0(8, getContext()) : 0;
                if (tabLayout.f17418Oooo00O) {
                    if (iOooO0O0 != o00O0O.OooO0O0(marginLayoutParams)) {
                        o00O0O.OooO0oO(marginLayoutParams, iOooO0O0);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iOooO0O0 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iOooO0O0;
                    o00O0O.OooO0oO(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            OooOO0O oooOO0O3 = this.f17457OooO0Oo;
            CharSequence charSequence2 = oooOO0O3 != null ? oooOO0O3.f17445OooO0OO : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z3) {
                    charSequence = charSequence2;
                }
                o000O0O0.OooO00o(this, charSequence);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f17464OooOO0o;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f17464OooOO0o.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f17459OooO0o0, this.f17458OooO0o, this.f17456OooO};
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
            View[] viewArr = {this.f17459OooO0o0, this.f17458OooO0o, this.f17456OooO};
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
            return this.f17457OooO0Oo;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f17461OooO0oo;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f17461OooO0oo.OooO0OO()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o0O0O00.OooOO0O.OooO00o(0, 1, this.f17457OooO0Oo.f17446OooO0Oo, 1, false, isSelected()).f33533OooO00o);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o0O0O00.OooO00o.f33516OooO0oO.f33528OooO00o);
            }
            o0O0O00.OooO0O0.OooO0OO(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(o0000O0.item_view_role_description));
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008d  */
        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.f17403OooOo, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f17459OooO0o0 != null) {
                float f = tabLayout.f17404OooOo0;
                int i3 = this.f17466OooOOO0;
                ImageView imageView = this.f17458OooO0o;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f17459OooO0o0;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.f17406OooOo0O;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f17459OooO0o0.getTextSize();
                int lineCount = this.f17459OooO0o0.getLineCount();
                int iOooO0O0 = TextViewCompat.OooO00o.OooO0O0(this.f17459OooO0o0);
                if (f != textSize || (iOooO0O0 >= 0 && i3 != iOooO0O0)) {
                    if (tabLayout.f17417Oooo000 == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f17459OooO0o0.getLayout();
                        if (layout != null) {
                            if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f17459OooO0o0.setTextSize(0, f);
                        this.f17459OooO0o0.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f17457OooO0Oo == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            OooOO0O oooOO0O = this.f17457OooO0Oo;
            TabLayout tabLayout = oooOO0O.f17449OooO0oO;
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
            TextView textView = this.f17459OooO0o0;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f17458OooO0o;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f17456OooO;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@Nullable OooOO0O oooOO0O) {
            if (oooOO0O != this.f17457OooO0Oo) {
                this.f17457OooO0Oo = oooOO0O;
                OooO0Oo();
            }
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        ArrayList<OooOO0O> arrayList = this.f17390OooO0o0;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            OooOO0O oooOO0O = arrayList.get(i);
            if (oooOO0O != null && oooOO0O.f17443OooO00o != null && !TextUtils.isEmpty(oooOO0O.f17444OooO0O0)) {
                z = true;
                break;
            }
        }
        return (!z || this.f17418Oooo00O) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f17409OooOoO0;
        if (i != -1) {
            return i;
        }
        int i2 = this.f17417Oooo000;
        if (i2 == 0 || i2 == 2) {
            return this.f17410OooOoOO;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f17391OooO0oO.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        OooOO0 oooOO1 = this.f17391OooO0oO;
        int childCount = oooOO1.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = oooOO1.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).OooO0o();
                    }
                }
                i2++;
            }
        }
    }

    public final void OooO(@Nullable OooOO0O oooOO0O, boolean z) {
        OooOO0O oooOO0O2 = this.f17389OooO0o;
        ArrayList<OooO0OO> arrayList = this.f17425Oooo0oo;
        if (oooOO0O2 == oooOO0O) {
            if (oooOO0O2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).OooO0OO();
                }
                OooO0OO(oooOO0O.f17446OooO0Oo);
                return;
            }
            return;
        }
        int i = oooOO0O != null ? oooOO0O.f17446OooO0Oo : -1;
        if (z) {
            if ((oooOO0O2 == null || oooOO0O2.f17446OooO0Oo == -1) && i != -1) {
                OooOO0O(i, 0.0f, true, true, true);
            } else {
                OooO0OO(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f17389OooO0o = oooOO0O;
        if (oooOO0O2 != null && oooOO0O2.f17449OooO0oO != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).OooO0O0();
            }
        }
        if (oooOO0O != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).OooO00o(oooOO0O);
            }
        }
    }

    public final void OooO00o(@NonNull OooOO0O oooOO0O, boolean z) {
        ArrayList<OooOO0O> arrayList = this.f17390OooO0o0;
        int size = arrayList.size();
        if (oooOO0O.f17449OooO0oO != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        oooOO0O.f17446OooO0Oo = size;
        arrayList.add(size, oooOO0O);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (arrayList.get(i2).f17446OooO0Oo == this.f17388OooO0Oo) {
                i = i2;
            }
            arrayList.get(i2).f17446OooO0Oo = i2;
        }
        this.f17388OooO0Oo = i;
        TabView tabView = oooOO0O.f17450OooO0oo;
        tabView.setSelected(false);
        tabView.setActivated(false);
        int i3 = oooOO0O.f17446OooO0Oo;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f17417Oooo000 == 1 && this.f17411OooOoo == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f17391OooO0oO.addView(tabView, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = oooOO0O.f17449OooO0oO;
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
        CharSequence charSequence = tabItem.f17382OooO0Oo;
        if (charSequence != null) {
            if (TextUtils.isEmpty(oooOO0OOooO0oO.f17445OooO0OO) && !TextUtils.isEmpty(charSequence)) {
                oooOO0OOooO0oO.f17450OooO0oo.setContentDescription(charSequence);
            }
            oooOO0OOooO0oO.f17444OooO0O0 = charSequence;
            TabView tabView = oooOO0OOooO0oO.f17450OooO0oo;
            if (tabView != null) {
                tabView.OooO0Oo();
            }
        }
        Drawable drawable = tabItem.f17384OooO0o0;
        if (drawable != null) {
            oooOO0OOooO0oO.f17443OooO00o = drawable;
            TabLayout tabLayout = oooOO0OOooO0oO.f17449OooO0oO;
            if (tabLayout.f17411OooOoo == 1 || tabLayout.f17417Oooo000 == 2) {
                tabLayout.OooOOO0(true);
            }
            TabView tabView2 = oooOO0OOooO0oO.f17450OooO0oo;
            if (tabView2 != null) {
                tabView2.OooO0Oo();
            }
        }
        int i = tabItem.f17383OooO0o;
        if (i != 0) {
            oooOO0OOooO0oO.f17448OooO0o0 = LayoutInflater.from(oooOO0OOooO0oO.f17450OooO0oo.getContext()).inflate(i, (ViewGroup) oooOO0OOooO0oO.f17450OooO0oo, false);
            TabView tabView3 = oooOO0OOooO0oO.f17450OooO0oo;
            if (tabView3 != null) {
                tabView3.OooO0Oo();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            oooOO0OOooO0oO.f17445OooO0OO = tabItem.getContentDescription();
            TabView tabView4 = oooOO0OOooO0oO.f17450OooO0oo;
            if (tabView4 != null) {
                tabView4.OooO0Oo();
            }
        }
        OooO00o(oooOO0OOooO0oO, this.f17390OooO0o0.isEmpty());
    }

    public final void OooO0OO(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(this)) {
                OooOO0 oooOO1 = this.f17391OooO0oO;
                int childCount = oooOO1.getChildCount();
                boolean z = false;
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (oooOO1.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int iOooO0o0 = OooO0o0(0.0f, i);
                    if (scrollX != iOooO0o0) {
                        OooO0o();
                        this.f17428OoooO00.setIntValues(scrollX, iOooO0o0);
                        this.f17428OoooO00.start();
                    }
                    ValueAnimator valueAnimator = oooOO1.f17440OooO0Oo;
                    if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f17388OooO0Oo != i) {
                        oooOO1.f17440OooO0Oo.cancel();
                    }
                    oooOO1.OooO0Oo(i, this.f17413OooOooO, true);
                    return;
                }
            }
        }
        OooOO0O(i, 0.0f, true, true, true);
    }

    public final void OooO0Oo() {
        int i = this.f17417Oooo000;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f17412OooOoo0 - this.f17392OooO0oo) : 0;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        OooOO0 oooOO1 = this.f17391OooO0oO;
        ViewCompat.OooO.OooOO0O(oooOO1, iMax, 0, 0, 0);
        int i2 = this.f17417Oooo000;
        if (i2 == 0) {
            int i3 = this.f17411OooOoo;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                oooOO1.setGravity(1);
            } else if (i3 == 2) {
            }
            oooOO1.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f17411OooOoo == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            oooOO1.setGravity(1);
        }
        OooOOO0(true);
    }

    public final void OooO0o() {
        if (this.f17428OoooO00 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17428OoooO00 = valueAnimator;
            valueAnimator.setInterpolator(this.f17422Oooo0o);
            this.f17428OoooO00.setDuration(this.f17413OooOooO);
            this.f17428OoooO00.addUpdateListener(new OooO00o());
        }
    }

    public final int OooO0o0(float f, int i) {
        OooOO0 oooOO1;
        View childAt;
        int i2 = this.f17417Oooo000;
        if ((i2 != 0 && i2 != 2) || (childAt = (oooOO1 = this.f17391OooO0oO).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < oooOO1.getChildCount() ? oooOO1.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 0 ? left + i4 : left - i4;
    }

    @NonNull
    public final OooOO0O OooO0oO() {
        OooOO0O oooOO0O = (OooOO0O) f17386OoooOoo.OooO0O0();
        if (oooOO0O == null) {
            oooOO0O = new OooOO0O();
        }
        oooOO0O.f17449OooO0oO = this;
        o000OO.OooOO0 oooOO1 = this.f17433OoooOo0;
        TabView tabView = oooOO1 != null ? (TabView) oooOO1.OooO0O0() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(oooOO0O);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(oooOO0O.f17445OooO0OO)) {
            tabView.setContentDescription(oooOO0O.f17444OooO0O0);
        } else {
            tabView.setContentDescription(oooOO0O.f17445OooO0OO);
        }
        oooOO0O.f17450OooO0oo = tabView;
        int i = oooOO0O.f17442OooO;
        if (i != -1) {
            tabView.setId(i);
        }
        return oooOO0O;
    }

    public final void OooO0oo() {
        OooOO0O oooOO0O;
        int currentItem;
        OooOO0 oooOO1 = this.f17391OooO0oO;
        int childCount = oooOO1.getChildCount() - 1;
        while (true) {
            oooOO0O = null;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) oooOO1.getChildAt(childCount);
            oooOO1.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f17433OoooOo0.OooO00o(tabView);
            }
            requestLayout();
            childCount--;
        }
        ArrayList<OooOO0O> arrayList = this.f17390OooO0o0;
        Iterator<OooOO0O> it = arrayList.iterator();
        while (it.hasNext()) {
            OooOO0O next = it.next();
            it.remove();
            next.f17449OooO0oO = null;
            next.f17450OooO0oo = null;
            next.f17443OooO00o = null;
            next.f17442OooO = -1;
            next.f17444OooO0O0 = null;
            next.f17445OooO0OO = null;
            next.f17446OooO0Oo = -1;
            next.f17448OooO0o0 = null;
            f17386OoooOoo.OooO00o(next);
        }
        this.f17389OooO0o = null;
        p114o00O00o.OooO0OO oooO0OO = this.f17429OoooO0O;
        if (oooO0OO != null) {
            int iOooO0OO = oooO0OO.OooO0OO();
            for (int i = 0; i < iOooO0OO; i++) {
                OooOO0O oooOO0OOooO0oO = OooO0oO();
                CharSequence charSequenceOooO0o0 = this.f17429OoooO0O.OooO0o0(i);
                if (TextUtils.isEmpty(oooOO0OOooO0oO.f17445OooO0OO) && !TextUtils.isEmpty(charSequenceOooO0o0)) {
                    oooOO0OOooO0oO.f17450OooO0oo.setContentDescription(charSequenceOooO0o0);
                }
                oooOO0OOooO0oO.f17444OooO0O0 = charSequenceOooO0o0;
                TabView tabView2 = oooOO0OOooO0oO.f17450OooO0oo;
                if (tabView2 != null) {
                    tabView2.OooO0Oo();
                }
                OooO00o(oooOO0OOooO0oO, false);
            }
            ViewPager viewPager = this.f17427OoooO0;
            if (viewPager == null || iOooO0OO <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                oooOO0O = arrayList.get(currentItem);
            }
            OooO(oooOO0O, true);
        }
    }

    public final void OooOO0(@Nullable p114o00O00o.OooO0OO oooO0OO, boolean z) {
        OooO oooO;
        p114o00O00o.OooO0OO oooO0OO2 = this.f17429OoooO0O;
        if (oooO0OO2 != null && (oooO = this.f17426OoooO) != null) {
            oooO0OO2.OooOOOo(oooO);
        }
        this.f17429OoooO0O = oooO0OO;
        if (z && oooO0OO != null) {
            if (this.f17426OoooO == null) {
                this.f17426OoooO = new OooO();
            }
            oooO0OO.OooOO0(this.f17426OoooO);
        }
        OooO0oo();
    }

    public final void OooOO0O(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            OooOO0 oooOO1 = this.f17391OooO0oO;
            if (iRound >= oooOO1.getChildCount()) {
                return;
            }
            if (z2) {
                oooOO1.getClass();
                TabLayout.this.f17388OooO0Oo = Math.round(f2);
                ValueAnimator valueAnimator = oooOO1.f17440OooO0Oo;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    oooOO1.f17440OooO0Oo.cancel();
                }
                oooOO1.OooO0OO(oooOO1.getChildAt(i), oooOO1.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.f17428OoooO00;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f17428OoooO00.cancel();
            }
            int iOooO0o0 = OooO0o0(f, i);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iOooO0o0 >= scrollX) || (i > getSelectedTabPosition() && iOooO0o0 <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooO.OooO0Oo(this) == 1) {
                z4 = (i < getSelectedTabPosition() && iOooO0o0 <= scrollX) || (i > getSelectedTabPosition() && iOooO0o0 >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.f17432OoooOOo == 1 || z3) {
                if (i < 0) {
                    iOooO0o0 = 0;
                }
                scrollTo(iOooO0o0, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void OooOO0o(@Nullable ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ViewPager viewPager2 = this.f17427OoooO0;
        if (viewPager2 != null) {
            OooOOO0 oooOOO0 = this.f17430OoooOO0;
            if (oooOOO0 != null) {
                viewPager2.OooOo0(oooOOO0);
            }
            OooO0O0 oooO0O0 = this.f17434o000oOoO;
            if (oooO0O0 != null && (arrayList = this.f17427OoooO0.f11436OoooOOo) != null) {
                arrayList.remove(oooO0O0);
            }
        }
        OooOOO oooOOO = this.f17415Oooo;
        ArrayList<OooO0OO> arrayList2 = this.f17425Oooo0oo;
        if (oooOOO != null) {
            arrayList2.remove(oooOOO);
            this.f17415Oooo = null;
        }
        if (viewPager != null) {
            this.f17427OoooO0 = viewPager;
            if (this.f17430OoooOO0 == null) {
                this.f17430OoooOO0 = new OooOOO0(this);
            }
            OooOOO0 oooOOO1 = this.f17430OoooOO0;
            oooOOO1.f17453OooO0o = 0;
            oooOOO1.f17454OooO0o0 = 0;
            viewPager.OooO0O0(oooOOO1);
            OooOOO oooOOO2 = new OooOOO(viewPager);
            this.f17415Oooo = oooOOO2;
            if (!arrayList2.contains(oooOOO2)) {
                arrayList2.add(oooOOO2);
            }
            p114o00O00o.OooO0OO adapter = viewPager.getAdapter();
            if (adapter != null) {
                OooOO0(adapter, true);
            }
            if (this.f17434o000oOoO == null) {
                this.f17434o000oOoO = new OooO0O0();
            }
            OooO0O0 oooO0O1 = this.f17434o000oOoO;
            oooO0O1.f17437OooO0Oo = true;
            if (viewPager.f11436OoooOOo == null) {
                viewPager.f11436OoooOOo = new ArrayList();
            }
            viewPager.f11436OoooOOo.add(oooO0O1);
            OooOO0O(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.f17427OoooO0 = null;
            OooOO0(null, false);
        }
        this.f17431OoooOOO = z;
    }

    public final void OooOOO0(boolean z) {
        int i = 0;
        while (true) {
            OooOO0 oooOO1 = this.f17391OooO0oO;
            if (i >= oooOO1.getChildCount()) {
                return;
            }
            View childAt = oooOO1.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f17417Oooo000 == 1 && this.f17411OooOoo == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        OooO0O0(view);
    }

    public int getSelectedTabPosition() {
        OooOO0O oooOO0O = this.f17389OooO0o;
        if (oooOO0O != null) {
            return oooOO0O.f17446OooO0Oo;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f17390OooO0o0.size();
    }

    public int getTabGravity() {
        return this.f17411OooOoo;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f17399OooOOOo;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f17420Oooo0O0;
    }

    public int getTabIndicatorGravity() {
        return this.f17414OooOooo;
    }

    public int getTabMaxWidth() {
        return this.f17403OooOo;
    }

    public int getTabMode() {
        return this.f17417Oooo000;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f17401OooOOo0;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f17400OooOOo;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f17398OooOOOO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOo00.OooO0OO(this);
        if (this.f17427OoooO0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                OooOO0o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17431OoooOOO) {
            setupWithViewPager(null);
            this.f17431OoooOOO = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i = 0;
        while (true) {
            OooOO0 oooOO1 = this.f17391OooO0oO;
            if (i >= oooOO1.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = oooOO1.getChildAt(i);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f17464OooOO0o) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f17464OooOO0o.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0O0O00.OooOO0.OooO00o(1, getTabCount(), 1, false).f33532OooO00o);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(oo0o0Oo.OooO0O0(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, Pow2.MAX_POW2);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iOooO0O0 = this.f17408OooOoO;
            if (iOooO0O0 <= 0) {
                iOooO0O0 = (int) (size - oo0o0Oo.OooO0O0(56, getContext()));
            }
            this.f17403OooOo = iOooO0O0;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f17417Oooo000;
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
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Pow2.MAX_POW2), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
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
        OooOo00.OooO0O0(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f17418Oooo00O == z) {
            return;
        }
        this.f17418Oooo00O = z;
        int i = 0;
        while (true) {
            OooOO0 oooOO1 = this.f17391OooO0oO;
            if (i >= oooOO1.getChildCount()) {
                OooO0Oo();
                return;
            }
            View childAt = oooOO1.getChildAt(i);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.f17418Oooo00O ? 1 : 0);
                TextView textView = tabView.f17462OooOO0;
                if (textView == null && tabView.f17463OooOO0O == null) {
                    tabView.OooO0oO(tabView.f17459OooO0o0, tabView.f17458OooO0o, true);
                } else {
                    tabView.OooO0oO(textView, tabView.f17463OooOO0O, false);
                }
            }
            i++;
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
        this.f17428OoooO00.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f17400OooOOo = drawableMutate;
        int i = this.f17402OooOOoo;
        if (i != 0) {
            o00Ooo.OooO0O0.OooO0oO(drawableMutate, i);
        } else {
            o00Ooo.OooO0O0.OooO0oo(drawableMutate, null);
        }
        int intrinsicHeight = this.f17416Oooo0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f17400OooOOo.getIntrinsicHeight();
        }
        this.f17391OooO0oO.OooO0O0(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f17402OooOOoo = i;
        Drawable drawable = this.f17400OooOOo;
        if (i != 0) {
            o00Ooo.OooO0O0.OooO0oO(drawable, i);
        } else {
            o00Ooo.OooO0O0.OooO0oo(drawable, null);
        }
        OooOOO0(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f17414OooOooo != i) {
            this.f17414OooOooo = i;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this.f17391OooO0oO);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f17416Oooo0 = i;
        this.f17391OooO0oO.OooO0O0(i);
    }

    public void setTabGravity(int i) {
        if (this.f17411OooOoo != i) {
            this.f17411OooOoo = i;
            OooO0Oo();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f17399OooOOOo != colorStateList) {
            this.f17399OooOOOo = colorStateList;
            ArrayList<OooOO0O> arrayList = this.f17390OooO0o0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TabView tabView = arrayList.get(i).f17450OooO0oo;
                if (tabView != null) {
                    tabView.OooO0Oo();
                }
            }
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(ContextCompat.OooO0O0(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f17420Oooo0O0 = i;
        if (i == 0) {
            this.f17423Oooo0o0 = new com.google.android.material.tabs.OooO00o();
            return;
        }
        if (i == 1) {
            this.f17423Oooo0o0 = new o0O00oO0.OooO00o();
        } else {
            if (i == 2) {
                this.f17423Oooo0o0 = new o0O00oO0.OooO0O0();
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f17419Oooo00o = z;
        int i = OooOO0.f17439OooO0o;
        OooOO0 oooOO1 = this.f17391OooO0oO;
        oooOO1.OooO00o(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOO0O(oooOO1);
    }

    public void setTabMode(int i) {
        if (i != this.f17417Oooo000) {
            this.f17417Oooo000 = i;
            OooO0Oo();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f17401OooOOo0 == colorStateList) {
            return;
        }
        this.f17401OooOOo0 = colorStateList;
        int i = 0;
        while (true) {
            OooOO0 oooOO1 = this.f17391OooO0oO;
            if (i >= oooOO1.getChildCount()) {
                return;
            }
            View childAt = oooOO1.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.f17455OooOOOO;
                ((TabView) childAt).OooO0o0(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(ContextCompat.OooO0O0(i, getContext()));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f17398OooOOOO != colorStateList) {
            this.f17398OooOOOO = colorStateList;
            ArrayList<OooOO0O> arrayList = this.f17390OooO0o0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TabView tabView = arrayList.get(i).f17450OooO0oo;
                if (tabView != null) {
                    tabView.OooO0Oo();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable p114o00O00o.OooO0OO oooO0OO) {
        OooOO0(oooO0OO, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f17421Oooo0OO == z) {
            return;
        }
        this.f17421Oooo0OO = z;
        int i = 0;
        while (true) {
            OooOO0 oooOO1 = this.f17391OooO0oO;
            if (i >= oooOO1.getChildCount()) {
                return;
            }
            View childAt = oooOO1.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.f17455OooOOOO;
                ((TabView) childAt).OooO0o0(context);
            }
            i++;
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
        this(context, attributeSet, o00000.tabStyle);
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
        OooO0OO oooO0OO2 = this.f17424Oooo0oO;
        ArrayList<OooO0OO> arrayList = this.f17425Oooo0oo;
        if (oooO0OO2 != null) {
            arrayList.remove(oooO0OO2);
        }
        this.f17424Oooo0oO = oooO0OO;
        if (oooO0OO == null || arrayList.contains(oooO0OO)) {
            return;
        }
        arrayList.add(oooO0OO);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17385OoooOoO;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17388OooO0Oo = -1;
        this.f17390OooO0o0 = new ArrayList<>();
        this.f17396OooOOO = -1;
        this.f17402OooOOoo = 0;
        this.f17403OooOo = Integer.MAX_VALUE;
        this.f17416Oooo0 = -1;
        this.f17425Oooo0oo = new ArrayList<>();
        this.f17433OoooOo0 = new o000OO.OooOO0(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        OooOO0 oooOO1 = new OooOO0(context2);
        this.f17391OooO0oO = oooOO1;
        super.addView(oooOO1, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = o000OO.TabLayout;
        int i3 = o000OO.TabLayout_tabTextAppearance;
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, iArr, i, i2, i3);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.OooOOO(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.OooOO0O(context2);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            materialShapeDrawable.OooOOO0(ViewCompat.OooOOO.OooO(this));
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
        setSelectedTabIndicator(p276o0O00OoO.OooO0o.OooO0Oo(context2, typedArrayOooO0Oo, o000OO.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayOooO0Oo.getColor(o000OO.TabLayout_tabIndicatorColor, 0));
        oooOO1.OooO0O0(typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayOooO0Oo.getInt(o000OO.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayOooO0Oo.getInt(o000OO.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayOooO0Oo.getBoolean(o000OO.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabPadding, 0);
        this.f17394OooOO0O = dimensionPixelSize;
        this.f17393OooOO0 = dimensionPixelSize;
        this.f17387OooO = dimensionPixelSize;
        this.f17392OooO0oo = dimensionPixelSize;
        this.f17392OooO0oo = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f17387OooO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.f17393OooOO0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.f17394OooOO0O = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (p276o0O00OoO.OooO0OO.OooO0O0(context2, o00000.isMaterial3Theme, false)) {
            this.f17395OooOO0o = o00000.textAppearanceTitleSmall;
        } else {
            this.f17395OooOO0o = o00000.textAppearanceButton;
        }
        int resourceId = typedArrayOooO0Oo.getResourceId(i3, o0000O0O.TextAppearance_Design_Tab);
        this.f17397OooOOO0 = resourceId;
        int[] iArr2 = p012OooOo0O.o00O0O.TextAppearance;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i4 = p012OooOo0O.o00O0O.TextAppearance_android_textSize;
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, 0);
            this.f17404OooOo0 = dimensionPixelSize2;
            int i5 = p012OooOo0O.o00O0O.TextAppearance_android_textColor;
            this.f17398OooOOOO = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayObtainStyledAttributes, i5);
            typedArrayObtainStyledAttributes.recycle();
            int i6 = o000OO.TabLayout_tabSelectedTextAppearance;
            if (typedArrayOooO0Oo.hasValue(i6)) {
                this.f17396OooOOO = typedArrayOooO0Oo.getResourceId(i6, resourceId);
            }
            int i7 = this.f17396OooOOO;
            if (i7 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i7, iArr2);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(i4, (int) dimensionPixelSize2);
                    ColorStateList colorStateListOooO00o = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayObtainStyledAttributes2, i5);
                    if (colorStateListOooO00o != null) {
                        this.f17398OooOOOO = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{colorStateListOooO00o.getColorForState(new int[]{R.attr.state_selected}, colorStateListOooO00o.getDefaultColor()), this.f17398OooOOOO.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            int i8 = o000OO.TabLayout_tabTextColor;
            if (typedArrayOooO0Oo.hasValue(i8)) {
                this.f17398OooOOOO = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayOooO0Oo, i8);
            }
            int i9 = o000OO.TabLayout_tabSelectedTextColor;
            if (typedArrayOooO0Oo.hasValue(i9)) {
                this.f17398OooOOOO = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayOooO0Oo.getColor(i9, 0), this.f17398OooOOOO.getDefaultColor()});
            }
            this.f17399OooOOOo = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayOooO0Oo, o000OO.TabLayout_tabIconTint);
            this.f17405OooOo00 = oo0o0Oo.OooO0oO(typedArrayOooO0Oo.getInt(o000OO.TabLayout_tabIconTintMode, -1), null);
            this.f17401OooOOo0 = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayOooO0Oo, o000OO.TabLayout_tabRippleColor);
            this.f17413OooOooO = typedArrayOooO0Oo.getInt(o000OO.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f17422Oooo0o = o0O00OOO.OooO00o.OooO0Oo(context2, o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f40881OooO0O0);
            this.f17409OooOoO0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabMinWidth, -1);
            this.f17408OooOoO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabMaxWidth, -1);
            this.f17407OooOo0o = typedArrayOooO0Oo.getResourceId(o000OO.TabLayout_tabBackground, 0);
            this.f17412OooOoo0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.TabLayout_tabContentStart, 0);
            this.f17417Oooo000 = typedArrayOooO0Oo.getInt(o000OO.TabLayout_tabMode, 1);
            this.f17411OooOoo = typedArrayOooO0Oo.getInt(o000OO.TabLayout_tabGravity, 0);
            this.f17418Oooo00O = typedArrayOooO0Oo.getBoolean(o000OO.TabLayout_tabInlineLabel, false);
            this.f17421Oooo0OO = typedArrayOooO0Oo.getBoolean(o000OO.TabLayout_tabUnboundedRipple, false);
            typedArrayOooO0Oo.recycle();
            Resources resources = getResources();
            this.f17406OooOo0O = resources.getDimensionPixelSize(o00000O.design_tab_text_size_2line);
            this.f17410OooOoOO = resources.getDimensionPixelSize(o00000O.design_tab_scrollable_min_width);
            OooO0Oo();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
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
            setSelectedTabIndicator(o00Oo0.OooO00o(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
