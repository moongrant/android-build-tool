package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.o000O0O0;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.core.widget.TextViewCompat;
import java.util.WeakHashMap;
import p270o0O0000o.o00000O;
import p270o0O0000o.o00000OO;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements androidx.appcompat.view.menu.OooOOOO.OooO00o {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final int[] f17148Oooo0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f17149OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f17150OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f17151OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public FrameLayout f17152OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final CheckedTextView f17153OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooOO0O f17154OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ColorStateList f17155OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f17156Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Drawable f17157Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final OooO00o f17158Oooo00o;

    public class OooO00o extends androidx.core.view.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            o0oo0oo2.f34022OooO00o.setCheckable(NavigationMenuItemView.this.f17151OooOoOO);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f17152OooOoo == null) {
                this.f17152OooOoo = (FrameLayout) ((ViewStub) findViewById(o0000Ooo.design_menu_item_action_area_stub)).inflate();
            }
            this.f17152OooOoo.removeAllViews();
            this.f17152OooOoo.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        StateListDrawable stateListDrawable;
        this.f17154OooOooO = oooOO0O;
        int i = oooOO0O.f2627OooO00o;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oooOO0O.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(p012OooOo0O.OooOOO0.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f17148Oooo0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, stateListDrawable);
        }
        setCheckable(oooOO0O.isCheckable());
        setChecked(oooOO0O.isChecked());
        setEnabled(oooOO0O.isEnabled());
        setTitle(oooOO0O.f2632OooO0o0);
        setIcon(oooOO0O.getIcon());
        setActionView(oooOO0O.getActionView());
        setContentDescription(oooOO0O.f2643OooOOo0);
        o000O0O0.OooO00o(this, oooOO0O.f2642OooOOo);
        androidx.appcompat.view.menu.OooOO0O oooOO0O2 = this.f17154OooOooO;
        boolean z = oooOO0O2.f2632OooO0o0 == null && oooOO0O2.getIcon() == null && this.f17154OooOooO.getActionView() != null;
        CheckedTextView checkedTextView = this.f17153OooOoo0;
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f17152OooOoo;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f17152OooOoo.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f17152OooOoo;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f17152OooOoo.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public androidx.appcompat.view.menu.OooOO0O getItemData() {
        return this.f17154OooOooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.OooOO0O oooOO0O = this.f17154OooOooO;
        if (oooOO0O != null && oooOO0O.isCheckable() && this.f17154OooOooO.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17148Oooo0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f17151OooOoOO != z) {
            this.f17151OooOoOO = z;
            this.f17158Oooo00o.sendAccessibilityEvent(this.f17153OooOoo0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f17153OooOoo0;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f17156Oooo000) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                o00000oo.o00Ooo.OooO0O0.OooO0oo(drawable, this.f17155OooOooo);
            }
            int i = this.f17150OooOoO0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f17149OooOoO) {
            if (this.f17157Oooo00O == null) {
                Resources resources = getResources();
                int i2 = o00000OO.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
                Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i2, theme);
                this.f17157Oooo00O = drawableOooO00o;
                if (drawableOooO00o != null) {
                    int i3 = this.f17150OooOoO0;
                    drawableOooO00o.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f17157Oooo00O;
        }
        TextViewCompat.OooO0O0.OooO0o0(this.f17153OooOoo0, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f17153OooOoo0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.f17150OooOoO0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f17155OooOooo = colorStateList;
        this.f17156Oooo000 = colorStateList != null;
        androidx.appcompat.view.menu.OooOO0O oooOO0O = this.f17154OooOooO;
        if (oooOO0O != null) {
            setIcon(oooOO0O.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f17153OooOoo0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f17149OooOoO = z;
    }

    public void setTextAppearance(int i) {
        this.f17153OooOoo0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f17153OooOoo0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17153OooOoo0.setText(charSequence);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        this.f17158Oooo00o = oooO00o;
        setOrientation(0);
        LayoutInflater.from(context).inflate(o0000O00.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(o00000O.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(o0000Ooo.design_menu_item_text);
        this.f17153OooOoo0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.OooOOOO(checkedTextView, oooO00o);
    }
}
