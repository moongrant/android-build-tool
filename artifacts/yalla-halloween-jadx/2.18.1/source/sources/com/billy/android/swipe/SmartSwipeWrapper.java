package com.billy.android.swipe;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p209o00o0oOO.o00O00O;
import p209o00o0oOO.o00O00o0;
import p209o00o0oOO.oOO00O;
import p211o00o0oo.o00O0O00;

/* JADX INFO: loaded from: classes.dex */
public class SmartSwipeWrapper extends ViewGroup {
    private static final int NESTED_TYPE_INVALID = -1;
    private Boolean flyToClose;
    private Boolean flyToOpen;
    public final List<o00O00o0> mConsumers;
    public View mContentView;
    public int mCurNestedType;
    public o00O0O00 mHelper;
    public final List<o00O0O00> mHelpers;
    public boolean mInflateFromXml;
    public boolean mIsNestedScrollingEnabled;
    private final ArrayList<View> mMatchParentChildren;
    public boolean mNestedFlyConsumed;
    public boolean mNestedInProgress;
    public int[] mParentOffsetInWindow;

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
        o00O0O00 o00o0o01 = this.mHelper;
        if (o00o0o01 == null) {
            for (o00O0O00 o00o0o02 : this.mHelpers) {
                if (o00o0o02 != null) {
                    if (o00o0o02.OooOOoo(i3 == 1 ? -3 : -2, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -i, -i2, false)) {
                        this.mHelper = o00o0o02;
                        return;
                    }
                }
            }
            return;
        }
        o00O00o0 o00o00o1 = o00o0o01.f33382OooOOO;
        Objects.requireNonNull(o00o00o1);
        if (!z) {
            this.mHelper.OooO(-i, -i2, iArr, false);
            float f = o00o00o1.f33360OooOO0O;
            if (f >= 1.0f || f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.mHelper = null;
                return;
            }
            return;
        }
        if (this.flyToOpen == null) {
            int i4 = o00o00o1.f33352OooO0O0;
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
        this.mHelper.OooO(-i, -i2, iArr, true);
        if ((!this.flyToOpen.booleanValue() || o00o00o1.f33360OooOO0O < 1.0f) && (!this.flyToClose.booleanValue() || o00o00o1.f33360OooOO0O > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            return;
        }
        this.mNestedFlyConsumed = true;
        o00O0O00 o00o0o03 = this.mHelper;
        if (o00o0o03.f33372OooO0O0 == 3) {
            o00o0o03.OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public <T extends o00O00o0> T addConsumer(T t) {
        if (t != null) {
            this.mConsumers.add(t);
            o00O0O00 o00o0o01 = t.f33361OooOO0o;
            if (o00o0o01 == null) {
                o00o0o01 = new o00O0O00(getContext(), this, t);
                o00o0o01.f33373OooO0OO = (int) (o00o0o01.f33373OooO0OO * 1.0f);
            }
            t.f33351OooO00o = this;
            if (t.f33365OooOOOo == 0) {
                t.f33365OooOOOo = oOO00O.OooO00o(150, getContext());
            }
            t.f33361OooOO0o = o00o0o01;
            t.f33351OooO00o.isInflateFromXml();
            for (p213o00o0ooo.o00O0O00 o00o0o02 : t.f33364OooOOOO) {
                if (o00o0o02 != null) {
                    o00o0o02.OooO00o();
                }
            }
            this.mHelpers.add(o00o0o01);
        }
        return t;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mHelpers.isEmpty()) {
            return;
        }
        boolean z = false;
        for (o00O0O00 o00o0o01 : this.mHelpers) {
            if (o00o0o01.f33372OooO0O0 == 2) {
                boolean zComputeScrollOffset = o00o0o01.f33383OooOOO0.computeScrollOffset();
                int currX = o00o0o01.f33383OooOOO0.getCurrX();
                int currY = o00o0o01.f33383OooOOO0.getCurrY();
                int i = currX - o00o0o01.f33385OooOOOo;
                int i2 = currY - o00o0o01.f33386OooOOo0;
                if (i != 0) {
                    o00o0o01.f33385OooOOOo = currX;
                }
                if (i2 != 0) {
                    o00o0o01.f33386OooOOo0 = currY;
                }
                if (i != 0 || i2 != 0) {
                    o00o0o01.f33382OooOOO.OooOo00(currX, currY, i, i2);
                }
                if (zComputeScrollOffset && currX == o00o0o01.f33383OooOOO0.getFinalX() && currY == o00o0o01.f33383OooOOO0.getFinalY()) {
                    o00o0o01.f33383OooOOO0.abortAnimation();
                    zComputeScrollOffset = false;
                }
                if (!zComputeScrollOffset) {
                    o00o0o01.OooOOO(0);
                }
            }
            if (o00o0o01.f33372OooO0O0 == 2) {
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
        for (o00O00o0 o00o00o1 : this.mConsumers) {
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

    public List<o00O00o0> getAllConsumers() {
        return this.mConsumers;
    }

    public o00O00o0 getConsumerByType(Class<? extends o00O00o0> cls) {
        for (o00O00o0 o00o00o1 : this.mConsumers) {
            if (o00o00o1 != null && o00o00o1.getClass() == cls) {
                return o00o00o1;
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
        Iterator<o00O00o0> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (o00O00o0 o00o00o1 : this.mConsumers) {
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
            if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).f12337OooO00o == 0) {
                setContentView(childAt);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mNestedInProgress) {
            o00O0O00 o00o0o01 = this.mHelper;
            if (o00o0o01 != null) {
                return o00o0o01.OooOOOO(motionEvent);
            }
            for (o00O0O00 o00o0o02 : this.mHelpers) {
                if (o00o0o02.OooOOOO(motionEvent)) {
                    this.mHelper = o00o0o02;
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o00O0O00 o00o0o01 = this.mHelper;
        if (o00o0o01 != null) {
            Objects.requireNonNull(o00o0o01.f33382OooOOO);
        } else {
            for (o00O00o0 o00o00o1 : this.mConsumers) {
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
                    i3 = 1073741824;
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, getMeasuredWidth()), 1073741824);
                } else {
                    i3 = 1073741824;
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i, 0, i6);
                }
                int i7 = layoutParams2.height;
                view.measure(childMeasureSpec, i7 == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, getMeasuredHeight()), i3) : ViewGroup.getChildMeasureSpec(i2, 0, i7));
            }
        }
        for (o00O00o0 o00o00o1 : this.mConsumers) {
            if (o00o00o1 != null) {
                o00o00o1.f33351OooO00o.getMeasuredWidth();
                o00o00o1.f33351OooO00o.getMeasuredHeight();
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
        o00O0O00 o00o0o01 = this.mHelper;
        if (o00o0o01 == null) {
            for (o00O0O00 o00o0o02 : this.mHelpers) {
                o00o0o02.OooOO0(motionEvent);
                if (o00o0o02.f33372OooO0O0 == 1) {
                    this.mHelper = o00o0o02;
                    break;
                }
            }
        } else {
            o00o0o01.OooOO0(motionEvent);
        }
        return true;
    }

    public SmartSwipeWrapper removeAllConsumers() {
        Iterator<o00O00o0> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            o00O00o0 next = it.next();
            it.remove();
            if (next != null) {
                next.OooOOOo();
                o00O0O00 o00o0o01 = next.f33361OooOO0o;
                this.mHelpers.remove(o00o0o01);
                if (this.mHelper == o00o0o01) {
                    this.mHelper = null;
                }
            }
        }
        return this;
    }

    public SmartSwipeWrapper removeConsumer(o00O00o0 o00o00o1) {
        if (this.mConsumers.remove(o00o00o1)) {
            o00o00o1.OooOOOo();
            o00O0O00 o00o0o01 = o00o00o1.f33361OooOO0o;
            this.mHelpers.remove(o00o0o01);
            if (this.mHelper == o00o0o01) {
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
        for (o00O00o0 o00o00o1 : this.mConsumers) {
            if (z) {
                o00o00o1.f33363OooOOO0 |= i;
            } else {
                if ((o00o00o1.f33352OooO0O0 & i) != 0) {
                    o00o00o1.OooO0o();
                }
                o00o00o1.f33363OooOOO0 &= ~i;
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
        o00O0O00 o00o0o01 = this.mHelper;
        if (o00o0o01 == null || o00o0o01.f33382OooOOO.f33360OooOO0O == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
        o00O0O00 o00o0o02 = this.mHelper;
        if (o00o0o02 != null && o00o0o02.f33382OooOOO.f33352OooO0O0 != 0) {
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

    /* JADX WARN: Code duplicated, block: B:28:0x003c  */
    /* JADX WARN: Code duplicated, block: B:29:0x003e  */
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        boolean z;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 1) != 0;
        for (o00O00o0 o00o00o1 : this.mConsumers) {
            int i3 = o00o00o1.f33352OooO0O0;
            if (i3 != 0) {
                if ((z3 && (i3 == 1 || i3 == 2)) || (z2 && (i3 == 4 || i3 == 8))) {
                    z = true;
                } else {
                    z = false;
                }
            } else if ((z3 && (o00o00o1.OooOO0o() || o00o00o1.OooOOO())) || (z2 && (o00o00o1.OooOOOO() || o00o00o1.OooOO0()))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
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
            o00O0O00 o00o0o01 = this.mHelper;
            if (o00o0o01 == null || o00o0o01.f33372OooO0O0 != 3) {
                return;
            }
            o00o0o01.OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
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
        public int f12337OooO00o;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12337OooO00o = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00O00O.SmartSwipeWrapper_Layout);
            this.f12337OooO00o = typedArrayObtainStyledAttributes.getInt(o00O00O.SmartSwipeWrapper_Layout_swipe_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.f12337OooO00o = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12337OooO00o = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12337OooO00o = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f12337OooO00o = 0;
            this.f12337OooO00o = layoutParams.f12337OooO00o;
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
