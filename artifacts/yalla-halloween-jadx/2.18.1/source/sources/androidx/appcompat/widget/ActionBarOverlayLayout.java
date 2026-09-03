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
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements oo000o, o000O0O0.o00Oo0, o000O0O0.o0OoOo0, o000O0O0.o00O0O {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final int[] f4820o00Oo0 = {OooOo00.OooO00o.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ActionBarContainer f4821Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f4822Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f4823Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ContentFrameLayout f4824Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f4825OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Drawable f4826OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o00oO0o f4827OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f4828OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f4829OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f4830OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f4831OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f4832OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final Rect f4833OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final Rect f4834OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final Rect f4835Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f4836Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f4837OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f4838OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NonNull
    public WindowInsetsCompat f4839OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public OverScroller f4840Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public OooO0o f4841Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public ViewPropertyAnimator f4842OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final OooO00o f4843Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f4844o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final o000O0O0.o00Ooo f4845o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final OooO0O0 f4846o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final OooO0OO f4847ooOO;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class OooO00o extends AnimatorListenerAdapter {
        public OooO00o() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4842OoooooO = null;
            actionBarOverlayLayout.f4830OoooOOO = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4842OoooooO = null;
            actionBarOverlayLayout.f4830OoooOOO = false;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.OooOOo0();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4842OoooooO = actionBarOverlayLayout.f4821Oooo.animate().translationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setListener(ActionBarOverlayLayout.this.f4843Ooooooo);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.OooOOo0();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4842OoooooO = actionBarOverlayLayout.f4821Oooo.animate().translationY(-ActionBarOverlayLayout.this.f4821Oooo.getHeight()).setListener(ActionBarOverlayLayout.this.f4843Ooooooo);
        }
    }

    public interface OooO0o {
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.oo000o
    public final void OooO() {
        OooOOoo();
        this.f4827OoooO00.OooO0oo();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final void OooO00o(Menu menu, androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o) {
        OooOOoo();
        this.f4827OoooO00.OooO00o(menu, oooO00o);
    }

    @Override // androidx.appcompat.widget.oo000o
    public final boolean OooO0O0() {
        OooOOoo();
        return this.f4827OoooO00.OooO0O0();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final void OooO0OO() {
        OooOOoo();
        this.f4827OoooO00.OooO0OO();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final boolean OooO0Oo() {
        OooOOoo();
        return this.f4827OoooO00.OooO0Oo();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final boolean OooO0o() {
        OooOOoo();
        return this.f4827OoooO00.OooO0o();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final boolean OooO0o0() {
        OooOOoo();
        return this.f4827OoooO00.OooO0o0();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final boolean OooO0oO() {
        OooOOoo();
        return this.f4827OoooO00.OooO0oO();
    }

    @Override // androidx.appcompat.widget.oo000o
    public final void OooO0oo(int i) {
        OooOOoo();
        if (i == 2) {
            this.f4827OoooO00.OooOOo0();
        } else if (i == 5) {
            this.f4827OoooO00.OooOOo();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // o000O0O0.o00O0O
    public final void OooOO0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOO0O(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final boolean OooOO0o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO0(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOOO(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final boolean OooOOOo(@NonNull View view, @NonNull Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
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

    public final void OooOOo(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4820o00Oo0);
        this.f4822Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4826OoooO0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4828OoooO0O = context.getApplicationInfo().targetSdkVersion < 19;
        this.f4840Oooooo = new OverScroller(context);
    }

    public final void OooOOo0() {
        removeCallbacks(this.f4846o0OoOo0);
        removeCallbacks(this.f4847ooOO);
        ViewPropertyAnimator viewPropertyAnimator = this.f4842OoooooO;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void OooOOoo() {
        o00oO0o wrapper;
        if (this.f4824Oooo0oo == null) {
            this.f4824Oooo0oo = (ContentFrameLayout) findViewById(OooOo00.OooOO0.action_bar_activity_content);
            this.f4821Oooo = (ActionBarContainer) findViewById(OooOo00.OooOO0.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(OooOo00.OooOO0.action_bar);
            if (callbackFindViewById instanceof o00oO0o) {
                wrapper = (o00oO0o) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Can't make a decor toolbar out of ");
                    sbOooO0o0.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbOooO0o0.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f4827OoooO00 = wrapper;
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
        if (this.f4826OoooO0 == null || this.f4828OoooO0O) {
            return;
        }
        if (this.f4821Oooo.getVisibility() == 0) {
            translationY = (int) (this.f4821Oooo.getTranslationY() + this.f4821Oooo.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f4826OoooO0.setBounds(0, translationY, getWidth(), this.f4826OoooO0.getIntrinsicHeight() + translationY);
        this.f4826OoooO0.draw(canvas);
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
        ActionBarContainer actionBarContainer = this.f4821Oooo;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o000O0O0.o00Ooo o00ooo2 = this.f4845o00O0O;
        return o00ooo2.f28129OooO0O0 | o00ooo2.f28128OooO00o;
    }

    public CharSequence getTitle() {
        OooOOoo();
        return this.f4827OoooO00.getTitle();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        OooOOoo();
        WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(windowInsets, this);
        boolean zOooOOOo = OooOOOo(this.f4821Oooo, new Rect(windowInsetsCompatOooOOOO.OooO0oO(), windowInsetsCompatOooOOOO.OooO(), windowInsetsCompatOooOOOO.OooO0oo(), windowInsetsCompatOooOOOO.OooO0o()), false);
        Rect rect = this.f4833OoooOoO;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooO0O0(this, windowInsetsCompatOooOOOO, rect);
        Rect rect2 = this.f4833OoooOoO;
        WindowInsetsCompat windowInsetsCompatOooOOO0 = windowInsetsCompatOooOOOO.f7918OooO00o.OooOOO0(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f4836Ooooo0o = windowInsetsCompatOooOOO0;
        boolean z = true;
        if (!this.f4837OooooO0.equals(windowInsetsCompatOooOOO0)) {
            this.f4837OooooO0 = this.f4836Ooooo0o;
            zOooOOOo = true;
        }
        if (this.f4834OoooOoo.equals(this.f4833OoooOoO)) {
            z = zOooOOOo;
        } else {
            this.f4834OoooOoo.set(this.f4833OoooOoO);
        }
        if (z) {
            requestLayout();
        }
        return windowInsetsCompatOooOOOO.f7918OooO00o.OooO00o().OooO00o().f7918OooO00o.OooO0O0().OooOOO();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOOo(getContext());
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO0.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOOo0();
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
        OooOOoo();
        measureChildWithMargins(this.f4821Oooo, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f4821Oooo.getLayoutParams();
        int iMax = Math.max(0, this.f4821Oooo.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f4821Oooo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4821Oooo.getMeasuredState());
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z = (ViewCompat.OooO0o.OooO0oO(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f4822Oooo0o;
            if (this.f4829OoooOO0 && this.f4821Oooo.getTabContainer() != null) {
                measuredHeight += this.f4822Oooo0o;
            }
        } else {
            measuredHeight = this.f4821Oooo.getVisibility() != 8 ? this.f4821Oooo.getMeasuredHeight() : 0;
        }
        this.f4835Ooooo00.set(this.f4833OoooOoO);
        WindowInsetsCompat windowInsetsCompat = this.f4836Ooooo0o;
        this.f4838OooooOO = windowInsetsCompat;
        if (this.f4825OoooO || z) {
            p071o000O0o.OooO oooOOooO0O0 = p071o000O0o.OooO.OooO0O0(windowInsetsCompat.OooO0oO(), this.f4838OooooOO.OooO() + measuredHeight, this.f4838OooooOO.OooO0oo(), this.f4838OooooOO.OooO0o() + 0);
            WindowInsetsCompat windowInsetsCompat2 = this.f4838OooooOO;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                oooO0OO = new WindowInsetsCompat.OooO0o(windowInsetsCompat2);
            } else {
                oooO0OO = i3 >= 29 ? new WindowInsetsCompat.OooO0OO(windowInsetsCompat2) : new WindowInsetsCompat.OooO0O0(windowInsetsCompat2);
            }
            oooO0OO.OooO0oO(oooOOooO0O0);
            this.f4838OooooOO = oooO0OO.OooO0O0();
        } else {
            Rect rect = this.f4835Ooooo00;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f4838OooooOO = windowInsetsCompat.f7918OooO00o.OooOOO0(0, measuredHeight, 0, 0);
        }
        OooOOOo(this.f4824Oooo0oo, this.f4835Ooooo00, true);
        if (!this.f4839OooooOo.equals(this.f4838OooooOO)) {
            WindowInsetsCompat windowInsetsCompat3 = this.f4838OooooOO;
            this.f4839OooooOo = windowInsetsCompat3;
            ViewCompat.OooO0o0(this.f4824Oooo0oo, windowInsetsCompat3);
        }
        measureChildWithMargins(this.f4824Oooo0oo, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f4824Oooo0oo.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f4824Oooo0oo.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f4824Oooo0oo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4824Oooo0oo.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f4844o000oOoO || !z) {
            return false;
        }
        this.f4840Oooooo.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4840Oooooo.getFinalY() > this.f4821Oooo.getHeight()) {
            OooOOo0();
            this.f4847ooOO.run();
        } else {
            OooOOo0();
            this.f4846o0OoOo0.run();
        }
        this.f4830OoooOOO = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f4831OoooOOo + i2;
        this.f4831OoooOOo = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        androidx.appcompat.app.oo000o oo000oVar;
        p016OooOoO0.Oooo000 oooo000;
        this.f4845o00O0O.OooO00o(i, 0);
        this.f4831OoooOOo = getActionBarHideOffset();
        OooOOo0();
        OooO0o oooO0o = this.f4841Oooooo0;
        if (oooO0o == null || (oooo000 = (oo000oVar = (androidx.appcompat.app.oo000o) oooO0o).f4597OooOo00) == null) {
            return;
        }
        oooo000.OooO00o();
        oo000oVar.f4597OooOo00 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4821Oooo.getVisibility() != 0) {
            return false;
        }
        return this.f4844o000oOoO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f4844o000oOoO || this.f4830OoooOOO) {
            return;
        }
        if (this.f4831OoooOOo <= this.f4821Oooo.getHeight()) {
            OooOOo0();
            postDelayed(this.f4846o0OoOo0, 600L);
        } else {
            OooOOo0();
            postDelayed(this.f4847ooOO, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        OooOOoo();
        int i2 = this.f4832OoooOo0 ^ i;
        this.f4832OoooOo0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        OooO0o oooO0o = this.f4841Oooooo0;
        if (oooO0o != null) {
            ((androidx.appcompat.app.oo000o) oooO0o).f4591OooOOOo = !z2;
            if (z || !z2) {
                androidx.appcompat.app.oo000o oo000oVar = (androidx.appcompat.app.oo000o) oooO0o;
                if (oo000oVar.f4593OooOOo0) {
                    oo000oVar.f4593OooOOo0 = false;
                    oo000oVar.OooOo00(true);
                }
            } else {
                androidx.appcompat.app.oo000o oo000oVar2 = (androidx.appcompat.app.oo000o) oooO0o;
                if (!oo000oVar2.f4593OooOOo0) {
                    oo000oVar2.f4593OooOOo0 = true;
                    oo000oVar2.OooOo00(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.f4841Oooooo0 == null) {
            return;
        }
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO0.OooO0OO(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4823Oooo0oO = i;
        OooO0o oooO0o = this.f4841Oooooo0;
        if (oooO0o != null) {
            ((androidx.appcompat.app.oo000o) oooO0o).f4590OooOOOO = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        OooOOo0();
        this.f4821Oooo.setTranslationY(-Math.max(0, Math.min(i, this.f4821Oooo.getHeight())));
    }

    public void setActionBarVisibilityCallback(OooO0o oooO0o) {
        this.f4841Oooooo0 = oooO0o;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.oo000o) this.f4841Oooooo0).f4590OooOOOO = this.f4823Oooo0oO;
            int i = this.f4832OoooOo0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO0.OooO0OO(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4829OoooOO0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f4844o000oOoO) {
            this.f4844o000oOoO = z;
            if (z) {
                return;
            }
            OooOOo0();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        OooOOoo();
        this.f4827OoooO00.setIcon(i);
    }

    public void setLogo(int i) {
        OooOOoo();
        this.f4827OoooO00.OooOOO0(i);
    }

    public void setOverlayMode(boolean z) {
        this.f4825OoooO = z;
        this.f4828OoooO0O = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.oo000o
    public void setWindowCallback(Window.Callback callback) {
        OooOOoo();
        this.f4827OoooO00.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.oo000o
    public void setWindowTitle(CharSequence charSequence) {
        OooOOoo();
        this.f4827OoooO00.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4823Oooo0oO = 0;
        this.f4833OoooOoO = new Rect();
        this.f4834OoooOoo = new Rect();
        this.f4835Ooooo00 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f7917OooO0O0;
        this.f4836Ooooo0o = windowInsetsCompat;
        this.f4837OooooO0 = windowInsetsCompat;
        this.f4838OooooOO = windowInsetsCompat;
        this.f4839OooooOo = windowInsetsCompat;
        this.f4843Ooooooo = new OooO00o();
        this.f4846o0OoOo0 = new OooO0O0();
        this.f4847ooOO = new OooO0OO();
        OooOOo(context);
        this.f4845o00O0O = new o000O0O0.o00Ooo();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        OooOOoo();
        this.f4827OoooO00.setIcon(drawable);
    }
}
