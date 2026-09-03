package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements o0OOO0o, androidx.core.view.o000OOo, androidx.core.view.oo0o0Oo, androidx.core.view.o0O0O00 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f2715OooOooo = {p012OooOo0O.OooOOO0.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Drawable f2716OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f2717OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ContentFrameLayout f2718OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f2719OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ActionBarContainer f2720OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0Oo0oo f2721OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f2722OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f2723OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f2724OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f2725OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f2726OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f2727OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f2728OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Rect f2729OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Rect f2730OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Rect f2731OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o f2732OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f2733OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f2734OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f2735OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f2736OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ViewPropertyAnimator f2737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OverScroller f2738OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f2739OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO0OO f2740OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO0O0 f2741OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final androidx.core.view.o000000 f2742OooOooO;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-1, -1);
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2737OooOoO = null;
            actionBarOverlayLayout.f2725OooOOO = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2737OooOoO = null;
            actionBarOverlayLayout.f2725OooOOO = false;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.OooOO0O();
            actionBarOverlayLayout.f2737OooOoO = actionBarOverlayLayout.f2720OooO0oO.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2739OooOoOO);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.OooOO0O();
            actionBarOverlayLayout.f2737OooOoO = actionBarOverlayLayout.f2720OooO0oO.animate().translationY(-actionBarOverlayLayout.f2720OooO0oO.getHeight()).setListener(actionBarOverlayLayout.f2739OooOoOO);
        }
    }

    public interface OooO0o {
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    public static boolean OooOO0(@NonNull FrameLayout frameLayout, @NonNull Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final void OooO() {
        OooOOO0();
        this.f2721OooO0oo.OooOOO();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final boolean OooO00o() {
        OooOOO0();
        return this.f2721OooO0oo.OooO00o();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final void OooO0O0(androidx.appcompat.view.menu.OooO oooO, AppCompatDelegateImpl.OooO0OO oooO0OO) {
        OooOOO0();
        this.f2721OooO0oo.OooO0O0(oooO, oooO0OO);
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final boolean OooO0OO() {
        OooOOO0();
        return this.f2721OooO0oo.OooO0OO();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final boolean OooO0Oo() {
        OooOOO0();
        return this.f2721OooO0oo.OooO0Oo();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final void OooO0o() {
        OooOOO0();
        this.f2721OooO0oo.OooO0o();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final boolean OooO0o0() {
        OooOOO0();
        return this.f2721OooO0oo.OooO0o0();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final boolean OooO0oO() {
        OooOOO0();
        return this.f2721OooO0oo.OooO0oO();
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public final void OooO0oo(int i) {
        OooOOO0();
        if (i == 2) {
            this.f2721OooO0oo.OooOO0o();
        } else if (i == 5) {
            this.f2721OooO0oo.OooOOoo();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void OooOO0O() {
        removeCallbacks(this.f2741OooOoo0);
        removeCallbacks(this.f2740OooOoo);
        ViewPropertyAnimator viewPropertyAnimator = this.f2737OooOoO;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void OooOO0o(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2715OooOooo);
        this.f2717OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2716OooO = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2722OooOO0 = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2738OooOoO0 = new OverScroller(context);
    }

    public final void OooOOO0() {
        o0Oo0oo wrapper;
        if (this.f2718OooO0o == null) {
            this.f2718OooO0o = (ContentFrameLayout) findViewById(p012OooOo0O.Oooo000.action_bar_activity_content);
            this.f2720OooO0oO = (ActionBarContainer) findViewById(p012OooOo0O.Oooo000.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(p012OooOo0O.Oooo000.action_bar);
            if (callbackFindViewById instanceof o0Oo0oo) {
                wrapper = (o0Oo0oo) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f2721OooO0oo = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f2716OooO == null || this.f2722OooOO0) {
            return;
        }
        if (this.f2720OooO0oO.getVisibility() == 0) {
            translationY = (int) (this.f2720OooO0oO.getTranslationY() + this.f2720OooO0oO.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f2716OooO.setBounds(0, translationY, getWidth(), this.f2716OooO.getIntrinsicHeight() + translationY);
        this.f2716OooO.draw(canvas);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2720OooO0oO;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        androidx.core.view.o000000 o000000Var = this.f2742OooOooO;
        return o000000Var.f5428OooO0O0 | o000000Var.f5427OooO00o;
    }

    public CharSequence getTitle() {
        OooOOO0();
        return this.f2721OooO0oo.getTitle();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        OooOOO0();
        WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(this, windowInsets);
        boolean zOooOO0 = OooOO0(this.f2720OooO0oO, new Rect(windowInsetsCompatOooOO0.OooO0Oo(), windowInsetsCompatOooOO0.OooO0o(), windowInsetsCompatOooOO0.OooO0o0(), windowInsetsCompatOooOO0.OooO0OO()), false);
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        Rect rect = this.f2730OooOOo0;
        ViewCompat.OooOOO.OooO0O0(this, windowInsetsCompatOooOO0, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        WindowInsetsCompat.OooOo00 oooOo00 = windowInsetsCompatOooOO0.f5389OooO00o;
        WindowInsetsCompat windowInsetsCompatOooOOO = oooOo00.OooOOO(i, i2, i3, i4);
        this.f2734OooOo00 = windowInsetsCompatOooOOO;
        boolean z = true;
        if (!this.f2733OooOo0.equals(windowInsetsCompatOooOOO)) {
            this.f2733OooOo0 = this.f2734OooOo00;
            zOooOO0 = true;
        }
        Rect rect2 = this.f2729OooOOo;
        if (rect2.equals(rect)) {
            z = zOooOO0;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return oooOo00.OooO00o().f5389OooO00o.OooO0OO().f5389OooO00o.OooO0O0().OooO();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOO0o(getContext());
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO0.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOO0O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        WindowInsetsCompat.OooO oooO0OO;
        OooOOO0();
        measureChildWithMargins(this.f2720OooO0oO, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f2720OooO0oO.getLayoutParams();
        int iMax = Math.max(0, this.f2720OooO0oO.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f2720OooO0oO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2720OooO0oO.getMeasuredState());
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = (ViewCompat.OooO0o.OooO0oO(this) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z) {
            measuredHeight = this.f2717OooO0Oo;
            if (this.f2724OooOO0o && this.f2720OooO0oO.getTabContainer() != null) {
                measuredHeight += this.f2717OooO0Oo;
            }
        } else {
            measuredHeight = this.f2720OooO0oO.getVisibility() != 8 ? this.f2720OooO0oO.getMeasuredHeight() : 0;
        }
        Rect rect = this.f2730OooOOo0;
        Rect rect2 = this.f2731OooOOoo;
        rect2.set(rect);
        WindowInsetsCompat windowInsetsCompat = this.f2734OooOo00;
        this.f2735OooOo0O = windowInsetsCompat;
        if (this.f2723OooOO0O || z) {
            p052o00000oO.OooOO0O oooOO0OOooO0O0 = p052o00000oO.OooOO0O.OooO0O0(windowInsetsCompat.OooO0Oo(), this.f2735OooOo0O.OooO0o() + measuredHeight, this.f2735OooOo0O.OooO0o0(), this.f2735OooOo0O.OooO0OO() + 0);
            WindowInsetsCompat windowInsetsCompat2 = this.f2735OooOo0O;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                oooO0OO = new WindowInsetsCompat.OooO0o(windowInsetsCompat2);
            } else {
                oooO0OO = i3 >= 29 ? new WindowInsetsCompat.OooO0OO(windowInsetsCompat2) : new WindowInsetsCompat.OooO0O0(windowInsetsCompat2);
            }
            oooO0OO.OooO0oO(oooOO0OOooO0O0);
            this.f2735OooOo0O = oooO0OO.OooO0O0();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.f2735OooOo0O = windowInsetsCompat.f5389OooO00o.OooOOO(0, measuredHeight, 0, 0);
        }
        OooOO0(this.f2718OooO0o, rect2, true);
        if (!this.f2736OooOo0o.equals(this.f2735OooOo0O)) {
            WindowInsetsCompat windowInsetsCompat3 = this.f2735OooOo0O;
            this.f2736OooOo0o = windowInsetsCompat3;
            ViewCompat.OooO0O0(this.f2718OooO0o, windowInsetsCompat3);
        }
        measureChildWithMargins(this.f2718OooO0o, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f2718OooO0o.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2718OooO0o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f2718OooO0o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2718OooO0o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2726OooOOO0 || !z) {
            return false;
        }
        this.f2738OooOoO0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2738OooOoO0.getFinalY() > this.f2720OooO0oO.getHeight()) {
            OooOO0O();
            this.f2740OooOoo.run();
        } else {
            OooOO0O();
            this.f2741OooOoo0.run();
        }
        this.f2725OooOOO = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.o0O0O00
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        androidx.appcompat.app.o0000Ooo o0000ooo;
        p016OooOoOO.o0ooOOo o0ooooo;
        this.f2742OooOooO.OooO00o(i, 0);
        this.f2727OooOOOO = getActionBarHideOffset();
        OooOO0O();
        OooO0o oooO0o = this.f2732OooOo;
        if (oooO0o == null || (o0ooooo = (o0000ooo = (androidx.appcompat.app.o0000Ooo) oooO0o).f2464OooOo00) == null) {
            return;
        }
        o0ooooo.OooO00o();
        o0000ooo.f2464OooOo00 = null;
    }

    @Override // androidx.core.view.oo0o0Oo
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        OooOOO0();
        int i2 = this.f2728OooOOOo ^ i;
        this.f2728OooOOOo = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        OooO0o oooO0o = this.f2732OooOo;
        if (oooO0o != null) {
            ((androidx.appcompat.app.o0000Ooo) oooO0o).f2458OooOOOo = !z2;
            if (z || !z2) {
                androidx.appcompat.app.o0000Ooo o0000ooo = (androidx.appcompat.app.o0000Ooo) oooO0o;
                if (o0000ooo.f2460OooOOo0) {
                    o0000ooo.f2460OooOOo0 = false;
                    o0000ooo.OooOo00(true);
                }
            } else {
                androidx.appcompat.app.o0000Ooo o0000ooo2 = (androidx.appcompat.app.o0000Ooo) oooO0o;
                if (!o0000ooo2.f2460OooOOo0) {
                    o0000ooo2.f2460OooOOo0 = true;
                    o0000ooo2.OooOo00(true);
                }
            }
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f2732OooOo == null) {
            return;
        }
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO0.OooO0OO(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2719OooO0o0 = i;
        OooO0o oooO0o = this.f2732OooOo;
        if (oooO0o != null) {
            ((androidx.appcompat.app.o0000Ooo) oooO0o).f2457OooOOOO = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        OooOO0O();
        this.f2720OooO0oO.setTranslationY(-Math.max(0, Math.min(i, this.f2720OooO0oO.getHeight())));
    }

    public void setActionBarVisibilityCallback(OooO0o oooO0o) {
        this.f2732OooOo = oooO0o;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.o0000Ooo) this.f2732OooOo).f2457OooOOOO = this.f2719OooO0o0;
            int i = this.f2728OooOOOo;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOOO0.OooO0OO(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2724OooOO0o = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2726OooOOO0) {
            this.f2726OooOOO0 = z;
            if (z) {
                return;
            }
            OooOO0O();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        OooOOO0();
        this.f2721OooO0oo.setIcon(i);
    }

    public void setLogo(int i) {
        OooOOO0();
        this.f2721OooO0oo.OooOOo0(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2723OooOO0O = z;
        this.f2722OooOO0 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public void setWindowCallback(Window.Callback callback) {
        OooOOO0();
        this.f2721OooO0oo.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.o0OOO0o
    public void setWindowTitle(CharSequence charSequence) {
        OooOOO0();
        this.f2721OooO0oo.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2719OooO0o0 = 0;
        this.f2730OooOOo0 = new Rect();
        this.f2729OooOOo = new Rect();
        this.f2731OooOOoo = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f5388OooO0O0;
        this.f2734OooOo00 = windowInsetsCompat;
        this.f2733OooOo0 = windowInsetsCompat;
        this.f2735OooOo0O = windowInsetsCompat;
        this.f2736OooOo0o = windowInsetsCompat;
        this.f2739OooOoOO = new OooO00o();
        this.f2741OooOoo0 = new OooO0O0();
        this.f2740OooOoo = new OooO0OO();
        OooOO0o(context);
        this.f2742OooOooO = new androidx.core.view.o000000();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2720OooO0oO.getVisibility() != 0) {
            return false;
        }
        return this.f2726OooOOO0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2726OooOOO0 || this.f2725OooOOO) {
            return;
        }
        if (this.f2727OooOOOO <= this.f2720OooO0oO.getHeight()) {
            OooOO0O();
            postDelayed(this.f2741OooOoo0, 600L);
        } else {
            OooOO0O();
            postDelayed(this.f2740OooOoo, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f2727OooOOOO + i2;
        this.f2727OooOOOO = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        OooOOO0();
        this.f2721OooO0oo.setIcon(drawable);
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }
}
