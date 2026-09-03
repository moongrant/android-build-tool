package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000000;
import androidx.core.view.o0000Ooo;
import androidx.core.view.o000OOo0;
import androidx.core.view.o0O0O00;
import androidx.core.view.o0OO00O;
import androidx.core.view.o0Oo0oo;
import com.qiniu.android.storage.Configuration;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o0O0O00, o0Oo0oo, o0000Ooo {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final float f5478OooOooO = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final OooO00o f5479OooOooo = new OooO00o();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final int[] f5480Oooo000 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final EdgeEffect f5481OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f5482OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f5483OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f5484OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OverScroller f5485OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final EdgeEffect f5486OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f5487OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f5488OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f5489OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f5490OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public View f5491OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public VelocityTracker f5492OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f5493OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f5494OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f5495OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f5496OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f5497OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f5498OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f5499OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int[] f5500OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int[] f5501OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public SavedState f5502OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f5503OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o000000 f5504OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f5505OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o0OO00O f5506OooOoo0;

    public static class OooO00o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            o0000O.o000000.OooO0OO(accessibilityEvent, nestedScrollView.getScrollX());
            o0000O.o000000.OooO0Oo(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, o0000O.o0O0O00 o0o0o00) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            o0o0o00.OooOO0O(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            o0o0o00.OooOOOo(true);
            if (nestedScrollView.getScrollY() > 0) {
                o0o0o00.OooO0O0(o0000O.o0O0O00.OooO00o.f33519OooOO0O);
                o0o0o00.OooO0O0(o0000O.o0O0O00.OooO00o.f33523OooOOOO);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                o0o0o00.OooO0O0(o0000O.o0O0O00.OooO00o.f33518OooOO0);
                o0o0o00.OooO0O0(o0000O.o0O0O00.OooO00o.f33526OooOOo0);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.OooOOOo(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.OooOOOo(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    @RequiresApi(21)
    public static class OooO0O0 {
        @DoNotInline
        public static boolean OooO00o(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface OooO0OO {
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5507OooO0Oo;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5507OooO0Oo = parcel.readInt();
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return p022Oooo00O.OooOO0.OooO00o(sb, this.f5507OooO0Oo, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5507OooO0Oo);
        }
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean OooO0oO(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && OooO0oO((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f5505OooOoo == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f5505OooOoo = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5505OooOoo;
    }

    public final void OooO(int i, int i2, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5506OooOoo0.OooO0Oo(scrollY2, i - scrollY2, i2, iArr);
    }

    public final boolean OooO00o(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !OooO0oo(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            OooOOO(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f5483OooO0o;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            OooOOO(OooO0O0(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!OooO0oo(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int OooO0O0(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean OooO0OO(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        return this.f5506OooOoo0.OooO0OO(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public final boolean OooO0Oo(@NonNull KeyEvent keyEvent) {
        boolean z;
        this.f5483OooO0o.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i = Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? OooO0o(33) : OooO00o(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? OooO0o(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED) : OooO00o(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);
        }
        if (keyCode == 62) {
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            OooOO0o(i);
            return false;
        }
        if (keyCode == 92) {
            return OooO0o(33);
        }
        if (keyCode == 93) {
            return OooO0o(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);
        }
        if (keyCode == 122) {
            OooOO0o(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        OooOO0o(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);
        return false;
    }

    public final boolean OooO0o(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f5483OooO0o;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return OooOOO0(i, rect.top, rect.bottom);
    }

    public final void OooO0o0(int i) {
        if (getChildCount() > 0) {
            this.f5485OooO0oO.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            OooOOo0(2, 1);
            this.f5503OooOoO0 = getScrollY();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public final boolean OooO0oo(View view, int i, int i2) {
        Rect rect = this.f5483OooO0o;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void OooOO0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5498OooOo0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5487OooOO0 = (int) motionEvent.getY(i);
            this.f5498OooOo0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5492OooOOOO;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean OooOO0O(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i3 + i;
        int i7 = i4 + 0;
        if (i5 <= 0 && i5 >= 0) {
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i6 <= i7) {
            if (i6 < 0) {
                i6 = 0;
            } else {
                z2 = false;
            }
            if (z2 && !this.f5506OooOoo0.OooO0oo(1)) {
                this.f5485OooO0oO.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i5, i6, z, z2);
            return z || z2;
        }
        i6 = i7;
        z2 = true;
        if (z2) {
            this.f5485OooO0oO.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i6, z, z2);
        if (z) {
            return true;
        }
    }

    public final void OooOO0o(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f5483OooO0o;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        OooOOO0(i, i2, i3);
    }

    public final int OooOOO(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        if (i3 == 1) {
            OooOOo0(2, i3);
        }
        boolean zOooO0OO = OooO0OO(0, i, this.f5501OooOo0o, this.f5500OooOo0O, i3);
        int[] iArr = this.f5501OooOo0o;
        int[] iArr2 = this.f5500OooOo0O;
        if (zOooO0OO) {
            i4 = i - iArr[1];
            i5 = iArr2[1] + 0;
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = OooOO0O(i4, 0, scrollY, scrollRange) && !this.f5506OooOoo0.OooO0oo(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f5506OooOoo0.OooO0o(0, scrollY2, 0, i4 - scrollY2, this.f5500OooOo0O, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f5481OooO;
        EdgeEffect edgeEffect2 = this.f5486OooO0oo;
        if (i8 < 0) {
            if (z3) {
                OooO.OooO0O0(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            OooO.OooO0O0(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
            z2 = false;
        }
        if (z2 && i3 == 0) {
            this.f5492OooOOOO.clear();
        }
        if (i3 == 1) {
            OooOOoo(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean OooOOO0(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            OooOOO(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public final boolean OooOOOO(@NonNull EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fOooO00o = OooO.OooO00o(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f5482OooO0Oo * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f5478OooOooO;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fOooO00o;
    }

    public final void OooOOOo(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5484OooO0o0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f5485OooO0oO.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            if (z) {
                OooOOo0(2, 1);
            } else {
                OooOOoo(1);
            }
            this.f5503OooOoO0 = getScrollY();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        } else {
            if (!this.f5485OooO0oO.isFinished()) {
                this.f5485OooO0oO.abortAnimation();
                OooOOoo(1);
            }
            scrollBy(i, i2);
        }
        this.f5484OooO0o0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean OooOOo(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f5486OooO0oo;
        if (OooO.OooO00o(edgeEffect) != 0.0f) {
            OooO.OooO0O0(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f5481OooO;
        if (OooO.OooO00o(edgeEffect2) == 0.0f) {
            return z;
        }
        OooO.OooO0O0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final boolean OooOOo0(int i, int i2) {
        return this.f5506OooOoo0.OooOO0(i, i2);
    }

    public final void OooOOoo(int i) {
        this.f5506OooOoo0.OooOO0O(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        boolean z;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.f5485OooO0oO.isFinished()) {
            return;
        }
        this.f5485OooO0oO.computeScrollOffset();
        int currY = this.f5485OooO0oO.getCurrY();
        int i2 = currY - this.f5503OooOoO0;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f5481OooO;
        EdgeEffect edgeEffect2 = this.f5486OooO0oo;
        if (i2 <= 0 || OooO.OooO00o(edgeEffect2) == 0.0f) {
            if (i2 < 0 && OooO.OooO00o(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(OooO.OooO0O0(edgeEffect, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect.finish();
                }
            }
            this.f5503OooOoO0 = currY;
            iArr = this.f5501OooOo0o;
            z = false;
            iArr[1] = 0;
            OooO0OO(0, i2, iArr, null, 1);
            i = i2 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                OooOO0O(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.f5506OooOoo0.OooO0o(0, scrollY2, 0, i3, this.f5500OooOo0O, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f5485OooO0oO.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f5485OooO0oO.getCurrVelocity());
                    }
                }
                this.f5485OooO0oO.abortAnimation();
                OooOOoo(1);
            }
            if (!this.f5485OooO0oO.isFinished()) {
                OooOOoo(1);
            } else {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
        }
        iRound = Math.round(OooO.OooO0O0(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect2.finish();
        }
        i2 -= iRound;
        this.f5503OooOoO0 = currY;
        iArr = this.f5501OooOo0o;
        z = false;
        iArr[1] = 0;
        OooO0OO(0, i2, iArr, null, 1);
        i = i2 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            OooOO0O(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i4 = i - scrollY4;
            iArr[1] = 0;
            this.f5506OooOoo0.OooO0o(0, scrollY4, 0, i4, this.f5500OooOo0O, 1, iArr);
            i = i4 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                if (i < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f5485OooO0oO.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f5485OooO0oO.getCurrVelocity());
                }
            }
            this.f5485OooO0oO.abortAnimation();
            OooOOoo(1);
        }
        if (!this.f5485OooO0oO.isFinished()) {
            OooOOoo(1);
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || OooO0Oo(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5506OooOoo0.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5506OooOoo0.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return OooO0OO(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return this.f5506OooOoo0.OooO0o0(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f5486OooO0oo;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (OooO0O0.OooO00o(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (OooO0O0.OooO00o(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f5481OooO;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (OooO0O0.OooO00o(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (OooO0O0.OooO00o(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o000000 o000000Var = this.f5504OooOoOO;
        return o000000Var.f5428OooO0O0 | o000000Var.f5427OooO00o;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f5506OooOoo0.OooO0oo(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5506OooOoo0.f5466OooO0Oo;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(@NonNull View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5489OooOO0o = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() != 8 || this.f5490OooOOO) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else {
            if ((motionEvent.getSource() & Configuration.BLOCK_SIZE) == 4194304) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            } else {
                width = 0;
                axisValue = 0.0f;
            }
        }
        if (axisValue == 0.0f) {
            return false;
        }
        OooOOO(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, (motionEvent.getSource() & 8194) == 8194);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f5490OooOOO) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                this.f5487OooOO0 = y;
                this.f5498OooOo0 = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker2 = this.f5492OooOOOO;
                if (velocityTracker2 == null) {
                    this.f5492OooOOOO = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.f5492OooOOOO.addMovement(motionEvent);
                this.f5485OooO0oO.computeScrollOffset();
                if (!OooOOo(motionEvent) && this.f5485OooO0oO.isFinished()) {
                    z2 = false;
                }
                this.f5490OooOOO = z2;
                OooOOo0(2, 0);
            } else {
                if (!OooOOo(motionEvent) && this.f5485OooO0oO.isFinished()) {
                    z2 = false;
                }
                this.f5490OooOOO = z2;
                VelocityTracker velocityTracker3 = this.f5492OooOOOO;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5492OooOOOO = null;
                }
            }
        } else if (i == 1) {
            this.f5490OooOOO = false;
            this.f5498OooOo0 = -1;
            velocityTracker = this.f5492OooOOOO;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5492OooOOOO = null;
            }
            if (this.f5485OooO0oO.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
            OooOOoo(0);
        } else if (i == 2) {
            int i2 = this.f5498OooOo0;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f5487OooOO0) > this.f5494OooOOo && (2 & getNestedScrollAxes()) == 0) {
                        this.f5490OooOOO = true;
                        this.f5487OooOO0 = y2;
                        if (this.f5492OooOOOO == null) {
                            this.f5492OooOOOO = VelocityTracker.obtain();
                        }
                        this.f5492OooOOOO.addMovement(motionEvent);
                        this.f5497OooOo = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f5490OooOOO = false;
            this.f5498OooOo0 = -1;
            velocityTracker = this.f5492OooOOOO;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5492OooOOOO = null;
            }
            if (this.f5485OooO0oO.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
            OooOOoo(0);
        } else if (i == 6) {
            OooOO0(motionEvent);
        }
        return this.f5490OooOOO;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f5488OooOO0O = false;
        View view = this.f5491OooOOO0;
        if (view != null && OooO0oO(view, this)) {
            View view2 = this.f5491OooOOO0;
            Rect rect = this.f5483OooO0o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iOooO0O0 = OooO0O0(rect);
            if (iOooO0O0 != 0) {
                scrollBy(0, iOooO0O0);
            }
        }
        this.f5491OooOOO0 = null;
        if (!this.f5489OooOO0o) {
            if (this.f5502OooOoO != null) {
                scrollTo(getScrollX(), this.f5502OooOoO.f5507OooO0Oo);
                this.f5502OooOoO = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5489OooOO0o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5493OooOOOo && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Pow2.MAX_POW2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        OooO0o0((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        OooO0OO(i, i2, iArr, null, i3);
    }

    @Override // androidx.core.view.o0O0O00
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        OooO(i4, i5, iArr);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f5504OooOoOO.OooO00o(i, i2);
        OooOOo0(2, i2);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ OooO0oo(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5502OooOoO = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5507OooO0Oo = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !OooO0oo(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f5483OooO0o;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iOooO0O0 = OooO0O0(rect);
        if (iOooO0O0 != 0) {
            if (this.f5495OooOOo0) {
                OooOOOo(0, iOooO0O0, false);
            } else {
                scrollBy(0, iOooO0O0);
            }
        }
    }

    @Override // androidx.core.view.oo0o0Oo
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onStopNestedScroll(@NonNull View view, int i) {
        this.f5504OooOoOO.OooO0O0(i);
        OooOOoo(i);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        int i;
        float f;
        float fOooO0O0;
        int iRound;
        int i2;
        ViewParent parent2;
        if (this.f5492OooOOOO == null) {
            this.f5492OooOOOO = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5497OooOo = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f5497OooOo);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f5486OooO0oo;
            EdgeEffect edgeEffect2 = this.f5481OooO;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5492OooOOOO;
                velocityTracker.computeCurrentVelocity(1000, this.f5499OooOo00);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5498OooOo0);
                if (Math.abs(yVelocity) >= this.f5496OooOOoo) {
                    if (OooO.OooO00o(edgeEffect) == 0.0f) {
                        if (OooO.OooO00o(edgeEffect2) != 0.0f) {
                            int i3 = -yVelocity;
                            if (OooOOOO(edgeEffect2, i3)) {
                                edgeEffect2.onAbsorb(i3);
                            } else {
                                OooO0o0(i3);
                            }
                        } else {
                            z = false;
                        }
                        if (!z) {
                            i = -yVelocity;
                            f = i;
                            if (!dispatchNestedPreFling(0.0f, f)) {
                                dispatchNestedFling(0.0f, f, true);
                                OooO0o0(i);
                            }
                        }
                    } else if (OooOOOO(edgeEffect, yVelocity)) {
                        edgeEffect.onAbsorb(yVelocity);
                    } else {
                        OooO0o0(-yVelocity);
                    }
                    z = true;
                    if (!z) {
                        i = -yVelocity;
                        f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            OooO0o0(i);
                        }
                    }
                } else if (this.f5485OooO0oO.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOO0O(this);
                }
                this.f5498OooOo0 = -1;
                this.f5490OooOOO = false;
                VelocityTracker velocityTracker2 = this.f5492OooOOOO;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f5492OooOOOO = null;
                }
                OooOOoo(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5498OooOo0);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5498OooOo0 + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f5487OooOO0 - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (OooO.OooO00o(edgeEffect) != 0.0f) {
                        fOooO0O0 = -OooO.OooO0O0(edgeEffect, -height, x);
                        if (OooO.OooO00o(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (OooO.OooO00o(edgeEffect2) != 0.0f) {
                        fOooO0O0 = OooO.OooO0O0(edgeEffect2, height, 1.0f - x);
                        if (OooO.OooO00o(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f2 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i2 = i4 - iRound;
                        if (!this.f5490OooOOO && Math.abs(i2) > this.f5494OooOOo) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f5490OooOOO = true;
                            if (i2 > 0) {
                                i2 -= this.f5494OooOOo;
                            } else {
                                i2 += this.f5494OooOOo;
                            }
                        }
                        if (this.f5490OooOOO) {
                            int iOooOOO = OooOOO(i2, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f5487OooOO0 = y - iOooOOO;
                            this.f5497OooOo += iOooOOO;
                        }
                    }
                    f2 = fOooO0O0;
                    iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i2 = i4 - iRound;
                    if (!this.f5490OooOOO) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f5490OooOOO = true;
                        if (i2 > 0) {
                            i2 -= this.f5494OooOOo;
                        } else {
                            i2 += this.f5494OooOOo;
                        }
                    }
                    if (this.f5490OooOOO) {
                        int iOooOOO2 = OooOOO(i2, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f5487OooOO0 = y - iOooOOO2;
                        this.f5497OooOo += iOooOOO2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5490OooOOO && getChildCount() > 0 && this.f5485OooO0oO.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOO0O(this);
                }
                this.f5498OooOo0 = -1;
                this.f5490OooOOO = false;
                VelocityTracker velocityTracker3 = this.f5492OooOOOO;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5492OooOOOO = null;
                }
                OooOOoo(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5487OooOO0 = (int) motionEvent.getY(actionIndex);
                this.f5498OooOo0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                OooOO0(motionEvent);
                this.f5487OooOO0 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5498OooOo0));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f5490OooOOO && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5485OooO0oO.isFinished()) {
                this.f5485OooO0oO.abortAnimation();
                OooOOoo(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f5487OooOO0 = y2;
            this.f5498OooOo0 = pointerId;
            OooOOo0(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f5492OooOOOO;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f5488OooOO0O) {
            this.f5491OooOOO0 = view2;
        } else {
            Rect rect = this.f5483OooO0o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iOooO0O0 = OooO0O0(rect);
            if (iOooO0O0 != 0) {
                scrollBy(0, iOooO0O0);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iOooO0O0 = OooO0O0(rect);
        boolean z2 = iOooO0O0 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iOooO0O0);
            } else {
                OooOOOo(0, iOooO0O0, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f5492OooOOOO) != null) {
            velocityTracker.recycle();
            this.f5492OooOOOO = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f5488OooOO0O = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f5493OooOOOo) {
            this.f5493OooOOOo = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f5506OooOoo0.OooO(z);
    }

    public void setOnScrollChangeListener(@Nullable OooO0OO oooO0OO) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f5495OooOOo0 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return OooOOo0(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        OooOOoo(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000O0.OooO00o.nestedScrollViewStyle);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        OooO(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.f5483OooO0o = new Rect();
        this.f5488OooOO0O = true;
        this.f5489OooOO0o = false;
        this.f5491OooOOO0 = null;
        this.f5490OooOOO = false;
        this.f5495OooOOo0 = true;
        this.f5498OooOo0 = -1;
        this.f5500OooOo0O = new int[2];
        this.f5501OooOo0o = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = OooO.OooO0O0.OooO00o(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f5486OooO0oo = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = OooO.OooO0O0.OooO00o(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f5481OooO = edgeEffect2;
        this.f5482OooO0Oo = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5485OooO0oO = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5494OooOOo = viewConfiguration.getScaledTouchSlop();
        this.f5496OooOOoo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5499OooOo00 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5480Oooo000, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f5504OooOoOO = new o000000();
        this.f5506OooOoo0 = new o0OO00O(this);
        setNestedScrollingEnabled(true);
        ViewCompat.OooOOOO(this, f5479OooOooo);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        OooO(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
