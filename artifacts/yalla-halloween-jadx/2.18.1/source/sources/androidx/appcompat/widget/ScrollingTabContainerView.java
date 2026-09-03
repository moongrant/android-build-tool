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
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f5113Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00000 f5114Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public LinearLayoutCompat f5115Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public AppCompatSpinner f5116Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f5117OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f5118OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f5119OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f5120OoooO0O;

    public class OooO00o extends BaseAdapter {
        public OooO00o() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.f5115Oooo0oO.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return ((OooO0O0) ScrollingTabContainerView.this.f5115Oooo0oO.getChildAt(i)).f5123Oooo0o;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                OooO0O0 oooO0O0 = (OooO0O0) view;
                oooO0O0.f5123Oooo0o = (ActionBar.OooO0O0) getItem(i);
                oooO0O0.OooO00o();
                return view;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            ActionBar.OooO0O0 oooO0O1 = (ActionBar.OooO0O0) getItem(i);
            Objects.requireNonNull(scrollingTabContainerView);
            OooO0O0 oooO0O2 = scrollingTabContainerView.new OooO0O0(scrollingTabContainerView.getContext(), oooO0O1);
            oooO0O2.setBackgroundDrawable(null);
            oooO0O2.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.f5120OoooO0O));
            return oooO0O2;
        }
    }

    public class OooO0O0 extends LinearLayout {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public View f5122Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ActionBar.OooO0O0 f5123Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public AppCompatTextView f5124Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public AppCompatImageView f5125Oooo0oo;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0O0(Context context, ActionBar.OooO0O0 oooO0O0) {
            int resourceId;
            int i = OooOo00.OooO00o.actionBarTabStyle;
            super(context, null, i);
            int[] iArr = {R.attr.background};
            this.f5123Oooo0o = oooO0O0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, 0);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p012OooOo0.OooOO0O.OooO0O0(context, resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
            setGravity(8388627);
            OooO00o();
        }

        public final void OooO00o() {
            ActionBar.OooO0O0 oooO0O0 = this.f5123Oooo0o;
            View viewOooO0O0 = oooO0O0.OooO0O0();
            if (viewOooO0O0 != null) {
                ViewParent parent = viewOooO0O0.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewOooO0O0);
                    }
                    addView(viewOooO0O0);
                }
                this.f5122Oooo = viewOooO0O0;
                AppCompatTextView appCompatTextView = this.f5124Oooo0oO;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView = this.f5125Oooo0oo;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    this.f5125Oooo0oo.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f5122Oooo;
            if (view != null) {
                removeView(view);
                this.f5122Oooo = null;
            }
            Drawable drawableOooO0OO = oooO0O0.OooO0OO();
            CharSequence charSequenceOooO0Oo = oooO0O0.OooO0Oo();
            if (drawableOooO0OO != null) {
                if (this.f5125Oooo0oo == null) {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView2.setLayoutParams(layoutParams);
                    addView(appCompatImageView2, 0);
                    this.f5125Oooo0oo = appCompatImageView2;
                }
                this.f5125Oooo0oo.setImageDrawable(drawableOooO0OO);
                this.f5125Oooo0oo.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView3 = this.f5125Oooo0oo;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                    this.f5125Oooo0oo.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceOooO0Oo);
            if (z) {
                if (this.f5124Oooo0oO == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null, OooOo00.OooO00o.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams2);
                    addView(appCompatTextView2);
                    this.f5124Oooo0oO = appCompatTextView2;
                }
                this.f5124Oooo0oO.setText(charSequenceOooO0Oo);
                this.f5124Oooo0oO.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = this.f5124Oooo0oO;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setVisibility(8);
                    this.f5124Oooo0oO.setText((CharSequence) null);
                }
            }
            AppCompatImageView appCompatImageView4 = this.f5125Oooo0oo;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setContentDescription(oooO0O0.OooO00o());
            }
            o0000OO0.OooO00o(this, z ? null : oooO0O0.OooO00o());
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
            if (ScrollingTabContainerView.this.f5119OoooO00 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView.this.f5119OoooO00;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f5127Oooo0o = false;

        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f5127Oooo0o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f5127Oooo0o) {
                return;
            }
            Objects.requireNonNull(ScrollingTabContainerView.this);
            ScrollingTabContainerView.this.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f5127Oooo0o = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        new OooO0OO();
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, OooOo00.OooOOOO.ActionBar, OooOo00.OooO00o.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(OooOo00.OooOOOO.ActionBar_height, 0);
        layoutDimension = context.getResources().getBoolean(OooOo00.OooO0O0.abc_action_bar_embed_tabs) ? layoutDimension : Math.min(layoutDimension, context.getResources().getDimensionPixelSize(OooOo00.OooO0o.abc_action_bar_stacked_max_height));
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f5118OoooO0 = context.getResources().getDimensionPixelSize(OooOo00.OooO0o.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, OooOo00.OooO00o.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f5115Oooo0oO = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void OooO00o() {
        AppCompatSpinner appCompatSpinner = this.f5116Oooo0oo;
        if (appCompatSpinner != null && appCompatSpinner.getParent() == this) {
            removeView(this.f5116Oooo0oo);
            addView(this.f5115Oooo0oO, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f5116Oooo0oo.getSelectedItemPosition());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00000 o00000Var = this.f5114Oooo0o;
        if (o00000Var != null) {
            post(o00000Var);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, OooOo00.OooOOOO.ActionBar, OooOo00.OooO00o.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(OooOo00.OooOOOO.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(OooOo00.OooO0O0.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(OooOo00.OooO0o.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f5118OoooO0 = context.getResources().getDimensionPixelSize(OooOo00.OooO0o.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00000 o00000Var = this.f5114Oooo0o;
        if (o00000Var != null) {
            removeCallbacks(o00000Var);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((OooO0O0) view).f5123Oooo0o.OooO0o0();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f5115Oooo0oO.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5119OoooO00 = -1;
        } else {
            if (childCount > 2) {
                this.f5119OoooO00 = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f5119OoooO00 = View.MeasureSpec.getSize(i) / 2;
            }
            this.f5119OoooO00 = Math.min(this.f5119OoooO00, this.f5118OoooO0);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5120OoooO0O, 1073741824);
        if (!z && this.f5113Oooo) {
            this.f5115Oooo0oO.measure(0, iMakeMeasureSpec);
            if (this.f5115Oooo0oO.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                AppCompatSpinner appCompatSpinner = this.f5116Oooo0oo;
                if (!(appCompatSpinner != null && appCompatSpinner.getParent() == this)) {
                    if (this.f5116Oooo0oo == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, OooOo00.OooO00o.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f5116Oooo0oo = appCompatSpinner2;
                    }
                    removeView(this.f5115Oooo0oO);
                    addView(this.f5116Oooo0oo, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f5116Oooo0oo.getAdapter() == null) {
                        this.f5116Oooo0oo.setAdapter((SpinnerAdapter) new OooO00o());
                    }
                    o00000 o00000Var = this.f5114Oooo0o;
                    if (o00000Var != null) {
                        removeCallbacks(o00000Var);
                        this.f5114Oooo0o = null;
                    }
                    this.f5116Oooo0oo.setSelection(this.f5117OoooO);
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
        setTabSelected(this.f5117OoooO);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f5113Oooo = z;
    }

    public void setContentHeight(int i) {
        this.f5120OoooO0O = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f5117OoooO = i;
        int childCount = this.f5115Oooo0oO.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f5115Oooo0oO.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.f5115Oooo0oO.getChildAt(i);
                Runnable runnable = this.f5114Oooo0o;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                o00000 o00000Var = new o00000(this, childAt2);
                this.f5114Oooo0o = o00000Var;
                post(o00000Var);
            }
            i2++;
        }
        AppCompatSpinner appCompatSpinner = this.f5116Oooo0oo;
        if (appCompatSpinner == null || i < 0) {
            return;
        }
        appCompatSpinner.setSelection(i);
    }
}
