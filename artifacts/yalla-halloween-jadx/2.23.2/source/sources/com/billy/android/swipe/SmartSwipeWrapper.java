package com.billy.android.swipe;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.TextFieldImplKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jctools.util.Pow2;
import p148o00Oo0O.o00000OO;
import p149o00Oo0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class SmartSwipeWrapper extends ViewGroup {
    private static final int NESTED_TYPE_INVALID = -1;
    private Boolean flyToClose;
    private Boolean flyToOpen;
    protected final List<OooOOO0> mConsumers;
    protected View mContentView;
    protected int mCurNestedType;
    protected oo0o0Oo mHelper;
    protected final List<oo0o0Oo> mHelpers;
    protected boolean mInflateFromXml;
    protected boolean mIsNestedScrollingEnabled;
    private final ArrayList<View> mMatchParentChildren;
    protected boolean mNestedFlyConsumed;
    protected boolean mNestedInProgress;
    protected int[] mParentOffsetInWindow;

    public SmartSwipeWrapper(Context context) {
        this(context, null, 0);
    }

    private void wrapperNestedScroll(int i, int i2, int[] iArr, int i3) {
        if (this.mCurNestedType == -1) {
            this.mCurNestedType = i3;
            this.mNestedFlyConsumed = false;
            this.flyToClose = null;
            this.flyToOpen = null;
        }
        boolean z = i3 == 1;
        oo0o0Oo oo0o0oo = this.mHelper;
        if (oo0o0oo == null) {
            for (oo0o0Oo oo0o0oo2 : this.mHelpers) {
                if (oo0o0oo2 != null) {
                    if (oo0o0oo2.OooOOo(i3 == 1 ? -3 : -2, false, 0.0f, 0.0f, -i, -i2, false)) {
                        this.mHelper = oo0o0oo2;
                        return;
                    }
                }
            }
            return;
        }
        OooOOO0 oooOOO0 = oo0o0oo.f37755OooOOO;
        oooOOO0.getClass();
        if (!z) {
            this.mHelper.OooO0oo(-i, -i2, iArr, false);
            float f = oooOOO0.f12898OooOO0O;
            if (f >= 1.0f || f <= 0.0f) {
                this.mHelper = null;
                return;
            }
            return;
        }
        if (this.flyToOpen == null) {
            int i4 = oooOOO0.f12890OooO0O0;
            if (i4 == 1) {
                this.flyToOpen = Boolean.valueOf(i < 0);
                this.flyToClose = Boolean.valueOf(i > 0);
                if (i == 0) {
                    return;
                }
            } else if (i4 == 2) {
                this.flyToOpen = Boolean.valueOf(i > 0);
                this.flyToClose = Boolean.valueOf(i < 0);
                if (i == 0) {
                    return;
                }
            } else if (i4 == 4) {
                this.flyToOpen = Boolean.valueOf(i2 < 0);
                this.flyToClose = Boolean.valueOf(i2 > 0);
                if (i2 == 0) {
                    return;
                }
            } else if (i4 != 8) {
                Boolean bool = Boolean.FALSE;
                this.flyToClose = bool;
                this.flyToOpen = bool;
            } else {
                this.flyToOpen = Boolean.valueOf(i2 > 0);
                this.flyToClose = Boolean.valueOf(i2 < 0);
                if (i2 == 0) {
                    return;
                }
            }
        }
        if (this.mNestedFlyConsumed) {
            return;
        }
        this.mHelper.OooO0oo(-i, -i2, iArr, true);
        if ((!this.flyToOpen.booleanValue() || oooOOO0.f12898OooOO0O < 1.0f) && (!this.flyToClose.booleanValue() || oooOOO0.f12898OooOO0O > 0.0f)) {
            return;
        }
        this.mNestedFlyConsumed = true;
        oo0o0Oo oo0o0oo3 = this.mHelper;
        if (oo0o0oo3.f37745OooO0O0 == 3) {
            oo0o0oo3.OooO0o0(0.0f, 0.0f);
        }
    }

    public <T extends OooOOO0> T addConsumer(T t) {
        if (t != null) {
            this.mConsumers.add(t);
            oo0o0Oo oo0o0oo = t.f12899OooOO0o;
            if (oo0o0oo == null) {
                oo0o0oo = new oo0o0Oo(getContext(), this, t);
                oo0o0oo.f37746OooO0OO = (int) ((1.0f / t.f12902OooOOOO) * oo0o0oo.f37746OooO0OO);
            }
            t.f12889OooO00o = this;
            if (t.f12904OooOOo == 0) {
                Context context = getContext();
                OooO.OooO00o oooO00o = OooO.f12886OooO00o;
                t.f12904OooOOo = (int) TypedValue.applyDimension(1, TextFieldImplKt.AnimationDuration, context.getResources().getDisplayMetrics());
            }
            t.f12899OooOO0o = oo0o0oo;
            t.f12889OooO00o.isInflateFromXml();
            for (o00000OO o00000oo2 : t.f12905OooOOo0) {
                if (o00000oo2 != null) {
                    o00000oo2.OooO00o();
                }
            }
            this.mHelpers.add(oo0o0oo);
        }
        return t;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mHelpers.isEmpty()) {
            return;
        }
        boolean z = false;
        for (oo0o0Oo oo0o0oo : this.mHelpers) {
            if (oo0o0oo.f37745OooO0O0 == 2) {
                boolean zComputeScrollOffset = oo0o0oo.f37756OooOOO0.computeScrollOffset();
                int currX = oo0o0oo.f37756OooOOO0.getCurrX();
                int currY = oo0o0oo.f37756OooOOO0.getCurrY();
                int i = currX - oo0o0oo.f37758OooOOOo;
                int i2 = currY - oo0o0oo.f37759OooOOo0;
                if (i != 0) {
                    oo0o0oo.f37758OooOOOo = currX;
                }
                if (i2 != 0) {
                    oo0o0oo.f37759OooOOo0 = currY;
                }
                if (i != 0 || i2 != 0) {
                    oo0o0oo.f37755OooOOO.OooOOO(currX, currY, i, i2);
                }
                if (zComputeScrollOffset && currX == oo0o0oo.f37756OooOOO0.getFinalX() && currY == oo0o0oo.f37756OooOOO0.getFinalY()) {
                    oo0o0oo.f37756OooOOO0.abortAnimation();
                    zComputeScrollOffset = false;
                }
                if (!zComputeScrollOffset) {
                    oo0o0oo.OooOOO0(0);
                }
            }
            if (oo0o0oo.f37745OooO0O0 == 2) {
                z = true;
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void consumeInflateFromXml() {
        this.mInflateFromXml = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (OooOOO0 oooOOO0 : this.mConsumers) {
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return dispatchNestedScroll(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mHelper = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void drawChild(Canvas canvas, View view) {
        drawChild(canvas, view, getDrawingTime());
    }

    public SmartSwipeWrapper enableDirection(int i) {
        return enableDirection(i, true);
    }

    public List<OooOOO0> getAllConsumers() {
        return this.mConsumers;
    }

    public OooOOO0 getConsumerByType(Class<? extends OooOOO0> cls) {
        for (OooOOO0 oooOOO0 : this.mConsumers) {
            if (oooOOO0 != null && oooOOO0.getClass() == cls) {
                return oooOOO0;
            }
        }
        return null;
    }

    public View getContentView() {
        return this.mContentView;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public void helperOnNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        super.onNestedPreScroll(view, i, i2, iArr);
    }

    public void helperOnNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow);
    }

    public void helperOnNestedScrollAccepted(View view, View view2, int i, int i2) {
        super.onNestedScrollAccepted(view, view2, i);
    }

    public void helperOnStopNestedScroll(View view, int i) {
        super.onStopNestedScroll(view);
    }

    public void init() {
    }

    public boolean isInflateFromXml() {
        return this.mInflateFromXml;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setNestedScrollingEnabled(this.mIsNestedScrollingEnabled);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<OooOOO0> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (OooOOO0 oooOOO0 : this.mConsumers) {
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mInflateFromXml = true;
        int childCount = getChildCount();
        if (childCount <= 0 || this.mContentView != null) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).f12908OooO00o == 0) {
                setContentView(childAt);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mNestedInProgress) {
            oo0o0Oo oo0o0oo = this.mHelper;
            if (oo0o0oo != null) {
                return oo0o0oo.OooOOO(motionEvent);
            }
            for (oo0o0Oo oo0o0oo2 : this.mHelpers) {
                if (oo0o0oo2.OooOOO(motionEvent)) {
                    this.mHelper = oo0o0oo2;
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo0o0Oo oo0o0oo = this.mHelper;
        if (oo0o0oo != null) {
            oo0o0oo.f37755OooOOO.getClass();
        } else {
            for (OooOOO0 oooOOO0 : this.mConsumers) {
            }
        }
        View view = this.mContentView;
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), this.mContentView.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int childMeasureSpec;
        int childCount = getChildCount();
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        this.mMatchParentChildren.clear();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(ViewGroup.getChildMeasureSpec(i, 0, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, 0, layoutParams.height));
            iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            if (z && (layoutParams.width == -1 || layoutParams.height == -1)) {
                this.mMatchParentChildren.add(childAt);
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
        int size = this.mMatchParentChildren.size();
        if (size > 1) {
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.mMatchParentChildren.get(i5);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int i6 = layoutParams2.width;
                if (i6 == -1) {
                    int iMax3 = Math.max(0, getMeasuredWidth());
                    i3 = Pow2.MAX_POW2;
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, Pow2.MAX_POW2);
                } else {
                    i3 = Pow2.MAX_POW2;
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i, 0, i6);
                }
                int i7 = layoutParams2.height;
                view.measure(childMeasureSpec, i7 == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, getMeasuredHeight()), i3) : ViewGroup.getChildMeasureSpec(i2, 0, i7));
            }
        }
        for (OooOOO0 oooOOO0 : this.mConsumers) {
            if (oooOOO0 != null) {
                oooOOO0.f12889OooO00o.getMeasuredWidth();
                oooOOO0.f12889OooO00o.getMeasuredHeight();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mNestedInProgress) {
            return super.onTouchEvent(motionEvent);
        }
        oo0o0Oo oo0o0oo = this.mHelper;
        if (oo0o0oo == null) {
            for (oo0o0Oo oo0o0oo2 : this.mHelpers) {
                oo0o0oo2.OooO(motionEvent);
                if (oo0o0oo2.f37745OooO0O0 == 1) {
                    this.mHelper = oo0o0oo2;
                    break;
                }
            }
        } else {
            oo0o0oo.OooO(motionEvent);
        }
        return true;
    }

    public SmartSwipeWrapper removeAllConsumers() {
        Iterator<OooOOO0> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            OooOOO0 next = it.next();
            it.remove();
            if (next != null) {
                next.OooOO0();
                oo0o0Oo oo0o0oo = next.f12899OooOO0o;
                this.mHelpers.remove(oo0o0oo);
                if (this.mHelper == oo0o0oo) {
                    this.mHelper = null;
                }
            }
        }
        return this;
    }

    public SmartSwipeWrapper removeConsumer(OooOOO0 oooOOO0) {
        if (this.mConsumers.remove(oooOOO0)) {
            oooOOO0.OooOO0();
            oo0o0Oo oo0o0oo = oooOOO0.f12899OooOO0o;
            this.mHelpers.remove(oo0o0oo);
            if (this.mHelper == oo0o0oo) {
                this.mHelper = null;
            }
        }
        return this;
    }

    public void setContentView(View view) {
        if (view == null || this.mContentView == view) {
            return;
        }
        this.mContentView = view;
        if (view.getParent() == null) {
            addView(view);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mIsNestedScrollingEnabled = z;
        super.setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public SmartSwipeWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public SmartSwipeWrapper enableDirection(int i, boolean z) {
        for (OooOOO0 oooOOO0 : this.mConsumers) {
            if (z) {
                oooOOO0.f12901OooOOO0 |= i;
            } else {
                if ((oooOOO0.f12890OooO0O0 & i) != 0) {
                    oooOOO0.OooO0o0();
                }
                oooOOO0.f12901OooOOO0 &= ~i;
            }
        }
        return this;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean hasNestedScrollingParent(int i) {
        return super.hasNestedScrollingParent();
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        boolean z;
        oo0o0Oo oo0o0oo = this.mHelper;
        if (oo0o0oo == null || oo0o0oo.f37755OooOOO.f12898OooOO0O == 0.0f) {
            Arrays.fill(iArr, 0);
            helperOnNestedPreScroll(view, i, i2, iArr, i3);
            i4 = iArr[0] + 0;
            i5 = iArr[1] + 0;
            z = true;
        } else {
            i4 = 0;
            i5 = 0;
            z = false;
        }
        oo0o0Oo oo0o0oo2 = this.mHelper;
        if (oo0o0oo2 != null && oo0o0oo2.f37755OooOOO.f12890OooO0O0 != 0) {
            Arrays.fill(iArr, 0);
            wrapperNestedScroll(i - i4, i2 - i5, iArr, i3);
            i4 -= iArr[0];
            i5 -= iArr[1];
        }
        int i6 = i4;
        int i7 = i5;
        if (!z) {
            Arrays.fill(iArr, 0);
            helperOnNestedPreScroll(view, i - i6, i2 - i7, iArr, i3);
            i6 += iArr[0];
            i7 += iArr[1];
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        helperOnNestedScroll(view, i, i2, i3, i4, i5);
        int[] iArr = this.mParentOffsetInWindow;
        int i6 = i3 + iArr[0];
        int i7 = i4 + iArr[1];
        if (i6 == 0 && i7 == 0) {
            return;
        }
        if (i5 == 1) {
            requestDisallowInterceptTouchEvent(false);
        }
        wrapperNestedScroll(i6, i7, new int[2], i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mNestedInProgress = true;
        this.mNestedFlyConsumed = false;
        this.flyToClose = null;
        this.flyToOpen = null;
        this.mCurNestedType = i2;
        helperOnNestedScrollAccepted(view, view2, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0054  */
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = (i & 2) != 0;
        boolean z4 = (i & 1) != 0;
        for (OooOOO0 oooOOO0 : this.mConsumers) {
            int i3 = oooOOO0.f12890OooO0O0;
            if (i3 != 0) {
                z2 = (z4 && (i3 == 1 || i3 == 2)) || (z3 && (i3 == 4 || i3 == 8));
            } else {
                if (z4) {
                    int i4 = oooOOO0.f12901OooOOO0;
                    if (!((i4 & 1) != 0)) {
                        if (!((i4 & 2) != 0)) {
                            z = false;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (z3) {
                        int i5 = oooOOO0.f12901OooOOO0;
                        if (!((i5 & 4) != 0)) {
                            if ((i5 & 8) != 0) {
                            }
                        }
                    }
                }
            }
            if (z2) {
                startNestedScroll(i, i2);
                return true;
            }
        }
        return false;
    }

    public void onStopNestedScroll(View view, int i) {
        this.mNestedInProgress = false;
        helperOnStopNestedScroll(view, i);
        if (i == this.mCurNestedType) {
            this.mCurNestedType = -1;
            oo0o0Oo oo0o0oo = this.mHelper;
            if (oo0o0oo == null || oo0o0oo.f37745OooO0O0 != 3) {
                return;
            }
            oo0o0oo.OooO0o0(0.0f, 0.0f);
        }
    }

    public boolean startNestedScroll(int i, int i2) {
        return super.startNestedScroll(i);
    }

    public void stopNestedScroll(int i) {
        super.stopNestedScroll();
    }

    public SmartSwipeWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHelpers = new LinkedList();
        this.mConsumers = new LinkedList();
        this.mIsNestedScrollingEnabled = true;
        this.mMatchParentChildren = new ArrayList<>(1);
        this.mCurNestedType = -1;
        this.mParentOffsetInWindow = new int[2];
        init();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f12908OooO00o;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12908OooO00o = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.SmartSwipeWrapper_Layout);
            this.f12908OooO00o = typedArrayObtainStyledAttributes.getInt(OooO0o.SmartSwipeWrapper_Layout_swipe_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.f12908OooO00o = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12908OooO00o = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12908OooO00o = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f12908OooO00o = 0;
            this.f12908OooO00o = layoutParams.f12908OooO00o;
        }
    }

    @TargetApi(21)
    public SmartSwipeWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHelpers = new LinkedList();
        this.mConsumers = new LinkedList();
        this.mIsNestedScrollingEnabled = true;
        this.mMatchParentChildren = new ArrayList<>(1);
        this.mCurNestedType = -1;
        this.mParentOffsetInWindow = new int[2];
        init();
    }
}
