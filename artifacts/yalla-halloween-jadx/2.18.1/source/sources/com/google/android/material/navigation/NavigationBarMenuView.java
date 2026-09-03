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
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOO0;
import androidx.appcompat.view.menu.OooOOO;
import androidx.core.view.ViewCompat;
import androidx.transition.AutoTransition;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.Oooo000;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashSet;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000OO0O.OooO;
import o000OO0O.OooOO0O;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements OooOOO {

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final int[] f17404o00Ooo = {R.attr.state_checked};

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final int[] f17405o00o0O = {-16842910};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public final SparseArray<View.OnTouchListener> f17406Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final AutoTransition f17407Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public final OooO00o f17408Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO<NavigationBarItemView> f17409Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f17410OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public NavigationBarItemView[] f17411OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f17412OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17413OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f17414OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ColorStateList f17415OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public final ColorStateList f17416OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @StyleRes
    public int f17417OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @StyleRes
    public int f17418OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Drawable f17419OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f17420Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public final SparseArray<BadgeDrawable> f17421Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f17422OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f17423OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f17424OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f17425Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f17426Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f17427OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public com.google.android.material.shape.OooO00o f17428Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Dimension
    public int f17429o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public NavigationBarPresenter f17430o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public OooO0o f17431o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f17432o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ColorStateList f17433ooOO;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooOO0 itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            if (navigationBarMenuView.f17431o00Oo0.OooOo00(itemData, navigationBarMenuView.f17430o00O0O, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f17409Oooo0oo = new OooOO0O(5);
        this.f17406Oooo = new SparseArray<>(5);
        this.f17413OoooO0O = 0;
        this.f17410OoooO = 0;
        this.f17421Ooooo0o = new SparseArray<>(5);
        this.f17422OooooO0 = -1;
        this.f17423OooooOO = -1;
        this.f17432o0OoOo0 = false;
        this.f17416OoooOOo = OooO0OO();
        if (isInEditMode()) {
            this.f17407Oooo0o = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f17407Oooo0o = autoTransition;
            autoTransition.Oooo(0);
            autoTransition.Oooo0oO(o0OOO00o.OooO00o.OooO0OO(getContext(), p337o0OO0o0.OooO0o.motionDurationLong1, getResources().getInteger(p337o0OO0o0.OooOOO.material_motion_duration_long_1)));
            autoTransition.Oooo0oo(o0OOO00o.OooO00o.OooO0Oo(getContext(), p337o0OO0o0.OooO0o.motionEasingStandard, p338o0OO0o0O.OooO0o.f37973OooO0O0));
            autoTransition.Oooo0o0(new Oooo000());
        }
        this.f17408Oooo0oO = new OooO00o();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemViewOooO0O0 = this.f17409Oooo0oo.OooO0O0();
        return navigationBarItemViewOooO0O0 == null ? OooO0o0(getContext()) : navigationBarItemViewOooO0O0;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if ((id != -1) && (badgeDrawable = this.f17421Ooooo0o.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void OooO00o() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f17409Oooo0oo.OooO00o(navigationBarItemView);
                    navigationBarItemView.OooO0oo(navigationBarItemView.f17382OoooOOO);
                    navigationBarItemView.f17387Ooooo00 = null;
                    navigationBarItemView.f17392Oooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    navigationBarItemView.f17374Oooo0o = false;
                }
            }
        }
        if (this.f17431o00Oo0.size() == 0) {
            this.f17413OoooO0O = 0;
            this.f17410OoooO = 0;
            this.f17411OoooO0 = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f17431o00Oo0.size(); i++) {
            hashSet.add(Integer.valueOf(this.f17431o00Oo0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f17421Ooooo0o.size(); i2++) {
            int iKeyAt = this.f17421Ooooo0o.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f17421Ooooo0o.delete(iKeyAt);
            }
        }
        this.f17411OoooO0 = new NavigationBarItemView[this.f17431o00Oo0.size()];
        boolean zOooO0o = OooO0o(this.f17412OoooO00, this.f17431o00Oo0.OooOOO0().size());
        for (int i3 = 0; i3 < this.f17431o00Oo0.size(); i3++) {
            this.f17430o00O0O.f17436Oooo0oO = true;
            this.f17431o00Oo0.getItem(i3).setCheckable(true);
            this.f17430o00O0O.f17436Oooo0oO = false;
            NavigationBarItemView newItem = getNewItem();
            this.f17411OoooO0[i3] = newItem;
            newItem.setIconTintList(this.f17414OoooOO0);
            newItem.setIconSize(this.f17429o000oOoO);
            newItem.setTextColor(this.f17416OoooOOo);
            newItem.setTextAppearanceInactive(this.f17417OoooOo0);
            newItem.setTextAppearanceActive(this.f17418OoooOoO);
            newItem.setTextColor(this.f17415OoooOOO);
            int i4 = this.f17422OooooO0;
            if (i4 != -1) {
                newItem.setItemPaddingTop(i4);
            }
            int i5 = this.f17423OooooOO;
            if (i5 != -1) {
                newItem.setItemPaddingBottom(i5);
            }
            newItem.setActiveIndicatorWidth(this.f17426Oooooo0);
            newItem.setActiveIndicatorHeight(this.f17425Oooooo);
            newItem.setActiveIndicatorMarginHorizontal(this.f17427OoooooO);
            newItem.setActiveIndicatorDrawable(OooO0Oo());
            newItem.setActiveIndicatorResizeable(this.f17432o0OoOo0);
            newItem.setActiveIndicatorEnabled(this.f17424OooooOo);
            Drawable drawable = this.f17419OoooOoo;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f17420Ooooo00);
            }
            newItem.setShifting(zOooO0o);
            newItem.setLabelVisibilityMode(this.f17412OoooO00);
            OooOO0 oooOO1 = (OooOO0) this.f17431o00Oo0.getItem(i3);
            newItem.OooO0Oo(oooOO1);
            newItem.setItemPosition(i3);
            int i6 = oooOO1.f4730OooO00o;
            newItem.setOnTouchListener(this.f17406Oooo.get(i6));
            newItem.setOnClickListener(this.f17408Oooo0oO);
            int i7 = this.f17413OoooO0O;
            if (i7 != 0 && i6 == i7) {
                this.f17410OoooO = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f17431o00Oo0.size() - 1, this.f17410OoooO);
        this.f17410OoooO = iMin;
        this.f17431o00Oo0.getItem(iMin).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(@NonNull OooO0o oooO0o) {
        this.f17431o00Oo0 = oooO0o;
    }

    @Nullable
    public final ColorStateList OooO0OO() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListOooO00o = p012OooOo0.OooOO0O.OooO00o(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(OooOo00.OooO00o.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListOooO00o.getDefaultColor();
        int[] iArr = f17405o00o0O;
        return new ColorStateList(new int[][]{iArr, f17404o00Ooo, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListOooO00o.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Nullable
    public final Drawable OooO0Oo() {
        if (this.f17428Ooooooo == null || this.f17433ooOO == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f17428Ooooooo);
        materialShapeDrawable.OooOOOo(this.f17433ooOO);
        return materialShapeDrawable;
    }

    public final boolean OooO0o(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public abstract NavigationBarItemView OooO0o0(@NonNull Context context);

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f17421Ooooo0o;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f17414OoooOO0;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f17433ooOO;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f17424OooooOo;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f17425Oooooo;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f17427OoooooO;
    }

    @Nullable
    public com.google.android.material.shape.OooO00o getItemActiveIndicatorShapeAppearance() {
        return this.f17428Ooooooo;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f17426Oooooo0;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f17419OoooOoo : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f17420Ooooo00;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f17429o000oOoO;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f17423OooooOO;
    }

    @Px
    public int getItemPaddingTop() {
        return this.f17422OooooO0;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f17418OoooOoO;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f17417OoooOo0;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f17415OoooOOO;
    }

    public int getLabelVisibilityMode() {
        return this.f17412OoooO00;
    }

    @Nullable
    public OooO0o getMenu() {
        return this.f17431o00Oo0;
    }

    public int getSelectedItemId() {
        return this.f17413OoooO0O;
    }

    public int getSelectedItemPosition() {
        return this.f17410OoooO;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0000OO0.OooO0O0.OooO00o(1, this.f17431o00Oo0.OooOOO0().size(), false, 1).f28216OooO00o);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f17414OoooOO0 = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f17433ooOO = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(OooO0Oo());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f17424OooooOo = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.f17425Oooooo = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.f17427OoooooO = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f17432o0OoOo0 = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable com.google.android.material.shape.OooO00o oooO00o) {
        this.f17428Ooooooo = oooO00o;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(OooO0Oo());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.f17426Oooooo0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f17419OoooOoo = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f17420Ooooo00 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.f17429o000oOoO = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(@Px int i) {
        this.f17423OooooOO = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@Px int i) {
        this.f17422OooooO0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f17418OoooOoO = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f17415OoooOOO;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f17417OoooOo0 = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f17415OoooOOO;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f17415OoooOOO = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f17411OoooO0;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f17412OoooO00 = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f17430o00O0O = navigationBarPresenter;
    }
}
