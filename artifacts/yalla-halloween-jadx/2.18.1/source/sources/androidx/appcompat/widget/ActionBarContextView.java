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

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends androidx.appcompat.widget.OooO00o {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public CharSequence f4807OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f4808OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f4809OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f4810OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public LinearLayout f4811OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f4812OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f4813Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f4814Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f4815OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f4816OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f4817OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public CharSequence f4818o000oOoO;

    public class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p016OooOoO0.OooOO0 f4819Oooo0o;

        public OooO00o(p016OooOoO0.OooOO0 oooOO1) {
            this.f4819Oooo0o = oooOO1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f4819Oooo0o.OooO0OO();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO0o(p016OooOoO0.OooOO0 oooOO1) {
        View view = this.f4808OoooOOO;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f4817OooooOo, (ViewGroup) this, false);
            this.f4808OoooOOO = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f4808OoooOOO);
        }
        View viewFindViewById = this.f4808OoooOOO.findViewById(OooOo00.OooOO0.action_mode_close_button);
        this.f4809OoooOOo = viewFindViewById;
        viewFindViewById.setOnClickListener(new OooO00o(oooOO1));
        androidx.appcompat.view.menu.OooO0o oooO0o = (androidx.appcompat.view.menu.OooO0o) oooOO1.OooO0o0();
        ActionMenuPresenter actionMenuPresenter = this.f5062Oooo;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooO00o();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f5062Oooo = actionMenuPresenter2;
        actionMenuPresenter2.f4853OoooOo0 = true;
        actionMenuPresenter2.f4854OoooOoO = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oooO0o.OooO0OO(this.f5062Oooo, this.f5064Oooo0oO);
        ActionMenuPresenter actionMenuPresenter3 = this.f5062Oooo;
        androidx.appcompat.view.menu.OooOOO oooOOO = actionMenuPresenter3.f4684OoooO;
        if (oooOOO == null) {
            androidx.appcompat.view.menu.OooOOO oooOOO2 = (androidx.appcompat.view.menu.OooOOO) actionMenuPresenter3.f4680Oooo.inflate(actionMenuPresenter3.f4685OoooO0, (ViewGroup) this, false);
            actionMenuPresenter3.f4684OoooO = oooOOO2;
            oooOOO2.OooO0O0(actionMenuPresenter3.f4683Oooo0oo);
            actionMenuPresenter3.OooO0Oo(true);
        }
        androidx.appcompat.view.menu.OooOOO oooOOO3 = actionMenuPresenter3.f4684OoooO;
        if (oooOOO != oooOOO3) {
            ((ActionMenuView) oooOOO3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) oooOOO3;
        this.f5065Oooo0oo = actionMenuView;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(actionMenuView, null);
        addView(this.f5065Oooo0oo, layoutParams);
    }

    public final void OooO0oO() {
        if (this.f4811OoooOoO == null) {
            LayoutInflater.from(getContext()).inflate(OooOo00.OooOO0O.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4811OoooOoO = linearLayout;
            this.f4812OoooOoo = (TextView) linearLayout.findViewById(OooOo00.OooOO0.action_bar_title);
            this.f4813Ooooo00 = (TextView) this.f4811OoooOoO.findViewById(OooOo00.OooOO0.action_bar_subtitle);
            if (this.f4814Ooooo0o != 0) {
                this.f4812OoooOoo.setTextAppearance(getContext(), this.f4814Ooooo0o);
            }
            if (this.f4815OooooO0 != 0) {
                this.f4813Ooooo00.setTextAppearance(getContext(), this.f4815OooooO0);
            }
        }
        this.f4812OoooOoo.setText(this.f4807OoooOO0);
        this.f4813Ooooo00.setText(this.f4818o000oOoO);
        boolean z = !TextUtils.isEmpty(this.f4807OoooOO0);
        boolean z2 = !TextUtils.isEmpty(this.f4818o000oOoO);
        int i = 0;
        this.f4813Ooooo00.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f4811OoooOoO;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f4811OoooOoO.getParent() == null) {
            addView(this.f4811OoooOoO);
        }
    }

    public final void OooO0oo() {
        removeAllViews();
        this.f4810OoooOo0 = null;
        this.f5065Oooo0oo = null;
        this.f5062Oooo = null;
        View view = this.f4809OoooOOo;
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

    @Override // androidx.appcompat.widget.OooO00o
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.OooO00o
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4818o000oOoO;
    }

    public CharSequence getTitle() {
        return this.f4807OoooOO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f5062Oooo;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.OooOO0();
            ActionMenuPresenter.OooO00o oooO00o = this.f5062Oooo.f4862Oooooo0;
            if (oooO00o == null || !oooO00o.OooO0O0()) {
                return;
            }
            oooO00o.f4768OooOO0.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zOooO0O0 = o000O00O.OooO0O0(this);
        int paddingRight = zOooO0O0 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4808OoooOOO;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4808OoooOOO.getLayoutParams();
            int i5 = zOooO0O0 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zOooO0O0 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zOooO0O0 ? paddingRight - i5 : paddingRight + i5;
            int iOooO0Oo = i7 + OooO0Oo(this.f4808OoooOOO, i7, paddingTop, paddingTop2, zOooO0O0);
            paddingRight = zOooO0O0 ? iOooO0Oo - i6 : iOooO0Oo + i6;
        }
        int iOooO0Oo2 = paddingRight;
        LinearLayout linearLayout = this.f4811OoooOoO;
        if (linearLayout != null && this.f4810OoooOo0 == null && linearLayout.getVisibility() != 8) {
            iOooO0Oo2 += OooO0Oo(this.f4811OoooOoO, iOooO0Oo2, paddingTop, paddingTop2, zOooO0O0);
        }
        int i8 = iOooO0Oo2;
        View view2 = this.f4810OoooOo0;
        if (view2 != null) {
            OooO0Oo(view2, i8, paddingTop, paddingTop2, zOooO0O0);
        }
        int paddingLeft = zOooO0O0 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f5065Oooo0oo;
        if (actionMenuView != null) {
            OooO0Oo(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zOooO0O0);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f5068OoooO00;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f4808OoooOOO;
        if (view != null) {
            int iOooO0OO = OooO0OO(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4808OoooOOO.getLayoutParams();
            paddingLeft = iOooO0OO - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f5065Oooo0oo;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = OooO0OO(this.f5065Oooo0oo, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4811OoooOoO;
        if (linearLayout != null && this.f4810OoooOo0 == null) {
            if (this.f4816OooooOO) {
                this.f4811OoooOoO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4811OoooOoO.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f4811OoooOoO.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = OooO0OO(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f4810OoooOo0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f4810OoooOo0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f5068OoooO00 > 0) {
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

    @Override // androidx.appcompat.widget.OooO00o
    public void setContentHeight(int i) {
        this.f5068OoooO00 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4810OoooOo0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4810OoooOo0 = view;
        if (view != null && (linearLayout = this.f4811OoooOoO) != null) {
            removeView(linearLayout);
            this.f4811OoooOoO = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4818o000oOoO = charSequence;
        OooO0oO();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4807OoooOO0 = charSequence;
        OooO0oO();
        ViewCompat.OooOo(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f4816OooooOO) {
            requestLayout();
        }
        this.f4816OooooOO = z;
    }

    @Override // androidx.appcompat.widget.OooO00o, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.ActionMode, i, 0);
        int i2 = OooOo00.OooOOOO.ActionMode_background;
        if (typedArrayObtainStyledAttributes.hasValue(i2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) != 0) {
            drawable = p012OooOo0.OooOO0O.OooO0O0(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(i2);
        }
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, drawable);
        this.f4814Ooooo0o = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.ActionMode_titleTextStyle, 0);
        this.f4815OooooO0 = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.ActionMode_subtitleTextStyle, 0);
        this.f5068OoooO00 = typedArrayObtainStyledAttributes.getLayoutDimension(OooOo00.OooOOOO.ActionMode_height, 0);
        this.f4817OooooOo = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.ActionMode_closeItemLayout, OooOo00.OooOO0O.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
