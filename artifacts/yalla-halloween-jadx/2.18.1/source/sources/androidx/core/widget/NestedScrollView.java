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
import com.umeng.analytics.pro.o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import net.sqlcipher.database.SQLiteDatabase;
import o000O0O0.Oooo0;
import o000O0O0.Oooo000;
import o000O0O0.o00000O;
import o000O0O0.o000oOoO;
import o000O0O0.o00O0O;
import o000O0O0.o00Ooo;
import o000O0O0.o0OO00O;
import o0O0O00.o0ooOOo;
import p069o0000oo0.o000O0;
import p072o000O0o0.o0000OO0;
import p072o000O0o0.o000O000;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o00O0O, Oooo0, o0OO00O {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final OooO00o f7952o00O0O = new OooO00o();

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final int[] f7953o00Oo0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect f7954Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f7955Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Rect f7956Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OverScroller f7957Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f7958OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f7959OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect f7960OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f7961OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f7962OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public VelocityTracker f7963OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f7964OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f7965OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f7966OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f7967OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f7968Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f7969Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final int[] f7970OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int[] f7971OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f7972OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public SavedState f7973Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f7974Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final o00Ooo f7975OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final o000oOoO f7976Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f7977o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public float f7978o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public OooO0OO f7979ooOO;

    public static class OooO00o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
            super.OooO0OO(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            o000O000.OooO0OO(accessibilityEvent, nestedScrollView.getScrollX());
            o000O000.OooO0Oo(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
            int scrollRange;
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            o0000oo1.Oooo000(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            o0000oo1.OoooOoO(true);
            if (nestedScrollView.getScrollY() > 0) {
                o0000oo1.OooO0O0(o0000OO0.OooO00o.f28203OooOO0O);
                o0000oo1.OooO0O0(o0000OO0.OooO00o.f28207OooOOOO);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                o0000oo1.OooO0O0(o0000OO0.OooO00o.f28202OooOO0);
                o0000oo1.OooO0O0(o0000OO0.OooO00o.f28210OooOOo0);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0oO(View view, int i, Bundle bundle) {
            if (super.OooO0oO(view, i, bundle)) {
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
                    nestedScrollView.OooOoO(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
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
            nestedScrollView.OooOoO(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
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
        void OooO00o(@NonNull NestedScrollView nestedScrollView);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f7980Oooo0o;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HorizontalScrollView.SavedState{");
            sbOooO0o0.append(Integer.toHexString(System.identityHashCode(this)));
            sbOooO0o0.append(" scrollPosition=");
            return o0ooOOo.OooO00o(sbOooO0o0, this.f7980Oooo0o, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7980Oooo0o);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7980Oooo0o = parcel.readInt();
        }
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static int OooO0OO(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public static boolean OooOOo0(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && OooOOo0((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f7978o0OoOo0 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f7978o0OoOo0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f7978o0OoOo0;
    }

    public final boolean OooO(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f7956Oooo0oO;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f7956Oooo0oO.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f7956Oooo0oO;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f7956Oooo0oO;
        return OooOo(i, rect3.top, rect3.bottom);
    }

    public final void OooO00o() {
        this.f7957Oooo0oo.abortAnimation();
        OooOoo(1);
    }

    public final boolean OooO0O0(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !OooOOo(viewFindNextFocus, maxScrollAmount, getHeight())) {
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
            OooO0o(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f7956Oooo0oO);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f7956Oooo0oO);
            OooO0o(OooO0Oo(this.f7956Oooo0oO));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!OooOOo(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int OooO0Oo(Rect rect) {
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

    public final void OooO0o(int i) {
        if (i != 0) {
            if (this.f7965OoooOo0) {
                OooOoO(0, i, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final boolean OooO0o0(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        return this.f7976Ooooooo.OooO0Oo(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public final boolean OooO0oO(@NonNull KeyEvent keyEvent) {
        boolean z;
        this.f7956Oooo0oO.setEmpty();
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
            return !keyEvent.isAltPressed() ? OooO0O0(33) : OooO(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? OooO0O0(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED) : OooO(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);
        }
        if (keyCode != 62) {
            return false;
        }
        int i = keyEvent.isShiftPressed() ? 33 : Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED;
        boolean z2 = i == 130;
        int height = getHeight();
        if (z2) {
            this.f7956Oooo0oO.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt2 = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                Rect rect = this.f7956Oooo0oO;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f7956Oooo0oO.top = getScrollY() - height;
            Rect rect2 = this.f7956Oooo0oO;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f7956Oooo0oO;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        OooOo(i, i2, i3);
        return false;
    }

    public final void OooO0oo(int i) {
        if (getChildCount() > 0) {
            this.f7957Oooo0oo.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            OooOo0o(true);
        }
    }

    @Override // o000O0O0.o00O0O
    public final void OooOO0(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        OooOOoo(i4, i5, iArr);
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOO0O(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        OooOOoo(i4, i5, null);
    }

    @Override // o000O0O0.o0OoOo0
    public final boolean OooOO0o(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO(@NonNull View view, int i) {
        this.f7975OoooooO.OooO0O0(i);
        OooOoo(i);
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO0(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f7975OoooooO.OooO00o(i, i2);
        OooOoOO(2, i2);
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOOO(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        OooO0o0(i, i2, iArr, null, i3);
    }

    public final boolean OooOOOo(int i) {
        return this.f7976Ooooooo.OooO(i);
    }

    public final boolean OooOOo(View view, int i, int i2) {
        view.getDrawingRect(this.f7956Oooo0oO);
        offsetDescendantRectToMyCoords(view, this.f7956Oooo0oO);
        return this.f7956Oooo0oO.bottom + i >= getScrollY() && this.f7956Oooo0oO.top - i <= getScrollY() + i2;
    }

    public final void OooOOoo(int i, int i2, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f7976Ooooooo.OooO0o0(scrollY2, i - scrollY2, i2, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean OooOo(int i, int i2, int i3) {
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
            OooO0o(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public final boolean OooOo0(int i, int i2, int i3, int i4) {
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
            z = true;
            i5 = 0;
        }
        if (i6 <= i7) {
            if (i6 < 0) {
                i6 = 0;
            } else {
                z2 = false;
            }
            if (z2 && !OooOOOo(1)) {
                this.f7957Oooo0oo.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i5, i6, z, z2);
            return z || z2;
        }
        i6 = i7;
        z2 = true;
        if (z2) {
            this.f7957Oooo0oo.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i6, z, z2);
        if (z) {
            return true;
        }
    }

    public final void OooOo00(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7969Ooooo0o) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f7959OoooO0 = (int) motionEvent.getY(i);
            this.f7969Ooooo0o = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f7963OoooOOO;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void OooOo0O() {
        VelocityTracker velocityTracker = this.f7963OoooOOO;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7963OoooOOO = null;
        }
    }

    public final void OooOo0o(boolean z) {
        if (z) {
            OooOoOO(2, 1);
        } else {
            OooOoo(1);
        }
        this.f7974Oooooo0 = getScrollY();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
    }

    public final void OooOoO(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f7955Oooo0o > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f7957Oooo0oo.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            OooOo0o(z);
        } else {
            if (!this.f7957Oooo0oo.isFinished()) {
                OooO00o();
            }
            scrollBy(i, i2);
        }
        this.f7955Oooo0o = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void OooOoO0(View view) {
        view.getDrawingRect(this.f7956Oooo0oO);
        offsetDescendantRectToMyCoords(view, this.f7956Oooo0oO);
        int iOooO0Oo = OooO0Oo(this.f7956Oooo0oO);
        if (iOooO0Oo != 0) {
            scrollBy(0, iOooO0Oo);
        }
    }

    public final boolean OooOoOO(int i, int i2) {
        return this.f7976Ooooooo.OooOO0o(i, i2);
    }

    public final void OooOoo(int i) {
        this.f7976Ooooooo.OooOOO0(i);
    }

    public final boolean OooOoo0(MotionEvent motionEvent) {
        boolean z;
        if (OooOO0.OooO00o(this.f7954Oooo) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            OooOO0.OooO0O0(this.f7954Oooo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (OooOO0.OooO00o(this.f7960OoooO00) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return z;
        }
        OooOO0.OooO0O0(this.f7960OoooO00, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
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

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f7957Oooo0oo.isFinished()) {
            return;
        }
        this.f7957Oooo0oo.computeScrollOffset();
        int currY = this.f7957Oooo0oo.getCurrY();
        int i = currY - this.f7974Oooooo0;
        this.f7974Oooooo0 = currY;
        int[] iArr = this.f7971OooooOO;
        boolean z = false;
        iArr[1] = 0;
        OooO0o0(0, i, iArr, null, 1);
        int i2 = i - this.f7971OooooOO[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            OooOo0(i2, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f7971OooooOO;
            iArr2[1] = 0;
            this.f7976Ooooooo.OooO0oO(0, scrollY2, 0, i3, this.f7970OooooO0, 1, iArr2);
            i2 = i3 - this.f7971OooooOO[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i2 < 0) {
                    if (this.f7954Oooo.isFinished()) {
                        this.f7954Oooo.onAbsorb((int) this.f7957Oooo0oo.getCurrVelocity());
                    }
                } else if (this.f7960OoooO00.isFinished()) {
                    this.f7960OoooO00.onAbsorb((int) this.f7957Oooo0oo.getCurrVelocity());
                }
            }
            OooO00o();
        }
        if (this.f7957Oooo0oo.isFinished()) {
            OooOoo(1);
        } else {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
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
        return super.dispatchKeyEvent(keyEvent) || OooO0oO(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f7976Ooooooo.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f7976Ooooooo.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return OooO0o0(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return this.f7976Ooooooo.OooO0o(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f7954Oooo.isFinished()) {
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
            this.f7954Oooo.setSize(width, height);
            if (this.f7954Oooo.draw(canvas)) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f7960OoooO00.isFinished()) {
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
        canvas.rotate(180.0f, width2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f7960OoooO00.setSize(width2, height2);
        if (this.f7960OoooO00.draw(canvas)) {
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
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
        o00Ooo o00ooo2 = this.f7975OoooooO;
        return o00ooo2.f28129OooO0O0 | o00ooo2.f28128OooO00o;
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
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
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
        return OooOOOo(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7976Ooooooo.f28126OooO0Oo;
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
        this.f7958OoooO = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        float axisValue;
        boolean z;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.f7977o000oOoO) {
            if (Oooo000.OooO00o(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = Oooo000.OooO00o(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (axisValue != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !Oooo000.OooO00o(motionEvent, o.a.q)) {
                        OooOO0.OooO0O0(this.f7954Oooo, (-i2) / getHeight(), 0.5f);
                        this.f7954Oooo.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        z = 0;
                    }
                } else if (i2 > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if ((overScrollMode2 == 0 || (overScrollMode2 == 1 && getScrollRange() > 0)) && !Oooo000.OooO00o(motionEvent, o.a.q)) {
                        OooOO0.OooO0O0(this.f7960OoooO00, (i2 - scrollRange) / getHeight(), 0.5f);
                        this.f7960OoooO00.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = scrollRange;
                } else {
                    i = i2;
                    z = 0;
                }
                if (i == scrollY) {
                    return z;
                }
                super.scrollTo(getScrollX(), i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f7977o000oOoO) {
            return true;
        }
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
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
                this.f7959OoooO0 = y;
                this.f7969Ooooo0o = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.f7963OoooOOO;
                if (velocityTracker == null) {
                    this.f7963OoooOOO = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f7963OoooOOO.addMovement(motionEvent);
                this.f7957Oooo0oo.computeScrollOffset();
                if (!OooOoo0(motionEvent) && this.f7957Oooo0oo.isFinished()) {
                    z2 = false;
                }
                this.f7977o000oOoO = z2;
                OooOoOO(2, 0);
            } else {
                if (!OooOoo0(motionEvent) && this.f7957Oooo0oo.isFinished()) {
                    z2 = false;
                }
                this.f7977o000oOoO = z2;
                OooOo0O();
            }
        } else if (i == 1) {
            this.f7977o000oOoO = false;
            this.f7969Ooooo0o = -1;
            OooOo0O();
            if (this.f7957Oooo0oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
            OooOoo(0);
        } else if (i == 2) {
            int i2 = this.f7969Ooooo0o;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f7959OoooO0) > this.f7966OoooOoO && (2 & getNestedScrollAxes()) == 0) {
                        this.f7977o000oOoO = true;
                        this.f7959OoooO0 = y2;
                        if (this.f7963OoooOOO == null) {
                            this.f7963OoooOOO = VelocityTracker.obtain();
                        }
                        this.f7963OoooOOO.addMovement(motionEvent);
                        this.f7972OooooOo = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f7977o000oOoO = false;
            this.f7969Ooooo0o = -1;
            OooOo0O();
            if (this.f7957Oooo0oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(this);
            }
            OooOoo(0);
        } else if (i == 6) {
            OooOo00(motionEvent);
        }
        return this.f7977o000oOoO;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f7961OoooO0O = false;
        View view = this.f7962OoooOO0;
        if (view != null && OooOOo0(view, this)) {
            OooOoO0(this.f7962OoooOO0);
        }
        this.f7962OoooOO0 = null;
        if (!this.f7958OoooO) {
            if (this.f7973Oooooo != null) {
                scrollTo(getScrollX(), this.f7973Oooooo.f7980Oooo0o);
                this.f7973Oooooo = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iOooO0OO = OooO0OO(scrollY, paddingTop, measuredHeight);
            if (iOooO0OO != scrollY) {
                scrollTo(getScrollX(), iOooO0OO);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f7958OoooO = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7964OoooOOo && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, true);
        OooO0oo((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        OooO0o0(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        OooOOoo(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.f7975OoooooO.OooO00o(i, 0);
        OooOoOO(2, 0);
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
        if (viewFindNextFocus == null || (true ^ OooOOo(viewFindNextFocus, 0, getHeight()))) {
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
        this.f7973Oooooo = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7980Oooo0o = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OooO0OO oooO0OO = this.f7979ooOO;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !OooOOo(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f7956Oooo0oO);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f7956Oooo0oO);
        OooO0o(OooO0Oo(this.f7956Oooo0oO));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        this.f7975OoooooO.OooO0O0(0);
        OooOoo(0);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x027e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0286  */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0236  */
    /* JADX WARN: Code duplicated, block: B:94:0x0239  */
    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        int i;
        float f;
        float fOooO0O0;
        int iRound;
        int i2;
        int i3;
        int scrollY;
        int scrollRange;
        int overScrollMode;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        ViewParent parent2;
        if (this.f7963OoooOOO == null) {
            this.f7963OoooOOO = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f7972OooooOo = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = this.f7972OooooOo;
        float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        motionEventObtain.offsetLocation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f7963OoooOOO;
                velocityTracker.computeCurrentVelocity(1000, this.f7968Ooooo00);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f7969Ooooo0o);
                if (Math.abs(yVelocity) >= this.f7967OoooOoo) {
                    if (OooOO0.OooO00o(this.f7954Oooo) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        this.f7954Oooo.onAbsorb(yVelocity);
                    } else {
                        if (OooOO0.OooO00o(this.f7960OoooO00) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            this.f7960OoooO00.onAbsorb(-yVelocity);
                        } else {
                            z = false;
                        }
                        if (!z) {
                            i = -yVelocity;
                            f = i;
                            if (!dispatchNestedPreFling(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f)) {
                                dispatchNestedFling(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, true);
                                OooO0oo(i);
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                        i = -yVelocity;
                        f = i;
                        if (!dispatchNestedPreFling(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f)) {
                            dispatchNestedFling(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, true);
                            OooO0oo(i);
                        }
                    }
                } else if (this.f7957Oooo0oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOO0O(this);
                }
                this.f7969Ooooo0o = -1;
                this.f7977o000oOoO = false;
                OooOo0O();
                OooOoo(0);
                this.f7954Oooo.onRelease();
                this.f7960OoooO00.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7969Ooooo0o);
                if (iFindPointerIndex == -1) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invalid pointerId=");
                    sbOooO0o0.append(this.f7969Ooooo0o);
                    sbOooO0o0.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sbOooO0o0.toString());
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.f7959OoooO0 - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (OooOO0.OooO00o(this.f7954Oooo) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        fOooO0O0 = -OooOO0.OooO0O0(this.f7954Oooo, -height, x);
                        if (OooOO0.OooO00o(this.f7954Oooo) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            this.f7954Oooo.onRelease();
                        }
                    } else if (OooOO0.OooO00o(this.f7960OoooO00) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        fOooO0O0 = OooOO0.OooO0O0(this.f7960OoooO00, height, 1.0f - x);
                        if (OooOO0.OooO00o(this.f7960OoooO00) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            this.f7960OoooO00.onRelease();
                        }
                    } else {
                        iRound = Math.round(f3 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i2 = i6 - iRound;
                        if (!this.f7977o000oOoO && Math.abs(i2) > this.f7966OoooOoO) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f7977o000oOoO = true;
                            if (i2 > 0) {
                                i2 -= this.f7966OoooOoO;
                            } else {
                                i2 += this.f7966OoooOoO;
                            }
                        }
                        i3 = i2;
                        if (this.f7977o000oOoO) {
                            if (OooO0o0(0, i3, this.f7971OooooOO, this.f7970OooooO0, 0)) {
                                i3 -= this.f7971OooooOO[1];
                                this.f7972OooooOo += this.f7970OooooO0[1];
                            }
                            this.f7959OoooO0 = y - this.f7970OooooO0[1];
                            scrollY = getScrollY();
                            scrollRange = getScrollRange();
                            overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (OooOo0(i3, 0, getScrollY(), scrollRange) || OooOOOo(0)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.f7971OooooOO;
                            iArr[1] = 0;
                            this.f7976Ooooooo.OooO0oO(0, scrollY2, 0, i3 - scrollY2, this.f7970OooooO0, 0, iArr);
                            int i7 = this.f7959OoooO0;
                            int[] iArr2 = this.f7970OooooO0;
                            this.f7959OoooO0 = i7 - iArr2[1];
                            this.f7972OooooOo += iArr2[1];
                            if (z2) {
                                i4 = i3 - this.f7971OooooOO[1];
                                i5 = scrollY + i4;
                                if (i5 < 0) {
                                    OooOO0.OooO0O0(this.f7954Oooo, (-i4) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                    if (!this.f7960OoooO00.isFinished()) {
                                        this.f7960OoooO00.onRelease();
                                    }
                                } else if (i5 > scrollRange) {
                                    OooOO0.OooO0O0(this.f7960OoooO00, i4 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                    if (!this.f7954Oooo.isFinished()) {
                                        this.f7954Oooo.onRelease();
                                    }
                                }
                                if (this.f7954Oooo.isFinished() || !this.f7960OoooO00.isFinished()) {
                                    WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                                    ViewCompat.OooO0o.OooOO0O(this);
                                } else {
                                    z4 = z3;
                                }
                            } else {
                                z4 = z3;
                            }
                            if (z4) {
                                this.f7963OoooOOO.clear();
                            }
                        }
                    }
                    f3 = fOooO0O0;
                    iRound = Math.round(f3 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i2 = i6 - iRound;
                    if (!this.f7977o000oOoO) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f7977o000oOoO = true;
                        if (i2 > 0) {
                            i2 -= this.f7966OoooOoO;
                        } else {
                            i2 += this.f7966OoooOoO;
                        }
                    }
                    i3 = i2;
                    if (this.f7977o000oOoO) {
                        if (OooO0o0(0, i3, this.f7971OooooOO, this.f7970OooooO0, 0)) {
                            i3 -= this.f7971OooooOO[1];
                            this.f7972OooooOo += this.f7970OooooO0[1];
                        }
                        this.f7959OoooO0 = y - this.f7970OooooO0[1];
                        scrollY = getScrollY();
                        scrollRange = getScrollRange();
                        overScrollMode = getOverScrollMode();
                        if (overScrollMode != 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (OooOo0(i3, 0, getScrollY(), scrollRange)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        int scrollY3 = getScrollY() - scrollY;
                        int[] iArr3 = this.f7971OooooOO;
                        iArr3[1] = 0;
                        this.f7976Ooooooo.OooO0oO(0, scrollY3, 0, i3 - scrollY3, this.f7970OooooO0, 0, iArr3);
                        int i8 = this.f7959OoooO0;
                        int[] iArr4 = this.f7970OooooO0;
                        this.f7959OoooO0 = i8 - iArr4[1];
                        this.f7972OooooOo += iArr4[1];
                        if (z2) {
                            z4 = z3;
                        } else {
                            i4 = i3 - this.f7971OooooOO[1];
                            i5 = scrollY + i4;
                            if (i5 < 0) {
                                OooOO0.OooO0O0(this.f7954Oooo, (-i4) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f7960OoooO00.isFinished()) {
                                    this.f7960OoooO00.onRelease();
                                }
                            } else if (i5 > scrollRange) {
                                OooOO0.OooO0O0(this.f7960OoooO00, i4 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f7954Oooo.isFinished()) {
                                    this.f7954Oooo.onRelease();
                                }
                            }
                            if (this.f7954Oooo.isFinished()) {
                            }
                            WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                            ViewCompat.OooO0o.OooOO0O(this);
                        }
                        if (z4) {
                            this.f7963OoooOOO.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f7977o000oOoO && getChildCount() > 0 && this.f7957Oooo0oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap<View, o00000O> weakHashMap4 = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOO0O(this);
                }
                this.f7969Ooooo0o = -1;
                this.f7977o000oOoO = false;
                OooOo0O();
                OooOoo(0);
                this.f7954Oooo.onRelease();
                this.f7960OoooO00.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f7959OoooO0 = (int) motionEvent.getY(actionIndex);
                this.f7969Ooooo0o = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                OooOo00(motionEvent);
                this.f7959OoooO0 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f7969Ooooo0o));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f7977o000oOoO && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f7957Oooo0oo.isFinished()) {
                OooO00o();
            }
            this.f7959OoooO0 = (int) motionEvent.getY();
            this.f7969Ooooo0o = motionEvent.getPointerId(0);
            OooOoOO(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f7963OoooOOO;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f7961OoooO0O) {
            this.f7962OoooOO0 = view2;
        } else {
            OooOoO0(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iOooO0Oo = OooO0Oo(rect);
        boolean z2 = iOooO0Oo != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iOooO0Oo);
            } else {
                OooOoO(0, iOooO0Oo, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            OooOo0O();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f7961OoooO0O = true;
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
            int iOooO0OO = OooO0OO(i, width, width2);
            int iOooO0OO2 = OooO0OO(i2, height, height2);
            if (iOooO0OO == getScrollX() && iOooO0OO2 == getScrollY()) {
                return;
            }
            super.scrollTo(iOooO0OO, iOooO0OO2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f7964OoooOOo) {
            this.f7964OoooOOo = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f7976Ooooooo.OooOO0(z);
    }

    public void setOnScrollChangeListener(@Nullable OooO0OO oooO0OO) {
        this.f7979ooOO = oooO0OO;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f7965OoooOo0 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return OooOoOO(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        OooOoo(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o000O0.nestedScrollViewStyle);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.f7956Oooo0oO = new Rect();
        this.f7961OoooO0O = true;
        this.f7958OoooO = false;
        this.f7962OoooOO0 = null;
        this.f7977o000oOoO = false;
        this.f7965OoooOo0 = true;
        this.f7969Ooooo0o = -1;
        this.f7970OooooO0 = new int[2];
        this.f7971OooooOO = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = OooOO0.OooO0O0.OooO00o(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f7954Oooo = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = OooOO0.OooO0O0.OooO00o(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f7960OoooO00 = edgeEffect2;
        this.f7957Oooo0oo = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7966OoooOoO = viewConfiguration.getScaledTouchSlop();
        this.f7967OoooOoo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7968Ooooo00 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7953o00Oo0, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f7975OoooooO = new o00Ooo();
        this.f7976Ooooooo = new o000oOoO(this);
        setNestedScrollingEnabled(true);
        ViewCompat.OooOo0o(this, f7952o00O0O);
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
