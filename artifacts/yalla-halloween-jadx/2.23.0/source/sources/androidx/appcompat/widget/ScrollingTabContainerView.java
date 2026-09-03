package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f2998OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000oo f2999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AppCompatSpinner f3000OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinearLayoutCompat f3001OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f3002OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f3003OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f3004OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f3005OooOO0O;

    public class OooO00o extends BaseAdapter {
        public OooO00o() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.f3001OooO0o0.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return ((OooO0O0) ScrollingTabContainerView.this.f3001OooO0o0.getChildAt(i)).f3007OooO0Oo;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                OooO0O0 oooO0O0 = (OooO0O0) view;
                oooO0O0.f3007OooO0Oo = (ActionBar.OooO0O0) getItem(i);
                oooO0O0.OooO00o();
                return view;
            }
            ActionBar.OooO0O0 oooO0O1 = (ActionBar.OooO0O0) getItem(i);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.getClass();
            OooO0O0 oooO0O2 = scrollingTabContainerView.new OooO0O0(scrollingTabContainerView.getContext(), oooO0O1);
            oooO0O2.setBackgroundDrawable(null);
            oooO0O2.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.f3004OooOO0));
            return oooO0O2;
        }
    }

    public class OooO0O0 extends LinearLayout {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ActionBar.OooO0O0 f3007OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public AppCompatImageView f3008OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public AppCompatTextView f3009OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f3010OooO0oO;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0O0(Context context, ActionBar.OooO0O0 oooO0O0) {
            int resourceId;
            int i = p012OooOo0O.OooOOO0.actionBarTabStyle;
            super(context, null, i);
            int[] iArr = {R.attr.background};
            this.f3007OooO0Oo = oooO0O0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, 0);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p013OooOo0o.o00Oo0.OooO00o(context, resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
            setGravity(8388627);
            OooO00o();
        }

        public final void OooO00o() {
            ActionBar.OooO0O0 oooO0O0 = this.f3007OooO0Oo;
            View viewOooO0O0 = oooO0O0.OooO0O0();
            if (viewOooO0O0 != null) {
                ViewParent parent = viewOooO0O0.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewOooO0O0);
                    }
                    addView(viewOooO0O0);
                }
                this.f3010OooO0oO = viewOooO0O0;
                AppCompatTextView appCompatTextView = this.f3009OooO0o0;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.f3008OooO0o;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.f3008OooO0o.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f3010OooO0oO;
            if (view != null) {
                removeView(view);
                this.f3010OooO0oO = null;
            }
            Drawable drawableOooO0OO = oooO0O0.OooO0OO();
            CharSequence charSequenceOooO0Oo = oooO0O0.OooO0Oo();
            if (drawableOooO0OO != null) {
                if (this.f3008OooO0o == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.f3008OooO0o = appCompatImageView2;
                }
                this.f3008OooO0o.setImageDrawable(drawableOooO0OO);
                this.f3008OooO0o.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.f3008OooO0o;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.f3008OooO0o.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceOooO0Oo);
            if (z) {
                if (this.f3009OooO0o0 == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null, p012OooOo0O.OooOOO0.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams2);
                    addView(appCompatTextView2);
                    this.f3009OooO0o0 = appCompatTextView2;
                }
                this.f3009OooO0o0.setText(charSequenceOooO0Oo);
                this.f3009OooO0o0.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = this.f3009OooO0o0;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setVisibility(8);
                    this.f3009OooO0o0.setText((CharSequence) null);
                }
            }
            AppCompatImageView appCompatImageView4 = this.f3008OooO0o;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(oooO0O0.OooO00o());
            }
            o000O0O0.OooO00o(this, z ? null : oooO0O0.OooO00o());
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.f3003OooO0oo > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = scrollingTabContainerView.f3003OooO0oo;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Pow2.MAX_POW2), i2);
                }
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f3012OooO0Oo = false;

        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3012OooO0Oo = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f3012OooO0Oo) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.getClass();
            scrollingTabContainerView.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f3012OooO0Oo = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        new OooO0OO();
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p012OooOo0O.o00O0O.ActionBar, p012OooOo0O.OooOOO0.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(p012OooOo0O.o00O0O.ActionBar_height, 0);
        layoutDimension = context.getResources().getBoolean(p012OooOo0O.OooOOO.abc_action_bar_embed_tabs) ? layoutDimension : Math.min(layoutDimension, context.getResources().getDimensionPixelSize(p012OooOo0O.OooOo00.abc_action_bar_stacked_max_height));
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f2998OooO = context.getResources().getDimensionPixelSize(p012OooOo0O.OooOo00.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, p012OooOo0O.OooOOO0.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f3001OooO0o0 = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void OooO00o() {
        AppCompatSpinner appCompatSpinner = this.f3000OooO0o;
        if (appCompatSpinner != null && appCompatSpinner.getParent() == this) {
            removeView(this.f3000OooO0o);
            addView(this.f3001OooO0o0, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f3000OooO0o.getSelectedItemPosition());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0000oo o0000ooVar = this.f2999OooO0Oo;
        if (o0000ooVar != null) {
            post(o0000ooVar);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p012OooOo0O.o00O0O.ActionBar, p012OooOo0O.OooOOO0.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(p012OooOo0O.o00O0O.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(p012OooOo0O.OooOOO.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(p012OooOo0O.OooOo00.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f2998OooO = context.getResources().getDimensionPixelSize(p012OooOo0O.OooOo00.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0000oo o0000ooVar = this.f2999OooO0Oo;
        if (o0000ooVar != null) {
            removeCallbacks(o0000ooVar);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((OooO0O0) view).f3007OooO0Oo.OooO0o0();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        LinearLayoutCompat linearLayoutCompat = this.f3001OooO0o0;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f3003OooO0oo = -1;
        } else {
            if (childCount > 2) {
                this.f3003OooO0oo = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f3003OooO0oo = View.MeasureSpec.getSize(i) / 2;
            }
            this.f3003OooO0oo = Math.min(this.f3003OooO0oo, this.f2998OooO);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3004OooOO0, Pow2.MAX_POW2);
        if (!z && this.f3002OooO0oO) {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                AppCompatSpinner appCompatSpinner = this.f3000OooO0o;
                if (!(appCompatSpinner != null && appCompatSpinner.getParent() == this)) {
                    if (this.f3000OooO0o == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, p012OooOo0O.OooOOO0.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f3000OooO0o = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f3000OooO0o, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f3000OooO0o.getAdapter() == null) {
                        this.f3000OooO0o.setAdapter((SpinnerAdapter) new OooO00o());
                    }
                    Runnable runnable = this.f2999OooO0Oo;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f2999OooO0Oo = null;
                    }
                    this.f3000OooO0o.setSelection(this.f3005OooOO0O);
                }
            } else {
                OooO00o();
            }
        } else {
            OooO00o();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f3005OooOO0O);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f3002OooO0oO = z;
    }

    public void setContentHeight(int i) {
        this.f3004OooOO0 = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f3005OooOO0O = i;
        LinearLayoutCompat linearLayoutCompat = this.f3001OooO0o0;
        int childCount = linearLayoutCompat.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = linearLayoutCompat.getChildAt(i);
                Runnable runnable = this.f2999OooO0Oo;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                o0000oo o0000ooVar = new o0000oo(this, childAt2);
                this.f2999OooO0Oo = o0000ooVar;
                post(o0000ooVar);
            }
            i2++;
        }
        AppCompatSpinner appCompatSpinner = this.f3000OooO0o;
        if (appCompatSpinner == null || i < 0) {
            return;
        }
        appCompatSpinner.setSelection(i);
    }
}
