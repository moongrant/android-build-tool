package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class o0OOO0o extends ListView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f5457Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Rect f5458Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f5459Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f5460Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO0OO f5461OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f5462OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f5463OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Field f5464OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f5465OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f5466OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public androidx.core.widget.OooOOO0 f5467OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooO0o f5468OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f5469o000oOoO;

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    @RequiresApi(30)
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static Method f5470OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static Method f5471OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static Method f5472OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static boolean f5473OooO0Oo;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f5470OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f5471OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f5472OooO0OO = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f5473OooO0Oo = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public static class OooO0OO extends p013OooOo0O.OooO {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f5474Oooo0oO;

        public OooO0OO(Drawable drawable) {
            super(drawable);
            this.f5474Oooo0oO = true;
        }

        @Override // p013OooOo0O.OooO, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f5474Oooo0oO) {
                super.draw(canvas);
            }
        }

        @Override // p013OooOo0O.OooO, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f5474Oooo0oO) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p013OooOo0O.OooO, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f5474Oooo0oO) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p013OooOo0O.OooO, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f5474Oooo0oO) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p013OooOo0O.OooO, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f5474Oooo0oO) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class OooO0o implements Runnable {
        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f5468OoooOo0 = null;
            o0ooo0o2.drawableStateChanged();
        }
    }

    public o0OOO0o(@NonNull Context context, boolean z) {
        super(context, null, OooOo00.OooO00o.dropDownListViewStyle);
        this.f5458Oooo0o = new Rect();
        this.f5459Oooo0oO = 0;
        this.f5460Oooo0oo = 0;
        this.f5457Oooo = 0;
        this.f5463OoooO00 = 0;
        this.f5469o000oOoO = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f5464OoooO0O = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        OooO0OO oooO0OO = this.f5461OoooO;
        if (oooO0OO != null) {
            oooO0OO.f5474Oooo0oO = z;
        }
    }

    public final int OooO00o(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    public final boolean OooO0O0(MotionEvent motionEvent, int i) {
        boolean z;
        View childAt;
        View childAt2;
        androidx.core.widget.OooOOO0 oooOOO0;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = false;
                if (z || z2) {
                    this.f5466OoooOOO = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f5462OoooO0 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.f5467OoooOOo == null) {
                        this.f5467OoooOOo = new androidx.core.widget.OooOOO0(this);
                    }
                    androidx.core.widget.OooOOO0 oooOOO1 = this.f5467OoooOOo;
                    boolean z3 = oooOOO1.f7998Ooooo00;
                    oooOOO1.f7998Ooooo00 = true;
                    oooOOO1.onTouch(this, motionEvent);
                } else {
                    oooOOO0 = this.f5467OoooOOo;
                    if (oooOOO0 != null) {
                        if (oooOOO0.f7998Ooooo00) {
                            oooOOO0.OooO0Oo();
                        }
                        oooOOO0.f7998Ooooo00 = false;
                    }
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f5466OoooOOO = true;
                OooO00o.OooO00o(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f5462OoooO0;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f5462OoooO0 = iPointToPosition;
                OooO00o.OooO00o(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f5458Oooo0o;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f5459Oooo0oO;
                rect.top -= this.f5460Oooo0oo;
                rect.right += this.f5457Oooo;
                rect.bottom += this.f5463OoooO00;
                try {
                    boolean z5 = this.f5464OoooO0O.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        this.f5464OoooO0O.set(this, Boolean.valueOf(!z5));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z4) {
                    Rect rect2 = this.f5458Oooo0o;
                    float fExactCenterX = rect2.exactCenterX();
                    float fExactCenterY = rect2.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    o000Ooo.o0OOO0o.OooO0O0.OooO0o0(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO0o0(selector2, f, f2);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.f5466OoooOOO = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5462OoooO0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f5466OoooOOO = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f5462OoooO0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f5467OoooOOo == null) {
                this.f5467OoooOOo = new androidx.core.widget.OooOOO0(this);
            }
            androidx.core.widget.OooOOO0 oooOOO2 = this.f5467OoooOOo;
            boolean z6 = oooOOO2.f7998Ooooo00;
            oooOOO2.f7998Ooooo00 = true;
            oooOOO2.onTouch(this, motionEvent);
        } else {
            oooOOO0 = this.f5467OoooOOo;
            if (oooOOO0 != null) {
                if (oooOOO0.f7998Ooooo00) {
                    oooOOO0.OooO0Oo();
                }
                oooOOO0.f7998Ooooo00 = false;
            }
        }
        return z;
    }

    public final void OooO0OO() {
        Drawable selector = getSelector();
        if (selector != null && this.f5466OoooOOO && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f5458Oooo0o.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f5458Oooo0o);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f5468OoooOo0 != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        OooO0OO();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f5469o000oOoO || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f5469o000oOoO || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f5469o000oOoO || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f5469o000oOoO && this.f5465OoooOO0) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f5468OoooOo0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5468OoooOo0 == null) {
            OooO0o oooO0o = new OooO0o();
            this.f5468OoooOo0 = oooO0o;
            post(oooO0o);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !OooO0O0.f5473OooO0Oo) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            OooO0O0.f5470OooO00o.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            OooO0O0.f5471OooO0O0.invoke(this, Integer.valueOf(iPointToPosition));
                            OooO0O0.f5472OooO0OO.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                OooO0OO();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5462OoooO0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        OooO0o oooO0o = this.f5468OoooOo0;
        if (oooO0o != null) {
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            o0ooo0o2.f5468OoooOo0 = null;
            o0ooo0o2.removeCallbacks(oooO0o);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f5465OoooOO0 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        OooO0OO oooO0OO = drawable != null ? new OooO0OO(drawable) : null;
        this.f5461OoooO = oooO0OO;
        super.setSelector(oooO0OO);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5459Oooo0oO = rect.left;
        this.f5460Oooo0oo = rect.top;
        this.f5457Oooo = rect.right;
        this.f5463OoooO00 = rect.bottom;
    }
}
