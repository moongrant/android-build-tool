package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Drawable f2694OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f2695OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f2696OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ScrollingTabContainerView f2697OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f2698OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Drawable f2699OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Drawable f2700OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f2701OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f2702OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f2703OooOOO0;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int OooO00o(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2699OooO0oo;
        if (drawable != null && drawable.isStateful()) {
            this.f2699OooO0oo.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2694OooO;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2694OooO.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2700OooOO0;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2700OooOO0.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2697OooO0o0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2699OooO0oo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2694OooO;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2700OooOO0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2696OooO0o = findViewById(p012OooOo0O.Oooo000.action_bar);
        this.f2698OooO0oO = findViewById(p012OooOo0O.Oooo000.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2695OooO0Oo || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ScrollingTabContainerView scrollingTabContainerView = this.f2697OooO0o0;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f2701OooOO0O) {
            Drawable drawable2 = this.f2700OooOO0;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.f2699OooO0oo != null) {
                if (this.f2696OooO0o.getVisibility() == 0) {
                    this.f2699OooO0oo.setBounds(this.f2696OooO0o.getLeft(), this.f2696OooO0o.getTop(), this.f2696OooO0o.getRight(), this.f2696OooO0o.getBottom());
                } else {
                    View view = this.f2698OooO0oO;
                    if (view == null || view.getVisibility() != 0) {
                        this.f2699OooO0oo.setBounds(0, 0, 0, 0);
                    } else {
                        this.f2699OooO0oo.setBounds(this.f2698OooO0oO.getLeft(), this.f2698OooO0oO.getTop(), this.f2698OooO0oO.getRight(), this.f2698OooO0oO.getBottom());
                    }
                }
                z3 = true;
            }
            this.f2702OooOO0o = z4;
            if (!z4 || (drawable = this.f2694OooO) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f2696OooO0o == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f2703OooOOO0) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2696OooO0o == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        ScrollingTabContainerView scrollingTabContainerView = this.f2697OooO0o0;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f2696OooO0o;
        boolean z = true;
        int iOooO00o = 0;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f2698OooO0oO;
            if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                z = false;
            }
            if (!z) {
                iOooO00o = OooO00o(this.f2698OooO0oO);
            }
        } else {
            iOooO00o = OooO00o(this.f2696OooO0o);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(OooO00o(this.f2697OooO0o0) + iOooO00o, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2699OooO0oo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2699OooO0oo);
        }
        this.f2699OooO0oo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2696OooO0o;
            if (view != null) {
                this.f2699OooO0oo.setBounds(view.getLeft(), this.f2696OooO0o.getTop(), this.f2696OooO0o.getRight(), this.f2696OooO0o.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2701OooOO0O ? this.f2699OooO0oo != null || this.f2694OooO != null : this.f2700OooOO0 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2700OooOO0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2700OooOO0);
        }
        this.f2700OooOO0 = drawable;
        boolean z = this.f2701OooOO0O;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f2700OooOO0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f2699OooO0oo != null || this.f2694OooO != null) : this.f2700OooOO0 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2694OooO;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2694OooO);
        }
        this.f2694OooO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2702OooOO0o && (drawable2 = this.f2694OooO) != null) {
                drawable2.setBounds(this.f2697OooO0o0.getLeft(), this.f2697OooO0o0.getTop(), this.f2697OooO0o0.getRight(), this.f2697OooO0o0.getBottom());
            }
        }
        setWillNotDraw(!this.f2701OooOO0O ? !(this.f2699OooO0oo == null && this.f2694OooO == null) : this.f2700OooOO0 != null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f2697OooO0o0;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f2697OooO0o0 = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f2695OooO0Oo = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2699OooO0oo;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2694OooO;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2700OooOO0;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2699OooO0oo;
        boolean z = this.f2701OooOO0O;
        return (drawable == drawable2 && !z) || (drawable == this.f2694OooO && this.f2702OooOO0o) || ((drawable == this.f2700OooOO0 && z) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO0OO oooO0OO = new OooO0OO(this);
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, oooO0OO);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.ActionBar);
        this.f2699OooO0oo = typedArrayObtainStyledAttributes.getDrawable(p012OooOo0O.o00O0O.ActionBar_background);
        this.f2694OooO = typedArrayObtainStyledAttributes.getDrawable(p012OooOo0O.o00O0O.ActionBar_backgroundStacked);
        this.f2703OooOOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p012OooOo0O.o00O0O.ActionBar_height, -1);
        boolean z = true;
        if (getId() == p012OooOo0O.Oooo000.split_action_bar) {
            this.f2701OooOO0O = true;
            this.f2700OooOO0 = typedArrayObtainStyledAttributes.getDrawable(p012OooOo0O.o00O0O.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2701OooOO0O ? this.f2699OooO0oo != null || this.f2694OooO != null : this.f2700OooOO0 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
