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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f4797Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f4798Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ScrollingTabContainerView f4799Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f4800Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f4801OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Drawable f4802OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Drawable f4803OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Drawable f4804OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f4805OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f4806o000oOoO;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int OooO00o(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean OooO0O0(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4803OoooO00;
        if (drawable != null && drawable.isStateful()) {
            this.f4803OoooO00.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4802OoooO0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4802OoooO0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4804OoooO0O;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4804OoooO0O.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f4799Oooo0oO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4803OoooO00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4802OoooO0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4804OoooO0O;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4800Oooo0oo = findViewById(OooOo00.OooOO0.action_bar);
        this.f4797Oooo = findViewById(OooOo00.OooOO0.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4798Oooo0o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ScrollingTabContainerView scrollingTabContainerView = this.f4799Oooo0oO;
        boolean z2 = false;
        boolean z3 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f4801OoooO) {
            Drawable drawable2 = this.f4804OoooO0O;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z2 = true;
            }
        } else {
            if (this.f4803OoooO00 != null) {
                if (this.f4800Oooo0oo.getVisibility() == 0) {
                    this.f4803OoooO00.setBounds(this.f4800Oooo0oo.getLeft(), this.f4800Oooo0oo.getTop(), this.f4800Oooo0oo.getRight(), this.f4800Oooo0oo.getBottom());
                } else {
                    View view = this.f4797Oooo;
                    if (view == null || view.getVisibility() != 0) {
                        this.f4803OoooO00.setBounds(0, 0, 0, 0);
                    } else {
                        this.f4803OoooO00.setBounds(this.f4797Oooo.getLeft(), this.f4797Oooo.getTop(), this.f4797Oooo.getRight(), this.f4797Oooo.getBottom());
                    }
                }
                z2 = true;
            }
            this.f4805OoooOO0 = z3;
            if (z3 && (drawable = this.f4802OoooO0) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
                z2 = true;
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iOooO00o;
        int i3;
        if (this.f4800Oooo0oo == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f4806o000oOoO) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f4800Oooo0oo == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        ScrollingTabContainerView scrollingTabContainerView = this.f4799Oooo0oO;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (OooO0O0(this.f4800Oooo0oo)) {
            iOooO00o = !OooO0O0(this.f4797Oooo) ? OooO00o(this.f4797Oooo) : 0;
        } else {
            iOooO00o = OooO00o(this.f4800Oooo0oo);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(OooO00o(this.f4799Oooo0oO) + iOooO00o, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4803OoooO00;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4803OoooO00);
        }
        this.f4803OoooO00 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4800Oooo0oo;
            if (view != null) {
                this.f4803OoooO00.setBounds(view.getLeft(), this.f4800Oooo0oo.getTop(), this.f4800Oooo0oo.getRight(), this.f4800Oooo0oo.getBottom());
            }
        }
        boolean z = true;
        if (!this.f4801OoooO ? this.f4803OoooO00 != null || this.f4802OoooO0 != null : this.f4804OoooO0O != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4804OoooO0O;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4804OoooO0O);
        }
        this.f4804OoooO0O = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4801OoooO && (drawable2 = this.f4804OoooO0O) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4801OoooO ? !(this.f4803OoooO00 != null || this.f4802OoooO0 != null) : this.f4804OoooO0O == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4802OoooO0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4802OoooO0);
        }
        this.f4802OoooO0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4805OoooOO0 && (drawable2 = this.f4802OoooO0) != null) {
                drawable2.setBounds(this.f4799Oooo0oO.getLeft(), this.f4799Oooo0oO.getTop(), this.f4799Oooo0oO.getRight(), this.f4799Oooo0oO.getBottom());
            }
        }
        boolean z = true;
        if (!this.f4801OoooO ? this.f4803OoooO00 != null || this.f4802OoooO0 != null : this.f4804OoooO0O != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f4799Oooo0oO;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f4799Oooo0oO = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f4798Oooo0o = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f4803OoooO00;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f4802OoooO0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f4804OoooO0O;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f4803OoooO00 && !this.f4801OoooO) || (drawable == this.f4802OoooO0 && this.f4805OoooOO0) || ((drawable == this.f4804OoooO0O && this.f4801OoooO) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO0O0 oooO0O0 = new OooO0O0(this);
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, oooO0O0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.ActionBar);
        this.f4803OoooO00 = typedArrayObtainStyledAttributes.getDrawable(OooOo00.OooOOOO.ActionBar_background);
        this.f4802OoooO0 = typedArrayObtainStyledAttributes.getDrawable(OooOo00.OooOOOO.ActionBar_backgroundStacked);
        this.f4806o000oOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.OooOOOO.ActionBar_height, -1);
        boolean z = true;
        if (getId() == OooOo00.OooOO0.split_action_bar) {
            this.f4801OoooO = true;
            this.f4804OoooO0O = typedArrayObtainStyledAttributes.getDrawable(OooOo00.OooOOOO.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4801OoooO ? this.f4803OoooO00 != null || this.f4802OoooO0 != null : this.f4804OoooO0O != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
