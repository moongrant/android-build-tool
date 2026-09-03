package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.transition.AutoTransition;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.HashSet;
import java.util.WeakHashMap;
import o0000O.o0Oo0oo;
import o000OO.OooOO0O;
import p012OooOo0O.OooOOO0;
import p270o0O0000o.o0000;
import p270o0O0000o.o00000;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements OooOOOO {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final int[] f17390Oooo00O = {R.attr.state_checked};

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final int[] f17391Oooo00o = {-16842910};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public NavigationBarItemView[] f17392OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final AutoTransition f17393OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O f17394OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO00o f17395OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SparseArray<View.OnTouchListener> f17396OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f17397OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17398OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17399OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f17400OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ColorStateList f17401OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Dimension
    public int f17402OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final ColorStateList f17403OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @StyleRes
    public int f17404OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Drawable f17405OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @StyleRes
    public int f17406OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public ColorStateList f17407OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f17408OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final SparseArray<BadgeDrawable> f17409OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f17410OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f17411OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f17412OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f17413OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f17414OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f17415OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f17416OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public com.google.android.material.shape.OooO0O0 f17417OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ColorStateList f17418OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public NavigationBarPresenter f17419OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public OooO f17420Oooo000;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.OooOO0O itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            if (navigationBarMenuView.f17420Oooo000.OooOOo0(itemData, navigationBarMenuView.f17419OooOooo, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f17394OooO0o = new OooOO0O(5);
        this.f17396OooO0oO = new SparseArray<>(5);
        this.f17398OooOO0 = 0;
        this.f17399OooOO0O = 0;
        this.f17409OooOo0 = new SparseArray<>(5);
        this.f17411OooOo0O = -1;
        this.f17412OooOo0o = -1;
        this.f17416OooOoo = false;
        this.f17403OooOOOO = OooO0OO();
        if (isInEditMode()) {
            this.f17393OooO0Oo = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f17393OooO0Oo = autoTransition;
            autoTransition.Oooo0oo(0);
            autoTransition.OooOoo(o0O00OO.OooO00o.OooO0OO(o00000.motionDurationMedium4, getContext(), getResources().getInteger(o0000.material_motion_duration_long_1)));
            autoTransition.Oooo000(o0O00OO.OooO00o.OooO0Oo(getContext(), o00000.motionEasingStandard, o0O000.OooO0O0.f41572OooO0O0));
            autoTransition.Oooo0o0(new o00Ooo());
        }
        this.f17395OooO0o0 = new OooO00o();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
    }

    public static boolean OooO0o(int i, int i2) {
        return i != -1 ? i == 0 : i2 > 3;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f17394OooO0o.OooO0O0();
        return navigationBarItemView == null ? OooO0o0(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if ((id != -1) && (badgeDrawable = this.f17409OooOo0.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOOO
    public final void OooO00o(@NonNull OooO oooO) {
        this.f17420Oooo000 = oooO;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void OooO0O0() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f17394OooO0o.OooO00o(navigationBarItemView);
                    if (navigationBarItemView.f17386Oooo00O != null) {
                        ImageView imageView = navigationBarItemView.f17369OooOOOo;
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            BadgeDrawable badgeDrawable = navigationBarItemView.f17386Oooo00O;
                            if (badgeDrawable != null) {
                                if (badgeDrawable.OooO0Oo() != null) {
                                    badgeDrawable.OooO0Oo().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(badgeDrawable);
                                }
                            }
                        }
                        navigationBarItemView.f17386Oooo00O = null;
                    }
                    navigationBarItemView.f17374OooOo0 = null;
                    navigationBarItemView.f17380OooOoOO = 0.0f;
                    navigationBarItemView.f17358OooO0Oo = false;
                }
            }
        }
        if (this.f17420Oooo000.size() == 0) {
            this.f17398OooOO0 = 0;
            this.f17399OooOO0O = 0;
            this.f17392OooO = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f17420Oooo000.size(); i++) {
            hashSet.add(Integer.valueOf(this.f17420Oooo000.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray<BadgeDrawable> sparseArray = this.f17409OooOo0;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.f17392OooO = new NavigationBarItemView[this.f17420Oooo000.size()];
        boolean zOooO0o = OooO0o(this.f17397OooO0oo, this.f17420Oooo000.OooOO0o().size());
        for (int i3 = 0; i3 < this.f17420Oooo000.size(); i3++) {
            this.f17419OooOooo.f17424OooO0o0 = true;
            this.f17420Oooo000.getItem(i3).setCheckable(true);
            this.f17419OooOooo.f17424OooO0o0 = false;
            NavigationBarItemView newItem = getNewItem();
            this.f17392OooO[i3] = newItem;
            newItem.setIconTintList(this.f17400OooOO0o);
            newItem.setIconSize(this.f17402OooOOO0);
            newItem.setTextColor(this.f17403OooOOOO);
            newItem.setTextAppearanceInactive(this.f17404OooOOOo);
            newItem.setTextAppearanceActive(this.f17406OooOOo0);
            newItem.setTextColor(this.f17401OooOOO);
            int i4 = this.f17411OooOo0O;
            if (i4 != -1) {
                newItem.setItemPaddingTop(i4);
            }
            int i5 = this.f17412OooOo0o;
            if (i5 != -1) {
                newItem.setItemPaddingBottom(i5);
            }
            newItem.setActiveIndicatorWidth(this.f17414OooOoO0);
            newItem.setActiveIndicatorHeight(this.f17413OooOoO);
            newItem.setActiveIndicatorMarginHorizontal(this.f17415OooOoOO);
            newItem.setActiveIndicatorDrawable(OooO0Oo());
            newItem.setActiveIndicatorResizeable(this.f17416OooOoo);
            newItem.setActiveIndicatorEnabled(this.f17408OooOo);
            Drawable drawable = this.f17405OooOOo;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f17410OooOo00);
            }
            newItem.setItemRippleColor(this.f17407OooOOoo);
            newItem.setShifting(zOooO0o);
            newItem.setLabelVisibilityMode(this.f17397OooO0oo);
            androidx.appcompat.view.menu.OooOO0O oooOO0O = (androidx.appcompat.view.menu.OooOO0O) this.f17420Oooo000.getItem(i3);
            newItem.OooO0OO(oooOO0O);
            newItem.setItemPosition(i3);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f17396OooO0oO;
            int i6 = oooOO0O.f2627OooO00o;
            newItem.setOnTouchListener(sparseArray2.get(i6));
            newItem.setOnClickListener(this.f17395OooO0o0);
            int i7 = this.f17398OooOO0;
            if (i7 != 0 && i6 == i7) {
                this.f17399OooOO0O = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f17420Oooo000.size() - 1, this.f17399OooOO0O);
        this.f17399OooOO0O = iMin;
        this.f17420Oooo000.getItem(iMin).setChecked(true);
    }

    @Nullable
    public final ColorStateList OooO0OO() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListOooO0O0 = ContextCompat.OooO0O0(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(OooOOO0.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListOooO0O0.getDefaultColor();
        int[] iArr = f17391Oooo00o;
        return new ColorStateList(new int[][]{iArr, f17390Oooo00O, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListOooO0O0.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Nullable
    public final MaterialShapeDrawable OooO0Oo() {
        if (this.f17417OooOoo0 == null || this.f17418OooOooO == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f17417OooOoo0);
        materialShapeDrawable.OooOOO(this.f17418OooOooO);
        return materialShapeDrawable;
    }

    @NonNull
    public abstract NavigationBarItemView OooO0o0(@NonNull Context context);

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f17409OooOo0;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f17400OooOO0o;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f17418OooOooO;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f17408OooOo;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f17413OooOoO;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f17415OooOoOO;
    }

    @Nullable
    public com.google.android.material.shape.OooO0O0 getItemActiveIndicatorShapeAppearance() {
        return this.f17417OooOoo0;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f17414OooOoO0;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f17405OooOOo : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f17410OooOo00;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f17402OooOOO0;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f17412OooOo0o;
    }

    @Px
    public int getItemPaddingTop() {
        return this.f17411OooOo0O;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f17407OooOOoo;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f17406OooOOo0;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f17404OooOOOo;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f17401OooOOO;
    }

    public int getLabelVisibilityMode() {
        return this.f17397OooO0oo;
    }

    @Nullable
    public OooO getMenu() {
        return this.f17420Oooo000;
    }

    public int getSelectedItemId() {
        return this.f17398OooOO0;
    }

    public int getSelectedItemPosition() {
        return this.f17399OooOO0O;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0Oo0oo.OooO0OO.OooO00o(1, this.f17420Oooo000.OooOO0o().size(), 1, false).f34044OooO00o);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17400OooOO0o = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f17418OooOooO = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(OooO0Oo());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f17408OooOo = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.f17413OooOoO = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.f17415OooOoOO = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f17416OooOoo = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f17417OooOoo0 = oooO0O0;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(OooO0Oo());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.f17414OooOoO0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f17405OooOOo = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f17410OooOo00 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.f17402OooOOO0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(@Px int i) {
        this.f17412OooOo0o = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@Px int i) {
        this.f17411OooOo0O = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f17407OooOOoo = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f17406OooOOo0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f17401OooOOO;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f17404OooOOOo = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f17401OooOOO;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f17401OooOOO = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17392OooO;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f17397OooO0oo = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f17419OooOooo = navigationBarPresenter;
    }
}
