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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.OooO0o.OooO0O0, androidx.appcompat.view.menu.OooOOO {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO0o f4876Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public Context f4877Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f4878OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f4879OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ActionMenuPresenter f4880OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO0o.OooO00o f4881Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooOOO0.OooO00o f4882Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f4883OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f4884Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public OooO0o f4885o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f4886o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f4887ooOO;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4888OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4889OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f4890OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4891OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f4892OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f4893OooO0o0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f4888OooO00o = layoutParams.f4888OooO00o;
        }

        public LayoutParams() {
            super(-2, -2);
            this.f4888OooO00o = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO00o {
        boolean OooO00o();

        boolean OooO0O0();
    }

    public static class OooO0O0 implements androidx.appcompat.view.menu.OooOOO0.OooO00o {
        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final boolean OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            return false;
        }
    }

    public class OooO0OO implements androidx.appcompat.view.menu.OooO0o.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
            boolean zOnMenuItemSelected;
            OooO0o oooO0o2 = ActionMenuView.this.f4885o00O0O;
            if (oooO0o2 != null) {
                Toolbar.OooO00o oooO00o = (Toolbar.OooO00o) oooO0o2;
                if (Toolbar.this.f5281o00oO0o.OooO0OO(menuItem)) {
                    zOnMenuItemSelected = true;
                } else {
                    Toolbar.OooO oooO = Toolbar.this.f5288o0ooOO0;
                    zOnMenuItemSelected = oooO != null ? androidx.appcompat.app.o00O0O.this.f4543OooO0O0.onMenuItemSelected(0, menuItem) : false;
                }
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            androidx.appcompat.view.menu.OooO0o.OooO00o oooO00o = ActionMenuView.this.f4881Oooooo;
            if (oooO00o != null) {
                oooO00o.OooO0O0(oooO0o);
            }
        }
    }

    public interface OooO0o {
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    public static int OooOOOO(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.OooO0OO();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!layoutParams.f4888OooO00o && z2) {
            z = true;
        }
        layoutParams.f4891OooO0Oo = z;
        layoutParams.f4889OooO0O0 = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: OooO */
    public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.OooO0o.OooO0O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean OooO00o(androidx.appcompat.view.menu.OooOO0 oooOO1) {
        return this.f4876Ooooo00.OooOo00(oooOO1, null, 0);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0O0(androidx.appcompat.view.menu.OooO0o oooO0o) {
        this.f4876Ooooo00 = oooO0o;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams();
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean OooOOO(int i) {
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
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f4876Ooooo00 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.OooO0o oooO0o = new androidx.appcompat.view.menu.OooO0o(context);
            this.f4876Ooooo00 = oooO0o;
            oooO0o.OooOoOO(new OooO0OO());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f4880OooooOo = actionMenuPresenter;
            actionMenuPresenter.f4853OoooOo0 = true;
            actionMenuPresenter.f4854OoooOoO = true;
            androidx.appcompat.view.menu.OooOOO0.OooO00o oooO0O0 = this.f4882Oooooo0;
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0();
            }
            actionMenuPresenter.f4686OoooO00 = oooO0O0;
            this.f4876Ooooo00.OooO0OO(actionMenuPresenter, this.f4877Ooooo0o);
            ActionMenuPresenter actionMenuPresenter2 = this.f4880OooooOo;
            actionMenuPresenter2.f4684OoooO = this;
            this.f4876Ooooo00 = actionMenuPresenter2.f4683Oooo0oo;
        }
        return this.f4876Ooooo00;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f4880OooooOo;
        ActionMenuPresenter.OooO0o oooO0o = actionMenuPresenter.f4865o000oOoO;
        if (oooO0o != null) {
            return oooO0o.getDrawable();
        }
        if (actionMenuPresenter.f4852OoooOOo) {
            return actionMenuPresenter.f4851OoooOOO;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4878OooooO0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f4880OooooOo;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO0Oo(false);
            if (this.f4880OooooOo.OooOOO()) {
                this.f4880OooooOo.OooOO0();
                this.f4880OooooOo.OooOOOO();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f4880OooooOo;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO00o();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f4883OoooooO) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zOooO0O0 = o000O00O.OooO0O0(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4888OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooOOO(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zOooO0O0) {
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
                    OooOOO(i9);
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
        if (zOooO0O0) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f4888OooO00o) {
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
            if (childAt4.getVisibility() != 8 && !layoutParams3.f4888OooO00o) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        ?? r3;
        androidx.appcompat.view.menu.OooO0o oooO0o;
        boolean z2 = this.f4883OoooooO;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4883OoooooO = z3;
        if (z2 != z3) {
            this.f4884Ooooooo = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4883OoooooO && (oooO0o = this.f4876Ooooo00) != null && size != this.f4884Ooooooo) {
            this.f4884Ooooooo = size;
            oooO0o.OooOOo(true);
        }
        int childCount = getChildCount();
        if (!this.f4883OoooooO || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
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
        int i5 = size2 - paddingRight;
        int i6 = this.f4886o0OoOo0;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = (i8 / i7) + i6;
        int childCount2 = getChildCount();
        int i10 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        long j = 0;
        while (i12 < childCount2) {
            View childAt = getChildAt(i12);
            int i13 = size3;
            int i14 = i5;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i15 = i10 + 1;
                if (z5) {
                    int i16 = this.f4887ooOO;
                    r3 = 0;
                    childAt.setPadding(i16, 0, i16, 0);
                } else {
                    r3 = 0;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f4892OooO0o = r3;
                layoutParams2.f4890OooO0OO = r3;
                layoutParams2.f4889OooO0O0 = r3;
                layoutParams2.f4891OooO0Oo = r3;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = r3;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = r3;
                layoutParams2.f4893OooO0o0 = z5 && ((ActionMenuItemView) childAt).OooO0OO();
                int iOooOOOO = OooOOOO(childAt, i9, layoutParams2.f4888OooO00o ? 1 : i7, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iOooOOOO);
                if (layoutParams2.f4891OooO0Oo) {
                    i11++;
                }
                if (layoutParams2.f4888OooO00o) {
                    z4 = true;
                }
                i7 -= iOooOOOO;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iOooOOOO == 1) {
                    j |= (long) (1 << i12);
                }
                i10 = i15;
            }
            i12++;
            size3 = i13;
            i5 = i14;
        }
        int i17 = i5;
        int i18 = size3;
        boolean z6 = z4 && i10 == 2;
        boolean z7 = false;
        while (true) {
            if (i11 <= 0 || i7 <= 0) {
                i3 = iMax;
                z = z7;
                break;
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = 0;
            int i21 = 0;
            long j2 = 0;
            while (i20 < childCount2) {
                int i22 = iMax;
                LayoutParams layoutParams3 = (LayoutParams) getChildAt(i20).getLayoutParams();
                boolean z8 = z7;
                if (layoutParams3.f4891OooO0Oo) {
                    int i23 = layoutParams3.f4889OooO0O0;
                    if (i23 < i19) {
                        j2 = 1 << i20;
                        i19 = i23;
                        i21 = 1;
                    } else if (i23 == i19) {
                        i21++;
                        j2 |= 1 << i20;
                    }
                }
                i20++;
                z7 = z8;
                iMax = i22;
            }
            i3 = iMax;
            z = z7;
            j |= j2;
            if (i21 > i7) {
                break;
            }
            int i24 = i19 + 1;
            int i25 = 0;
            while (i25 < childCount2) {
                View childAt2 = getChildAt(i25);
                LayoutParams layoutParams4 = (LayoutParams) childAt2.getLayoutParams();
                int i26 = i11;
                long j3 = 1 << i25;
                if ((j2 & j3) == 0) {
                    if (layoutParams4.f4889OooO0O0 == i24) {
                        j |= j3;
                    }
                    z6 = z6;
                } else {
                    if (z6 && layoutParams4.f4893OooO0o0 && i7 == 1) {
                        int i27 = this.f4887ooOO;
                        childAt2.setPadding(i27 + i9, 0, i27, 0);
                    }
                    layoutParams4.f4889OooO0O0++;
                    layoutParams4.f4892OooO0o = true;
                    i7--;
                }
                i25++;
                i11 = i26;
                z6 = z6;
            }
            iMax = i3;
            z7 = true;
        }
        boolean z9 = !z4 && i10 == 1;
        if (i7 > 0 && j != 0 && (i7 < i10 - 1 || z9 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f4893OooO0o0) {
                    fBitCount -= 0.5f;
                }
                int i28 = childCount2 - 1;
                if ((j & ((long) (1 << i28))) != 0 && !((LayoutParams) getChildAt(i28).getLayoutParams()).f4893OooO0o0) {
                    fBitCount -= 0.5f;
                }
            }
            int i29 = fBitCount > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? (int) ((i7 * i9) / fBitCount) : 0;
            for (int i30 = 0; i30 < childCount2; i30++) {
                if ((j & ((long) (1 << i30))) != 0) {
                    View childAt3 = getChildAt(i30);
                    LayoutParams layoutParams5 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams5.f4890OooO0OO = i29;
                        layoutParams5.f4892OooO0o = true;
                        if (i30 == 0 && !layoutParams5.f4893OooO0o0) {
                            ((LinearLayout.LayoutParams) layoutParams5).leftMargin = (-i29) / 2;
                        }
                    } else if (layoutParams5.f4888OooO00o) {
                        layoutParams5.f4890OooO0OO = i29;
                        layoutParams5.f4892OooO0o = true;
                        ((LinearLayout.LayoutParams) layoutParams5).rightMargin = (-i29) / 2;
                    } else {
                        if (i30 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams5).leftMargin = i29 / 2;
                        }
                        if (i30 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams5).rightMargin = i29 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i31 = 0; i31 < childCount2; i31++) {
                View childAt4 = getChildAt(i31);
                LayoutParams layoutParams6 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams6.f4892OooO0o) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams6.f4889OooO0O0 * i9) + layoutParams6.f4890OooO0OO, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i3 : i18);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f4880OooooOo.f4858OooooO0 = z;
    }

    public void setOnMenuItemClickListener(OooO0o oooO0o) {
        this.f4885o00O0O = oooO0o;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f4880OooooOo;
        ActionMenuPresenter.OooO0o oooO0o = actionMenuPresenter.f4865o000oOoO;
        if (oooO0o != null) {
            oooO0o.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f4852OoooOOo = true;
            actionMenuPresenter.f4851OoooOOO = drawable;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f4879OooooOO = z;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f4878OooooO0 != i) {
            this.f4878OooooO0 = i;
            if (i == 0) {
                this.f4877Ooooo0o = getContext();
            } else {
                this.f4877Ooooo0o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f4880OooooOo = actionMenuPresenter;
        actionMenuPresenter.f4684OoooO = this;
        this.f4876Ooooo00 = actionMenuPresenter.f4683Oooo0oo;
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4886o0OoOo0 = (int) (56.0f * f);
        this.f4887ooOO = (int) (f * 4.0f);
        this.f4877Ooooo0o = context;
        this.f4878OooooO0 = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
