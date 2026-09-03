package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends OooO0O0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CharSequence f2702OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f2703OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public CharSequence f2704OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f2705OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f2706OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f2707OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public LinearLayout f2708OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f2709OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f2710OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final int f2711OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f2712OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f2713OooOo0o;

    public class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p016OooOoOO.o0OoOo0 f2714OooO0Oo;

        public OooO00o(p016OooOoOO.o0OoOo0 o0oooo1) {
            this.f2714OooO0Oo = o0oooo1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f2714OooO0Oo.OooO0OO();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO0o(p016OooOoOO.o0OoOo0 o0oooo1) {
        View view = this.f2703OooOOO;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f2713OooOo0o, (ViewGroup) this, false);
            this.f2703OooOOO = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f2703OooOOO);
        }
        View viewFindViewById = this.f2703OooOOO.findViewById(p012OooOo0O.Oooo000.action_mode_close_button);
        this.f2705OooOOOO = viewFindViewById;
        viewFindViewById.setOnClickListener(new OooO00o(o0oooo1));
        androidx.appcompat.view.menu.OooO oooOOooO0o0 = o0oooo1.OooO0o0();
        ActionMenuPresenter actionMenuPresenter = this.f2957OooO0oO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooOO0o();
            ActionMenuPresenter.OooO00o oooO00o = actionMenuPresenter.f2753OooOo;
            if (oooO00o != null && oooO00o.OooO0O0()) {
                oooO00o.f2663OooOO0.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f2957OooO0oO = actionMenuPresenter2;
        actionMenuPresenter2.f2749OooOOOo = true;
        actionMenuPresenter2.f2751OooOOo0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oooOOooO0o0.OooO0O0(this.f2957OooO0oO, this.f2956OooO0o0);
        ActionMenuPresenter actionMenuPresenter3 = this.f2957OooO0oO;
        androidx.appcompat.view.menu.OooOOOO oooOOOO = actionMenuPresenter3.f2600OooOO0O;
        if (oooOOOO == null) {
            androidx.appcompat.view.menu.OooOOOO oooOOOO2 = (androidx.appcompat.view.menu.OooOOOO) actionMenuPresenter3.f2597OooO0oO.inflate(actionMenuPresenter3.f2593OooO, (ViewGroup) this, false);
            actionMenuPresenter3.f2600OooOO0O = oooOOOO2;
            oooOOOO2.OooO00o(actionMenuPresenter3.f2595OooO0o);
            actionMenuPresenter3.OooO(true);
        }
        androidx.appcompat.view.menu.OooOOOO oooOOOO3 = actionMenuPresenter3.f2600OooOO0O;
        if (oooOOOO != oooOOOO3) {
            ((ActionMenuView) oooOOOO3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) oooOOOO3;
        this.f2955OooO0o = actionMenuView;
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOo0(actionMenuView, null);
        addView(this.f2955OooO0o, layoutParams);
    }

    public final void OooO0oO() {
        if (this.f2708OooOOo0 == null) {
            LayoutInflater.from(getContext()).inflate(p012OooOo0O.Oooo0.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2708OooOOo0 = linearLayout;
            this.f2707OooOOo = (TextView) linearLayout.findViewById(p012OooOo0O.Oooo000.action_bar_title);
            this.f2709OooOOoo = (TextView) this.f2708OooOOo0.findViewById(p012OooOo0O.Oooo000.action_bar_subtitle);
            int i = this.f2711OooOo00;
            if (i != 0) {
                this.f2707OooOOo.setTextAppearance(getContext(), i);
            }
            int i2 = this.f2710OooOo0;
            if (i2 != 0) {
                this.f2709OooOOoo.setTextAppearance(getContext(), i2);
            }
        }
        this.f2707OooOOo.setText(this.f2702OooOO0o);
        this.f2709OooOOoo.setText(this.f2704OooOOO0);
        boolean z = !TextUtils.isEmpty(this.f2702OooOO0o);
        boolean z2 = !TextUtils.isEmpty(this.f2704OooOOO0);
        int i3 = 0;
        this.f2709OooOOoo.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f2708OooOOo0;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.f2708OooOOo0.getParent() == null) {
            addView(this.f2708OooOOo0);
        }
    }

    public final void OooO0oo() {
        removeAllViews();
        this.f2706OooOOOo = null;
        this.f2955OooO0o = null;
        this.f2957OooO0oO = null;
        View view = this.f2705OooOOOO;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.OooO0O0
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.OooO0O0
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2704OooOOO0;
    }

    public CharSequence getTitle() {
        return this.f2702OooOO0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2957OooO0oO;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooOO0o();
            ActionMenuPresenter.OooO00o oooO00o = this.f2957OooO0oO.f2753OooOo;
            if (oooO00o == null || !oooO00o.OooO0O0()) {
                return;
            }
            oooO00o.f2663OooOO0.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zOooO00o = o0O0ooO.OooO00o(this);
        int paddingRight = zOooO00o ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2703OooOOO;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2703OooOOO.getLayoutParams();
            int i5 = zOooO00o ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zOooO00o ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zOooO00o ? paddingRight - i5 : paddingRight + i5;
            int iOooO0Oo = OooO0O0.OooO0Oo(i7, paddingTop, paddingTop2, this.f2703OooOOO, zOooO00o) + i7;
            paddingRight = zOooO00o ? iOooO0Oo - i6 : iOooO0Oo + i6;
        }
        LinearLayout linearLayout = this.f2708OooOOo0;
        if (linearLayout != null && this.f2706OooOOOo == null && linearLayout.getVisibility() != 8) {
            paddingRight += OooO0O0.OooO0Oo(paddingRight, paddingTop, paddingTop2, this.f2708OooOOo0, zOooO00o);
        }
        View view2 = this.f2706OooOOOo;
        if (view2 != null) {
            OooO0O0.OooO0Oo(paddingRight, paddingTop, paddingTop2, view2, zOooO00o);
        }
        int paddingLeft = zOooO00o ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2955OooO0o;
        if (actionMenuView != null) {
            OooO0O0.OooO0Oo(paddingLeft, paddingTop, paddingTop2, actionMenuView, !zOooO00o);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = Pow2.MAX_POW2;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f2958OooO0oo;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2703OooOOO;
        if (view != null) {
            int iOooO0OO = OooO0O0.OooO0OO(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2703OooOOO.getLayoutParams();
            paddingLeft = iOooO0OO - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2955OooO0o;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = OooO0O0.OooO0OO(this.f2955OooO0o, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f2708OooOOo0;
        if (linearLayout != null && this.f2706OooOOOo == null) {
            if (this.f2712OooOo0O) {
                this.f2708OooOOo0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2708OooOOo0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f2708OooOOo0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = OooO0O0.OooO0OO(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f2706OooOOOo;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            if (i6 == -2) {
                i3 = Integer.MIN_VALUE;
            }
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f2706OooOOOo.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i3));
        }
        if (this.f2958OooO0oo > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // androidx.appcompat.widget.OooO0O0
    public void setContentHeight(int i) {
        this.f2958OooO0oo = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2706OooOOOo;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2706OooOOOo = view;
        if (view != null && (linearLayout = this.f2708OooOOo0) != null) {
            removeView(linearLayout);
            this.f2708OooOOo0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2704OooOOO0 = charSequence;
        OooO0oO();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2702OooOO0o = charSequence;
        OooO0oO();
        ViewCompat.OooOOOo(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f2712OooOo0O) {
            requestLayout();
        }
        this.f2712OooOo0O = z;
    }

    @Override // androidx.appcompat.widget.OooO0O0, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.ActionMode, i, 0);
        int i2 = p012OooOo0O.o00O0O.ActionMode_background;
        if (typedArrayObtainStyledAttributes.hasValue(i2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) != 0) {
            drawable = p013OooOo0o.o00Oo0.OooO00o(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(i2);
        }
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, drawable);
        this.f2711OooOo00 = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.ActionMode_titleTextStyle, 0);
        this.f2710OooOo0 = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.ActionMode_subtitleTextStyle, 0);
        this.f2958OooO0oo = typedArrayObtainStyledAttributes.getLayoutDimension(p012OooOo0O.o00O0O.ActionMode_height, 0);
        this.f2713OooOo0o = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.ActionMode_closeItemLayout, p012OooOo0O.Oooo0.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
