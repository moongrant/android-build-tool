package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.o000Oo0;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import o0O00o00.OooOOO;
import p016OooOoOO.o00oO0o;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000O;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f17427OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.navigation.OooO0OO f17428OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NavigationBarPresenter f17429OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NavigationBarMenuView f17430OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00oO0o f17431OooO0oO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    public class OooO00o implements OooO.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(OooO oooO, @NonNull MenuItem menuItem) {
            int i = NavigationBarView.f17427OooO0oo;
            NavigationBarView navigationBarView = NavigationBarView.this;
            navigationBarView.getClass();
            navigationBarView.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(OooO oooO) {
        }
    }

    public interface OooO0O0 {
    }

    public interface OooO0OO {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public Bundle f17433OooO0o;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17433OooO0o = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f5532OooO0Oo, i);
            parcel.writeBundle(this.f17433OooO0o);
        }
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(o0O00oO0.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f17429OooO0o = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = o000OO.NavigationBarView;
        int i3 = o000OO.NavigationBarView_itemTextAppearanceInactive;
        int i4 = o000OO.NavigationBarView_itemTextAppearanceActive;
        o000Oo0 o000oo0OooO0o0 = com.google.android.material.internal.o00oO0o.OooO0o0(context2, attributeSet, iArr, i, i2, i3, i4);
        com.google.android.material.navigation.OooO0OO oooO0OO = new com.google.android.material.navigation.OooO0OO(context2, getClass(), getMaxItemCount());
        this.f17428OooO0Oo = oooO0OO;
        NavigationBarMenuView navigationBarMenuViewOooO00o = OooO00o(context2);
        this.f17430OooO0o0 = navigationBarMenuViewOooO00o;
        navigationBarPresenter.f17422OooO0Oo = navigationBarMenuViewOooO00o;
        navigationBarPresenter.f17423OooO0o = 1;
        navigationBarMenuViewOooO00o.setPresenter(navigationBarPresenter);
        oooO0OO.OooO0O0(navigationBarPresenter, oooO0OO.f2572OooO00o);
        getContext();
        navigationBarPresenter.f17422OooO0Oo.f17420Oooo000 = oooO0OO;
        int i5 = o000OO.NavigationBarView_itemIconTint;
        if (o000oo0OooO0o0.OooOO0o(i5)) {
            navigationBarMenuViewOooO00o.setIconTintList(o000oo0OooO0o0.OooO0O0(i5));
        } else {
            navigationBarMenuViewOooO00o.setIconTintList(navigationBarMenuViewOooO00o.OooO0OO());
        }
        setItemIconSize(o000oo0OooO0o0.OooO0Oo(o000OO.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(o00000O.mtrl_navigation_bar_item_default_icon_size)));
        if (o000oo0OooO0o0.OooOO0o(i3)) {
            setItemTextAppearanceInactive(o000oo0OooO0o0.OooO(i3, 0));
        }
        if (o000oo0OooO0o0.OooOO0o(i4)) {
            setItemTextAppearanceActive(o000oo0OooO0o0.OooO(i4, 0));
        }
        int i6 = o000OO.NavigationBarView_itemTextColor;
        if (o000oo0OooO0o0.OooOO0o(i6)) {
            setItemTextColor(o000oo0OooO0o0.OooO0O0(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.OooOOO(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.OooOO0O(context2);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
        int i7 = o000OO.NavigationBarView_itemPaddingTop;
        if (o000oo0OooO0o0.OooOO0o(i7)) {
            setItemPaddingTop(o000oo0OooO0o0.OooO0Oo(i7, 0));
        }
        int i8 = o000OO.NavigationBarView_itemPaddingBottom;
        if (o000oo0OooO0o0.OooOO0o(i8)) {
            setItemPaddingBottom(o000oo0OooO0o0.OooO0Oo(i8, 0));
        }
        int i9 = o000OO.NavigationBarView_elevation;
        if (o000oo0OooO0o0.OooOO0o(i9)) {
            setElevation(o000oo0OooO0o0.OooO0Oo(i9, 0));
        }
        o00Ooo.OooO0O0.OooO0oo(getBackground().mutate(), c1.OooO0O0(context2, o000oo0OooO0o0, o000OO.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(o000oo0OooO0o0.f3326OooO0O0.getInteger(o000OO.NavigationBarView_labelVisibilityMode, -1));
        int iOooO = o000oo0OooO0o0.OooO(o000OO.NavigationBarView_itemBackground, 0);
        if (iOooO != 0) {
            navigationBarMenuViewOooO00o.setItemBackgroundRes(iOooO);
        } else {
            setItemRippleColor(c1.OooO0O0(context2, o000oo0OooO0o0, o000OO.NavigationBarView_itemRippleColor));
        }
        int iOooO2 = o000oo0OooO0o0.OooO(o000OO.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (iOooO2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iOooO2, o000OO.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(o000OO.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(c1.OooO00o(context2, typedArrayObtainStyledAttributes, o000OO.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO00o(typedArrayObtainStyledAttributes.getResourceId(o000OO.NavigationBarActiveIndicator_shapeAppearance, 0), context2, 0)));
            typedArrayObtainStyledAttributes.recycle();
        }
        int i10 = o000OO.NavigationBarView_menu;
        if (o000oo0OooO0o0.OooOO0o(i10)) {
            int iOooO3 = o000oo0OooO0o0.OooO(i10, 0);
            navigationBarPresenter.f17424OooO0o0 = true;
            getMenuInflater().inflate(iOooO3, oooO0OO);
            navigationBarPresenter.f17424OooO0o0 = false;
            navigationBarPresenter.OooO(true);
        }
        o000oo0OooO0o0.OooOOO();
        addView(navigationBarMenuViewOooO00o);
        oooO0OO.f2577OooO0o0 = new OooO00o();
    }

    private MenuInflater getMenuInflater() {
        if (this.f17431OooO0oO == null) {
            this.f17431OooO0oO = new o00oO0o(getContext());
        }
        return this.f17431OooO0oO;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView OooO00o(@NonNull Context context);

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f17430OooO0o0.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f17430OooO0o0.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f17430OooO0o0.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public com.google.android.material.shape.OooO0O0 getItemActiveIndicatorShapeAppearance() {
        return this.f17430OooO0o0.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f17430OooO0o0.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f17430OooO0o0.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f17430OooO0o0.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f17430OooO0o0.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f17430OooO0o0.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f17430OooO0o0.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f17430OooO0o0.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f17430OooO0o0.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f17430OooO0o0.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f17430OooO0o0.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f17430OooO0o0.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f17430OooO0o0.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f17428OooO0Oo;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooOOOO getMenuView() {
        return this.f17430OooO0o0;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f17429OooO0o;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f17430OooO0o0.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOOO.OooO0OO(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5532OooO0Oo);
        this.f17428OooO0Oo.OooOo00(savedState.f17433OooO0o);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f17433OooO0o = bundle;
        this.f17428OooO0Oo.OooOo0O(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooOOO.OooO0O0(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f17430OooO0o0.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f17430OooO0o0.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.f17430OooO0o0.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.f17430OooO0o0.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f17430OooO0o0.setItemActiveIndicatorShapeAppearance(oooO0O0);
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.f17430OooO0o0.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f17430OooO0o0.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.f17430OooO0o0.setItemBackgroundRes(i);
    }

    public void setItemIconSize(@Dimension int i) {
        this.f17430OooO0o0.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17430OooO0o0.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@Px int i) {
        this.f17430OooO0o0.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@Px int i) {
        this.f17430OooO0o0.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f17430OooO0o0.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f17430OooO0o0.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f17430OooO0o0.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f17430OooO0o0.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        NavigationBarMenuView navigationBarMenuView = this.f17430OooO0o0;
        if (navigationBarMenuView.getLabelVisibilityMode() != i) {
            navigationBarMenuView.setLabelVisibilityMode(i);
            this.f17429OooO0o.OooO(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OooO0O0 oooO0O0) {
    }

    public void setOnItemSelectedListener(@Nullable OooO0OO oooO0OO) {
    }

    public void setSelectedItemId(@IdRes int i) {
        com.google.android.material.navigation.OooO0OO oooO0OO = this.f17428OooO0Oo;
        MenuItem menuItemFindItem = oooO0OO.findItem(i);
        if (menuItemFindItem == null || oooO0OO.OooOOo0(menuItemFindItem, this.f17429OooO0o, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
