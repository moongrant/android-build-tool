package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
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
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOOO;
import androidx.appcompat.widget.o0000O0;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p016OooOoO0.OooOo;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p347o0OOO0o0.o0O0O00;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17440Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.navigation.OooO0O0 f17441Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final NavigationBarMenuView f17442Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final NavigationBarPresenter f17443Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO0OO f17444OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooOo f17445OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooO0O0 f17446OoooO0O;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LabelVisibility {
    }

    public class OooO00o implements OooO0o.OooO00o {
        public OooO00o() {
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final boolean OooO00o(OooO0o oooO0o, @NonNull MenuItem menuItem) {
            if (NavigationBarView.this.f17446OoooO0O == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                OooO0OO oooO0OO = NavigationBarView.this.f17444OoooO0;
                return (oooO0OO == null || oooO0OO.OooO00o()) ? false : true;
            }
            NavigationBarView.this.f17446OoooO0O.OooO00o();
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final void OooO0O0(OooO0o oooO0o) {
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public interface OooO0OO {
        boolean OooO00o();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public Bundle f17448Oooo0oo;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeBundle(this.f17448Oooo0oo);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17448Oooo0oo = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f17443Oooo0oo = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = Oooo0.NavigationBarView;
        int i3 = Oooo0.NavigationBarView_itemTextAppearanceInactive;
        int i4 = Oooo0.NavigationBarView_itemTextAppearanceActive;
        o0000O0 o0000o0OooO0o0 = o000oOoO.OooO0o0(context2, attributeSet, iArr, i, i2, i3, i4);
        com.google.android.material.navigation.OooO0O0 oooO0O0 = new com.google.android.material.navigation.OooO0O0(context2, getClass(), getMaxItemCount());
        this.f17441Oooo0o = oooO0O0;
        NavigationBarMenuView navigationBarMenuViewOooO00o = OooO00o(context2);
        this.f17442Oooo0oO = navigationBarMenuViewOooO00o;
        navigationBarPresenter.f17435Oooo0o = navigationBarMenuViewOooO00o;
        navigationBarPresenter.f17437Oooo0oo = 1;
        navigationBarMenuViewOooO00o.setPresenter(navigationBarPresenter);
        oooO0O0.OooO0O0(navigationBarPresenter);
        getContext();
        navigationBarPresenter.f17435Oooo0o.f17431o00Oo0 = oooO0O0;
        int i5 = Oooo0.NavigationBarView_itemIconTint;
        if (o0000o0OooO0o0.OooOOOo(i5)) {
            navigationBarMenuViewOooO00o.setIconTintList(o0000o0OooO0o0.OooO0OO(i5));
        } else {
            navigationBarMenuViewOooO00o.setIconTintList(navigationBarMenuViewOooO00o.OooO0OO());
        }
        setItemIconSize(o0000o0OooO0o0.OooO0o(Oooo0.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(OooOO0.mtrl_navigation_bar_item_default_icon_size)));
        if (o0000o0OooO0o0.OooOOOo(i3)) {
            setItemTextAppearanceInactive(o0000o0OooO0o0.OooOOO0(i3, 0));
        }
        if (o0000o0OooO0o0.OooOOOo(i4)) {
            setItemTextAppearanceActive(o0000o0OooO0o0.OooOOO0(i4, 0));
        }
        int i6 = Oooo0.NavigationBarView_itemTextColor;
        if (o0000o0OooO0o0.OooOOOo(i6)) {
            setItemTextColor(o0000o0OooO0o0.OooO0OO(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.OooOOOo(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.OooOOO0(context2);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable);
        }
        int i7 = Oooo0.NavigationBarView_itemPaddingTop;
        if (o0000o0OooO0o0.OooOOOo(i7)) {
            setItemPaddingTop(o0000o0OooO0o0.OooO0o(i7, 0));
        }
        int i8 = Oooo0.NavigationBarView_itemPaddingBottom;
        if (o0000o0OooO0o0.OooOOOo(i8)) {
            setItemPaddingBottom(o0000o0OooO0o0.OooO0o(i8, 0));
        }
        int i9 = Oooo0.NavigationBarView_elevation;
        if (o0000o0OooO0o0.OooOOOo(i9)) {
            setElevation(o0000o0OooO0o0.OooO0o(i9, 0));
        }
        o0OOO0o.OooO0O0.OooO0oo(getBackground().mutate(), o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, Oooo0.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(o0000o0OooO0o0.OooOO0O(Oooo0.NavigationBarView_labelVisibilityMode, -1));
        int iOooOOO0 = o0000o0OooO0o0.OooOOO0(Oooo0.NavigationBarView_itemBackground, 0);
        if (iOooOOO0 != 0) {
            navigationBarMenuViewOooO00o.setItemBackgroundRes(iOooOOO0);
        } else {
            setItemRippleColor(o0OOO0O.OooO0OO.OooO0O0(context2, o0000o0OooO0o0, Oooo0.NavigationBarView_itemRippleColor));
        }
        int iOooOOO1 = o0000o0OooO0o0.OooOOO0(Oooo0.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (iOooOOO1 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iOooOOO1, Oooo0.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Oooo0.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, Oooo0.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(new com.google.android.material.shape.OooO00o(com.google.android.material.shape.OooO00o.OooO00o(context2, typedArrayObtainStyledAttributes.getResourceId(Oooo0.NavigationBarActiveIndicator_shapeAppearance, 0), 0)));
            typedArrayObtainStyledAttributes.recycle();
        }
        int i10 = Oooo0.NavigationBarView_menu;
        if (o0000o0OooO0o0.OooOOOo(i10)) {
            int iOooOOO2 = o0000o0OooO0o0.OooOOO0(i10, 0);
            navigationBarPresenter.f17436Oooo0oO = true;
            getMenuInflater().inflate(iOooOOO2, oooO0O0);
            navigationBarPresenter.f17436Oooo0oO = false;
            navigationBarPresenter.OooO0Oo(true);
        }
        o0000o0OooO0o0.OooOOoo();
        addView(navigationBarMenuViewOooO00o);
        oooO0O0.f4711OooO0o0 = new OooO00o();
    }

    private MenuInflater getMenuInflater() {
        if (this.f17445OoooO00 == null) {
            this.f17445OoooO00 = new OooOo(getContext());
        }
        return this.f17445OoooO00;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView OooO00o(@NonNull Context context);

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f17442Oooo0oO.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f17442Oooo0oO.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f17442Oooo0oO.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public com.google.android.material.shape.OooO00o getItemActiveIndicatorShapeAppearance() {
        return this.f17442Oooo0oO.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f17442Oooo0oO.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f17442Oooo0oO.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f17442Oooo0oO.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f17442Oooo0oO.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f17442Oooo0oO.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f17442Oooo0oO.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f17442Oooo0oO.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f17440Oooo;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f17442Oooo0oO.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f17442Oooo0oO.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f17442Oooo0oO.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f17442Oooo0oO.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f17441Oooo0o;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooOOO getMenuView() {
        return this.f17442Oooo0oO;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f17443Oooo0oo;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f17442Oooo0oO.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o0O0O00.OooO0OO(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        this.f17441Oooo0o.OooOo(savedState.f17448Oooo0oo);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f17448Oooo0oo = bundle;
        this.f17441Oooo0o.OooOoO(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        o0O0O00.OooO0O0(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f17442Oooo0oO.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f17442Oooo0oO.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.f17442Oooo0oO.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.f17442Oooo0oO.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable com.google.android.material.shape.OooO00o oooO00o) {
        this.f17442Oooo0oO.setItemActiveIndicatorShapeAppearance(oooO00o);
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.f17442Oooo0oO.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f17442Oooo0oO.setItemBackground(drawable);
        this.f17440Oooo = null;
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.f17442Oooo0oO.setItemBackgroundRes(i);
        this.f17440Oooo = null;
    }

    public void setItemIconSize(@Dimension int i) {
        this.f17442Oooo0oO.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17442Oooo0oO.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@Px int i) {
        this.f17442Oooo0oO.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@Px int i) {
        this.f17442Oooo0oO.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f17440Oooo == colorStateList) {
            if (colorStateList != null || this.f17442Oooo0oO.getItemBackground() == null) {
                return;
            }
            this.f17442Oooo0oO.setItemBackground(null);
            return;
        }
        this.f17440Oooo = colorStateList;
        if (colorStateList == null) {
            this.f17442Oooo0oO.setItemBackground(null);
        } else {
            this.f17442Oooo0oO.setItemBackground(new RippleDrawable(o0OOO0OO.OooO0O0.OooO00o(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f17442Oooo0oO.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f17442Oooo0oO.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f17442Oooo0oO.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f17442Oooo0oO.getLabelVisibilityMode() != i) {
            this.f17442Oooo0oO.setLabelVisibilityMode(i);
            this.f17443Oooo0oo.OooO0Oo(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OooO0O0 oooO0O0) {
        this.f17446OoooO0O = oooO0O0;
    }

    public void setOnItemSelectedListener(@Nullable OooO0OO oooO0OO) {
        this.f17444OoooO0 = oooO0OO;
    }

    public void setSelectedItemId(@IdRes int i) {
        MenuItem menuItemFindItem = this.f17441Oooo0o.findItem(i);
        if (menuItemFindItem == null || this.f17441Oooo0o.OooOo00(menuItemFindItem, this.f17443Oooo0oo, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
