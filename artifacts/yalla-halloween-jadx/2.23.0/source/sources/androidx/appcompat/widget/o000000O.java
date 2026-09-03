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
import androidx.core.os.BuildCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class o000000O extends ListView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f3203OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f3204OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f3205OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f3206OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f3207OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f3208OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f3209OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f3210OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f3211OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public androidx.core.widget.OooOO0O f3212OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f3213OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOO0 f3214OooOOOO;

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Field f3215OooO00o;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f3215OooO00o = declaredField;
        }
    }

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
        public static final Method f3216OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Method f3217OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Method f3218OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final boolean f3219OooO0Oo;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f3216OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f3217OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f3218OooO0OO = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f3219OooO0Oo = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    @RequiresApi(33)
    public static class OooO0OO {
        @DoNotInline
        public static boolean OooO00o(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        public static void OooO0O0(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    public static class OooO0o extends OooOo.OooO0OO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f3220OooO0o0;

        public OooO0o(Drawable drawable) {
            super(drawable);
            this.f3220OooO0o0 = true;
        }

        @Override // OooOo.OooO0OO, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f3220OooO0o0) {
                super.draw(canvas);
            }
        }

        @Override // OooOo.OooO0OO, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f3220OooO0o0) {
                super.setHotspot(f, f2);
            }
        }

        @Override // OooOo.OooO0OO, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3220OooO0o0) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // OooOo.OooO0OO, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f3220OooO0o0) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // OooOo.OooO0OO, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f3220OooO0o0) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o000000O o000000o2 = o000000O.this;
            o000000o2.f3214OooOOOO = null;
            o000000o2.drawableStateChanged();
        }
    }

    public o000000O(@NonNull Context context, boolean z) {
        super(context, null, p012OooOo0O.OooOOO0.dropDownListViewStyle);
        this.f3204OooO0Oo = new Rect();
        this.f3206OooO0o0 = 0;
        this.f3205OooO0o = 0;
        this.f3207OooO0oO = 0;
        this.f3208OooO0oo = 0;
        this.f3211OooOO0o = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        OooO0o oooO0o = this.f3209OooOO0;
        if (oooO0o != null) {
            oooO0o.f3220OooO0o0 = z;
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
        int i3 = 0;
        View view = null;
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
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, Pow2.MAX_POW2) : View.MeasureSpec.makeMeasureSpec(0, 0));
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

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    public final boolean OooO0O0(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zOooO00o;
        boolean z2;
        View childAt;
        View childAt2;
        androidx.core.widget.OooOO0O oooOO0O;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || z3) {
                this.f3213OooOOO0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f3203OooO - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z) {
                if (this.f3212OooOOO == null) {
                    this.f3212OooOOO = new androidx.core.widget.OooOO0O(this);
                }
                androidx.core.widget.OooOO0O oooOO0O2 = this.f3212OooOOO;
                boolean z4 = oooOO0O2.f5512OooOOoo;
                oooOO0O2.f5512OooOOoo = true;
                oooOO0O2.onTouch(this, motionEvent);
            } else {
                oooOO0O = this.f3212OooOOO;
                if (oooOO0O != null) {
                    if (oooOO0O.f5512OooOOoo) {
                        oooOO0O.OooO0Oo();
                    }
                    oooOO0O.f5512OooOOoo = false;
                }
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f3213OooOOO0 = true;
                OooO00o.OooO00o(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f3203OooO;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3203OooO = iPointToPosition;
                OooO00o.OooO00o(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3204OooO0Oo;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3206OooO0o0;
                rect.top -= this.f3205OooO0o;
                rect.right += this.f3207OooO0oO;
                rect.bottom += this.f3208OooO0oo;
                if (BuildCompat.OooO0OO()) {
                    zOooO00o = OooO0OO.OooO00o(this);
                } else {
                    Field field = OooO.f3215OooO00o;
                    if (field != null) {
                        try {
                            zOooO00o = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zOooO00o = false;
                        }
                    } else {
                        zOooO00o = false;
                    }
                }
                if (childAt3.isEnabled() != zOooO00o) {
                    boolean z6 = !zOooO00o;
                    if (BuildCompat.OooO0OO()) {
                        OooO0OO.OooO0O0(this, z6);
                    } else {
                        Field field2 = OooO.f3215OooO00o;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z2 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    o00000oo.o00Ooo.OooO0O0.OooO0o0(selector, fExactCenterX, fExactCenterY);
                } else {
                    z2 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    o00000oo.o00Ooo.OooO0O0.OooO0o0(selector2, f, f2);
                }
                setSelectorEnabled(z2);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z3 = false;
            }
        }
        if (z) {
            this.f3213OooOOO0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3203OooO - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f3213OooOOO0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3203OooO - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f3212OooOOO == null) {
                this.f3212OooOOO = new androidx.core.widget.OooOO0O(this);
            }
            androidx.core.widget.OooOO0O oooOO0O3 = this.f3212OooOOO;
            boolean z7 = oooOO0O3.f5512OooOOoo;
            oooOO0O3.f5512OooOOoo = true;
            oooOO0O3.onTouch(this, motionEvent);
        } else {
            oooOO0O = this.f3212OooOOO;
            if (oooOO0O != null) {
                if (oooOO0O.f5512OooOOoo) {
                    oooOO0O.OooO0Oo();
                }
                oooOO0O.f5512OooOOoo = false;
            }
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3204OooO0Oo;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3214OooOOOO != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f3213OooOOO0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3211OooOO0o || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3211OooOO0o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3211OooOO0o || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3211OooOO0o && this.f3210OooOO0O) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3214OooOOOO = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3214OooOOOO == null) {
            OooOO0 oooOO1 = new OooOO0();
            this.f3214OooOOOO = oooOO1;
            post(oooOO1);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !OooO0O0.f3219OooO0Oo) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            OooO0O0.f3216OooO00o.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            OooO0O0.f3217OooO0O0.invoke(this, Integer.valueOf(iPointToPosition));
                            OooO0O0.f3218OooO0OO.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3213OooOOO0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3203OooO = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        OooOO0 oooOO1 = this.f3214OooOOOO;
        if (oooOO1 != null) {
            o000000O o000000o2 = o000000O.this;
            o000000o2.f3214OooOOOO = null;
            o000000o2.removeCallbacks(oooOO1);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f3210OooOO0O = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        OooO0o oooO0o = drawable != null ? new OooO0o(drawable) : null;
        this.f3209OooOO0 = oooO0o;
        super.setSelector(oooO0o);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3206OooO0o0 = rect.left;
        this.f3205OooO0o = rect.top;
        this.f3207OooO0oO = rect.right;
        this.f3208OooO0oo = rect.bottom;
    }
}
