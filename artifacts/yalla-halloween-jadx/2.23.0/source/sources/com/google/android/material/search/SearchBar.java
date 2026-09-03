package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.customview.view.AbsSavedState;
import com.facebook.share.internal.ShareConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o00000OO;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final int f17507o00O0O = o0000O0O.Widget_Material3_SearchBar;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final TextView f17508OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final boolean f17509OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final boolean f17510OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final OooO0o f17511OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final Drawable f17512Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final boolean f17513Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final boolean f17514OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public View f17515OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public final Integer f17516OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17517Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public Drawable f17518Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f17519OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public MaterialShapeDrawable f17520Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f17521o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final OooO0O0 f17522ooOO;

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonOooO0O0 = com.google.android.material.internal.o0ooOOo.OooO0O0(this);
        if (imageButtonOooO0O0 == null) {
            return;
        }
        imageButtonOooO0O0.setClickable(!z);
        imageButtonOooO0O0.setFocusable(!z);
        Drawable background = imageButtonOooO0O0.getBackground();
        if (background != null) {
            this.f17518Oooooo0 = background;
        }
        imageButtonOooO0O0.setBackgroundDrawable(z ? null : this.f17518Oooooo0);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void OooOO0O(@MenuRes int i) {
        super.OooOO0O(i);
        this.f17517Oooooo = i;
    }

    public final void OooOo00() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f17519OoooooO) {
                if (layoutParams.f16196OooO00o == 0) {
                    layoutParams.f16196OooO00o = 53;
                }
            } else if (layoutParams.f16196OooO00o == 53) {
                layoutParams.f16196OooO00o = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f17509OoooOo0 && this.f17515OooooOO == null && !(view instanceof ActionMenuView)) {
            this.f17515OooooOO = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Nullable
    public View getCenterView() {
        return this.f17515OooooOO;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.f17520Ooooooo;
        if (materialShapeDrawable != null) {
            return materialShapeDrawable.f17582OooO0Oo.f17616OooOOO;
        }
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        return ViewCompat.OooOOO.OooO(this);
    }

    public float getCornerSize() {
        return this.f17520Ooooooo.OooOO0();
    }

    @Nullable
    public CharSequence getHint() {
        return this.f17508OoooOOo.getHint();
    }

    public int getMenuResId() {
        return this.f17517Oooooo;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f17520Ooooooo.f17582OooO0Oo.f17608OooO0Oo.getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f17520Ooooooo.f17582OooO0Oo.f17614OooOO0O;
    }

    @Nullable
    public CharSequence getText() {
        return this.f17508OoooOOo.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f17508OoooOOo;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O00o00.OooOOO.OooO0Oo(this, this.f17520Ooooooo);
        if (this.f17510OoooOoO && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(o00000O.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(o00000O.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i2 = marginLayoutParams.topMargin;
            if (i2 == 0) {
                i2 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i2;
            int i3 = marginLayoutParams.rightMargin;
            if (i3 != 0) {
                dimensionPixelSize = i3;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i4 = marginLayoutParams.bottomMargin;
            if (i4 != 0) {
                dimensionPixelSize2 = i4;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        OooOo00();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f17515OooooOO;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i5 = measuredWidth + measuredWidth2;
        int measuredHeight = this.f17515OooooOO.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        int i6 = measuredHeight + measuredHeight2;
        View view2 = this.f17515OooooOO;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (ViewCompat.OooO.OooO0Oo(this) == 1) {
            view2.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
        } else {
            view2.layout(measuredWidth2, measuredHeight2, i5, i6);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f17515OooooOO;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5532OooO0Oo);
        setText(savedState.f17523OooO0o);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f17523OooO0o = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f17515OooooOO;
        if (view2 != null) {
            removeView(view2);
            this.f17515OooooOO = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.f17519OoooooO = z;
        OooOo00();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.f17520Ooooooo;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOO0(f);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f17508OoooOOo.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        int iOooO0OO;
        if (this.f17513Ooooo0o && drawable != null) {
            Integer num = this.f17516OooooOo;
            if (num != null) {
                iOooO0OO = num.intValue();
            } else {
                iOooO0OO = p272o0O000oo.OooOOO.OooO0OO(drawable == this.f17512Ooooo00 ? o00000.colorOnSurfaceVariant : o00000.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            o00000oo.o00Ooo.OooO0O0.OooO0oO(drawable, iOooO0OO);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f17514OooooO0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.f17511OoooOoo.getClass();
    }

    public void setStrokeColor(@ColorInt int i) {
        if (getStrokeColor() != i) {
            this.f17520Ooooooo.OooOOoo(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(@Dimension float f) {
        if (getStrokeWidth() != f) {
            this.f17520Ooooooo.OooOo00(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.f17508OoooOOo.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f17523OooO0o;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17523OooO0o = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5532OooO0Oo, i);
            parcel.writeString(this.f17523OooO0o);
        }

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f17524OooO0oO;

        public ScrollingViewBehavior() {
            this.f17524OooO0oO = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean OooO0Oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            super.OooO0Oo(coordinatorLayout, view, view2);
            if (!this.f17524OooO0oO && (view2 instanceof AppBarLayout)) {
                this.f17524OooO0oO = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17524OooO0oO = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialSearchBarStyle);
    }

    public void setHint(@StringRes int i) {
        this.f17508OoooOOo.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.f17508OoooOOo.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17507o00O0O;
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17517Oooooo = -1;
        this.f17522ooOO = new OooO0O0(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", ShareConstants.WEB_DIALOG_PARAM_TITLE) == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableOooO00o = p013OooOo0o.o00Oo0.OooO00o(context2, o00000OO.ic_search_black_24);
        this.f17512Ooooo00 = drawableOooO00o;
        this.f17511OoooOoo = new OooO0o();
        TypedArray typedArrayOooO0Oo = com.google.android.material.internal.o00oO0o.OooO0Oo(context2, attributeSet, o000OO.SearchBar, i, i2, new int[0]);
        com.google.android.material.shape.OooO0O0 oooO0O0 = new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context2, attributeSet, i, i2));
        float dimension = typedArrayOooO0Oo.getDimension(o000OO.SearchBar_elevation, 0.0f);
        this.f17510OoooOoO = typedArrayOooO0Oo.getBoolean(o000OO.SearchBar_defaultMarginsEnabled, true);
        this.f17519OoooooO = typedArrayOooO0Oo.getBoolean(o000OO.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArrayOooO0Oo.getBoolean(o000OO.SearchBar_hideNavigationIcon, false);
        this.f17514OooooO0 = typedArrayOooO0Oo.getBoolean(o000OO.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.f17513Ooooo0o = typedArrayOooO0Oo.getBoolean(o000OO.SearchBar_tintNavigationIcon, true);
        int i3 = o000OO.SearchBar_navigationIconTint;
        if (typedArrayOooO0Oo.hasValue(i3)) {
            this.f17516OooooOo = Integer.valueOf(typedArrayOooO0Oo.getColor(i3, -1));
        }
        int resourceId = typedArrayOooO0Oo.getResourceId(o000OO.SearchBar_android_textAppearance, -1);
        String string = typedArrayOooO0Oo.getString(o000OO.SearchBar_android_text);
        String string2 = typedArrayOooO0Oo.getString(o000OO.SearchBar_android_hint);
        float dimension2 = typedArrayOooO0Oo.getDimension(o000OO.SearchBar_strokeWidth, -1.0f);
        int color = typedArrayOooO0Oo.getColor(o000OO.SearchBar_strokeColor, 0);
        typedArrayOooO0Oo.recycle();
        if (!z) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableOooO00o);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(o0000O00.mtrl_search_bar, this);
        this.f17509OoooOo0 = true;
        TextView textView = (TextView) findViewById(o0000Ooo.search_bar_text_view);
        this.f17508OoooOOo = textView;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOOoo(this, dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            androidx.core.view.o00O0O.OooO0oo((ViewGroup.MarginLayoutParams) textView.getLayoutParams(), getResources().getDimensionPixelSize(o00000O.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(oooO0O0);
        this.f17520Ooooooo = materialShapeDrawable;
        materialShapeDrawable.OooOO0O(getContext());
        this.f17520Ooooooo.OooOOO0(dimension);
        if (dimension2 >= 0.0f) {
            MaterialShapeDrawable materialShapeDrawable2 = this.f17520Ooooooo;
            materialShapeDrawable2.OooOo00(dimension2);
            materialShapeDrawable2.OooOOoo(ColorStateList.valueOf(color));
        }
        int iOooO0OO = p272o0O000oo.OooOOO.OooO0OO(o00000.colorSurface, this);
        int iOooO0OO2 = p272o0O000oo.OooOOO.OooO0OO(o00000.colorControlHighlight, this);
        this.f17520Ooooooo.OooOOO(ColorStateList.valueOf(iOooO0OO));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iOooO0OO2);
        MaterialShapeDrawable materialShapeDrawable3 = this.f17520Ooooooo;
        ViewCompat.OooO0o.OooOOo0(this, new RippleDrawable(colorStateListValueOf, materialShapeDrawable3, materialShapeDrawable3));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f17521o0OoOo0 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new OooO0OO(this));
        }
    }
}
