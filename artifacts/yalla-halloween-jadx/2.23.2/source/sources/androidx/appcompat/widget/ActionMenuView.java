package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.Iterator;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.OooO.OooO0O0, androidx.appcompat.view.menu.OooOOOO {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO f2771OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooOOO.OooO00o f2772OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f2773OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Context f2774OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f2775OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ActionMenuPresenter f2776OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f2777OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO.OooO00o f2778OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f2779OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f2780OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f2781OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooO0o f2782OooOooO;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2783OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f2784OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f2785OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2786OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f2787OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2788OooO0o0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2783OooO00o = layoutParams.f2783OooO00o;
        }

        public LayoutParams() {
            super(-2, -2);
            this.f2783OooO00o = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO00o {
        boolean OooO00o();

        boolean OooO0O0();
    }

    public static class OooO0O0 implements androidx.appcompat.view.menu.OooOOO.OooO00o {
        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final boolean OooO0OO(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            return false;
        }
    }

    public class OooO0OO implements androidx.appcompat.view.menu.OooO.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
            boolean z;
            boolean zOnMenuItemSelected;
            OooO0o oooO0o = ActionMenuView.this.f2782OooOooO;
            if (oooO0o == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<androidx.core.view.o0OOO0o> it = toolbar.f3157Oooo0O0.f5459OooO0O0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().OooO0OO(menuItem)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                zOnMenuItemSelected = true;
            } else {
                Toolbar.OooOO0O oooOO0O = toolbar.f3160Oooo0o0;
                zOnMenuItemSelected = oooOO0O != null ? androidx.appcompat.app.o00000O0.this.f2422OooO0O0.onMenuItemSelected(0, menuItem) : false;
            }
            return zOnMenuItemSelected;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            androidx.appcompat.view.menu.OooO.OooO00o oooO00o = ActionMenuView.this.f2778OooOoO0;
            if (oooO00o != null) {
                oooO00o.OooO0O0(oooO);
            }
        }
    }

    public interface OooO0o {
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    public static LayoutParams OooOO0o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            LayoutParams layoutParams2 = new LayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams3).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        return layoutParams3;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: OooO */
    public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o(androidx.appcompat.view.menu.OooO oooO) {
        this.f2771OooOOoo = oooO;
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean OooO0Oo(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        return this.f2771OooOOoo.OooOOo0(oooOO0O, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: OooO0oo */
    public final LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: OooOO0 */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooOO0o(layoutParams);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean OooOOO0(int i) {
        boolean zOooO00o = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof OooO00o)) {
            zOooO00o = false | ((OooO00o) childAt).OooO00o();
        }
        return (i <= 0 || !(childAt2 instanceof OooO00o)) ? zOooO00o : zOooO00o | ((OooO00o) childAt2).OooO0O0();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooOO0o(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2771OooOOoo == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.OooO oooO = new androidx.appcompat.view.menu.OooO(context);
            this.f2771OooOOoo = oooO;
            oooO.f2575OooO0o0 = new OooO0OO();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f2776OooOo0o = actionMenuPresenter;
            actionMenuPresenter.f2749OooOOOo = true;
            actionMenuPresenter.f2751OooOOo0 = true;
            androidx.appcompat.view.menu.OooOOO.OooO00o oooO0O0 = this.f2772OooOo;
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0();
            }
            actionMenuPresenter.f2598OooO0oo = oooO0O0;
            this.f2771OooOOoo.OooO0O0(actionMenuPresenter, this.f2774OooOo00);
            ActionMenuPresenter actionMenuPresenter2 = this.f2776OooOo0o;
            actionMenuPresenter2.f2600OooOO0O = this;
            this.f2771OooOOoo = actionMenuPresenter2.f2595OooO0o;
        }
        return this.f2771OooOOoo;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f2776OooOo0o;
        ActionMenuPresenter.OooO0o oooO0o = actionMenuPresenter.f2747OooOOO0;
        if (oooO0o != null) {
            return oooO0o.getDrawable();
        }
        if (actionMenuPresenter.f2748OooOOOO) {
            return actionMenuPresenter.f2746OooOOO;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2773OooOo0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f2776OooOo0o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO(false);
            if (this.f2776OooOo0o.OooOOO0()) {
                this.f2776OooOo0o.OooOO0o();
                this.f2776OooOo0o.OooOOOO();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2776OooOo0o;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooOO0o();
            ActionMenuPresenter.OooO00o oooO00o = actionMenuPresenter.f2753OooOo;
            if (oooO00o == null || !oooO00o.OooO0O0()) {
                return;
            }
            oooO00o.f2663OooOO0.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f2777OooOoO) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zOooO00o = o0O0ooO.OooO00o(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2783OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooOOO0(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zOooO00o) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    OooOOO0(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zOooO00o) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f2783OooO00o) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f2783OooO00o) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        ?? r4;
        int i6;
        androidx.appcompat.view.menu.OooO oooO;
        boolean z3 = this.f2777OooOoO;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f2777OooOoO = z4;
        if (z3 != z4) {
            this.f2779OooOoOO = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f2777OooOoO && (oooO = this.f2771OooOOoo) != null && size != this.f2779OooOoOO) {
            this.f2779OooOoOO = size;
            oooO.OooOOOo(true);
        }
        int childCount = getChildCount();
        if (!this.f2777OooOoO || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f2781OooOoo0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f2780OooOoo;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i13 + 1;
                if (z6) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f2787OooO0o = false;
                layoutParams2.f2785OooO0OO = 0;
                layoutParams2.f2784OooO0O0 = 0;
                layoutParams2.f2786OooO0Oo = false;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.f2788OooO0o0 = z6 && ((ActionMenuItemView) childAt).OooOO0o();
                int i19 = layoutParams2.f2783OooO00o ? 1 : i10;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && actionMenuItemView.OooOO0o();
                if (i19 <= 0 || (z7 && i19 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i12, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i12;
                    if (measuredWidth % i12 != 0) {
                        i6++;
                    }
                    if (z7 && i6 < 2) {
                        i6 = 2;
                    }
                }
                layoutParams3.f2786OooO0Oo = !layoutParams3.f2783OooO00o && z7;
                layoutParams3.f2784OooO0O0 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i6, Pow2.MAX_POW2), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (layoutParams2.f2786OooO0Oo) {
                    i15++;
                }
                if (layoutParams2.f2783OooO00o) {
                    z5 = true;
                }
                i10 -= i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
                i13 = i18;
            }
            i14++;
            size3 = i16;
            i8 = i17;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i20 = mode;
        int i21 = i8;
        int i22 = size3;
        boolean z8 = z5 && i13 == 2;
        boolean z9 = false;
        while (true) {
            if (i15 <= 0 || i10 <= 0) {
                z = z9;
                break;
            }
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i25).getLayoutParams();
                boolean z10 = z9;
                if (layoutParams4.f2786OooO0Oo) {
                    int i26 = layoutParams4.f2784OooO0O0;
                    if (i26 < i23) {
                        j2 = 1 << i25;
                        i23 = i26;
                        i24 = 1;
                    } else if (i26 == i23) {
                        j2 |= 1 << i25;
                        i24++;
                    }
                }
                i25++;
                z9 = z10;
            }
            z = z9;
            j |= j2;
            if (i24 > i10) {
                break;
            }
            int i27 = i23 + 1;
            int i28 = 0;
            while (i28 < childCount2) {
                View childAt2 = getChildAt(i28);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i29 = iMax;
                int i30 = childMeasureSpec;
                int i31 = childCount2;
                long j3 = 1 << i28;
                if ((j2 & j3) != 0) {
                    if (z8 && layoutParams5.f2788OooO0o0) {
                        r4 = 1;
                        r4 = 1;
                        if (i10 == 1) {
                            childAt2.setPadding(i3 + i12, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    layoutParams5.f2784OooO0O0 += r4;
                    layoutParams5.f2787OooO0o = r4;
                    i10--;
                } else if (layoutParams5.f2784OooO0O0 == i27) {
                    j |= j3;
                }
                i28++;
                childMeasureSpec = i30;
                iMax = i29;
                childCount2 = i31;
            }
            z9 = true;
        }
        int i32 = iMax;
        int i33 = childMeasureSpec;
        int i34 = childCount2;
        boolean z11 = !z5 && i13 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i13 - 1 && !z11 && iMax2 <= 1)) {
            i4 = i34;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f2788OooO0o0) {
                    fBitCount -= 0.5f;
                }
                int i35 = i34 - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((LayoutParams) getChildAt(i35).getLayoutParams()).f2788OooO0o0) {
                    fBitCount -= 0.5f;
                }
            }
            int i36 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : 0;
            boolean z12 = z;
            i4 = i34;
            for (int i37 = 0; i37 < i4; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f2785OooO0OO = i36;
                        layoutParams6.f2787OooO0o = true;
                        if (i37 == 0 && !layoutParams6.f2788OooO0o0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i36) / 2;
                        }
                        z12 = true;
                    } else if (layoutParams6.f2783OooO00o) {
                        layoutParams6.f2785OooO0OO = i36;
                        layoutParams6.f2787OooO0o = true;
                        ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i36) / 2;
                        z12 = true;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i36 / 2;
                        }
                        if (i37 != i4 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z2 = z12;
        }
        if (z2) {
            int i38 = 0;
            while (i38 < i4) {
                View childAt4 = getChildAt(i38);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f2787OooO0o) {
                    i5 = i33;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f2784OooO0O0 * i12) + layoutParams7.f2785OooO0OO, Pow2.MAX_POW2), i5);
                } else {
                    i5 = i33;
                }
                i38++;
                i33 = i5;
            }
        }
        setMeasuredDimension(i21, i20 != 1073741824 ? i32 : i22);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2776OooOo0o.f2754OooOo0 = z;
    }

    public void setOnMenuItemClickListener(OooO0o oooO0o) {
        this.f2782OooOooO = oooO0o;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f2776OooOo0o;
        ActionMenuPresenter.OooO0o oooO0o = actionMenuPresenter.f2747OooOOO0;
        if (oooO0o != null) {
            oooO0o.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f2748OooOOOO = true;
            actionMenuPresenter.f2746OooOOO = drawable;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f2775OooOo0O = z;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f2773OooOo0 != i) {
            this.f2773OooOo0 = i;
            if (i == 0) {
                this.f2774OooOo00 = getContext();
            } else {
                this.f2774OooOo00 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f2776OooOo0o = actionMenuPresenter;
        actionMenuPresenter.f2600OooOO0O = this;
        this.f2771OooOOoo = actionMenuPresenter.f2595OooO0o;
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2781OooOoo0 = (int) (56.0f * f);
        this.f2780OooOoo = (int) (f * 4.0f);
        this.f2774OooOo00 = context;
        this.f2773OooOo0 = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
