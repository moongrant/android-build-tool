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
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p072o000O0o0.o0000OO0;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements androidx.appcompat.view.menu.OooOOO.OooO00o {

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final int[] f17189oo000o = {R.attr.state_checked};

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17190Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f17191OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f17192Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooOO0 f17193o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public ColorStateList f17194o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f17195o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public Drawable f17196o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final OooO00o f17197o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final CheckedTextView f17198o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public FrameLayout f17199ooOO;

    public class OooO00o extends androidx.core.view.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            o0000oo1.OooOooO(NavigationMenuItemView.this.f17192Ooooooo);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f17199ooOO == null) {
                this.f17199ooOO = (FrameLayout) ((ViewStub) findViewById(p337o0OO0o0.OooOOO0.design_menu_item_action_area_stub)).inflate();
            }
            this.f17199ooOO.removeAllViews();
            this.f17199ooOO.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public final void OooO0Oo(@NonNull androidx.appcompat.view.menu.OooOO0 oooOO1) {
        StateListDrawable stateListDrawable;
        this.f17193o00O0O = oooOO1;
        int i = oooOO1.f4730OooO00o;
        if (i > 0) {
            setId(i);
        }
        setVisibility(oooOO1.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(OooOo00.OooO00o.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f17189oo000o, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, stateListDrawable);
        }
        setCheckable(oooOO1.isCheckable());
        setChecked(oooOO1.isChecked());
        setEnabled(oooOO1.isEnabled());
        setTitle(oooOO1.f4735OooO0o0);
        setIcon(oooOO1.getIcon());
        setActionView(oooOO1.getActionView());
        setContentDescription(oooOO1.f4746OooOOo0);
        androidx.appcompat.widget.o0000OO0.OooO00o(this, oooOO1.f4745OooOOo);
        androidx.appcompat.view.menu.OooOO0 oooOO2 = this.f17193o00O0O;
        if (oooOO2.f4735OooO0o0 == null && oooOO2.getIcon() == null && this.f17193o00O0O.getActionView() != null) {
            this.f17198o0OoOo0.setVisibility(8);
            FrameLayout frameLayout = this.f17199ooOO;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f17199ooOO.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f17198o0OoOo0.setVisibility(0);
        FrameLayout frameLayout2 = this.f17199ooOO;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f17199ooOO.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public androidx.appcompat.view.menu.OooOO0 getItemData() {
        return this.f17193o00O0O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.OooOO0 oooOO1 = this.f17193o00O0O;
        if (oooOO1 != null && oooOO1.isCheckable() && this.f17193o00O0O.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17189oo000o);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f17192Ooooooo != z) {
            this.f17192Ooooooo = z;
            this.f17197o00ooo.OooO0oo(this.f17198o0OoOo0, RecyclerView.oo0o0Oo.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f17198o0OoOo0.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f17195o00Ooo) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = o0OOO0o.OooO0o0(drawable).mutate();
                o0OOO0o.OooO0O0.OooO0oo(drawable, this.f17194o00Oo0);
            }
            int i = this.f17190Oooooo;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f17191OoooooO) {
            if (this.f17196o00o0O == null) {
                Resources resources = getResources();
                int i2 = p337o0OO0o0.OooOO0O.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
                Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0045OooO00o.OooO00o(resources, i2, theme);
                this.f17196o00o0O = drawableOooO00o;
                if (drawableOooO00o != null) {
                    int i3 = this.f17190Oooooo;
                    drawableOooO00o.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f17196o00o0O;
        }
        TextViewCompat.OooO0O0.OooO0o0(this.f17198o0OoOo0, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f17198o0OoOo0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.f17190Oooooo = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f17194o00Oo0 = colorStateList;
        this.f17195o00Ooo = colorStateList != null;
        androidx.appcompat.view.menu.OooOO0 oooOO1 = this.f17193o00O0O;
        if (oooOO1 != null) {
            setIcon(oooOO1.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f17198o0OoOo0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f17191OoooooO = z;
    }

    public void setTextAppearance(int i) {
        TextViewCompat.OooO0o(this.f17198o0OoOo0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f17198o0OoOo0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17198o0OoOo0.setText(charSequence);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        this.f17197o00ooo = oooO00o;
        setOrientation(0);
        LayoutInflater.from(context).inflate(p337o0OO0o0.OooOOOO.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(p337o0OO0o0.OooOOO0.design_menu_item_text);
        this.f17198o0OoOo0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.OooOo0o(checkedTextView, oooO00o);
    }
}
